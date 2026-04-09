package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ws1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18167a;

    /* renamed from: b, reason: collision with root package name */
    public final w5 f18168b;

    /* renamed from: c, reason: collision with root package name */
    public final kh0 f18169c;

    /* renamed from: d, reason: collision with root package name */
    public final nk f18170d;

    /* renamed from: e, reason: collision with root package name */
    public l31 f18171e;

    /* renamed from: f, reason: collision with root package name */
    public l31 f18172f;
    public final jm g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f18173h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18174i;
    public final p50 j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18175k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18176l;

    /* renamed from: m, reason: collision with root package name */
    public final nu1 f18177m;

    /* renamed from: n, reason: collision with root package name */
    public final mu1 f18178n;

    /* renamed from: o, reason: collision with root package name */
    public final long f18179o;

    /* renamed from: p, reason: collision with root package name */
    public final long f18180p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18181q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18182r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18183s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18184t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18185u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18186v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18187w;

    /* renamed from: x, reason: collision with root package name */
    public final qs1 f18188x;

    public ws1(Context context, fk0 fk0Var) {
        kh0 kh0Var = new kh0(18, fk0Var);
        nk nkVar = new nk(context, 4);
        mu0 mu0Var = new mu0(context, 4);
        cl1 cl1Var = cl1.f10163h;
        jm jmVar = new jm(context, 3);
        context.getClass();
        this.f18167a = context;
        this.f18169c = kh0Var;
        this.f18170d = nkVar;
        this.f18171e = mu0Var;
        this.f18172f = cl1Var;
        this.g = jmVar;
        String str = bq0.f9768a;
        Looper looperMyLooper = Looper.myLooper();
        this.f18173h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = p50.f14899b;
        this.f18175k = 1;
        this.f18176l = true;
        this.f18177m = nu1.f14443d;
        this.f18178n = mu1.f14023b;
        this.f18188x = new qs1(bq0.s(20L), bq0.s(500L));
        this.f18168b = w5.f17894f;
        this.f18179o = 500L;
        this.f18180p = 2000L;
        this.f18181q = 600000;
        this.f18182r = Integer.MAX_VALUE;
        this.f18183s = Integer.MAX_VALUE;
        this.f18184t = 600000;
        this.f18185u = true;
        this.f18187w = "";
        this.f18174i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i4 = ts1.f16941a;
        }
    }
}
