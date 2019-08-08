package com.example.websocketstest;

import com.tinder.scarlet.Stream;
import com.tinder.scarlet.ws.Receive;
import com.tinder.scarlet.ws.Send;

public interface Gabriel {
    @Send
    void Send(String message);

    @Receive
    Stream<UpdateProtos.Update> Receive();
}
