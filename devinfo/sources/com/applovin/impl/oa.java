package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class oa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f5024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f5025c;

    public /* synthetic */ oa(com.applovin.impl.adview.g gVar, Runnable runnable, int i4) {
        this.f5023a = i4;
        this.f5024b = gVar;
        this.f5025c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5023a) {
            case 0:
                w1.b(this.f5024b, this.f5025c);
                break;
            case 1:
                w1.a(this.f5024b, this.f5025c);
                break;
            default:
                w1.c(this.f5024b, this.f5025c);
                break;
        }
    }
}
