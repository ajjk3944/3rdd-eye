package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class w5 extends b {
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final IntFunction f26799k;

    /* renamed from: l, reason: collision with root package name */
    public final long f26800l;

    /* renamed from: m, reason: collision with root package name */
    public final long f26801m;

    /* renamed from: n, reason: collision with root package name */
    public long f26802n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f26803o;

    @Override // j$.util.stream.b
    public final void f() {
        this.f26503i = true;
        if (this.f26803o) {
            d(v3.g0(this.j.D0()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        w5 w5Var;
        e2 e2VarG0;
        d dVar = this.f26545d;
        if (dVar != null) {
            this.f26802n = ((w5) dVar).f26802n + ((w5) this.f26546e).f26802n;
            if (this.f26503i) {
                this.f26802n = 0L;
                e2VarG0 = v3.g0(this.j.D0());
            } else {
                e2VarG0 = this.f26802n == 0 ? v3.g0(this.j.D0()) : ((w5) this.f26545d).f26802n == 0 ? (e2) ((w5) this.f26546e).i() : v3.c0(this.j.D0(), (e2) ((w5) this.f26545d).i(), (e2) ((w5) this.f26546e).i());
            }
            e2 e2VarJ = e2VarG0;
            if (b()) {
                e2VarJ = e2VarJ.j(this.f26800l, this.f26801m >= 0 ? Math.min(e2VarJ.count(), this.f26800l + this.f26801m) : this.f26802n, this.f26799k);
            }
            d(e2VarJ);
            this.f26803o = true;
        }
        if (this.f26801m >= 0 && !b()) {
            long j = this.f26800l + this.f26801m;
            long j8 = this.f26803o ? this.f26802n : j(j);
            if (j8 >= j) {
                g();
            } else {
                w5 w5Var2 = (w5) ((d) getCompleter());
                w5 w5Var3 = this;
                while (true) {
                    if (w5Var2 == null) {
                        if (j8 >= j) {
                            break;
                        }
                    } else {
                        if (w5Var3 == w5Var2.f26546e && (w5Var = (w5) w5Var2.f26545d) != null) {
                            long j9 = w5Var.j(j) + j8;
                            if (j9 >= j) {
                                break;
                            } else {
                                j8 = j9;
                            }
                        }
                        w5Var3 = w5Var2;
                        w5Var2 = (w5) ((d) w5Var2.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public w5(a aVar, v3 v3Var, Spliterator spliterator, IntFunction intFunction, long j, long j8) {
        super(v3Var, spliterator);
        this.j = aVar;
        this.f26799k = intFunction;
        this.f26800l = j;
        this.f26801m = j8;
    }

    public w5(w5 w5Var, Spliterator spliterator) {
        super(w5Var, spliterator);
        this.j = w5Var.j;
        this.f26799k = w5Var.f26799k;
        this.f26800l = w5Var.f26800l;
        this.f26801m = w5Var.f26801m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new w5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.g0(this.j.D0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            a7 a7Var = a7.SIZED;
            a aVar = this.j;
            int i4 = aVar.j;
            int i10 = a7Var.f26499e;
            w1 w1VarT0 = this.j.t0((i4 & i10) == i10 ? aVar.i0(this.f26543b) : -1L, this.f26799k);
            m5 m5VarH0 = this.j.H0(((a) this.f26542a).f26462m, w1VarT0);
            v3 v3Var = this.f26542a;
            v3Var.e0(this.f26543b, v3Var.x0(m5VarH0));
            return w1VarT0.build();
        }
        w1 w1VarT02 = this.j.t0(-1L, this.f26799k);
        if (this.f26800l == 0) {
            m5 m5VarH02 = this.j.H0(((a) this.f26542a).f26462m, w1VarT02);
            v3 v3Var2 = this.f26542a;
            v3Var2.e0(this.f26543b, v3Var2.x0(m5VarH02));
        } else {
            this.f26542a.w0(this.f26543b, w1VarT02);
        }
        e2 e2VarBuild = w1VarT02.build();
        this.f26802n = e2VarBuild.count();
        this.f26803o = true;
        this.f26543b = null;
        return e2VarBuild;
    }

    public final long j(long j) {
        if (this.f26803o) {
            return this.f26802n;
        }
        w5 w5Var = (w5) this.f26545d;
        w5 w5Var2 = (w5) this.f26546e;
        if (w5Var == null || w5Var2 == null) {
            return this.f26802n;
        }
        long j8 = w5Var.j(j);
        return j8 >= j ? j8 : w5Var2.j(j) + j8;
    }
}
