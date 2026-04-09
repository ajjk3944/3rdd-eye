package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;
import java.util.List;

/* loaded from: classes3.dex */
final class th1 {

    /* renamed from: s, reason: collision with root package name */
    private static final jw0.b f33593s = new jw0.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final v42 f33594a;

    /* renamed from: b, reason: collision with root package name */
    public final jw0.b f33595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33596c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33598e;

    /* renamed from: f, reason: collision with root package name */
    public final h60 f33599f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33600g;

    /* renamed from: h, reason: collision with root package name */
    public final m52 f33601h;
    public final t52 i;

    /* renamed from: j, reason: collision with root package name */
    public final List<yz0> f33602j;

    /* renamed from: k, reason: collision with root package name */
    public final jw0.b f33603k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f33604l;

    /* renamed from: m, reason: collision with root package name */
    public final int f33605m;

    /* renamed from: n, reason: collision with root package name */
    public final vh1 f33606n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f33607o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f33608p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f33609q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f33610r;

    public th1(v42 v42Var, jw0.b bVar, long j4, long j10, int i, h60 h60Var, boolean z10, m52 m52Var, t52 t52Var, List<yz0> list, jw0.b bVar2, boolean z11, int i10, vh1 vh1Var, long j11, long j12, long j13, boolean z12) {
        this.f33594a = v42Var;
        this.f33595b = bVar;
        this.f33596c = j4;
        this.f33597d = j10;
        this.f33598e = i;
        this.f33599f = h60Var;
        this.f33600g = z10;
        this.f33601h = m52Var;
        this.i = t52Var;
        this.f33602j = list;
        this.f33603k = bVar2;
        this.f33604l = z11;
        this.f33605m = i10;
        this.f33606n = vh1Var;
        this.f33608p = j11;
        this.f33609q = j12;
        this.f33610r = j13;
        this.f33607o = z12;
    }

    public static th1 a(t52 t52Var) {
        v42 v42Var = v42.f34342b;
        jw0.b bVar = f33593s;
        return new th1(v42Var, bVar, -9223372036854775807L, 0L, 1, null, false, m52.f30219e, t52Var, xj0.h(), bVar, false, 0, vh1.f34541e, 0L, 0L, 0L, false);
    }

    public static jw0.b a() {
        return f33593s;
    }

    public final th1 a(jw0.b bVar, long j4, long j10, long j11, long j12, m52 m52Var, t52 t52Var, List<yz0> list) {
        return new th1(this.f33594a, bVar, j10, j11, this.f33598e, this.f33599f, this.f33600g, m52Var, t52Var, list, this.f33603k, this.f33604l, this.f33605m, this.f33606n, this.f33608p, j12, j4, this.f33607o);
    }

    public final th1 a(v42 v42Var) {
        return new th1(v42Var, this.f33595b, this.f33596c, this.f33597d, this.f33598e, this.f33599f, this.f33600g, this.f33601h, this.i, this.f33602j, this.f33603k, this.f33604l, this.f33605m, this.f33606n, this.f33608p, this.f33609q, this.f33610r, this.f33607o);
    }

    public final th1 a(int i) {
        return new th1(this.f33594a, this.f33595b, this.f33596c, this.f33597d, i, this.f33599f, this.f33600g, this.f33601h, this.i, this.f33602j, this.f33603k, this.f33604l, this.f33605m, this.f33606n, this.f33608p, this.f33609q, this.f33610r, this.f33607o);
    }

    public final th1 a(h60 h60Var) {
        return new th1(this.f33594a, this.f33595b, this.f33596c, this.f33597d, this.f33598e, h60Var, this.f33600g, this.f33601h, this.i, this.f33602j, this.f33603k, this.f33604l, this.f33605m, this.f33606n, this.f33608p, this.f33609q, this.f33610r, this.f33607o);
    }

    public final th1 a(jw0.b bVar) {
        return new th1(this.f33594a, this.f33595b, this.f33596c, this.f33597d, this.f33598e, this.f33599f, this.f33600g, this.f33601h, this.i, this.f33602j, bVar, this.f33604l, this.f33605m, this.f33606n, this.f33608p, this.f33609q, this.f33610r, this.f33607o);
    }
}
