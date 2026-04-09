package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f9154a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f9155b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f9156c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9157d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f9158e;

    /* renamed from: f, reason: collision with root package name */
    public mx1 f9159f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public h1 f9160h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f9161i;
    public r0 j;

    public a0(t0 t0Var, u0 u0Var, w5 w5Var) {
        this.f9154a = t0Var;
        this.f9155b = u0Var;
        t0Var.f16618k = w5Var;
        this.f9156c = new b1(new rt(this), t0Var, u0Var);
        this.f9157d = new ArrayDeque();
        this.f9159f = new mx1(new lw1());
        this.g = -9223372036854775807L;
        this.f9160h = h1.G8;
        this.f9161i = y.f18596a;
        this.j = x.f18252b;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean A1() {
        b1 b1Var = this.f9156c;
        long j = b1Var.f9540i;
        return j != -9223372036854775807L && b1Var.f9539h == j;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void C1() {
        b1 b1Var = this.f9156c;
        long j = b1Var.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            b1Var.g = Long.MIN_VALUE;
            b1Var.f9539h = Long.MIN_VALUE;
        }
        b1Var.f9540i = j;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final Surface D1() {
        Surface surface = this.f9158e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void E1() {
        this.f9158e = null;
        this.f9154a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void N1() {
        t0 t0Var = this.f9154a;
        if (t0Var.f16613d == 0) {
            t0Var.f16613d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean Q1(boolean z3) {
        return this.f9154a.e(z3);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void S1(boolean z3) {
        if (z3) {
            t0 t0Var = this.f9154a;
            t0Var.f16611b.a();
            t0Var.g = -9223372036854775807L;
            t0Var.f16614e = -9223372036854775807L;
            t0Var.f16613d = Math.min(t0Var.f16613d, 1);
            t0Var.f16616h = -9223372036854775807L;
        }
        this.f9155b.a();
        b1 b1Var = this.f9156c;
        l5 l5Var = b1Var.f9537e;
        l5Var.f13372a = 0;
        l5Var.f13373b = -1;
        l5Var.f13374c = 0;
        b1Var.g = -9223372036854775807L;
        b1Var.f9539h = -9223372036854775807L;
        b1Var.f9540i = -9223372036854775807L;
        k5 k5Var = b1Var.f9536d;
        if (k5Var.d() > 0) {
            mq0.m(k5Var.d() > 0);
            while (k5Var.d() > 1) {
                k5Var.e();
            }
            Object objE = k5Var.e();
            objE.getClass();
            b1Var.f9541k = ((Long) objE).longValue();
        }
        k5 k5Var2 = b1Var.f9535c;
        if (k5Var2.d() > 0) {
            mq0.m(k5Var2.d() > 0);
            while (k5Var2.d() > 1) {
                k5Var2.e();
            }
            Object objE2 = k5Var2.e();
            objE2.getClass();
            k5Var2.b((vr) objE2, 0L);
        }
        this.f9157d.clear();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void T1(float f10) {
        this.f9154a.g(f10);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean U1(long j, e0 e0Var) {
        this.f9157d.add(e0Var);
        b1 b1Var = this.f9156c;
        l5 l5Var = b1Var.f9537e;
        int i4 = l5Var.f13374c;
        long[] jArr = (long[]) l5Var.f13376e;
        int length = jArr.length;
        if (i4 == length) {
            int i10 = length + length;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i10];
            int i11 = l5Var.f13372a;
            int i12 = length - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy((long[]) l5Var.f13376e, 0, jArr2, i12, i11);
            l5Var.f13372a = 0;
            l5Var.f13373b = l5Var.f13374c - 1;
            l5Var.f13376e = jArr2;
            l5Var.f13375d = i10 - 1;
            jArr = jArr2;
        }
        int i13 = (l5Var.f13373b + 1) & l5Var.f13375d;
        l5Var.f13373b = i13;
        jArr[i13] = j;
        l5Var.f13374c++;
        b1Var.g = j;
        b1Var.f9540i = -9223372036854775807L;
        this.f9161i.execute(new s(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void V1(r0 r0Var) {
        this.j = r0Var;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void W1(mx0 mx0Var) {
        this.f9160h = mx0Var;
        this.f9161i = k81.f13081a;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void X1(long j, long j8) {
        try {
            this.f9156c.a(j, j8);
        } catch (us1 e2) {
            throw new i1(e2, this.f9159f);
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void Y1(Surface surface, yk0 yk0Var) {
        this.f9158e = surface;
        this.f9154a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void Z1(int i4) {
        a1 a1Var = this.f9154a.f16611b;
        if (a1Var.j == i4) {
            return;
        }
        a1Var.j = i4;
        a1Var.c(true);
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void a() {
        this.f9155b.a();
        t0 t0Var = this.f9154a;
        t0Var.f16612c = false;
        t0Var.f16616h = -9223372036854775807L;
        a1 a1Var = t0Var.f16611b;
        a1Var.f9168d = false;
        w0 w0Var = a1Var.f9167c;
        if (w0Var != null) {
            w0Var.b();
        }
        a1Var.d();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void a2(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void b() {
        this.f9155b.a();
        this.f9154a.b();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void b2(boolean z3) {
        t0 t0Var = this.f9154a;
        t0Var.f16617i = z3;
        t0Var.f16616h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void c2(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void d2(mx1 mx1Var, long j, int i4, List list) {
        mq0.c0(list.isEmpty());
        int i10 = mx1Var.f14059t;
        int i11 = mx1Var.f14060u;
        mx1 mx1Var2 = this.f9159f;
        int i12 = mx1Var2.f14059t;
        b1 b1Var = this.f9156c;
        if (i10 != i12 || i11 != mx1Var2.f14060u) {
            long j8 = b1Var.g;
            b1Var.f9535c.b(new vr(i10, i11, 1.0f), j8 == -9223372036854775807L ? 0L : j8 + 1);
        }
        float f10 = mx1Var.f14063x;
        if (f10 != this.f9159f.f14063x) {
            this.f9154a.d(f10);
        }
        this.f9159f = mx1Var;
        if (j != this.g) {
            if (b1Var.f9537e.f13374c == 0) {
                b1Var.f9533a.a(i4);
                b1Var.f9541k = j;
            } else {
                k5 k5Var = b1Var.f9536d;
                long j9 = b1Var.g;
                k5Var.b(Long.valueOf(j), j9 == -9223372036854775807L ? -4611686018427387904L : j9 + 1);
            }
            this.g = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final boolean e2(mx1 mx1Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.j1
    public final void O1() {
    }
}
