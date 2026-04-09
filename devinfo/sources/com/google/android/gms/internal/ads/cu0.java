package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cu0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du0 f10221b;

    public cu0(du0 du0Var, float f10) {
        this.f10220a = f10;
        this.f10221b = du0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu0 nu0Var = ((eu0) this.f10221b.f10552b).g;
        float f10 = this.f10220a;
        nu0Var.f14439a = f10;
        if (nu0Var.f14441c == null) {
            nu0Var.f14441c = hu0.f11974c;
        }
        Iterator it = DesugarCollections.unmodifiableCollection(nu0Var.f14441c.f11976b).iterator();
        while (it.hasNext()) {
            pu0 pu0Var = ((vt0) it.next()).f17702d;
            w5.g.C(pu0Var.c(), "setDeviceVolume", Float.valueOf(f10), pu0Var.f15108a);
        }
    }
}
