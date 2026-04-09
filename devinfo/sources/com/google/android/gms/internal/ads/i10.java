package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i10 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final a10 f12112a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f12113b;

    public i10(a10 a10Var, es1 es1Var) {
        this.f12112a = a10Var;
        this.f12113b = es1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b7 a() {
        Context contextB = this.f12112a.b();
        cs0 cs0Var = (cs0) this.f12113b.a();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        ua.j jVar = ua.j.C;
        oq oqVarB = jVar.f35274r.b(contextB, za.a.a(), cs0Var);
        hl hlVar = jz.f12889l;
        oqVarB.getClass();
        return new b7(contextB, jVar.f35274r.b(contextB, za.a.a(), cs0Var).a("google.afma.sdkConstants.getSdkConstants", hlVar, hlVar), za.a.a(), exVar);
    }
}
