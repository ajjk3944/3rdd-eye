package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wd1 implements pe1 {
    public xm3 a;
    public ph4 b;
    public long c;
    public long d;
    public int e;
    public final /* synthetic */ ae1 f;

    public wd1(ae1 ae1Var, Context context) {
        this.f = ae1Var;
        v23.j(context);
        vm3 vm3Var = xm3.g;
        this.a = sn3.j;
        this.d = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[Catch: lq2 -> 0x0036, TryCatch #0 {lq2 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0084, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[Catch: lq2 -> 0x0036, TRY_LEAVE, TryCatch #0 {lq2 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0084, B:36:0x0053), top: B:51:0x001d }] */
    @Override // defpackage.pe1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0(defpackage.ph4 r10) throws defpackage.oe1 {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            ae1 r1 = r9.f
            int r2 = r1.n
            r3 = 0
            r4 = 1
            if (r2 != 0) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            defpackage.zt0.b0(r2)
            n74 r2 = r10.C
            if (r2 == 0) goto L1b
            boolean r5 = r2.d()
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            n74 r2 = defpackage.n74.h
        L1d:
            int r2 = r2.c     // Catch: defpackage.lq2 -> L36
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r2 != r7) goto L41
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.lq2 -> L36
            r8 = 34
            if (r2 >= r8) goto L3c
            if (r2 < r6) goto L39
            boolean r2 = defpackage.ou1.X(r5)     // Catch: defpackage.lq2 -> L36
            if (r2 == 0) goto L39
            r2 = r4
            goto L3a
        L36:
            r0 = move-exception
            goto L9c
        L39:
            r2 = r3
        L3a:
            if (r2 != 0) goto L3e
        L3c:
            r2 = r7
            goto L41
        L3e:
            n74 r10 = new n74     // Catch: defpackage.lq2 -> L36
            goto L86
        L41:
            r8 = 6
            if (r2 != r8) goto L51
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.lq2 -> L36
            if (r7 < r6) goto L4f
            boolean r5 = defpackage.ou1.X(r5)     // Catch: defpackage.lq2 -> L36
            if (r5 == 0) goto L4f
            r3 = r4
        L4f:
            r4 = r3
            goto L59
        L51:
            if (r2 != r7) goto L59
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r4 = defpackage.ou1.X(r3)     // Catch: defpackage.lq2 -> L36
        L59:
            if (r4 != 0) goto L7d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.lq2 -> L36
            r4 = 29
            if (r3 >= r4) goto L62
            goto L7d
        L62:
            java.lang.String r3 = defpackage.v23.a     // Catch: defpackage.lq2 -> L36
            java.util.Locale r3 = java.util.Locale.US     // Catch: defpackage.lq2 -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.lq2 -> L36
            r3.<init>(r0)     // Catch: defpackage.lq2 -> L36
            r3.append(r2)     // Catch: defpackage.lq2 -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r3.append(r0)     // Catch: defpackage.lq2 -> L36
            java.lang.String r0 = r3.toString()     // Catch: defpackage.lq2 -> L36
            defpackage.a30.x(r0)     // Catch: defpackage.lq2 -> L36
            n74 r10 = defpackage.n74.h     // Catch: defpackage.lq2 -> L36
            goto L86
        L7d:
            r0 = 2
            if (r2 == r0) goto L84
            r0 = 10
            if (r2 != r0) goto L86
        L84:
            n74 r10 = defpackage.n74.h     // Catch: defpackage.lq2 -> L36
        L86:
            pz r10 = r1.f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r2 = 0
            d13 r10 = r10.p(r0, r2)
            r1.k = r10
            yd1 r10 = r1.b
            r10.a()
            throw r2
        L9c:
            oe1 r1 = new oe1
            r1.<init>(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.A0(ph4):boolean");
    }

    @Override // defpackage.pe1
    public final void K() {
        ae1 ae1Var = this.f;
        if (ae1Var.n == 2) {
            return;
        }
        d13 d13Var = ae1Var.k;
        if (d13Var != null) {
            d13Var.a.removeCallbacksAndMessages(null);
        }
        ae1Var.l = null;
        ae1Var.n = 2;
    }

    @Override // defpackage.pe1
    public final void N() {
        ae1 ae1Var = this.f;
        if (ae1Var.j.c() == 0) {
            ae1Var.e.N();
            return;
        }
        ts tsVar = new ts();
        if (ae1Var.j.c() <= 0) {
            ae1Var.j = tsVar;
        } else {
            ((zd1) ae1Var.j.d()).getClass();
            throw null;
        }
    }

    @Override // defpackage.pe1
    public final boolean Q(boolean z) {
        return this.f.e.a.f(false);
    }

    @Override // defpackage.pe1
    public final void a() {
        ae1 ae1Var = this.f;
        if (ae1Var.d) {
            ae1Var.e.a();
        }
    }

    @Override // defpackage.pe1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pe1
    public final void d() {
        ae1 ae1Var = this.f;
        if (ae1Var.d) {
            ae1Var.e.d();
        }
    }

    @Override // defpackage.pe1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.pe1
    public final void j() {
        long j = this.d;
        ae1 ae1Var = this.f;
        ae1Var.getClass();
        if (ae1Var.o >= j) {
            ae1Var.e.j();
        }
    }

    @Override // defpackage.pe1
    public final Surface k() {
        zt0.b0(false);
        throw null;
    }

    @Override // defpackage.pe1
    public final void m() {
        ae1 ae1Var = this.f;
        ae1Var.getClass();
        uz2.c.getClass();
        ae1Var.l = null;
    }

    @Override // defpackage.pe1
    public final void o0(boolean z) {
        this.d = -9223372036854775807L;
        ae1 ae1Var = this.f;
        if (ae1Var.n == 1) {
            ae1Var.m++;
            ae1Var.e.o0(z);
            while (ae1Var.j.c() > 1) {
                ae1Var.j.d();
            }
            if (ae1Var.j.c() == 1) {
                ((zd1) ae1Var.j.d()).getClass();
                throw null;
            }
            ae1Var.o = -9223372036854775807L;
            d13 d13Var = ae1Var.k;
            d13Var.getClass();
            d13Var.d(new a9(24, ae1Var));
        }
    }

    @Override // defpackage.pe1
    public final void p0(float f) {
        ae1 ae1Var = this.f;
        ee1 ee1Var = ae1Var.i;
        ee1Var.getClass();
        zt0.D(f > 0.0f);
        ee1Var.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        ee1Var.a();
        ae1Var.e.p0(f);
    }

    @Override // defpackage.pe1
    public final void q0(be1 be1Var) {
        this.f.e.j = be1Var;
    }

    @Override // defpackage.pe1
    public final boolean r0(long j, rd1 rd1Var) {
        int i;
        zt0.b0(false);
        long j2 = j + this.c;
        ae1 ae1Var = this.f;
        ee1 ee1Var = ae1Var.i;
        long j3 = ee1Var.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * ee1Var.c) + ee1Var.b);
        if (j3 != -9223372036854775807L) {
            long j4 = ae1Var.h;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.e) < 2) {
                this.e = i + 1;
                rd1Var.a();
                return true;
            }
        }
        int i2 = ae1Var.p;
        if (i2 == -1 || i2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.pe1
    public final void s0(long j, long j2) throws oe1 {
        this.f.e.s0(j + this.c, j2);
    }

    @Override // defpackage.pe1
    public final void t0(int i) {
        this.f.e.t0(i);
    }

    @Override // defpackage.pe1
    public final void u0(ph4 ph4Var, long j, int i, List list) {
        zt0.b0(false);
        this.a = xm3.m(list);
        this.b = ph4Var;
        this.f.getClass();
        gg4 gg4Var = new gg4(ph4Var);
        n74 n74Var = ph4Var.C;
        if (n74Var == null || !n74Var.d()) {
            n74Var = n74.h;
        }
        gg4Var.B = n74Var;
        gg4Var.b();
        throw null;
    }

    @Override // defpackage.pe1
    public final void v0(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = xm3.m(list);
        ph4 ph4Var = this.b;
        if (ph4Var == null) {
            return;
        }
        gg4 gg4Var = new gg4(ph4Var);
        n74 n74Var = ph4Var.C;
        if (n74Var == null || !n74Var.d()) {
            n74Var = n74.h;
        }
        gg4Var.B = n74Var;
        gg4Var.b();
        throw null;
    }

    @Override // defpackage.pe1
    public final void x0(boolean z) {
        ae1 ae1Var = this.f;
        if (ae1Var.d) {
            ae1Var.e.x0(z);
        }
    }

    @Override // defpackage.pe1
    public final void y0(long j) {
        this.c = j;
    }

    @Override // defpackage.pe1
    public final void z0(Surface surface, uz2 uz2Var) {
        ae1 ae1Var = this.f;
        Pair pair = ae1Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((uz2) ae1Var.l.second).equals(uz2Var)) {
            return;
        }
        ae1Var.l = Pair.create(surface, uz2Var);
        uz2Var.getClass();
    }

    @Override // defpackage.pe1
    public final void c() {
    }

    @Override // defpackage.pe1
    public final void w0(qd1 qd1Var) {
    }
}
