package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263hO {

    /* renamed from: c, reason: collision with root package name */
    public final GO f14479c;

    /* renamed from: d, reason: collision with root package name */
    public final C1231gt f14480d;

    /* renamed from: e, reason: collision with root package name */
    public long f14481e;

    /* renamed from: f, reason: collision with root package name */
    public int f14482f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14483g;

    /* renamed from: h, reason: collision with root package name */
    public C1154fO f14484h;
    public C1154fO i;

    /* renamed from: j, reason: collision with root package name */
    public C1154fO f14485j;

    /* renamed from: k, reason: collision with root package name */
    public C1154fO f14486k;

    /* renamed from: l, reason: collision with root package name */
    public C1154fO f14487l;

    /* renamed from: m, reason: collision with root package name */
    public int f14488m;

    /* renamed from: n, reason: collision with root package name */
    public Object f14489n;

    /* renamed from: o, reason: collision with root package name */
    public long f14490o;

    /* renamed from: q, reason: collision with root package name */
    public final C1448kw f14492q;

    /* renamed from: a, reason: collision with root package name */
    public final I7 f14477a = new I7();

    /* renamed from: b, reason: collision with root package name */
    public final U7 f14478b = new U7();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f14491p = new ArrayList();

    public C1263hO(GO go, C1231gt c1231gt, C1448kw c1448kw, KN kn) {
        this.f14479c = go;
        this.f14480d = c1231gt;
        this.f14492q = c1448kw;
    }

    public static C1749qQ a(AbstractC1353j8 abstractC1353j8, Object obj, long j6, U7 u7, I7 i7) {
        abstractC1353j8.o(obj, i7);
        abstractC1353j8.b(i7.f9072c, u7, 0L);
        abstractC1353j8.e(obj);
        i7.f9075f.getClass();
        abstractC1353j8.o(obj, i7);
        i7.f9075f.a(-1);
        return new C1749qQ(obj, j6, -1);
    }

    public final C1154fO A(InterfaceC1695pQ interfaceC1695pQ) {
        for (int i = 0; i < this.f14491p.size(); i++) {
            C1154fO c1154fO = (C1154fO) this.f14491p.get(i);
            if (c1154fO.f14065a == interfaceC1695pQ) {
                return c1154fO;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f14488m == 0) {
            return;
        }
        C1154fO c1154fO = this.f14484h;
        c1154fO.getClass();
        this.f14489n = c1154fO.f14066b;
        this.f14490o = c1154fO.f14071g.f14261a.f16377d;
        while (c1154fO != null) {
            c1154fO.h();
            c1154fO = c1154fO.f14076m;
        }
        this.f14484h = null;
        this.f14486k = null;
        this.i = null;
        this.f14485j = null;
        this.f14488m = 0;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
    
        return y(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(com.google.android.gms.internal.ads.AbstractC1353j8 r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.fO r2 = r0.f14484h
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Laa
            com.google.android.gms.internal.ads.gO r5 = r2.f14071g
            if (r3 != 0) goto L15
            com.google.android.gms.internal.ads.gO r3 = r0.D(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            com.google.android.gms.internal.ads.gO r8 = r0.e(r1, r3, r6)
            if (r8 == 0) goto La5
            long r9 = r5.f14262b
            long r11 = r8.f14262b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto La5
            com.google.android.gms.internal.ads.qQ r9 = r5.f14261a
            com.google.android.gms.internal.ads.qQ r10 = r8.f14261a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto La5
            r3 = r8
        L30:
            long r8 = r5.f14263c
            com.google.android.gms.internal.ads.gO r8 = r3.b(r8)
            r2.f14071g = r8
            long r9 = r5.f14265e
            long r11 = r3.f14265e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L9e
            java.lang.Object r1 = r2.f14065a
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.ZP
            r5 = -9223372036854775808
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L58
            long r7 = r8.f14264d
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 != 0) goto L54
            r7 = r5
        L54:
            com.google.android.gms.internal.ads.ZP r1 = (com.google.android.gms.internal.ads.ZP) r1
            r1.f12893e = r7
        L58:
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L65
        L62:
            long r7 = r2.f14079p
            long r7 = r7 + r11
        L65:
            com.google.android.gms.internal.ads.fO r1 = r0.i
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
            com.google.android.gms.internal.ads.fO r11 = r0.f14485j
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
            com.google.android.gms.internal.ads.fO r3 = r2.f14076m
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1263hO.C(com.google.android.gms.internal.ads.j8, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1209gO D(com.google.android.gms.internal.ads.AbstractC1353j8 r19, com.google.android.gms.internal.ads.C1209gO r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.qQ r3 = r2.f14261a
            boolean r4 = r3.b()
            int r5 = r3.f16378e
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
            int r4 = r3.f16375b
            boolean r12 = r0.i(r1, r3)
            boolean r13 = r0.j(r1, r3, r11)
            java.lang.Object r7 = r3.f16374a
            com.google.android.gms.internal.ads.I7 r8 = r0.f14477a
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
            com.google.android.gms.internal.ads.ve r1 = r8.f9075f
            com.google.android.gms.internal.ads.a r1 = r1.a(r5)
            r1.getClass()
            r16 = r9
        L46:
            boolean r1 = r3.b()
            if (r1 == 0) goto L56
            int r1 = r3.f16376c
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
            long r9 = r8.f9073d
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
            com.google.android.gms.internal.ads.gO r1 = new com.google.android.gms.internal.ads.gO
            r5 = r3
            long r3 = r2.f14262b
            long r6 = r2.f14263c
            r2 = r5
            r5 = r6
            r7 = r9
            r9 = r14
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1263hO.D(com.google.android.gms.internal.ads.j8, com.google.android.gms.internal.ads.gO):com.google.android.gms.internal.ads.gO");
    }

    public final C1749qQ E(AbstractC1353j8 abstractC1353j8, Object obj) {
        long jC;
        int iE;
        I7 i7 = this.f14477a;
        int i = abstractC1353j8.o(obj, i7).f9072c;
        Object obj2 = this.f14489n;
        if (obj2 == null || (iE = abstractC1353j8.e(obj2)) == -1 || abstractC1353j8.d(iE, i7, false).f9072c != i) {
            C1154fO c1154fO = this.f14484h;
            while (true) {
                if (c1154fO == null) {
                    C1154fO c1154fO2 = this.f14484h;
                    while (true) {
                        if (c1154fO2 != null) {
                            int iE2 = abstractC1353j8.e(c1154fO2.f14066b);
                            if (iE2 != -1 && abstractC1353j8.d(iE2, i7, false).f9072c == i) {
                                jC = c1154fO2.f14071g.f14261a.f16377d;
                                break;
                            }
                            c1154fO2 = c1154fO2.f14076m;
                        } else {
                            jC = c(obj);
                            if (jC == -1) {
                                jC = this.f14481e;
                                this.f14481e = 1 + jC;
                                if (this.f14484h == null) {
                                    this.f14489n = obj;
                                    this.f14490o = jC;
                                }
                            }
                        }
                    }
                } else {
                    if (c1154fO.f14066b.equals(obj)) {
                        jC = c1154fO.f14071g.f14261a.f16377d;
                        break;
                    }
                    c1154fO = c1154fO.f14076m;
                }
            }
        } else {
            jC = this.f14490o;
        }
        long j6 = jC;
        abstractC1353j8.o(obj, i7);
        int i3 = i7.f9072c;
        U7 u7 = this.f14478b;
        abstractC1353j8.b(i3, u7, 0L);
        for (int iE3 = abstractC1353j8.e(obj); iE3 >= u7.f11612k; iE3--) {
            abstractC1353j8.d(iE3, i7, true);
            i7.f9075f.getClass();
            i7.f9075f.a(-1);
        }
        return a(abstractC1353j8, obj, j6, u7, i7);
    }

    public final void b() {
        JB jb = LB.f9635b;
        IB ib = new IB(4);
        for (C1154fO c1154fO = this.f14484h; c1154fO != null; c1154fO = c1154fO.f14076m) {
            ib.a(c1154fO.f14071g.f14261a);
        }
        C1154fO c1154fO2 = this.i;
        this.f14480d.e(new RunnableC0912b0(this, ib, c1154fO2 == null ? null : c1154fO2.f14071g.f14261a, 12));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.f14491p.size(); i++) {
            C1154fO c1154fO = (C1154fO) this.f14491p.get(i);
            if (c1154fO.f14066b.equals(obj)) {
                return c1154fO.f14071g.f14261a.f16377d;
            }
        }
        return -1L;
    }

    public final int d(AbstractC1353j8 abstractC1353j8) {
        AbstractC1353j8 abstractC1353j82;
        C1154fO c1154fO;
        C1154fO c1154fO2 = this.f14484h;
        if (c1154fO2 == null) {
            return 0;
        }
        int iE = abstractC1353j8.e(c1154fO2.f14066b);
        while (true) {
            abstractC1353j82 = abstractC1353j8;
            iE = abstractC1353j82.l(iE, this.f14477a, this.f14478b, this.f14482f, this.f14483g);
            while (true) {
                c1154fO = c1154fO2.f14076m;
                if (c1154fO == null || c1154fO2.f14071g.f14266f) {
                    break;
                }
                c1154fO2 = c1154fO;
            }
            if (iE == -1 || c1154fO == null || abstractC1353j82.e(c1154fO.f14066b) != iE) {
                break;
            }
            c1154fO2 = c1154fO;
            abstractC1353j8 = abstractC1353j82;
        }
        int iY = y(c1154fO2);
        c1154fO2.f14071g = D(abstractC1353j82, c1154fO2.f14071g);
        return iY;
    }

    public final C1209gO e(AbstractC1353j8 abstractC1353j8, C1154fO c1154fO, long j6) {
        int i;
        AbstractC1353j8 abstractC1353j82;
        I7 i7;
        long jLongValue;
        long j7;
        int i3;
        Object obj;
        AbstractC1353j8 abstractC1353j83;
        U7 u7;
        Object obj2;
        long j8;
        C1209gO c1209gO = c1154fO.f14071g;
        long j9 = c1154fO.f14079p;
        long j10 = c1209gO.f14265e;
        long j11 = c1209gO.f14263c;
        C1749qQ c1749qQ = c1209gO.f14261a;
        long j12 = (j9 + j10) - j6;
        if (c1209gO.f14266f) {
            Object obj3 = c1749qQ.f16374a;
            int iE = abstractC1353j8.e(obj3);
            int i6 = this.f14482f;
            boolean z6 = this.f14483g;
            I7 i72 = this.f14477a;
            U7 u72 = this.f14478b;
            long j13 = 0;
            int iL = abstractC1353j8.l(iE, i72, u72, i6, z6);
            if (iL != -1) {
                int i8 = abstractC1353j8.d(iL, i72, true).f9072c;
                Object obj4 = i72.f9071b;
                obj4.getClass();
                long j14 = c1749qQ.f16377d;
                if (abstractC1353j8.b(i8, u72, 0L).f11612k == iL) {
                    long jMax = Math.max(0L, j12);
                    obj = obj3;
                    Pair pairN = abstractC1353j8.n(u72, i72, i8, -9223372036854775807L, jMax);
                    if (pairN != null) {
                        Object obj5 = pairN.first;
                        long jLongValue2 = ((Long) pairN.second).longValue();
                        C1154fO c1154fO2 = c1154fO.f14076m;
                        if (c1154fO2 == null || !c1154fO2.f14066b.equals(obj5)) {
                            long jC = c(obj5);
                            if (jC == -1) {
                                jC = this.f14481e;
                                this.f14481e = 1 + jC;
                            }
                            j14 = jC;
                        } else {
                            j14 = c1154fO2.f14071g.f14261a.f16377d;
                        }
                        abstractC1353j83 = abstractC1353j8;
                        j13 = jLongValue2;
                        j8 = -9223372036854775807L;
                        u7 = u72;
                        obj2 = obj5;
                    }
                } else {
                    obj = obj3;
                    abstractC1353j83 = abstractC1353j8;
                    u7 = u72;
                    obj2 = obj4;
                    j8 = 0;
                }
                C1749qQ c1749qQA = a(abstractC1353j83, obj2, j14, u7, i72);
                if (j8 != -9223372036854775807L && j11 != -9223372036854775807L) {
                    abstractC1353j83.o(obj, i72).f9075f.getClass();
                    i72.f9075f.getClass();
                }
                return f(abstractC1353j83, c1749qQA, j8, j13);
            }
        } else {
            Object obj6 = c1749qQ.f16374a;
            I7 i73 = this.f14477a;
            abstractC1353j8.o(obj6, i73);
            if (!c1749qQ.b()) {
                int i9 = c1749qQ.f16378e;
                if (i9 != -1) {
                    i73.f9075f.getClass();
                    if (i9 == -1) {
                        i73.f9075f.a(-1);
                    }
                }
                C0856a c0856aA = i73.f9075f.a(i9);
                int i10 = 0;
                while (true) {
                    int[] iArr = c0856aA.f13009d;
                    if (i10 >= iArr.length || (i = iArr[i10]) == 0 || i == 1) {
                        break;
                    }
                    i10++;
                }
                i73.c(i9);
                if (i10 != i73.f9075f.a(i9).f13006a) {
                    return g(abstractC1353j8, obj6, i9, i10, j10, c1749qQ.f16377d);
                }
                abstractC1353j8.o(obj6, i73);
                i73.f9075f.a(i9).getClass();
                i73.f9075f.a(i9).getClass();
                return h(abstractC1353j8, obj6, 0L, j10, c1749qQ.f16377d);
            }
            int i11 = c1749qQ.f16375b;
            if (i73.f9075f.a(i11).f13006a != -1) {
                int i12 = c1749qQ.f16376c;
                C0856a c0856aA2 = i73.f9075f.a(i11);
                int i13 = i12 + 1;
                while (true) {
                    int[] iArr2 = c0856aA2.f13009d;
                    if (i13 >= iArr2.length || (i3 = iArr2[i13]) == 0 || i3 == 1) {
                        break;
                    }
                    i13++;
                }
                if (i13 < 0) {
                    return g(abstractC1353j8, obj6, i11, i13, c1209gO.f14263c, c1749qQ.f16377d);
                }
                if (j11 == -9223372036854775807L) {
                    i7 = i73;
                    abstractC1353j82 = abstractC1353j8;
                    Pair pairN2 = abstractC1353j82.n(this.f14478b, i7, i73.f9072c, -9223372036854775807L, Math.max(0L, j12));
                    if (pairN2 == null) {
                        return null;
                    }
                    jLongValue = ((Long) pairN2.second).longValue();
                    j7 = -9223372036854775807L;
                } else {
                    abstractC1353j82 = abstractC1353j8;
                    i7 = i73;
                    jLongValue = j11;
                    j7 = jLongValue;
                }
                abstractC1353j82.o(obj6, i7);
                i7.f9075f.a(i11).getClass();
                i7.f9075f.a(i11).getClass();
                return h(abstractC1353j82, obj6, Math.max(0L, jLongValue), j7, c1749qQ.f16377d);
            }
        }
        return null;
    }

    public final C1209gO f(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ, long j6, long j7) {
        Object obj = c1749qQ.f16374a;
        abstractC1353j8.o(obj, this.f14477a);
        return c1749qQ.b() ? g(abstractC1353j8, obj, c1749qQ.f16375b, c1749qQ.f16376c, j6, c1749qQ.f16377d) : h(abstractC1353j8, obj, j7, j6, c1749qQ.f16377d);
    }

    public final C1209gO g(AbstractC1353j8 abstractC1353j8, Object obj, int i, int i3, long j6, long j7) {
        int i6;
        C1749qQ c1749qQ = new C1749qQ(obj, i, i3, j7, -1);
        I7 i7 = this.f14477a;
        long jB = abstractC1353j8.o(obj, i7).b(i, i3);
        C0856a c0856aA = i7.f9075f.a(i);
        int i8 = 0;
        while (true) {
            int[] iArr = c0856aA.f13009d;
            if (i8 >= iArr.length || (i6 = iArr[i8]) == 0 || i6 == 1) {
                break;
            }
            i8++;
        }
        if (i3 == i8) {
            i7.f9075f.getClass();
        }
        i7.c(i);
        long jMax = 0;
        if (jB != -9223372036854775807L && jB <= 0) {
            jMax = Math.max(0L, (-1) + jB);
        }
        return new C1209gO(c1749qQ, jMax, j6, -9223372036854775807L, jB, false, false, false);
    }

    public final C1209gO h(AbstractC1353j8 abstractC1353j8, Object obj, long j6, long j7, long j8) {
        I7 i7 = this.f14477a;
        abstractC1353j8.o(obj, i7);
        i7.getClass();
        i7.f9075f.getClass();
        C1749qQ c1749qQ = new C1749qQ(obj, j8, -1);
        boolean z6 = !c1749qQ.b();
        boolean zI = i(abstractC1353j8, c1749qQ);
        boolean zJ = j(abstractC1353j8, c1749qQ, z6);
        long j9 = i7.f9073d;
        return new C1209gO(c1749qQ, (j9 == -9223372036854775807L || j6 < j9) ? j6 : Math.max(0L, (-1) + j9), j7, -9223372036854775807L, j9, z6, zI, zJ);
    }

    public final boolean i(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ) {
        if (!c1749qQ.b() && c1749qQ.f16378e == -1) {
            Object obj = c1749qQ.f16374a;
            int i = abstractC1353j8.o(obj, this.f14477a).f9072c;
            if (abstractC1353j8.b(i, this.f14478b, 0L).f11613l == abstractC1353j8.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ, boolean z6) {
        int iE = abstractC1353j8.e(c1749qQ.f16374a);
        I7 i7 = this.f14477a;
        int i = abstractC1353j8.d(iE, i7, false).f9072c;
        U7 u7 = this.f14478b;
        return !abstractC1353j8.b(i, u7, 0L).f11609g && abstractC1353j8.l(iE, i7, u7, this.f14482f, this.f14483g) == -1 && z6;
    }

    public final int k(AbstractC1353j8 abstractC1353j8, int i) {
        this.f14482f = i;
        return d(abstractC1353j8);
    }

    public final int l(AbstractC1353j8 abstractC1353j8, boolean z6) {
        this.f14483g = z6;
        return d(abstractC1353j8);
    }

    public final void m(KN kn) {
        kn.getClass();
        r();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    public final void n(long j6) {
        C1154fO c1154fO = this.f14486k;
        if (c1154fO != null) {
            AbstractC0582Jp.h0(c1154fO.f14076m == null);
            if (c1154fO.f14069e) {
                c1154fO.f14065a.l(j6 - c1154fO.f14079p);
            }
        }
    }

    public final boolean o() {
        C1154fO c1154fO = this.f14486k;
        if (c1154fO != null) {
            return !c1154fO.f14071g.f14268h && c1154fO.b() && this.f14486k.f14071g.f14265e != -9223372036854775807L && this.f14488m < 100;
        }
        return true;
    }

    public final C1209gO p(long j6, C1747qO c1747qO) {
        C1154fO c1154fO = this.f14486k;
        return c1154fO == null ? f(c1747qO.f16352a, c1747qO.f16353b, c1747qO.f16354c, c1747qO.f16368r) : e(c1747qO.f16352a, c1154fO, j6);
    }

    public final C1154fO q(C1209gO c1209gO) {
        C1154fO c1154fO;
        long j6 = c1209gO.f14262b;
        C1154fO c1154fO2 = this.f14486k;
        long j7 = c1154fO2 == null ? 1000000000000L : (c1154fO2.f14079p + c1154fO2.f14071g.f14265e) - j6;
        int i = 0;
        while (true) {
            if (i >= this.f14491p.size()) {
                c1154fO = null;
                break;
            }
            C1209gO c1209gO2 = ((C1154fO) this.f14491p.get(i)).f14071g;
            long j8 = c1209gO2.f14265e;
            long j9 = c1209gO.f14265e;
            if ((j8 == -9223372036854775807L || j8 == j9) && c1209gO2.f14262b == j6 && c1209gO2.f14261a.equals(c1209gO.f14261a)) {
                c1154fO = (C1154fO) this.f14491p.remove(i);
                break;
            }
            i++;
        }
        if (c1154fO == null) {
            ZN zn = (ZN) this.f14492q.f15314b;
            InterfaceC1292i interfaceC1292iI = zn.f12862f.i(zn.f12836I);
            zn.f12876m0.getClass();
            c1154fO = new C1154fO(zn.f12855b, j7, zn.f12858d, interfaceC1292iI, zn.f12834G, c1209gO, zn.f12860e);
        } else {
            c1154fO.f14071g = c1209gO;
            c1154fO.f14079p = j7;
        }
        C1154fO c1154fO3 = this.f14486k;
        if (c1154fO3 == null) {
            this.f14484h = c1154fO;
            this.i = c1154fO;
            this.f14485j = c1154fO;
        } else if (c1154fO != c1154fO3.f14076m) {
            c1154fO3.l();
            c1154fO3.f14076m = c1154fO;
        }
        this.f14489n = null;
        this.f14486k = c1154fO;
        this.f14488m++;
        b();
        return c1154fO;
    }

    public final void r() {
        if (this.f14491p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14491p.size(); i++) {
            ((C1154fO) this.f14491p.get(i)).h();
        }
        this.f14491p = arrayList;
        this.f14487l = null;
        z();
    }

    public final C1154fO s() {
        return this.f14484h;
    }

    public final C1154fO t() {
        return this.i;
    }

    public final C1154fO u() {
        return this.f14485j;
    }

    public final C1154fO v() {
        C1154fO c1154fO = this.f14485j;
        C1154fO c1154fO2 = this.i;
        if (c1154fO == c1154fO2) {
            c1154fO2.getClass();
            this.f14485j = c1154fO2.f14076m;
        }
        c1154fO2.getClass();
        this.i = c1154fO2.f14076m;
        b();
        C1154fO c1154fO3 = this.i;
        c1154fO3.getClass();
        return c1154fO3;
    }

    public final void w() {
        C1154fO c1154fO = this.f14485j;
        c1154fO.getClass();
        this.f14485j = c1154fO.f14076m;
        b();
        this.f14485j.getClass();
    }

    public final C1154fO x() {
        C1154fO c1154fO = this.f14484h;
        if (c1154fO == null) {
            return null;
        }
        if (c1154fO == this.i) {
            this.i = c1154fO.f14076m;
        }
        if (c1154fO == this.f14485j) {
            this.f14485j = c1154fO.f14076m;
        }
        c1154fO.h();
        int i = this.f14488m - 1;
        this.f14488m = i;
        if (i == 0) {
            this.f14486k = null;
            C1154fO c1154fO2 = this.f14484h;
            this.f14489n = c1154fO2.f14066b;
            this.f14490o = c1154fO2.f14071g.f14261a.f16377d;
        }
        this.f14484h = this.f14484h.f14076m;
        b();
        return this.f14484h;
    }

    public final int y(C1154fO c1154fO) {
        c1154fO.getClass();
        int i = 0;
        if (c1154fO.equals(this.f14486k)) {
            return 0;
        }
        this.f14486k = c1154fO;
        int i3 = 0;
        while (true) {
            c1154fO = c1154fO.f14076m;
            if (c1154fO == null) {
                break;
            }
            if (c1154fO == this.i) {
                C1154fO c1154fO2 = this.f14484h;
                this.i = c1154fO2;
                this.f14485j = c1154fO2;
                i3 = 3;
            }
            if (c1154fO == this.f14485j) {
                this.f14485j = this.i;
                i3 |= 2;
            }
            c1154fO.h();
            this.f14488m--;
        }
        C1154fO c1154fO3 = this.f14486k;
        c1154fO3.getClass();
        if (c1154fO3.f14076m != null) {
            c1154fO3.l();
            c1154fO3.f14076m = null;
            while (true) {
                C1184g c1184g = c1154fO3.f14078o;
                if (i >= c1184g.f14179a) {
                    break;
                }
                c1184g.c(i);
                InterfaceC1020d interfaceC1020d = ((InterfaceC1020d[]) c1154fO3.f14078o.f14181c)[i];
                i++;
            }
        }
        b();
        return i3;
    }

    public final void z() {
        C1154fO c1154fO = this.f14487l;
        if (c1154fO == null || c1154fO.c()) {
            this.f14487l = null;
            for (int i = 0; i < this.f14491p.size(); i++) {
                C1154fO c1154fO2 = (C1154fO) this.f14491p.get(i);
                if (!c1154fO2.c()) {
                    this.f14487l = c1154fO2;
                    return;
                }
            }
        }
    }
}
