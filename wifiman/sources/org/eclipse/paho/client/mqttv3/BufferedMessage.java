package org.eclipse.paho.client.mqttv3;

import nj.u;

/* loaded from: classes3.dex */
public class BufferedMessage {
    private u message;
    private MqttToken token;

    public BufferedMessage(u uVar, MqttToken mqttToken) {
        this.message = uVar;
        this.token = mqttToken;
    }

    public u getMessage() {
        return this.message;
    }

    public MqttToken getToken() {
        return this.token;
    }
}
