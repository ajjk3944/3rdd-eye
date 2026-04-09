package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.k f5087b;

    public /* synthetic */ p9(int i4, com.applovin.impl.sdk.k kVar) {
        this.f5086a = i4;
        this.f5087b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5086a) {
            case 0:
                k2.a(this.f5087b);
                break;
            default:
                n8.d(this.f5087b);
                break;
        }
    }
}
