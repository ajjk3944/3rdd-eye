package C5;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.Arrays;
import z5.C3028d;
import z5.C3030f;

/* loaded from: classes3.dex */
public class k extends D5.b implements b, c {

    /* renamed from: d, reason: collision with root package name */
    public final int f1178d;

    /* renamed from: e, reason: collision with root package name */
    public final B5.a f1179e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1180f;

    /* renamed from: g, reason: collision with root package name */
    public long f1181g;

    /* renamed from: h, reason: collision with root package name */
    public long f1182h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1183j;

    public k(int i, B5.a aVar) {
        this.f1178d = i;
        this.f1179e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0078, B:35:0x0082, B:39:0x0095, B:42:0x009c, B:43:0x00a2, B:44:0x00a3, B:22:0x0049), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [D5.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [C5.k] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [C5.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [D5.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [C5.m] */
    /* JADX WARN: Type inference failed for: r9v8, types: [C5.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b1 -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void K(C5.k r8, C5.c r9, j5.b r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof C5.j
            if (r0 == 0) goto L13
            r0 = r10
            C5.j r0 = (C5.j) r0
            int r1 = r0.f1177j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1177j = r1
            goto L18
        L13:
            C5.j r0 = new C5.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f1176h
            int r1 = r0.f1177j
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            z5.T r8 = r0.f1175g
            C5.m r9 = r0.f1174f
            C5.c r1 = r0.f1173e
            C5.k r4 = r0.f1172d
            R2.a.H(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L75
        L36:
            r8 = move-exception
            goto Lb7
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            z5.T r8 = r0.f1175g
            C5.m r9 = r0.f1174f
            C5.c r1 = r0.f1173e
            C5.k r4 = r0.f1172d
            R2.a.H(r10)     // Catch: java.lang.Throwable -> L36
            goto L78
        L4d:
            C5.m r9 = r0.f1174f
            C5.c r8 = r0.f1173e
            C5.k r1 = r0.f1172d
            R2.a.H(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb7
        L5c:
            R2.a.H(r10)
            D5.d r10 = r8.b()
            C5.m r10 = (C5.m) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            h5.i r1 = r0.f21463b     // Catch: java.lang.Throwable -> Lb4
            q5.i.b(r1)     // Catch: java.lang.Throwable -> Lb4
            z5.t r4 = z5.C3043t.f24555b     // Catch: java.lang.Throwable -> Lb4
            h5.g r1 = r1.h(r4)     // Catch: java.lang.Throwable -> Lb4
            z5.T r1 = (z5.T) r1     // Catch: java.lang.Throwable -> Lb4
        L75:
            r4 = r8
            r8 = r1
            r1 = r10
        L78:
            java.lang.Object r10 = r4.T(r9)     // Catch: java.lang.Throwable -> L36
            B2.a r5 = C5.l.f1184a     // Catch: java.lang.Throwable -> L36
            i5.a r6 = i5.EnumC2380a.f20635a
            if (r10 != r5) goto L93
            r0.f1172d = r4     // Catch: java.lang.Throwable -> L36
            r0.f1173e = r1     // Catch: java.lang.Throwable -> L36
            r0.f1174f = r9     // Catch: java.lang.Throwable -> L36
            r0.f1175g = r8     // Catch: java.lang.Throwable -> L36
            r0.f1177j = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.I(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L78
            goto Lb3
        L93:
            if (r8 == 0) goto La3
            boolean r5 = r8.a()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9c
            goto La3
        L9c:
            z5.c0 r8 = (z5.c0) r8     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.CancellationException r8 = r8.u()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La3:
            r0.f1172d = r4     // Catch: java.lang.Throwable -> L36
            r0.f1173e = r1     // Catch: java.lang.Throwable -> L36
            r0.f1174f = r9     // Catch: java.lang.Throwable -> L36
            r0.f1175g = r8     // Catch: java.lang.Throwable -> L36
            r0.f1177j = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb3:
            return
        Lb4:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb7:
            r4.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.k.K(C5.k, C5.c, j5.b):void");
    }

    public final Object I(m mVar, j jVar) {
        C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(jVar));
        c3030f.t();
        synchronized (this) {
            try {
                if (S(mVar) < 0) {
                    mVar.f1188b = c3030f;
                } else {
                    c3030f.e(C0412i.f5929a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objS = c3030f.s();
        return objS == EnumC2380a.f20635a ? objS : C0412i.f5929a;
    }

    public final void J() {
        if (this.f1178d != 0 || this.f1183j > 1) {
            Object[] objArr = this.f1180f;
            q5.i.b(objArr);
            while (this.f1183j > 0) {
                long jO = O();
                int i = this.i;
                int i3 = this.f1183j;
                if (objArr[((int) ((jO + (i + i3)) - 1)) & (objArr.length - 1)] != l.f1184a) {
                    return;
                }
                this.f1183j = i3 - 1;
                l.a(objArr, O() + this.i + this.f1183j, null);
            }
        }
    }

    public final void L() {
        D5.d[] dVarArr;
        Object[] objArr = this.f1180f;
        q5.i.b(objArr);
        l.a(objArr, O(), null);
        this.i--;
        long jO = O() + 1;
        if (this.f1181g < jO) {
            this.f1181g = jO;
        }
        if (this.f1182h < jO) {
            if (this.f1294a != 0 && (dVarArr = (D5.d[]) this.f1296c) != null) {
                for (D5.d dVar : dVarArr) {
                    if (dVar != null) {
                        m mVar = (m) dVar;
                        long j6 = mVar.f1187a;
                        if (j6 >= 0 && j6 < jO) {
                            mVar.f1187a = jO;
                        }
                    }
                }
            }
            this.f1182h = jO;
        }
    }

    public final void M(Object obj) {
        int i = this.i + this.f1183j;
        Object[] objArrP = this.f1180f;
        if (objArrP == null) {
            objArrP = P(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = P(objArrP, i, objArrP.length * 2);
        }
        l.a(objArrP, O() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC2370d[] N(InterfaceC2370d[] interfaceC2370dArr) {
        D5.d[] dVarArr;
        m mVar;
        C3030f c3030f;
        int length = interfaceC2370dArr.length;
        if (this.f1294a != 0 && (dVarArr = (D5.d[]) this.f1296c) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            interfaceC2370dArr = interfaceC2370dArr;
            while (i < length2) {
                D5.d dVar = dVarArr[i];
                if (dVar != null && (c3030f = (mVar = (m) dVar).f1188b) != null && S(mVar) >= 0) {
                    int length3 = interfaceC2370dArr.length;
                    interfaceC2370dArr = interfaceC2370dArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC2370dArr, Math.max(2, interfaceC2370dArr.length * 2));
                        q5.i.d(CopyOf, "copyOf(...)");
                        interfaceC2370dArr = CopyOf;
                    }
                    interfaceC2370dArr[length] = c3030f;
                    mVar.f1188b = null;
                    length++;
                }
                i++;
                interfaceC2370dArr = interfaceC2370dArr;
            }
        }
        return interfaceC2370dArr;
    }

    public final long O() {
        return Math.min(this.f1182h, this.f1181g);
    }

    public final Object[] P(Object[] objArr, int i, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i3];
        this.f1180f = objArr2;
        if (objArr != null) {
            long jO = O();
            for (int i6 = 0; i6 < i; i6++) {
                long j6 = i6 + jO;
                l.a(objArr2, j6, objArr[((int) j6) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean Q(Object obj) {
        int i;
        boolean z6;
        InterfaceC2370d[] interfaceC2370dArrN = D5.c.f1297a;
        synchronized (this) {
            if (R(obj)) {
                interfaceC2370dArrN = N(interfaceC2370dArrN);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (InterfaceC2370d interfaceC2370d : interfaceC2370dArrN) {
            if (interfaceC2370d != null) {
                interfaceC2370d.e(C0412i.f5929a);
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean R(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f1294a
            r9 = 1
            if (r1 != 0) goto L1d
            r12.M(r13)
            int r1 = r12.i
            int r1 = r1 + r9
            r12.i = r1
            if (r1 <= r9) goto L12
            r12.L()
        L12:
            long r1 = r12.O()
            int r3 = r12.i
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f1182h = r1
            return r9
        L1d:
            int r1 = r12.i
            int r2 = r12.f1178d
            if (r1 < r2) goto L39
            long r3 = r12.f1182h
            long r5 = r12.f1181g
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L39
            B5.a r1 = r12.f1179e
            int r1 = r1.ordinal()
            if (r1 == 0) goto L37
            r3 = 2
            if (r1 == r3) goto L71
            goto L39
        L37:
            r1 = 0
            return r1
        L39:
            r12.M(r13)
            int r1 = r12.i
            int r1 = r1 + r9
            r12.i = r1
            if (r1 <= r2) goto L46
            r12.L()
        L46:
            long r1 = r12.O()
            int r3 = r12.i
            long r3 = (long) r3
            long r1 = r1 + r3
            long r3 = r12.f1181g
            long r1 = r1 - r3
            int r1 = (int) r1
            if (r1 <= r9) goto L71
            r1 = 1
            long r1 = r1 + r3
            long r3 = r12.f1182h
            long r5 = r12.O()
            int r7 = r12.i
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.O()
            int r10 = r12.i
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f1183j
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.U(r1, r3, r5, r7)
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.k.R(java.lang.Object):boolean");
    }

    public final long S(m mVar) {
        long j6 = mVar.f1187a;
        if (j6 < O() + this.i) {
            return j6;
        }
        if (this.f1178d <= 0 && j6 <= O() && this.f1183j != 0) {
            return j6;
        }
        return -1L;
    }

    public final Object T(m mVar) {
        Object obj;
        InterfaceC2370d[] interfaceC2370dArrV = D5.c.f1297a;
        synchronized (this) {
            try {
                long jS = S(mVar);
                if (jS < 0) {
                    obj = l.f1184a;
                } else {
                    long j6 = mVar.f1187a;
                    Object[] objArr = this.f1180f;
                    q5.i.b(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof i) {
                        obj2 = ((i) obj2).f1170c;
                    }
                    mVar.f1187a = jS + 1;
                    Object obj3 = obj2;
                    interfaceC2370dArrV = V(j6);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2370d interfaceC2370d : interfaceC2370dArrV) {
            if (interfaceC2370d != null) {
                interfaceC2370d.e(C0412i.f5929a);
            }
        }
        return obj;
    }

    public final void U(long j6, long j7, long j8, long j9) {
        long jMin = Math.min(j7, j6);
        for (long jO = O(); jO < jMin; jO++) {
            Object[] objArr = this.f1180f;
            q5.i.b(objArr);
            l.a(objArr, jO, null);
        }
        this.f1181g = j6;
        this.f1182h = j7;
        this.i = (int) (j8 - jMin);
        this.f1183j = (int) (j9 - j8);
    }

    public final InterfaceC2370d[] V(long j6) {
        long j7;
        int i;
        InterfaceC2370d[] interfaceC2370dArr;
        InterfaceC2370d[] interfaceC2370dArr2;
        long j8;
        D5.d[] dVarArr;
        B2.a aVar = l.f1184a;
        InterfaceC2370d[] interfaceC2370dArr3 = D5.c.f1297a;
        if (j6 <= this.f1182h) {
            long jO = O();
            long j9 = this.i + jO;
            int i3 = this.f1178d;
            if (i3 == 0 && this.f1183j > 0) {
                j9++;
            }
            int i6 = 0;
            if (this.f1294a != 0 && (dVarArr = (D5.d[]) this.f1296c) != null) {
                for (D5.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j10 = ((m) dVar).f1187a;
                        if (j10 >= 0 && j10 < j9) {
                            j9 = j10;
                        }
                    }
                }
            }
            if (j9 > this.f1182h) {
                long jO2 = O() + this.i;
                int iMin = this.f1294a > 0 ? Math.min(this.f1183j, i3 - ((int) (jO2 - j9))) : this.f1183j;
                long j11 = this.f1183j + jO2;
                if (iMin > 0) {
                    InterfaceC2370d[] interfaceC2370dArr4 = new InterfaceC2370d[iMin];
                    Object[] objArr = this.f1180f;
                    q5.i.b(objArr);
                    long j12 = jO2;
                    while (true) {
                        if (jO2 >= j11) {
                            interfaceC2370dArr2 = interfaceC2370dArr4;
                            j7 = jO;
                            j8 = j12;
                            i = 1;
                            break;
                        }
                        i = 1;
                        interfaceC2370dArr2 = interfaceC2370dArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != aVar) {
                            q5.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            i iVar = (i) obj;
                            int i7 = i6 + 1;
                            j7 = jO;
                            interfaceC2370dArr2[i6] = iVar.f1171d;
                            l.a(objArr, jO2, aVar);
                            long j13 = j12;
                            l.a(objArr, j13, iVar.f1170c);
                            j8 = j13 + 1;
                            if (i7 >= iMin) {
                                break;
                            }
                            i6 = i7;
                            j12 = j8;
                        } else {
                            j7 = jO;
                        }
                        jO2++;
                        interfaceC2370dArr4 = interfaceC2370dArr2;
                        jO = j7;
                    }
                    jO2 = j8;
                    interfaceC2370dArr = interfaceC2370dArr2;
                } else {
                    j7 = jO;
                    i = 1;
                    interfaceC2370dArr = interfaceC2370dArr3;
                }
                int i8 = (int) (jO2 - j7);
                long j14 = this.f1294a == 0 ? jO2 : j9;
                int i9 = i;
                long jMax = Math.max(this.f1181g, jO2 - Math.min(i9, i8));
                if (i3 == 0 && jMax < j11) {
                    Object[] objArr2 = this.f1180f;
                    q5.i.b(objArr2);
                    if (q5.i.a(objArr2[((int) jMax) & (objArr2.length - i9)], aVar)) {
                        jO2++;
                        jMax++;
                    }
                }
                U(jMax, j14, jO2, j11);
                J();
                return interfaceC2370dArr.length == 0 ? interfaceC2370dArr : N(interfaceC2370dArr);
            }
        }
        return interfaceC2370dArr3;
    }

    @Override // C5.c
    public final Object a(Object obj, j5.b bVar) throws Throwable {
        Throwable th;
        InterfaceC2370d[] interfaceC2370dArrN;
        i iVar;
        if (Q(obj)) {
            return C0412i.f5929a;
        }
        C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(bVar));
        c3030f.t();
        InterfaceC2370d[] interfaceC2370dArrN2 = D5.c.f1297a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        c3030f.e(C0412i.f5929a);
                        interfaceC2370dArrN = N(interfaceC2370dArrN2);
                        iVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        i iVar2 = new i(this, O() + this.i + this.f1183j, obj, c3030f);
                        M(iVar2);
                        this.f1183j++;
                        if (this.f1178d == 0) {
                            interfaceC2370dArrN2 = N(interfaceC2370dArrN2);
                        }
                        interfaceC2370dArrN = interfaceC2370dArrN2;
                        iVar = iVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (iVar != null) {
                    c3030f.v(new C3028d(1, iVar));
                }
                for (InterfaceC2370d interfaceC2370d : interfaceC2370dArrN) {
                    if (interfaceC2370d != null) {
                        interfaceC2370d.e(C0412i.f5929a);
                    }
                }
                Object objS = c3030f.s();
                EnumC2380a enumC2380a = EnumC2380a.f20635a;
                if (objS != enumC2380a) {
                    objS = C0412i.f5929a;
                }
                return objS == enumC2380a ? objS : C0412i.f5929a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // D5.b
    public final D5.d c() {
        m mVar = new m();
        mVar.f1187a = -1L;
        return mVar;
    }

    @Override // D5.b
    public final D5.d[] d() {
        return new m[2];
    }

    @Override // C5.b
    public final Object k(c cVar, InterfaceC2370d interfaceC2370d) throws Throwable {
        K(this, cVar, (j5.b) interfaceC2370d);
        return EnumC2380a.f20635a;
    }
}
