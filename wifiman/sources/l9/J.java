package L9;

import N.AbstractC3346t0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;

/* loaded from: classes3.dex */
public abstract class J {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f11319a;

        a(androidx.compose.ui.e eVar) {
            this.f11319a = eVar;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1337422501, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarProgressIndicator.<anonymous> (UiToolbarProgressIndicator.kt:23)");
            }
            AbstractC3346t0.b(androidx.compose.foundation.layout.r.v(this.f11319a, Y0.h.j(15)), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().j(), Y0.h.j(2), 0L, 0, interfaceC3540l, 384, 24);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e eVar, final boolean z10, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1969445171);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1969445171, i12, -1, "com.ui.core.ui.component.toolbar.UiToolbarProgressIndicator (UiToolbarProgressIndicator.kt:17)");
            }
            AbstractC7385d.f(z10, null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-1337422501, true, new a(eVar), interfaceC3540lR, 54), interfaceC3540lR, ((i12 >> 3) & 14) | 200064, 18);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.I
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.c(eVar, z10, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
