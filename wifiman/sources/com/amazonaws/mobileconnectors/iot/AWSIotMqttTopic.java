package com.amazonaws.mobileconnectors.iot;

/* loaded from: classes.dex */
class AWSIotMqttTopic {

    /* renamed from: a, reason: collision with root package name */
    private String f34136a;

    /* renamed from: b, reason: collision with root package name */
    private AWSIotMqttQos f34137b;

    /* renamed from: c, reason: collision with root package name */
    private AWSIotMqttNewMessageCallback f34138c;

    public AWSIotMqttTopic(String str, AWSIotMqttQos aWSIotMqttQos, AWSIotMqttNewMessageCallback aWSIotMqttNewMessageCallback) {
        this.f34136a = str;
        this.f34137b = aWSIotMqttQos;
        this.f34138c = aWSIotMqttNewMessageCallback;
    }

    public AWSIotMqttNewMessageCallback a() {
        return this.f34138c;
    }

    public AWSIotMqttQos b() {
        return this.f34137b;
    }

    public String c() {
        return this.f34136a;
    }
}
