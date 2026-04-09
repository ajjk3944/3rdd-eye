package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public x41 f13695a;

    /* renamed from: b, reason: collision with root package name */
    public mx1 f13696b;

    /* renamed from: c, reason: collision with root package name */
    public long f13697c;

    /* renamed from: d, reason: collision with root package name */
    public long f13698d;

    /* renamed from: e, reason: collision with root package name */
    public int f13699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f13700f;

    public m0(q0 q0Var, Context context) {
        this.f13700f = q0Var;
        bq0.j(context);
        v41 v41Var = x41.f18307b;
        this.f13695a = u51.f17096e;
        this.f13698d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean A1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void C1() {
        long j = this.f13698d;
        q0 q0Var = this.f13700f;
        q0Var.getClass();
        if (q0Var.f15178o >= j) {
            q0Var.f15170e.C1();
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final Surface D1() {
        mq0.c0(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void E1() {
        q0 q0Var = this.f13700f;
        q0Var.getClass();
        yk0.f18785c.getClass();
        q0Var.f15175l = null;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void N1() {
        q0 q0Var = this.f13700f;
        if (q0Var.j.d() == 0) {
            q0Var.f15170e.N1();
            return;
        }
        k5 k5Var = new k5();
        if (q0Var.j.d() <= 0) {
            q0Var.j = k5Var;
        } else {
            ((p0) q0Var.j.e()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void O1() {
        q0 q0Var = this.f13700f;
        if (q0Var.f15177n == 2) {
            return;
        }
        no0 no0Var = q0Var.f15174k;
        if (no0Var != null) {
            no0Var.f14385a.removeCallbacksAndMessages(null);
        }
        q0Var.f15175l = null;
        q0Var.f15177n = 2;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean Q1(boolean z3) {
        return this.f13700f.f15170e.f9154a.e(false);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void S1(boolean z3) {
        this.f13698d = -9223372036854775807L;
        q0 q0Var = this.f13700f;
        if (q0Var.f15177n == 1) {
            q0Var.f15176m++;
            q0Var.f15170e.S1(z3);
            while (q0Var.j.d() > 1) {
                q0Var.j.e();
            }
            if (q0Var.j.d() == 1) {
                ((p0) q0Var.j.e()).getClass();
                throw null;
            }
            q0Var.f15178o = -9223372036854775807L;
            no0 no0Var = q0Var.f15174k;
            no0Var.getClass();
            no0Var.e(new s(2, q0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void T1(float f10) {
        q0 q0Var = this.f13700f;
        u0 u0Var = q0Var.f15173i;
        u0Var.getClass();
        mq0.m(f10 > 0.0f);
        u0Var.f17027d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        u0Var.a();
        q0Var.f15170e.T1(f10);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean U1(long j, e0 e0Var) {
        int i4;
        mq0.c0(false);
        long j8 = j + this.f13697c;
        q0 q0Var = this.f13700f;
        u0 u0Var = q0Var.f15173i;
        long j9 = u0Var.f17024a == -9223372036854775807L ? -9223372036854775807L : (long) (((j8 - r3) * u0Var.f17026c) + u0Var.f17025b);
        if (j9 != -9223372036854775807L) {
            long j10 = q0Var.f15172h;
            if (j10 != -9223372036854775807L && j9 < j10 && (i4 = this.f13699e) < 2) {
                this.f13699e = i4 + 1;
                e0Var.a();
                return true;
            }
        }
        int i10 = q0Var.f15179p;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void V1(r0 r0Var) {
        this.f13700f.f15170e.j = r0Var;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void X1(long j, long j8) {
        this.f13700f.f15170e.X1(j + this.f13697c, j8);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void Y1(Surface surface, yk0 yk0Var) {
        q0 q0Var = this.f13700f;
        Pair pair = q0Var.f15175l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((yk0) q0Var.f15175l.second).equals(yk0Var)) {
            return;
        }
        q0Var.f15175l = Pair.create(surface, yk0Var);
        yk0Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void Z1(int i4) {
        this.f13700f.f15170e.Z1(i4);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void a() {
        q0 q0Var = this.f13700f;
        if (q0Var.f15169d) {
            q0Var.f15170e.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void a2(List list) {
        if (this.f13695a.equals(list)) {
            return;
        }
        this.f13695a = x41.q(list);
        mx1 mx1Var = this.f13696b;
        if (mx1Var == null) {
            return;
        }
        lw1 lw1Var = new lw1(mx1Var);
        sm1 sm1Var = mx1Var.C;
        if (sm1Var == null || !sm1Var.d()) {
            sm1Var = sm1.f16479h;
        }
        lw1Var.B = sm1Var;
        lw1Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void b() {
        q0 q0Var = this.f13700f;
        if (q0Var.f15169d) {
            q0Var.f15170e.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void b2(boolean z3) {
        q0 q0Var = this.f13700f;
        if (q0Var.f15169d) {
            q0Var.f15170e.b2(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void c2(long j) {
        this.f13697c = j;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void d2(mx1 mx1Var, long j, int i4, List list) {
        mq0.c0(false);
        this.f13695a = x41.q(list);
        this.f13696b = mx1Var;
        this.f13700f.getClass();
        lw1 lw1Var = new lw1(mx1Var);
        sm1 sm1Var = mx1Var.C;
        if (sm1Var == null || !sm1Var.d()) {
            sm1Var = sm1.f16479h;
        }
        lw1Var.B = sm1Var;
        lw1Var.b();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[Catch: pc0 -> 0x0036, TryCatch #0 {pc0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[Catch: pc0 -> 0x0036, TRY_LEAVE, TryCatch #0 {pc0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    @Override // com.google.android.gms.internal.ads.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e2(com.google.android.gms.internal.ads.mx1 r10) throws com.google.android.gms.internal.ads.i1 {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            com.google.android.gms.internal.ads.q0 r1 = r9.f13700f
            int r2 = r1.f15177n
            r3 = 0
            r4 = 1
            if (r2 != 0) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            com.google.android.gms.internal.ads.mq0.c0(r2)
            com.google.android.gms.internal.ads.sm1 r2 = r10.C
            if (r2 == 0) goto L1b
            boolean r5 = r2.d()
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            com.google.android.gms.internal.ads.sm1 r2 = com.google.android.gms.internal.ads.sm1.f16479h
        L1d:
            int r2 = r2.f16482c     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r2 != r7) goto L41
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            r8 = 34
            if (r2 >= r8) goto L3c
            if (r2 < r6) goto L39
            boolean r2 = com.google.android.gms.internal.ads.a80.L(r5)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
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
            com.google.android.gms.internal.ads.sm1 r10 = new com.google.android.gms.internal.ads.sm1     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            goto L88
        L41:
            r8 = 6
            if (r2 != r8) goto L51
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            if (r7 < r6) goto L4f
            boolean r5 = com.google.android.gms.internal.ads.a80.L(r5)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            if (r5 == 0) goto L4f
            r3 = r4
        L4f:
            r4 = r3
            goto L59
        L51:
            if (r2 != r7) goto L59
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r4 = com.google.android.gms.internal.ads.a80.L(r3)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
        L59:
            if (r4 != 0) goto L7f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            r4 = 29
            if (r3 >= r4) goto L62
            goto L7f
        L62:
            java.lang.String r3 = "PlaybackVidGraphWrapper"
            java.lang.String r4 = com.google.android.gms.internal.ads.bq0.f9768a     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            java.util.Locale r4 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            r4.<init>(r0)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            r4.append(r2)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r4.append(r0)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            java.lang.String r0 = r4.toString()     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            com.google.android.gms.internal.ads.ls.t(r3, r0)     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            com.google.android.gms.internal.ads.sm1 r10 = com.google.android.gms.internal.ads.sm1.f16479h     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
            goto L88
        L7f:
            r0 = 2
            if (r2 == r0) goto L86
            r0 = 10
            if (r2 != r0) goto L88
        L86:
            com.google.android.gms.internal.ads.sm1 r10 = com.google.android.gms.internal.ads.sm1.f16479h     // Catch: com.google.android.gms.internal.ads.pc0 -> L36
        L88:
            com.google.android.gms.internal.ads.w5 r10 = r1.f15171f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r2 = 0
            com.google.android.gms.internal.ads.no0 r10 = r10.A(r0, r2)
            r1.f15174k = r10
            com.google.android.gms.internal.ads.o0 r10 = r1.f15167b
            r10.a()
            throw r2
        L9e:
            com.google.android.gms.internal.ads.i1 r1 = new com.google.android.gms.internal.ads.i1
            r1.<init>(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m0.e2(com.google.android.gms.internal.ads.mx1):boolean");
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void W1(mx0 mx0Var) {
    }
}
