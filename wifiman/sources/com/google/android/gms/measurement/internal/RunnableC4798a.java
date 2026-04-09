package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4798a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36324a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f36325b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ B f36326c;

    RunnableC4798a(B b10, String str, long j10) {
        this.f36324a = str;
        this.f36325b = j10;
        this.f36326c = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.v(this.f36326c, this.f36324a, this.f36325b);
    }
}
