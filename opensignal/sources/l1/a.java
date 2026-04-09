package l1;

import br.l;
import g1.m;
import i1.b;
import t2.i;
import x1.h0;
import yb.k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public k f14644a;

    /* renamed from: b, reason: collision with root package name */
    public m f14645b;

    /* renamed from: c, reason: collision with root package name */
    public float f14646c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public i f14647d = i.Ltr;

    public abstract void a(float f10);

    public abstract void b(m mVar);

    public final void c(h0 h0Var, long j, float f10, m mVar) {
        b bVar = h0Var.f24844b;
        if (this.f14646c != f10) {
            a(f10);
            this.f14646c = f10;
        }
        if (!l.a(this.f14645b, mVar)) {
            b(mVar);
            this.f14645b = mVar;
        }
        i layoutDirection = h0Var.getLayoutDirection();
        if (this.f14647d != layoutDirection) {
            this.f14647d = layoutDirection;
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.C() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.C() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((h7.h0) bVar.f11141c.f2826d).G(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    e(h0Var);
                }
            } finally {
                ((h7.h0) bVar.f11141c.f2826d).G(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(h0 h0Var);
}
