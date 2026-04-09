package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ka4 {
    public final Context a;
    public final pz b;
    public final rc3 c;
    public final cy2 d;
    public ll3 e;
    public ll3 f;
    public final lz1 g;
    public final Looper h;
    public final int i;
    public final in2 j;
    public final int k;
    public final boolean l;
    public final lc4 m;
    public final kc4 n;
    public final long o;
    public final long p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public boolean v;
    public final String w;
    public final m44 x;

    public ka4(ug0 ug0Var, Context context) {
        rc3 rc3Var = new rc3(6, ug0Var);
        cy2 cy2Var = new cy2(context);
        k34 k34Var = new k34(context);
        t24 t24Var = t24.n;
        lz1 lz1Var = new lz1(context, 2);
        context.getClass();
        this.a = context;
        this.c = rc3Var;
        this.d = cy2Var;
        this.e = k34Var;
        this.f = t24Var;
        this.g = lz1Var;
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = in2.b;
        this.k = 1;
        this.l = true;
        this.m = lc4.d;
        this.n = kc4.b;
        this.x = new m44(v23.r(20L), v23.r(500L));
        this.b = pz.o;
        this.o = 500L;
        this.p = 2000L;
        this.q = 600000;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = 600000;
        this.u = true;
        this.w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = o74.a;
        }
    }
}
