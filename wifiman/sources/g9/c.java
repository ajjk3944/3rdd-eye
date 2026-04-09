package G9;

import N.Z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.z1;
import Yg.J;
import androidx.compose.foundation.layout.r;
import j0.AbstractC6230a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import r.AbstractC7521c;
import r.AbstractC7535j;
import z.Y;

/* loaded from: classes3.dex */
public abstract class c {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y f7215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f7216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f7217c;

        a(Y y10, InterfaceC6824a interfaceC6824a, z1 z1Var) {
            this.f7215a = y10;
            this.f7216b = interfaceC6824a;
            this.f7217c = z1Var;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-416868944, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetClearTextAction.<anonymous> (UiSettingsWidgetClearTextAction.kt:38)");
            }
            Z.a(this.f7216b, this.f7215a.c(AbstractC6230a.a(r.v(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, Y0.h.j(16), 0.0f, 0.0f, 0.0f, 14, null), Y0.h.j(20)), c.c(this.f7217c)), f0.c.f46573a.i()), false, null, G9.a.f7208a.a(), interfaceC3540l, 24576, 12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final Y y10, final boolean z10, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(y10, "<this>");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1763955320);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(y10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1763955320, i12, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetClearTextAction (UiSettingsWidgetClearTextAction.kt:27)");
            }
            AbstractC7385d.e(y10, z10, null, androidx.compose.animation.g.i(null, null, false, null, 11, null), androidx.compose.animation.g.u(null, null, false, null, 11, null), null, b0.c.e(-416868944, true, new a(y10, onClick, AbstractC7521c.d(z10 ? 1.0f : 0.0f, AbstractC7535j.j(0.0f, 400.0f, null, 5, null), 0.0f, "clear_text_icon_alpha", null, interfaceC3540lR, 3120, 20)), interfaceC3540lR, 54), interfaceC3540lR, (i12 & 14) | 1600512 | (i12 & 112), 18);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: G9.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return c.d(y10, z10, onClick, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(Y y10, boolean z10, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(y10, z10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
