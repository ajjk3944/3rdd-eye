package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4432a;

    /* renamed from: b, reason: collision with root package name */
    public long f4433b;

    /* renamed from: c, reason: collision with root package name */
    public int f4434c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4435d;

    /* renamed from: e, reason: collision with root package name */
    public int f4436e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4437f;

    /* renamed from: g, reason: collision with root package name */
    public long f4438g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4439h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4440i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4441l;

    /* renamed from: m, reason: collision with root package name */
    public Object f4442m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4443n;

    public s0(Handler handler, AnalyticsCollector analyticsCollector) {
        this.f4432a = 0;
        this.j = analyticsCollector;
        this.k = handler;
        this.f4439h = new u1();
        this.f4440i = new v1();
    }

    public static o5.z u(androidx.media3.common.a1 a1Var, Object obj, long j, long j7, androidx.media3.common.z0 z0Var, androidx.media3.common.y0 y0Var) {
        a1Var.g(obj, y0Var);
        a1Var.n(y0Var.f1829g, z0Var);
        int iB = a1Var.b(obj);
        while (y0Var.f1830r == 0) {
            androidx.media3.common.b bVar = y0Var.B;
            if (bVar.f1566a <= 0 || !y0Var.g(bVar.f1569r) || y0Var.c(0L) != -1) {
                break;
            }
            int i10 = iB + 1;
            if (iB >= z0Var.L) {
                break;
            }
            a1Var.f(i10, y0Var, true);
            obj = y0Var.f1828d;
            obj.getClass();
            iB = i10;
        }
        a1Var.g(obj, y0Var);
        int iC = y0Var.c(j);
        return iC == -1 ? new o5.z(y0Var.b(j), j7, obj) : new o5.z(obj, iC, y0Var.f(iC), j7, -1);
    }

    public static ya.v w(w1 w1Var, Object obj, long j, long j7, u1 u1Var) {
        w1Var.g(obj, u1Var);
        za.b bVar = u1Var.f4600g;
        int i10 = bVar.f26806a - 1;
        while (i10 >= 0 && j != Long.MIN_VALUE) {
            bVar.a(i10).getClass();
            if (j >= 0) {
                break;
            }
            i10--;
        }
        if (i10 < 0) {
            i10 = -1;
        } else {
            za.a aVarA = bVar.a(i10);
            int i11 = aVarA.f26800a;
            if (i11 != -1) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = aVarA.f26802c[i12];
                    if (i13 == 0 || i13 == 1) {
                        break;
                    }
                }
                i10 = -1;
            }
        }
        if (i10 == -1) {
            return new ya.v(u1Var.b(j), j7, obj);
        }
        return new ya.v(obj, i10, u1Var.d(i10), j7, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return !r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r14 = t(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A(androidx.media3.common.a1 r14, long r15, long r17) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4441l
            com.google.android.exoplayer2.q0 r0 = (com.google.android.exoplayer2.q0) r0
            r1 = 0
        L5:
            r2 = 1
            if (r0 == 0) goto L92
            java.lang.Object r3 = r0.j
            d5.g0 r3 = (d5.g0) r3
            if (r1 != 0) goto L14
            d5.g0 r1 = r13.m(r14, r3)
            r4 = r15
            goto L34
        L14:
            r4 = r15
            d5.g0 r6 = r13.e(r14, r1, r4)
            if (r6 != 0) goto L21
            boolean r14 = r13.t(r1)
        L1f:
            r14 = r14 ^ r2
            return r14
        L21:
            long r7 = r3.f6989b
            long r9 = r6.f6989b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8d
            o5.z r7 = r3.f6988a
            o5.z r8 = r6.f6988a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8d
            r1 = r6
        L34:
            long r6 = r1.f6992e
            long r8 = r3.f6990c
            d5.g0 r1 = r1.a(r8)
            r0.j = r1
            long r8 = r3.f6992e
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L84
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L4e
            goto L84
        L4e:
            r0.j()
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 != 0) goto L5b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5e
        L5b:
            long r3 = r0.f4407h
            long r3 = r3 + r6
        L5e:
            java.lang.Object r14 = r13.f4442m
            com.google.android.exoplayer2.q0 r14 = (com.google.android.exoplayer2.q0) r14
            r1 = 0
            if (r0 != r14) goto L79
            java.lang.Object r14 = r0.j
            d5.g0 r14 = (d5.g0) r14
            boolean r14 = r14.f6993f
            if (r14 != 0) goto L79
            r5 = -9223372036854775808
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 == 0) goto L77
            int r14 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r14 < 0) goto L79
        L77:
            r14 = r2
            goto L7a
        L79:
            r14 = r1
        L7a:
            boolean r0 = r13.t(r0)
            if (r0 != 0) goto L83
            if (r14 != 0) goto L83
            goto L92
        L83:
            return r1
        L84:
            java.lang.Object r1 = r0.f4411n
            com.google.android.exoplayer2.q0 r1 = (com.google.android.exoplayer2.q0) r1
            r12 = r1
            r1 = r0
            r0 = r12
            goto L5
        L8d:
            boolean r14 = r13.t(r1)
            goto L1f
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.A(androidx.media3.common.a1, long, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return !r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r14 = s(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean B(com.google.android.exoplayer2.w1 r14, long r15, long r17) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4441l
            com.google.android.exoplayer2.q0 r0 = (com.google.android.exoplayer2.q0) r0
            r1 = 0
        L5:
            r2 = 1
            if (r0 == 0) goto L92
            java.lang.Object r3 = r0.j
            com.google.android.exoplayer2.r0 r3 = (com.google.android.exoplayer2.r0) r3
            if (r1 != 0) goto L14
            com.google.android.exoplayer2.r0 r1 = r13.l(r14, r3)
            r4 = r15
            goto L34
        L14:
            r4 = r15
            com.google.android.exoplayer2.r0 r6 = r13.d(r14, r1, r4)
            if (r6 != 0) goto L21
            boolean r14 = r13.s(r1)
        L1f:
            r14 = r14 ^ r2
            return r14
        L21:
            long r7 = r3.f4422b
            long r9 = r6.f4422b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8d
            ya.v r7 = r3.f4421a
            ya.v r8 = r6.f4421a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8d
            r1 = r6
        L34:
            long r6 = r1.f4425e
            long r8 = r3.f4423c
            com.google.android.exoplayer2.r0 r1 = r1.a(r8)
            r0.j = r1
            long r8 = r3.f4425e
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L84
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L4e
            goto L84
        L4e:
            r0.j()
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 != 0) goto L5b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5e
        L5b:
            long r3 = r0.f4407h
            long r3 = r3 + r6
        L5e:
            java.lang.Object r14 = r13.f4442m
            com.google.android.exoplayer2.q0 r14 = (com.google.android.exoplayer2.q0) r14
            r1 = 0
            if (r0 != r14) goto L79
            java.lang.Object r14 = r0.j
            com.google.android.exoplayer2.r0 r14 = (com.google.android.exoplayer2.r0) r14
            boolean r14 = r14.f4426f
            if (r14 != 0) goto L79
            r5 = -9223372036854775808
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 == 0) goto L77
            int r14 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r14 < 0) goto L79
        L77:
            r14 = r2
            goto L7a
        L79:
            r14 = r1
        L7a:
            boolean r0 = r13.s(r0)
            if (r0 != 0) goto L83
            if (r14 != 0) goto L83
            goto L92
        L83:
            return r1
        L84:
            java.lang.Object r1 = r0.f4411n
            com.google.android.exoplayer2.q0 r1 = (com.google.android.exoplayer2.q0) r1
            r12 = r1
            r1 = r0
            r0 = r12
            goto L5
        L8d:
            boolean r14 = r13.s(r1)
            goto L1f
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.B(com.google.android.exoplayer2.w1, long, long):boolean");
    }

    public q0 a() {
        q0 q0Var = (q0) this.f4441l;
        if (q0Var == null) {
            return null;
        }
        if (q0Var == ((q0) this.f4442m)) {
            this.f4442m = (q0) q0Var.f4411n;
        }
        q0Var.g();
        int i10 = this.f4436e - 1;
        this.f4436e = i10;
        if (i10 == 0) {
            this.f4443n = null;
            q0 q0Var2 = (q0) this.f4441l;
            this.f4437f = q0Var2.f4402c;
            this.f4438g = ((r0) q0Var2.j).f4421a.f26180d;
        }
        this.f4441l = (q0) ((q0) this.f4441l).f4411n;
        r();
        return (q0) this.f4441l;
    }

    public q0 b() {
        q0 q0Var = (q0) this.f4441l;
        if (q0Var == null) {
            return null;
        }
        if (q0Var == ((q0) this.f4442m)) {
            this.f4442m = (q0) q0Var.f4411n;
        }
        q0Var.g();
        int i10 = this.f4436e - 1;
        this.f4436e = i10;
        if (i10 == 0) {
            this.f4443n = null;
            q0 q0Var2 = (q0) this.f4441l;
            this.f4437f = q0Var2.f4402c;
            this.f4438g = ((d5.g0) q0Var2.j).f6988a.f1692d;
        }
        this.f4441l = (q0) ((q0) this.f4441l).f4411n;
        r();
        return (q0) this.f4441l;
    }

    public final void c() {
        switch (this.f4432a) {
            case 0:
                if (this.f4436e != 0) {
                    q0 q0Var = (q0) this.f4441l;
                    qb.b.k(q0Var);
                    this.f4437f = q0Var.f4402c;
                    this.f4438g = ((r0) q0Var.j).f4421a.f26180d;
                    while (q0Var != null) {
                        q0Var.g();
                        q0Var = (q0) q0Var.f4411n;
                    }
                    this.f4441l = null;
                    this.f4443n = null;
                    this.f4442m = null;
                    this.f4436e = 0;
                    r();
                    break;
                }
                break;
            default:
                if (this.f4436e != 0) {
                    q0 q0Var2 = (q0) this.f4441l;
                    a5.a.j(q0Var2);
                    this.f4437f = q0Var2.f4402c;
                    this.f4438g = ((d5.g0) q0Var2.j).f6988a.f1692d;
                    while (q0Var2 != null) {
                        q0Var2.g();
                        q0Var2 = (q0) q0Var2.f4411n;
                    }
                    this.f4441l = null;
                    this.f4443n = null;
                    this.f4442m = null;
                    this.f4436e = 0;
                    r();
                    break;
                }
                break;
        }
    }

    public r0 d(w1 w1Var, q0 q0Var, long j) {
        w1 w1Var2;
        u1 u1Var;
        Object obj;
        long j7;
        long j10;
        u1 u1Var2 = (u1) this.f4439h;
        r0 r0Var = (r0) q0Var.j;
        long j11 = q0Var.f4407h;
        long j12 = r0Var.f4425e;
        ya.v vVar = r0Var.f4421a;
        long j13 = (j11 + j12) - j;
        if (r0Var.f4427g) {
            long j14 = 0;
            int iD = w1Var.d(w1Var.b(vVar.f26177a), (u1) this.f4439h, (v1) this.f4440i, this.f4434c, this.f4435d);
            if (iD != -1) {
                int i10 = w1Var.f(iD, u1Var2, true).f4596c;
                Object obj2 = u1Var2.f4595b;
                long j15 = vVar.f26180d;
                if (w1Var.m(i10, (v1) this.f4440i, 0L).f4752o == iD) {
                    Pair pairJ = w1Var.j((v1) this.f4440i, (u1) this.f4439h, i10, -9223372036854775807L, Math.max(0L, j13));
                    if (pairJ != null) {
                        Object obj3 = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        q0 q0Var2 = (q0) q0Var.f4411n;
                        if (q0Var2 == null || !q0Var2.f4402c.equals(obj3)) {
                            j10 = this.f4433b;
                            this.f4433b = 1 + j10;
                        } else {
                            j10 = ((r0) q0Var2.j).f4421a.f26180d;
                        }
                        j15 = j10;
                        obj = obj3;
                        j7 = jLongValue;
                        j14 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j7 = 0;
                }
                return f(w1Var, w(w1Var, obj, j7, j15, (u1) this.f4439h), j14, j7);
            }
            return null;
        }
        Object obj4 = vVar.f26177a;
        int i11 = vVar.f26181e;
        w1Var.g(obj4, u1Var2);
        if (!vVar.a()) {
            int iD2 = u1Var2.d(i11);
            if (iD2 != u1Var2.f4600g.a(i11).f26800a) {
                return h(w1Var, vVar.f26177a, vVar.f26181e, iD2, r0Var.f4425e, vVar.f26180d);
            }
            w1Var.g(obj4, u1Var2);
            u1Var2.c(i11);
            u1Var2.f4600g.a(i11).getClass();
            return j(w1Var, vVar.f26177a, 0L, r0Var.f4425e, vVar.f26180d);
        }
        int i12 = vVar.f26178b;
        int i13 = u1Var2.f4600g.a(i12).f26800a;
        if (i13 == -1) {
            return null;
        }
        int iA = u1Var2.f4600g.a(i12).a(vVar.f26179c);
        if (iA < i13) {
            return h(w1Var, vVar.f26177a, i12, iA, r0Var.f4423c, vVar.f26180d);
        }
        long jLongValue2 = r0Var.f4423c;
        if (jLongValue2 == -9223372036854775807L) {
            Pair pairJ2 = w1Var.j((v1) this.f4440i, u1Var2, u1Var2.f4596c, -9223372036854775807L, Math.max(0L, j13));
            u1Var = u1Var2;
            w1Var2 = w1Var;
            if (pairJ2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairJ2.second).longValue();
        } else {
            w1Var2 = w1Var;
            u1Var = u1Var2;
        }
        int i14 = vVar.f26178b;
        w1Var2.g(obj4, u1Var);
        u1Var.c(i14);
        u1Var.f4600g.a(i14).getClass();
        return j(w1Var, vVar.f26177a, Math.max(0L, jLongValue2), r0Var.f4423c, vVar.f26180d);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d5.g0 e(androidx.media3.common.a1 r28, com.google.android.exoplayer2.q0 r29, long r30) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.e(androidx.media3.common.a1, com.google.android.exoplayer2.q0, long):d5.g0");
    }

    public r0 f(w1 w1Var, ya.v vVar, long j, long j7) {
        w1Var.g(vVar.f26177a, (u1) this.f4439h);
        return vVar.a() ? h(w1Var, vVar.f26177a, vVar.f26178b, vVar.f26179c, j, vVar.f26180d) : j(w1Var, vVar.f26177a, j7, j, vVar.f26180d);
    }

    public d5.g0 g(androidx.media3.common.a1 a1Var, o5.z zVar, long j, long j7) {
        a1Var.g(zVar.f1689a, (androidx.media3.common.y0) this.f4439h);
        return zVar.a() ? i(a1Var, zVar.f1689a, zVar.f1690b, zVar.f1691c, j, zVar.f1692d) : k(a1Var, zVar.f1689a, j7, j, zVar.f1692d);
    }

    public r0 h(w1 w1Var, Object obj, int i10, int i11, long j, long j7) {
        ya.v vVar = new ya.v(obj, i10, i11, j7, -1);
        u1 u1Var = (u1) this.f4439h;
        long jA = w1Var.g(obj, u1Var).a(i10, i11);
        if (i11 == u1Var.d(i10)) {
            u1Var.f4600g.getClass();
        }
        u1Var.e(i10);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new r0(vVar, jMax, j, -9223372036854775807L, jA, false, false, false, false);
    }

    public d5.g0 i(androidx.media3.common.a1 a1Var, Object obj, int i10, int i11, long j, long j7) {
        o5.z zVar = new o5.z(obj, i10, i11, j7, -1);
        androidx.media3.common.y0 y0Var = (androidx.media3.common.y0) this.f4439h;
        long jA = a1Var.g(obj, y0Var).a(i10, i11);
        long jMax = i11 == y0Var.f(i10) ? y0Var.B.f1567d : 0L;
        boolean zG = y0Var.g(i10);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new d5.g0(zVar, jMax, j, -9223372036854775807L, jA, zG, false, false, false);
    }

    public r0 j(w1 w1Var, Object obj, long j, long j7, long j10) {
        long j11;
        long jMax = j;
        u1 u1Var = (u1) this.f4439h;
        w1Var.g(obj, u1Var);
        int iB = u1Var.b(jMax);
        ya.v vVar = new ya.v(iB, j10, obj);
        boolean z10 = !vVar.a() && iB == -1;
        boolean zQ = q(w1Var, vVar);
        boolean zO = o(w1Var, vVar, z10);
        if (iB != -1) {
            u1Var.e(iB);
        }
        if (iB != -1) {
            u1Var.c(iB);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        long j12 = (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? u1Var.f4597d : j11;
        if (j12 != -9223372036854775807L && jMax >= j12) {
            jMax = Math.max(0L, j12 - 1);
        }
        return new r0(vVar, jMax, j7, j11, j12, false, z10, zQ, zO);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d5.g0 k(androidx.media3.common.a1 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.Object r5 = r0.f4439h
            androidx.media3.common.y0 r5 = (androidx.media3.common.y0) r5
            r1.g(r2, r5)
            int r6 = r5.b(r3)
            r7 = 1
            r9 = -1
            if (r6 != r9) goto L27
            androidx.media3.common.b r10 = r5.B
            int r11 = r10.f1566a
            if (r11 <= 0) goto L54
            int r10 = r10.f1569r
            boolean r10 = r5.g(r10)
            if (r10 == 0) goto L54
            r10 = r7
            goto L55
        L27:
            boolean r10 = r5.g(r6)
            if (r10 == 0) goto L54
            long r10 = r5.d(r6)
            long r12 = r5.f1830r
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L54
            androidx.media3.common.b r10 = r5.B
            androidx.media3.common.a r10 = r10.a(r6)
            int r11 = r10.f1555d
            if (r11 != r9) goto L42
            goto L54
        L42:
            r12 = 0
        L43:
            if (r12 >= r11) goto L51
            int[] r13 = r10.f1558x
            r13 = r13[r12]
            if (r13 == 0) goto L54
            if (r13 != r7) goto L4e
            goto L54
        L4e:
            int r12 = r12 + 1
            goto L43
        L51:
            r10 = r7
            r6 = r9
            goto L55
        L54:
            r10 = 0
        L55:
            o5.z r12 = new o5.z
            r13 = r32
            r12.<init>(r6, r13, r2)
            boolean r2 = r12.a()
            if (r2 != 0) goto L66
            if (r6 != r9) goto L66
            r2 = r7
            goto L67
        L66:
            r2 = 0
        L67:
            boolean r23 = r0.p(r1, r12)
            boolean r24 = r0.n(r1, r12, r2)
            if (r6 == r9) goto L7a
            boolean r1 = r5.g(r6)
            if (r1 == 0) goto L7a
            r21 = r7
            goto L7c
        L7a:
            r21 = 0
        L7c:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L8a
            long r15 = r5.d(r6)
            r17 = r15
            goto L93
        L8a:
            if (r10 == 0) goto L91
            long r7 = r5.f1830r
            r17 = r7
            goto L93
        L91:
            r17 = r13
        L93:
            int r7 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r7 == 0) goto La1
            r7 = -9223372036854775808
            int r7 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r7 != 0) goto L9e
            goto La1
        L9e:
            r19 = r17
            goto La5
        La1:
            long r7 = r5.f1830r
            r19 = r7
        La5:
            int r5 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r5 == 0) goto Lbe
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 < 0) goto Lbe
            if (r24 != 0) goto Lb4
            if (r10 != 0) goto Lb2
            goto Lb4
        Lb2:
            r7 = 0
            goto Lb5
        Lb4:
            r7 = 1
        Lb5:
            long r3 = (long) r7
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lbe:
            r13 = r3
            d5.g0 r11 = new d5.g0
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.s0.k(androidx.media3.common.a1, java.lang.Object, long, long, long):d5.g0");
    }

    public r0 l(w1 w1Var, r0 r0Var) {
        long j;
        ya.v vVar = r0Var.f4421a;
        boolean zA = vVar.a();
        int i10 = vVar.f26181e;
        boolean z10 = !zA && i10 == -1;
        int i11 = vVar.f26178b;
        boolean zQ = q(w1Var, vVar);
        boolean zO = o(w1Var, vVar, z10);
        Object obj = vVar.f26177a;
        u1 u1Var = (u1) this.f4439h;
        w1Var.g(obj, u1Var);
        if (vVar.a() || i10 == -1) {
            j = -9223372036854775807L;
        } else {
            u1Var.c(i10);
            j = 0;
        }
        long jA = vVar.a() ? u1Var.a(i11, vVar.f26179c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? u1Var.f4597d : j;
        if (vVar.a()) {
            u1Var.e(i11);
        } else if (i10 != -1) {
            u1Var.e(i10);
        }
        return new r0(vVar, r0Var.f4422b, r0Var.f4423c, j, jA, false, z10, zQ, zO);
    }

    public d5.g0 m(androidx.media3.common.a1 a1Var, d5.g0 g0Var) {
        o5.z zVar = g0Var.f6988a;
        boolean zA = zVar.a();
        int i10 = zVar.f1693e;
        boolean z10 = !zA && i10 == -1;
        int i11 = zVar.f1690b;
        boolean zP = p(a1Var, zVar);
        boolean zN = n(a1Var, zVar, z10);
        Object obj = zVar.f1689a;
        androidx.media3.common.y0 y0Var = (androidx.media3.common.y0) this.f4439h;
        a1Var.g(obj, y0Var);
        long jD = (zVar.a() || i10 == -1) ? -9223372036854775807L : y0Var.d(i10);
        return new d5.g0(zVar, g0Var.f6989b, g0Var.f6990c, jD, zVar.a() ? y0Var.a(i11, zVar.f1691c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? y0Var.f1830r : jD, zVar.a() ? y0Var.g(i11) : i10 != -1 && y0Var.g(i10), z10, zP, zN);
    }

    public boolean n(androidx.media3.common.a1 a1Var, o5.z zVar, boolean z10) {
        int iB = a1Var.b(zVar.f1689a);
        return !a1Var.m(a1Var.f(iB, (androidx.media3.common.y0) this.f4439h, false).f1829g, (androidx.media3.common.z0) this.f4440i, 0L).E && a1Var.d(iB, (androidx.media3.common.y0) this.f4439h, (androidx.media3.common.z0) this.f4440i, this.f4434c, this.f4435d) == -1 && z10;
    }

    public boolean o(w1 w1Var, ya.v vVar, boolean z10) {
        int iB = w1Var.b(vVar.f26177a);
        return !w1Var.m(w1Var.f(iB, (u1) this.f4439h, false).f4596c, (v1) this.f4440i, 0L).f4748i && w1Var.d(iB, (u1) this.f4439h, (v1) this.f4440i, this.f4434c, this.f4435d) == -1 && z10;
    }

    public boolean p(androidx.media3.common.a1 a1Var, o5.z zVar) {
        boolean z10 = !zVar.a() && zVar.f1693e == -1;
        Object obj = zVar.f1689a;
        if (z10) {
            if (a1Var.m(a1Var.g(obj, (androidx.media3.common.y0) this.f4439h).f1829g, (androidx.media3.common.z0) this.f4440i, 0L).L == a1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean q(w1 w1Var, ya.v vVar) {
        boolean z10 = !vVar.a() && vVar.f26181e == -1;
        Object obj = vVar.f26177a;
        if (z10) {
            if (w1Var.m(w1Var.g(obj, (u1) this.f4439h).f4596c, (v1) this.f4440i, 0L).f4753p == w1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void r() {
        int i10 = this.f4432a;
        Object obj = this.k;
        switch (i10) {
            case 0:
                if (((AnalyticsCollector) this.j) != null) {
                    oe.f0 f0Var = oe.h0.f19336d;
                    oe.e0 e0Var = new oe.e0();
                    for (q0 q0Var = (q0) this.f4441l; q0Var != null; q0Var = (q0) q0Var.f4411n) {
                        e0Var.a(((r0) q0Var.j).f4421a);
                    }
                    q0 q0Var2 = (q0) this.f4442m;
                    ((Handler) obj).post(new ch.a(this, e0Var, q0Var2 != null ? ((r0) q0Var2.j).f4421a : null, 2));
                    break;
                }
                break;
            default:
                oe.f0 f0Var2 = oe.h0.f19336d;
                oe.e0 e0Var2 = new oe.e0();
                for (q0 q0Var3 = (q0) this.f4441l; q0Var3 != null; q0Var3 = (q0) q0Var3.f4411n) {
                    e0Var2.a(((d5.g0) q0Var3.j).f6988a);
                }
                q0 q0Var4 = (q0) this.f4442m;
                ((a5.z) obj).d(new ch.a(this, e0Var2, q0Var4 != null ? ((d5.g0) q0Var4.j).f6988a : null, 3));
                break;
        }
    }

    public boolean s(q0 q0Var) {
        boolean z10 = false;
        qb.b.j(q0Var != null);
        if (q0Var.equals((q0) this.f4443n)) {
            return false;
        }
        this.f4443n = q0Var;
        while (true) {
            q0Var = (q0) q0Var.f4411n;
            if (q0Var == null) {
                break;
            }
            if (q0Var == ((q0) this.f4442m)) {
                this.f4442m = (q0) this.f4441l;
                z10 = true;
            }
            q0Var.g();
            this.f4436e--;
        }
        q0 q0Var2 = (q0) this.f4443n;
        if (((q0) q0Var2.f4411n) != null) {
            q0Var2.c();
            q0Var2.f4411n = null;
            q0Var2.d();
        }
        r();
        return z10;
    }

    public boolean t(q0 q0Var) {
        boolean z10 = false;
        a5.a.i(q0Var != null);
        if (q0Var.equals((q0) this.f4443n)) {
            return false;
        }
        this.f4443n = q0Var;
        while (true) {
            q0Var = (q0) q0Var.f4411n;
            if (q0Var == null) {
                break;
            }
            if (q0Var == ((q0) this.f4442m)) {
                this.f4442m = (q0) this.f4441l;
                z10 = true;
            }
            q0Var.g();
            this.f4436e--;
        }
        q0 q0Var2 = (q0) this.f4443n;
        if (((q0) q0Var2.f4411n) != null) {
            q0Var2.c();
            q0Var2.f4411n = null;
            q0Var2.d();
        }
        r();
        return z10;
    }

    public ya.v v(w1 w1Var, Object obj, long j) {
        long j7;
        int iB;
        u1 u1Var = (u1) this.f4439h;
        int i10 = w1Var.g(obj, u1Var).f4596c;
        Object obj2 = this.f4437f;
        if (obj2 == null || (iB = w1Var.b(obj2)) == -1 || w1Var.f(iB, u1Var, false).f4596c != i10) {
            q0 q0Var = (q0) this.f4441l;
            while (true) {
                if (q0Var == null) {
                    q0 q0Var2 = (q0) this.f4441l;
                    while (true) {
                        if (q0Var2 != null) {
                            int iB2 = w1Var.b(q0Var2.f4402c);
                            if (iB2 != -1 && w1Var.f(iB2, u1Var, false).f4596c == i10) {
                                j7 = ((r0) q0Var2.j).f4421a.f26180d;
                                break;
                            }
                            q0Var2 = (q0) q0Var2.f4411n;
                        } else {
                            j7 = this.f4433b;
                            this.f4433b = 1 + j7;
                            if (((q0) this.f4441l) == null) {
                                this.f4437f = obj;
                                this.f4438g = j7;
                            }
                        }
                    }
                } else {
                    if (q0Var.f4402c.equals(obj)) {
                        j7 = ((r0) q0Var.j).f4421a.f26180d;
                        break;
                    }
                    q0Var = (q0) q0Var.f4411n;
                }
            }
        } else {
            j7 = this.f4438g;
        }
        return w(w1Var, obj, j, j7, (u1) this.f4439h);
    }

    public o5.z x(androidx.media3.common.a1 a1Var, Object obj, long j) {
        long j7;
        int iB;
        Object obj2 = obj;
        androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) this.f4440i;
        androidx.media3.common.y0 y0Var = (androidx.media3.common.y0) this.f4439h;
        int i10 = a1Var.g(obj2, y0Var).f1829g;
        Object obj3 = this.f4437f;
        if (obj3 == null || (iB = a1Var.b(obj3)) == -1 || a1Var.f(iB, y0Var, false).f1829g != i10) {
            q0 q0Var = (q0) this.f4441l;
            while (true) {
                if (q0Var == null) {
                    q0 q0Var2 = (q0) this.f4441l;
                    while (true) {
                        if (q0Var2 != null) {
                            int iB2 = a1Var.b(q0Var2.f4402c);
                            if (iB2 != -1 && a1Var.f(iB2, y0Var, false).f1829g == i10) {
                                j7 = ((d5.g0) q0Var2.j).f6988a.f1692d;
                                break;
                            }
                            q0Var2 = (q0) q0Var2.f4411n;
                        } else {
                            j7 = this.f4433b;
                            this.f4433b = 1 + j7;
                            if (((q0) this.f4441l) == null) {
                                this.f4437f = obj2;
                                this.f4438g = j7;
                            }
                        }
                    }
                } else {
                    if (q0Var.f4402c.equals(obj2)) {
                        j7 = ((d5.g0) q0Var.j).f6988a.f1692d;
                        break;
                    }
                    q0Var = (q0) q0Var.f4411n;
                }
            }
        } else {
            j7 = this.f4438g;
        }
        a1Var.g(obj2, y0Var);
        a1Var.n(y0Var.f1829g, z0Var);
        boolean z10 = false;
        for (int iB3 = a1Var.b(obj); iB3 >= z0Var.K; iB3--) {
            a1Var.f(iB3, y0Var, true);
            boolean z11 = y0Var.B.f1566a > 0;
            z10 |= z11;
            if (y0Var.c(y0Var.f1830r) != -1) {
                obj2 = y0Var.f1828d;
                obj2.getClass();
            }
            if (z10 && (!z11 || y0Var.f1830r != 0)) {
                break;
            }
        }
        return u(a1Var, obj2, j, j7, (androidx.media3.common.z0) this.f4440i, (androidx.media3.common.y0) this.f4439h);
    }

    public boolean y(androidx.media3.common.a1 a1Var) {
        androidx.media3.common.a1 a1Var2;
        q0 q0Var;
        q0 q0Var2 = (q0) this.f4441l;
        if (q0Var2 == null) {
            return true;
        }
        int iB = a1Var.b(q0Var2.f4402c);
        while (true) {
            a1Var2 = a1Var;
            iB = a1Var2.d(iB, (androidx.media3.common.y0) this.f4439h, (androidx.media3.common.z0) this.f4440i, this.f4434c, this.f4435d);
            while (true) {
                q0Var = (q0) q0Var2.f4411n;
                if (q0Var == null || ((d5.g0) q0Var2.j).f6994g) {
                    break;
                }
                q0Var2 = q0Var;
            }
            if (iB == -1 || q0Var == null || a1Var2.b(q0Var.f4402c) != iB) {
                break;
            }
            q0Var2 = q0Var;
            a1Var = a1Var2;
        }
        boolean zT = t(q0Var2);
        q0Var2.j = m(a1Var2, (d5.g0) q0Var2.j);
        return !zT;
    }

    public boolean z(w1 w1Var) {
        w1 w1Var2;
        q0 q0Var;
        q0 q0Var2 = (q0) this.f4441l;
        if (q0Var2 == null) {
            return true;
        }
        int iB = w1Var.b(q0Var2.f4402c);
        while (true) {
            w1Var2 = w1Var;
            iB = w1Var2.d(iB, (u1) this.f4439h, (v1) this.f4440i, this.f4434c, this.f4435d);
            while (true) {
                q0Var = (q0) q0Var2.f4411n;
                if (q0Var == null || ((r0) q0Var2.j).f4427g) {
                    break;
                }
                q0Var2 = q0Var;
            }
            if (iB == -1 || q0Var == null || w1Var2.b(q0Var.f4402c) != iB) {
                break;
            }
            q0Var2 = q0Var;
            w1Var = w1Var2;
        }
        boolean zS = s(q0Var2);
        q0Var2.j = l(w1Var2, (r0) q0Var2.j);
        return !zS;
    }

    public s0(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, a5.z zVar) {
        this.f4432a = 1;
        this.j = analyticsCollector;
        this.k = zVar;
        this.f4439h = new androidx.media3.common.y0();
        this.f4440i = new androidx.media3.common.z0();
    }
}
