package com.amazonaws.mobileconnectors.iot;

/* loaded from: classes.dex */
class AWSIotMqttQueueMessage {

    /* renamed from: a, reason: collision with root package name */
    private String f34132a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f34133b;

    /* renamed from: c, reason: collision with root package name */
    private AWSIotMqttQos f34134c;

    /* renamed from: d, reason: collision with root package name */
    private PublishMessageUserData f34135d;

    public AWSIotMqttQueueMessage(String str, byte[] bArr, AWSIotMqttQos aWSIotMqttQos, PublishMessageUserData publishMessageUserData) {
        this.f34132a = str;
        this.f34133b = bArr;
        this.f34134c = aWSIotMqttQos;
        this.f34135d = publishMessageUserData;
    }

    byte[] a() {
        return this.f34133b;
    }

    AWSIotMqttQos b() {
        return this.f34134c;
    }

    String c() {
        return this.f34132a;
    }

    PublishMessageUserData d() {
        return this.f34135d;
    }
}
