package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m10 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13716a;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f13717b;

    /* renamed from: c, reason: collision with root package name */
    public hp0 f13718c;

    /* renamed from: d, reason: collision with root package name */
    public vo0 f13719d;

    /* renamed from: e, reason: collision with root package name */
    public e80 f13720e;

    /* renamed from: f, reason: collision with root package name */
    public y50 f13721f;

    public /* synthetic */ m10(k10 k10Var, int i4) {
        this.f13716a = i4;
        this.f13717b = k10Var;
    }

    public n10 a() {
        al0.E(e80.class, this.f13720e);
        al0.E(y50.class, this.f13721f);
        return new n10(this.f13717b, new h80(18), this.f13720e, this.f13721f, new ne0(7), this.f13718c, this.f13719d);
    }

    public w10 b() {
        al0.E(e80.class, this.f13720e);
        al0.E(y50.class, this.f13721f);
        return new w10(this.f13717b, new h80(18), this.f13720e, this.f13721f, new ne0(7), this.f13718c, this.f13719d);
    }

    public final /* bridge */ Object c() {
        switch (this.f13716a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
