package ya;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d5.y0;
import java.io.EOFException;
import y1.f1;

/* loaded from: classes.dex */
public class r0 implements ca.x {
    public boolean A;
    public Format B;
    public Format C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final o5.t0 f26153a;

    /* renamed from: d, reason: collision with root package name */
    public final ba.h f26156d;

    /* renamed from: e, reason: collision with root package name */
    public final ba.d f26157e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f26158f;

    /* renamed from: g, reason: collision with root package name */
    public Object f26159g;

    /* renamed from: h, reason: collision with root package name */
    public Format f26160h;

    /* renamed from: i, reason: collision with root package name */
    public b9.e f26161i;

    /* renamed from: q, reason: collision with root package name */
    public int f26167q;

    /* renamed from: r, reason: collision with root package name */
    public int f26168r;

    /* renamed from: s, reason: collision with root package name */
    public int f26169s;

    /* renamed from: t, reason: collision with root package name */
    public int f26170t;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26174x;

    /* renamed from: b, reason: collision with root package name */
    public final k9.b f26154b = new k9.b();
    public int j = 1000;
    public int[] k = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public long[] f26162l = new long[1000];

    /* renamed from: o, reason: collision with root package name */
    public long[] f26165o = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public int[] f26164n = new int[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f26163m = new int[1000];

    /* renamed from: p, reason: collision with root package name */
    public ca.w[] f26166p = new ca.w[1000];

    /* renamed from: c, reason: collision with root package name */
    public final bc.f0 f26155c = new bc.f0(new f1());

    /* renamed from: u, reason: collision with root package name */
    public long f26171u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f26172v = Long.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public long f26173w = Long.MIN_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26176z = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26175y = true;

    public r0(pb.b bVar, Looper looper, ba.h hVar, ba.d dVar) {
        this.f26158f = looper;
        this.f26156d = hVar;
        this.f26157e = dVar;
        this.f26153a = new o5.t0(bVar);
    }

    @Override // ca.x
    public final void a(int i10, fb.f fVar) {
        while (true) {
            o5.t0 t0Var = this.f26153a;
            if (i10 <= 0) {
                t0Var.getClass();
                return;
            }
            int iD = t0Var.d(i10);
            y0 y0Var = (y0) t0Var.f19062h;
            pb.a aVar = (pb.a) y0Var.f7109x;
            fVar.c(aVar.f20353a, ((int) (t0Var.f19057c - y0Var.f7106d)) + aVar.f20354b, iD);
            i10 -= iD;
            long j = t0Var.f19057c + iD;
            t0Var.f19057c = j;
            y0 y0Var2 = (y0) t0Var.f19062h;
            if (j == y0Var2.f7107g) {
                t0Var.f19062h = (y0) y0Var2.f7110y;
            }
        }
    }

    @Override // ca.x
    public final int c(pb.k kVar, int i10, boolean z10) throws EOFException {
        o5.t0 t0Var = this.f26153a;
        int iD = t0Var.d(i10);
        y0 y0Var = (y0) t0Var.f19062h;
        pb.a aVar = (pb.a) y0Var.f7109x;
        int i11 = kVar.read(aVar.f20353a, ((int) (t0Var.f19057c - y0Var.f7106d)) + aVar.f20354b, iD);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j = t0Var.f19057c + i11;
        t0Var.f19057c = j;
        y0 y0Var2 = (y0) t0Var.f19062h;
        if (j == y0Var2.f7107g) {
            t0Var.f19062h = (y0) y0Var2.f7110y;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01b0, B:112:0x01b9, B:89:0x014c, B:91:0x0150, B:93:0x015d, B:95:0x0176, B:99:0x017f, B:100:0x0184, B:102:0x018a, B:106:0x0198, B:108:0x019d, B:109:0x01ad, B:92:0x015b), top: B:118:0x00cd }] */
    @Override // ca.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(long r17, int r19, int r20, int r21, ca.w r22) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.r0.d(long, int, int, int, ca.w):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x000a, B:8:0x0017, B:13:0x0029, B:15:0x0042, B:19:0x005d, B:81:0x0113, B:73:0x00fe, B:76:0x0106, B:18:0x005b), top: B:91:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, ya.q0] */
    @Override // ca.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.exoplayer2.Format r6) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.r0.e(com.google.android.exoplayer2.Format):void");
    }

    public final long f(int i10) {
        this.f26172v = Math.max(this.f26172v, m(i10));
        this.f26167q -= i10;
        int i11 = this.f26168r + i10;
        this.f26168r = i11;
        int i12 = this.f26169s + i10;
        this.f26169s = i12;
        int i13 = this.j;
        if (i12 >= i13) {
            this.f26169s = i12 - i13;
        }
        int i14 = this.f26170t - i10;
        this.f26170t = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f26170t = 0;
        }
        bc.f0 f0Var = this.f26155c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((f1) f0Var.f2604r).a(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = f0Var.f2602d;
            if (i17 > 0) {
                f0Var.f2602d = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f26167q != 0) {
            return this.f26162l[this.f26169s];
        }
        int i18 = this.f26169s;
        if (i18 == 0) {
            i18 = this.j;
        }
        return this.f26162l[i18 - 1] + this.f26163m[r7];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            o5.t0 r0 = r11.f26153a
            monitor-enter(r11)
            int r1 = r11.f26167q     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f26165o     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f26169s     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r14 == 0) goto L1d
            int r14 = r11.f26170t     // Catch: java.lang.Throwable -> L1f
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
            int r12 = r5.k(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.f(r12)     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: ya.r0.g(long, boolean):void");
    }

    public final void h() {
        long jF;
        o5.t0 t0Var = this.f26153a;
        synchronized (this) {
            int i10 = this.f26167q;
            jF = i10 == 0 ? -1L : f(i10);
        }
        t0Var.c(jF);
    }

    public final long i(int i10) {
        int i11 = this.f26168r;
        int i12 = this.f26167q;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        qb.b.g(i13 >= 0 && i13 <= i12 - this.f26170t);
        int i14 = this.f26167q - i13;
        this.f26167q = i14;
        this.f26173w = Math.max(this.f26172v, m(i14));
        if (i13 == 0 && this.f26174x) {
            z10 = true;
        }
        this.f26174x = z10;
        bc.f0 f0Var = this.f26155c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((f1) f0Var.f2604r).a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        f0Var.f2602d = sparseArray.size() > 0 ? Math.min(f0Var.f2602d, sparseArray.size() - 1) : -1;
        int i15 = this.f26167q;
        if (i15 == 0) {
            return 0L;
        }
        return this.f26162l[o(i15 - 1)] + this.f26163m[r9];
    }

    public final void j(int i10) {
        long j;
        long jI = i(i10);
        o5.t0 t0Var = this.f26153a;
        int i11 = t0Var.f19056b;
        t0Var.f19057c = jI;
        if (jI != 0) {
            y0 y0Var = (y0) t0Var.f19060f;
            if (jI != y0Var.f7106d) {
                while (true) {
                    long j7 = t0Var.f19057c;
                    j = y0Var.f7107g;
                    if (j7 <= j) {
                        break;
                    } else {
                        y0Var = (y0) y0Var.f7110y;
                    }
                }
                y0 y0Var2 = (y0) y0Var.f7110y;
                t0Var.a(y0Var2);
                y0 y0Var3 = new y0(i11, j);
                y0Var.f7110y = y0Var3;
                if (t0Var.f19057c == j) {
                    y0Var = y0Var3;
                }
                t0Var.f19062h = y0Var;
                if (((y0) t0Var.f19061g) == y0Var2) {
                    t0Var.f19061g = y0Var3;
                    return;
                }
                return;
            }
        }
        t0Var.a((y0) t0Var.f19060f);
        y0 y0Var4 = new y0(i11, t0Var.f19057c);
        t0Var.f19060f = y0Var4;
        t0Var.f19061g = y0Var4;
        t0Var.f19062h = y0Var4;
    }

    public final int k(int i10, int i11, long j, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j7 = this.f26165o[i10];
            if (j7 > j) {
                break;
            }
            if (!z10 || (this.f26164n[i10] & 1) != 0) {
                if (j7 == j) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.j) {
                i10 = 0;
            }
        }
        return i12;
    }

    public Format l(Format format) {
        if (this.G == 0 || format.L == Long.MAX_VALUE) {
            return format;
        }
        com.google.android.exoplayer2.g0 g0VarD = format.d();
        g0VarD.f4154o = format.L + this.G;
        return new Format(g0VarD);
    }

    public final long m(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f26165o[iO]);
            if ((this.f26164n[iO] & 1) != 0) {
                return jMax;
            }
            iO--;
            if (iO == -1) {
                iO = this.j - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.f26168r + this.f26170t;
    }

    public final int o(int i10) {
        int i11 = this.f26169s + i10;
        int i12 = this.j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int p(long j, boolean z10) throws Throwable {
        try {
            try {
                int iO = o(this.f26170t);
                int i10 = this.f26170t;
                int i11 = this.f26167q;
                if (!(i10 != i11) || j < this.f26165o[iO]) {
                    return 0;
                }
                if (j > this.f26173w && z10) {
                    return i11 - i10;
                }
                int iK = k(iO, i11 - i10, j, true);
                if (iK == -1) {
                    return 0;
                }
                return iK;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized Format q() {
        return this.f26176z ? null : this.C;
    }

    public final synchronized boolean r(boolean z10) {
        Format format;
        boolean z11 = false;
        if (this.f26170t != this.f26167q) {
            if (((p0) this.f26155c.f(n())).f26137a != this.f26160h) {
                return true;
            }
            return s(o(this.f26170t));
        }
        if (z10 || this.f26174x || ((format = this.C) != null && format != this.f26160h)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean s(int i10) {
        b9.e eVar = this.f26161i;
        if (eVar == null || eVar.z() == 4) {
            return true;
        }
        if ((this.f26164n[i10] & 1073741824) != 0) {
            return false;
        }
        this.f26161i.getClass();
        return false;
    }

    public final void t() throws ba.b {
        b9.e eVar = this.f26161i;
        if (eVar == null || eVar.z() != 1) {
            return;
        }
        ba.b bVarW = this.f26161i.w();
        bVarW.getClass();
        throw bVarW;
    }

    public final void u(Format format, io.sentry.internal.debugmeta.c cVar) {
        Format format2;
        Format format3 = this.f26160h;
        boolean z10 = format3 == null;
        DrmInitData drmInitData = z10 ? null : format3.K;
        this.f26160h = format;
        DrmInitData drmInitData2 = format.K;
        ba.h hVar = this.f26156d;
        if (hVar != null) {
            Class clsB = hVar.b(format);
            com.google.android.exoplayer2.g0 g0VarD = format.d();
            g0VarD.D = clsB;
            format2 = new Format(g0VarD);
        } else {
            format2 = format;
        }
        cVar.f12354g = format2;
        cVar.f12353d = this.f26161i;
        if (hVar == null) {
            return;
        }
        if (z10 || !qb.v.a(drmInitData, drmInitData2)) {
            b9.e eVar = this.f26161i;
            Looper looper = this.f26158f;
            looper.getClass();
            ba.d dVar = this.f26157e;
            b9.e eVarA = hVar.a(looper, dVar, format);
            this.f26161i = eVarA;
            cVar.f12353d = eVarA;
            if (eVar != null) {
                eVar.D(dVar);
            }
        }
    }

    public final synchronized int v() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f26170t != this.f26167q ? this.k[o(this.f26170t)] : this.D;
    }

    public final int w(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        k9.b bVar = this.f26154b;
        synchronized (this) {
            try {
                dVar.f26792x = false;
                i11 = -3;
                if (this.f26170t != this.f26167q) {
                    Format format = ((p0) this.f26155c.f(n())).f26137a;
                    if (!z11 && format == this.f26160h) {
                        int iO = o(this.f26170t);
                        if (s(iO)) {
                            int i12 = this.f26164n[iO];
                            dVar.f3295d = i12;
                            long j = this.f26165o[iO];
                            dVar.f26793y = j;
                            if (j < this.f26171u) {
                                dVar.f3295d = i12 | Integer.MIN_VALUE;
                            }
                            bVar.f14217a = this.f26163m[iO];
                            bVar.f14218b = this.f26162l[iO];
                            bVar.f14219c = this.f26166p[iO];
                            i11 = -4;
                        } else {
                            dVar.f26792x = true;
                        }
                    }
                    u(format, cVar);
                    i11 = -5;
                } else {
                    if (!z10 && !this.f26174x) {
                        Format format2 = this.C;
                        if (format2 == null || (!z11 && format2 == this.f26160h)) {
                        }
                        u(format2, cVar);
                        i11 = -5;
                    }
                    dVar.f3295d = 4;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !dVar.g(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    o5.t0 t0Var = this.f26153a;
                    o5.t0.i((y0) t0Var.f19061g, dVar, this.f26154b, (fb.f) t0Var.f19059e);
                } else {
                    o5.t0 t0Var2 = this.f26153a;
                    t0Var2.f19061g = o5.t0.i((y0) t0Var2.f19061g, dVar, this.f26154b, (fb.f) t0Var2.f19059e);
                }
            }
            if (!z12) {
                this.f26170t++;
            }
        }
        return i11;
    }

    public final void x(boolean z10) {
        o5.t0 t0Var = this.f26153a;
        t0Var.a((y0) t0Var.f19060f);
        y0 y0Var = new y0(t0Var.f19056b, 0L);
        t0Var.f19060f = y0Var;
        t0Var.f19061g = y0Var;
        t0Var.f19062h = y0Var;
        t0Var.f19057c = 0L;
        ((pb.p) ((pb.b) t0Var.f19058d)).c();
        this.f26167q = 0;
        this.f26168r = 0;
        this.f26169s = 0;
        this.f26170t = 0;
        this.f26175y = true;
        this.f26171u = Long.MIN_VALUE;
        this.f26172v = Long.MIN_VALUE;
        this.f26173w = Long.MIN_VALUE;
        this.f26174x = false;
        bc.f0 f0Var = this.f26155c;
        SparseArray sparseArray = (SparseArray) f0Var.f2603g;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((f1) f0Var.f2604r).a(sparseArray.valueAt(i10));
        }
        f0Var.f2602d = -1;
        sparseArray.clear();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f26176z = true;
        }
    }

    public final synchronized boolean y(long j, boolean z10) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.f26170t = 0;
                        o5.t0 t0Var = this.f26153a;
                        t0Var.f19061g = (y0) t0Var.f19060f;
                        int iO = o(0);
                        int i10 = this.f26170t;
                        int i11 = this.f26167q;
                        if ((i10 != i11) && j >= this.f26165o[iO]) {
                            if (j <= this.f26173w || z10) {
                                int iK = k(iO, i11 - i10, j, true);
                                if (iK == -1) {
                                    return false;
                                }
                                this.f26171u = j;
                                this.f26170t += iK;
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
    public final synchronized void z(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f26170t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f26167q     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            qb.b.g(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f26170t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f26170t = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.r0.z(int):void");
    }
}
