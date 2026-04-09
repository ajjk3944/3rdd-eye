package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g71 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final m71 f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.b f11398b;

    public g71(m71 m71Var, vd.b bVar) {
        this.f11397a = m71Var;
        this.f11398b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11397a.f17113a != this) {
            return;
        }
        vd.b bVar = this.f11398b;
        if (u71.g.b0(this.f11397a, this, m71.i(bVar))) {
            m71.p(this.f11397a, false);
        }
    }
}
