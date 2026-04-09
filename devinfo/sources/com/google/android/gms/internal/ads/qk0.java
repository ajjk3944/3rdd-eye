package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qk0 extends va.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final pq0 f15354a;

    public qk0(Context context, k10 k10Var, gq0 gq0Var, ka0 ka0Var, va.y yVar) {
        pq0 pq0Var = new pq0(ka0Var, (qd0) k10Var.j.a());
        ((uk0) pq0Var.f15074c).f17227a.set(yVar);
        ai aiVar = new ai();
        aiVar.f9331b = k10Var;
        aiVar.f9334e = context;
        aiVar.f9332c = pq0Var;
        aiVar.f9330a = gq0Var;
        aiVar.f9333d = k10Var.c();
        gq0Var.f11591r = (uk0) pq0Var.f15074c;
        this.f15354a = new pq0(25, aiVar, gq0Var.f11578c);
    }

    @Override // va.e0
    public final void P(va.z2 z2Var) {
        this.f15354a.u(z2Var, 1);
    }

    @Override // va.e0
    public final synchronized String d() {
        return this.f15354a.w();
    }

    @Override // va.e0
    public final synchronized boolean e() {
        return this.f15354a.r();
    }

    @Override // va.e0
    public final synchronized void l3(va.z2 z2Var, int i4) {
        this.f15354a.u(z2Var, i4);
    }

    @Override // va.e0
    public final synchronized String z1() {
        return this.f15354a.z();
    }
}
