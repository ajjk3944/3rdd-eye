package com.applovin.impl.mediation.ads;

import com.applovin.impl.b3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f4640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f4641c;

    public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, b3 b3Var, int i4) {
        this.f4639a = i4;
        this.f4640b = maxAdViewImpl;
        this.f4641c = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4639a) {
            case 0:
                this.f4640b.a(this.f4641c);
                break;
            default:
                this.f4640b.b(this.f4641c);
                break;
        }
    }
}
