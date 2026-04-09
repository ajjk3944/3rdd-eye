package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum K8 implements InterfaceC1206gL {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f9464a;

    K8(int i) {
        this.f9464a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        return this.f9464a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9464a);
    }
}
