package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15386a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15387b;

    /* renamed from: c, reason: collision with root package name */
    public final k10 f15388c;

    /* renamed from: d, reason: collision with root package name */
    public final np0 f15389d;

    /* renamed from: e, reason: collision with root package name */
    public final fp0 f15390e;

    /* renamed from: f, reason: collision with root package name */
    public final eq0 f15391f;
    public final cs0 g;

    /* renamed from: h, reason: collision with root package name */
    public final gq0 f15392h;

    /* renamed from: i, reason: collision with root package name */
    public vd.b f15393i;

    public qp0(Context context, Executor executor, k10 k10Var, fp0 fp0Var, np0 np0Var, gq0 gq0Var, eq0 eq0Var) {
        this.f15386a = context;
        this.f15387b = executor;
        this.f15388c = k10Var;
        this.f15390e = fp0Var;
        this.f15389d = np0Var;
        this.f15392h = gq0Var;
        this.f15391f = eq0Var;
        this.g = k10Var.c();
    }

    public final boolean a(va.z2 z2Var, String str, al0 al0Var, bl0 bl0Var) throws JSONException {
        bs0 bs0Var;
        int i4 = 0;
        Executor executor = this.f15387b;
        if (str == null) {
            za.i.e("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new s30(26, this));
            return false;
        }
        vd.b bVar = this.f15393i;
        if (bVar != null && !bVar.isDone()) {
            return false;
        }
        pk pkVar = sk.Q2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            va.r.a();
        }
        boolean zBooleanValue = ((Boolean) ol.f14724c.u()).booleanValue();
        fp0 fp0Var = this.f15390e;
        if (!zBooleanValue || fp0Var.f() == null) {
            bs0Var = null;
        } else {
            bs0Var = (bs0) ((w10) fp0Var.f()).g.a();
            bs0Var.i(5);
            bs0Var.c(z2Var.f36201p);
            bs0Var.d(z2Var.f36198m);
        }
        boolean z3 = z2Var.f36193f;
        Context context = this.f15386a;
        al0.x(context, z3);
        if (((Boolean) sVar.f36166c.a(sk.f16155ha)).booleanValue() && z3) {
            ((ff0) this.f15388c.f12970z.a()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(z2Var.f36211z));
        ua.j.C.f35267k.getClass();
        Bundle bundleC = ls.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        gq0 gq0Var = this.f15392h;
        gq0Var.f11578c = str;
        gq0Var.f11577b = new va.c3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        gq0Var.f11576a = z2Var;
        gq0Var.f11593t = bundleC;
        hq0 hq0VarA = gq0Var.a();
        yr0 yr0VarD = d7.D(context, yr1.G(hq0VarA), 5, z2Var);
        pp0 pp0Var = new pp0();
        pp0Var.f15066a = hq0VarA;
        vd.b bVarK = fp0Var.k(new ce1(18, pp0Var, (Object) null), new kh0(6, this));
        this.f15393i = bVarK;
        bVarK.a(new q81(i4, bVarK, new r7(this, bl0Var, bs0Var, yr0VarD, pp0Var, 8, false)), executor);
        return true;
    }

    public final m10 b(dp0 dp0Var) {
        m10 m10Var = new m10(this.f15388c.f12924b, 1);
        y50 y50Var = new y50();
        y50Var.f18642a = this.f15386a;
        y50Var.f18643b = ((pp0) dp0Var).f15066a;
        y50Var.f18645d = this.f15391f;
        m10Var.f13721f = new y50(y50Var);
        m10Var.f13720e = new e80(new d80());
        return m10Var;
    }
}
