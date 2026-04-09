package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes.dex */
public final class JN {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9278a;

    /* renamed from: b, reason: collision with root package name */
    public final C1994v2 f9279b;

    /* renamed from: c, reason: collision with root package name */
    public final C1014cu f9280c;

    /* renamed from: d, reason: collision with root package name */
    public final C2083wk f9281d;

    /* renamed from: e, reason: collision with root package name */
    public ZA f9282e;

    /* renamed from: f, reason: collision with root package name */
    public ZA f9283f;

    /* renamed from: g, reason: collision with root package name */
    public final C1288hw f9284g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f9285h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C0729Sj f9286j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9287k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9288l;

    /* renamed from: m, reason: collision with root package name */
    public final C2178yO f9289m;

    /* renamed from: n, reason: collision with root package name */
    public final C2124xO f9290n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9291o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9292p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9293q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9294r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9295s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9296t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9297u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9298v;

    /* renamed from: w, reason: collision with root package name */
    public final String f9299w;

    /* renamed from: x, reason: collision with root package name */
    public final DN f9300x;

    public JN(Context context, Rx rx) {
        C1014cu c1014cu = new C1014cu(8, rx);
        C2083wk c2083wk = new C2083wk(context);
        C9 c9 = new C9(context, false);
        ZJ zj = ZJ.f12816b;
        C1288hw c1288hw = new C1288hw(context, 5);
        context.getClass();
        this.f9278a = context;
        this.f9280c = c1014cu;
        this.f9281d = c2083wk;
        this.f9282e = c9;
        this.f9283f = zj;
        this.f9284g = c1288hw;
        String str = Vt.f12096a;
        Looper looperMyLooper = Looper.myLooper();
        this.f9285h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f9286j = C0729Sj.f11224b;
        this.f9287k = 1;
        this.f9288l = true;
        this.f9289m = C2178yO.f17717d;
        this.f9290n = C2124xO.f17587b;
        this.f9300x = new DN(Vt.s(20L), Vt.s(500L));
        this.f9279b = C1994v2.f17209f;
        this.f9291o = 500L;
        this.f9292p = 2000L;
        this.f9293q = 600000;
        this.f9294r = Integer.MAX_VALUE;
        this.f9295s = Integer.MAX_VALUE;
        this.f9296t = 600000;
        this.f9297u = true;
        this.f9299w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = GN.f8363a;
        }
    }
}
