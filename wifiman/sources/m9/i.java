package M9;

import J0.m;
import J0.t;
import J0.u;
import J0.w;
import N.A0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.ui.focus.o;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import w0.AbstractC8249c;
import w0.AbstractC8250d;
import w0.C8247a;
import w0.C8248b;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import y0.AbstractC8569I;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13067a = Y0.h.j(24);

    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.e f13068a;

        a(k0.e eVar) {
            this.f13068a = eVar;
        }

        public final Boolean a(KeyEvent it) {
            AbstractC6492s.i(it, "it");
            if (!AbstractC8249c.e(AbstractC8250d.b(it), AbstractC8249c.f64330a.b())) {
                return Boolean.FALSE;
            }
            long jA = AbstractC8250d.a(it);
            C8247a.C2277a c2277a = C8247a.f64178b;
            androidx.compose.ui.focus.d dVarI = C8247a.p(jA, c2277a.c()) ? androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.e()) : C8247a.p(jA, c2277a.f()) ? androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.f()) : null;
            if (dVarI == null) {
                return Boolean.FALSE;
            }
            this.f13068a.k(dVarI.o());
            return Boolean.TRUE;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C8248b) obj).f());
        }
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, final k0.e focusManager, final o focusRequester) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(focusManager, "focusManager");
        AbstractC6492s.i(focusRequester, "focusRequester");
        return AbstractC8569I.a(eVar, new InterfaceC6835l() { // from class: M9.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.e(focusManager, focusRequester, (MotionEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(k0.e eVar, o oVar, MotionEvent it) {
        AbstractC6492s.i(it, "it");
        if (it.getAction() == 0) {
            k0.e.c(eVar, false, 1, null);
            oVar.f();
        }
        return J.f24997a;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e roundedClickable, InterfaceC8558m interfaceC8558m, float f10, boolean z10, InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC8558m interfaceC8558m2;
        AbstractC6492s.i(roundedClickable, "$this$roundedClickable");
        AbstractC6492s.i(onClick, "onClick");
        interfaceC3540l.U(720420786);
        if ((i11 & 1) != 0) {
            interfaceC3540l.U(1330361695);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540l.K(objF);
            }
            interfaceC8558m2 = (InterfaceC8558m) objF;
            interfaceC3540l.J();
        } else {
            interfaceC8558m2 = interfaceC8558m;
        }
        float f11 = (i11 & 2) != 0 ? f13067a : f10;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(720420786, i10, -1, "com.ui.core.ui.component.util.roundedClickable (Modifier.kt:34)");
        }
        androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(roundedClickable, interfaceC8558m2, A0.f(false, f11, 0L, 4, null), z11, null, null, onClick, 24, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return eVarB;
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, final String id2) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(id2, "id");
        return m.c(eVar, false, new InterfaceC6835l() { // from class: M9.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.i(id2, (w) obj);
            }
        }, 1, null);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, final String id2, final boolean z10) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(id2, "id");
        return m.c(eVar, false, new InterfaceC6835l() { // from class: M9.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.j(id2, z10, (w) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(String str, w semantics) {
        AbstractC6492s.i(semantics, "$this$semantics");
        t.n0(semantics, str);
        u.a(semantics, true);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(String str, boolean z10, w semantics) {
        AbstractC6492s.i(semantics, "$this$semantics");
        t.n0(semantics, str);
        u.a(semantics, true);
        t.j0(semantics, z10);
        return J.f24997a;
    }

    public static final androidx.compose.ui.e k(androidx.compose.ui.e eVar, k0.e focusManager) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(focusManager, "focusManager");
        return androidx.compose.ui.input.key.a.a(eVar, new a(focusManager));
    }
}
