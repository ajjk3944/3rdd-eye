package qa;

import C0.B;
import C0.D;
import C0.U;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Y0.h;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.w;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.r;

/* loaded from: classes3.dex */
public abstract class d {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f58602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f58603b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f58604c;

        a(r rVar, float f10, float f11) {
            this.f58602a = rVar;
            this.f58603b = f10;
            this.f58604c = f11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-834067128, i10, -1, "com.ui.core.ui.theme.util.WithMeasuredView.<anonymous>.<anonymous>.<anonymous> (TextMeasurement.kt:25)");
            }
            this.f58602a.y(h.d(this.f58603b), h.d(this.f58604c), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f58605a;

        b(InterfaceC6839p interfaceC6839p) {
            this.f58605a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1769520685, i10, -1, "com.ui.core.ui.theme.util.WithMeasuredView.<anonymous>.<anonymous>.<anonymous> (TextMeasurement.kt:18)");
            }
            this.f58605a.invoke(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void d(final e modifier, final InterfaceC6839p measured, final r content, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(measured, "measured");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(893277318);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(measured) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(content) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(893277318, i11, -1, "com.ui.core.ui.theme.util.WithMeasuredView (TextMeasurement.kt:13)");
            }
            interfaceC3540lR.U(-560224689);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: qa.a
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return d.e(measured, content, (U) obj, (Y0.b) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            w.a(modifier, (InterfaceC6839p) objF, interfaceC3540lR, i11 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: qa.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.g(modifier, measured, content, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D e(InterfaceC6839p interfaceC6839p, r rVar, U SubcomposeLayout, Y0.b bVar) {
        AbstractC6492s.i(SubcomposeLayout, "$this$SubcomposeLayout");
        t tVarT = ((B) SubcomposeLayout.Q1("sampleText", b0.c.c(-1769520685, true, new b(interfaceC6839p))).get(0)).T(Y0.c.b(0, 0, 0, 0, 15, null));
        final t tVarT2 = ((B) SubcomposeLayout.Q1("content", b0.c.c(-834067128, true, new a(rVar, SubcomposeLayout.x(tVarT.I0()), SubcomposeLayout.x(tVarT.C0())))).get(0)).T(bVar.r());
        return m.x0(SubcomposeLayout, tVarT2.I0(), tVarT2.C0(), null, new InterfaceC6835l() { // from class: qa.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.f(tVarT2, (t.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(t tVar, t.a layout) {
        AbstractC6492s.i(layout, "$this$layout");
        t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(e eVar, InterfaceC6839p interfaceC6839p, r rVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, interfaceC6839p, rVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
