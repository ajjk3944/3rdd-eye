package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w70 implements n70 {

    /* renamed from: a, reason: collision with root package name */
    public int f17925a;

    /* renamed from: b, reason: collision with root package name */
    public int f17926b;

    public final synchronized int a() {
        return this.f17925a;
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final synchronized void l(dq0 dq0Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.F1)).booleanValue()) {
            try {
                yp0 yp0Var = (yp0) dq0Var.f10544b.f9452c;
                this.f17925a = yp0Var.f18821c;
                this.f17926b = yp0Var.f18822d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
    }
}
