package com.amazonaws.mobileconnectors.iot;

/* loaded from: classes.dex */
public interface AWSIotMqttMessageDeliveryCallback {

    public enum MessageDeliveryStatus {
        Success,
        Fail
    }

    void a(MessageDeliveryStatus messageDeliveryStatus, Object obj);
}
