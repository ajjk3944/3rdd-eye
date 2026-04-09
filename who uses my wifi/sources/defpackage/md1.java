package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class md1 implements pe1 {
    public final de1 a;
    public final ee1 b;
    public final ie1 c;
    public final ArrayDeque d;
    public Surface e;
    public ph4 f;
    public long g;
    public ne1 h;
    public Executor i;
    public be1 j;

    public md1(de1 de1Var, ee1 ee1Var, pz pzVar) {
        this.a = de1Var;
        this.b = ee1Var;
        de1Var.k = pzVar;
        this.c = new ie1(new vq2(this), de1Var, ee1Var);
        this.d = new ArrayDeque();
        this.f = new ph4(new gg4());
        this.g = -9223372036854775807L;
        this.h = ne1.a;
        this.i = t5.g;
        this.j = wa4.g;
    }

    @Override // defpackage.pe1
    public final boolean A0(ph4 ph4Var) {
        return true;
    }

    @Override // defpackage.pe1
    public final void N() {
        de1 de1Var = this.a;
        if (de1Var.d == 0) {
            de1Var.d = 1;
        }
    }

    @Override // defpackage.pe1
    public final boolean Q(boolean z) {
        return this.a.f(z);
    }

    @Override // defpackage.pe1
    public final void a() {
        this.b.a();
        this.a.b();
    }

    @Override // defpackage.pe1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pe1
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pe1
    public final void d() {
        this.b.a();
        this.a.c();
    }

    @Override // defpackage.pe1
    public final boolean g() {
        ie1 ie1Var = this.c;
        long j = ie1Var.i;
        return j != -9223372036854775807L && ie1Var.h == j;
    }

    @Override // defpackage.pe1
    public final void j() {
        ie1 ie1Var = this.c;
        long j = ie1Var.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            ie1Var.g = Long.MIN_VALUE;
            ie1Var.h = Long.MIN_VALUE;
        }
        ie1Var.i = j;
    }

    @Override // defpackage.pe1
    public final Surface k() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.pe1
    public final void m() {
        this.e = null;
        this.a.d(null);
    }

    @Override // defpackage.pe1
    public final void o0(boolean z) {
        if (z) {
            de1 de1Var = this.a;
            he1 he1Var = de1Var.b;
            he1Var.m = 0L;
            he1Var.p = -1L;
            he1Var.n = -1L;
            de1Var.g = -9223372036854775807L;
            de1Var.e = -9223372036854775807L;
            de1Var.d = Math.min(de1Var.d, 1);
            de1Var.h = -9223372036854775807L;
        }
        this.b.a();
        ie1 ie1Var = this.c;
        cm cmVar = ie1Var.e;
        cmVar.f = 0;
        cmVar.g = -1;
        cmVar.h = 0;
        ie1Var.g = -9223372036854775807L;
        ie1Var.h = -9223372036854775807L;
        ie1Var.i = -9223372036854775807L;
        ts tsVar = ie1Var.d;
        if (tsVar.c() > 0) {
            zt0.D(tsVar.c() > 0);
            while (tsVar.c() > 1) {
                tsVar.d();
            }
            Object objD = tsVar.d();
            objD.getClass();
            ie1Var.k = ((Long) objD).longValue();
        }
        ts tsVar2 = ie1Var.c;
        if (tsVar2.c() > 0) {
            zt0.D(tsVar2.c() > 0);
            while (tsVar2.c() > 1) {
                tsVar2.d();
            }
            Object objD2 = tsVar2.d();
            objD2.getClass();
            tsVar2.b(0L, (t82) objD2);
        }
        this.d.clear();
    }

    @Override // defpackage.pe1
    public final void p0(float f) {
        this.a.h(f);
    }

    @Override // defpackage.pe1
    public final void q0(be1 be1Var) {
        this.j = be1Var;
    }

    @Override // defpackage.pe1
    public final boolean r0(long j, rd1 rd1Var) {
        this.d.add(rd1Var);
        ie1 ie1Var = this.c;
        cm cmVar = ie1Var.e;
        int i = cmVar.h;
        long[] jArr = (long[]) cmVar.j;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i2];
            int i3 = cmVar.f;
            int i4 = length - i3;
            System.arraycopy(jArr, i3, jArr2, 0, i4);
            System.arraycopy((long[]) cmVar.j, 0, jArr2, i4, i3);
            cmVar.f = 0;
            cmVar.g = cmVar.h - 1;
            cmVar.j = jArr2;
            cmVar.i = i2 - 1;
            jArr = jArr2;
        }
        int i5 = (cmVar.g + 1) & cmVar.i;
        cmVar.g = i5;
        jArr[i5] = j;
        cmVar.h++;
        ie1Var.g = j;
        ie1Var.i = -9223372036854775807L;
        this.i.execute(new bh3(17, this));
        return true;
    }

    @Override // defpackage.pe1
    public final void s0(long j, long j2) throws oe1 {
        try {
            this.c.a(j, j2);
        } catch (b84 e) {
            throw new oe1(e, this.f);
        }
    }

    @Override // defpackage.pe1
    public final void t0(int i) {
        he1 he1Var = this.a.b;
        if (he1Var.j == i) {
            return;
        }
        he1Var.j = i;
        he1Var.c(true);
    }

    @Override // defpackage.pe1
    public final void u0(ph4 ph4Var, long j, int i, List list) {
        zt0.b0(list.isEmpty());
        int i2 = ph4Var.t;
        int i3 = ph4Var.u;
        ph4 ph4Var2 = this.f;
        int i4 = ph4Var2.t;
        ie1 ie1Var = this.c;
        if (i2 != i4 || i3 != ph4Var2.u) {
            long j2 = ie1Var.g;
            ie1Var.c.b(j2 == -9223372036854775807L ? 0L : j2 + 1, new t82(1.0f, i2, i3));
        }
        float f = ph4Var.x;
        if (f != this.f.x) {
            this.a.e(f);
        }
        this.f = ph4Var;
        if (j != this.g) {
            if (ie1Var.e.h == 0) {
                ie1Var.a.a(i);
                ie1Var.k = j;
            } else {
                ts tsVar = ie1Var.d;
                long j3 = ie1Var.g;
                tsVar.b(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.pe1
    public final void v0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pe1
    public final void w0(qd1 qd1Var) {
        this.h = qd1Var;
        this.i = dq3.f;
    }

    @Override // defpackage.pe1
    public final void x0(boolean z) {
        de1 de1Var = this.a;
        de1Var.i = z;
        de1Var.h = -9223372036854775807L;
    }

    @Override // defpackage.pe1
    public final void y0(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pe1
    public final void z0(Surface surface, uz2 uz2Var) {
        this.e = surface;
        this.a.d(surface);
    }

    @Override // defpackage.pe1
    public final void K() {
    }
}
