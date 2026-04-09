package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nc0 implements xo {

    /* renamed from: a, reason: collision with root package name */
    public final t60 f14241a;

    /* renamed from: b, reason: collision with root package name */
    public final xu f14242b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14243c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14244d;

    public nc0(t60 t60Var, wp0 wp0Var) {
        this.f14241a = t60Var;
        this.f14242b = wp0Var.f18092l;
        this.f14243c = wp0Var.j;
        this.f14244d = wp0Var.f18090k;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void E(xu xuVar) {
        int i4;
        String str;
        xu xuVar2 = this.f14242b;
        if (xuVar2 != null) {
            xuVar = xuVar2;
        }
        if (xuVar != null) {
            str = xuVar.f18498a;
            i4 = xuVar.f18499b;
        } else {
            i4 = 1;
            str = "";
        }
        pu puVar = new pu(str, i4);
        t60 t60Var = this.f14241a;
        t60Var.getClass();
        t60Var.p1(new pq0(puVar, this.f14243c, this.f14244d, false, 14));
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void a() {
        this.f14241a.p1(k60.f13048f);
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void h() {
        this.f14241a.p1(k60.g);
    }
}
