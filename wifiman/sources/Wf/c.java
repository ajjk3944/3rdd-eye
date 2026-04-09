package wf;

import C0.B;
import C0.D;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.q;
import oh.AbstractC7137b;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class c {
    public static final e c(e eVar, final float f10) {
        AbstractC6492s.i(eVar, "<this>");
        return g.a(eVar, new q() { // from class: wf.a
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                return c.d(f10, (m) obj, (B) obj2, (Y0.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D d(float f10, m layout, B measurable, Y0.b bVar) {
        AbstractC6492s.i(layout, "$this$layout");
        AbstractC6492s.i(measurable, "measurable");
        int iG = AbstractC7978m.g(measurable.S(Y0.b.k(bVar.r())), AbstractC7137b.e(Y0.b.l(bVar.r()) * f10));
        final t tVarT = measurable.T(Y0.c.a(Y0.b.n(bVar.r()), iG, Y0.b.m(bVar.r()), Y0.b.k(bVar.r())));
        return m.x0(layout, iG, tVarT.C0(), null, new InterfaceC6835l() { // from class: wf.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return c.e(tVarT, (t.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(t tVar, t.a layout) {
        AbstractC6492s.i(layout, "$this$layout");
        t.a.l(layout, tVar, 0, 0, 0.0f, 4, null);
        return J.f24997a;
    }
}
