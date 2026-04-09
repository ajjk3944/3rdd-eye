package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vt1 {

    /* renamed from: c, reason: collision with root package name */
    public final wu1 f17707c;

    /* renamed from: d, reason: collision with root package name */
    public final no0 f17708d;

    /* renamed from: e, reason: collision with root package name */
    public long f17709e;

    /* renamed from: f, reason: collision with root package name */
    public int f17710f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public tt1 f17711h;

    /* renamed from: i, reason: collision with root package name */
    public tt1 f17712i;
    public tt1 j;

    /* renamed from: k, reason: collision with root package name */
    public tt1 f17713k;

    /* renamed from: l, reason: collision with root package name */
    public tt1 f17714l;

    /* renamed from: m, reason: collision with root package name */
    public int f17715m;

    /* renamed from: n, reason: collision with root package name */
    public Object f17716n;

    /* renamed from: o, reason: collision with root package name */
    public long f17717o;

    /* renamed from: q, reason: collision with root package name */
    public final kh0 f17719q;

    /* renamed from: a, reason: collision with root package name */
    public final tg f17705a = new tg();

    /* renamed from: b, reason: collision with root package name */
    public final fh f17706b = new fh();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f17718p = new ArrayList();

    public vt1(wu1 wu1Var, no0 no0Var, kh0 kh0Var, xs1 xs1Var) {
        this.f17707c = wu1Var;
        this.f17708d = no0Var;
        this.f17719q = kh0Var;
    }

    public static jy1 a(uh uhVar, Object obj, long j, fh fhVar, tg tgVar) {
        uhVar.o(obj, tgVar);
        uhVar.b(tgVar.f16811c, fhVar, 0L);
        uhVar.e(obj);
        tgVar.f16814f.getClass();
        uhVar.o(obj, tgVar);
        tgVar.f16814f.a(-1);
        return new jy1(obj, j, -1);
    }

    public final tt1 A(iy1 iy1Var) {
        for (int i4 = 0; i4 < this.f17718p.size(); i4++) {
            tt1 tt1Var = (tt1) this.f17718p.get(i4);
            if (tt1Var.f16948a == iy1Var) {
                return tt1Var;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f17715m == 0) {
            return;
        }
        tt1 tt1Var = this.f17711h;
        tt1Var.getClass();
        this.f17716n = tt1Var.f16949b;
        this.f17717o = tt1Var.g.f17335a.f12878d;
        while (tt1Var != null) {
            tt1Var.h();
            tt1Var = tt1Var.f16958m;
        }
        this.f17711h = null;
        this.f17713k = null;
        this.f17712i = null;
        this.j = null;
        this.f17715m = 0;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
    
        return y(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(com.google.android.gms.internal.ads.uh r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.tt1 r2 = r0.f17711h
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Laa
            com.google.android.gms.internal.ads.ut1 r5 = r2.g
            if (r3 != 0) goto L15
            com.google.android.gms.internal.ads.ut1 r3 = r0.D(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            com.google.android.gms.internal.ads.ut1 r8 = r0.e(r1, r3, r6)
            if (r8 == 0) goto La5
            long r9 = r5.f17336b
            long r11 = r8.f17336b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto La5
            com.google.android.gms.internal.ads.jy1 r9 = r5.f17335a
            com.google.android.gms.internal.ads.jy1 r10 = r8.f17335a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto La5
            r3 = r8
        L30:
            long r8 = r5.f17337c
            com.google.android.gms.internal.ads.ut1 r8 = r3.b(r8)
            r2.g = r8
            long r9 = r5.f17339e
            long r11 = r3.f17339e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L9e
            java.lang.Object r1 = r2.f16948a
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.sx1
            r5 = -9223372036854775808
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L58
            long r7 = r8.f17338d
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 != 0) goto L54
            r7 = r5
        L54:
            com.google.android.gms.internal.ads.sx1 r1 = (com.google.android.gms.internal.ads.sx1) r1
            r1.f16587e = r7
        L58:
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L65
        L62:
            long r7 = r2.f16961p
            long r7 = r7 + r11
        L65:
            com.google.android.gms.internal.ads.tt1 r1 = r0.f17712i
            r3 = 1
            if (r2 != r1) goto L74
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L74
        L72:
            r1 = r3
            goto L75
        L74:
            r1 = r4
        L75:
            com.google.android.gms.internal.ads.tt1 r11 = r0.j
            if (r2 != r11) goto L83
            int r5 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r5 == 0) goto L81
            int r5 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r5 < 0) goto L83
        L81:
            r5 = r3
            goto L84
        L83:
            r5 = r4
        L84:
            int r2 = r0.y(r2)
            if (r2 == 0) goto L8b
            return r2
        L8b:
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 != 0) goto L90
            r9 = r13
        L90:
            if (r1 == 0) goto L98
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 != 0) goto L97
            goto L98
        L97:
            r4 = r3
        L98:
            if (r5 == 0) goto L9d
            r1 = r4 | 2
            return r1
        L9d:
            return r4
        L9e:
            com.google.android.gms.internal.ads.tt1 r3 = r2.f16958m
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        La5:
            int r1 = r0.y(r3)
            return r1
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vt1.C(com.google.android.gms.internal.ads.uh, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ut1 D(com.google.android.gms.internal.ads.uh r19, com.google.android.gms.internal.ads.ut1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.jy1 r3 = r2.f17335a
            boolean r4 = r3.b()
            int r5 = r3.f12879e
            r6 = -1
            if (r4 != 0) goto L16
            if (r5 != r6) goto L16
            r4 = 1
        L14:
            r11 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            int r4 = r3.f12876b
            boolean r12 = r0.i(r1, r3)
            boolean r13 = r0.j(r1, r3, r11)
            java.lang.Object r7 = r3.f12875a
            com.google.android.gms.internal.ads.tg r8 = r0.f17705a
            r1.o(r7, r8)
            boolean r1 = r3.b()
            r9 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L38
            if (r5 != r6) goto L3b
        L38:
            r16 = r14
            goto L46
        L3b:
            com.google.android.gms.internal.ads.mu r1 = r8.f16814f
            com.google.android.gms.internal.ads.a r1 = r1.a(r5)
            r1.getClass()
            r16 = r9
        L46:
            boolean r1 = r3.b()
            if (r1 == 0) goto L56
            int r1 = r3.f12877c
            long r9 = r8.b(r4, r1)
        L52:
            r14 = r9
            r9 = r16
            goto L5f
        L56:
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 == 0) goto L5c
            r14 = r9
            goto L5f
        L5c:
            long r9 = r8.f16812d
            goto L52
        L5f:
            boolean r1 = r3.b()
            if (r1 == 0) goto L69
            r8.c(r4)
            goto L6e
        L69:
            if (r5 == r6) goto L6e
            r8.c(r5)
        L6e:
            com.google.android.gms.internal.ads.ut1 r1 = new com.google.android.gms.internal.ads.ut1
            r5 = r3
            long r3 = r2.f17336b
            long r6 = r2.f17337c
            r2 = r5
            r5 = r6
            r7 = r9
            r9 = r14
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vt1.D(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.ut1):com.google.android.gms.internal.ads.ut1");
    }

    public final jy1 E(uh uhVar, Object obj) {
        long jC;
        int iE;
        tg tgVar = this.f17705a;
        int i4 = uhVar.o(obj, tgVar).f16811c;
        Object obj2 = this.f17716n;
        if (obj2 == null || (iE = uhVar.e(obj2)) == -1 || uhVar.d(iE, tgVar, false).f16811c != i4) {
            tt1 tt1Var = this.f17711h;
            while (true) {
                if (tt1Var == null) {
                    tt1 tt1Var2 = this.f17711h;
                    while (true) {
                        if (tt1Var2 != null) {
                            int iE2 = uhVar.e(tt1Var2.f16949b);
                            if (iE2 != -1 && uhVar.d(iE2, tgVar, false).f16811c == i4) {
                                jC = tt1Var2.g.f17335a.f12878d;
                                break;
                            }
                            tt1Var2 = tt1Var2.f16958m;
                        } else {
                            jC = c(obj);
                            if (jC == -1) {
                                jC = this.f17709e;
                                this.f17709e = 1 + jC;
                                if (this.f17711h == null) {
                                    this.f17716n = obj;
                                    this.f17717o = jC;
                                }
                            }
                        }
                    }
                } else {
                    if (tt1Var.f16949b.equals(obj)) {
                        jC = tt1Var.g.f17335a.f12878d;
                        break;
                    }
                    tt1Var = tt1Var.f16958m;
                }
            }
        } else {
            jC = this.f17717o;
        }
        long j = jC;
        uhVar.o(obj, tgVar);
        int i10 = tgVar.f16811c;
        fh fhVar = this.f17706b;
        uhVar.b(i10, fhVar, 0L);
        for (int iE3 = uhVar.e(obj); iE3 >= fhVar.f11172k; iE3--) {
            uhVar.d(iE3, tgVar, true);
            tgVar.f16814f.getClass();
            tgVar.f16814f.a(-1);
        }
        return a(uhVar, obj, j, fhVar, tgVar);
    }

    public final void b() {
        v41 v41Var = x41.f18307b;
        u41 u41Var = new u41(4);
        for (tt1 tt1Var = this.f17711h; tt1Var != null; tt1Var = tt1Var.f16958m) {
            u41Var.a(tt1Var.g.f17335a);
        }
        tt1 tt1Var2 = this.f17712i;
        this.f17708d.e(new d1(this, u41Var, tt1Var2 == null ? null : tt1Var2.g.f17335a, 12));
    }

    public final long c(Object obj) {
        for (int i4 = 0; i4 < this.f17718p.size(); i4++) {
            tt1 tt1Var = (tt1) this.f17718p.get(i4);
            if (tt1Var.f16949b.equals(obj)) {
                return tt1Var.g.f17335a.f12878d;
            }
        }
        return -1L;
    }

    public final int d(uh uhVar) {
        uh uhVar2;
        tt1 tt1Var;
        tt1 tt1Var2 = this.f17711h;
        if (tt1Var2 == null) {
            return 0;
        }
        int iE = uhVar.e(tt1Var2.f16949b);
        while (true) {
            uhVar2 = uhVar;
            iE = uhVar2.l(iE, this.f17705a, this.f17706b, this.f17710f, this.g);
            while (true) {
                tt1Var = tt1Var2.f16958m;
                if (tt1Var == null || tt1Var2.g.f17340f) {
                    break;
                }
                tt1Var2 = tt1Var;
            }
            if (iE == -1 || tt1Var == null || uhVar2.e(tt1Var.f16949b) != iE) {
                break;
            }
            tt1Var2 = tt1Var;
            uhVar = uhVar2;
        }
        int iY = y(tt1Var2);
        tt1Var2.g = D(uhVar2, tt1Var2.g);
        return iY;
    }

    public final ut1 e(uh uhVar, tt1 tt1Var, long j) {
        int i4;
        uh uhVar2;
        tg tgVar;
        long jLongValue;
        long j8;
        int i10;
        Object obj;
        uh uhVar3;
        fh fhVar;
        Object obj2;
        long j9;
        ut1 ut1Var = tt1Var.g;
        long j10 = tt1Var.f16961p;
        long j11 = ut1Var.f17339e;
        long j12 = ut1Var.f17337c;
        jy1 jy1Var = ut1Var.f17335a;
        long j13 = (j10 + j11) - j;
        if (ut1Var.f17340f) {
            Object obj3 = jy1Var.f12875a;
            int iE = uhVar.e(obj3);
            int i11 = this.f17710f;
            boolean z3 = this.g;
            tg tgVar2 = this.f17705a;
            fh fhVar2 = this.f17706b;
            long j14 = 0;
            int iL = uhVar.l(iE, tgVar2, fhVar2, i11, z3);
            if (iL != -1) {
                int i12 = uhVar.d(iL, tgVar2, true).f16811c;
                Object obj4 = tgVar2.f16810b;
                obj4.getClass();
                long j15 = jy1Var.f12878d;
                if (uhVar.b(i12, fhVar2, 0L).f11172k == iL) {
                    long jMax = Math.max(0L, j13);
                    obj = obj3;
                    Pair pairN = uhVar.n(fhVar2, tgVar2, i12, -9223372036854775807L, jMax);
                    if (pairN != null) {
                        Object obj5 = pairN.first;
                        long jLongValue2 = ((Long) pairN.second).longValue();
                        tt1 tt1Var2 = tt1Var.f16958m;
                        if (tt1Var2 == null || !tt1Var2.f16949b.equals(obj5)) {
                            long jC = c(obj5);
                            if (jC == -1) {
                                jC = this.f17709e;
                                this.f17709e = 1 + jC;
                            }
                            j15 = jC;
                        } else {
                            j15 = tt1Var2.g.f17335a.f12878d;
                        }
                        uhVar3 = uhVar;
                        j14 = jLongValue2;
                        j9 = -9223372036854775807L;
                        fhVar = fhVar2;
                        obj2 = obj5;
                    }
                } else {
                    obj = obj3;
                    uhVar3 = uhVar;
                    fhVar = fhVar2;
                    obj2 = obj4;
                    j9 = 0;
                }
                jy1 jy1VarA = a(uhVar3, obj2, j15, fhVar, tgVar2);
                if (j9 != -9223372036854775807L && j12 != -9223372036854775807L) {
                    uhVar3.o(obj, tgVar2).f16814f.getClass();
                    tgVar2.f16814f.getClass();
                }
                return f(uhVar3, jy1VarA, j9, j14);
            }
        } else {
            Object obj6 = jy1Var.f12875a;
            tg tgVar3 = this.f17705a;
            uhVar.o(obj6, tgVar3);
            if (!jy1Var.b()) {
                int i13 = jy1Var.f12879e;
                if (i13 != -1) {
                    tgVar3.f16814f.getClass();
                    if (i13 == -1) {
                        tgVar3.f16814f.a(-1);
                    }
                }
                a aVarA = tgVar3.f16814f.a(i13);
                int i14 = 0;
                while (true) {
                    int[] iArr = aVarA.f9151d;
                    if (i14 >= iArr.length || (i4 = iArr[i14]) == 0 || i4 == 1) {
                        break;
                    }
                    i14++;
                }
                tgVar3.c(i13);
                if (i14 != tgVar3.f16814f.a(i13).f9148a) {
                    return g(uhVar, obj6, i13, i14, j11, jy1Var.f12878d);
                }
                uhVar.o(obj6, tgVar3);
                tgVar3.f16814f.a(i13).getClass();
                tgVar3.f16814f.a(i13).getClass();
                return h(uhVar, obj6, 0L, j11, jy1Var.f12878d);
            }
            int i15 = jy1Var.f12876b;
            if (tgVar3.f16814f.a(i15).f9148a != -1) {
                int i16 = jy1Var.f12877c;
                a aVarA2 = tgVar3.f16814f.a(i15);
                int i17 = i16 + 1;
                while (true) {
                    int[] iArr2 = aVarA2.f9151d;
                    if (i17 >= iArr2.length || (i10 = iArr2[i17]) == 0 || i10 == 1) {
                        break;
                    }
                    i17++;
                }
                if (i17 < 0) {
                    return g(uhVar, obj6, i15, i17, ut1Var.f17337c, jy1Var.f12878d);
                }
                if (j12 == -9223372036854775807L) {
                    tgVar = tgVar3;
                    uhVar2 = uhVar;
                    Pair pairN2 = uhVar2.n(this.f17706b, tgVar, tgVar3.f16811c, -9223372036854775807L, Math.max(0L, j13));
                    if (pairN2 == null) {
                        return null;
                    }
                    jLongValue = ((Long) pairN2.second).longValue();
                    j8 = -9223372036854775807L;
                } else {
                    uhVar2 = uhVar;
                    tgVar = tgVar3;
                    jLongValue = j12;
                    j8 = jLongValue;
                }
                uhVar2.o(obj6, tgVar);
                tgVar.f16814f.a(i15).getClass();
                tgVar.f16814f.a(i15).getClass();
                return h(uhVar2, obj6, Math.max(0L, jLongValue), j8, jy1Var.f12878d);
            }
        }
        return null;
    }

    public final ut1 f(uh uhVar, jy1 jy1Var, long j, long j8) {
        Object obj = jy1Var.f12875a;
        uhVar.o(obj, this.f17705a);
        return jy1Var.b() ? g(uhVar, obj, jy1Var.f12876b, jy1Var.f12877c, j, jy1Var.f12878d) : h(uhVar, obj, j8, j, jy1Var.f12878d);
    }

    public final ut1 g(uh uhVar, Object obj, int i4, int i10, long j, long j8) {
        int i11;
        jy1 jy1Var = new jy1(obj, i4, i10, j8, -1);
        tg tgVar = this.f17705a;
        long jB = uhVar.o(obj, tgVar).b(i4, i10);
        a aVarA = tgVar.f16814f.a(i4);
        int i12 = 0;
        while (true) {
            int[] iArr = aVarA.f9151d;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        if (i10 == i12) {
            tgVar.f16814f.getClass();
        }
        tgVar.c(i4);
        long jMax = 0;
        if (jB != -9223372036854775807L && jB <= 0) {
            jMax = Math.max(0L, (-1) + jB);
        }
        return new ut1(jy1Var, jMax, j, -9223372036854775807L, jB, false, false, false);
    }

    public final ut1 h(uh uhVar, Object obj, long j, long j8, long j9) {
        tg tgVar = this.f17705a;
        uhVar.o(obj, tgVar);
        tgVar.getClass();
        tgVar.f16814f.getClass();
        jy1 jy1Var = new jy1(obj, j9, -1);
        boolean z3 = !jy1Var.b();
        boolean zI = i(uhVar, jy1Var);
        boolean zJ = j(uhVar, jy1Var, z3);
        long j10 = tgVar.f16812d;
        return new ut1(jy1Var, (j10 == -9223372036854775807L || j < j10) ? j : Math.max(0L, (-1) + j10), j8, -9223372036854775807L, j10, z3, zI, zJ);
    }

    public final boolean i(uh uhVar, jy1 jy1Var) {
        if (!jy1Var.b() && jy1Var.f12879e == -1) {
            Object obj = jy1Var.f12875a;
            int i4 = uhVar.o(obj, this.f17705a).f16811c;
            if (uhVar.b(i4, this.f17706b, 0L).f11173l == uhVar.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(uh uhVar, jy1 jy1Var, boolean z3) {
        int iE = uhVar.e(jy1Var.f12875a);
        tg tgVar = this.f17705a;
        int i4 = uhVar.d(iE, tgVar, false).f16811c;
        fh fhVar = this.f17706b;
        return !uhVar.b(i4, fhVar, 0L).g && uhVar.l(iE, tgVar, fhVar, this.f17710f, this.g) == -1 && z3;
    }

    public final int k(uh uhVar, int i4) {
        this.f17710f = i4;
        return d(uhVar);
    }

    public final int l(uh uhVar, boolean z3) {
        this.g = z3;
        return d(uhVar);
    }

    public final void m(xs1 xs1Var) {
        xs1Var.getClass();
        r();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public final void n(long j) {
        tt1 tt1Var = this.f17713k;
        if (tt1Var != null) {
            mq0.c0(tt1Var.f16958m == null);
            if (tt1Var.f16952e) {
                tt1Var.f16948a.l(j - tt1Var.f16961p);
            }
        }
    }

    public final boolean o() {
        tt1 tt1Var = this.f17713k;
        if (tt1Var != null) {
            return !tt1Var.g.f17341h && tt1Var.b() && this.f17713k.g.f17339e != -9223372036854775807L && this.f17715m < 100;
        }
        return true;
    }

    public final ut1 p(long j, eu1 eu1Var) {
        tt1 tt1Var = this.f17713k;
        return tt1Var == null ? f(eu1Var.f10872a, eu1Var.f10873b, eu1Var.f10874c, eu1Var.f10887r) : e(eu1Var.f10872a, tt1Var, j);
    }

    public final tt1 q(ut1 ut1Var) {
        tt1 tt1Var;
        long j = ut1Var.f17336b;
        tt1 tt1Var2 = this.f17713k;
        long j8 = tt1Var2 == null ? 1000000000000L : (tt1Var2.f16961p + tt1Var2.g.f17339e) - j;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f17718p.size()) {
                tt1Var = null;
                break;
            }
            ut1 ut1Var2 = ((tt1) this.f17718p.get(i4)).g;
            long j9 = ut1Var2.f17339e;
            long j10 = ut1Var.f17339e;
            if ((j9 == -9223372036854775807L || j9 == j10) && ut1Var2.f17336b == j && ut1Var2.f17335a.equals(ut1Var.f17335a)) {
                tt1Var = (tt1) this.f17718p.remove(i4);
                break;
            }
            i4++;
        }
        if (tt1Var == null) {
            nt1 nt1Var = (nt1) this.f17719q.f13160b;
            i iVarH = nt1Var.f14418f.h(nt1Var.f14431u);
            nt1Var.Y.getClass();
            tt1Var = new tt1(nt1Var.f14412b, j8, nt1Var.f14416d, iVarH, nt1Var.f14429s, ut1Var, nt1Var.f14417e);
        } else {
            tt1Var.g = ut1Var;
            tt1Var.f16961p = j8;
        }
        tt1 tt1Var3 = this.f17713k;
        if (tt1Var3 == null) {
            this.f17711h = tt1Var;
            this.f17712i = tt1Var;
            this.j = tt1Var;
        } else if (tt1Var != tt1Var3.f16958m) {
            tt1Var3.l();
            tt1Var3.f16958m = tt1Var;
        }
        this.f17716n = null;
        this.f17713k = tt1Var;
        this.f17715m++;
        b();
        return tt1Var;
    }

    public final void r() {
        if (this.f17718p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f17718p.size(); i4++) {
            ((tt1) this.f17718p.get(i4)).h();
        }
        this.f17718p = arrayList;
        this.f17714l = null;
        z();
    }

    public final tt1 s() {
        return this.f17711h;
    }

    public final tt1 t() {
        return this.f17712i;
    }

    public final tt1 u() {
        return this.j;
    }

    public final tt1 v() {
        tt1 tt1Var = this.j;
        tt1 tt1Var2 = this.f17712i;
        if (tt1Var == tt1Var2) {
            tt1Var2.getClass();
            this.j = tt1Var2.f16958m;
        }
        tt1Var2.getClass();
        this.f17712i = tt1Var2.f16958m;
        b();
        tt1 tt1Var3 = this.f17712i;
        tt1Var3.getClass();
        return tt1Var3;
    }

    public final void w() {
        tt1 tt1Var = this.j;
        tt1Var.getClass();
        this.j = tt1Var.f16958m;
        b();
        this.j.getClass();
    }

    public final tt1 x() {
        tt1 tt1Var = this.f17711h;
        if (tt1Var == null) {
            return null;
        }
        if (tt1Var == this.f17712i) {
            this.f17712i = tt1Var.f16958m;
        }
        if (tt1Var == this.j) {
            this.j = tt1Var.f16958m;
        }
        tt1Var.h();
        int i4 = this.f17715m - 1;
        this.f17715m = i4;
        if (i4 == 0) {
            this.f17713k = null;
            tt1 tt1Var2 = this.f17711h;
            this.f17716n = tt1Var2.f16949b;
            this.f17717o = tt1Var2.g.f17335a.f12878d;
        }
        this.f17711h = this.f17711h.f16958m;
        b();
        return this.f17711h;
    }

    public final int y(tt1 tt1Var) {
        tt1Var.getClass();
        int i4 = 0;
        if (tt1Var.equals(this.f17713k)) {
            return 0;
        }
        this.f17713k = tt1Var;
        int i10 = 0;
        while (true) {
            tt1Var = tt1Var.f16958m;
            if (tt1Var == null) {
                break;
            }
            if (tt1Var == this.f17712i) {
                tt1 tt1Var2 = this.f17711h;
                this.f17712i = tt1Var2;
                this.j = tt1Var2;
                i10 = 3;
            }
            if (tt1Var == this.j) {
                this.j = this.f17712i;
                i10 |= 2;
            }
            tt1Var.h();
            this.f17715m--;
        }
        tt1 tt1Var3 = this.f17713k;
        tt1Var3.getClass();
        if (tt1Var3.f16958m != null) {
            tt1Var3.l();
            tt1Var3.f16958m = null;
            while (true) {
                g gVar = tt1Var3.f16960o;
                if (i4 >= gVar.f11324a) {
                    break;
                }
                gVar.b(i4);
                d dVar = ((d[]) tt1Var3.f16960o.f11326c)[i4];
                i4++;
            }
        }
        b();
        return i10;
    }

    public final void z() {
        tt1 tt1Var = this.f17714l;
        if (tt1Var == null || tt1Var.c()) {
            this.f17714l = null;
            for (int i4 = 0; i4 < this.f17718p.size(); i4++) {
                tt1 tt1Var2 = (tt1) this.f17718p.get(i4);
                if (!tt1Var2.c()) {
                    this.f17714l = tt1Var2;
                    return;
                }
            }
        }
    }
}
