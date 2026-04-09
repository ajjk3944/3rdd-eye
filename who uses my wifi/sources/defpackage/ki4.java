package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ki4 implements jg1 {
    public boolean A;
    public final ii4 a;
    public final pz d;
    public bi4 e;
    public ph4 f;
    public ci3 g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    public ph4 y;
    public final lk1 b = new lk1();
    public int h = 1000;
    public long[] i = new long[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public ig1[] n = new ig1[1000];
    public final so1 c = new so1(15, false);
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;
    public boolean z = true;

    public ki4(rj4 rj4Var, pz pzVar, lv2 lv2Var) {
        this.d = pzVar;
        this.a = new ii4(rj4Var);
    }

    @Override // defpackage.jg1
    public final void a(kz2 kz2Var, int i, int i2) {
        while (true) {
            ii4 ii4Var = this.a;
            if (i <= 0) {
                ii4Var.getClass();
                return;
            }
            int iB = ii4Var.b(i);
            cj1 cj1Var = ii4Var.e;
            qj4 qj4Var = (qj4) cj1Var.h;
            byte[] bArr = qj4Var.a;
            long j = ii4Var.f - cj1Var.f;
            qj4Var.getClass();
            kz2Var.H(bArr, (int) j, iB);
            i -= iB;
            long j2 = ii4Var.f + iB;
            ii4Var.f = j2;
            cj1 cj1Var2 = ii4Var.e;
            if (j2 == cj1Var2.g) {
                ii4Var.e = (cj1) cj1Var2.i;
            }
        }
    }

    @Override // defpackage.jg1
    public final int b(ua4 ua4Var, int i, boolean z) throws EOFException {
        ii4 ii4Var = this.a;
        int iB = ii4Var.b(i);
        cj1 cj1Var = ii4Var.e;
        qj4 qj4Var = (qj4) cj1Var.h;
        byte[] bArr = qj4Var.a;
        long j = ii4Var.f - cj1Var.f;
        qj4Var.getClass();
        int iD = ua4Var.d(bArr, (int) j, iB);
        if (iD == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j2 = ii4Var.f + iD;
        ii4Var.f = j2;
        cj1 cj1Var2 = ii4Var.e;
        if (j2 == cj1Var2.g) {
            ii4Var.e = (cj1) cj1Var2.i;
        }
        return iD;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:21:0x003d, B:23:0x0042, B:27:0x0058, B:30:0x005f, B:34:0x0067, B:39:0x00a2, B:60:0x010b, B:62:0x0114, B:41:0x00bb, B:43:0x00bf, B:45:0x00d1, B:49:0x00da, B:50:0x00df, B:52:0x00e5, B:56:0x00f3, B:58:0x00f8, B:59:0x0108, B:68:0x0182), top: B:71:0x003d }] */
    @Override // defpackage.jg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r10, int r12, int r13, int r14, defpackage.ig1 r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki4.c(long, int, int, int, ig1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:18:0x004f), top: B:29:0x0002 }] */
    @Override // defpackage.jg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.ph4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.x = r0     // Catch: java.lang.Throwable -> L4d
            ph4 r1 = r5.y     // Catch: java.lang.Throwable -> L4d
            boolean r1 = java.util.Objects.equals(r6, r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto Le
            monitor-exit(r5)
            goto L64
        Le:
            so1 r1 = r5.c     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r1.g     // Catch: java.lang.Throwable -> L4d
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
            java.lang.Object r2 = r1.g     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.valueAt(r4)     // Catch: java.lang.Throwable -> L4d
            ji4 r2 = (defpackage.ji4) r2     // Catch: java.lang.Throwable -> L4d
            ph4 r2 = r2.a     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4f
            java.lang.Object r6 = r1.g     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L4d
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L4d
            ji4 r6 = (defpackage.ji4) r6     // Catch: java.lang.Throwable -> L4d
            ph4 r6 = r6.a     // Catch: java.lang.Throwable -> L4d
            r5.y = r6     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r6 = move-exception
            goto L72
        L4f:
            r5.y = r6     // Catch: java.lang.Throwable -> L4d
        L51:
            boolean r6 = r5.z     // Catch: java.lang.Throwable -> L4d
            ph4 r1 = r5.y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.m     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.j     // Catch: java.lang.Throwable -> L4d
            boolean r1 = defpackage.pp1.d(r2, r1)     // Catch: java.lang.Throwable -> L4d
            r6 = r6 & r1
            r5.z = r6     // Catch: java.lang.Throwable -> L4d
            r5.A = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            r0 = r3
        L64:
            bi4 r6 = r5.e
            if (r6 == 0) goto L71
            if (r0 == 0) goto L71
            android.os.Handler r0 = r6.t
            yh4 r6 = r6.r
            r0.post(r6)
        L71:
            return
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki4.d(ph4):void");
    }

    public final void e(ph4 ph4Var, mr2 mr2Var) {
        ph4 ph4Var2 = this.f;
        ie4 ie4Var = ph4Var2 == null ? null : ph4Var2.q;
        this.f = ph4Var;
        ie4 ie4Var2 = ph4Var.q;
        this.d.getClass();
        int i = ie4Var2 != null ? 1 : 0;
        gg4 gg4Var = new gg4(ph4Var);
        gg4Var.K = i;
        mr2Var.h = new ph4(gg4Var);
        mr2Var.g = this.g;
        if (ph4Var2 == null || !Objects.equals(ie4Var, ie4Var2)) {
            ci3 ci3Var = ie4Var2 != null ? new ci3(7, new if4(new rf4())) : null;
            this.g = ci3Var;
            mr2Var.g = ci3Var;
        }
    }

    public final int f(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final long g(int i) {
        long j = this.t;
        long jMax = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int iH = h(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.m[iH]);
                if ((this.l[iH] & 1) != 0) {
                    break;
                }
                iH--;
                if (iH == -1) {
                    iH = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, jMax);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        while (true) {
            so1 so1Var = this.c;
            SparseArray sparseArray = (SparseArray) so1Var.g;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((hd4) so1Var.h).mo12c(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = so1Var.f;
            if (i9 > 0) {
                so1Var.f = i9 - 1;
            }
            i2 = i8;
        }
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i10 = this.q;
        if (i10 == 0) {
            i10 = this.h;
        }
        return this.j[i10 - 1] + this.k[r12];
    }

    public final int h(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void i(boolean z) {
        so1 so1Var;
        SparseArray sparseArray;
        ii4 ii4Var = this.a;
        rj4 rj4Var = ii4Var.a;
        cj1 cj1Var = ii4Var.c;
        if (((qj4) cj1Var.h) != null) {
            rj4Var.b(cj1Var);
            cj1Var.h = null;
            cj1Var.i = null;
        }
        cj1 cj1Var2 = ii4Var.c;
        int i = 0;
        zt0.b0(((qj4) cj1Var2.h) == null);
        cj1Var2.f = 0L;
        cj1Var2.g = 65536L;
        cj1 cj1Var3 = ii4Var.c;
        ii4Var.d = cj1Var3;
        ii4Var.e = cj1Var3;
        ii4Var.f = 0L;
        rj4Var.l();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        while (true) {
            so1Var = this.c;
            sparseArray = (SparseArray) so1Var.g;
            if (i >= sparseArray.size()) {
                break;
            }
            ((hd4) so1Var.h).mo12c(sparseArray.valueAt(i));
            i++;
        }
        so1Var.f = -1;
        sparseArray.clear();
        if (z) {
            this.y = null;
            this.x = true;
            this.z = true;
        }
    }

    public final synchronized boolean j(boolean z) {
        int i = this.r;
        boolean z2 = false;
        if (i != this.o) {
            if (((ji4) this.c.n(this.p + i)).a != this.f) {
                return true;
            }
            int iH = h(this.r);
            if (this.g != null) {
                int i2 = this.l[iH];
            } else {
                z2 = true;
            }
            return z2;
        }
        if (z || this.v) {
            z2 = true;
        } else {
            ph4 ph4Var = this.y;
            if (ph4Var != null) {
                if (ph4Var == this.f) {
                    return false;
                }
                z2 = true;
            }
        }
        return z2;
    }

    public final synchronized boolean k(long j, boolean z) throws Throwable {
        ki4 ki4Var;
        long j2;
        try {
            synchronized (this) {
                try {
                    try {
                        this.r = 0;
                        ii4 ii4Var = this.a;
                        ii4Var.d = ii4Var.c;
                        int iH = h(0);
                        int i = this.r;
                        int iF = this.o;
                        if ((i != iF) && j >= this.m[iH]) {
                            if (j > this.u) {
                                if (z) {
                                    z = true;
                                }
                            }
                            if (this.z) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < iF) {
                                        try {
                                            if (this.m[iH] >= j) {
                                                ki4Var = this;
                                                j2 = j;
                                                iF = i2;
                                                break;
                                            }
                                            iH++;
                                            if (iH == this.h) {
                                                iH = 0;
                                            }
                                            i2++;
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            throw th2;
                                        }
                                    } else {
                                        ki4Var = this;
                                        j2 = j;
                                        if (!z) {
                                            iF = -1;
                                        }
                                    }
                                }
                            } else {
                                ki4Var = this;
                                j2 = j;
                                iF = ki4Var.f(iH, iF, j2, true);
                            }
                            if (iF != -1) {
                                ki4Var.s = j2;
                                ki4Var.r += iF;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th2;
                    }
                } finally {
                    th = th;
                    while (true) {
                        Throwable th4 = th;
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void l() {
        long jG;
        ii4 ii4Var = this.a;
        synchronized (this) {
            int i = this.o;
            jG = i == 0 ? -1L : g(i);
        }
        ii4Var.a(jG);
    }
}
