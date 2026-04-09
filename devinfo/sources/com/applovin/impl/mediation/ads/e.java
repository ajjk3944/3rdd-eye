package com.applovin.impl.mediation.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f4643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4644c;

    public /* synthetic */ e(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i4) {
        this.f4642a = i4;
        this.f4643b = maxFullscreenAdImpl;
        this.f4644c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4642a) {
            case 0:
                this.f4643b.c(this.f4644c);
                break;
            case 1:
                this.f4643b.a(this.f4644c);
                break;
            default:
                this.f4643b.b(this.f4644c);
                break;
        }
    }
}
