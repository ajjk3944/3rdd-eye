package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class E0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35847a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f35848b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ B f35849c;

    E0(B b10, String str, long j10) {
        this.f35847a = str;
        this.f35848b = j10;
        this.f35849c = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.z(this.f35849c, this.f35847a, this.f35848b);
    }
}
