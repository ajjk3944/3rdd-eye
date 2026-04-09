package org.eclipse.paho.client.mqttv3;

/* loaded from: classes3.dex */
public interface MqttCallback {
    void connectionLost(Throwable th2);

    void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken);

    void messageArrived(String str, MqttMessage mqttMessage) throws Exception;
}
