package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.i1;
import mh.InterfaceC6839p;
import s.C7846g;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3322h {
    public static final void a(androidx.compose.ui.e eVar, i1 i1Var, long j10, long j11, C7846g c7846g, float f10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        androidx.compose.ui.e eVar2 = (i11 & 1) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        i1 i1VarB = (i11 & 2) != 0 ? C3319f0.f14419a.b(interfaceC3540l, 6).b() : i1Var;
        long jN = (i11 & 4) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).n() : j10;
        long jB = (i11 & 8) != 0 ? AbstractC3334n.b(jN, interfaceC3540l, (i10 >> 6) & 14) : j11;
        C7846g c7846g2 = (i11 & 16) != 0 ? null : c7846g;
        float fJ = (i11 & 32) != 0 ? Y0.h.j(1) : f10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1956755640, i10, -1, "androidx.compose.material.Card (Card.kt:62)");
        }
        O0.a(eVar2, i1VarB, jN, jB, c7846g2, fJ, interfaceC6839p, interfaceC3540l, 4194302 & i10, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }
}
