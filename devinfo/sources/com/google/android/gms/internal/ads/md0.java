package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class md0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13871a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f13872b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f13873c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f13874d;

    public /* synthetic */ md0(int i4, es1 es1Var, es1 es1Var2, Object obj) {
        this.f13871a = i4;
        this.f13872b = es1Var;
        this.f13873c = es1Var2;
        this.f13874d = (js1) obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13871a) {
            case 0:
                return new ld0((od0) this.f13872b.a(), (ud0) this.f13874d.a(), ((Integer) this.f13873c.a()).intValue());
            case 1:
                return new x01((File) this.f13872b.a(), (fv0) this.f13873c.a(), (g21) this.f13874d.a());
            default:
                cs1 cs1VarC = es1.c(this.f13872b);
                cs1 cs1VarC2 = es1.c(this.f13873c);
                if (true == ((sx0) this.f13874d.a()).W()) {
                    cs1VarC = cs1VarC2;
                }
                j11 j11Var = (j11) cs1VarC.a();
                al0.z(j11Var);
                return j11Var;
        }
    }

    public md0(es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f13871a = 0;
        this.f13872b = es1Var;
        this.f13874d = es1Var2;
        this.f13873c = es1Var3;
    }
}
