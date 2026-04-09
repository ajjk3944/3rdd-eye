package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;

/* loaded from: classes3.dex */
final class ew0 {

    /* renamed from: a, reason: collision with root package name */
    public final dw0 f27054a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27055b;

    /* renamed from: c, reason: collision with root package name */
    public final ft1[] f27056c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27057d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27058e;

    /* renamed from: f, reason: collision with root package name */
    public gw0 f27059f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27060g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f27061h;
    private final to1[] i;

    /* renamed from: j, reason: collision with root package name */
    private final s52 f27062j;

    /* renamed from: k, reason: collision with root package name */
    private final mw0 f27063k;

    /* renamed from: l, reason: collision with root package name */
    private ew0 f27064l;

    /* renamed from: m, reason: collision with root package name */
    private m52 f27065m;

    /* renamed from: n, reason: collision with root package name */
    private t52 f27066n;

    /* renamed from: o, reason: collision with root package name */
    private long f27067o;

    public ew0(to1[] to1VarArr, long j4, s52 s52Var, vc vcVar, mw0 mw0Var, gw0 gw0Var, t52 t52Var) {
        this.i = to1VarArr;
        this.f27067o = j4;
        this.f27062j = s52Var;
        this.f27063k = mw0Var;
        jw0.b bVar = gw0Var.f28012a;
        this.f27055b = bVar.f27470a;
        this.f27059f = gw0Var;
        this.f27065m = m52.f30219e;
        this.f27066n = t52Var;
        this.f27056c = new ft1[to1VarArr.length];
        this.f27061h = new boolean[to1VarArr.length];
        this.f27054a = a(bVar, mw0Var, vcVar, gw0Var.f28013b, gw0Var.f28015d);
    }

