package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public interface IMqttActionListener {
    void onFailure(IMqttToken iMqttToken, Throwable th2);

    void onSuccess(IMqttToken iMqttToken);
}
