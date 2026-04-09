package zt;

import java.util.Arrays;

/* loaded from: classes.dex */
public class e0 extends au.b implements f, g, au.o {
    public final yt.a B;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;

    /* renamed from: x, reason: collision with root package name */
    public final int f27541x;

    /* renamed from: y, reason: collision with root package name */
    public final int f27542y;

    public e0(int i10, int i11, yt.a aVar) {
        this.f27541x = i10;
        this.f27542y = i11;
        this.B = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r8.b() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        throw r8.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r0.f27537r = r5;
        r0.f27538x = r2;
        r0.f27539y = r9;
        r0.B = r8;
        r0.F = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r2.i(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x007a, B:34:0x0082, B:38:0x0095, B:41:0x009c, B:42:0x00a0, B:43:0x00a1, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093 A[EDGE_INSN: B:56:0x0093->B:37:0x0093 BREAK  A[LOOP:0: B:32:0x007a->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [au.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [zt.e0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [zt.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [au.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [zt.g0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [zt.g0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static qq.a j(zt.e0 r8, zt.g r9, pq.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof zt.d0
            if (r0 == 0) goto L13
            r0 = r10
            zt.d0 r0 = (zt.d0) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            zt.d0 r0 = new zt.d0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.D
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            wt.t0 r8 = r0.B
            zt.g0 r9 = r0.f27539y
            zt.g r2 = r0.f27538x
            zt.e0 r5 = r0.f27537r
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb5
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            wt.t0 r8 = r0.B
            zt.g0 r9 = r0.f27539y
            zt.g r2 = r0.f27538x
            zt.e0 r5 = r0.f27537r
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            zt.g0 r9 = r0.f27539y
            zt.g r8 = r0.f27538x
            zt.e0 r2 = r0.f27537r
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb5
        L5e:
            lf.t1.G(r10)
            au.d r10 = r8.b()
            zt.g0 r10 = (zt.g0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            pq.h r2 = r0.f21666d     // Catch: java.lang.Throwable -> Lb2
            br.l.b(r2)     // Catch: java.lang.Throwable -> Lb2
            wt.r r5 = wt.r.f24653d     // Catch: java.lang.Throwable -> Lb2
            pq.f r2 = r2.Y(r5)     // Catch: java.lang.Throwable -> Lb2
            wt.t0 r2 = (wt.t0) r2     // Catch: java.lang.Throwable -> Lb2
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            bu.t r6 = zt.f0.f27543a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f27537r = r5     // Catch: java.lang.Throwable -> L38
            r0.f27538x = r2     // Catch: java.lang.Throwable -> L38
            r0.f27539y = r9     // Catch: java.lang.Throwable -> L38
            r0.B = r8     // Catch: java.lang.Throwable -> L38
            r0.F = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            goto Lb1
        L93:
            if (r8 == 0) goto La1
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.y()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La1:
            r0.f27537r = r5     // Catch: java.lang.Throwable -> L38
            r0.f27538x = r2     // Catch: java.lang.Throwable -> L38
            r0.f27539y = r9     // Catch: java.lang.Throwable -> L38
            r0.B = r8     // Catch: java.lang.Throwable -> L38
            r0.F = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.i(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb1:
            return r1
        Lb2:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb5:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.e0.j(zt.e0, zt.g, pq.c):qq.a");
    }

    @Override // au.o
    public final f a(pq.h hVar, int i10, yt.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == yt.a.SUSPEND) ? this : new au.h(this, hVar, i10, aVar);
    }

    @Override // au.b
    public final au.d c() {
        g0 g0Var = new g0();
        g0Var.f27546a = -1L;
        return g0Var;
    }

    @Override // au.b
    public final au.d[] d() {
        return new g0[2];
    }

    public final Object g(g0 g0Var, d0 d0Var) {
        wt.g gVar = new wt.g(1, xu.l.D(d0Var));
        gVar.v();
        synchronized (this) {
            try {
                if (s(g0Var) < 0) {
                    g0Var.f27547b = gVar;
                } else {
                    gVar.g(lq.b0.f15562a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objU = gVar.u();
        return objU == qq.a.COROUTINE_SUSPENDED ? objU : lq.b0.f15562a;
    }

    public final void h() {
        if (this.f27542y != 0 || this.H > 1) {
            Object[] objArr = this.D;
            br.l.b(objArr);
            while (this.H > 0) {
                long jO = o();
                int i10 = this.G;
                int i11 = this.H;
                if (objArr[((int) ((jO + (i10 + i11)) - 1)) & (objArr.length - 1)] != f0.f27543a) {
                    return;
                }
                this.H = i11 - 1;
                f0.c(objArr, o() + this.G + this.H, null);
            }
        }
    }

    @Override // zt.g
    public final Object i(Object obj, pq.c cVar) throws Throwable {
        Throwable th2;
        pq.c[] cVarArrN;
        b0 b0Var;
        if (q(obj)) {
            return lq.b0.f15562a;
        }
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        pq.c[] cVarArrN2 = au.c.f2320a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        gVar.g(lq.b0.f15562a);
                        cVarArrN = n(cVarArrN2);
                        b0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        b0 b0Var2 = new b0(this, o() + this.G + this.H, obj, gVar);
                        m(b0Var2);
                        this.H++;
                        if (this.f27542y == 0) {
                            cVarArrN2 = n(cVarArrN2);
                        }
                        cVarArrN = cVarArrN2;
                        b0Var = b0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (b0Var != null) {
                    gVar.y(new wt.e(2, b0Var));
                }
                for (pq.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        cVar2.g(lq.b0.f15562a);
                    }
                }
                Object objU = gVar.u();
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                if (objU != aVar) {
                    objU = lq.b0.f15562a;
                }
                return objU == aVar ? objU : lq.b0.f15562a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void k() {
        au.d[] dVarArr;
        Object[] objArr = this.D;
        br.l.b(objArr);
        f0.c(objArr, o(), null);
        this.G--;
        long jO = o() + 1;
        if (this.E < jO) {
            this.E = jO;
        }
        if (this.F < jO) {
            if (this.f2317d != 0 && (dVarArr = this.f2316a) != null) {
                for (au.d dVar : dVarArr) {
                    if (dVar != null) {
                        g0 g0Var = (g0) dVar;
                        long j = g0Var.f27546a;
                        if (j >= 0 && j < jO) {
                            g0Var.f27546a = jO;
                        }
                    }
                }
            }
            this.F = jO;
        }
    }

    @Override // zt.f
    public final Object l(g gVar, pq.c cVar) {
        return j(this, gVar, cVar);
    }

    public final void m(Object obj) {
        int i10 = this.G + this.H;
        Object[] objArrP = this.D;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i10 >= objArrP.length) {
            objArrP = p(objArrP, i10, objArrP.length * 2);
        }
        f0.c(objArrP, o() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final pq.c[] n(pq.c[] cVarArr) {
        au.d[] dVarArr;
        g0 g0Var;
        wt.g gVar;
        int length = cVarArr.length;
        if (this.f2317d != 0 && (dVarArr = this.f2316a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                au.d dVar = dVarArr[i10];
                if (dVar != null && (gVar = (g0Var = (g0) dVar).f27547b) != null && s(g0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        br.l.d(CopyOf, "copyOf(...)");
                        cVarArr = CopyOf;
                    }
                    cVarArr[length] = gVar;
                    g0Var.f27547b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long o() {
        return Math.min(this.F, this.E);
    }

    public final Object[] p(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.D = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i12 = 0; i12 < i10; i12++) {
                long j = i12 + jO;
                f0.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i10;
        boolean z10;
        pq.c[] cVarArrN = au.c.f2320a;
        synchronized (this) {
            if (r(obj)) {
                cVarArrN = n(cVarArrN);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (pq.c cVar : cVarArrN) {
            if (cVar != null) {
                cVar.g(lq.b0.f15562a);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f2317d
            int r2 = r12.f27541x
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L84
        Lb:
            r12.m(r13)
            int r1 = r12.G
            int r1 = r1 + r9
            r12.G = r1
            if (r1 <= r2) goto L18
            r12.k()
        L18:
            long r1 = r12.o()
            int r3 = r12.G
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.F = r1
            return r9
        L23:
            int r1 = r12.G
            int r3 = r12.f27542y
            if (r1 < r3) goto L4c
            long r4 = r12.F
            long r6 = r12.E
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4c
            int[] r1 = zt.c0.f27533a
            yt.a r4 = r12.B
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L4a
            r4 = 2
            if (r1 == r4) goto L84
            r4 = 3
            if (r1 != r4) goto L44
            goto L4c
        L44:
            bf.n r1 = new bf.n
            r1.<init>()
            throw r1
        L4a:
            r1 = 0
            return r1
        L4c:
            r12.m(r13)
            int r1 = r12.G
            int r1 = r1 + r9
            r12.G = r1
            if (r1 <= r3) goto L59
            r12.k()
        L59:
            long r3 = r12.o()
            int r1 = r12.G
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.E
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L84
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.F
            long r5 = r12.o()
            int r7 = r12.G
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.G
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.H
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.e0.r(java.lang.Object):boolean");
    }

    public final long s(g0 g0Var) {
        long j = g0Var.f27546a;
        if (j < o() + this.G) {
            return j;
        }
        if (this.f27542y <= 0 && j <= o() && this.H != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(g0 g0Var) {
        Object obj;
        pq.c[] cVarArrV = au.c.f2320a;
        synchronized (this) {
            try {
                long jS = s(g0Var);
                if (jS < 0) {
                    obj = f0.f27543a;
                } else {
                    long j = g0Var.f27546a;
                    Object[] objArr = this.D;
                    br.l.b(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof b0) {
                        obj2 = ((b0) obj2).f27528g;
                    }
                    g0Var.f27546a = jS + 1;
                    Object obj3 = obj2;
                    cVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (pq.c cVar : cVarArrV) {
            if (cVar != null) {
                cVar.g(lq.b0.f15562a);
            }
        }
        return obj;
    }

    public final void u(long j, long j7, long j10, long j11) {
        long jMin = Math.min(j7, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.D;
            br.l.b(objArr);
            f0.c(objArr, jO, null);
        }
        this.E = j;
        this.F = j7;
        this.G = (int) (j10 - jMin);
        this.H = (int) (j11 - j10);
    }

    public final pq.c[] v(long j) {
        long j7;
        long j10;
        long j11;
        pq.c[] cVarArr;
        pq.c[] cVarArr2;
        au.d[] dVarArr;
        bu.t tVar = f0.f27543a;
        pq.c[] cVarArr3 = au.c.f2320a;
        if (j <= this.F) {
            long jO = o();
            long j12 = this.G + jO;
            int i10 = this.f27542y;
            if (i10 == 0 && this.H > 0) {
                j12++;
            }
            int i11 = 0;
            if (this.f2317d != 0 && (dVarArr = this.f2316a) != null) {
                for (au.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((g0) dVar).f27546a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.F) {
                long jO2 = o() + this.G;
                int iMin = this.f2317d > 0 ? Math.min(this.H, i10 - ((int) (jO2 - j12))) : this.H;
                long j14 = this.H + jO2;
                if (iMin > 0) {
                    j11 = 1;
                    Object[] objArr = this.D;
                    br.l.b(objArr);
                    j7 = jO;
                    pq.c[] cVarArr4 = new pq.c[iMin];
                    long j15 = jO2;
                    while (true) {
                        if (jO2 >= j14) {
                            cVarArr2 = cVarArr4;
                            j10 = j12;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != tVar) {
                            br.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            b0 b0Var = (b0) obj;
                            int i12 = i11 + 1;
                            j10 = j12;
                            cVarArr2[i11] = b0Var.f27529r;
                            f0.c(objArr, jO2, tVar);
                            f0.c(objArr, j15, b0Var.f27528g);
                            j15++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j10 = j12;
                        }
                        jO2++;
                        cVarArr4 = cVarArr2;
                        j12 = j10;
                    }
                    jO2 = j15;
                    cVarArr = cVarArr2;
                } else {
                    j7 = jO;
                    j10 = j12;
                    j11 = 1;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (jO2 - j7);
                long j16 = this.f2317d == 0 ? jO2 : j10;
                long jMax = Math.max(this.E, jO2 - Math.min(this.f27541x, i13));
                if (i10 == 0 && jMax < j14) {
                    Object[] objArr2 = this.D;
                    br.l.b(objArr2);
                    if (br.l.a(objArr2[((int) jMax) & (objArr2.length - 1)], tVar)) {
                        jO2 += j11;
                        jMax += j11;
                    }
                }
                u(jMax, j16, jO2, j14);
                h();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr3;
    }
}
