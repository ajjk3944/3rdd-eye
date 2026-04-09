package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sb0;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;

/* loaded from: classes3.dex */
abstract class m22 {

    /* renamed from: b, reason: collision with root package name */
    private n52 f30170b;

    /* renamed from: c, reason: collision with root package name */
    private w70 f30171c;

    /* renamed from: d, reason: collision with root package name */
    private td1 f30172d;

    /* renamed from: e, reason: collision with root package name */
    private long f30173e;

    /* renamed from: f, reason: collision with root package name */
    private long f30174f;

    /* renamed from: g, reason: collision with root package name */
    private long f30175g;

    /* renamed from: h, reason: collision with root package name */
    private int f30176h;
    private int i;

    /* renamed from: k, reason: collision with root package name */
    private long f30178k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30179l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30180m;

    /* renamed from: a, reason: collision with root package name */
    private final rd1 f30169a = new rd1();

    /* renamed from: j, reason: collision with root package name */
    private a f30177j = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        dc0 f30181a;

        /* renamed from: b, reason: collision with root package name */
        sb0.a f30182b;
    }

    public static final class b implements td1 {
        public /* synthetic */ b(int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final long a(rz rzVar) {
            return -1L;
        }

        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final void a(long j4) {
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final tw1 a() {
            return new tw1.b(-9223372036854775807L, 0L);
        }
    }

    public final long a(long j4) {
        return (j4 * 1000000) / this.i;
    }

    public abstract long a(uf1 uf1Var);

    public abstract boolean a(uf1 uf1Var, long j4, a aVar) throws IOException;

    public final long b(long j4) {
        return (this.i * j4) / 1000000;
    }

    public void c(long j4) {
        this.f30175g = j4;
    }

    public final void a(w70 w70Var, n52 n52Var) {
        this.f30171c = w70Var;
        this.f30170b = n52Var;
        a(true);
    }

    public final int a(rz rzVar, jj1 jj1Var) throws IOException {
        if (this.f30170b != null) {
            int i = s82.f32899a;
            int i10 = this.f30176h;
            int i11 = 0;
            if (i10 == 0) {
                while (this.f30169a.a(rzVar)) {
                    this.f30178k = rzVar.a() - this.f30174f;
                    if (a(this.f30169a.b(), this.f30174f, this.f30177j)) {
                        this.f30174f = rzVar.a();
                    } else {
                        dc0 dc0Var = this.f30177j.f30181a;
                        this.i = dc0Var.f26066A;
                        if (!this.f30180m) {
                            this.f30170b.a(dc0Var);
                            this.f30180m = true;
                        }
                        sb0.a aVar = this.f30177j.f30182b;
                        if (aVar != null) {
                            this.f30172d = aVar;
                        } else if (rzVar.b() == -1) {
                            this.f30172d = new b(i11);
                        } else {
                            sd1 sd1VarA = this.f30169a.a();
                            this.f30172d = new e00(this, this.f30174f, rzVar.b(), sd1VarA.f32942d + sd1VarA.f32943e, sd1VarA.f32940b, (sd1VarA.f32939a & 4) != 0);
                        }
                        this.f30176h = 2;
                        this.f30169a.d();
                        return 0;
                    }
                }
                this.f30176h = 3;
                return -1;
            }
            if (i10 == 1) {
                rzVar.a((int) this.f30174f);
                this.f30176h = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jA = this.f30172d.a(rzVar);
            if (jA >= 0) {
                jj1Var.f29169a = jA;
                return 1;
            }
            if (jA < -1) {
                c(-(jA + 2));
            }
            if (!this.f30179l) {
                tw1 tw1VarA = this.f30172d.a();
                if (tw1VarA != null) {
                    this.f30171c.a(tw1VarA);
                    this.f30179l = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f30178k <= 0 && !this.f30169a.a(rzVar)) {
                this.f30176h = 3;
                return -1;
            }
            this.f30178k = 0L;
            uf1 uf1VarB = this.f30169a.b();
            long jA2 = a(uf1VarB);
            if (jA2 >= 0) {
                long j4 = this.f30175g;
                if (j4 + jA2 >= this.f30173e) {
                    long jA3 = a(j4);
                    this.f30170b.a(uf1VarB.e(), uf1VarB);
                    this.f30170b.a(jA3, 1, uf1VarB.e(), 0, null);
                    this.f30173e = -1L;
                }
            }
            this.f30175g += jA2;
            return 0;
        }
        throw new IllegalStateException();
    }

    public void a(boolean z10) {
        if (z10) {
            this.f30177j = new a();
            this.f30174f = 0L;
            this.f30176h = 0;
        } else {
            this.f30176h = 1;
        }
        this.f30173e = -1L;
        this.f30175g = 0L;
    }

    public final void a(long j4, long j10) {
        this.f30169a.c();
        if (j4 == 0) {
            a(!this.f30179l);
            return;
        }
        if (this.f30176h != 0) {
            long jB = b(j10);
            this.f30173e = jB;
            td1 td1Var = this.f30172d;
            int i = s82.f32899a;
            td1Var.a(jB);
            this.f30176h = 2;
        }
    }
}
