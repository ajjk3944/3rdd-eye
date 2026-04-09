package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5065x4 {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C5065x4 f42011u;

    /* renamed from: a, reason: collision with root package name */
    public final J6 f42012a;

    /* renamed from: b, reason: collision with root package name */
    public final W7 f42013b;

    /* renamed from: c, reason: collision with root package name */
    public final C4810n4 f42014c;

    /* renamed from: d, reason: collision with root package name */
    public final N1 f42015d;

    /* renamed from: e, reason: collision with root package name */
    public final C4805n f42016e;

    /* renamed from: f, reason: collision with root package name */
    public final Uk f42017f;

    /* renamed from: g, reason: collision with root package name */
    public final X5 f42018g;

    /* renamed from: h, reason: collision with root package name */
    public final C4753l f42019h;
    public final C4674hn i;

    /* renamed from: j, reason: collision with root package name */
    public Id f42020j;

    /* renamed from: k, reason: collision with root package name */
    public final C4832o0 f42021k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C4990u4 f42022l;

    /* renamed from: m, reason: collision with root package name */
    public final C4767ld f42023m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C4666hf f42024n;

    /* renamed from: o, reason: collision with root package name */
    public C4773lj f42025o;

    /* renamed from: p, reason: collision with root package name */
    public final C4986u0 f42026p;

    /* renamed from: q, reason: collision with root package name */
    public final R1 f42027q;

    /* renamed from: r, reason: collision with root package name */
    public final C5021va f42028r;

    /* renamed from: s, reason: collision with root package name */
    public volatile Z f42029s;

    /* renamed from: t, reason: collision with root package name */
    public volatile C4609fa f42030t;

    public C5065x4(J6 j62, C4805n c4805n, C4810n4 c4810n4) {
        this(j62, c4805n, c4810n4, new C4753l(c4805n));
    }

    public static C5065x4 l() {
        if (f42011u == null) {
            synchronized (C5065x4.class) {
                try {
                    if (f42011u == null) {
                        f42011u = new C5065x4(new J6(), new C4805n(), new C4810n4());
                    }
                } finally {
                }
            }
        }
        return f42011u;
    }

    public final C4805n a() {
        return this.f42016e;
    }

    public final C4666hf b(Context context) {
        C4666hf c4666hf;
        C4666hf c4666hf2 = this.f42024n;
        if (c4666hf2 != null) {
            return c4666hf2;
        }
        synchronized (this) {
            try {
                c4666hf = this.f42024n;
                if (c4666hf == null) {
                    c4666hf = new C4666hf(C4916r7.a(context).a());
                    this.f42024n = c4666hf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4666hf;
    }

    public final C4832o0 c() {
        return this.f42021k;
    }

    public final C4986u0 d() {
        return this.f42026p;
    }

    public final N1 e() {
        return this.f42015d;
    }

    public final R1 f() {
        return this.f42027q;
    }

    public final C4810n4 g() {
        return this.f42014c;
    }

    public final X5 h() {
        return this.f42018g;
    }

    public final J6 i() {
        return this.f42012a;
    }

    public final W7 j() {
        return this.f42013b;
    }

    public final C5021va k() {
        return this.f42028r;
    }

    public final C4990u4 m() {
        C4990u4 c4990u4;
        C4990u4 c4990u42 = this.f42022l;
        if (c4990u42 != null) {
            return c4990u42;
        }
        synchronized (this) {
            try {
                c4990u4 = this.f42022l;
                if (c4990u4 == null) {
                    c4990u4 = new C4990u4();
                    this.f42022l = c4990u4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4990u4;
    }

    public final J6 n() {
        return this.f42012a;
    }

    public final Uk o() {
        return this.f42017f;
    }

    public C5065x4(J6 j62, C4805n c4805n, C4810n4 c4810n4, C4753l c4753l) {
        this(j62, new W7(), c4810n4, c4753l, new N1(), c4805n, new Uk(c4805n, c4753l), new X5(c4805n), new C4674hn(), new C4832o0());
    }

    public final synchronized Id a(Context context) {
        try {
            if (this.f42020j == null) {
                this.f42020j = new Id(context, new C4649go());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f42020j;
    }

    public C5065x4(J6 j62, W7 w72, C4810n4 c4810n4, C4753l c4753l, N1 n12, C4805n c4805n, Uk uk, X5 x52, C4674hn c4674hn, C4832o0 c4832o0) {
        this.f42023m = new C4767ld();
        this.f42026p = new C4986u0();
        this.f42027q = new R1();
        this.f42028r = new C5021va();
        new V7();
        this.f42012a = j62;
        this.f42013b = w72;
        this.f42014c = c4810n4;
        this.f42019h = c4753l;
        this.f42015d = n12;
        this.f42016e = c4805n;
        this.f42017f = uk;
        this.f42018g = x52;
        this.i = c4674hn;
        this.f42021k = c4832o0;
    }

    public final Z b() {
        Z z10;
        Z z11 = this.f42029s;
        if (z11 != null) {
            return z11;
        }
        synchronized (this) {
            try {
                z10 = this.f42029s;
                if (z10 == null) {
                    z10 = new Z(this.f42026p, this.f42017f, this.f42014c);
                    this.f42029s = z10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
