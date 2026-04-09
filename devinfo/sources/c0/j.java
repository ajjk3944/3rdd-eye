package c0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.measurement.z3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final d3.c f2439a;

    /* renamed from: b, reason: collision with root package name */
    public long f2440b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f2441c;

    /* renamed from: d, reason: collision with root package name */
    public final u0.d1 f2442d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2443e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2444f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f2445h;

    /* renamed from: i, reason: collision with root package name */
    public final i2.j f2446i;

    public j(Context context, d3.c cVar, long j, g0.a0 a0Var) {
        this.f2439a = cVar;
        g0 g0Var = new g0(context, p1.z.u(j));
        this.f2441c = g0Var;
        this.f2442d = new u0.d1(yj.u.f37649a, u0.e.f34769d);
        this.f2443e = true;
        this.g = 0L;
        this.f2445h = -1L;
        i iVar = new i(this);
        c2.j jVar = c2.g0.f2612a;
        c2.m0 m0Var = new c2.m0(null, null, iVar);
        this.f2446i = Build.VERSION.SDK_INT >= 31 ? new g1(m0Var, this, g0Var) : new m0(m0Var, this, g0Var, a0Var);
    }

    public final void a() {
        boolean z3;
        g0 g0Var = this.f2441c;
        EdgeEffect edgeEffect = g0Var.f2423d;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = !edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = g0Var.f2424e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = !edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = g0Var.f2425f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = !edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = g0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z3) {
                z10 = false;
            }
            z3 = z10;
        }
        if (z3) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r19, d0.y1 r21, ek.c r22) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.j.b(long, d0.y1, ek.c):java.lang.Object");
    }

    public final long c() {
        long j = this.f2440b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = z3.j(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f2443e) {
            this.f2442d.setValue(yj.u.f37649a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i4 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.f2441c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fC = m.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i10 >= 31 ? m.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i4);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i4 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.f2441c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = m.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i10 >= 31 ? m.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i4);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i4 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.f2441c.d();
        float fC = -fIntBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fC = m.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i10 >= 31 ? m.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i4);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i4 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.f2441c.e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = m.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i10 >= 31 ? m.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i4);
    }

    public final void i(long j) {
        boolean zA = o1.e.a(this.g, 0L);
        boolean zA2 = o1.e.a(j, this.g);
        this.g = j;
        if (!zA2) {
            long jS = (pk.a.s(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (pk.a.s(Float.intBitsToFloat((int) (j >> 32))) << 32);
            g0 g0Var = this.f2441c;
            g0Var.f2422c = jS;
            EdgeEffect edgeEffect = g0Var.f2423d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jS >> 32), (int) (jS & 4294967295L));
            }
            EdgeEffect edgeEffect2 = g0Var.f2424e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jS >> 32), (int) (jS & 4294967295L));
            }
            EdgeEffect edgeEffect3 = g0Var.f2425f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jS & 4294967295L), (int) (jS >> 32));
            }
            EdgeEffect edgeEffect4 = g0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jS & 4294967295L), (int) (jS >> 32));
            }
            EdgeEffect edgeEffect5 = g0Var.f2426h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jS >> 32), (int) (jS & 4294967295L));
            }
            EdgeEffect edgeEffect6 = g0Var.f2427i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jS >> 32), (int) (jS & 4294967295L));
            }
            EdgeEffect edgeEffect7 = g0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jS & 4294967295L), (int) (jS >> 32));
            }
            EdgeEffect edgeEffect8 = g0Var.f2428k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jS), (int) (jS >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
