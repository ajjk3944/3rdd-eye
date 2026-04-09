package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class B implements InterfaceC1185g0 {

    /* renamed from: a, reason: collision with root package name */
    public final T f7085a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7086b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f7087c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7088d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f7089e;

    /* renamed from: f, reason: collision with root package name */
    public TP f7090f;

    /* renamed from: g, reason: collision with root package name */
    public long f7091g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1075e0 f7092h;
    public Executor i;

    /* renamed from: j, reason: collision with root package name */
    public Q f7093j;

    public B(T t6, U u6, C1994v2 c1994v2) {
        this.f7085a = t6;
        this.f7086b = u6;
        t6.f11317k = c1994v2;
        this.f7087c = new Z(new C0889ae(this), t6, u6);
        this.f7088d = new ArrayDeque();
        this.f7090f = new TP(new C1855sP());
        this.f7091g = -9223372036854775807L;
        this.f7092h = InterfaceC1075e0.f13843z;
        this.i = ExecutorC2207z.f17806a;
        this.f7093j = C2153y.f17660b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void A0(boolean z6) {
        T t6 = this.f7085a;
        t6.i = z6;
        t6.f11315h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void B0(long j6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void C0(TP tp, long j6, int i, List list) {
        AbstractC0582Jp.h0(list.isEmpty());
        int i3 = tp.f11404t;
        int i6 = tp.f11405u;
        TP tp2 = this.f7090f;
        int i7 = tp2.f11404t;
        Z z6 = this.f7087c;
        if (i3 != i7 || i6 != tp2.f11405u) {
            long j7 = z6.f12752g;
            z6.f12748c.c(j7 == -9223372036854775807L ? 0L : j7 + 1, new C1161fd(i3, i6, 1.0f));
        }
        float f2 = tp.f11408x;
        if (f2 != this.f7090f.f11408x) {
            this.f7085a.d(f2);
        }
        this.f7090f = tp;
        if (j6 != this.f7091g) {
            if (z6.f12750e.f15055c == 0) {
                z6.f12746a.a(i);
                z6.f12755k = j6;
            } else {
                M3.o oVar = z6.f12749d;
                long j8 = z6.f12752g;
                oVar.c(j8 == -9223372036854775807L ? -4611686018427387904L : j8 + 1, Long.valueOf(j6));
            }
            this.f7091g = j6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean D0(TP tp) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void N() {
        T t6 = this.f7085a;
        if (t6.f11311d == 0) {
            t6.f11311d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void a() {
        this.f7086b.a();
        this.f7085a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void c() {
        this.f7086b.a();
        T t6 = this.f7085a;
        t6.f11310c = false;
        t6.f11315h = -9223372036854775807L;
        Y y3 = t6.f11309b;
        y3.f12543d = false;
        V v6 = y3.f12542c;
        if (v6 != null) {
            v6.b();
        }
        y3.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean d0(boolean z6) {
        return this.f7085a.e(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean h() {
        Z z6 = this.f7087c;
        long j6 = z6.i;
        return j6 != -9223372036854775807L && z6.f12753h == j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void j() {
        Z z6 = this.f7087c;
        long j6 = z6.f12752g;
        if (j6 == -9223372036854775807L) {
            j6 = Long.MIN_VALUE;
            z6.f12752g = Long.MIN_VALUE;
            z6.f12753h = Long.MIN_VALUE;
        }
        z6.i = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final Surface k() {
        Surface surface = this.f7089e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void l() {
        this.f7089e = null;
        this.f7085a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void r0(boolean z6) {
        if (z6) {
            T t6 = this.f7085a;
            t6.f11309b.a();
            t6.f11314g = -9223372036854775807L;
            t6.f11312e = -9223372036854775807L;
            t6.f11311d = Math.min(t6.f11311d, 1);
            t6.f11315h = -9223372036854775807L;
        }
        this.f7086b.a();
        Z z7 = this.f7087c;
        C1401k2 c1401k2 = z7.f12750e;
        c1401k2.f15053a = 0;
        c1401k2.f15054b = -1;
        c1401k2.f15055c = 0;
        z7.f12752g = -9223372036854775807L;
        z7.f12753h = -9223372036854775807L;
        z7.i = -9223372036854775807L;
        M3.o oVar = z7.f12749d;
        if (oVar.e() > 0) {
            AbstractC0582Jp.m(oVar.e() > 0);
            while (oVar.e() > 1) {
                oVar.f();
            }
            Object objF = oVar.f();
            objF.getClass();
            z7.f12755k = ((Long) objF).longValue();
        }
        M3.o oVar2 = z7.f12748c;
        if (oVar2.e() > 0) {
            AbstractC0582Jp.m(oVar2.e() > 0);
            while (oVar2.e() > 1) {
                oVar2.f();
            }
            Object objF2 = oVar2.f();
            objF2.getClass();
            oVar2.c(0L, (C1161fd) objF2);
        }
        this.f7088d.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void s0(float f2) {
        this.f7085a.g(f2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final boolean t0(long j6, F f2) {
        this.f7088d.add(f2);
        Z z6 = this.f7087c;
        C1401k2 c1401k2 = z6.f12750e;
        int i = c1401k2.f15055c;
        long[] jArr = (long[]) c1401k2.f15057e;
        int length = jArr.length;
        if (i == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i3];
            int i6 = c1401k2.f15053a;
            int i7 = length - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy((long[]) c1401k2.f15057e, 0, jArr2, i7, i6);
            c1401k2.f15053a = 0;
            c1401k2.f15054b = c1401k2.f15055c - 1;
            c1401k2.f15057e = jArr2;
            c1401k2.f15056d = i3 - 1;
            jArr = jArr2;
        }
        int i8 = (c1401k2.f15054b + 1) & c1401k2.f15056d;
        c1401k2.f15054b = i8;
        jArr[i8] = j6;
        c1401k2.f15055c++;
        z6.f12752g = j6;
        z6.i = -9223372036854775807L;
        this.i.execute(new RunnableC1883t(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void u0(Q q3) {
        this.f7093j = q3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void v0(long j6, long j7) {
        try {
            this.f7087c.a(j6, j7);
        } catch (HN e6) {
            throw new C1130f0(e6, this.f7090f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void w0(Surface surface, Ar ar) {
        this.f7089e = surface;
        this.f7085a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void x0(int i) {
        Y y3 = this.f7085a.f11309b;
        if (y3.f12548j == i) {
            return;
        }
        y3.f12548j = i;
        y3.c(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void y0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1185g0
    public final void z0(L6 l6) {
        this.f7092h = l6;
        this.i = EnumC2059wD.f17407a;
    }
}
