package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends g1.z {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f34752h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f34753c;

    /* renamed from: d, reason: collision with root package name */
    public int f34754d;

    /* renamed from: e, reason: collision with root package name */
    public x.z f34755e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34756f;
    public int g;

    public c0(long j) {
        super(j);
        x.z zVar = x.i0.f36903a;
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f34755e = zVar;
        this.f34756f = f34752h;
    }

    @Override // g1.z
    public final void a(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        c0 c0Var = (c0) zVar;
        this.f34755e = c0Var.f34755e;
        this.f34756f = c0Var.f34756f;
        this.g = c0Var.g;
    }

    @Override // g1.z
    public final g1.z b(long j) {
        return new c0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(u0.d0 r7, g1.g r8) {
        /*
            r6 = this;
            java.lang.Object r0 = g1.m.f24260c
            monitor-enter(r0)
            long r1 = r6.f34753c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f34754d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f34756f
            java.lang.Object r5 = u0.c0.f34752h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f34753c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f34754d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.c0.c(u0.d0, g1.g):boolean");
    }

    public final int d(d0 d0Var, g1.g gVar) throws Throwable {
        x.z zVar;
        int i4;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        g1.z zVarG;
        synchronized (g1.m.f24260c) {
            zVar = this.f34755e;
        }
        int i13 = 7;
        if (zVar.f36969e == 0) {
            return 7;
        }
        w0.e eVarK = q.k();
        Object[] objArr = eVarK.f36397a;
        int i14 = eVarK.f36399c;
        for (int i15 = 0; i15 < i14; i15++) {
            ((g1.s) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = zVar.f36966b;
            int[] iArr = zVar.f36967c;
            long[] jArr3 = zVar.f36965a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i4 = 7;
                int i16 = 0;
                while (true) {
                    long j = jArr3[i16];
                    if ((((~j) << i13) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                Object obj = objArr2[i20];
                                i11 = i13;
                                int i21 = iArr[i20];
                                i12 = i17;
                                g1.x xVar = (g1.x) obj;
                                if (i21 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (xVar instanceof d0) {
                                        try {
                                            d0 d0Var2 = (d0) xVar;
                                            zVarG = d0Var2.g((c0) g1.m.i(d0Var2.f34764d, gVar), gVar, false, d0Var2.f34762b);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = eVarK.f36397a;
                                            int i22 = eVarK.f36399c;
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                ((g1.s) objArr3[i23]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        zVarG = g1.m.i(xVar.a(), gVar);
                                    }
                                    int iIdentityHashCode = ((i4 * 31) + System.identityHashCode(zVarG)) * 31;
                                    jArr2 = jArr3;
                                    long j8 = zVarG.f24299a;
                                    i4 = iIdentityHashCode + ((int) (j8 ^ (j8 >>> 32)));
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                                i12 = i17;
                            }
                            j >>= i12;
                            i19++;
                            i13 = i11;
                            jArr3 = jArr2;
                            i17 = i12;
                        }
                        jArr = jArr3;
                        i10 = i13;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i13;
                    }
                    if (i16 == length) {
                        i13 = i4;
                        break;
                    }
                    i16++;
                    i13 = i10;
                    jArr3 = jArr;
                }
            }
            i4 = i13;
            Object[] objArr4 = eVarK.f36397a;
            int i24 = eVarK.f36399c;
            for (int i25 = 0; i25 < i24; i25++) {
                ((g1.s) objArr4[i25]).a();
            }
            return i4;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
