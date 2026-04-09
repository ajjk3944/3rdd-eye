package o5;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import java.io.EOFException;

/* loaded from: classes.dex */
public class w0 implements u5.a0 {
    public androidx.media3.common.r A;
    public androidx.media3.common.r B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f19078a;

    /* renamed from: d, reason: collision with root package name */
    public final i5.j f19081d;

    /* renamed from: e, reason: collision with root package name */
    public final i5.f f19082e;

    /* renamed from: f, reason: collision with root package name */
    public Object f19083f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.common.r f19084g;

    /* renamed from: h, reason: collision with root package name */
    public h7.h0 f19085h;

    /* renamed from: p, reason: collision with root package name */
    public int f19091p;

    /* renamed from: q, reason: collision with root package name */
    public int f19092q;

    /* renamed from: r, reason: collision with root package name */
    public int f19093r;

    /* renamed from: s, reason: collision with root package name */
    public int f19094s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19098w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19101z;

    /* renamed from: b, reason: collision with root package name */
    public final k9.b f19079b = new k9.b();

    /* renamed from: i, reason: collision with root package name */
    public int f19086i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f19089n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f19088m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f19087l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public u5.z[] f19090o = new u5.z[1000];

    /* renamed from: c, reason: collision with root package name */
    public final bc.f0 f19080c = new bc.f0(new io.sentry.android.core.u0(25));

    /* renamed from: t, reason: collision with root package name */
    public long f19095t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f19096u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f19097v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19100y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19099x = true;

