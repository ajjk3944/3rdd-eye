package G9;

import N.AbstractC3343s;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.foundation.layout.r;
import b0.InterfaceC4038a;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.q;
import s9.InterfaceC7929a;
import ta.AbstractC8049c;
import z.Y;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7929a f7234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f7236c;

        a(InterfaceC7929a interfaceC7929a, float f10, long j10) {
            this.f7234a = interfaceC7929a;
            this.f7235b = f10;
            this.f7236c = j10;
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(952995689, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetLeadingIcon.<anonymous> (UiSettingsWidgetLeadingIcon.kt:24)");
            }
            InterfaceC7929a interfaceC7929a = this.f7234a;
            if (interfaceC7929a instanceof s9.b) {
                interfaceC3540l.U(-2086567937);
                AbstractC8049c.c((s9.b) this.f7234a, r.v(androidx.compose.ui.e.f28771b0, this.f7235b), C6733v0.g(C6733v0.k(this.f7236c, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null)), null, interfaceC3540l, 0, 4);
                interfaceC3540l.J();
            } else if (interfaceC7929a instanceof s9.c) {
                interfaceC3540l.U(-2086562678);
                AbstractC8049c.e(this.f7234a, r.v(androidx.compose.ui.e.f28771b0, this.f7235b), null, null, null, null, null, ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), null, interfaceC3540l, 0, 190);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-258808987);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final q a(InterfaceC7929a icon, float f10, long j10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(icon, "icon");
        interfaceC3540l.U(239955124);
        if ((i11 & 2) != 0) {
            f10 = Y0.h.j(24);
        }
        if ((i11 & 4) != 0) {
            j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(239955124, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetLeadingIcon (UiSettingsWidgetLeadingIcon.kt:23)");
        }
        InterfaceC4038a interfaceC4038aE = b0.c.e(952995689, true, new a(icon, f10, j10), interfaceC3540l, 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return interfaceC4038aE;
    }
}
