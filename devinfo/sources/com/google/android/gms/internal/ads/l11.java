package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m11 f13329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy0 f13330c;

    public /* synthetic */ l11(m11 m11Var, zy0 zy0Var, int i4) {
        this.f13328a = i4;
        this.f13329b = m11Var;
        this.f13330c = zy0Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        switch (this.f13328a) {
            case 0:
                m11 m11Var = this.f13329b;
                h91 h91VarA = m11Var.f13723b.a(this.f13330c);
                m11Var.f13729i.e(15303, h91VarA);
                return h91VarA;
            default:
                m11 m11Var2 = this.f13329b;
                h91 h91VarA2 = m11Var2.f13723b.a(this.f13330c);
                m11Var2.f13729i.e(15303, h91VarA2);
                return h91VarA2;
        }
    }
}