    public w0(r5.b bVar, i5.j jVar, i5.f fVar) {
        this.f19081d = jVar;
        this.f19082e = fVar;
        this.f19078a = new t0(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019e, B:112:0x01a7, B:89:0x013f, B:91:0x0143, B:93:0x014b, B:95:0x0164, B:99:0x016d, B:100:0x0172, B:102:0x0178, B:106:0x0186, B:108:0x018b, B:109:0x019b, B:92:0x0149), top: B:118:0x00c0 }] */
    @Override // u5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r17, int r19, int r20, int r21, u5.z r22) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.w0.a(long, int, int, int, u5.z):void");
    }

    @Override // u5.a0
    public final int b(androidx.media3.common.l lVar, int i10, boolean z10) throws EOFException {
        t0 t0Var = this.f19078a;
        int iD = t0Var.d(i10);
        io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) t0Var.f19062h;
        r5.a aVar = (r5.a) cVar.f11923r;
        int i11 = lVar.read(aVar.f21227a, ((int) (t0Var.f19057c - cVar.f11921d)) + aVar.f21228b, iD);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j = t0Var.f19057c + i11;
        t0Var.f19057c = j;
        io.sentry.android.replay.gestures.c cVar2 = (io.sentry.android.replay.gestures.c) t0Var.f19062h;
        if (j == cVar2.f11922g) {
            t0Var.f19062h = (io.sentry.android.replay.gestures.c) cVar2.f11924x;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x000a, B:8:0x0017, B:13:0x0029, B:15:0x0042, B:19:0x005d, B:81:0x0111, B:73:0x00fe, B:76:0x0106, B:18:0x005b), top: B:91:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, o5.v0] */
    @Override // u5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.media3.common.r r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.w0.c(androidx.media3.common.r):void");
    }

    @Override // u5.a0
    public final void d(int i10, a5.v vVar) {
        while (true) {
            t0 t0Var = this.f19078a;
            if (i10 <= 0) {
                t0Var.getClass();
                return;
            }
            int iD = t0Var.d(i10);
            io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) t0Var.f19062h;
            r5.a aVar = (r5.a) cVar.f11923r;
            vVar.e(aVar.f21227a, ((int) (t0Var.f19057c - cVar.f11921d)) + aVar.f21228b, iD);
            i10 -= iD;
            long j = t0Var.f19057c + iD;
            t0Var.f19057c = j;
            io.sentry.android.replay.gestures.c cVar2 = (io.sentry.android.replay.gestures.c) t0Var.f19062h;
            if (j == cVar2.f11922g) {
                t0Var.f19062h = (io.sentry.android.replay.gestures.c) cVar2.f11924x;
            }
        }
    }

    public final long e(int i10) {
        this.f19096u = Math.max(this.f19096u, l(i10));
        this.f19091p -= i10;
        int i11 = this.f19092q + i10;
        this.f19092q = i11;
        int i12 = this.f19093r + i10;
        this.f19093r = i12;
        int i13 = this.f19086i;
        if (i12 >= i13) {
            this.f19093r = i12 - i13;
        }
        int i14 = this.f19094s - i10;
        this.f19094s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f19094s = 0;
        }
        bc.f0 f0Var = this.f19080c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((io.sentry.android.core.u0) f0Var.f2604r).g(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = f0Var.f2602d;
            if (i17 > 0) {
                f0Var.f2602d = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f19091p != 0) {
            return this.k[this.f19093r];
        }
        int i18 = this.f19093r;
        if (i18 == 0) {
            i18 = this.f19086i;
        }
        return this.k[i18 - 1] + this.f19087l[r7];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            o5.t0 r0 = r11.f19078a
            monitor-enter(r11)
            int r1 = r11.f19091p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f19089n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f19093r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r14 == 0) goto L1d
            int r14 = r11.f19094s     // Catch: java.lang.Throwable -> L1f
            if (r14 == r1) goto L1d
            int r1 = r14 + 1
        L1d:
            r7 = r1
            goto L23
        L1f:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L23:
            r10 = 0
            r5 = r11
            r8 = r12
            int r12 = r5.j(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.e(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.c(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.w0.f(long, boolean):void");
    }

    public final void g() {
        long jE;
        t0 t0Var = this.f19078a;
        synchronized (this) {
            int i10 = this.f19091p;
            jE = i10 == 0 ? -1L : e(i10);
        }
        t0Var.c(jE);
    }

    public final long h(int i10) {
        int i11 = this.f19092q;
        int i12 = this.f19091p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        a5.a.e(i13 >= 0 && i13 <= i12 - this.f19094s);
        int i14 = this.f19091p - i13;
        this.f19091p = i14;
        this.f19097v = Math.max(this.f19096u, l(i14));
        if (i13 == 0 && this.f19098w) {
            z10 = true;
        }
        this.f19098w = z10;
        bc.f0 f0Var = this.f19080c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((io.sentry.android.core.u0) f0Var.f2604r).g(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        f0Var.f2602d = sparseArray.size() > 0 ? Math.min(f0Var.f2602d, sparseArray.size() - 1) : -1;
        int i15 = this.f19091p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[n(i15 - 1)] + this.f19087l[r9];
    }

    public final void i(int i10) {
        long jH = h(i10);
        t0 t0Var = this.f19078a;
        int i11 = t0Var.f19056b;
        a5.a.e(jH <= t0Var.f19057c);
        t0Var.f19057c = jH;
        if (jH != 0) {
            io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) t0Var.f19060f;
            if (jH != cVar.f11921d) {
                while (t0Var.f19057c > cVar.f11922g) {
                    cVar = (io.sentry.android.replay.gestures.c) cVar.f11924x;
                }
                io.sentry.android.replay.gestures.c cVar2 = (io.sentry.android.replay.gestures.c) cVar.f11924x;
                cVar2.getClass();
                t0Var.b(cVar2);
                io.sentry.android.replay.gestures.c cVar3 = new io.sentry.android.replay.gestures.c(i11, cVar.f11922g);
                cVar.f11924x = cVar3;
                if (t0Var.f19057c == cVar.f11922g) {
                    cVar = cVar3;
                }
                t0Var.f19062h = cVar;
                if (((io.sentry.android.replay.gestures.c) t0Var.f19061g) == cVar2) {
                    t0Var.f19061g = cVar3;
                    return;
                }
                return;
            }
        }
        t0Var.b((io.sentry.android.replay.gestures.c) t0Var.f19060f);
        io.sentry.android.replay.gestures.c cVar4 = new io.sentry.android.replay.gestures.c(i11, t0Var.f19057c);
        t0Var.f19060f = cVar4;
        t0Var.f19061g = cVar4;
        t0Var.f19062h = cVar4;
    }

    public final int j(int i10, int i11, long j, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j7 = this.f19089n[i10];
            if (j7 > j) {
                break;
            }
            if (!z10 || (this.f19088m[i10] & 1) != 0) {
                if (j7 == j) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f19086i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public androidx.media3.common.r k(androidx.media3.common.r rVar) {
        if (this.F == 0 || rVar.L == Long.MAX_VALUE) {
            return rVar;
        }
        androidx.media3.common.q qVarA = rVar.a();
        qVarA.f1746o = rVar.L + this.F;
        return new androidx.media3.common.r(qVarA);
    }

    public final long l(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iN = n(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f19089n[iN]);
            if ((this.f19088m[iN] & 1) != 0) {
                return jMax;
            }
            iN--;
            if (iN == -1) {
                iN = this.f19086i - 1;
            }
        }
        return jMax;
    }

    public final int m() {
        return this.f19092q + this.f19094s;
    }

    public final int n(int i10) {
        int i11 = this.f19093r + i10;
        int i12 = this.f19086i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int o(long j, boolean z10) throws Throwable {
        try {
            try {
                int iN = n(this.f19094s);
                int i10 = this.f19094s;
                int i11 = this.f19091p;
                if (!(i10 != i11) || j < this.f19089n[iN]) {
                    return 0;
                }
                if (j > this.f19097v && z10) {
                    return i11 - i10;
                }
                int iJ = j(iN, i11 - i10, j, true);
                if (iJ == -1) {
                    return 0;
                }
                return iJ;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized androidx.media3.common.r p() {
        return this.f19100y ? null : this.B;
    }

    public final synchronized boolean q(boolean z10) {
        androidx.media3.common.r rVar;
        boolean z11 = false;
        if (this.f19094s != this.f19091p) {
            if (((u0) this.f19080c.f(m())).f19069a != this.f19084g) {
                return true;
            }
            return r(n(this.f19094s));
        }
        if (z10 || this.f19098w || ((rVar = this.B) != null && rVar != this.f19084g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean r(int i10) {
        h7.h0 h0Var = this.f19085h;
        if (h0Var == null || h0Var.F() == 4) {
            return true;
        }
        if ((this.f19088m[i10] & 1073741824) != 0) {
            return false;
        }
        this.f19085h.getClass();
        return false;
    }

    public final void s() throws i5.d {
        h7.h0 h0Var = this.f19085h;
        if (h0Var == null || h0Var.F() != 1) {
            return;
        }
        i5.d dVarC = this.f19085h.C();
        dVarC.getClass();
        throw dVarC;
    }

    public final void t(androidx.media3.common.r rVar, io.sentry.internal.debugmeta.c cVar) {
        androidx.media3.common.r rVar2;
        androidx.media3.common.r rVar3 = this.f19084g;
        boolean z10 = rVar3 == null;
        DrmInitData drmInitData = z10 ? null : rVar3.K;
        this.f19084g = rVar;
        DrmInitData drmInitData2 = rVar.K;
        i5.j jVar = this.f19081d;
        if (jVar != null) {
            int iC = jVar.c(rVar);
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.F = iC;
            rVar2 = new androidx.media3.common.r(qVarA);
        } else {
            rVar2 = rVar;
        }
        cVar.f12354g = rVar2;
        cVar.f12353d = this.f19085h;
        if (jVar == null) {
            return;
        }
        if (z10 || !a5.d0.a(drmInitData, drmInitData2)) {
            h7.h0 h0Var = this.f19085h;
            i5.f fVar = this.f19082e;
            h7.h0 h0VarB = jVar.b(fVar, rVar);
            this.f19085h = h0VarB;
            cVar.f12353d = h0VarB;
            if (h0Var != null) {
                h0Var.U(fVar);
            }
        }
    }

    public final synchronized int u() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19094s != this.f19091p ? this.j[n(this.f19094s)] : this.C;
    }

    public final int v(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        k9.b bVar = this.f19079b;
        synchronized (this) {
            try {
                gVar.f3307x = false;
                i11 = -3;
                if (this.f19094s != this.f19091p) {
                    androidx.media3.common.r rVar = ((u0) this.f19080c.f(m())).f19069a;
                    if (!z11 && rVar == this.f19084g) {
                        int iN = n(this.f19094s);
                        if (r(iN)) {
                            gVar.f3295d = this.f19088m[iN];
                            if (this.f19094s == this.f19091p - 1 && (z10 || this.f19098w)) {
                                gVar.b(536870912);
                            }
                            long j = this.f19089n[iN];
                            gVar.f3308y = j;
                            if (j < this.f19095t) {
                                gVar.b(Integer.MIN_VALUE);
                            }
                            bVar.f14217a = this.f19087l[iN];
                            bVar.f14218b = this.k[iN];
                            bVar.f14219c = this.f19090o[iN];
                            i11 = -4;
                        } else {
                            gVar.f3307x = true;
                        }
                    }
                    t(rVar, cVar);
                    i11 = -5;
                } else {
                    if (!z10 && !this.f19098w) {
                        androidx.media3.common.r rVar2 = this.B;
                        if (rVar2 == null || (!z11 && rVar2 == this.f19084g)) {
                        }
                        t(rVar2, cVar);
                        i11 = -5;
                    }
                    gVar.f3295d = 4;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !gVar.g(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    t0 t0Var = this.f19078a;
                    t0.j((io.sentry.android.replay.gestures.c) t0Var.f19061g, gVar, this.f19079b, (a5.v) t0Var.f19059e);
                } else {
                    t0 t0Var2 = this.f19078a;
                    t0Var2.f19061g = t0.j((io.sentry.android.replay.gestures.c) t0Var2.f19061g, gVar, this.f19079b, (a5.v) t0Var2.f19059e);
                }
            }
            if (!z12) {
                this.f19094s++;
            }
        }
        return i11;
    }

    public final void w(boolean z10) {
        t0 t0Var = this.f19078a;
        t0Var.b((io.sentry.android.replay.gestures.c) t0Var.f19060f);
        io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) t0Var.f19060f;
        int i10 = t0Var.f19056b;
        a5.a.i(((r5.a) cVar.f11923r) == null);
        cVar.f11921d = 0L;
        cVar.f11922g = i10;
        io.sentry.android.replay.gestures.c cVar2 = (io.sentry.android.replay.gestures.c) t0Var.f19060f;
        t0Var.f19061g = cVar2;
        t0Var.f19062h = cVar2;
        t0Var.f19057c = 0L;
        ((r5.e) ((r5.b) t0Var.f19058d)).b();
        this.f19091p = 0;
        this.f19092q = 0;
        this.f19093r = 0;
        this.f19094s = 0;
        this.f19099x = true;
        this.f19095t = Long.MIN_VALUE;
        this.f19096u = Long.MIN_VALUE;
        this.f19097v = Long.MIN_VALUE;
        this.f19098w = false;
        bc.f0 f0Var = this.f19080c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((io.sentry.android.core.u0) f0Var.f2604r).g(sparseArray.valueAt(i11));
        }
        f0Var.f2602d = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f19100y = true;
        }
    }

    public final synchronized boolean x(long j, boolean z10) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.f19094s = 0;
                        t0 t0Var = this.f19078a;
                        t0Var.f19061g = (io.sentry.android.replay.gestures.c) t0Var.f19060f;
                        int iN = n(0);
                        int i10 = this.f19094s;
                        int i11 = this.f19091p;
                        if ((i10 != i11) && j >= this.f19089n[iN]) {
                            if (j <= this.f19097v || z10) {
                                int iJ = j(iN, i11 - i10, j, true);
                                if (iJ == -1) {
                                    return false;
                                }
                                this.f19095t = j;
                                this.f19094s += iJ;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th2 = th;
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void y(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f19094s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f19091p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            a5.a.e(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f19094s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f19094s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.w0.y(int):void");
    }
}
