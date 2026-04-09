package org.eclipse.paho.client.mqttv3;

import kj.x;
import nj.u;

/* loaded from: classes3.dex */
public class MqttToken implements IMqttToken {
    public x internalTok;

    public MqttToken() {
        this.internalTok = null;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public IMqttActionListener getActionCallback() {
        return this.internalTok.b();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public IMqttAsyncClient getClient() {
        return this.internalTok.c();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public MqttException getException() {
        return this.internalTok.d();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public int[] getGrantedQos() {
        return this.internalTok.e();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public int getMessageId() {
        return this.internalTok.h();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public u getResponse() {
        return this.internalTok.i();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public boolean getSessionPresent() {
        return this.internalTok.j();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public String[] getTopics() {
        return this.internalTok.k();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public Object getUserContext() {
        return this.internalTok.l();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public boolean isComplete() {
        return this.internalTok.n();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void setActionCallback(IMqttActionListener iMqttActionListener) {
        this.internalTok.t(iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void setUserContext(Object obj) {
        this.internalTok.B(obj);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void waitForCompletion() throws MqttException {
        this.internalTok.C(-1L);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void waitForCompletion(long j10) throws MqttException {
        this.internalTok.C(j10);
    }

    public MqttToken(String str) {
        this.internalTok = null;
        this.internalTok = new x(str);
    }
}
