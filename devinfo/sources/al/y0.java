package al;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y0 extends bl.b implements h, i, bl.s {

    /* renamed from: e, reason: collision with root package name */
    public final int f649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f650f;
    public final zk.a g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f651h;

    /* renamed from: i, reason: collision with root package name */
    public long f652i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f653k;

    /* renamed from: l, reason: collision with root package name */
    public int f654l;

    public y0(int i4, int i10, zk.a aVar) {
        this.f649e = i4;
        this.f650f = i10;
        this.g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0077, B:35:0x0081, B:39:0x0094, B:42:0x009b, B:43:0x009f, B:44:0x00a0, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bl.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [al.y0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [al.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [bl.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [al.a1] */
    /* JADX WARN: Type inference failed for: r9v8, types: [al.a1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(al.y0 r8, al.i r9, ck.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof al.x0
            if (r0 == 0) goto L13
            r0 = r10
            al.x0 r0 = (al.x0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            al.x0 r0 = new al.x0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f643e
            int r1 = r0.g
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            xk.y0 r8 = r0.f642d
            al.a1 r9 = r0.f641c
            al.i r1 = r0.f640b
            al.y0 r4 = r0.f639a
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L74
        L36:
            r8 = move-exception
            goto Lb4
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            xk.y0 r8 = r0.f642d
            al.a1 r9 = r0.f641c
            al.i r1 = r0.f640b
            al.y0 r4 = r0.f639a
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L36
            goto L77
        L4d:
            al.a1 r9 = r0.f641c
            al.i r8 = r0.f640b
            al.y0 r1 = r0.f639a
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb4
        L5c:
            ci.b.D(r10)
            bl.d r10 = r8.d()
            al.a1 r10 = (al.a1) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            ck.h r1 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            xk.s r4 = xk.s.f37235b     // Catch: java.lang.Throwable -> Lb1
            ck.f r1 = r1.O(r4)     // Catch: java.lang.Throwable -> Lb1
            xk.y0 r1 = (xk.y0) r1     // Catch: java.lang.Throwable -> Lb1
        L74:
            r4 = r8
            r8 = r1
            r1 = r10
        L77:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            cl.u r5 = al.z0.f661a     // Catch: java.lang.Throwable -> L36
            dk.a r6 = dk.a.f22275a
            if (r10 != r5) goto L92
            r0.f639a = r4     // Catch: java.lang.Throwable -> L36
            r0.f640b = r1     // Catch: java.lang.Throwable -> L36
            r0.f641c = r9     // Catch: java.lang.Throwable -> L36
            r0.f642d = r8     // Catch: java.lang.Throwable -> L36
            r0.g = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.i(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L77
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r5 = r8.c()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.p()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La0:
            r0.f639a = r4     // Catch: java.lang.Throwable -> L36
            r0.f640b = r1     // Catch: java.lang.Throwable -> L36
            r0.f641c = r9     // Catch: java.lang.Throwable -> L36
            r0.f642d = r8     // Catch: java.lang.Throwable -> L36
            r0.g = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.c(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb4:
            r4.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: al.y0.k(al.y0, al.i, ck.c):void");
    }

    @Override // al.h
    public final Object a(i iVar, ck.c cVar) throws Throwable {
        k(this, iVar, cVar);
        return dk.a.f22275a;
    }

    @Override // bl.s
    public final h b(ck.h hVar, int i4, zk.a aVar) {
        return ((i4 == 0 || i4 == -3) && aVar == zk.a.f38322a) ? this : new bl.g(this, hVar, i4, aVar);
    }

    @Override // al.i
    public final Object c(Object obj, ck.c cVar) throws Throwable {
        Throwable th2;
        ck.c[] cVarArrN;
        w0 w0Var;
        if (q(obj)) {
            return yj.u.f37649a;
        }
        xk.h hVar = new xk.h(1, a.a.r(cVar));
        hVar.s();
        ck.c[] cVarArrN2 = bl.c.f2284a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        hVar.resumeWith(yj.u.f37649a);
                        cVarArrN = n(cVarArrN2);
                        w0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        w0 w0Var2 = new w0(this, o() + this.f653k + this.f654l, obj, hVar);
                        m(w0Var2);
                        this.f654l++;
                        if (this.f650f == 0) {
                            cVarArrN2 = n(cVarArrN2);
                        }
                        cVarArrN = cVarArrN2;
                        w0Var = w0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (w0Var != null) {
                    hVar.v(new xk.e(2, w0Var));
                }
                for (ck.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(yj.u.f37649a);
                    }
                }
                Object objR = hVar.r();
                dk.a aVar = dk.a.f22275a;
                if (objR != aVar) {
                    objR = yj.u.f37649a;
                }
                return objR == aVar ? objR : yj.u.f37649a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // bl.b
    public final bl.d e() {
        a1 a1Var = new a1();
        a1Var.f472a = -1L;
        return a1Var;
    }

    @Override // bl.b
    public final bl.d[] f() {
        return new a1[2];
    }

    public final Object i(a1 a1Var, x0 x0Var) {
        xk.h hVar = new xk.h(1, a.a.r(x0Var));
        hVar.s();
        synchronized (this) {
            try {
                if (s(a1Var) < 0) {
                    a1Var.f473b = hVar;
                } else {
                    hVar.resumeWith(yj.u.f37649a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objR = hVar.r();
        return objR == dk.a.f22275a ? objR : yj.u.f37649a;
    }

    public final void j() {
        if (this.f650f != 0 || this.f654l > 1) {
            Object[] objArr = this.f651h;
            nk.k.b(objArr);
            while (this.f654l > 0) {
                long jO = o();
                int i4 = this.f653k;
                int i10 = this.f654l;
                if (objArr[((int) ((jO + (i4 + i10)) - 1)) & (objArr.length - 1)] != z0.f661a) {
                    return;
                }
                this.f654l = i10 - 1;
                z0.e(objArr, o() + this.f653k + this.f654l, null);
            }
        }
    }

    public final void l() {
        bl.d[] dVarArr;
        Object[] objArr = this.f651h;
        nk.k.b(objArr);
        z0.e(objArr, o(), null);
        this.f653k--;
        long jO = o() + 1;
        if (this.f652i < jO) {
            this.f652i = jO;
        }
        if (this.j < jO) {
            if (this.f2279b != 0 && (dVarArr = this.f2278a) != null) {
                for (bl.d dVar : dVarArr) {
                    if (dVar != null) {
                        a1 a1Var = (a1) dVar;
                        long j = a1Var.f472a;
                        if (j >= 0 && j < jO) {
                            a1Var.f472a = jO;
                        }
                    }
                }
            }
            this.j = jO;
        }
    }

    public final void m(Object obj) {
        int i4 = this.f653k + this.f654l;
        Object[] objArrP = this.f651h;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i4 >= objArrP.length) {
            objArrP = p(objArrP, i4, objArrP.length * 2);
        }
        z0.e(objArrP, o() + i4, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final ck.c[] n(ck.c[] cVarArr) {
        bl.d[] dVarArr;
        a1 a1Var;
        xk.h hVar;
        int length = cVarArr.length;
        if (this.f2279b != 0 && (dVarArr = this.f2278a) != null) {
            int length2 = dVarArr.length;
            int i4 = 0;
            cVarArr = cVarArr;
            while (i4 < length2) {
                bl.d dVar = dVarArr[i4];
                if (dVar != null && (hVar = (a1Var = (a1) dVar).f473b) != null && s(a1Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        nk.k.d(CopyOf, "copyOf(...)");
                        cVarArr = CopyOf;
                    }
                    cVarArr[length] = hVar;
                    a1Var.f473b = null;
                    length++;
                }
                i4++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long o() {
        return Math.min(this.j, this.f652i);
    }

    public final Object[] p(Object[] objArr, int i4, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f651h = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i11 = 0; i11 < i4; i11++) {
                long j = i11 + jO;
                z0.e(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i4;
        boolean z3;
        ck.c[] cVarArrN = bl.c.f2284a;
        synchronized (this) {
            if (r(obj)) {
                cVarArrN = n(cVarArrN);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (ck.c cVar : cVarArrN) {
            if (cVar != null) {
                cVar.resumeWith(yj.u.f37649a);
            }
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f2279b
            int r2 = r12.f649e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.m(r13)
            int r1 = r12.f653k
            int r1 = r1 + r9
            r12.f653k = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.f653k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.j = r1
            return r9
        L23:
            int r1 = r12.f653k
            int r3 = r12.f650f
            if (r1 < r3) goto L47
            long r4 = r12.j
            long r6 = r12.f652i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            zk.a r1 = r12.g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            ac.m r1 = new ac.m
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.m(r13)
            int r1 = r12.f653k
            int r1 = r1 + r9
            r12.f653k = r1
            if (r1 <= r3) goto L54
            r12.l()
        L54:
            long r3 = r12.o()
            int r1 = r12.f653k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f652i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.j
            long r5 = r12.o()
            int r7 = r12.f653k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.f653k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f654l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: al.y0.r(java.lang.Object):boolean");
    }

    public final long s(a1 a1Var) {
        long j = a1Var.f472a;
        if (j < o() + this.f653k) {
            return j;
        }
        if (this.f650f <= 0 && j <= o() && this.f654l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(a1 a1Var) {
        Object obj;
        ck.c[] cVarArrV = bl.c.f2284a;
        synchronized (this) {
            try {
                long jS = s(a1Var);
                if (jS < 0) {
                    obj = z0.f661a;
                } else {
                    long j = a1Var.f472a;
                    Object[] objArr = this.f651h;
                    nk.k.b(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof w0) {
                        obj2 = ((w0) obj2).f634c;
                    }
                    a1Var.f472a = jS + 1;
                    Object obj3 = obj2;
                    cVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ck.c cVar : cVarArrV) {
            if (cVar != null) {
                cVar.resumeWith(yj.u.f37649a);
            }
        }
        return obj;
    }

    public final void u(long j, long j8, long j9, long j10) {
        long jMin = Math.min(j8, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f651h;
            nk.k.b(objArr);
            z0.e(objArr, jO, null);
        }
        this.f652i = j;
        this.j = j8;
        this.f653k = (int) (j9 - jMin);
        this.f654l = (int) (j10 - j9);
    }

    public final ck.c[] v(long j) {
        long j8;
        long j9;
        long j10;
        ck.c[] cVarArr;
        ck.c[] cVarArr2;
        bl.d[] dVarArr;
        cl.u uVar = z0.f661a;
        ck.c[] cVarArr3 = bl.c.f2284a;
        if (j <= this.j) {
            long jO = o();
            long j11 = this.f653k + jO;
            int i4 = this.f650f;
            if (i4 == 0 && this.f654l > 0) {
                j11++;
            }
            int i10 = 0;
            if (this.f2279b != 0 && (dVarArr = this.f2278a) != null) {
                for (bl.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j12 = ((a1) dVar).f472a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.j) {
                long jO2 = o() + this.f653k;
                int iMin = this.f2279b > 0 ? Math.min(this.f654l, i4 - ((int) (jO2 - j11))) : this.f654l;
                long j13 = this.f654l + jO2;
                if (iMin > 0) {
                    j10 = 1;
                    Object[] objArr = this.f651h;
                    nk.k.b(objArr);
                    j8 = jO;
                    ck.c[] cVarArr4 = new ck.c[iMin];
                    long j14 = jO2;
                    while (true) {
                        if (jO2 >= j13) {
                            cVarArr2 = cVarArr4;
                            j9 = j11;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != uVar) {
                            nk.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            w0 w0Var = (w0) obj;
                            int i11 = i10 + 1;
                            j9 = j11;
                            cVarArr2[i10] = w0Var.f635d;
                            z0.e(objArr, jO2, uVar);
                            z0.e(objArr, j14, w0Var.f634c);
                            j14++;
                            if (i11 >= iMin) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            j9 = j11;
                        }
                        jO2++;
                        cVarArr4 = cVarArr2;
                        j11 = j9;
                    }
                    jO2 = j14;
                    cVarArr = cVarArr2;
                } else {
                    j8 = jO;
                    j9 = j11;
                    j10 = 1;
                    cVarArr = cVarArr3;
                }
                int i12 = (int) (jO2 - j8);
                long j15 = this.f2279b == 0 ? jO2 : j9;
                long jMax = Math.max(this.f652i, jO2 - Math.min(this.f649e, i12));
                if (i4 == 0 && jMax < j13) {
                    Object[] objArr2 = this.f651h;
                    nk.k.b(objArr2);
                    if (nk.k.a(objArr2[((int) jMax) & (objArr2.length - 1)], uVar)) {
                        jO2 += j10;
                        jMax += j10;
                    }
                }
                u(jMax, j15, jO2, j13);
                j();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr3;
    }
}
