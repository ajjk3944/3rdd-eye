package com.google.ads.mediation.applovin;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa.a f8983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8984b;

    public j(k kVar, pa.a aVar) {
        this.f8984b = kVar;
        this.f8983a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8984b.adLoadCallback.i(this.f8983a);
    }
}
