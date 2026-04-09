package x0;

import bc.f0;
import java.util.HashMap;
import u.b0;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final lu.u f24715a = new lu.u(12);

    /* renamed from: b, reason: collision with root package name */
    public static final qm.c f24716b = new qm.c(9);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24717c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static j f24718d;

    /* renamed from: e, reason: collision with root package name */
    public static long f24719e;

    /* renamed from: f, reason: collision with root package name */
    public static final kg.n f24720f;

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f24721g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f24722h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f24723i;
    public static final a j;
    public static final v0.a k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        j jVar = j.f24707x;
        f24718d = jVar;
        long j7 = 1;
        f24719e = j7 + j7;
        kg.n nVar = new kg.n();
        nVar.f14383c = new long[16];
        nVar.f14384d = new int[16];
        ?? r52 = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            r52[i10] = i11;
            i10 = i11;
        }
        nVar.f14385e = r52;
        f24720f = nVar;
        f0 f0Var = new f0(13, (byte) 0);
        f0Var.f2603g = new int[16];
        f0Var.f2604r = new v0.l[16];
        f24721g = f0Var;
        mq.w wVar = mq.w.f16945a;
        f24722h = wVar;
        f24723i = wVar;
        long j10 = f24719e;
        f24719e = j7 + j10;
        a aVar = new a(j10, jVar, null, new lu.u(11));
        f24718d = f24718d.e(aVar.f24698b);
        j = aVar;
        k = new v0.a(0);
    }

    public static final void a() {
        f(f24715a);
    }

    public static final ar.k b(ar.k kVar, ar.k kVar2) {
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new k(kVar, kVar2, 1);
    }

    public static final HashMap c(long j7, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        j jVar3;
        int i10;
        v vVarS;
        long j10 = j7;
        b0 b0VarX = bVar.x();
        if (b0VarX != null) {
            j jVarD = bVar.d().e(bVar.g()).d(bVar.j);
            Object[] objArr = b0VarX.f23045b;
            long[] jArr3 = b0VarX.f23044a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j11 = jArr3[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                t tVar = (t) objArr[(i11 << 3) + i14];
                                v vVarE = tVar.e();
                                jArr2 = jArr3;
                                i10 = i12;
                                v vVarS2 = s(vVarE, j10, jVar);
                                if (vVarS2 == null || (vVarS = s(vVarE, j10, jVarD)) == null || vVarS2.equals(vVarS)) {
                                    jVar3 = jVarD;
                                } else {
                                    jVar3 = jVarD;
                                    v vVarS3 = s(vVarE, bVar.g(), bVar.d());
                                    if (vVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    v vVarJ = tVar.j(vVarS, vVarS2, vVarS3);
                                    if (vVarJ == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(vVarS2, vVarJ);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                jVar3 = jVarD;
                                i10 = i12;
                            }
                            j11 >>= i10;
                            i14++;
                            j10 = j7;
                            i12 = i10;
                            jArr3 = jArr2;
                            jVarD = jVar3;
                        }
                        jArr = jArr3;
                        jVar2 = jVarD;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarD;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    j10 = j7;
                    jArr3 = jArr;
                    jVarD = jVar2;
                }
            }
        }
        return null;
    }

    public static final void d(f fVar) {
        long j7;
        if (f24718d.c(fVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(fVar.g());
        sb2.append(", disposed=");
        sb2.append(fVar.f24699c);
        sb2.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.f24690m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f24717c) {
            kg.n nVar = f24720f;
            j7 = nVar.f14381a > 0 ? ((long[]) nVar.f14383c)[0] : -1L;
        }
        sb2.append(j7);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final j e(j jVar, long j7, long j10) {
        while (br.l.h(j7, j10) < 0) {
            jVar = jVar.e(j7);
            j7++;
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(ar.k r15) {
        /*
            x0.a r0 = x0.l.j
            java.lang.Object r1 = x0.l.f24717c
            monitor-enter(r1)
            u.b0 r2 = r0.f24687h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            v0.a r3 = x0.l.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = x0.l.f24722h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            ar.n r7 = (ar.n) r7     // Catch: java.lang.Throwable -> L36
            p0.h r8 = new p0.h     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.w(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            v0.a r0 = x0.l.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            v0.a r0 = x0.l.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = x0.l.f24717c
            monitor-enter(r0)
            g()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f23045b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f23044a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            x0.t r11 = (x0.t) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.l.f(ar.k):java.lang.Object");
    }

    public static final void g() {
        f0 f0Var = f24721g;
        int i10 = f0Var.f2602d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            v0.l lVar = ((v0.l[]) f0Var.f2604r)[i11];
            Object obj = lVar != null ? lVar.get() : null;
            if (obj != null && p((t) obj)) {
                if (i12 != i11) {
                    ((v0.l[]) f0Var.f2604r)[i12] = lVar;
                    int[] iArr = (int[]) f0Var.f2603g;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((v0.l[]) f0Var.f2604r)[i13] = null;
            ((int[]) f0Var.f2603g)[i13] = 0;
        }
        if (i12 != i10) {
            f0Var.f2602d = i12;
        }
    }

    public static final f h(f fVar, ar.k kVar, boolean z10) {
        boolean z11 = fVar instanceof b;
        if (z11 || fVar == null) {
            return new x(z11 ? (b) fVar : null, kVar, null, false, z10);
        }
        return new y(fVar, kVar, false, z10);
    }

    public static final v i(v vVar) {
        v vVarS;
        f fVarK = k();
        v vVarS2 = s(vVar, fVarK.g(), fVarK.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f24717c) {
            f fVarK2 = k();
            vVarS = s(vVar, fVarK2.g(), fVarK2.d());
        }
        if (vVarS != null) {
            return vVarS;
        }
        r();
        throw null;
    }

    public static final v j(v vVar, f fVar) {
        v vVarS;
        v vVarS2 = s(vVar, fVar.g(), fVar.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f24717c) {
            vVarS = s(vVar, fVar.g(), fVar.d());
        }
        if (vVarS != null) {
            return vVarS;
        }
        r();
        throw null;
    }

    public static final f k() {
        f fVar = (f) f24716b.get();
        return fVar == null ? j : fVar;
    }

    public static final ar.k l(ar.k kVar, ar.k kVar2, boolean z10) {
        if (!z10) {
            kVar2 = null;
        }
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new k(kVar, kVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x0.v m(x0.v r10, x0.t r11) {
        /*
            x0.v r0 = r11.e()
            long r1 = x0.l.f24719e
            kg.n r3 = x0.l.f24720f
            int r4 = r3.f14381a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f14383c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f24751a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = br.l.h(r5, r1)
            if (r7 > 0) goto L48
            x0.j r7 = x0.j.f24707x
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f24751a
            long r5 = r4.f24751a
            int r1 = br.l.h(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            x0.v r0 = r0.f24752b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f24751a = r0
            return r3
        L55:
            x0.v r10 = r10.b(r0)
            x0.v r0 = r11.e()
            r10.f24752b = r0
            r11.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.l.m(x0.v, x0.t):x0.v");
    }

    public static final void n(f fVar, t tVar) {
        fVar.t(fVar.h() + 1);
        ar.k kVarI = fVar.i();
        if (kVarI != null) {
            kVarI.a(tVar);
        }
    }

    public static final v o(v vVar, u uVar, f fVar, v vVar2) {
        v vVarM;
        if (fVar.f()) {
            fVar.n(uVar);
        }
        long jG = fVar.g();
        if (vVar2.f24751a == jG) {
            return vVar2;
        }
        synchronized (f24717c) {
            vVarM = m(vVar, uVar);
        }
        vVarM.f24751a = jG;
        if (vVar2.f24751a != 1) {
            fVar.n(uVar);
        }
        return vVarM;
    }

    public static final boolean p(t tVar) {
        v vVar;
        long j7 = f24719e;
        kg.n nVar = f24720f;
        if (nVar.f14381a > 0) {
            j7 = ((long[]) nVar.f14383c)[0];
        }
        v vVar2 = null;
        v vVarE = null;
        int i10 = 0;
        for (v vVarE2 = tVar.e(); vVarE2 != null; vVarE2 = vVarE2.f24752b) {
            long j10 = vVarE2.f24751a;
            if (j10 != 0) {
                if (br.l.h(j10, j7) >= 0) {
                    i10++;
                } else if (vVar2 == null) {
                    i10++;
                    vVar2 = vVarE2;
                } else {
                    if (br.l.h(vVarE2.f24751a, vVar2.f24751a) < 0) {
                        vVar = vVar2;
                        vVar2 = vVarE2;
                    } else {
                        vVar = vVarE2;
                    }
                    if (vVarE == null) {
                        vVarE = tVar.e();
                        v vVar3 = vVarE;
                        while (true) {
                            if (vVarE == null) {
                                vVarE = vVar3;
                                break;
                            }
                            if (br.l.h(vVarE.f24751a, j7) >= 0) {
                                break;
                            }
                            if (br.l.h(vVar3.f24751a, vVarE.f24751a) < 0) {
                                vVar3 = vVarE;
                            }
                            vVarE = vVarE.f24752b;
                        }
                    }
                    vVar2.f24751a = 0L;
                    vVar2.a(vVarE);
                    vVar2 = vVar;
                }
            }
        }
        return i10 > 1;
    }

    public static final void q(t tVar) {
        if (p(tVar)) {
            f0 f0Var = f24721g;
            int i10 = f0Var.f2602d;
            int iIdentityHashCode = System.identityHashCode(tVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = f0Var.f2602d - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) f0Var.f2603g)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        v0.l lVar = ((v0.l[]) f0Var.f2604r)[i14];
                        if (tVar == (lVar != null ? lVar.get() : null)) {
                            i11 = i14;
                        } else {
                            for (int i16 = i14 - 1; -1 < i16 && ((int[]) f0Var.f2603g)[i16] == iIdentityHashCode; i16--) {
                                v0.l lVar2 = ((v0.l[]) f0Var.f2604r)[i16];
                                if ((lVar2 != null ? lVar2.get() : null) == tVar) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = f0Var.f2602d;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(f0Var.f2602d + 1);
                                    break;
                                } else {
                                    if (((int[]) f0Var.f2603g)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    v0.l lVar3 = ((v0.l[]) f0Var.f2604r)[i14];
                                    if ((lVar3 != null ? lVar3.get() : null) == tVar) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            v0.l[] lVarArr = (v0.l[]) f0Var.f2604r;
            int length = lVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                v0.l[] lVarArr2 = new v0.l[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(lVarArr, i18, lVarArr2, i20, i10 - i18);
                System.arraycopy((v0.l[]) f0Var.f2604r, 0, lVarArr2, 0, i18);
                mq.l.b0(i20, i18, i10, (int[]) f0Var.f2603g, iArr);
                mq.l.e0(0, i18, 6, (int[]) f0Var.f2603g, iArr);
                f0Var.f2604r = lVarArr2;
                f0Var.f2603g = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(lVarArr, i18, lVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) f0Var.f2603g;
                mq.l.b0(i21, i18, i10, iArr2, iArr2);
            }
            ((v0.l[]) f0Var.f2604r)[i18] = new v0.l(tVar);
            ((int[]) f0Var.f2603g)[i18] = iIdentityHashCode;
            f0Var.f2602d++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final v s(v vVar, long j7, j jVar) {
        v vVar2 = null;
        while (vVar != null) {
            long j10 = vVar.f24751a;
            if (j10 != 0 && br.l.h(j10, j7) <= 0 && !jVar.c(j10) && (vVar2 == null || br.l.h(vVar2.f24751a, vVar.f24751a) < 0)) {
                vVar2 = vVar;
            }
            vVar = vVar.f24752b;
        }
        if (vVar2 != null) {
            return vVar2;
        }
        return null;
    }

    public static final v t(v vVar, t tVar) {
        v vVarS;
        f fVarK = k();
        ar.k kVarE = fVarK.e();
        if (kVarE != null) {
            kVarE.a(tVar);
        }
        v vVarS2 = s(vVar, fVarK.g(), fVarK.d());
        if (vVarS2 != null) {
            return vVarS2;
        }
        synchronized (f24717c) {
            f fVarK2 = k();
            v vVarE = tVar.e();
            br.l.c(vVarE, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            vVarS = s(vVarE, fVarK2.g(), fVarK2.d());
            if (vVarS == null) {
                r();
                throw null;
            }
        }
        return vVarS;
    }

    public static final void u(int i10) {
        kg.n nVar = f24720f;
        int i11 = ((int[]) nVar.f14385e)[i10];
        nVar.g(i11, nVar.f14381a - 1);
        nVar.f14381a--;
        long[] jArr = (long[]) nVar.f14383c;
        long j7 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (br.l.h(jArr[i13], j7) <= 0) {
                break;
            }
            nVar.g(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) nVar.f14383c;
        int i14 = nVar.f14381a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < nVar.f14381a && br.l.h(jArr2[i15], jArr2[i16]) < 0) {
                if (br.l.h(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                nVar.g(i15, i11);
                i11 = i15;
            } else {
                if (br.l.h(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                nVar.g(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) nVar.f14385e)[i10] = nVar.f14382b;
        nVar.f14382b = i10;
    }

    public static final Object v(a aVar, ar.k kVar) {
        long j7 = aVar.f24698b;
        Object objA = kVar.a(f24718d.b(j7));
        long j10 = f24719e;
        f24719e = 1 + j10;
        j jVarB = f24718d.b(j7);
        f24718d = jVarB;
        aVar.f24698b = j10;
        aVar.f24697a = jVarB;
        aVar.f24686g = 0;
        aVar.f24687h = null;
        aVar.o();
        f24718d = f24718d.e(j10);
        return objA;
    }

    public static final v w(v vVar, t tVar, f fVar) {
        v vVarS;
        if (fVar.f()) {
            fVar.n(tVar);
        }
        long jG = fVar.g();
        v vVarS2 = s(vVar, jG, fVar.d());
        if (vVarS2 == null) {
            r();
            throw null;
        }
        if (vVarS2.f24751a == fVar.g()) {
            return vVarS2;
        }
        synchronized (f24717c) {
            vVarS = s(tVar.e(), jG, fVar.d());
            if (vVarS == null) {
                r();
                throw null;
            }
            if (vVarS.f24751a != jG) {
                v vVarM = m(vVarS, tVar);
                vVarM.a(vVarS);
                vVarM.f24751a = fVar.g();
                vVarS = vVarM;
            }
        }
        if (vVarS2.f24751a != 1) {
            fVar.n(tVar);
        }
        return vVarS;
    }
}