    public final long a(t52 t52Var, long j4, boolean z10, boolean[] zArr) {
        t52 t52Var2;
        int i = 0;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= t52Var.f33450a) {
                break;
            }
            boolean[] zArr2 = this.f27061h;
            if (z10 || (t52Var2 = this.f27066n) == null || !s82.a(t52Var.f33451b[i10], t52Var2.f33451b[i10]) || !s82.a(t52Var.f33452c[i10], t52Var2.f33452c[i10])) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        ft1[] ft1VarArr = this.f27056c;
        int i11 = 0;
        while (true) {
            to1[] to1VarArr = this.i;
            if (i11 >= to1VarArr.length) {
                break;
            }
            if (((mk) to1VarArr[i11]).m() == -2) {
                ft1VarArr[i11] = null;
            }
            i11++;
        }
        a();
        this.f27066n = t52Var;
        if (this.f27064l == null) {
            int i12 = 0;
            while (true) {
                t52 t52Var3 = this.f27066n;
                if (i12 >= t52Var3.f33450a) {
                    break;
                }
                boolean zA = t52Var3.a(i12);
                c70 c70Var = this.f27066n.f33452c[i12];
                if (zA && c70Var != null) {
                    c70Var.d();
                }
                i12++;
            }
        }
        long jA = this.f27054a.a(t52Var.f33452c, this.f27061h, this.f27056c, zArr, j4);
        ft1[] ft1VarArr2 = this.f27056c;
        int i13 = 0;
        while (true) {
            to1[] to1VarArr2 = this.i;
            if (i13 >= to1VarArr2.length) {
                break;
            }
            if (((mk) to1VarArr2[i13]).m() == -2 && this.f27066n.a(i13)) {
                ft1VarArr2[i13] = new y40();
            }
            i13++;
        }
        this.f27058e = false;
        while (true) {
            ft1[] ft1VarArr3 = this.f27056c;
            if (i >= ft1VarArr3.length) {
                return jA;
            }
            if (ft1VarArr3[i] != null) {
                if (!t52Var.a(i)) {
                    throw new IllegalStateException();
                }
                if (((mk) this.i[i]).m() != -2) {
                    this.f27058e = true;
                }
            } else if (t52Var.f33452c[i] != null) {
                throw new IllegalStateException();
            }
            i++;
        }
    }

    public final ew0 b() {
        return this.f27064l;
    }

    public final long c() {
        return this.f27067o;
    }

    public final long d() {
        return this.f27059f.f28013b + this.f27067o;
    }

    public final m52 e() {
        return this.f27065m;
    }

    public final t52 f() {
        return this.f27066n;
    }

    public final void g() {
        a();
        mw0 mw0Var = this.f27063k;
        dw0 dw0Var = this.f27054a;
        try {
            if (dw0Var instanceof cp) {
                mw0Var.a(((cp) dw0Var).f25736b);
            } else {
                mw0Var.a(dw0Var);
            }
        } catch (RuntimeException e4) {
            rs0.a("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public final void h() {
        this.f27067o = 1000000000000L;
    }

    public final void b(long j4) {
        if (this.f27064l != null) {
            throw new IllegalStateException();
        }
        if (this.f27057d) {
            this.f27054a.reevaluateBuffer(j4 - this.f27067o);
        }
    }

    public final long c(long j4) {
        return j4 - this.f27067o;
    }

    public final long d(long j4) {
        return j4 + this.f27067o;
    }

    public final t52 b(float f10, v42 v42Var) throws h60 {
        t52 t52VarA = this.f27062j.a(this.i, this.f27065m, this.f27059f.f28012a, v42Var);
        for (c70 c70Var : t52VarA.f33452c) {
            if (c70Var != null) {
                c70Var.a(f10);
            }
        }
        return t52VarA;
    }

    public final void a(t52 t52Var, long j4) {
        a(t52Var, j4, false, new boolean[this.i.length]);
    }

    public final void a(long j4) {
        if (this.f27064l == null) {
            this.f27054a.continueLoading(j4 - this.f27067o);
            return;
        }
        throw new IllegalStateException();
    }

    private static dw0 a(jw0.b bVar, mw0 mw0Var, vc vcVar, long j4, long j10) {
        wt0 wt0VarA = mw0Var.a(bVar, vcVar, j4);
        return j10 != -9223372036854775807L ? new cp(wt0VarA, true, 0L, j10) : wt0VarA;
    }

    private void a() {
        if (this.f27064l != null) {
            return;
        }
        int i = 0;
        while (true) {
            t52 t52Var = this.f27066n;
            if (i >= t52Var.f33450a) {
                return;
            }
            boolean zA = t52Var.a(i);
            c70 c70Var = this.f27066n.f33452c[i];
            if (zA && c70Var != null) {
                c70Var.c();
            }
            i++;
        }
    }

    public final void a(float f10, v42 v42Var) throws h60 {
        this.f27057d = true;
        this.f27065m = this.f27054a.getTrackGroups();
        t52 t52VarB = b(f10, v42Var);
        gw0 gw0Var = this.f27059f;
        long jMax = gw0Var.f28013b;
        long j4 = gw0Var.f28016e;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        long jA = a(t52VarB, jMax, false, new boolean[this.i.length]);
        long j10 = this.f27067o;
        gw0 gw0Var2 = this.f27059f;
        long j11 = gw0Var2.f28013b;
        this.f27067o = (j11 - jA) + j10;
        if (jA != j11) {
            gw0Var2 = new gw0(gw0Var2.f28012a, jA, gw0Var2.f28014c, gw0Var2.f28015d, gw0Var2.f28016e, gw0Var2.f28017f, gw0Var2.f28018g, gw0Var2.f28019h, gw0Var2.i);
        }
        this.f27059f = gw0Var2;
    }

    public final void a(ew0 ew0Var) {
        if (ew0Var == this.f27064l) {
            return;
        }
        a();
        this.f27064l = ew0Var;
        if (ew0Var != null) {
            return;
        }
        int i = 0;
        while (true) {
            t52 t52Var = this.f27066n;
            if (i >= t52Var.f33450a) {
                return;
            }
            boolean zA = t52Var.a(i);
            c70 c70Var = this.f27066n.f33452c[i];
            if (zA && c70Var != null) {
                c70Var.d();
            }
            i++;
        }
    }
}
