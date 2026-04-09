package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class rm1 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f32708c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32709d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32710e;

    /* renamed from: a, reason: collision with root package name */
    private final c52 f32706a = new c52(0);

    /* renamed from: f, reason: collision with root package name */
    private long f32711f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f32712g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f32713h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f32707b = new uf1();

    public final long a() {
        return this.f32713h;
    }

    public final c52 b() {
        return this.f32706a;
    }

    public final boolean c() {
        return this.f32708c;
    }

    public final int a(rz rzVar, jj1 jj1Var) throws IOException {
        long j4 = -9223372036854775807L;
        if (!this.f32710e) {
            long jB = rzVar.b();
            int iMin = (int) Math.min(20000L, jB);
            long j10 = jB - iMin;
            if (rzVar.a() != j10) {
                jj1Var.f29169a = j10;
                return 1;
            }
            this.f32707b.c(iMin);
            rzVar.c();
            rzVar.b(this.f32707b.c(), 0, iMin, false);
            uf1 uf1Var = this.f32707b;
            int iD = uf1Var.d();
            int iE = uf1Var.e() - 4;
            while (true) {
                if (iE < iD) {
                    break;
                }
                byte[] bArrC = uf1Var.c();
                if (((bArrC[iE + 3] & 255) | ((bArrC[iE] & 255) << 24) | ((bArrC[iE + 1] & 255) << 16) | ((bArrC[iE + 2] & 255) << 8)) == 442) {
                    uf1Var.e(iE + 4);
                    long jA = a(uf1Var);
                    if (jA != -9223372036854775807L) {
                        j4 = jA;
                        break;
                    }
                }
                iE--;
            }
            this.f32712g = j4;
            this.f32710e = true;
            return 0;
        }
        if (this.f32712g == -9223372036854775807L) {
            this.f32707b.a(s82.f32904f);
            this.f32708c = true;
            rzVar.c();
            return 0;
        }
        if (this.f32709d) {
            long j11 = this.f32711f;
            if (j11 == -9223372036854775807L) {
                this.f32707b.a(s82.f32904f);
                this.f32708c = true;
                rzVar.c();
                return 0;
            }
            long jB2 = this.f32706a.b(this.f32712g) - this.f32706a.b(j11);
            this.f32713h = jB2;
            if (jB2 < 0) {
                rs0.d("PsDurationReader", "Invalid duration: " + this.f32713h + ". Using TIME_UNSET instead.");
                this.f32713h = -9223372036854775807L;
            }
            this.f32707b.a(s82.f32904f);
            this.f32708c = true;
            rzVar.c();
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, rzVar.b());
        long j12 = 0;
        if (rzVar.a() != j12) {
            jj1Var.f29169a = j12;
            return 1;
        }
        this.f32707b.c(iMin2);
        rzVar.c();
        rzVar.b(this.f32707b.c(), 0, iMin2, false);
        uf1 uf1Var2 = this.f32707b;
        int iD2 = uf1Var2.d();
        int iE2 = uf1Var2.e();
        while (true) {
            if (iD2 >= iE2 - 3) {
                break;
            }
            byte[] bArrC2 = uf1Var2.c();
            int i = iD2 + 1;
            if (((bArrC2[iD2 + 3] & 255) | ((bArrC2[iD2] & 255) << 24) | ((bArrC2[i] & 255) << 16) | ((bArrC2[iD2 + 2] & 255) << 8)) == 442) {
                uf1Var2.e(iD2 + 4);
                long jA2 = a(uf1Var2);
                if (jA2 != -9223372036854775807L) {
                    j4 = jA2;
                    break;
                }
            }
            iD2 = i;
        }
        this.f32711f = j4;
        this.f32709d = true;
        return 0;
    }

    public static long a(uf1 uf1Var) {
        int iD = uf1Var.d();
        if (uf1Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uf1Var.a(bArr, 0, 9);
        uf1Var.e(iD);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j4 = b10;
                    long j10 = b11;
                    return ((j10 & 3) << 13) | ((j4 & 3) << 28) | (((56 & j4) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
