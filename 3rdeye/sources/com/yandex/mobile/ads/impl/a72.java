package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class a72 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f24456d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24457e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24458f;

    /* renamed from: a, reason: collision with root package name */
    private final int f24453a = 112800;

    /* renamed from: b, reason: collision with root package name */
    private final c52 f24454b = new c52(0);

    /* renamed from: g, reason: collision with root package name */
    private long f24459g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f24460h = -9223372036854775807L;
    private long i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f24455c = new uf1();

    public final long a() {
        return this.i;
    }

    public final c52 b() {
        return this.f24454b;
    }

    public final boolean c() {
        return this.f24456d;
    }

    public final int a(rz rzVar, jj1 jj1Var, int i) throws IOException {
        if (i <= 0) {
            this.f24455c.a(s82.f32904f);
            this.f24456d = true;
            rzVar.c();
            return 0;
        }
        long j4 = -9223372036854775807L;
        if (!this.f24458f) {
            long jB = rzVar.b();
            int iMin = (int) Math.min(this.f24453a, jB);
            long j10 = jB - iMin;
            if (rzVar.a() != j10) {
                jj1Var.f29169a = j10;
                return 1;
            }
            this.f24455c.c(iMin);
            rzVar.c();
            rzVar.b(this.f24455c.c(), 0, iMin, false);
            uf1 uf1Var = this.f24455c;
            int iD = uf1Var.d();
            int iE = uf1Var.e();
            int i10 = iE - 188;
            while (true) {
                if (i10 < iD) {
                    break;
                }
                byte[] bArrC = uf1Var.c();
                int i11 = -4;
                int i12 = 0;
                while (true) {
                    if (i11 > 4) {
                        break;
                    }
                    int i13 = (i11 * 188) + i10;
                    if (i13 < iD || i13 >= iE || bArrC[i13] != 71) {
                        i12 = 0;
                    } else {
                        i12++;
                        if (i12 == 5) {
                            long jA = d72.a(i10, i, uf1Var);
                            if (jA != -9223372036854775807L) {
                                j4 = jA;
                                break;
                            }
                        }
                    }
                    i11++;
                }
                i10--;
            }
            this.f24460h = j4;
            this.f24458f = true;
            return 0;
        }
        if (this.f24460h == -9223372036854775807L) {
            this.f24455c.a(s82.f32904f);
            this.f24456d = true;
            rzVar.c();
            return 0;
        }
        if (this.f24457e) {
            long j11 = this.f24459g;
            if (j11 == -9223372036854775807L) {
                this.f24455c.a(s82.f32904f);
                this.f24456d = true;
                rzVar.c();
                return 0;
            }
            long jB2 = this.f24454b.b(this.f24460h) - this.f24454b.b(j11);
            this.i = jB2;
            if (jB2 < 0) {
                rs0.d("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
                this.i = -9223372036854775807L;
            }
            this.f24455c.a(s82.f32904f);
            this.f24456d = true;
            rzVar.c();
            return 0;
        }
        int iMin2 = (int) Math.min(this.f24453a, rzVar.b());
        long j12 = 0;
        if (rzVar.a() != j12) {
            jj1Var.f29169a = j12;
            return 1;
        }
        this.f24455c.c(iMin2);
        rzVar.c();
        rzVar.b(this.f24455c.c(), 0, iMin2, false);
        uf1 uf1Var2 = this.f24455c;
        int iD2 = uf1Var2.d();
        int iE2 = uf1Var2.e();
        while (true) {
            if (iD2 >= iE2) {
                break;
            }
            if (uf1Var2.c()[iD2] == 71) {
                long jA2 = d72.a(iD2, i, uf1Var2);
                if (jA2 != -9223372036854775807L) {
                    j4 = jA2;
                    break;
                }
            }
            iD2++;
        }
        this.f24459g = j4;
        this.f24457e = true;
        return 0;
    }
}
