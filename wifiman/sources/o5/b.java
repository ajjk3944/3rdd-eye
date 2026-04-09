package O5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import r.AbstractC7535j;
import r.InterfaceC7533i;

/* loaded from: classes3.dex */
public abstract class b {
    public static final a a(boolean z10, E6.d dVar, E6.c cVar, InterfaceC7533i interfaceC7533i, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.e(-1064693501);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            dVar = E6.d.Start;
        }
        if ((i11 & 4) != 0) {
            cVar = E6.c.f4034a.e();
        }
        if ((i11 & 8) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1064693501, i10, -1, "com.patrykandpatrick.vico.compose.chart.scroll.rememberChartScrollSpec (ChartScrollSpec.kt:74)");
        }
        Object[] objArr = {Boolean.valueOf(z10), dVar, cVar, interfaceC7533i};
        interfaceC3540l.e(-568225417);
        boolean zT = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zT |= interfaceC3540l.T(objArr[i12]);
        }
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(z10, dVar, cVar, interfaceC7533i);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        a aVar = (a) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return aVar;
    }
}
