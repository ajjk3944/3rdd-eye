package K6;

import H6.C0672i;
import N7.AbstractC1339r9;
import N7.C1089a4;
import N7.C1140da;
import N7.C1185ga;
import N7.G5;
import N7.H5;
import N7.H9;
import N7.S2;
import N7.W4;
import N7.W8;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import s7.AbstractC5584c;
import s7.EnumC5582a;
import s7.InterfaceC5583b;
import s7.d;
import z7.InterfaceC5868a;

/* compiled from: DivIndicatorBinder.kt */
/* renamed from: K6.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757t0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final M6.w f3635c;

    public C0757t0(D d10, M6.w wVar) {
        super(d10);
        this.f3635c = wVar;
    }

    public static void m(O6.s sVar, A7.d dVar, G5 g52) {
        s7.d aVar;
        s7.d dVarN;
        s7.d dVarN2;
        InterfaceC5583b c0527b;
        DisplayMetrics metrics = sVar.getResources().getDisplayMetrics();
        float fDoubleValue = (float) g52.f5298c.a(dVar).doubleValue();
        float fDoubleValue2 = (float) g52.f5319y.a(dVar).doubleValue();
        A7.b<Integer> bVar = g52.f5313s;
        W8 w82 = g52.f5299d;
        W8 w83 = g52.f5315u;
        W8 w84 = g52.f5314t;
        if (w83 != null) {
            kotlin.jvm.internal.l.e(metrics, "metrics");
            aVar = o(w83, metrics, dVar, bVar, 1.0f);
        } else if (w82 != null) {
            kotlin.jvm.internal.l.e(metrics, "metrics");
            aVar = o(w82, metrics, dVar, bVar, 1 / fDoubleValue);
        } else {
            if (w84 != null) {
                kotlin.jvm.internal.l.e(metrics, "metrics");
                aVar = o(w84, metrics, dVar, bVar, fDoubleValue2);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                kotlin.jvm.internal.l.e(metrics, "metrics");
                AbstractC1339r9 abstractC1339r9 = g52.f5281E;
                if (abstractC1339r9 instanceof AbstractC1339r9.b) {
                    aVar = o(((AbstractC1339r9.b) abstractC1339r9).f9080b, metrics, dVar, bVar, 1.0f);
                } else {
                    if (!(abstractC1339r9 instanceof AbstractC1339r9.a)) {
                        throw new b9.j();
                    }
                    aVar = new d.a(bVar.a(dVar).intValue(), new AbstractC5584c.a(C0713c.j0(((AbstractC1339r9.a) abstractC1339r9).f9079b.f8728b, metrics, dVar) * 1.0f));
                }
            }
        }
        A7.b<Integer> bVar2 = g52.f5297b;
        if (w82 != null) {
            kotlin.jvm.internal.l.e(metrics, "metrics");
            dVarN = o(w82, metrics, dVar, bVar2, 1.0f);
        } else {
            dVarN = n(aVar, fDoubleValue, bVar2.a(dVar));
        }
        if (w84 != null) {
            kotlin.jvm.internal.l.e(metrics, "metrics");
            dVarN2 = o(w84, metrics, dVar, bVar, 1.0f);
        } else {
            dVarN2 = n(aVar, fDoubleValue2, null);
        }
        s7.d dVar2 = dVarN2;
        G5.a aVarA = g52.f5303h.a(dVar);
        kotlin.jvm.internal.l.f(aVarA, "<this>");
        EnumC5582a enumC5582a = aVarA == G5.a.WORM ? EnumC5582a.WORM : aVarA == G5.a.SLIDER ? EnumC5582a.SLIDER : EnumC5582a.SCALE;
        InterfaceC5868a aVar2 = g52.f5316v;
        if (aVar2 == null) {
            aVar2 = new H5.a(new C1089a4(g52.f5282F));
        }
        if (aVar2 instanceof H5.a) {
            W4 w42 = ((H5.a) aVar2).f5391b.f7894a;
            kotlin.jvm.internal.l.e(metrics, "metrics");
            c0527b = new InterfaceC5583b.a(C0713c.h0(w42, metrics, dVar));
        } else {
            if (!(aVar2 instanceof H5.b)) {
                throw new b9.j();
            }
            C1140da c1140da = ((H5.b) aVar2).f5392b;
            W4 w43 = c1140da.f8127a;
            kotlin.jvm.internal.l.e(metrics, "metrics");
            float fH0 = C0713c.h0(w43, metrics, dVar);
            long jLongValue = c1140da.f8128b.a(dVar).longValue();
            long j4 = jLongValue >> 31;
            c0527b = new InterfaceC5583b.C0527b(fH0, (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
        }
        sVar.setStyle(new s7.e(enumC5582a, dVarN, aVar, dVar2, c0527b));
    }

    public static s7.d n(s7.d dVar, float f10, Integer num) {
        if (!(dVar instanceof d.b)) {
            if (dVar instanceof d.a) {
                return new d.a(num != null ? num.intValue() : ((d.a) dVar).f46129a, new AbstractC5584c.a(((d.a) dVar).f46130b.f46125a * f10));
            }
            throw new b9.j();
        }
        int iIntValue = num != null ? num.intValue() : ((d.b) dVar).f46131a;
        d.b bVar = (d.b) dVar;
        AbstractC5584c.b bVar2 = bVar.f46132b;
        return C0713c.A(iIntValue, bVar2.f46126a, bVar2.f46127b, bVar2.f46128c, f10, Float.valueOf(bVar.f46133c), Integer.valueOf(bVar.f46134d));
    }

    public static d.b o(W8 w82, DisplayMetrics displayMetrics, A7.d dVar, A7.b bVar, float f10) {
        H9 h9A;
        A7.b<Double> bVar2;
        A7.b<H9> bVar3;
        C1185ga c1185ga = w82.f7623e;
        if (c1185ga == null || (bVar3 = c1185ga.f8301c) == null || (h9A = bVar3.a(dVar)) == null) {
            h9A = H9.DP;
        }
        C1185ga c1185ga2 = w82.f7623e;
        Integer numValueOf = (c1185ga2 == null || (bVar2 = c1185ga2.f8302d) == null) ? null : Integer.valueOf(C0713c.o0(Double.valueOf(bVar2.a(dVar).doubleValue()), displayMetrics, h9A));
        A7.b<Integer> bVar4 = w82.f7619a;
        if (bVar4 != null) {
            bVar = bVar4;
        }
        return C0713c.A(((Number) bVar.a(dVar)).intValue(), C0713c.j0(w82.f7622d, displayMetrics, dVar), C0713c.j0(w82.f7621c, displayMetrics, dVar), C0713c.j0(w82.f7620b, displayMetrics, dVar), f10, numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null, c1185ga2 != null ? c1185ga2.f8299a.a(dVar) : null);
    }

    @Override // H6.B
    public final void d(View view, C0672i c0672i, S2 s22, S2 s23) {
        O6.s sVar = (O6.s) view;
        G5 g52 = (G5) s22;
        kotlin.jvm.internal.l.f(sVar, "<this>");
        A7.d dVar = c0672i.f2147b;
        m(sVar, dVar, g52);
        E e4 = new E((H6.B) this, (View) sVar, dVar, (InterfaceC5868a) g52, 2);
        sVar.b(g52.f5303h.d(dVar, e4));
        sVar.b(g52.f5297b.d(dVar, e4));
        sVar.b(g52.f5298c.d(dVar, e4));
        sVar.b(g52.f5313s.d(dVar, e4));
        sVar.b(g52.f5319y.d(dVar, e4));
        C6.g.h(sVar, g52.f5281E, dVar, e4);
        C6.g.g(sVar, g52.f5299d, dVar, e4);
        C6.g.g(sVar, g52.f5315u, dVar, e4);
        C6.g.g(sVar, g52.f5314t, dVar, e4);
        InterfaceC5868a aVar = g52.f5316v;
        if (aVar == null) {
            aVar = new H5.a(new C1089a4(g52.f5282F));
        }
        if (aVar instanceof H5.a) {
            C1089a4 c1089a4 = ((H5.a) aVar).f5391b;
            sVar.b(c1089a4.f7894a.f7613b.d(dVar, e4));
            sVar.b(c1089a4.f7894a.f7612a.d(dVar, e4));
        } else if (aVar instanceof H5.b) {
            C1140da c1140da = ((H5.b) aVar).f5392b;
            sVar.b(c1140da.f8127a.f7613b.d(dVar, e4));
            sVar.b(c1140da.f8127a.f7612a.d(dVar, e4));
            sVar.b(c1140da.f8128b.d(dVar, e4));
        }
        Object objC = g52.f5294R.c();
        if (objC instanceof W4) {
            C6.g.d(sVar, (W4) objC, dVar, e4);
        }
        Object objC2 = g52.f5311q.c();
        if (objC2 instanceof W4) {
            C6.g.d(sVar, (W4) objC2, dVar, e4);
        }
    }
}
