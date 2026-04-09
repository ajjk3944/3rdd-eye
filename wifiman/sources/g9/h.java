package G9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.b;
import ta.AbstractC8049c;
import z.Y;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final s9.b f7229a = N9.b.f16117a.z().f(new b.C2145b("UiSettingsWidgetInfoDefaultIcon", a.f7230a));

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7230a = new a();

        a() {
        }

        public final long a(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1931743031);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1931743031, i10, -1, "com.ui.core.ui.component.settings.widget.DefaultIcon.<anonymous> (UiSettingsWidgetInfo.kt:14)");
            }
            long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jF;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f7231a;

        b(InterfaceC6824a interfaceC6824a) {
            this.f7231a = interfaceC6824a;
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-120782347, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetInfo.<anonymous> (UiSettingsWidgetInfo.kt:19)");
            }
            h.e(h.f7229a, this.f7231a, interfaceC3540l, 6, 0);
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

    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.b f7232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f7233b;

        c(s9.b bVar, InterfaceC6824a interfaceC6824a) {
            this.f7232a = bVar;
            this.f7233b = interfaceC6824a;
        }

        public final void a(Y y10, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(y10, "<this>");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-371514139, i10, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetInfo.<anonymous> (UiSettingsWidgetInfo.kt:26)");
            }
            s9.b bVar = this.f7232a;
            if (bVar == null) {
                bVar = h.f7229a;
            }
            h.e(bVar, this.f7233b, interfaceC3540l, 0, 0);
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

    public static final q c(InterfaceC6824a onClick) {
        AbstractC6492s.i(onClick, "onClick");
        return b0.c.c(-120782347, true, new b(onClick));
    }

    public static final q d(s9.b bVar, InterfaceC6824a onClick) {
        AbstractC6492s.i(onClick, "onClick");
        return b0.c.c(-371514139, true, new c(bVar, onClick));
    }

    public static final void e(final s9.b bVar, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(191059163);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(onClick) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                bVar = f7229a;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(191059163, i14, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetInfoIcon (UiSettingsWidgetInfo.kt:33)");
            }
            androidx.compose.ui.e eVarV = r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24));
            interfaceC3540lR.U(-170085069);
            boolean z10 = (i14 & 112) == 32;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: G9.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return h.f(onClick);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC8049c.c(bVar, M9.i.f(eVarV, null, 0.0f, false, (InterfaceC6824a) objF, interfaceC3540lR, 6, 7), null, null, interfaceC3540lR, i14 & 14, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: G9.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.g(bVar, onClick, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(InterfaceC6824a interfaceC6824a) {
        interfaceC6824a.invoke();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(s9.b bVar, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(bVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
