package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rb4 {
    public final md4 c;
    public final d13 d;
    public long e;
    public int f;
    public boolean g;
    public pb4 h;
    public pb4 i;
    public pb4 j;
    public pb4 k;
    public pb4 l;
    public int m;
    public Object n;
    public long o;
    public final x34 q;
    public final sw1 a = new sw1();
    public final ez1 b = new ez1();
    public ArrayList p = new ArrayList();

    public rb4(md4 md4Var, d13 d13Var, x34 x34Var, la4 la4Var) {
        this.c = md4Var;
        this.d = d13Var;
        this.q = x34Var;
    }

    public static kh4 a(oz1 oz1Var, Object obj, long j, ez1 ez1Var, sw1 sw1Var) {
        oz1Var.o(obj, sw1Var);
        oz1Var.b(sw1Var.c, ez1Var, 0L);
        oz1Var.e(obj);
        sw1Var.f.getClass();
        oz1Var.o(obj, sw1Var);
        sw1Var.f.a(-1);
        return new kh4(obj, j, -1);
    }

    public final pb4 A(jh4 jh4Var) {
        for (int i = 0; i < this.p.size(); i++) {
            pb4 pb4Var = (pb4) this.p.get(i);
            if (pb4Var.a == jh4Var) {
                return pb4Var;
            }
        }
        return null;
    }

    public final void B() {
        if (this.m == 0) {
            return;
        }
        pb4 pb4Var = this.h;
        pb4Var.getClass();
        this.n = pb4Var.b;
        this.o = pb4Var.g.a.d;
        while (pb4Var != null) {
            pb4Var.h();
            pb4Var = pb4Var.m;
        }
        this.h = null;
        this.k = null;
        this.i = null;
        this.j = null;
        this.m = 0;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
    
        return y(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(defpackage.oz1 r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            pb4 r2 = r0.h
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Laa
            qb4 r5 = r2.g
            if (r3 != 0) goto L15
            qb4 r3 = r0.D(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            qb4 r8 = r0.e(r1, r3, r6)
            if (r8 == 0) goto La5
            long r9 = r5.b
            long r11 = r8.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto La5
            kh4 r9 = r5.a
            kh4 r10 = r8.a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto La5
            r3 = r8
        L30:
            long r8 = r5.c
            qb4 r8 = r3.b(r8)
            r2.g = r8
            long r9 = r5.e
            long r11 = r3.e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L9e
            java.lang.Object r1 = r2.a
            boolean r3 = r1 instanceof defpackage.rg4
            r5 = -9223372036854775808
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L58
            long r7 = r8.d
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 != 0) goto L54
            r7 = r5
        L54:
            rg4 r1 = (defpackage.rg4) r1
            r1.j = r7
        L58:
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L65
        L62:
            long r7 = r2.p
            long r7 = r7 + r11
        L65:
            pb4 r1 = r0.i
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
            pb4 r11 = r0.j
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
            pb4 r3 = r2.m
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb4.C(oz1, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qb4 D(defpackage.oz1 r19, defpackage.qb4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            kh4 r3 = r2.a
            boolean r4 = r3.b()
            int r5 = r3.e
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
            int r4 = r3.b
            boolean r12 = r0.i(r1, r3)
            boolean r13 = r0.j(r1, r3, r11)
            java.lang.Object r7 = r3.a
            sw1 r8 = r0.a
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
            zb2 r1 = r8.f
            cd1 r1 = r1.a(r5)
            r1.getClass()
            r16 = r9
        L46:
            boolean r1 = r3.b()
            if (r1 == 0) goto L56
            int r1 = r3.c
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
            long r9 = r8.d
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
            qb4 r1 = new qb4
            r5 = r3
            long r3 = r2.b
            long r6 = r2.c
            r2 = r5
            r5 = r6
            r7 = r9
            r9 = r14
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb4.D(oz1, qb4):qb4");
    }

    public final kh4 E(oz1 oz1Var, Object obj) {
        long jC;
        int iE;
        sw1 sw1Var = this.a;
        int i = oz1Var.o(obj, sw1Var).c;
        Object obj2 = this.n;
        if (obj2 == null || (iE = oz1Var.e(obj2)) == -1 || oz1Var.d(iE, sw1Var, false).c != i) {
            pb4 pb4Var = this.h;
            while (true) {
                if (pb4Var == null) {
                    pb4 pb4Var2 = this.h;
                    while (true) {
                        if (pb4Var2 != null) {
                            int iE2 = oz1Var.e(pb4Var2.b);
                            if (iE2 != -1 && oz1Var.d(iE2, sw1Var, false).c == i) {
                                jC = pb4Var2.g.a.d;
                                break;
                            }
                            pb4Var2 = pb4Var2.m;
                        } else {
                            jC = c(obj);
                            if (jC == -1) {
                                jC = this.e;
                                this.e = 1 + jC;
                                if (this.h == null) {
                                    this.n = obj;
                                    this.o = jC;
                                }
                            }
                        }
                    }
                } else {
                    if (pb4Var.b.equals(obj)) {
                        jC = pb4Var.g.a.d;
                        break;
                    }
                    pb4Var = pb4Var.m;
                }
            }
        } else {
            jC = this.o;
        }
        long j = jC;
        oz1Var.o(obj, sw1Var);
        int i2 = sw1Var.c;
        ez1 ez1Var = this.b;
        oz1Var.b(i2, ez1Var, 0L);
        for (int iE3 = oz1Var.e(obj); iE3 >= ez1Var.k; iE3--) {
            oz1Var.d(iE3, sw1Var, true);
            sw1Var.f.getClass();
            sw1Var.f.a(-1);
        }
        return a(oz1Var, obj, j, ez1Var, sw1Var);
    }

    public final void b() {
        vm3 vm3Var = xm3.g;
        um3 um3Var = new um3(4);
        for (pb4 pb4Var = this.h; pb4Var != null; pb4Var = pb4Var.m) {
            um3Var.a(pb4Var.g.a);
        }
        pb4 pb4Var2 = this.i;
        this.d.d(new gi(this, um3Var, pb4Var2 == null ? null : pb4Var2.g.a, 25));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.p.size(); i++) {
            pb4 pb4Var = (pb4) this.p.get(i);
            if (pb4Var.b.equals(obj)) {
                return pb4Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int d(oz1 oz1Var) {
        oz1 oz1Var2;
        pb4 pb4Var;
        pb4 pb4Var2 = this.h;
        if (pb4Var2 == null) {
            return 0;
        }
        int iE = oz1Var.e(pb4Var2.b);
        while (true) {
            oz1Var2 = oz1Var;
            iE = oz1Var2.l(iE, this.a, this.b, this.f, this.g);
            while (true) {
                pb4Var = pb4Var2.m;
                if (pb4Var == null || pb4Var2.g.f) {
                    break;
                }
                pb4Var2 = pb4Var;
            }
            if (iE == -1 || pb4Var == null || oz1Var2.e(pb4Var.b) != iE) {
                break;
            }
            pb4Var2 = pb4Var;
            oz1Var = oz1Var2;
        }
        int iY = y(pb4Var2);
        pb4Var2.g = D(oz1Var2, pb4Var2.g);
        return iY;
    }

    public final qb4 e(oz1 oz1Var, pb4 pb4Var, long j) {
        int i;
        oz1 oz1Var2;
        sw1 sw1Var;
        long jLongValue;
        long j2;
        int i2;
        Object obj;
        oz1 oz1Var3;
        ez1 ez1Var;
        Object obj2;
        long j3;
        qb4 qb4Var = pb4Var.g;
        long j4 = pb4Var.p;
        long j5 = qb4Var.e;
        long j6 = qb4Var.c;
        kh4 kh4Var = qb4Var.a;
        long j7 = (j4 + j5) - j;
        if (qb4Var.f) {
            Object obj3 = kh4Var.a;
            int iE = oz1Var.e(obj3);
            int i3 = this.f;
            boolean z = this.g;
            sw1 sw1Var2 = this.a;
            ez1 ez1Var2 = this.b;
            long j8 = 0;
            int iL = oz1Var.l(iE, sw1Var2, ez1Var2, i3, z);
            if (iL != -1) {
                int i4 = oz1Var.d(iL, sw1Var2, true).c;
                Object obj4 = sw1Var2.b;
                obj4.getClass();
                long j9 = kh4Var.d;
                if (oz1Var.b(i4, ez1Var2, 0L).k == iL) {
                    long jMax = Math.max(0L, j7);
                    obj = obj3;
                    Pair pairN = oz1Var.n(ez1Var2, sw1Var2, i4, -9223372036854775807L, jMax);
                    if (pairN != null) {
                        Object obj5 = pairN.first;
                        long jLongValue2 = ((Long) pairN.second).longValue();
                        pb4 pb4Var2 = pb4Var.m;
                        if (pb4Var2 == null || !pb4Var2.b.equals(obj5)) {
                            long jC = c(obj5);
                            if (jC == -1) {
                                jC = this.e;
                                this.e = 1 + jC;
                            }
                            j9 = jC;
                        } else {
                            j9 = pb4Var2.g.a.d;
                        }
                        oz1Var3 = oz1Var;
                        j8 = jLongValue2;
                        j3 = -9223372036854775807L;
                        ez1Var = ez1Var2;
                        obj2 = obj5;
                    }
                } else {
                    obj = obj3;
                    oz1Var3 = oz1Var;
                    ez1Var = ez1Var2;
                    obj2 = obj4;
                    j3 = 0;
                }
                kh4 kh4VarA = a(oz1Var3, obj2, j9, ez1Var, sw1Var2);
                if (j3 != -9223372036854775807L && j6 != -9223372036854775807L) {
                    oz1Var3.o(obj, sw1Var2).f.getClass();
                    sw1Var2.f.getClass();
                }
                return f(oz1Var3, kh4VarA, j3, j8);
            }
        } else {
            Object obj6 = kh4Var.a;
            sw1 sw1Var3 = this.a;
            oz1Var.o(obj6, sw1Var3);
            if (!kh4Var.b()) {
                int i5 = kh4Var.e;
                if (i5 != -1) {
                    sw1Var3.f.getClass();
                    if (i5 == -1) {
                        sw1Var3.f.a(-1);
                    }
                }
                cd1 cd1VarA = sw1Var3.f.a(i5);
                int i6 = 0;
                while (true) {
                    int[] iArr = cd1VarA.d;
                    if (i6 >= iArr.length || (i = iArr[i6]) == 0 || i == 1) {
                        break;
                    }
                    i6++;
                }
                sw1Var3.c(i5);
                if (i6 != sw1Var3.f.a(i5).a) {
                    return g(oz1Var, obj6, i5, i6, j5, kh4Var.d);
                }
                oz1Var.o(obj6, sw1Var3);
                sw1Var3.f.a(i5).getClass();
                sw1Var3.f.a(i5).getClass();
                return h(oz1Var, obj6, 0L, j5, kh4Var.d);
            }
            int i7 = kh4Var.b;
            if (sw1Var3.f.a(i7).a != -1) {
                int i8 = kh4Var.c;
                cd1 cd1VarA2 = sw1Var3.f.a(i7);
                int i9 = i8 + 1;
                while (true) {
                    int[] iArr2 = cd1VarA2.d;
                    if (i9 >= iArr2.length || (i2 = iArr2[i9]) == 0 || i2 == 1) {
                        break;
                    }
                    i9++;
                }
                if (i9 < 0) {
                    return g(oz1Var, obj6, i7, i9, qb4Var.c, kh4Var.d);
                }
                if (j6 == -9223372036854775807L) {
                    sw1Var = sw1Var3;
                    oz1Var2 = oz1Var;
                    Pair pairN2 = oz1Var2.n(this.b, sw1Var, sw1Var3.c, -9223372036854775807L, Math.max(0L, j7));
                    if (pairN2 == null) {
                        return null;
                    }
                    jLongValue = ((Long) pairN2.second).longValue();
                    j2 = -9223372036854775807L;
                } else {
                    oz1Var2 = oz1Var;
                    sw1Var = sw1Var3;
                    jLongValue = j6;
                    j2 = jLongValue;
                }
                oz1Var2.o(obj6, sw1Var);
                sw1Var.f.a(i7).getClass();
                sw1Var.f.a(i7).getClass();
                return h(oz1Var2, obj6, Math.max(0L, jLongValue), j2, kh4Var.d);
            }
        }
        return null;
    }

    public final qb4 f(oz1 oz1Var, kh4 kh4Var, long j, long j2) {
        Object obj = kh4Var.a;
        oz1Var.o(obj, this.a);
        return kh4Var.b() ? g(oz1Var, obj, kh4Var.b, kh4Var.c, j, kh4Var.d) : h(oz1Var, obj, j2, j, kh4Var.d);
    }

    public final qb4 g(oz1 oz1Var, Object obj, int i, int i2, long j, long j2) {
        int i3;
        kh4 kh4Var = new kh4(obj, i, i2, j2, -1);
        sw1 sw1Var = this.a;
        long jB = oz1Var.o(obj, sw1Var).b(i, i2);
        cd1 cd1VarA = sw1Var.f.a(i);
        int i4 = 0;
        while (true) {
            int[] iArr = cd1VarA.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        if (i2 == i4) {
            sw1Var.f.getClass();
        }
        sw1Var.c(i);
        long jMax = 0;
        if (jB != -9223372036854775807L && jB <= 0) {
            jMax = Math.max(0L, (-1) + jB);
        }
        return new qb4(kh4Var, jMax, j, -9223372036854775807L, jB, false, false, false);
    }

    public final qb4 h(oz1 oz1Var, Object obj, long j, long j2, long j3) {
        sw1 sw1Var = this.a;
        oz1Var.o(obj, sw1Var);
        sw1Var.getClass();
        sw1Var.f.getClass();
        kh4 kh4Var = new kh4(obj, j3, -1);
        boolean z = !kh4Var.b();
        boolean zI = i(oz1Var, kh4Var);
        boolean zJ = j(oz1Var, kh4Var, z);
        long j4 = sw1Var.d;
        return new qb4(kh4Var, (j4 == -9223372036854775807L || j < j4) ? j : Math.max(0L, (-1) + j4), j2, -9223372036854775807L, j4, z, zI, zJ);
    }

    public final boolean i(oz1 oz1Var, kh4 kh4Var) {
        if (!kh4Var.b() && kh4Var.e == -1) {
            Object obj = kh4Var.a;
            int i = oz1Var.o(obj, this.a).c;
            if (oz1Var.b(i, this.b, 0L).l == oz1Var.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(oz1 oz1Var, kh4 kh4Var, boolean z) {
        int iE = oz1Var.e(kh4Var.a);
        sw1 sw1Var = this.a;
        int i = oz1Var.d(iE, sw1Var, false).c;
        ez1 ez1Var = this.b;
        return !oz1Var.b(i, ez1Var, 0L).g && oz1Var.l(iE, sw1Var, ez1Var, this.f, this.g) == -1 && z;
    }

    public final int k(oz1 oz1Var, int i) {
        this.f = i;
        return d(oz1Var);
    }

    public final int l(oz1 oz1Var, boolean z) {
        this.g = z;
        return d(oz1Var);
    }

    public final void m(la4 la4Var) {
        la4Var.getClass();
        r();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mi4] */
    public final void n(long j) {
        pb4 pb4Var = this.k;
        if (pb4Var != null) {
            zt0.b0(pb4Var.m == null);
            if (pb4Var.e) {
                pb4Var.a.k(j - pb4Var.p);
            }
        }
    }

    public final boolean o() {
        pb4 pb4Var = this.k;
        if (pb4Var != null) {
            return !pb4Var.g.h && pb4Var.b() && this.k.g.e != -9223372036854775807L && this.m < 100;
        }
        return true;
    }

    public final qb4 p(long j, dc4 dc4Var) {
        pb4 pb4Var = this.k;
        return pb4Var == null ? f(dc4Var.a, dc4Var.b, dc4Var.c, dc4Var.r) : e(dc4Var.a, pb4Var, j);
    }

    public final pb4 q(qb4 qb4Var) {
        pb4 pb4Var;
        long j = qb4Var.b;
        pb4 pb4Var2 = this.k;
        long j2 = pb4Var2 == null ? 1000000000000L : (pb4Var2.p + pb4Var2.g.e) - j;
        int i = 0;
        while (true) {
            if (i >= this.p.size()) {
                pb4Var = null;
                break;
            }
            qb4 qb4Var2 = ((pb4) this.p.get(i)).g;
            long j3 = qb4Var2.e;
            long j4 = qb4Var.e;
            if ((j3 == -9223372036854775807L || j3 == j4) && qb4Var2.b == j && qb4Var2.a.equals(qb4Var.a)) {
                pb4Var = (pb4) this.p.remove(i);
                break;
            }
            i++;
        }
        if (pb4Var == null) {
            jb4 jb4Var = (jb4) this.q.f;
            rj4 rj4VarI = jb4Var.k.i(jb4Var.z);
            jb4Var.d0.getClass();
            pb4Var = new pb4(jb4Var.g, j2, jb4Var.i, rj4VarI, jb4Var.x, qb4Var, jb4Var.j);
        } else {
            pb4Var.g = qb4Var;
            pb4Var.p = j2;
        }
        pb4 pb4Var3 = this.k;
        if (pb4Var3 == null) {
            this.h = pb4Var;
            this.i = pb4Var;
            this.j = pb4Var;
        } else if (pb4Var != pb4Var3.m) {
            pb4Var3.l();
            pb4Var3.m = pb4Var;
        }
        this.n = null;
        this.k = pb4Var;
        this.m++;
        b();
        return pb4Var;
    }

    public final void r() {
        if (this.p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.p.size(); i++) {
            ((pb4) this.p.get(i)).h();
        }
        this.p = arrayList;
        this.l = null;
        z();
    }

    public final pb4 s() {
        return this.h;
    }

    public final pb4 t() {
        return this.i;
    }

    public final pb4 u() {
        return this.j;
    }

    public final pb4 v() {
        pb4 pb4Var = this.j;
        pb4 pb4Var2 = this.i;
        if (pb4Var == pb4Var2) {
            pb4Var2.getClass();
            this.j = pb4Var2.m;
        }
        pb4Var2.getClass();
        this.i = pb4Var2.m;
        b();
        pb4 pb4Var3 = this.i;
        pb4Var3.getClass();
        return pb4Var3;
    }

    public final void w() {
        pb4 pb4Var = this.j;
        pb4Var.getClass();
        this.j = pb4Var.m;
        b();
        this.j.getClass();
    }

    public final pb4 x() {
        pb4 pb4Var = this.h;
        if (pb4Var == null) {
            return null;
        }
        if (pb4Var == this.i) {
            this.i = pb4Var.m;
        }
        if (pb4Var == this.j) {
            this.j = pb4Var.m;
        }
        pb4Var.h();
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            this.k = null;
            pb4 pb4Var2 = this.h;
            this.n = pb4Var2.b;
            this.o = pb4Var2.g.a.d;
        }
        this.h = this.h.m;
        b();
        return this.h;
    }

    public final int y(pb4 pb4Var) {
        pb4Var.getClass();
        int i = 0;
        if (pb4Var.equals(this.k)) {
            return 0;
        }
        this.k = pb4Var;
        int i2 = 0;
        while (true) {
            pb4Var = pb4Var.m;
            if (pb4Var == null) {
                break;
            }
            if (pb4Var == this.i) {
                pb4 pb4Var2 = this.h;
                this.i = pb4Var2;
                this.j = pb4Var2;
                i2 = 3;
            }
            if (pb4Var == this.j) {
                this.j = this.i;
                i2 |= 2;
            }
            pb4Var.h();
            this.m--;
        }
        pb4 pb4Var3 = this.k;
        pb4Var3.getClass();
        if (pb4Var3.m != null) {
            pb4Var3.l();
            pb4Var3.m = null;
            while (true) {
                pj4 pj4Var = pb4Var3.o;
                if (i >= pj4Var.f) {
                    break;
                }
                pj4Var.a(i);
                nj4 nj4Var = ((nj4[]) pb4Var3.o.h)[i];
                i++;
            }
        }
        b();
        return i2;
    }

    public final void z() {
        pb4 pb4Var = this.l;
        if (pb4Var == null || pb4Var.c()) {
            this.l = null;
            for (int i = 0; i < this.p.size(); i++) {
                pb4 pb4Var2 = (pb4) this.p.get(i);
                if (!pb4Var2.c()) {
                    this.l = pb4Var2;
                    return;
                }
            }
        }
    }
}
