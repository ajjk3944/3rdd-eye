package L0;

import Q0.AbstractC3434k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.compose.ui.platform.AbstractC3932k0;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11101a = 8;

    public static final O a(int i10, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = f11101a;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        AbstractC3434k.b bVar = (AbstractC3434k.b) interfaceC3540l.t(AbstractC3932k0.i());
        Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        Y0.t tVar = (Y0.t) interfaceC3540l.t(AbstractC3932k0.m());
        boolean zT = interfaceC3540l.T(bVar) | interfaceC3540l.T(dVar) | interfaceC3540l.T(tVar);
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC3540l.i(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = zT | z10;
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new O(bVar, dVar, tVar, i10);
            interfaceC3540l.K(objF);
        }
        O o10 = (O) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return o10;
    }
}
