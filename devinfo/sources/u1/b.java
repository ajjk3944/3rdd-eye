package u1;

import d3.l;
import i2.g0;
import l7.d;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d f35031a;

    /* renamed from: b, reason: collision with root package name */
    public float f35032b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public l f35033c = l.f21966a;

    public abstract void a(float f10);

    public final void b(g0 g0Var, long j, float f10) {
        r1.b bVar = g0Var.f25668a;
        if (this.f35032b != f10) {
            a(f10);
            this.f35032b = f10;
        }
        l layoutDirection = g0Var.getLayoutDirection();
        if (this.f35033c != layoutDirection) {
            this.f35033c = layoutDirection;
        }
        int i4 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g0Var.c() >> 32)) - Float.intBitsToFloat(i4);
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g0Var.c() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((d0) bVar.f32718b.f25416b).p(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i4) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    d(g0Var);
                }
            } finally {
                ((d0) bVar.f32718b.f25416b).p(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long c();

    public abstract void d(g0 g0Var);
}
