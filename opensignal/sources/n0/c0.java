package n0;

/* loaded from: classes.dex */
public final class c0 extends x0.v {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f17139h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f17140c;

    /* renamed from: d, reason: collision with root package name */
    public int f17141d;

    /* renamed from: e, reason: collision with root package name */
    public u.y f17142e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17143f;

    /* renamed from: g, reason: collision with root package name */
    public int f17144g;

    public c0(long j) {
        super(j);
        u.y yVar = u.e0.f23063a;
        br.l.c(yVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f17142e = yVar;
        this.f17143f = f17139h;
    }

    @Override // x0.v
    public final void a(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        c0 c0Var = (c0) vVar;
        this.f17142e = c0Var.f17142e;
        this.f17143f = c0Var.f17143f;
        this.f17144g = c0Var.f17144g;
    }

    @Override // x0.v
    public final x0.v b(long j) {
        return new c0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(n0.d0 r7, x0.f r8) {
        /*
            r6 = this;
            java.lang.Object r0 = x0.l.f24717c
            monitor-enter(r0)
            long r1 = r6.f17140c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f17141d     // Catch: java.lang.Throwable -> L1a
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
            java.lang.Object r4 = r6.f17143f
            java.lang.Object r5 = n0.c0.f17139h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f17144g
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
            r6.f17140c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f17141d = r7     // Catch: java.lang.Throwable -> L43
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
        throw new UnsupportedOperationException("Method not decompiled: n0.c0.c(n0.d0, x0.f):boolean");
    }

    public final int d(d0 d0Var, x0.f fVar) throws Throwable {
        u.y yVar;
        int iIdentityHashCode;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        x0.v vVarL;
        synchronized (x0.l.f24717c) {
            yVar = this.f17142e;
        }
        int i13 = 7;
        if (yVar.f23132e == 0) {
            return 7;
        }
        p0.e eVarA = androidx.compose.runtime.c.a();
        Object[] objArr = eVarA.f20230a;
        int i14 = eVarA.f20232g;
        for (int i15 = 0; i15 < i14; i15++) {
            ((n) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = yVar.f23129b;
            int[] iArr = yVar.f23130c;
            long[] jArr3 = yVar.f23128a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
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
                                x0.t tVar = (x0.t) obj;
                                if (i21 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (tVar instanceof d0) {
                                        try {
                                            d0 d0Var2 = (d0) tVar;
                                            vVarL = d0Var2.l((c0) x0.l.j(d0Var2.f17148g, fVar), fVar, false, d0Var2.f17147d);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = eVarA.f20230a;
                                            int i22 = eVarA.f20232g;
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                ((n) objArr3[i23]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        vVarL = x0.l.j(tVar.e(), fVar);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(vVarL)) * 31) + Long.hashCode(vVarL.f24751a);
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
                        i13 = iIdentityHashCode;
                        break;
                    }
                    i16++;
                    i13 = i10;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i13;
            Object[] objArr4 = eVarA.f20230a;
            int i24 = eVarA.f20232g;
            for (int i25 = 0; i25 < i24; i25++) {
                ((n) objArr4[i25]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
