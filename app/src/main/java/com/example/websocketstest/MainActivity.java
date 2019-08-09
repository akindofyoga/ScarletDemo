package com.example.websocketstest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.protobuf.InvalidProtocolBufferException;
import com.tinder.scarlet.Scarlet;
import com.tinder.scarlet.Stream;
import com.tinder.scarlet.WebSocket;
import com.tinder.scarlet.websocket.okhttp.OkHttpClientUtils;
import com.tinder.scarlet.messageadapter.protobuf.ProtobufMessageAdapter;
import com.tinder.scarlet.lifecycle.android.AndroidLifecycle;

import com.example.websocketstest.UpdateProtos.Update;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    Gabriel webSocketInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Update.Builder updateBuilder = Update.newBuilder();
        updateBuilder.setFirstName("Roger");
        updateBuilder.setLastName("Iyengar");

        Update update = updateBuilder.build();
        byte[] serialized = update.toByteArray();

        try {
            Update parsed = Update.parseFrom(serialized);
            System.out.println(parsed);
        } catch (InvalidProtocolBufferException e) {
            Log.e(TAG, "Exception", e);
        }
        OkHttpClient okClient = new OkHttpClient();

        webSocketInterface = new Scarlet.Builder()
                .webSocketFactory(OkHttpClientUtils.newWebSocketFactory(okClient, "ws://gs17934.sp.cs.cmu.edu:8765"))
                .addMessageAdapterFactory(new ProtobufMessageAdapter.Factory())
                .lifecycle(AndroidLifecycle.ofApplicationForeground(getApplication()))
                .build().create(Gabriel.class);


        webSocketInterface.Receive().start(new Stream.Observer<Update>() {
            @Override
            public void onNext(Update receivedUpdate) {
                Log.d(TAG, "onNext");
                System.out.println("From Client " + receivedUpdate);

            }

            @Override
            public void onError(Throwable throwable) {
                Log.d(TAG, "onError");

            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete");

            }
        });

        webSocketInterface.observeWebSocketEvent().start(new Stream.Observer<WebSocket.Event>() {
            @Override
            public void onNext(WebSocket.Event receivedUpdate) {
                if (receivedUpdate instanceof WebSocket.Event.OnConnectionOpened) {
                    System.out.println("Connection opened");
                    webSocketInterface.Send("Roger message to server");
                }
                Log.d(TAG, "event onNext");
                System.out.println("Event " + receivedUpdate);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.d(TAG, "event onError");

            }

            @Override
            public void onComplete() {
                Log.d(TAG, "event onComplete");

            }
        });

        // webSocketInterface.Send("Roger message to server");

    }
}
