package com.amazonaws.mobileconnectors.iot;

/* loaded from: classes.dex */
public interface AWSIotMqttClientStatusCallback {

    public enum AWSIotMqttClientStatus {
        Connecting,
        Connected,
        ConnectionLost,
        Reconnecting
    }

    void a(AWSIotMqttClientStatus aWSIotMqttClientStatus, Throwable th2);
}
