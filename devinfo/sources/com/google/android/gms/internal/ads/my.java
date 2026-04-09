package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class my extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final qz f14066c;

    /* renamed from: d, reason: collision with root package name */
    public final uy f14067d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14068e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f14069f;

    public my(qz qzVar, uy uyVar, String str, String[] strArr) {
        super(10);
        this.f14066c = qzVar;
        this.f14067d = uyVar;
        this.f14068e = str;
        this.f14069f = strArr;
        ua.j.C.A.f14477a.add(this);
    }

    @Override // a8.a
    public final vd.b A() {
        return (((Boolean) va.s.f36163e.f36166c.a(sk.f16333t2)).booleanValue() && (this.f14067d instanceof yy)) ? fx.f11279f.e(new qe(2, this)) : super.A();
    }

    @Override // a8.a
    public final void z() {
        try {
            this.f14067d.c(this.f14068e, this.f14069f);
        } finally {
            ya.f0.f37440l.post(new s(20, this));
        }
    }
}
