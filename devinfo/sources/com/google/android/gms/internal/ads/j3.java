package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j3 implements x1 {

    /* renamed from: d, reason: collision with root package name */
    public z1 f12599d;

    /* renamed from: e, reason: collision with root package name */
    public u2 f12600e;
    public v8 g;

    /* renamed from: h, reason: collision with root package name */
    public e2 f12602h;

    /* renamed from: i, reason: collision with root package name */
    public int f12603i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public i3 f12604k;

    /* renamed from: l, reason: collision with root package name */
    public int f12605l;

    /* renamed from: m, reason: collision with root package name */
    public long f12606m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12596a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f12597b = new sk0(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final c2 f12598c = new c2();

    /* renamed from: f, reason: collision with root package name */
    public int f12601f = 0;

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        v8 v8VarA = new ix0(3).a(y1Var, w5.f17901o, 0);
        if (v8VarA != null) {
            int length = v8VarA.f17554a.length;
        }
        sk0 sk0Var = new sk0(4);
        ((t1) y1Var).O1(sk0Var.f16446a, 0, 4, false);
        return sk0Var.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f12599d = z1Var;
        this.f12600e = z1Var.m(0, 1);
        z1Var.i();
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        if (j == 0) {
            this.f12601f = 0;
        } else {
            i3 i3Var = this.f12604k;
            if (i3Var != null) {
                i3Var.a(j8);
            }
        }
        this.f12606m = j8 != 0 ? -1L : 0L;
        this.f12605l = 0;
        this.f12597b.y(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) throws EOFException, InterruptedIOException, ua {
        e2 e2Var;
        int i4;
        m2 d2Var;
        long j;
        fk0 fk0Var;
        long j8;
        long j9;
        boolean zJ;
        long jO;
        long j10;
        int i10 = this.f12601f;
        int i11 = 3;
        v8 v8Var = null;
        if (i10 == 0) {
            ((t1) y1Var).f16638f = 0;
            t1 t1Var = (t1) y1Var;
            long jF1 = t1Var.F1();
            v8 v8VarA = new ix0(3).a(y1Var, null, 0);
            if (v8VarA != null && v8VarA.f17554a.length != 0) {
                v8Var = v8VarA;
            }
            t1Var.c((int) (t1Var.F1() - jF1), false);
            this.g = v8Var;
            this.f12601f = 1;
            return 0;
        }
        byte[] bArr = this.f12596a;
        if (i10 == 1) {
            ((t1) y1Var).O1(bArr, 0, 42, false);
            ((t1) y1Var).f16638f = 0;
            this.f12601f = 2;
            return 0;
        }
        if (i10 == 2) {
            sk0 sk0Var = new sk0(4);
            ((t1) y1Var).N1(sk0Var.f16446a, 0, 4, false);
            if (sk0Var.P() != 1716281667) {
                throw ua.a(null, "Failed to read FLAC stream marker.");
            }
            this.f12601f = 3;
            return 0;
        }
        if (i10 != 3) {
            long j11 = 0;
            if (i10 == 4) {
                ((t1) y1Var).f16638f = 0;
                sk0 sk0Var2 = new sk0(2);
                t1 t1Var2 = (t1) y1Var;
                t1Var2.O1(sk0Var2.f16446a, 0, 2, false);
                int iL = sk0Var2.L();
                if ((iL >> 2) != 16382) {
                    t1Var2.f16638f = 0;
                    throw ua.a(null, "First frame does not start with sync code.");
                }
                t1Var2.f16638f = 0;
                this.j = iL;
                z1 z1Var = this.f12599d;
                String str = bq0.f9768a;
                long j12 = t1Var2.f16636d;
                long j13 = t1Var2.f16635c;
                e2 e2Var2 = this.f12602h;
                e2Var2.getClass();
                rt rtVar = e2Var2.f10676k;
                if (rtVar != null && ((long[]) rtVar.f15753b).length > 0) {
                    d2Var = new d2(e2Var2, j12, 0);
                    i4 = 0;
                } else if (j13 == -1 || e2Var2.j <= 0) {
                    i4 = 0;
                    d2Var = new d2(e2Var2.a(), 0L);
                } else {
                    int i12 = this.j;
                    int i13 = e2Var2.f10670c;
                    fk0 fk0Var2 = new fk0(3, e2Var2);
                    oa oaVar = new oa(e2Var2, i12);
                    long jA = e2Var2.a();
                    long j14 = e2Var2.j;
                    int i14 = e2Var2.f10671d;
                    if (i14 > 0) {
                        i4 = 0;
                        j = j13;
                        j8 = ((i14 + i13) / 2) + 1;
                        fk0Var = fk0Var2;
                    } else {
                        i4 = 0;
                        j = j13;
                        int i15 = e2Var2.f10668a;
                        long j15 = 4096;
                        if (i15 == e2Var2.f10669b && i15 > 0) {
                            j15 = i15;
                        }
                        fk0Var = fk0Var2;
                        j8 = (((j15 * e2Var2.g) * e2Var2.f10674h) / 8) + 64;
                    }
                    i3 i3Var = new i3(fk0Var, oaVar, jA, j14, j12, j, j8, Math.max(6, i13));
                    this.f12604k = i3Var;
                    d2Var = i3Var.f12129a;
                }
                z1Var.o(d2Var);
                this.f12601f = 5;
                return i4;
            }
            this.f12600e.getClass();
            e2 e2Var3 = this.f12602h;
            e2Var3.getClass();
            i3 i3Var2 = this.f12604k;
            if (i3Var2 != null && i3Var2.f12131c != null) {
                return i3Var2.b(y1Var, c2Var);
            }
            if (this.f12606m == -1) {
                ((t1) y1Var).f16638f = 0;
                t1 t1Var3 = (t1) y1Var;
                t1Var3.e(1, false);
                byte[] bArr2 = new byte[1];
                t1Var3.O1(bArr2, 0, 1, false);
                int i16 = bArr2[0] & 1;
                boolean z3 = 1 == i16;
                t1Var3.e(2, false);
                i = 1 != i16 ? 6 : 7;
                sk0 sk0Var3 = new sk0(i);
                byte[] bArr3 = sk0Var3.f16446a;
                int i17 = 0;
                while (i17 < i) {
                    int iP1 = t1Var3.P1(i17, i - i17, bArr3);
                    if (iP1 == -1) {
                        break;
                    }
                    i17 += iP1;
                }
                sk0Var3.C(i17);
                t1Var3.f16638f = 0;
                try {
                    jO = sk0Var3.o();
                    if (!z3) {
                        jO *= e2Var3.f10669b;
                    }
                    j10 = e2Var3.j;
                } catch (NumberFormatException unused) {
                }
                if (j10 == 0 || jO <= j10) {
                    j11 = jO;
                } else {
                    z = false;
                }
                if (!z) {
                    throw ua.a(null, null);
                }
                this.f12606m = j11;
            } else {
                sk0 sk0Var4 = this.f12597b;
                int i18 = sk0Var4.f16448c;
                if (i18 < 32768) {
                    int iD = ((t1) y1Var).d(i18, 32768 - i18, sk0Var4.f16446a);
                    z = iD == -1;
                    if (!z) {
                        sk0Var4.C(i18 + iD);
                    } else if (sk0Var4.B() == 0) {
                        long j16 = this.f12606m * 1000000;
                        e2 e2Var4 = this.f12602h;
                        String str2 = bq0.f9768a;
                        this.f12600e.d(j16 / e2Var4.f10672e, 1, this.f12605l, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i19 = sk0Var4.f16447b;
                int i20 = this.f12605l;
                int i21 = this.f12603i;
                if (i20 < i21) {
                    sk0Var4.G(Math.min(i21 - i20, sk0Var4.B()));
                }
                this.f12602h.getClass();
                int i22 = sk0Var4.f16447b;
                while (true) {
                    int i23 = sk0Var4.f16448c - 16;
                    c2 c2Var2 = this.f12598c;
                    if (i22 <= i23) {
                        sk0Var4.E(i22);
                        if (ls.j(sk0Var4, this.f12602h, this.j, c2Var2)) {
                            sk0Var4.E(i22);
                            j9 = c2Var2.f9923a;
                            break;
                        }
                        i22++;
                    } else {
                        if (z) {
                            while (true) {
                                int i24 = sk0Var4.f16448c;
                                if (i22 > i24 - this.f12603i) {
                                    sk0Var4.E(i24);
                                    break;
                                }
                                sk0Var4.E(i22);
                                try {
                                    zJ = ls.j(sk0Var4, this.f12602h, this.j, c2Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zJ = false;
                                }
                                if (sk0Var4.f16447b <= sk0Var4.f16448c && zJ) {
                                    sk0Var4.E(i22);
                                    j9 = c2Var2.f9923a;
                                    break;
                                }
                                i22++;
                            }
                        } else {
                            sk0Var4.E(i22);
                        }
                        j9 = -1;
                    }
                }
                int i25 = sk0Var4.f16447b - i19;
                sk0Var4.E(i19);
                this.f12600e.b(i25, sk0Var4);
                int i26 = this.f12605l + i25;
                this.f12605l = i26;
                if (j9 != -1) {
                    long j17 = this.f12606m * 1000000;
                    e2 e2Var5 = this.f12602h;
                    String str3 = bq0.f9768a;
                    this.f12600e.d(j17 / e2Var5.f10672e, 1, i26, 0, null);
                    this.f12605l = 0;
                    this.f12606m = j9;
                }
                int length = sk0Var4.f16446a.length - sk0Var4.f16448c;
                if (sk0Var4.B() < 16 && length < 16) {
                    int iB = sk0Var4.B();
                    byte[] bArr4 = sk0Var4.f16446a;
                    System.arraycopy(bArr4, sk0Var4.f16447b, bArr4, 0, iB);
                    sk0Var4.E(0);
                    sk0Var4.C(iB);
                }
            }
            return 0;
        }
        ?? r15 = 0;
        e2 e2Var6 = this.f12602h;
        while (true) {
            ((t1) y1Var).f16638f = r15;
            byte[] bArr5 = new byte[4];
            hk0 hk0Var = new hk0(bArr5, 4);
            t1 t1Var4 = (t1) y1Var;
            t1Var4.O1(bArr5, r15, 4, r15);
            boolean zG = hk0Var.g();
            int iH = hk0Var.h(i);
            int iH2 = hk0Var.h(24) + 4;
            if (iH == 0) {
                byte[] bArr6 = new byte[38];
                t1Var4.N1(bArr6, r15, 38, r15);
                e2Var6 = new e2(bArr6, 4);
            } else {
                if (e2Var6 == null) {
                    throw new IllegalArgumentException();
                }
                v8 v8Var2 = e2Var6.f10677l;
                if (iH == i11) {
                    sk0 sk0Var5 = new sk0(iH2);
                    t1Var4.N1(sk0Var5.f16446a, r15, iH2, r15);
                    e2Var = new e2(e2Var6.f10668a, e2Var6.f10669b, e2Var6.f10670c, e2Var6.f10671d, e2Var6.f10672e, e2Var6.g, e2Var6.f10674h, e2Var6.j, jz.n(sk0Var5), e2Var6.f10677l);
                } else if (iH == 4) {
                    sk0 sk0Var6 = new sk0(iH2);
                    t1Var4.N1(sk0Var6.f16446a, 0, iH2, false);
                    sk0Var6.G(4);
                    v8 v8VarQ = nn1.q(Arrays.asList((String[]) nn1.j(sk0Var6, false, false).f14041b));
                    if (v8Var2 != null) {
                        v8VarQ = v8Var2.b(v8VarQ);
                    }
                    e2Var = new e2(e2Var6.f10668a, e2Var6.f10669b, e2Var6.f10670c, e2Var6.f10671d, e2Var6.f10672e, e2Var6.g, e2Var6.f10674h, e2Var6.j, e2Var6.f10676k, v8VarQ);
                } else if (iH == 6) {
                    sk0 sk0Var7 = new sk0(iH2);
                    t1Var4.N1(sk0Var7.f16446a, 0, iH2, false);
                    sk0Var7.G(4);
                    v8 v8Var3 = new v8(x41.l(x3.b(sk0Var7)));
                    if (v8Var2 != null) {
                        v8Var3 = v8Var2.b(v8Var3);
                    }
                    e2Var = new e2(e2Var6.f10668a, e2Var6.f10669b, e2Var6.f10670c, e2Var6.f10671d, e2Var6.f10672e, e2Var6.g, e2Var6.f10674h, e2Var6.j, e2Var6.f10676k, v8Var3);
                } else {
                    t1Var4.c(iH2, false);
                }
                e2Var6 = e2Var;
            }
            String str4 = bq0.f9768a;
            this.f12602h = e2Var6;
            if (zG) {
                this.f12603i = Math.max(e2Var6.f10670c, 6);
                mx1 mx1VarB = this.f12602h.b(bArr, this.g);
                u2 u2Var = this.f12600e;
                lw1 lw1Var = new lw1(mx1VarB);
                lw1Var.d("audio/flac");
                u2Var.f(new mx1(lw1Var));
                u2 u2Var2 = this.f12600e;
                this.f12602h.a();
                u2Var2.getClass();
                this.f12601f = 4;
                return 0;
            }
            r15 = 0;
            i11 = 3;
            i = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
