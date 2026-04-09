package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f4903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4904d;

    public /* synthetic */ n9(Runnable runnable, Object obj, long j, int i4) {
        this.f4901a = i4;
        this.f4903c = runnable;
        this.f4904d = obj;
        this.f4902b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4901a) {
            case 0:
                ((i5) this.f4903c).a((Thread) this.f4904d, this.f4902b);
                break;
            default:
                ((ti.l) this.f4904d).a(this.f4902b, ((ec.r1) this.f4903c).f23043d);
                break;
        }
    }
}
