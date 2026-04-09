package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.Objects;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class LQ implements T0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f9701A;

    /* renamed from: a, reason: collision with root package name */
    public final R0.d f9702a;

    /* renamed from: b, reason: collision with root package name */
    public final T2 f9703b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f9704c;

    /* renamed from: d, reason: collision with root package name */
    public final C1994v2 f9705d;

    /* renamed from: e, reason: collision with root package name */
    public HQ f9706e;

    /* renamed from: f, reason: collision with root package name */
    public TP f9707f;

    /* renamed from: g, reason: collision with root package name */
    public C2255zu f9708g;

    /* renamed from: h, reason: collision with root package name */
    public int f9709h;
    public long[] i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f9710j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f9711k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f9712l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f9713m;

    /* renamed from: n, reason: collision with root package name */
    public S0[] f9714n;

    /* renamed from: o, reason: collision with root package name */
    public int f9715o;

    /* renamed from: p, reason: collision with root package name */
    public int f9716p;

    /* renamed from: q, reason: collision with root package name */
    public int f9717q;

    /* renamed from: r, reason: collision with root package name */
    public int f9718r;

    /* renamed from: s, reason: collision with root package name */
    public long f9719s;

    /* renamed from: t, reason: collision with root package name */
    public long f9720t;

    /* renamed from: u, reason: collision with root package name */
    public long f9721u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9722v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9723w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9724x;

    /* renamed from: y, reason: collision with root package name */
    public TP f9725y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9726z;

    public LQ(InterfaceC1292i interfaceC1292i, C1994v2 c1994v2, C2233zP c2233zP) {
        this.f9705d = c1994v2;
        R0.d dVar = new R0.d();
        dVar.f3380b = interfaceC1292i;
        dVar.f3381c = new C2036vr(32);
        C1187g2 c1187g2 = new C1187g2(0L);
        dVar.f3382d = c1187g2;
        dVar.f3383e = c1187g2;
        dVar.f3384f = c1187g2;
        this.f9702a = dVar;
        this.f9703b = new T2();
        this.f9709h = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        this.i = new long[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9710j = new long[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9713m = new long[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9712l = new int[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9711k = new int[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9714n = new S0[TTAdConstant.STYLE_SIZE_RADIO_1_1];
        this.f9704c = new J4(10, (byte) 0);
        this.f9719s = Long.MIN_VALUE;
        this.f9720t = Long.MIN_VALUE;
        this.f9721u = Long.MIN_VALUE;
        this.f9724x = true;
        this.f9723w = true;
        this.f9726z = true;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void a(int i, C2036vr c2036vr) {
        b(c2036vr, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final void b(C2036vr c2036vr, int i, int i3) {
        while (true) {
            R0.d dVar = this.f9702a;
            if (i <= 0) {
                dVar.getClass();
                return;
            }
            int iD = dVar.d(i);
            C1187g2 c1187g2 = (C1187g2) dVar.f3384f;
            C1238h c1238h = (C1238h) c1187g2.f14188c;
            byte[] bArr = c1238h.f14406a;
            long j6 = dVar.f3379a - c1187g2.f14186a;
            c1238h.getClass();
            c2036vr.H((int) j6, iD, bArr);
            i -= iD;
            long j7 = dVar.f3379a + iD;
            dVar.f3379a = j7;
            C1187g2 c1187g22 = (C1187g2) dVar.f3384f;
            if (j7 == c1187g22.f14187b) {
                dVar.f3384f = (C1187g2) c1187g22.f14189d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    @Override // com.google.android.gms.internal.ads.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.S0 r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LQ.c(long, int, int, int, com.google.android.gms.internal.ads.S0):void");
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int d(IN in, int i, boolean z6) throws EOFException {
        R0.d dVar = this.f9702a;
        int iD = dVar.d(i);
        C1187g2 c1187g2 = (C1187g2) dVar.f3384f;
        C1238h c1238h = (C1238h) c1187g2.f14188c;
        byte[] bArr = c1238h.f14406a;
        long j6 = dVar.f3379a - c1187g2.f14186a;
        c1238h.getClass();
        int iD2 = in.d((int) j6, iD, bArr);
        if (iD2 == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        long j7 = dVar.f3379a + iD2;
        dVar.f3379a = j7;
        C1187g2 c1187g22 = (C1187g2) dVar.f3384f;
        if (j7 == c1187g22.f14187b) {
            dVar.f3384f = (C1187g2) c1187g22.f14189d;
        }
        return iD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:18:0x004f), top: B:29:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.TP r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f9724x = r0     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.TP r1 = r5.f9725y     // Catch: java.lang.Throwable -> L4d
            boolean r1 = j$.util.Objects.equals(r6, r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto Le
            monitor-exit(r5)
            goto L64
        Le:
            com.google.android.gms.internal.ads.J4 r1 = r5.f9704c     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r1.f9225c     // Catch: java.lang.Throwable -> L4d
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
            java.lang.Object r2 = r1.f9225c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.valueAt(r4)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.KQ r2 = (com.google.android.gms.internal.ads.KQ) r2     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.TP r2 = r2.f9486a     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4f
            java.lang.Object r6 = r1.f9225c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L4d
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.KQ r6 = (com.google.android.gms.internal.ads.KQ) r6     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.TP r6 = r6.f9486a     // Catch: java.lang.Throwable -> L4d
            r5.f9725y = r6     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r6 = move-exception
            goto L72
        L4f:
            r5.f9725y = r6     // Catch: java.lang.Throwable -> L4d
        L51:
            boolean r6 = r5.f9726z     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.TP r1 = r5.f9725y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.f11397m     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.f11394j     // Catch: java.lang.Throwable -> L4d
            boolean r1 = com.google.android.gms.internal.ads.D4.d(r2, r1)     // Catch: java.lang.Throwable -> L4d
            r6 = r6 & r1
            r5.f9726z = r6     // Catch: java.lang.Throwable -> L4d
            r5.f9701A = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            r0 = r3
        L64:
            com.google.android.gms.internal.ads.HQ r6 = r5.f9706e
            if (r6 == 0) goto L71
            if (r0 == 0) goto L71
            android.os.Handler r0 = r6.f8923C
            com.google.android.gms.internal.ads.EQ r6 = r6.f8958m
            r0.post(r6)
        L71:
            return
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LQ.e(com.google.android.gms.internal.ads.TP):void");
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final int f(IN in, int i, boolean z6) {
        return d(in, i, z6);
    }

    public final synchronized void g() {
        this.f9718r = 0;
        R0.d dVar = this.f9702a;
        dVar.f3383e = (C1187g2) dVar.f3382d;
    }

    public final void h(TP tp, C1879sw c1879sw) {
        TP tp2 = this.f9707f;
        SO so = tp2 == null ? null : tp2.f11401q;
        this.f9707f = tp;
        SO so2 = tp.f11401q;
        this.f9705d.getClass();
        int i = so2 != null ? 1 : 0;
        C1855sP c1855sP = new C1855sP(tp);
        c1855sP.f16721K = i;
        c1879sw.f16824c = new TP(c1855sP);
        c1879sw.f16823b = this.f9708g;
        if (tp2 == null || !Objects.equals(so, so2)) {
            C2255zu c2255zu = so2 != null ? new C2255zu(13, new C2125xP(new BP())) : null;
            this.f9708g = c2255zu;
            c1879sw.f16823b = c2255zu;
        }
    }

    public final int i(int i, int i3, long j6, boolean z6) {
        int i6 = -1;
        for (int i7 = 0; i7 < i3; i7++) {
            long j7 = this.f9713m[i];
            if (j7 > j6) {
                break;
            }
            if (!z6 || (this.f9712l[i] & 1) != 0) {
                if (j7 == j6) {
                    return i7;
                }
                i6 = i7;
            }
            i++;
            if (i == this.f9709h) {
                i = 0;
            }
        }
        return i6;
    }

    public final long j(int i) {
        long j6 = this.f9720t;
        long jMax = Long.MIN_VALUE;
        int i3 = 0;
        if (i != 0) {
            int iK = k(i - 1);
            for (int i6 = 0; i6 < i; i6++) {
                jMax = Math.max(jMax, this.f9713m[iK]);
                if ((this.f9712l[iK] & 1) != 0) {
                    break;
                }
                iK--;
                if (iK == -1) {
                    iK = this.f9709h - 1;
                }
            }
        }
        this.f9720t = Math.max(j6, jMax);
        this.f9715o -= i;
        int i7 = this.f9716p + i;
        this.f9716p = i7;
        int i8 = this.f9717q + i;
        this.f9717q = i8;
        int i9 = this.f9709h;
        if (i8 >= i9) {
            this.f9717q = i8 - i9;
        }
        int i10 = this.f9718r - i;
        this.f9718r = i10;
        if (i10 < 0) {
            this.f9718r = 0;
        }
        while (true) {
            J4 j42 = this.f9704c;
            SparseArray sparseArray = (SparseArray) j42.f9225c;
            if (i3 >= sparseArray.size() - 1) {
                break;
            }
            int i11 = i3 + 1;
            if (i7 < sparseArray.keyAt(i11)) {
                break;
            }
            ((EO) j42.f9226d).mo4b(sparseArray.valueAt(i3));
            sparseArray.removeAt(i3);
            int i12 = j42.f9224b;
            if (i12 > 0) {
                j42.f9224b = i12 - 1;
            }
            i3 = i11;
        }
        if (this.f9715o != 0) {
            return this.f9710j[this.f9717q];
        }
        int i13 = this.f9717q;
        if (i13 == 0) {
            i13 = this.f9709h;
        }
        return this.f9710j[i13 - 1] + this.f9711k[r12];
    }

    public final int k(int i) {
        int i3 = this.f9717q + i;
        int i6 = this.f9709h;
        return i3 < i6 ? i3 : i3 - i6;
    }

    public final void l(boolean z6) {
        J4 j42;
        SparseArray sparseArray;
        R0.d dVar = this.f9702a;
        InterfaceC1292i interfaceC1292i = (InterfaceC1292i) dVar.f3380b;
        C1187g2 c1187g2 = (C1187g2) dVar.f3382d;
        if (((C1238h) c1187g2.f14188c) != null) {
            interfaceC1292i.o(c1187g2);
            c1187g2.f14188c = null;
            c1187g2.f14189d = null;
        }
        C1187g2 c1187g22 = (C1187g2) dVar.f3382d;
        int i = 0;
        AbstractC0582Jp.h0(((C1238h) c1187g22.f14188c) == null);
        c1187g22.f14186a = 0L;
        c1187g22.f14187b = 65536L;
        C1187g2 c1187g23 = (C1187g2) dVar.f3382d;
        dVar.f3383e = c1187g23;
        dVar.f3384f = c1187g23;
        dVar.f3379a = 0L;
        interfaceC1292i.m();
        this.f9715o = 0;
        this.f9716p = 0;
        this.f9717q = 0;
        this.f9718r = 0;
        this.f9723w = true;
        this.f9719s = Long.MIN_VALUE;
        this.f9720t = Long.MIN_VALUE;
        this.f9721u = Long.MIN_VALUE;
        this.f9722v = false;
        while (true) {
            j42 = this.f9704c;
            sparseArray = (SparseArray) j42.f9225c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((EO) j42.f9226d).mo4b(sparseArray.valueAt(i));
            i++;
        }
        j42.f9224b = -1;
        sparseArray.clear();
        if (z6) {
            this.f9725y = null;
            this.f9724x = true;
            this.f9726z = true;
        }
    }

    public final synchronized TP m() {
        if (this.f9724x) {
            return null;
        }
        return this.f9725y;
    }

    public final synchronized long n() {
        return this.f9721u;
    }

    public final synchronized boolean o(boolean z6) {
        int i = this.f9718r;
        boolean z7 = false;
        if (i != this.f9715o) {
            if (((KQ) this.f9704c.g(this.f9716p + i)).f9486a != this.f9707f) {
                return true;
            }
            int iK = k(this.f9718r);
            if (this.f9708g != null) {
                int i3 = this.f9712l[iK];
            } else {
                z7 = true;
            }
            return z7;
        }
        if (z6 || this.f9722v) {
            z7 = true;
        } else {
            TP tp = this.f9725y;
            if (tp != null) {
                if (tp == this.f9707f) {
                    return false;
                }
                z7 = true;
            }
        }
        return z7;
    }

    public final synchronized boolean p(long j6, boolean z6) throws Throwable {
        Throwable th;
        LQ lq;
        long j7;
        int i;
        try {
            try {
                g();
                int i3 = this.f9718r;
                int iK = k(i3);
                int i6 = this.f9718r;
                int i7 = this.f9715o;
                if ((i6 != i7) && j6 >= this.f9713m[iK]) {
                    if (j6 > this.f9721u) {
                        if (z6) {
                            z6 = true;
                        }
                    }
                    if (this.f9726z) {
                        i = i7 - i3;
                        int i8 = 0;
                        while (true) {
                            if (i8 < i) {
                                try {
                                    if (this.f9713m[iK] >= j6) {
                                        lq = this;
                                        j7 = j6;
                                        i = i8;
                                        break;
                                    }
                                    iK++;
                                    if (iK == this.f9709h) {
                                        iK = 0;
                                    }
                                    i8++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                lq = this;
                                j7 = j6;
                                if (!z6) {
                                    i = -1;
                                }
                            }
                        }
                    } else {
                        lq = this;
                        j7 = j6;
                        i = lq.i(iK, i7 - i3, j7, true);
                    }
                    if (i != -1) {
                        lq.f9719s = j7;
                        lq.f9718r += i;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void q(int i) {
        boolean z6 = false;
        if (i >= 0) {
            try {
                if (this.f9718r + i <= this.f9715o) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0582Jp.m(z6);
        this.f9718r += i;
    }

    public final void r() {
        long j6;
        R0.d dVar = this.f9702a;
        synchronized (this) {
            int i = this.f9715o;
            j6 = i == 0 ? -1L : j(i);
        }
        dVar.c(j6);
    }
}
