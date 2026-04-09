package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.qb0;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pb0 implements u70 {

    /* renamed from: e, reason: collision with root package name */
    private w70 f31704e;

    /* renamed from: f, reason: collision with root package name */
    private n52 f31705f;

    /* renamed from: h, reason: collision with root package name */
    private yz0 f31707h;
    private ub0 i;

    /* renamed from: j, reason: collision with root package name */
    private int f31708j;

    /* renamed from: k, reason: collision with root package name */
    private int f31709k;

    /* renamed from: l, reason: collision with root package name */
    private ob0 f31710l;

    /* renamed from: m, reason: collision with root package name */
    private int f31711m;

    /* renamed from: n, reason: collision with root package name */
    private long f31712n;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31700a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f31701b = new uf1(0, new byte[Constants.QUEUE_ELEMENT_MAX_SIZE]);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31702c = false;

    /* renamed from: d, reason: collision with root package name */
    private final qb0.a f31703d = new qb0.a();

    /* renamed from: g, reason: collision with root package name */
    private int f31706g = 0;

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f31704e = w70Var;
        this.f31705f = w70Var.a(0, 1);
        w70Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        boolean zF;
        tw1 bVar;
        boolean z10;
        long j4;
        boolean zA;
        boolean z11 = true;
        int i = this.f31706g;
        yz0 yz0Var = null;
        if (i == 0) {
            boolean z12 = this.f31702c;
            rz rzVar = (rz) v70Var;
            rzVar.c();
            long jD = rzVar.d();
            yz0 yz0VarA = new fi0().a(rzVar, !z12 ? null : di0.f26184b);
            if (yz0VarA != null && yz0VarA.c() != 0) {
                yz0Var = yz0VarA;
            }
            rzVar.a((int) (rzVar.d() - jD));
            this.f31707h = yz0Var;
            this.f31706g = 1;
            return 0;
        }
        if (i == 1) {
            byte[] bArr = this.f31700a;
            rz rzVar2 = (rz) v70Var;
            rzVar2.b(bArr, 0, bArr.length, false);
            rzVar2.c();
            this.f31706g = 2;
            return 0;
        }
        if (i == 2) {
            uf1 uf1Var = new uf1(4);
            ((rz) v70Var).a(uf1Var.c(), 0, 4, false);
            if (uf1Var.v() == 1716281667) {
                this.f31706g = 3;
                return 0;
            }
            throw yf1.a("Failed to read FLAC stream marker.", (Exception) null);
        }
        if (i == 3) {
            ub0 ub0VarA = this.i;
            do {
                rz rzVar3 = (rz) v70Var;
                rzVar3.c();
                byte[] bArr2 = new byte[4];
                tf1 tf1Var = new tf1(4, bArr2);
                rzVar3.b(bArr2, 0, 4, false);
                zF = tf1Var.f();
                int iB = tf1Var.b(7);
                int iB2 = tf1Var.b(24) + 4;
                if (iB == 0) {
                    byte[] bArr3 = new byte[38];
                    rzVar3.a(bArr3, 0, 38, false);
                    ub0VarA = new ub0(4, bArr3);
                } else {
                    if (ub0VarA == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iB == 3) {
                        uf1 uf1Var2 = new uf1(iB2);
                        rzVar3.a(uf1Var2.c(), 0, iB2, false);
                        ub0VarA = ub0VarA.a(rb0.a(uf1Var2));
                    } else if (iB == 4) {
                        uf1 uf1Var3 = new uf1(iB2);
                        rzVar3.a(uf1Var3.c(), 0, iB2, false);
                        uf1Var3.f(4);
                        ub0VarA = ub0VarA.b(Arrays.asList(ti2.a(uf1Var3, false, false).f33626a));
                    } else if (iB == 6) {
                        uf1 uf1Var4 = new uf1(iB2);
                        rzVar3.a(uf1Var4.c(), 0, iB2, false);
                        uf1Var4.f(4);
                        int iH = uf1Var4.h();
                        String strA = uf1Var4.a(uf1Var4.h(), fo.f27408a);
                        String strA2 = uf1Var4.a(uf1Var4.h(), fo.f27410c);
                        int iH2 = uf1Var4.h();
                        int iH3 = uf1Var4.h();
                        int iH4 = uf1Var4.h();
                        int iH5 = uf1Var4.h();
                        int iH6 = uf1Var4.h();
                        byte[] bArr4 = new byte[iH6];
                        uf1Var4.a(bArr4, 0, iH6);
                        ub0VarA = ub0VarA.a(xj0.a(new dh1(iH, strA, strA2, iH2, iH3, iH4, iH5, bArr4)));
                    } else {
                        rzVar3.a(iB2);
                    }
                }
                int i10 = s82.f32899a;
                this.i = ub0VarA;
            } while (!zF);
            this.f31708j = Math.max(ub0VarA.f34007c, 6);
            this.f31705f.a(this.i.a(this.f31700a, this.f31707h));
            this.f31706g = 4;
            return 0;
        }
        long j10 = 0;
        if (i == 4) {
            rz rzVar4 = (rz) v70Var;
            rzVar4.c();
            uf1 uf1Var5 = new uf1(2);
            rzVar4.b(uf1Var5.c(), 0, 2, false);
            int iZ = uf1Var5.z();
            if ((iZ >> 2) == 16382) {
                rzVar4.c();
                this.f31709k = iZ;
                w70 w70Var = this.f31704e;
                int i11 = s82.f32899a;
                long jA = rzVar4.a();
                long jB = rzVar4.b();
                this.i.getClass();
                ub0 ub0Var = this.i;
                if (ub0Var.f34014k != null) {
                    bVar = new tb0(ub0Var, jA);
                } else if (jB != -1 && ub0Var.f34013j > 0) {
                    ob0 ob0Var = new ob0(ub0Var, this.f31709k, jA, jB);
                    this.f31710l = ob0Var;
                    bVar = ob0Var.a();
                } else {
                    bVar = new tw1.b(ub0Var.b(), 0L);
                }
                w70Var.a(bVar);
                this.f31706g = 5;
                return 0;
            }
            rzVar4.c();
            throw yf1.a("First frame does not start with sync code.", (Exception) null);
        }
        if (i == 5) {
            this.f31705f.getClass();
            this.i.getClass();
            ob0 ob0Var2 = this.f31710l;
            if (ob0Var2 != null && ob0Var2.b()) {
                return this.f31710l.a((rz) v70Var, jj1Var);
            }
            if (this.f31712n == -1) {
                ub0 ub0Var2 = this.i;
                rz rzVar5 = (rz) v70Var;
                rzVar5.c();
                rzVar5.a(false, 1);
                byte[] bArr5 = new byte[1];
                rzVar5.b(bArr5, 0, 1, false);
                boolean z13 = (bArr5[0] & 1) == 1;
                rzVar5.a(false, 2);
                int i12 = z13 ? 7 : 6;
                uf1 uf1Var6 = new uf1(i12);
                byte[] bArrC = uf1Var6.c();
                int i13 = 0;
                while (i13 < i12) {
                    int iC = rzVar5.c(bArrC, i13, i12 - i13);
                    if (iC == -1) {
                        break;
                    }
                    i13 += iC;
                }
                uf1Var6.d(i13);
                rzVar5.c();
                try {
                    long jA2 = uf1Var6.A();
                    if (!z13) {
                        jA2 *= ub0Var2.f34006b;
                    }
                    j10 = jA2;
                } catch (NumberFormatException unused) {
                    z11 = false;
                }
                if (z11) {
                    this.f31712n = j10;
                } else {
                    throw yf1.a((String) null, (Exception) null);
                }
            } else {
                int iE = this.f31701b.e();
                if (iE < 32768) {
                    int i14 = ((rz) v70Var).read(this.f31701b.c(), iE, Constants.QUEUE_ELEMENT_MAX_SIZE - iE);
                    z10 = i14 == -1;
                    if (!z10) {
                        this.f31701b.d(iE + i14);
                    } else if (this.f31701b.a() == 0) {
                        long j11 = this.f31712n * 1000000;
                        ub0 ub0Var3 = this.i;
                        int i15 = s82.f32899a;
                        this.f31705f.a(j11 / ub0Var3.f34009e, 1, this.f31711m, 0, null);
                        return -1;
                    }
                } else {
                    z10 = false;
                }
                int iD = this.f31701b.d();
                int i16 = this.f31711m;
                int i17 = this.f31708j;
                if (i16 < i17) {
                    uf1 uf1Var7 = this.f31701b;
                    uf1Var7.f(Math.min(i17 - i16, uf1Var7.a()));
                }
                uf1 uf1Var8 = this.f31701b;
                this.i.getClass();
                int iD2 = uf1Var8.d();
                while (true) {
                    if (iD2 <= uf1Var8.e() - 16) {
                        uf1Var8.e(iD2);
                        if (qb0.a(uf1Var8, this.i, this.f31709k, this.f31703d)) {
                            uf1Var8.e(iD2);
                            j4 = this.f31703d.f32127a;
                            break;
                        }
                        iD2++;
                    } else {
                        if (z10) {
                            while (iD2 <= uf1Var8.e() - this.f31708j) {
                                uf1Var8.e(iD2);
                                try {
                                    zA = qb0.a(uf1Var8, this.i, this.f31709k, this.f31703d);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (uf1Var8.d() <= uf1Var8.e() && zA) {
                                    uf1Var8.e(iD2);
                                    j4 = this.f31703d.f32127a;
                                    break;
                                }
                                iD2++;
                            }
                            uf1Var8.e(uf1Var8.e());
                        } else {
                            uf1Var8.e(iD2);
                        }
                        j4 = -1;
                    }
                }
                int iD3 = this.f31701b.d() - iD;
                this.f31701b.e(iD);
                this.f31705f.a(iD3, this.f31701b);
                int i18 = this.f31711m + iD3;
                this.f31711m = i18;
                if (j4 != -1) {
                    long j12 = this.f31712n * 1000000;
                    ub0 ub0Var4 = this.i;
                    int i19 = s82.f32899a;
                    this.f31705f.a(j12 / ub0Var4.f34009e, 1, i18, 0, null);
                    this.f31711m = 0;
                    this.f31712n = j4;
                }
                if (this.f31701b.a() < 16) {
                    int iA = this.f31701b.a();
                    System.arraycopy(this.f31701b.c(), this.f31701b.d(), this.f31701b.c(), 0, iA);
                    this.f31701b.e(0);
                    this.f31701b.d(iA);
                }
            }
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        if (j4 == 0) {
            this.f31706g = 0;
        } else {
            ob0 ob0Var = this.f31710l;
            if (ob0Var != null) {
                ob0Var.a(j10);
            }
        }
        this.f31712n = j10 != 0 ? -1L : 0L;
        this.f31711m = 0;
        this.f31701b.c(0);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar = (rz) v70Var;
        yz0 yz0VarA = new fi0().a(rzVar, di0.f26184b);
        if (yz0VarA != null) {
            yz0VarA.c();
        }
        uf1 uf1Var = new uf1(4);
        rzVar.b(uf1Var.c(), 0, 4, false);
        return uf1Var.v() == 1716281667;
    }

    private static u70[] a() {
        return new u70[]{new pb0()};
    }
}
