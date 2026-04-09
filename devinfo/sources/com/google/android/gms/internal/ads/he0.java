package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class he0 implements de0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11845a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f11846b;

    public he0(long j, Context context, mx0 mx0Var, k10 k10Var, String str) {
        this.f11845a = j;
        k10 k10Var2 = k10Var.f12924b;
        va.c3 c3Var = new va.c3();
        str.getClass();
        xk0 xk0Var = (xk0) new u10(k10Var2, context, str, c3Var).f17031a.a();
        this.f11846b = xk0Var;
        xk0Var.x3(new ge0(this, mx0Var));
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void a() {
        this.f11846b.j3(new vb.b(null));
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void b(va.z2 z2Var) {
        this.f11846b.P(z2Var);
    }

    @Override // com.google.android.gms.internal.ads.de0
    public final void zzc() {
        this.f11846b.h();
    }
}
