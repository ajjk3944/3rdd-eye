package kj;

import org.eclipse.paho.client.mqttv3.MqttPersistable;

/* loaded from: classes3.dex */
public class o implements MqttPersistable {

    /* renamed from: a, reason: collision with root package name */
    private String f51631a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f51632b;

    /* renamed from: c, reason: collision with root package name */
    private int f51633c;

    /* renamed from: d, reason: collision with root package name */
    private int f51634d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f51635e;

    /* renamed from: f, reason: collision with root package name */
    private int f51636f;

    /* renamed from: g, reason: collision with root package name */
    private int f51637g;

    public o(String str, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        this.f51632b = null;
        this.f51633c = 0;
        this.f51634d = 0;
        this.f51635e = null;
        this.f51636f = 0;
        this.f51637g = 0;
        this.f51631a = str;
        this.f51632b = (byte[]) bArr.clone();
        this.f51633c = i10;
        this.f51634d = i11;
        this.f51635e = bArr2 != null ? (byte[]) bArr2.clone() : null;
        this.f51636f = i12;
        this.f51637g = i13;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public byte[] getHeaderBytes() {
        return this.f51632b;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getHeaderLength() {
        return this.f51634d;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getHeaderOffset() {
        return this.f51633c;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public byte[] getPayloadBytes() {
        return this.f51635e;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getPayloadLength() {
        if (this.f51635e == null) {
            return 0;
        }
        return this.f51637g;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getPayloadOffset() {
        return this.f51636f;
    }
}
