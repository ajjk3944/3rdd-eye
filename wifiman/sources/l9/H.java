package L9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f11313a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final int f11314b = 0;

    private H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(H h10, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h10.c(qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(H h10, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h10.e(qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public final void c(final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(110994378);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                qVar = C3197c.f11392a.a();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(110994378, i12, -1, "com.ui.core.ui.component.toolbar.UiToolbarNavigationContainer.IconButton (UiToolbarSideContainer.kt:31)");
            }
            L.b(null, qVar, interfaceC3540lR, (i12 << 3) & 112, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.G
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return H.d(this.f11309a, qVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void e(final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1194388098);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                qVar = C3197c.f11392a.b();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1194388098, i12, -1, "com.ui.core.ui.component.toolbar.UiToolbarNavigationContainer.TextButton (UiToolbarSideContainer.kt:41)");
            }
            L.b(null, qVar, interfaceC3540lR, (i12 << 3) & 112, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.F
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return H.f(this.f11305a, qVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
