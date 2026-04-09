package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ga0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11413a;

    /* renamed from: b, reason: collision with root package name */
    public va.a2 f11414b;

    /* renamed from: c, reason: collision with root package name */
    public tm f11415c;

    /* renamed from: d, reason: collision with root package name */
    public View f11416d;

    /* renamed from: e, reason: collision with root package name */
    public List f11417e;
    public va.j2 g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f11419h;

    /* renamed from: i, reason: collision with root package name */
    public qz f11420i;
    public qz j;

    /* renamed from: k, reason: collision with root package name */
    public qz f11421k;

    /* renamed from: l, reason: collision with root package name */
    public xh0 f11422l;

    /* renamed from: m, reason: collision with root package name */
    public vd.b f11423m;

    /* renamed from: n, reason: collision with root package name */
    public gx f11424n;

    /* renamed from: o, reason: collision with root package name */
    public View f11425o;

    /* renamed from: p, reason: collision with root package name */
    public View f11426p;

    /* renamed from: q, reason: collision with root package name */
    public vb.a f11427q;

    /* renamed from: r, reason: collision with root package name */
    public double f11428r;

    /* renamed from: s, reason: collision with root package name */
    public xm f11429s;

    /* renamed from: t, reason: collision with root package name */
    public xm f11430t;

    /* renamed from: u, reason: collision with root package name */
    public String f11431u;

    /* renamed from: x, reason: collision with root package name */
    public float f11434x;

    /* renamed from: y, reason: collision with root package name */
    public String f11435y;

    /* renamed from: v, reason: collision with root package name */
    public final x.n0 f11432v = new x.n0(0);

    /* renamed from: w, reason: collision with root package name */
    public final x.n0 f11433w = new x.n0(0);

    /* renamed from: f, reason: collision with root package name */
    public List f11418f = Collections.EMPTY_LIST;

    public static ga0 A(lr lrVar) {
        fa0 fa0Var;
        lr lrVar2;
        try {
            va.a2 a2VarG1 = lrVar.G1();
            if (a2VarG1 == null) {
                lrVar2 = lrVar;
                fa0Var = null;
            } else {
                lrVar2 = lrVar;
                fa0Var = new fa0(a2VarG1, lrVar2);
            }
            return B(fa0Var, lrVar2.H1(), (View) C(lrVar2.I1()), lrVar2.c(), lrVar2.d(), lrVar2.e(), lrVar2.J1(), lrVar2.C1(), (View) C(lrVar2.E1()), lrVar2.L1(), lrVar2.B1(), lrVar2.F1(), lrVar2.D1(), lrVar2.z1(), lrVar2.A1(), lrVar2.z());
        } catch (RemoteException e2) {
            za.i.i("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public static ga0 B(fa0 fa0Var, tm tmVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, vb.a aVar, String str4, String str5, double d10, xm xmVar, String str6, float f10) {
        ga0 ga0Var = new ga0();
        ga0Var.f11413a = 6;
        ga0Var.f11414b = fa0Var;
        ga0Var.f11415c = tmVar;
        ga0Var.f11416d = view;
        ga0Var.S("headline", str);
        ga0Var.f11417e = list;
        ga0Var.S("body", str2);
        ga0Var.f11419h = bundle;
        ga0Var.S("call_to_action", str3);
        ga0Var.f11425o = view2;
        ga0Var.f11427q = aVar;
        ga0Var.S("store", str4);
        ga0Var.S("price", str5);
        ga0Var.f11428r = d10;
        ga0Var.f11429s = xmVar;
        ga0Var.S("advertiser", str6);
        synchronized (ga0Var) {
            ga0Var.f11434x = f10;
        }
        return ga0Var;
    }

    public static Object C(vb.a aVar) {
        if (aVar == null) {
            return null;
        }
        return vb.b.U0(aVar);
    }

    public final synchronized void D(g00 g00Var) {
        this.f11414b = g00Var;
    }

    public final synchronized void E(tm tmVar) {
        this.f11415c = tmVar;
    }

    public final synchronized void F(x41 x41Var) {
        this.f11418f = x41Var;
    }

    public final synchronized void G(va.j2 j2Var) {
        this.g = j2Var;
    }

    public final synchronized void H(View view) {
        this.f11425o = view;
    }

    public final synchronized void I(View view) {
        this.f11426p = view;
    }

    public final synchronized void J(double d10) {
        this.f11428r = d10;
    }

    public final synchronized void K(xm xmVar) {
        this.f11429s = xmVar;
    }

    public final synchronized void L(xm xmVar) {
        this.f11430t = xmVar;
    }

    public final synchronized void M(String str) {
        this.f11431u = str;
    }

    public final synchronized void N(qz qzVar) {
        this.f11420i = qzVar;
    }

    public final synchronized void O(qz qzVar) {
        this.j = qzVar;
    }

    public final synchronized void P(qz qzVar) {
        this.f11421k = qzVar;
    }

    public final synchronized void Q(vd.b bVar) {
        this.f11423m = bVar;
    }

    public final synchronized void R(gx gxVar) {
        this.f11424n = gxVar;
    }

    public final synchronized void S(String str, String str2) {
        if (str2 == null) {
            this.f11433w.remove(str);
        } else {
            this.f11433w.put(str, str2);
        }
    }

    public final synchronized void T(String str, om omVar) {
        if (omVar == null) {
            this.f11432v.remove(str);
        } else {
            this.f11432v.put(str, omVar);
        }
    }

    public final synchronized void U(String str) {
        this.f11435y = str;
    }

    public final synchronized String V(String str) {
        return (String) this.f11433w.get(str);
    }

    public final synchronized int W() {
        return this.f11413a;
    }

    public final synchronized va.a2 X() {
        return this.f11414b;
    }

    public final synchronized tm Y() {
        return this.f11415c;
    }

    public final synchronized View a() {
        return this.f11416d;
    }

    public final synchronized String b() {
        return V("headline");
    }

    public final synchronized List c() {
        return this.f11417e;
    }

    public final xm d() {
        List list = this.f11417e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f11417e.get(0);
        if (obj instanceof IBinder) {
            return om.h4((IBinder) obj);
        }
        return null;
    }

    public final synchronized List e() {
        return this.f11418f;
    }

    public final synchronized va.j2 f() {
        return this.g;
    }

    public final synchronized String g() {
        return V("body");
    }

    public final synchronized Bundle h() {
        try {
            if (this.f11419h == null) {
                this.f11419h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11419h;
    }

    public final synchronized String i() {
        return V("call_to_action");
    }

    public final synchronized View j() {
        return this.f11425o;
    }

    public final synchronized vb.a k() {
        return this.f11427q;
    }

    public final synchronized String l() {
        return V("store");
    }

    public final synchronized String m() {
        return V("price");
    }

    public final synchronized double n() {
        return this.f11428r;
    }

    public final synchronized xm o() {
        return this.f11429s;
    }

    public final synchronized String p() {
        return V("advertiser");
    }

    public final synchronized String q() {
        return this.f11431u;
    }

    public final synchronized qz r() {
        return this.f11420i;
    }

    public final synchronized qz s() {
        return this.j;
    }

    public final synchronized qz t() {
        return this.f11421k;
    }

    public final synchronized vd.b u() {
        return this.f11423m;
    }

    public final synchronized gx v() {
        return this.f11424n;
    }

    public final synchronized xh0 w() {
        return this.f11422l;
    }

    public final synchronized x.n0 x() {
        return this.f11432v;
    }

    public final synchronized float y() {
        return this.f11434x;
    }

    public final synchronized x.n0 z() {
        return this.f11433w;
    }
}
