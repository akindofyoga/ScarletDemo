package com.example.websocketstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.protobuf.InvalidProtocolBufferException;
import com.tinder.scarlet.Scarlet;
import com.tinder.scarlet.Stream;
import com.tinder.scarlet.websocket.okhttp.OkHttpClientUtils;
import com.tinder.scarlet.messageadapter.protobuf.ProtobufMessageAdapter;
// import com.tinder.scarlet.lifecycle.android.AndroidLifecycle;

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
                // .lifecycle(AndroidLifecycle)
                .build().create(Gabriel.class);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Log.e(TAG, "Exception", e);
        }


        webSocketInterface.Receive().start(new Stream.Observer<Update>() {
            @Override
            public void onNext(Update receivedUpdate) {
                Log.d(TAG, "onNext");
                System.out.println("From Client" + receivedUpdate);

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

        webSocketInterface.Send("Roger message to server");

    }
}
