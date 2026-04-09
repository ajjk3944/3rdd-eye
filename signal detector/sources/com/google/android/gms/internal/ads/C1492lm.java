package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.Collections;
import java.util.List;
import u.C2940i;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492lm {

    /* renamed from: a, reason: collision with root package name */
    public int f15435a;

    /* renamed from: b, reason: collision with root package name */
    public q2.B0 f15436b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0550Ia f15437c;

    /* renamed from: d, reason: collision with root package name */
    public View f15438d;

    /* renamed from: e, reason: collision with root package name */
    public List f15439e;

    /* renamed from: g, reason: collision with root package name */
    public q2.K0 f15441g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f15442h;
    public InterfaceC0828Yg i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0828Yg f15443j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0828Yg f15444k;

    /* renamed from: l, reason: collision with root package name */
    public C0837Yp f15445l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceFutureC2326a f15446m;

    /* renamed from: n, reason: collision with root package name */
    public C0657Of f15447n;

    /* renamed from: o, reason: collision with root package name */
    public View f15448o;

    /* renamed from: p, reason: collision with root package name */
    public View f15449p;

    /* renamed from: q, reason: collision with root package name */
    public S2.a f15450q;

    /* renamed from: r, reason: collision with root package name */
    public double f15451r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0635Na f15452s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0635Na f15453t;

    /* renamed from: u, reason: collision with root package name */
    public String f15454u;

    /* renamed from: x, reason: collision with root package name */
    public float f15457x;

    /* renamed from: y, reason: collision with root package name */
    public String f15458y;

    /* renamed from: v, reason: collision with root package name */
    public final C2940i f15455v = new C2940i(0);

    /* renamed from: w, reason: collision with root package name */
    public final C2940i f15456w = new C2940i(0);

    /* renamed from: f, reason: collision with root package name */
    public List f15440f = Collections.EMPTY_LIST;

    public static C1492lm A(InterfaceC0790Wc interfaceC0790Wc) {
        BinderC1438km binderC1438km;
        InterfaceC0790Wc interfaceC0790Wc2;
        try {
            q2.B0 b0O = interfaceC0790Wc.o();
            if (b0O == null) {
                interfaceC0790Wc2 = interfaceC0790Wc;
                binderC1438km = null;
            } else {
                interfaceC0790Wc2 = interfaceC0790Wc;
                binderC1438km = new BinderC1438km(b0O, interfaceC0790Wc2);
            }
            return B(binderC1438km, interfaceC0790Wc2.p(), (View) C(interfaceC0790Wc2.q()), interfaceC0790Wc2.b(), interfaceC0790Wc2.d(), interfaceC0790Wc2.e(), interfaceC0790Wc2.r(), interfaceC0790Wc2.j(), (View) C(interfaceC0790Wc2.l()), interfaceC0790Wc2.w(), interfaceC0790Wc2.i(), interfaceC0790Wc2.n(), interfaceC0790Wc2.k(), interfaceC0790Wc2.g(), interfaceC0790Wc2.h(), interfaceC0790Wc2.S());
        } catch (RemoteException e6) {
            u2.k.i("Failed to get native ad assets from unified ad mapper", e6);
            return null;
        }
    }

    public static C1492lm B(BinderC1438km binderC1438km, InterfaceC0550Ia interfaceC0550Ia, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, S2.a aVar, String str4, String str5, double d6, InterfaceC0635Na interfaceC0635Na, String str6, float f2) {
        C1492lm c1492lm = new C1492lm();
        c1492lm.f15435a = 6;
        c1492lm.f15436b = binderC1438km;
        c1492lm.f15437c = interfaceC0550Ia;
        c1492lm.f15438d = view;
        c1492lm.S("headline", str);
        c1492lm.f15439e = list;
        c1492lm.S("body", str2);
        c1492lm.f15442h = bundle;
        c1492lm.S("call_to_action", str3);
        c1492lm.f15448o = view2;
        c1492lm.f15450q = aVar;
        c1492lm.S("store", str4);
        c1492lm.S("price", str5);
        c1492lm.f15451r = d6;
        c1492lm.f15452s = interfaceC0635Na;
        c1492lm.S("advertiser", str6);
        synchronized (c1492lm) {
            c1492lm.f15457x = f2;
        }
        return c1492lm;
    }

    public static Object C(S2.a aVar) {
        if (aVar == null) {
            return null;
        }
        return S2.b.n1(aVar);
    }

    public final synchronized void D(BinderC1541mh binderC1541mh) {
        this.f15436b = binderC1541mh;
    }

    public final synchronized void E(InterfaceC0550Ia interfaceC0550Ia) {
        this.f15437c = interfaceC0550Ia;
    }

    public final synchronized void F(LB lb) {
        this.f15440f = lb;
    }

    public final synchronized void G(q2.K0 k02) {
        this.f15441g = k02;
    }

    public final synchronized void H(View view) {
        this.f15448o = view;
    }

    public final synchronized void I(View view) {
        this.f15449p = view;
    }

    public final synchronized void J(double d6) {
        this.f15451r = d6;
    }

    public final synchronized void K(InterfaceC0635Na interfaceC0635Na) {
        this.f15452s = interfaceC0635Na;
    }

    public final synchronized void L(InterfaceC0635Na interfaceC0635Na) {
        this.f15453t = interfaceC0635Na;
    }

    public final synchronized void M(String str) {
        this.f15454u = str;
    }

    public final synchronized void N(InterfaceC0828Yg interfaceC0828Yg) {
        this.i = interfaceC0828Yg;
    }

    public final synchronized void O(InterfaceC0828Yg interfaceC0828Yg) {
        this.f15443j = interfaceC0828Yg;
    }

    public final synchronized void P(InterfaceC0828Yg interfaceC0828Yg) {
        this.f15444k = interfaceC0828Yg;
    }

    public final synchronized void Q(InterfaceFutureC2326a interfaceFutureC2326a) {
        this.f15446m = interfaceFutureC2326a;
    }

    public final synchronized void R(C0657Of c0657Of) {
        this.f15447n = c0657Of;
    }

    public final synchronized void S(String str, String str2) {
        if (str2 == null) {
            this.f15456w.remove(str);
        } else {
            this.f15456w.put(str, str2);
        }
    }

    public final synchronized void T(String str, BinderC0465Da binderC0465Da) {
        if (binderC0465Da == null) {
            this.f15455v.remove(str);
        } else {
            this.f15455v.put(str, binderC0465Da);
        }
    }

    public final synchronized void U(String str) {
        this.f15458y = str;
    }

    public final synchronized String V(String str) {
        return (String) this.f15456w.get(str);
    }

    public final synchronized int W() {
        return this.f15435a;
    }

    public final synchronized q2.B0 X() {
        return this.f15436b;
    }

    public final synchronized InterfaceC0550Ia Y() {
        return this.f15437c;
    }

    public final synchronized View a() {
        return this.f15438d;
    }

    public final synchronized String b() {
        return V("headline");
    }

    public final synchronized List c() {
        return this.f15439e;
    }

    public final InterfaceC0635Na d() {
        List list = this.f15439e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f15439e.get(0);
        if (obj instanceof IBinder) {
            return BinderC0465Da.K3((IBinder) obj);
        }
        return null;
    }

    public final synchronized List e() {
        return this.f15440f;
    }

    public final synchronized q2.K0 f() {
        return this.f15441g;
    }

    public final synchronized String g() {
        return V("body");
    }

    public final synchronized Bundle h() {
        try {
            if (this.f15442h == null) {
                this.f15442h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15442h;
    }

    public final synchronized String i() {
        return V("call_to_action");
    }

    public final synchronized View j() {
        return this.f15448o;
    }

    public final synchronized S2.a k() {
        return this.f15450q;
    }

    public final synchronized String l() {
        return V("store");
    }

    public final synchronized String m() {
        return V("price");
    }

    public final synchronized double n() {
        return this.f15451r;
    }

    public final synchronized InterfaceC0635Na o() {
        return this.f15452s;
    }

    public final synchronized String p() {
        return V("advertiser");
    }

    public final synchronized String q() {
        return this.f15454u;
    }

    public final synchronized InterfaceC0828Yg r() {
        return this.i;
    }

    public final synchronized InterfaceC0828Yg s() {
        return this.f15443j;
    }

    public final synchronized InterfaceC0828Yg t() {
        return this.f15444k;
    }

    public final synchronized InterfaceFutureC2326a u() {
        return this.f15446m;
    }

    public final synchronized C0657Of v() {
        return this.f15447n;
    }

    public final synchronized C0837Yp w() {
        return this.f15445l;
    }

    public final synchronized C2940i x() {
        return this.f15455v;
    }

    public final synchronized float y() {
        return this.f15457x;
    }

    public final synchronized C2940i z() {
        return this.f15456w;
    }
}
