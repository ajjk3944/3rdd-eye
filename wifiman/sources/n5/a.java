package N5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import W5.b;
import Y5.c;
import h6.C5953a;
import java.util.List;
import java.util.Map;
import k6.InterfaceC6394a;

/* loaded from: classes3.dex */
public abstract class a {
    public static final C5953a a(List list, float f10, C5953a.b bVar, List list2, Map map, InterfaceC6394a interfaceC6394a, c.b bVar2, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.e(-2021435092);
        List listA = (i11 & 1) != 0 ? b.a(interfaceC3540l, 0).c().a() : list;
        float fB = (i11 & 2) != 0 ? b.a(interfaceC3540l, 0).c().b() : f10;
        C5953a.b bVar3 = (i11 & 4) != 0 ? C5953a.b.Center : bVar;
        List list3 = (i11 & 8) != 0 ? null : list2;
        Map map2 = (i11 & 16) != 0 ? null : map;
        InterfaceC6394a interfaceC6394a2 = (i11 & 32) != 0 ? null : interfaceC6394a;
        c.b bVar4 = (i11 & 64) == 0 ? bVar2 : null;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2021435092, i10, -1, "com.patrykandpatrick.vico.compose.chart.line.lineChart (LineChart.kt:68)");
        }
        interfaceC3540l.e(-492369756);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new C5953a(null, 0.0f, null, null, 15, null);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        C5953a c5953a = (C5953a) objF;
        c5953a.M(listA);
        c5953a.O(fB);
        c5953a.N(bVar3);
        c5953a.y(interfaceC6394a2);
        c5953a.P(bVar4);
        if (list3 != null) {
            c5953a.z(list3);
        }
        if (map2 != null) {
            c5953a.A(map2);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return c5953a;
    }
}
