package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hz1 implements u2 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final fz1 f12041a;

    /* renamed from: b, reason: collision with root package name */
    public final ca.c f12042b;

    /* renamed from: c, reason: collision with root package name */
    public final oa f12043c;

    /* renamed from: d, reason: collision with root package name */
    public final w5 f12044d;

    /* renamed from: e, reason: collision with root package name */
    public bz1 f12045e;

    /* renamed from: f, reason: collision with root package name */
    public mx1 f12046f;
    public rg0 g;

    /* renamed from: h, reason: collision with root package name */
    public int f12047h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f12048i;
    public long[] j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f12049k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f12050l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f12051m;

    /* renamed from: n, reason: collision with root package name */
    public t2[] f12052n;

    /* renamed from: o, reason: collision with root package name */
    public int f12053o;

    /* renamed from: p, reason: collision with root package name */
    public int f12054p;

    /* renamed from: q, reason: collision with root package name */
    public int f12055q;

    /* renamed from: r, reason: collision with root package name */
    public int f12056r;

    /* renamed from: s, reason: collision with root package name */
    public long f12057s;

    /* renamed from: t, reason: collision with root package name */
    public long f12058t;

    /* renamed from: u, reason: collision with root package name */
    public long f12059u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12060v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12061w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12062x;

    /* renamed from: y, reason: collision with root package name */
    public mx1 f12063y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12064z;

    public hz1(i iVar, w5 w5Var, ce1 ce1Var) {
        this.f12044d = w5Var;
        fz1 fz1Var = new fz1();
        fz1Var.f11319b = iVar;
        fz1Var.f11320c = new sk0(32);
        g5 g5Var = new g5(0L);
        fz1Var.f11321d = g5Var;
        fz1Var.f11322e = g5Var;
        fz1Var.f11323f = g5Var;
        this.f12041a = fz1Var;
        this.f12042b = new ca.c();
        this.f12047h = 1000;
        this.f12048i = new long[1000];
        this.j = new long[1000];
        this.f12051m = new long[1000];
        this.f12050l = new int[1000];
        this.f12049k = new int[1000];
        this.f12052n = new t2[1000];
        this.f12043c = new oa((byte) 0, 10);
        this.f12057s = Long.MIN_VALUE;
        this.f12058t = Long.MIN_VALUE;
        this.f12059u = Long.MIN_VALUE;
        this.f12062x = true;
        this.f12061w = true;
        this.f12064z = true;
    }

    public final synchronized void a() {
        this.f12056r = 0;
        fz1 fz1Var = this.f12041a;
        fz1Var.f11322e = (g5) fz1Var.f11321d;
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void b(int i4, sk0 sk0Var) {
        c(sk0Var, i4, 0);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void c(sk0 sk0Var, int i4, int i10) {
        while (true) {
            fz1 fz1Var = this.f12041a;
            if (i4 <= 0) {
                fz1Var.getClass();
                return;
            }
            int iC = fz1Var.c(i4);
            g5 g5Var = (g5) fz1Var.f11323f;
            h hVar = (h) g5Var.f11375c;
            byte[] bArr = hVar.f11670a;
            long j = fz1Var.f11318a - g5Var.f11373a;
            hVar.getClass();
            sk0Var.H((int) j, iC, bArr);
            i4 -= iC;
            long j8 = fz1Var.f11318a + iC;
            fz1Var.f11318a = j8;
            g5 g5Var2 = (g5) fz1Var.f11323f;
            if (j8 == g5Var2.f11374b) {
                fz1Var.f11323f = (g5) g5Var2.f11376d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    @Override // com.google.android.gms.internal.ads.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.t2 r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hz1.d(long, int, int, int, com.google.android.gms.internal.ads.t2):void");
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int e(vs1 vs1Var, int i4, boolean z3) throws EOFException {
        fz1 fz1Var = this.f12041a;
        int iC = fz1Var.c(i4);
        g5 g5Var = (g5) fz1Var.f11323f;
        h hVar = (h) g5Var.f11375c;
        byte[] bArr = hVar.f11670a;
        long j = fz1Var.f11318a - g5Var.f11373a;
        hVar.getClass();
        int iD = vs1Var.d((int) j, iC, bArr);
        if (iD == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j8 = fz1Var.f11318a + iD;
        fz1Var.f11318a = j8;
        g5 g5Var2 = (g5) fz1Var.f11323f;
        if (j8 == g5Var2.f11374b) {
            fz1Var.f11323f = (g5) g5Var2.f11376d;
        }
        return iD;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:18:0x004f), top: B:29:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.internal.ads.mx1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f12062x = r0     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.mx1 r1 = r5.f12063y     // Catch: java.lang.Throwable -> L4d
            boolean r1 = j$.util.Objects.equals(r6, r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto Le
            monitor-exit(r5)
            goto L64
        Le:
            com.google.android.gms.internal.ads.oa r1 = r5.f12043c     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r1.f14618c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            if (r2 != 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 != 0) goto L4f
            java.lang.Object r2 = r1.f14618c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.valueAt(r4)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.gz1 r2 = (com.google.android.gms.internal.ads.gz1) r2     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.mx1 r2 = r2.f11669a     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4f
            java.lang.Object r6 = r1.f14618c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L4d
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.gz1 r6 = (com.google.android.gms.internal.ads.gz1) r6     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.mx1 r6 = r6.f11669a     // Catch: java.lang.Throwable -> L4d
            r5.f12063y = r6     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r6 = move-exception
            goto L72
        L4f:
            r5.f12063y = r6     // Catch: java.lang.Throwable -> L4d
        L51:
            boolean r6 = r5.f12064z     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.mx1 r1 = r5.f12063y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.f14052m     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.j     // Catch: java.lang.Throwable -> L4d
            boolean r1 = com.google.android.gms.internal.ads.ia.d(r2, r1)     // Catch: java.lang.Throwable -> L4d
            r6 = r6 & r1
            r5.f12064z = r6     // Catch: java.lang.Throwable -> L4d
            r5.A = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            r0 = r3
        L64:
            com.google.android.gms.internal.ads.bz1 r6 = r5.f12045e
            if (r6 == 0) goto L71
            if (r0 == 0) goto L71
            android.os.Handler r0 = r6.f9873o
            com.google.android.gms.internal.ads.yy1 r6 = r6.f9871m
            r0.post(r6)
        L71:
            return
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hz1.f(com.google.android.gms.internal.ads.mx1):void");
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int g(vs1 vs1Var, int i4, boolean z3) {
        return e(vs1Var, i4, z3);
    }

    public final void h(mx1 mx1Var, ce1 ce1Var) {
        mx1 mx1Var2 = this.f12046f;
        iv1 iv1Var = mx1Var2 == null ? null : mx1Var2.f14056q;
        this.f12046f = mx1Var;
        iv1 iv1Var2 = mx1Var.f14056q;
        this.f12044d.getClass();
        int i4 = iv1Var2 != null ? 1 : 0;
        lw1 lw1Var = new lw1(mx1Var);
        lw1Var.K = i4;
        ce1Var.f10095c = new mx1(lw1Var);
        ce1Var.f10094b = this.g;
        if (mx1Var2 == null || !Objects.equals(iv1Var, iv1Var2)) {
            rg0 rg0Var = iv1Var2 != null ? new rg0(26, new qw1(new tw1())) : null;
            this.g = rg0Var;
            ce1Var.f10094b = rg0Var;
        }
    }

    public final int i(int i4, int i10, long j, boolean z3) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j8 = this.f12051m[i4];
            if (j8 > j) {
                break;
            }
            if (!z3 || (this.f12050l[i4] & 1) != 0) {
                if (j8 == j) {
                    return i12;
                }
                i11 = i12;
            }
            i4++;
            if (i4 == this.f12047h) {
                i4 = 0;
            }
        }
        return i11;
    }

    public final long j(int i4) {
        long j = this.f12058t;
        long jMax = Long.MIN_VALUE;
        int i10 = 0;
        if (i4 != 0) {
            int iK = k(i4 - 1);
            for (int i11 = 0; i11 < i4; i11++) {
                jMax = Math.max(jMax, this.f12051m[iK]);
                if ((this.f12050l[iK] & 1) != 0) {
                    break;
                }
                iK--;
                if (iK == -1) {
                    iK = this.f12047h - 1;
                }
            }
        }
        this.f12058t = Math.max(j, jMax);
        this.f12053o -= i4;
        int i12 = this.f12054p + i4;
        this.f12054p = i12;
        int i13 = this.f12055q + i4;
        this.f12055q = i13;
        int i14 = this.f12047h;
        if (i13 >= i14) {
            this.f12055q = i13 - i14;
        }
        int i15 = this.f12056r - i4;
        this.f12056r = i15;
        if (i15 < 0) {
            this.f12056r = 0;
        }
        while (true) {
            oa oaVar = this.f12043c;
            SparseArray sparseArray = (SparseArray) oaVar.f14618c;
            if (i10 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i10 + 1;
            if (i12 < sparseArray.keyAt(i16)) {
                break;
            }
            ((uu1) oaVar.f14619d).mo160c(sparseArray.valueAt(i10));
            sparseArray.removeAt(i10);
            int i17 = oaVar.f14617b;
            if (i17 > 0) {
                oaVar.f14617b = i17 - 1;
            }
            i10 = i16;
        }
        if (this.f12053o != 0) {
            return this.j[this.f12055q];
        }
        int i18 = this.f12055q;
        if (i18 == 0) {
            i18 = this.f12047h;
        }
        return this.j[i18 - 1] + this.f12049k[r12];
    }

    public final int k(int i4) {
        int i10 = this.f12055q + i4;
        int i11 = this.f12047h;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final void l(boolean z3) {
        oa oaVar;
        SparseArray sparseArray;
        fz1 fz1Var = this.f12041a;
        i iVar = (i) fz1Var.f11319b;
        g5 g5Var = (g5) fz1Var.f11321d;
        if (((h) g5Var.f11375c) != null) {
            iVar.h(g5Var);
            g5Var.f11375c = null;
            g5Var.f11376d = null;
        }
        g5 g5Var2 = (g5) fz1Var.f11321d;
        int i4 = 0;
        mq0.c0(((h) g5Var2.f11375c) == null);
        g5Var2.f11373a = 0L;
        g5Var2.f11374b = 65536L;
        g5 g5Var3 = (g5) fz1Var.f11321d;
        fz1Var.f11322e = g5Var3;
        fz1Var.f11323f = g5Var3;
        fz1Var.f11318a = 0L;
        iVar.f();
        this.f12053o = 0;
        this.f12054p = 0;
        this.f12055q = 0;
        this.f12056r = 0;
        this.f12061w = true;
        this.f12057s = Long.MIN_VALUE;
        this.f12058t = Long.MIN_VALUE;
        this.f12059u = Long.MIN_VALUE;
        this.f12060v = false;
        while (true) {
            oaVar = this.f12043c;
            sparseArray = (SparseArray) oaVar.f14618c;
            if (i4 >= sparseArray.size()) {
                break;
            }
            ((uu1) oaVar.f14619d).mo160c(sparseArray.valueAt(i4));
            i4++;
        }
        oaVar.f14617b = -1;
        sparseArray.clear();
        if (z3) {
            this.f12063y = null;
            this.f12062x = true;
            this.f12064z = true;
        }
    }

    public final synchronized mx1 m() {
        if (this.f12062x) {
            return null;
        }
        return this.f12063y;
    }

    public final synchronized long n() {
        return this.f12059u;
    }

    public final synchronized boolean o(boolean z3) {
        int i4 = this.f12056r;
        boolean z10 = false;
        if (i4 != this.f12053o) {
            if (((gz1) this.f12043c.g(this.f12054p + i4)).f11669a != this.f12046f) {
                return true;
            }
            int iK = k(this.f12056r);
            if (this.g != null) {
                int i10 = this.f12050l[iK];
            } else {
                z10 = true;
            }
            return z10;
        }
        if (z3 || this.f12060v) {
            z10 = true;
        } else {
            mx1 mx1Var = this.f12063y;
            if (mx1Var != null) {
                if (mx1Var == this.f12046f) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    public final synchronized boolean p(long j, boolean z3) {
        Throwable th2;
        hz1 hz1Var;
        long j8;
        int i4;
        try {
            try {
                a();
                int i10 = this.f12056r;
                int iK = k(i10);
                int i11 = this.f12056r;
                int i12 = this.f12053o;
                if ((i11 != i12) && j >= this.f12051m[iK]) {
                    if (j > this.f12059u) {
                        if (z3) {
                            z3 = true;
                        }
                    }
                    if (this.f12064z) {
                        i4 = i12 - i10;
                        int i13 = 0;
                        while (true) {
                            if (i13 < i4) {
                                try {
                                    if (this.f12051m[iK] >= j) {
                                        hz1Var = this;
                                        j8 = j;
                                        i4 = i13;
                                        break;
                                    }
                                    iK++;
                                    if (iK == this.f12047h) {
                                        iK = 0;
                                    }
                                    i13++;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            } else {
                                hz1Var = this;
                                j8 = j;
                                if (!z3) {
                                    i4 = -1;
                                }
                            }
                        }
                    } else {
                        hz1Var = this;
                        j8 = j;
                        i4 = hz1Var.i(iK, i12 - i10, j8, true);
                    }
                    if (i4 != -1) {
                        hz1Var.f12057s = j8;
                        hz1Var.f12056r += i4;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized void q(int i4) {
        boolean z3 = false;
        if (i4 >= 0) {
            try {
                if (this.f12056r + i4 <= this.f12053o) {
                    z3 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mq0.m(z3);
        this.f12056r += i4;
    }

    public final void r() {
        long j;
        fz1 fz1Var = this.f12041a;
        synchronized (this) {
            int i4 = this.f12053o;
            j = i4 == 0 ? -1L : j(i4);
        }
        fz1Var.b(j);
    }
}
