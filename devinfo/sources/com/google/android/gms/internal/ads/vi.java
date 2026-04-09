package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum vi implements sn1 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f17629a;

    vi(int i4) {
        this.f17629a = i4;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        return this.f17629a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17629a);
    }
}
