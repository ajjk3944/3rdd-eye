package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ va.c3 f13443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp0 f13444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yp0 f13445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ua.a f13446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uv f13447f;
    public final /* synthetic */ String g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13449i;

    public /* synthetic */ lb0(Object obj, va.c3 c3Var, wp0 wp0Var, yp0 yp0Var, ua.a aVar, uv uvVar, String str, String str2, int i4) {
        this.f13442a = i4;
        this.f13449i = obj;
        this.f13443b = c3Var;
        this.f13444c = wp0Var;
        this.f13445d = yp0Var;
        this.f13446e = aVar;
        this.f13447f = uvVar;
        this.g = str;
        this.f13448h = str2;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        be0 be0Var;
        switch (this.f13442a) {
            case 0:
                nb0 nb0Var = (nb0) this.f13449i;
                va.c3 c3Var = this.f13443b;
                wp0 wp0Var = this.f13444c;
                yp0 yp0Var = this.f13445d;
                ua.a aVar = this.f13446e;
                uv uvVar = this.f13447f;
                String str = this.g;
                String str2 = this.f13448h;
                qz qzVarA = nb0Var.j.a(c3Var, wp0Var, yp0Var);
                gi giVar = new gi(qzVarA);
                jc0 jc0Var = nb0Var.f14229l.f13458a;
                i00 i00VarX = qzVarA.X();
                pk pkVar = sk.Ve;
                va.s sVar = va.s.f36163e;
                i00VarX.j(jc0Var, jc0Var, jc0Var, jc0Var, jc0Var, false, null, !((Boolean) sVar.f36166c.a(pkVar)).booleanValue() ? new ua.a(nb0Var.f14220a, null) : aVar, null, true != ((Boolean) sVar.f36166c.a(pkVar)).booleanValue() ? null : uvVar, nb0Var.f14232o, nb0Var.f14231n, nb0Var.f14230m, null, jc0Var, null, null, null, null, null, null, null);
                qzVarA.Z("/getNativeAdViewSignals", no.f14373n);
                qzVarA.Z("/getNativeClickMeta", no.f14374o);
                if (((Boolean) sVar.f36166c.a(sk.G8)).booleanValue()) {
                    if (((Boolean) sVar.f36166c.a(sk.I8)).booleanValue() && (be0Var = nb0Var.f14236s) != null) {
                        qzVarA.Z("/onDeviceStorageEvent", new co(3, be0Var));
                    }
                }
                i00 i00VarX2 = qzVarA.X();
                synchronized (i00VarX2.f12084d) {
                    i00VarX2.f12097s = true;
                }
                qzVarA.X().g = new ix0(23, giVar);
                qzVarA.p0(str, str2);
                return giVar;
            default:
                ub0 ub0Var = (ub0) this.f13449i;
                va.c3 c3Var2 = this.f13443b;
                wp0 wp0Var2 = this.f13444c;
                yp0 yp0Var2 = this.f13445d;
                ua.a aVar2 = this.f13446e;
                uv uvVar2 = this.f13447f;
                String str3 = this.g;
                String str4 = this.f13448h;
                qz qzVarA2 = ub0Var.f17141c.a(c3Var2, wp0Var2, yp0Var2);
                gi giVar2 = new gi(qzVarA2);
                if (ub0Var.f17139a.f11942b != null) {
                    ub0Var.a(qzVarA2, aVar2, uvVar2);
                    qzVarA2.D0(new h0(5, 0, 0));
                } else {
                    jc0 jc0Var2 = ub0Var.f17142d.f13458a;
                    i00 i00VarX3 = qzVarA2.X();
                    pk pkVar2 = sk.Ve;
                    va.s sVar2 = va.s.f36163e;
                    i00VarX3.j(jc0Var2, jc0Var2, jc0Var2, jc0Var2, jc0Var2, false, null, !((Boolean) sVar2.f36166c.a(pkVar2)).booleanValue() ? new ua.a(ub0Var.f17143e, null) : aVar2, null, true != ((Boolean) sVar2.f36166c.a(pkVar2)).booleanValue() ? null : uvVar2, ub0Var.f17145h, ub0Var.g, ub0Var.f17144f, null, jc0Var2, null, null, null, null, ub0Var.j, null, null);
                    ub0.b(qzVarA2);
                }
                qzVarA2.X().g = new tb0(ub0Var, qzVarA2, giVar2, 0);
                qzVarA2.p0(str3, str4);
                return giVar2;
        }
    }
}
