package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.C6733v0;
import m0.i1;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f13672a = new F();

    /* renamed from: b, reason: collision with root package name */
    private static final r.r0 f13673b = new r.r0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0, null, 6, null);

    /* renamed from: c, reason: collision with root package name */
    private static final float f13674c = Y0.h.j(16);

    private F() {
    }

    public final long a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-788676020, i10, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:758)");
        }
        long jN = C3319f0.f14419a.a(interfaceC3540l, 6).n();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jN;
    }

    public final float b() {
        return f13674c;
    }

    public final long c(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:777)");
        }
        long jK = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jK;
    }

    public final i1 d(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2041803618, i10, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:770)");
        }
        E.a aVarA = C3319f0.f14419a.b(interfaceC3540l, 6).a();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return aVarA;
    }
}
