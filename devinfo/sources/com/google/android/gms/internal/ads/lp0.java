package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13566a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13567b;

    /* renamed from: c, reason: collision with root package name */
    public final k10 f13568c;

    /* renamed from: d, reason: collision with root package name */
    public final uk0 f13569d;

    /* renamed from: e, reason: collision with root package name */
    public final np0 f13570e;

    /* renamed from: f, reason: collision with root package name */
    public xk f13571f;
    public final cs0 g;

    /* renamed from: h, reason: collision with root package name */
    public final gq0 f13572h;

    /* renamed from: i, reason: collision with root package name */
    public pr0 f13573i;

    public lp0(Context context, Executor executor, k10 k10Var, uk0 uk0Var, np0 np0Var, gq0 gq0Var) {
        this.f13566a = context;
        this.f13567b = executor;
        this.f13568c = k10Var;
        this.f13569d = uk0Var;
        this.f13572h = gq0Var;
        this.f13570e = np0Var;
        this.g = k10Var.c();
    }

    public final boolean a(va.z2 z2Var, String str, al0 al0Var, bl0 bl0Var) throws JSONException {
        boolean z3;
        t10 t10Var;
        bs0 bs0Var;
        int i4 = 0;
        Executor executor = this.f13567b;
        if (str == null) {
            za.i.e("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new s30(24, this));
            return false;
        }
        if (b()) {
            return false;
        }
        pk pkVar = sk.Q2;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            va.r.a();
        }
        boolean zBooleanValue = ((Boolean) rkVar2.a(sk.f16155ha)).booleanValue();
        k10 k10Var = this.f13568c;
        if (zBooleanValue && z2Var.f36193f) {
            ((ff0) k10Var.f12970z.a()).b(true);
        }
        va.c3 c3Var = ((ip0) al0Var).f12409c;
        Pair pair = new Pair("api-call", Long.valueOf(z2Var.f36211z));
        ua.j.C.f35267k.getClass();
        Bundle bundleC = ls.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        gq0 gq0Var = this.f13572h;
        gq0Var.f11578c = str;
        gq0Var.f11577b = c3Var;
        gq0Var.f11576a = z2Var;
        gq0Var.f11593t = bundleC;
        hq0 hq0VarA = gq0Var.a();
        int iG = yr1.G(hq0VarA);
        Context context = this.f13566a;
        yr0 yr0VarD = d7.D(context, iG, 4, z2Var);
        boolean zBooleanValue2 = ((Boolean) rkVar2.a(sk.f16275p9)).booleanValue();
        uk0 uk0Var = this.f13569d;
        if (zBooleanValue2) {
            k10 k10Var2 = k10Var.f12924b;
            y50 y50Var = new y50();
            y50Var.f18642a = context;
            y50Var.f18643b = hq0VarA;
            y50 y50Var2 = new y50(y50Var);
            d80 d80Var = new d80();
            d80Var.d(uk0Var, executor);
            d80Var.b(uk0Var, executor);
            z3 = true;
            t10Var = new t10(k10Var2, new h80(18), new e80(d80Var), y50Var2, new ne0(7), new fk0(0, this.f13571f), null, null);
        } else {
            d80 d80Var2 = new d80();
            HashSet hashSet = (HashSet) d80Var2.f10369h;
            HashSet hashSet2 = (HashSet) d80Var2.f10367e;
            z3 = true;
            np0 np0Var = this.f13570e;
            if (np0Var != null) {
                hashSet2.add(new q80(np0Var, executor));
                hashSet.add(new q80(np0Var, executor));
                d80Var2.a(np0Var, executor);
            }
            k10 k10Var3 = k10Var.f12924b;
            y50 y50Var3 = new y50();
            y50Var3.f18642a = context;
            y50Var3.f18643b = hq0VarA;
            y50 y50Var4 = new y50(y50Var3);
            d80Var2.d(uk0Var, executor);
            hashSet2.add(new q80(uk0Var, executor));
            hashSet.add(new q80(uk0Var, executor));
            d80Var2.a(uk0Var, executor);
            ((HashSet) d80Var2.f10365c).add(new q80(uk0Var, executor));
            d80Var2.c(uk0Var, executor);
            d80Var2.b(uk0Var, executor);
            ((HashSet) d80Var2.f10373m).add(new q80(uk0Var, executor));
            ((HashSet) d80Var2.f10372l).add(new q80(uk0Var, executor));
            t10Var = new t10(k10Var3, new h80(18), new e80(d80Var2), y50Var4, new ne0(7), new fk0(0, this.f13571f), null, null);
        }
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            bs0Var = (bs0) t10Var.f16646i.a();
            bs0Var.i(4);
            bs0Var.c(z2Var.f36201p);
            bs0Var.d(z2Var.f36198m);
        } else {
            bs0Var = null;
        }
        y40 y40Var = (y40) t10Var.f16650n.a();
        pr0 pr0VarC = y40Var.c(y40Var.b());
        this.f13573i = pr0VarC;
        pr0VarC.a(new q81(i4, pr0VarC, new r7(this, bl0Var, bs0Var, yr0VarD, t10Var, 7, false)), executor);
        return z3;
    }

    public final boolean b() {
        pr0 pr0Var = this.f13573i;
        return (pr0Var == null || pr0Var.f15081c.isDone()) ? false : true;
    }
}
