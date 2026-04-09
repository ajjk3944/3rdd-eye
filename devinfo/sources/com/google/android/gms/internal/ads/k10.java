package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k10 {
    public static k10 P0;
    public final es1 A;
    public final es1 A0;
    public final es1 B;
    public final e20 B0;
    public final x00 C;
    public final es1 C0;
    public final es1 D;
    public final es1 D0;
    public final es1 E;
    public final es1 E0;
    public final gs1 F;
    public final ah F0;
    public final es1 G;
    public final es1 G0;
    public final y10 H;
    public final r30 H0;
    public final es1 I;
    public final es1 I0;
    public final es1 J;
    public final es1 J0;
    public final es1 K;
    public final es1 K0;
    public final es1 L;
    public final es1 L0;
    public final es1 M;
    public final es1 M0;
    public final es1 N;
    public final es1 N0;
    public final es1 O;
    public final es1 O0;
    public final es1 P;
    public final es1 Q;
    public final es1 R;
    public final es1 S;
    public final e10 T;
    public final i10 U;
    public final es1 V;
    public final h10 W;
    public final es1 X;
    public final es1 Y;
    public final es1 Z;

    /* renamed from: a, reason: collision with root package name */
    public final w00 f12922a;

    /* renamed from: a0, reason: collision with root package name */
    public final es1 f12923a0;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f12924b = this;

    /* renamed from: b0, reason: collision with root package name */
    public final es1 f12925b0;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f12926c;

    /* renamed from: c0, reason: collision with root package name */
    public final fn0 f12927c0;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f12928d;

    /* renamed from: d0, reason: collision with root package name */
    public final es1 f12929d0;

    /* renamed from: e, reason: collision with root package name */
    public final es1 f12930e;

    /* renamed from: e0, reason: collision with root package name */
    public final es1 f12931e0;

    /* renamed from: f, reason: collision with root package name */
    public final es1 f12932f;

    /* renamed from: f0, reason: collision with root package name */
    public final gm0 f12933f0;
    public final a10 g;

    /* renamed from: g0, reason: collision with root package name */
    public final es1 f12934g0;

    /* renamed from: h, reason: collision with root package name */
    public final g10 f12935h;

    /* renamed from: h0, reason: collision with root package name */
    public final nn0 f12936h0;

    /* renamed from: i, reason: collision with root package name */
    public final es1 f12937i;

    /* renamed from: i0, reason: collision with root package name */
    public final es1 f12938i0;
    public final es1 j;

    /* renamed from: j0, reason: collision with root package name */
    public final yn0 f12939j0;

    /* renamed from: k, reason: collision with root package name */
    public final es1 f12940k;

    /* renamed from: k0, reason: collision with root package name */
    public final es1 f12941k0;

    /* renamed from: l, reason: collision with root package name */
    public final es1 f12942l;

    /* renamed from: l0, reason: collision with root package name */
    public final es1 f12943l0;

    /* renamed from: m, reason: collision with root package name */
    public final es1 f12944m;

    /* renamed from: m0, reason: collision with root package name */
    public final es1 f12945m0;

    /* renamed from: n, reason: collision with root package name */
    public final es1 f12946n;

    /* renamed from: n0, reason: collision with root package name */
    public final es1 f12947n0;

    /* renamed from: o, reason: collision with root package name */
    public final es1 f12948o;

    /* renamed from: o0, reason: collision with root package name */
    public final es1 f12949o0;

    /* renamed from: p, reason: collision with root package name */
    public final es1 f12950p;

    /* renamed from: p0, reason: collision with root package name */
    public final yl0 f12951p0;

    /* renamed from: q, reason: collision with root package name */
    public final es1 f12952q;

    /* renamed from: q0, reason: collision with root package name */
    public final es1 f12953q0;

    /* renamed from: r, reason: collision with root package name */
    public final es1 f12954r;

    /* renamed from: r0, reason: collision with root package name */
    public final gl0 f12955r0;

    /* renamed from: s, reason: collision with root package name */
    public final es1 f12956s;

    /* renamed from: s0, reason: collision with root package name */
    public final es1 f12957s0;

    /* renamed from: t, reason: collision with root package name */
    public final es1 f12958t;

    /* renamed from: t0, reason: collision with root package name */
    public final em0 f12959t0;

    /* renamed from: u, reason: collision with root package name */
    public final es1 f12960u;

    /* renamed from: u0, reason: collision with root package name */
    public final es1 f12961u0;

    /* renamed from: v, reason: collision with root package name */
    public final es1 f12962v;

    /* renamed from: v0, reason: collision with root package name */
    public final es1 f12963v0;

    /* renamed from: w, reason: collision with root package name */
    public final es1 f12964w;

    /* renamed from: w0, reason: collision with root package name */
    public final xm0 f12965w0;

    /* renamed from: x, reason: collision with root package name */
    public final es1 f12966x;

    /* renamed from: x0, reason: collision with root package name */
    public final es1 f12967x0;

    /* renamed from: y, reason: collision with root package name */
    public final b10 f12968y;

    /* renamed from: y0, reason: collision with root package name */
    public final es1 f12969y0;

    /* renamed from: z, reason: collision with root package name */
    public final es1 f12970z;

    /* renamed from: z0, reason: collision with root package name */
    public final es1 f12971z0;

    public k10(w00 w00Var, hl hlVar) {
        this.f12922a = w00Var;
        es1 es1VarB = es1.b(ls.f13605w);
        this.f12926c = es1VarB;
        es1 es1VarB2 = es1.b(new xe0(es1.b(ls.f13606x), 11));
        this.f12928d = es1VarB2;
        this.f12930e = es1.b(jz.f12902y);
        int i4 = 5;
        es1 es1VarB3 = es1.b(new lo0(i4));
        this.f12932f = es1VarB3;
        a10 a10Var = new a10(w00Var);
        this.g = a10Var;
        int i10 = 1;
        js1 js1VarB = ls1.b(new d10(a10Var, es1.b(new y00(w00Var, i4)), i10));
        g10 g10Var = new g10(w00Var);
        this.f12935h = g10Var;
        es1 es1VarB4 = es1.b(new yv(js1VarB, new fb.w(a10Var, g10Var, i10), a10Var, 13));
        this.f12937i = es1VarB4;
        int i11 = 19;
        es1 es1VarB5 = es1.b(new u90(es1VarB4, i11));
        this.j = es1VarB5;
        es1 es1VarB6 = es1.b(a80.f9273y);
        this.f12940k = es1VarB6;
        this.f12942l = es1.b(new s00(es1VarB6, es1VarB5, 0));
        es1 es1VarB7 = es1.b(new gf0(a10Var, g10Var, i10));
        this.f12944m = es1VarB7;
        z00 z00Var = new z00(a10Var, 2);
        es1 es1VarB8 = es1.b(ls.f13599q);
        this.f12946n = es1VarB8;
        es1 es1VarB9 = es1.b(new hw(z00Var, es1VarB8, i11));
        this.f12948o = es1VarB9;
        es1 es1VarB10 = es1.b(new c10(es1VarB9, 2));
        this.f12950p = es1VarB10;
        es1 es1VarB11 = es1.b(new o90(23));
        this.f12952q = es1VarB11;
        y00 y00Var = new y00(w00Var, 2);
        es1 es1VarB12 = es1.b(new ah(5));
        this.f12954r = es1VarB12;
        es1 es1VarB13 = es1.b(new s00(es1VarB12, es1VarB4, 9));
        es1 es1VarB14 = es1.b(a80.F);
        this.f12956s = es1VarB14;
        es1 es1VarB15 = es1.b(new c10(es1VarB14, 0));
        int i12 = ks1.f13231c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(es1VarB15);
        f60 f60Var = new f60(new ks1(list, arrayList), 17);
        es1 es1VarB16 = es1.b(new s00(es1VarB6, es1VarB2, 1));
        es1 es1VarB17 = es1.b(new el(a10Var, g10Var, es1VarB8, es1VarB16));
        this.f12958t = es1VarB17;
        es1 es1VarB18 = es1.b(new ic0(es1VarB, a10Var, y00Var, es1VarB9, es1VarB2, es1VarB13, g10Var, f60Var, es1VarB17));
        this.f12960u = es1VarB18;
        int i13 = 10;
        es1 es1VarB19 = es1.b(new ah(i13));
        this.f12962v = es1VarB19;
        es1 es1VarB20 = es1.b(new o90(i13));
        this.f12964w = es1VarB20;
        es1 es1VarB21 = es1.b(new gf0(a10Var, g10Var, 0));
        es1 es1VarB22 = es1.b(new z00(a10Var, 4));
        es1 es1VarB23 = es1.b(new z00(a10Var, 3));
        es1 es1VarB24 = es1.b(new s00(es1VarB18, es1VarB8, 10));
        es1 es1VarB25 = es1.b(new yv(a10Var, y00Var, es1VarB21, 14));
        this.f12966x = es1VarB25;
        b10 b10Var = new b10(a10Var);
        this.f12968y = b10Var;
        es1 es1VarB26 = es1.b(new qa0(es1VarB21, es1VarB22, es1VarB23, a10Var, g10Var, es1VarB24, es1VarB25, b10Var));
        this.f12970z = es1VarB26;
        y00 y00Var2 = new y00(w00Var, 3);
        es1 es1VarB27 = es1.b(new g50(a10Var, es1VarB17, g10Var));
        this.A = es1VarB27;
        es1 es1VarB28 = es1.b(new z00(a10Var, 5));
        es1 es1VarB29 = es1.b(new ah(2));
        this.B = es1VarB29;
        x00 x00Var = new x00(es1VarB29);
        this.C = x00Var;
        this.D = es1.b(new d20(a10Var, g10Var, es1VarB9, es1VarB10, es1VarB11, es1VarB18, es1VarB19, es1VarB20, es1VarB26, y00Var2, es1VarB17, z00Var, es1VarB27, es1VarB5, es1.b(new el(es1VarB28, es1VarB5, a10Var, x00Var, 10))));
        es1 es1VarB30 = es1.b(new xe0(es1VarB2, 12));
        d10 d10Var = new d10(a10Var, es1VarB5);
        es1 es1VarB31 = es1.b(new yv(es1VarB2, d10Var, es1VarB3, 1));
        es1 es1VarB32 = es1.b(new k50(a10Var, g10Var, es1VarB2, es1VarB30, z00Var, es1VarB3, es1VarB31, 7));
        this.E = es1.b(new s00(es1.b(new el(es1VarB32, d10Var, a10Var, es1VarB3)), es1.b(new g40(es1VarB32, (js1) d10Var, (js1) a10Var, (Object) es1VarB3, es1VarB31, 18)), 15));
        gs1 gs1VarB = gs1.b(this);
        this.F = gs1VarB;
        es1 es1VarB33 = es1.b(new s00(es1.b(new y00(w00Var, 4)), es1.b(new y00(w00Var, 0)), 2));
        this.G = es1VarB33;
        y10 y10Var = new y10(hlVar);
        this.H = y10Var;
        es1 es1VarB34 = es1.b(new z00(a10Var, 6));
        this.I = es1VarB34;
        es1 es1VarB35 = es1.b(a80.J);
        es1 es1VarB36 = es1.b(new xe0(es1VarB34, 13));
        this.J = es1VarB36;
        int i14 = 2;
        es1 es1VarB37 = es1.b(new j90(a10Var, es1VarB35, js1VarB, es1VarB36, es1VarB17, es1VarB16));
        this.K = es1VarB37;
        es1 es1VarB38 = es1.b(new el(a10Var, es1VarB34, js1VarB, es1VarB5));
        this.L = es1VarB38;
        es1 es1VarB39 = es1.b(new xe0(es1VarB33, 9));
        this.M = es1VarB39;
        es1 es1VarB40 = es1.b(new c10(es1.b(new ic0(a10Var, es1VarB, es1VarB33, g10Var, y10Var, es1VarB34, es1VarB37, es1VarB5, es1VarB38, es1VarB39)), 3));
        this.N = es1VarB40;
        es1 es1VarB41 = es1.b(new fb.w(a10Var, es1VarB4, i14));
        es1 es1VarB42 = es1.b(new fb.w(a10Var, g10Var, 0));
        this.O = es1.b(new w50(gs1VarB, a10Var, es1VarB33, es1VarB40, es1VarB2, es1VarB4, es1VarB37, g10Var, new el(es1VarB2, es1VarB41, es1VarB42, es1VarB4, 0), es1VarB39, es1VarB41, es1VarB42));
        int i15 = 1;
        this.P = es1.b(new fb.n(es1VarB4, i15));
        this.Q = es1.b(nn1.f14357v);
        this.R = es1.b(new fb.u(a10Var, i15));
        int i16 = 7;
        int i17 = 16;
        this.S = es1.b(new m20(i17, new s00(es1.b(new m20(22, new y00(w00Var, i15))), es1.b(new u90(es1VarB5, i16)), i17)));
        this.T = new e10(gs1VarB);
        this.U = new i10(a10Var, es1VarB17);
        this.V = es1.b(nn1.f14348m);
        this.W = new h10(es1VarB29);
        int i18 = 20;
        this.X = es1.b(new u90(es1VarB3, i18));
        int i19 = 0;
        es1 es1VarB43 = es1.b(new z00(a10Var, i19));
        this.Y = es1VarB43;
        es1 es1VarB44 = es1.b(new d10(a10Var, es1VarB43, i19));
        this.Z = es1VarB44;
        this.f12923a0 = es1.b(new yv(new d10(a10Var, es1VarB7, i14), es1VarB3, es1VarB5, 19));
        this.f12925b0 = es1.b(nn1.f14356u);
        fn0 fn0Var = new fn0(es1VarB43, es1VarB44, a10Var);
        this.f12927c0 = fn0Var;
        this.f12929d0 = es1.b(new yv(fn0Var, es1VarB3, es1VarB5, 25));
        this.f12931e0 = es1.b(ls.f13603u);
        gm0 gm0Var = new gm0(a10Var);
        this.f12933f0 = gm0Var;
        this.f12934g0 = es1.b(new yv(gm0Var, es1VarB3, es1VarB5, 23));
        nn0 nn0Var = new nn0(a10Var, g10Var, b10Var);
        this.f12936h0 = nn0Var;
        this.f12938i0 = es1.b(new yv(nn0Var, es1VarB3, es1VarB5, 26));
        yn0 yn0Var = new yn0(a10Var);
        this.f12939j0 = yn0Var;
        this.f12941k0 = es1.b(new yv(yn0Var, es1VarB3, es1VarB5, 27));
        this.f12943l0 = es1.b(new yv(new z00(a10Var, i16), es1VarB3, es1VarB5, 17));
        this.f12945m0 = es1.b(new s00(es1VarB3, es1VarB5, 12));
        this.f12947n0 = es1.b(jz.f12896s);
        this.f12949o0 = es1.b(new s00(es1VarB3, es1VarB5, 13));
        yl0 yl0Var = new yl0(es1VarB29);
        this.f12951p0 = yl0Var;
        this.f12953q0 = es1.b(new yv(yl0Var, es1VarB3, es1VarB5, 21));
        gl0 gl0Var = new gl0(a10Var);
        this.f12955r0 = gl0Var;
        this.f12957s0 = es1.b(new yv(gl0Var, es1VarB3, es1VarB5, i18));
        em0 em0Var = new em0(g10Var);
        this.f12959t0 = em0Var;
        this.f12961u0 = es1.b(new yv(em0Var, es1VarB3, es1VarB5, 22));
        es1 es1VarB45 = es1.b(new ah(4));
        this.f12963v0 = es1VarB45;
        xm0 xm0Var = new xm0(a10Var, es1VarB45);
        this.f12965w0 = xm0Var;
        this.f12967x0 = es1.b(new yv(xm0Var, es1VarB3, es1VarB5, 24));
        this.f12969y0 = es1.b(jz.f12891n);
        es1 es1VarB46 = es1.b(new y00(w00Var, 6));
        this.f12971z0 = es1VarB46;
        int i20 = 8;
        this.A0 = es1.b(new yv(new z00(a10Var, i20), es1VarB3, es1VarB5, 18));
        this.B0 = new e20(a10Var);
        this.C0 = es1.b(ls.f13604v);
        this.D0 = es1.b(nn1.f14359x);
        this.E0 = es1.b(new c10(es1VarB9, 1));
        this.F0 = new ah(i20);
        this.G0 = es1.b(new g50(a10Var, g10Var, es1VarB17));
        this.H0 = new r30(es1VarB2, es1VarB3, es1VarB5);
        this.I0 = es1.b(a80.I);
        this.J0 = es1.b(nn1.f14358w);
        this.K0 = es1.b(new z00(a10Var, 1));
        this.L0 = es1.b(new u90(es1VarB5, 3));
        this.M0 = es1.b(ls.f13593k);
        this.N0 = es1.b(new fb.s(a10Var, es1VarB46, es1VarB44, es1.b(new fb.u(a10Var, 0)), es1VarB2));
        this.O0 = es1.b(new z00(a10Var, 9));
    }

    public static k10 a(Context context, ar arVar, int i4) {
        w81 w81Var;
        SharedPreferences sharedPreferences;
        synchronized (k10.class) {
            try {
                k10 k10Var = P0;
                if (k10Var != null) {
                    return k10Var;
                }
                ua.j jVar = ua.j.C;
                jVar.f35267k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                sk.a(context);
                if (((Boolean) nl.f14325e.u()).booleanValue() && (sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", nn1.z(context, "init_without_write") + 1).commit();
                }
                pq0 pq0VarO = pq0.o(context);
                boolean zG = ya.f0.g((Context) pq0VarO.f15073b);
                za.a aVar = new za.a(ModuleDescriptor.MODULE_VERSION, i4, 0, true, zG);
                if (((Boolean) vl.f17644c.u()).booleanValue()) {
                    va.d1 d1Var = (va.d1) pq0VarO.f15074c;
                    va.l2 liteSdkVersion = null;
                    if (d1Var != null) {
                        try {
                            liteSdkVersion = d1Var.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        aVar = new za.a(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.f36135b, 0, true, zG);
                    }
                }
                pq0VarO.x(arVar);
                w00 w00Var = new w00();
                w00Var.f17808a = aVar;
                w00Var.f17811d = new WeakReference(context);
                w00Var.f17809b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                w00Var.f17810c = jCurrentTimeMillis;
                w00 w00Var2 = new w00();
                w00Var2.f17808a = w00Var.f17808a;
                w00Var2.f17809b = w00Var.f17809b;
                w00Var2.f17811d = w00Var.f17811d;
                w00Var2.f17810c = w00Var.f17810c;
                k10 k10Var2 = new k10(w00Var2, new hl(26));
                pk pkVar = sk.f16049af;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    cx cxVar = jVar.f35263e;
                    ex exVar = fx.f11274a;
                    al0.z(exVar);
                    cxVar.a(exVar, (qd0) k10Var2.j.a(), context);
                    cx cxVar2 = jVar.f35263e;
                    if (cxVar2.f10245d.get() && cxVar2.f10247f >= 0 && cxVar2.g >= 0 && cxVar2.f10246e.compareAndSet(false, true) && (w81Var = cxVar2.f10242a) != null) {
                        ((ex) w81Var).c(new s(17, cxVar2));
                    }
                }
                ((tf0) k10Var2.f12944m.a()).a();
                ((r00) k10Var2.f12942l.a()).a(context, aVar);
                jVar.f35265h.d(context, aVar, (qd0) k10Var2.j.a());
                jVar.j.d(context);
                jVar.f35261c.D(context);
                jVar.f35261c.E(context);
                u6.t.t(context);
                jVar.g.d(context);
                jVar.f35282z.a(context);
                if (((Boolean) sVar.f36166c.a(sk.f16409xf)).booleanValue()) {
                    String str = (String) sVar.f36166c.a(sk.f16426yf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((ad0) k10Var2.S.a()).a(jVar.g);
                        }
                    }
                } else if (((Boolean) sVar.f36166c.a(sk.f16392wf)).booleanValue()) {
                    ((ad0) k10Var2.S.a()).a(jVar.g);
                }
                ((ya.x) k10Var2.R.a()).a();
                aw.o(context);
                if (((Boolean) sVar.f36166c.a(sk.W6)).booleanValue()) {
                    if (!((Boolean) sVar.f36166c.a(sk.V0)).booleanValue()) {
                        li liVar = new li(new m8.s(context, 2));
                        l90 l90Var = new l90(15, new ch0(context), (w81) k10Var2.f12930e.a());
                        try {
                            l90Var.g(new a4.d(new pq0(context, aVar, liVar, l90Var), jVar.f35265h.i().E()));
                        } catch (Exception e2) {
                            za.i.e("Error in offline signals database startup: ".concat(String.valueOf(e2.getMessage())));
                        }
                    }
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16297qf)).booleanValue()) {
                    Context context2 = k10Var2.f12922a.f17809b;
                    al0.z(context2);
                    ex exVar2 = fx.f11274a;
                    al0.z(exVar2);
                    exVar2.execute(new s30(14, new pq0(k10Var2, context2, exVar2)));
                }
                P0 = k10Var2;
                return k10Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f12926c.a();
    }

    public final cs0 c() {
        return (cs0) this.f12958t.a();
    }
}
