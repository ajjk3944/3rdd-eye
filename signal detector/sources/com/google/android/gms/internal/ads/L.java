package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import java.util.List;

/* loaded from: classes.dex */
public final class L implements InterfaceC1185g0 {

    /* renamed from: a, reason: collision with root package name */
    public LB f9590a;

    /* renamed from: b, reason: collision with root package name */
    public TP f9591b;

    /* renamed from: c, reason: collision with root package name */
    public long f9592c;

    /* renamed from: d, reason: collision with root package name */
    public long f9593d;

    /* renamed from: e, reason: collision with root package name */
    public int f9594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f9595f;

    public L(P p6, Context context) {
        this.f9595f = p6;
        Vt.j(context);
        JB jb = LB.f9635b;
        this.f9590a = C1197gC.f14227e;
        this.f9593d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void A0(boolean z6) {
        P p6 = this.f9595f;
        if (p6.f10297d) {
            p6.f10298e.A0(z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void B0(long j6) {
        this.f9592c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void C0(TP tp, long j6, int i, List list) {
        AbstractC0582Jp.h0(false);
        this.f9590a = LB.m(list);
        this.f9591b = tp;
        this.f9595f.getClass();
        C1855sP c1855sP = new C1855sP(tp);
        HK hk = tp.f11376C;
        if (hk == null || !hk.d()) {
            hk = HK.f8893h;
        }
        c1855sP.f16712B = hk;
        c1855sP.b();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[Catch: tn -> 0x0036, TryCatch #0 {tn -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[Catch: tn -> 0x0036, TRY_LEAVE, TryCatch #0 {tn -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D0(com.google.android.gms.internal.ads.TP r10) throws com.google.android.gms.internal.ads.C1130f0 {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            com.google.android.gms.internal.ads.P r1 = r9.f9595f
            int r2 = r1.f10306n
            r3 = 0
            r4 = 1
            if (r2 != 0) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            com.google.android.gms.internal.ads.AbstractC0582Jp.h0(r2)
            com.google.android.gms.internal.ads.HK r2 = r10.f11376C
            if (r2 == 0) goto L1b
            boolean r5 = r2.d()
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            com.google.android.gms.internal.ads.HK r2 = com.google.android.gms.internal.ads.HK.f8893h
        L1d:
            int r2 = r2.f8896c     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r2 != r7) goto L41
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            r8 = 34
            if (r2 >= r8) goto L3c
            if (r2 < r6) goto L39
            boolean r2 = com.google.android.gms.internal.ads.AbstractC0933bL.H(r5)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            if (r2 == 0) goto L39
            r2 = r4
            goto L3a
        L36:
            r0 = move-exception
            goto L9e
        L39:
            r2 = r3
        L3a:
            if (r2 != 0) goto L3e
        L3c:
            r2 = r7
            goto L41
        L3e:
            com.google.android.gms.internal.ads.HK r10 = new com.google.android.gms.internal.ads.HK     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            goto L88
        L41:
            r8 = 6
            if (r2 != r8) goto L51
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            if (r7 < r6) goto L4f
            boolean r5 = com.google.android.gms.internal.ads.AbstractC0933bL.H(r5)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            if (r5 == 0) goto L4f
            r3 = r4
        L4f:
            r4 = r3
            goto L59
        L51:
            if (r2 != r7) goto L59
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r4 = com.google.android.gms.internal.ads.AbstractC0933bL.H(r3)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
        L59:
            if (r4 != 0) goto L7f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            r4 = 29
            if (r3 >= r4) goto L62
            goto L7f
        L62:
            java.lang.String r3 = "PlaybackVidGraphWrapper"
            java.lang.String r4 = com.google.android.gms.internal.ads.Vt.f12096a     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            java.util.Locale r4 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            r4.<init>(r0)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            r4.append(r2)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r4.append(r0)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            java.lang.String r0 = r4.toString()     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            com.google.android.gms.internal.ads.AbstractC2022vd.v(r3, r0)     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            com.google.android.gms.internal.ads.HK r10 = com.google.android.gms.internal.ads.HK.f8893h     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
            goto L88
        L7f:
            r0 = 2
            if (r2 == r0) goto L86
            r0 = 10
            if (r2 != r0) goto L88
        L86:
            com.google.android.gms.internal.ads.HK r10 = com.google.android.gms.internal.ads.HK.f8893h     // Catch: com.google.android.gms.internal.ads.C1924tn -> L36
        L88:
            com.google.android.gms.internal.ads.v2 r10 = r1.f10299f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r2 = 0
            com.google.android.gms.internal.ads.gt r10 = r10.B(r0, r2)
            r1.f10303k = r10
            com.google.android.gms.internal.ads.N r10 = r1.f10295b
            r10.a()
            throw r2
        L9e:
            com.google.android.gms.internal.ads.f0 r1 = new com.google.android.gms.internal.ads.f0
            r1.<init>(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L.D0(com.google.android.gms.internal.ads.TP):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void G() {
        P p6 = this.f9595f;
        if (p6.f10306n == 2) {
            return;
        }
        C1231gt c1231gt = p6.f10303k;
        if (c1231gt != null) {
            c1231gt.f14397a.removeCallbacksAndMessages(null);
        }
        p6.f10304l = null;
        p6.f10306n = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void N() {
        P p6 = this.f9595f;
        if (p6.f10302j.e() == 0) {
            p6.f10298e.N();
            return;
        }
        M3.o oVar = new M3.o();
        if (p6.f10302j.e() <= 0) {
            p6.f10302j = oVar;
        } else {
            ((O) p6.f10302j.f()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void a() {
        P p6 = this.f9595f;
        if (p6.f10297d) {
            p6.f10298e.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void c() {
        P p6 = this.f9595f;
        if (p6.f10297d) {
            p6.f10298e.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean d0(boolean z6) {
        return this.f9595f.f10298e.f7085a.e(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void j() {
        long j6 = this.f9593d;
        P p6 = this.f9595f;
        p6.getClass();
        if (p6.f10307o >= j6) {
            p6.f10298e.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final Surface k() {
        AbstractC0582Jp.h0(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void l() {
        P p6 = this.f9595f;
        p6.getClass();
        Ar.f7055c.getClass();
        p6.f10304l = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void r0(boolean z6) {
        this.f9593d = -9223372036854775807L;
        P p6 = this.f9595f;
        if (p6.f10306n == 1) {
            p6.f10305m++;
            p6.f10298e.r0(z6);
            while (p6.f10302j.e() > 1) {
                p6.f10302j.f();
            }
            if (p6.f10302j.e() == 1) {
                ((O) p6.f10302j.f()).getClass();
                throw null;
            }
            p6.f10307o = -9223372036854775807L;
            C1231gt c1231gt = p6.f10303k;
            c1231gt.getClass();
            c1231gt.e(new RunnableC1883t(2, p6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void s0(float f2) {
        P p6 = this.f9595f;
        U u6 = p6.i;
        u6.getClass();
        AbstractC0582Jp.m(f2 > 0.0f);
        u6.f11530d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f2));
        u6.a();
        p6.f10298e.s0(f2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean t0(long j6, F f2) {
        int i;
        AbstractC0582Jp.h0(false);
        long j7 = j6 + this.f9592c;
        P p6 = this.f9595f;
        U u6 = p6.i;
        long j8 = u6.f11527a == -9223372036854775807L ? -9223372036854775807L : (long) (((j7 - r3) * u6.f11529c) + u6.f11528b);
        if (j8 != -9223372036854775807L) {
            long j9 = p6.f10301h;
            if (j9 != -9223372036854775807L && j8 < j9 && (i = this.f9594e) < 2) {
                this.f9594e = i + 1;
                f2.a();
                return true;
            }
        }
        int i3 = p6.f10308p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void u0(Q q3) {
        this.f9595f.f10298e.f7093j = q3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void v0(long j6, long j7) {
        this.f9595f.f10298e.v0(j6 + this.f9592c, j7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void w0(Surface surface, Ar ar) {
        P p6 = this.f9595f;
        Pair pair = p6.f10304l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Ar) p6.f10304l.second).equals(ar)) {
            return;
        }
        p6.f10304l = Pair.create(surface, ar);
        ar.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void x0(int i) {
        this.f9595f.f10298e.x0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void y0(List list) {
        if (this.f9590a.equals(list)) {
            return;
        }
        this.f9590a = LB.m(list);
        TP tp = this.f9591b;
        if (tp == null) {
            return;
        }
        C1855sP c1855sP = new C1855sP(tp);
        HK hk = tp.f11376C;
        if (hk == null || !hk.d()) {
            hk = HK.f8893h;
        }
        c1855sP.f16712B = hk;
        c1855sP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void z0(L6 l6) {
    }
}
