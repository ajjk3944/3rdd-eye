package q2;

import a0.g;
import android.os.Handler;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.internal.a0;
import d3.i;
import d3.k;
import i2.d1;
import i2.e0;
import i2.l1;
import i2.q;
import i2.u0;
import j2.g1;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f32147a;

    /* renamed from: b, reason: collision with root package name */
    public final e f32148b;

    /* renamed from: c, reason: collision with root package name */
    public final x.a0 f32149c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32150d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32151e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32152f;
    public g3.a g;

    /* renamed from: h, reason: collision with root package name */
    public long f32153h;

    /* renamed from: i, reason: collision with root package name */
    public final b2.b f32154i;
    public final o1.a j;

    public b() {
        a0 a0Var = new a0((char) 0, 8);
        a0Var.f9070c = new long[192];
        a0Var.f9071d = new long[192];
        this.f32147a = a0Var;
        this.f32148b = new e();
        this.f32149c = new x.a0();
        this.f32153h = -1L;
        this.f32154i = new b2.b(23, this);
        this.j = new o1.a();
    }

    public static long f(e0 e0Var) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
        d1 d1Var = (d1) a0Var.f19258e;
        long jC = 0;
        for (d1 d1Var2 = (q) a0Var.f19257d; d1Var2 != null && d1Var2 != d1Var; d1Var2 = d1Var2.f25612q) {
            l1 l1Var = d1Var2.L;
            if (l1Var != null && !z.o(((g1) l1Var).b())) {
                return 9223372034707292159L;
            }
            jC = i.c(jC, d1Var2.f25621z);
        }
        return jC;
    }

    public static void h(e0 e0Var) {
        if (e0Var.f25629c) {
            l1 l1Var = ((d1) e0Var.G.f19258e).L;
            if (l1Var == null || z.o(((g1) l1Var).b())) {
                e0Var.f25629c = false;
                if (e0Var.g) {
                    e0Var.f25632f = f(e0Var);
                    e0Var.g = false;
                }
                if (i.a(e0Var.f25632f, 9223372034707292159L)) {
                    return;
                }
                w0.e eVarZ = e0Var.z();
                Object[] objArr = eVarZ.f36397a;
                int i4 = eVarZ.f36399c;
                for (int i10 = 0; i10 < i4; i10++) {
                    h((e0) objArr[i10]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.a():void");
    }

    public final long b(e0 e0Var) {
        long j;
        int i4 = e0Var.f25628b & 33554431;
        a0 a0Var = this.f32147a;
        long[] jArr = (long[]) a0Var.f9070c;
        int i10 = a0Var.f9069b;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 33554431) == i4) {
                j = jArr[i11];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(i2.e0 r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.b.c(i2.e0):void");
    }

    public final void d(e0 e0Var) {
        if (e0Var.f25633h) {
            this.f32150d = true;
            int i4 = e0Var.f25628b & 33554431;
            a0 a0Var = this.f32147a;
            long[] jArr = (long[]) a0Var.f9070c;
            int i10 = a0Var.f9069b;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                long j = jArr[i12];
                if ((((int) j) & 33554431) == i4) {
                    jArr[i12] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i11 += 3;
            }
        }
        i();
    }

    public final void e(e0 e0Var, boolean z3) {
        long j;
        l1 l1Var;
        int i4;
        int i10;
        int i11;
        int i12;
        boolean zI = e0Var.I();
        com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
        if (zI) {
            e0 e0VarV = e0Var.v();
            if (e0VarV == null || e0VarV.f25629c) {
                j = e0VarV == null ? 0L : 9223372034707292159L;
            } else {
                if (e0VarV.g) {
                    e0VarV.g = false;
                    e0VarV.f25632f = f(e0VarV);
                }
                j = e0VarV.f25632f;
            }
            d1 d1Var = (d1) a0Var.f19258e;
            if (i.a(j, 9223372034707292159L) || !((l1Var = d1Var.L) == null || z.o(((g1) l1Var).b()))) {
                c(e0Var);
                return;
            }
            if (e0Var.f25629c) {
                c(e0Var);
                h(e0Var);
                return;
            }
            long jC = i.c(j, d1Var.f25621z);
            u0 u0Var = e0Var.H.f25687p;
            int iL = u0Var.L();
            int iK = u0Var.K();
            long j8 = (iL << 32) | (iK & 4294967295L);
            int i13 = e0Var.f25628b;
            boolean z10 = e0Var.f25633h;
            int i14 = 33554431;
            a0 a0Var2 = this.f32147a;
            if (!z10) {
                e0Var.f25633h = true;
                boolean zF = a0Var.f(Segment.SHARE_MINIMUM);
                boolean zF2 = a0Var.f(16);
                boolean zA = this.f32148b.f32168a.a(i13);
                if (e0VarV != null) {
                    int i15 = e0VarV.f25628b;
                    int i16 = (int) (jC >> 32);
                    int i17 = (int) (jC & 4294967295L);
                    byte b10 = 32;
                    int i18 = i13 & 33554431;
                    long[] jArr = (long[]) a0Var2.f9070c;
                    int i19 = a0Var2.f9069b;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= jArr.length - 2 || i20 >= i19) {
                            break;
                        }
                        byte b11 = b10;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i20 + 2]) & i14) == i15) {
                            long j9 = jArr2[i20];
                            int i21 = ((int) (j9 >> (b11 == true ? 1L : 0L))) + i16;
                            int i22 = ((int) j9) + i17;
                            a0Var2.g(i18, i21, i22, i21 + iL, i22 + iK, i15, zF, zF2, zA, i20);
                            break;
                        }
                        i20 += 3;
                        b10 = b11 == true ? 1 : 0;
                        jArr = jArr2;
                        i14 = i14;
                        i15 = i15;
                    }
                } else {
                    int i23 = (int) (jC >> 32);
                    int i24 = (int) (jC & 4294967295L);
                    a0Var2.g(i13, i23, i24, i23 + iL, i24 + iK, (512 & 32) != 0 ? -1 : 0, zF, zF2, zA, -1);
                }
                this.f32150d = true;
            } else if (z3 || !i.a(jC, e0Var.f25630d) || !k.a(j8, e0Var.f25631e)) {
                if (e0VarV != null) {
                    int i25 = e0VarV.f25628b;
                    int i26 = (int) (jC >> 32);
                    int i27 = (int) (jC & 4294967295L);
                    int i28 = i13 & 33554431;
                    long[] jArr3 = (long[]) a0Var2.f9070c;
                    int i29 = a0Var2.f9069b;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= jArr3.length - 2 || i30 >= i29) {
                            break;
                        }
                        int i31 = iL;
                        if ((((int) jArr3[i30 + 2]) & 33554431) == i25) {
                            long j10 = jArr3[i30];
                            i11 = i26;
                            i12 = i27;
                            int i32 = ((int) (j10 >> 32)) + i11;
                            int i33 = ((int) j10) + i12;
                            int i34 = i32 + i31;
                            int i35 = i33 + iK;
                            int i36 = i30 + 3;
                            i4 = i25;
                            while (i36 < jArr3.length - 2 && i36 < i29) {
                                int i37 = i36 + 2;
                                int i38 = i29;
                                long j11 = jArr3[i37];
                                int i39 = i36;
                                if ((((int) j11) & 33554431) == i28) {
                                    long j12 = jArr3[i39];
                                    int i40 = i32 - ((int) (j12 >> 32));
                                    int i41 = i33 - ((int) j12);
                                    jArr3[i39] = (i32 << 32) | (i33 & 4294967295L);
                                    jArr3[i39 + 1] = (i34 << 32) | (i35 & 4294967295L);
                                    jArr3[i37] = j11 | (((j11 >> 63) & 1) << 60);
                                    if (i40 != 0 || i41 != 0) {
                                        a0Var2.o(i40, i41, (j11 & a.f32145b) | (((i39 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i36 = i39 + 3;
                                    i29 = i38;
                                }
                            }
                            i10 = i29;
                            i30 = i36;
                        } else {
                            i4 = i25;
                            i10 = i29;
                            i11 = i26;
                            i12 = i27;
                        }
                        i30 += 3;
                        iL = i31;
                        i26 = i11;
                        i27 = i12;
                        i25 = i4;
                        i29 = i10;
                    }
                } else {
                    int i42 = (int) (jC >> 32);
                    int i43 = (int) (jC & 4294967295L);
                    int i44 = i42 + iL;
                    int i45 = i43 + iK;
                    int i46 = i13 & 33554431;
                    long[] jArr4 = (long[]) a0Var2.f9070c;
                    int i47 = a0Var2.f9069b;
                    int i48 = 0;
                    while (true) {
                        if (i48 >= jArr4.length - 2 || i48 >= i47) {
                            break;
                        }
                        int i49 = i48 + 2;
                        int i50 = i47;
                        int i51 = i48;
                        long j13 = jArr4[i49];
                        long[] jArr5 = jArr4;
                        if ((((int) j13) & 33554431) == i46) {
                            long j14 = jArr5[i51];
                            jArr5[i51] = (i42 << 32) | (i43 & 4294967295L);
                            jArr5[i51 + 1] = (i44 << 32) | (i45 & 4294967295L);
                            jArr5[i49] = j13 | (((j13 >> 63) & 1) << 60);
                            int i52 = i42 - ((int) (j14 >> 32));
                            int i53 = i43 - ((int) j14);
                            if ((i52 != 0) | (i53 != 0)) {
                                a0Var2.o(i52, i53, (j13 & a.f32145b) | (((i51 + 3) & 33554431) << 25));
                            }
                        } else {
                            i48 = i51 + 3;
                            i47 = i50;
                            jArr4 = jArr5;
                        }
                    }
                }
                this.f32150d = true;
            }
            e0Var.f25631e = j8;
            e0Var.f25630d = jC;
        }
    }

    public final void g(e0 e0Var) {
        if (e0Var.f25633h) {
            int i4 = e0Var.f25628b & 33554431;
            a0 a0Var = this.f32147a;
            long[] jArr = (long[]) a0Var.f9070c;
            int i10 = a0Var.f9069b;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                if ((((int) jArr[i12]) & 33554431) == i4) {
                    jArr[i11] = -1;
                    jArr[i11 + 1] = -1;
                    jArr[i12] = a.f32146c;
                    break;
                }
                i11 += 3;
            }
            e0Var.f25633h = false;
            this.f32150d = true;
            this.f32152f = true;
        }
    }

    public final void i() {
        g3.a aVar = this.g;
        boolean z3 = aVar != null;
        long j = this.f32148b.f32170c;
        if (j >= 0 || !z3) {
            if (this.f32153h == j && z3) {
                return;
            }
            if (aVar != null) {
                Handler handler = i1.a.f25530a;
                if ((g.C(aVar) ? aVar : null) != null) {
                    i1.a.f25530a.removeCallbacks(aVar);
                }
            }
            Handler handler2 = i1.a.f25530a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f32153h = jMax;
            long j8 = jMax - jCurrentTimeMillis;
            g3.a aVar2 = new g3.a(2, this.f32154i);
            i1.a.f25530a.postDelayed(aVar2, j8);
            this.g = aVar2;
        }
    }
}
