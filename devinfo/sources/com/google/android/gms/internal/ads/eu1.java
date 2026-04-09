package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eu1 {

    /* renamed from: t, reason: collision with root package name */
    public static final jy1 f10871t = new jy1(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final uh f10872a;

    /* renamed from: b, reason: collision with root package name */
    public final jy1 f10873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10874c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10875d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10876e;

    /* renamed from: f, reason: collision with root package name */
    public final us1 f10877f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final oz1 f10878h;

    /* renamed from: i, reason: collision with root package name */
    public final g f10879i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final jy1 f10880k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10881l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10882m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10883n;

    /* renamed from: o, reason: collision with root package name */
    public final fc f10884o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f10885p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f10886q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f10887r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f10888s;

    public eu1(uh uhVar, jy1 jy1Var, long j, long j8, int i4, us1 us1Var, boolean z3, oz1 oz1Var, g gVar, List list, jy1 jy1Var2, boolean z10, int i10, int i11, fc fcVar, long j9, long j10, long j11, long j12) {
        this.f10872a = uhVar;
        this.f10873b = jy1Var;
        this.f10874c = j;
        this.f10875d = j8;
        this.f10876e = i4;
        this.f10877f = us1Var;
        this.g = z3;
        this.f10878h = oz1Var;
        this.f10879i = gVar;
        this.j = list;
        this.f10880k = jy1Var2;
        this.f10881l = z10;
        this.f10882m = i10;
        this.f10883n = i11;
        this.f10884o = fcVar;
        this.f10885p = j9;
        this.f10886q = j10;
        this.f10887r = j11;
        this.f10888s = j12;
    }

    public static eu1 a(g gVar) {
        ag agVar = uh.f17203a;
        oz1 oz1Var = oz1.f14819d;
        u51 u51Var = u51.f17096e;
        fc fcVar = fc.f11093d;
        jy1 jy1Var = f10871t;
        return new eu1(agVar, jy1Var, -9223372036854775807L, 0L, 1, null, false, oz1Var, gVar, u51Var, jy1Var, false, 1, 0, fcVar, 0L, 0L, 0L, 0L);
    }

    public final eu1 b(jy1 jy1Var, long j, long j8, long j9, long j10, oz1 oz1Var, g gVar, List list) {
        jy1 jy1Var2 = this.f10880k;
        boolean z3 = this.f10881l;
        int i4 = this.f10882m;
        int i10 = this.f10883n;
        fc fcVar = this.f10884o;
        long j11 = this.f10885p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new eu1(this.f10872a, jy1Var, j8, j9, this.f10876e, this.f10877f, this.g, oz1Var, gVar, list, jy1Var2, z3, i4, i10, fcVar, j11, j10, j, jElapsedRealtime);
    }

    public final eu1 c(uh uhVar) {
        return new eu1(uhVar, this.f10873b, this.f10874c, this.f10875d, this.f10876e, this.f10877f, this.g, this.f10878h, this.f10879i, this.j, this.f10880k, this.f10881l, this.f10882m, this.f10883n, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final eu1 d(int i4) {
        return new eu1(this.f10872a, this.f10873b, this.f10874c, this.f10875d, i4, this.f10877f, this.g, this.f10878h, this.f10879i, this.j, this.f10880k, this.f10881l, this.f10882m, this.f10883n, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final eu1 e(us1 us1Var) {
        return new eu1(this.f10872a, this.f10873b, this.f10874c, this.f10875d, this.f10876e, us1Var, this.g, this.f10878h, this.f10879i, this.j, this.f10880k, this.f10881l, this.f10882m, this.f10883n, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final eu1 f(boolean z3) {
        return new eu1(this.f10872a, this.f10873b, this.f10874c, this.f10875d, this.f10876e, this.f10877f, z3, this.f10878h, this.f10879i, this.j, this.f10880k, this.f10881l, this.f10882m, this.f10883n, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final eu1 g(jy1 jy1Var) {
        return new eu1(this.f10872a, this.f10873b, this.f10874c, this.f10875d, this.f10876e, this.f10877f, this.g, this.f10878h, this.f10879i, this.j, jy1Var, this.f10881l, this.f10882m, this.f10883n, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final eu1 h(int i4, int i10, boolean z3) {
        return new eu1(this.f10872a, this.f10873b, this.f10874c, this.f10875d, this.f10876e, this.f10877f, this.g, this.f10878h, this.f10879i, this.j, this.f10880k, z3, i4, i10, this.f10884o, this.f10885p, this.f10886q, this.f10887r, this.f10888s);
    }

    public final boolean i() {
        return this.f10876e == 3 && this.f10881l && this.f10883n == 0;
    }
}
