package g1;

import com.google.android.gms.internal.ads.te0;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final b7.w f24258a = new b7.w(11);

    /* renamed from: b, reason: collision with root package name */
    public static final yb.e f24259b = new yb.e(5);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24260c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static k f24261d;

    /* renamed from: e, reason: collision with root package name */
    public static long f24262e;

    /* renamed from: f, reason: collision with root package name */
    public static final te0 f24263f;
    public static final com.google.android.gms.common.api.internal.a0 g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f24264h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f24265i;
    public static final b j;

    /* renamed from: k, reason: collision with root package name */
    public static final c1.a f24266k;

    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        k kVar = k.f24250e;
        f24261d = kVar;
        long j8 = 1;
        f24262e = j8 + j8;
        te0 te0Var = new te0();
        te0Var.f16795c = new long[16];
        te0Var.f16796d = new int[16];
        ?? r52 = new int[16];
        int i4 = 0;
        while (i4 < 16) {
            int i10 = i4 + 1;
            r52[i4] = i10;
            i4 = i10;
        }
        te0Var.f16797e = r52;
        f24263f = te0Var;
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0((char) 0, 3);
        a0Var.f9070c = new int[16];
        a0Var.f9071d = new c1.r[16];
        g = a0Var;
        zj.s sVar = zj.s.f38317a;
        f24264h = sVar;
        f24265i = sVar;
        long j9 = f24262e;
        f24262e = j8 + j9;
        b bVar = new b(j9, kVar, null, new b7.w(10));
        f24261d = f24261d.g(bVar.f24239b);
        j = bVar;
        f24266k = new c1.a(0);
    }

    public static final void a() {
        e(f24258a);
    }

    public static final HashMap b(long j8, c cVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        int i4;
        int i10;
        z zVarT;
        x.f0 f0VarX = cVar.x();
        if (f0VarX != null) {
            long jG = cVar.g();
            k kVarF = cVar.d().g(jG).f(cVar.j);
            Object[] objArr = f0VarX.f36883b;
            long[] jArr3 = f0VarX.f36882a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j9 = jArr3[i11];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j9 & 255) < 128) {
                                x xVar = (x) objArr[(i11 << 3) + i14];
                                z zVarA = xVar.a();
                                jArr2 = jArr3;
                                i4 = i12;
                                i10 = i14;
                                z zVarT2 = t(zVarA, j8, kVar);
                                if (zVarT2 == null || (zVarT = t(zVarA, jG, kVarF)) == null || zVarT2.equals(zVarT)) {
                                    kVar3 = kVarF;
                                } else {
                                    kVar3 = kVarF;
                                    z zVarT3 = t(zVarA, jG, cVar.d());
                                    if (zVarT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    z zVarC = xVar.c(zVarT, zVarT2, zVarT3);
                                    if (zVarC == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(zVarT2, zVarC);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = kVarF;
                                i4 = i12;
                                i10 = i14;
                            }
                            j9 >>= i4;
                            i14 = i10 + 1;
                            i12 = i4;
                            jArr3 = jArr2;
                            kVarF = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = kVarF;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = kVarF;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    jArr3 = jArr;
                    kVarF = kVar2;
                }
            }
        }
        return null;
    }

    public static final void c(g gVar) {
        long j8;
        if (f24261d.d(gVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(gVar.g());
        sb2.append(", disposed=");
        sb2.append(gVar.f24240c);
        sb2.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb2.append(cVar != null ? Boolean.valueOf(cVar.f24214m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f24260c) {
            te0 te0Var = f24263f;
            j8 = te0Var.f16793a > 0 ? ((long[]) te0Var.f16795c)[0] : -1L;
        }
        sb2.append(j8);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final k d(k kVar, long j8, long j9) {
        while (nk.k.g(j8, j9) < 0) {
            kVar = kVar.g(j8);
            j8++;
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(mk.c r15) {
        /*
            g1.b r0 = g1.m.j
            java.lang.Object r1 = g1.m.f24260c
            monitor-enter(r1)
            x.f0 r2 = r0.f24210h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            c1.a r3 = g1.m.f24266k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = w(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = g1.m.f24264h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            mk.e r7 = (mk.e) r7     // Catch: java.lang.Throwable -> L36
            w0.h r8 = new w0.h     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            c1.a r0 = g1.m.f24266k
            r0.addAndGet(r3)
            goto L44
        L3e:
            c1.a r0 = g1.m.f24266k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = g1.m.f24260c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f36883b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f36882a     // Catch: java.lang.Throwable -> L86
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
            g1.x r11 = (g1.x) r11     // Catch: java.lang.Throwable -> L86
            r(r11)     // Catch: java.lang.Throwable -> L86
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
        throw new UnsupportedOperationException("Method not decompiled: g1.m.e(mk.c):java.lang.Object");
    }

    public static final void f() {
        com.google.android.gms.common.api.internal.a0 a0Var = g;
        int i4 = a0Var.f9069b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            c1.r rVar = ((c1.r[]) a0Var.f9071d)[i10];
            Object obj = rVar != null ? rVar.get() : null;
            if (obj != null && q((x) obj)) {
                if (i11 != i10) {
                    ((c1.r[]) a0Var.f9071d)[i11] = rVar;
                    int[] iArr = (int[]) a0Var.f9070c;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i4; i12++) {
            ((c1.r[]) a0Var.f9071d)[i12] = null;
            ((int[]) a0Var.f9070c)[i12] = 0;
        }
        if (i11 != i4) {
            a0Var.f9069b = i11;
        }
    }

    public static final g g(g gVar, mk.c cVar, boolean z3) {
        boolean z10 = gVar instanceof c;
        if (z10 || gVar == null) {
            return new e0(z10 ? (c) gVar : null, cVar, null, false, z3);
        }
        return new f0(gVar, cVar, false, z3);
    }

    public static final z h(z zVar) {
        z zVarT;
        g gVarJ = j();
        z zVarT2 = t(zVar, gVarJ.g(), gVarJ.d());
        if (zVarT2 != null) {
            return zVarT2;
        }
        synchronized (f24260c) {
            g gVarJ2 = j();
            zVarT = t(zVar, gVarJ2.g(), gVarJ2.d());
        }
        if (zVarT != null) {
            return zVarT;
        }
        s();
        throw null;
    }

    public static final z i(z zVar, g gVar) {
        z zVarT;
        z zVarT2 = t(zVar, gVar.g(), gVar.d());
        if (zVarT2 != null) {
            return zVarT2;
        }
        synchronized (f24260c) {
            zVarT = t(zVar, gVar.g(), gVar.d());
        }
        if (zVarT != null) {
            return zVarT;
        }
        s();
        throw null;
    }

    public static final g j() {
        g gVar = (g) f24259b.get();
        return gVar == null ? j : gVar;
    }

    public static final mk.c k(mk.c cVar, mk.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 0);
    }

    public static final mk.c l(mk.c cVar, mk.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final g1.z m(g1.z r10, g1.x r11) {
        /*
            g1.z r0 = r11.a()
            long r1 = g1.m.f24262e
            com.google.android.gms.internal.ads.te0 r3 = g1.m.f24263f
            int r4 = r3.f16793a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f16795c
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
            long r5 = r0.f24299a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = nk.k.g(r5, r1)
            if (r7 > 0) goto L48
            g1.k r7 = g1.k.f24250e
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f24299a
            long r5 = r4.f24299a
            int r1 = nk.k.g(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            g1.z r0 = r0.f24300b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f24299a = r0
            return r3
        L55:
            g1.z r10 = r10.b(r0)
            g1.z r0 = r11.a()
            r10.f24300b = r0
            r11.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.m.m(g1.z, g1.x):g1.z");
    }

    public static final z n(z zVar, u0.d0 d0Var, g gVar) {
        z zVarM;
        synchronized (f24260c) {
            zVarM = m(zVar, d0Var);
            zVarM.a(zVar);
            zVarM.f24299a = gVar.g();
        }
        return zVarM;
    }

    public static final void o(g gVar, x xVar) {
        gVar.t(gVar.h() + 1);
        mk.c cVarI = gVar.i();
        if (cVarI != null) {
            cVarI.invoke(xVar);
        }
    }

    public static final z p(z zVar, y yVar, g gVar, z zVar2) {
        z zVarM;
        if (gVar.f()) {
            gVar.n(yVar);
        }
        long jG = gVar.g();
        if (zVar2.f24299a == jG) {
            return zVar2;
        }
        synchronized (f24260c) {
            zVarM = m(zVar, yVar);
        }
        zVarM.f24299a = jG;
        if (zVar2.f24299a != 1) {
            gVar.n(yVar);
        }
        return zVarM;
    }

    public static final boolean q(x xVar) {
        z zVar;
        long j8 = f24262e;
        te0 te0Var = f24263f;
        if (te0Var.f16793a > 0) {
            j8 = ((long[]) te0Var.f16795c)[0];
        }
        z zVar2 = null;
        z zVarA = null;
        int i4 = 0;
        for (z zVarA2 = xVar.a(); zVarA2 != null; zVarA2 = zVarA2.f24300b) {
            long j9 = zVarA2.f24299a;
            if (j9 != 0) {
                if (nk.k.g(j9, j8) >= 0) {
                    i4++;
                } else if (zVar2 == null) {
                    i4++;
                    zVar2 = zVarA2;
                } else {
                    if (nk.k.g(zVarA2.f24299a, zVar2.f24299a) < 0) {
                        zVar = zVar2;
                        zVar2 = zVarA2;
                    } else {
                        zVar = zVarA2;
                    }
                    if (zVarA == null) {
                        zVarA = xVar.a();
                        z zVar3 = zVarA;
                        while (true) {
                            if (zVarA == null) {
                                zVarA = zVar3;
                                break;
                            }
                            if (nk.k.g(zVarA.f24299a, j8) >= 0) {
                                break;
                            }
                            if (nk.k.g(zVar3.f24299a, zVarA.f24299a) < 0) {
                                zVar3 = zVarA;
                            }
                            zVarA = zVarA.f24300b;
                        }
                    }
                    zVar2.f24299a = 0L;
                    zVar2.a(zVarA);
                    zVar2 = zVar;
                }
            }
        }
        return i4 > 1;
    }

    public static final void r(x xVar) {
        if (q(xVar)) {
            com.google.android.gms.common.api.internal.a0 a0Var = g;
            int i4 = a0Var.f9069b;
            int iIdentityHashCode = System.identityHashCode(xVar);
            int i10 = -1;
            if (i4 > 0) {
                int i11 = a0Var.f9069b - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) a0Var.f9070c)[i13];
                    if (i14 < iIdentityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > iIdentityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        c1.r rVar = ((c1.r[]) a0Var.f9071d)[i13];
                        if (xVar == (rVar != null ? rVar.get() : null)) {
                            i10 = i13;
                        } else {
                            for (int i15 = i13 - 1; -1 < i15 && ((int[]) a0Var.f9070c)[i15] == iIdentityHashCode; i15--) {
                                c1.r rVar2 = ((c1.r[]) a0Var.f9071d)[i15];
                                if ((rVar2 != null ? rVar2.get() : null) == xVar) {
                                    i10 = i15;
                                    break;
                                }
                            }
                            i13++;
                            int i16 = a0Var.f9069b;
                            while (true) {
                                if (i13 >= i16) {
                                    i10 = -(a0Var.f9069b + 1);
                                    break;
                                } else {
                                    if (((int[]) a0Var.f9070c)[i13] != iIdentityHashCode) {
                                        i10 = -(i13 + 1);
                                        break;
                                    }
                                    c1.r rVar3 = ((c1.r[]) a0Var.f9071d)[i13];
                                    if ((rVar3 != null ? rVar3.get() : null) == xVar) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            i10 = i13;
                        }
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            c1.r[] rVarArr = (c1.r[]) a0Var.f9071d;
            int length = rVarArr.length;
            if (i4 == length) {
                int i18 = length * 2;
                c1.r[] rVarArr2 = new c1.r[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(rVarArr, i17, rVarArr2, i19, i4 - i17);
                System.arraycopy((c1.r[]) a0Var.f9071d, 0, rVarArr2, 0, i17);
                zj.m.M(i19, i17, i4, (int[]) a0Var.f9070c, iArr);
                zj.m.Q(0, i17, 6, (int[]) a0Var.f9070c, iArr);
                a0Var.f9071d = rVarArr2;
                a0Var.f9070c = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(rVarArr, i17, rVarArr, i20, i4 - i17);
                int[] iArr2 = (int[]) a0Var.f9070c;
                zj.m.M(i20, i17, i4, iArr2, iArr2);
            }
            ((c1.r[]) a0Var.f9071d)[i17] = new c1.r(xVar);
            ((int[]) a0Var.f9070c)[i17] = iIdentityHashCode;
            a0Var.f9069b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final z t(z zVar, long j8, k kVar) {
        z zVar2 = null;
        while (zVar != null) {
            long j9 = zVar.f24299a;
            if (j9 != 0 && nk.k.g(j9, j8) <= 0 && !kVar.d(j9) && (zVar2 == null || nk.k.g(zVar2.f24299a, zVar.f24299a) < 0)) {
                zVar2 = zVar;
            }
            zVar = zVar.f24300b;
        }
        if (zVar2 != null) {
            return zVar2;
        }
        return null;
    }

    public static final z u(z zVar, x xVar) {
        z zVarT;
        g gVarJ = j();
        mk.c cVarE = gVarJ.e();
        if (cVarE != null) {
            cVarE.invoke(xVar);
        }
        z zVarT2 = t(zVar, gVarJ.g(), gVarJ.d());
        if (zVarT2 != null) {
            return zVarT2;
        }
        synchronized (f24260c) {
            g gVarJ2 = j();
            z zVarA = xVar.a();
            nk.k.c(zVarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            zVarT = t(zVarA, gVarJ2.g(), gVarJ2.d());
            if (zVarT == null) {
                s();
                throw null;
            }
        }
        return zVarT;
    }

    public static final void v(int i4) {
        te0 te0Var = f24263f;
        int i10 = ((int[]) te0Var.f16797e)[i4];
        te0Var.c(i10, te0Var.f16793a - 1);
        te0Var.f16793a--;
        long[] jArr = (long[]) te0Var.f16795c;
        long j8 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (nk.k.g(jArr[i12], j8) <= 0) {
                break;
            }
            te0Var.c(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) te0Var.f16795c;
        int i13 = te0Var.f16793a >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < te0Var.f16793a && nk.k.g(jArr2[i14], jArr2[i15]) < 0) {
                if (nk.k.g(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                te0Var.c(i14, i10);
                i10 = i14;
            } else {
                if (nk.k.g(jArr2[i15], jArr2[i10]) >= 0) {
                    break;
                }
                te0Var.c(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) te0Var.f16797e)[i4] = te0Var.f16794b;
        te0Var.f16794b = i4;
    }

    public static final Object w(b bVar, mk.c cVar) {
        long j8 = bVar.f24239b;
        Object objInvoke = cVar.invoke(f24261d.c(j8));
        long j9 = f24262e;
        f24262e = 1 + j9;
        k kVarC = f24261d.c(j8);
        f24261d = kVarC;
        bVar.f24239b = j9;
        bVar.f24238a = kVarC;
        bVar.g = 0;
        bVar.f24210h = null;
        bVar.o();
        f24261d = f24261d.g(j9);
        return objInvoke;
    }

    public static final z x(z zVar, x xVar, g gVar) {
        z zVarT;
        if (gVar.f()) {
            gVar.n(xVar);
        }
        long jG = gVar.g();
        z zVarT2 = t(zVar, jG, gVar.d());
        if (zVarT2 == null) {
            s();
            throw null;
        }
        if (zVarT2.f24299a == gVar.g()) {
            return zVarT2;
        }
        synchronized (f24260c) {
            zVarT = t(xVar.a(), jG, gVar.d());
            if (zVarT == null) {
                s();
                throw null;
            }
            if (zVarT.f24299a != jG) {
                z zVarM = m(zVarT, xVar);
                zVarM.a(zVarT);
                zVarM.f24299a = gVar.g();
                zVarT = zVarM;
            }
        }
        if (zVarT2.f24299a != 1) {
            gVar.n(xVar);
        }
        return zVarT;
    }
}
