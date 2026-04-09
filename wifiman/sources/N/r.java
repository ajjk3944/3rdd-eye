package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.AbstractC6737x0;
import m0.C6733v0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f14715a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final int f14716b = 0;

    private r() {
    }

    private final float a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long jU = ((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u();
        if (!C3319f0.f14419a.a(interfaceC3540l, 6).o() ? AbstractC6737x0.i(jU) >= 0.5d : AbstractC6737x0.i(jU) <= 0.5d) {
            f10 = f11;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return f10;
    }

    public final float b(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float fA = a(0.38f, 0.38f, interfaceC3540l, ((i10 << 6) & 896) | 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return fA;
    }

    public final float c(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float fA = a(1.0f, 0.87f, interfaceC3540l, ((i10 << 6) & 896) | 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return fA;
    }

    public final float d(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float fA = a(0.74f, 0.6f, interfaceC3540l, ((i10 << 6) & 896) | 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return fA;
    }
}
