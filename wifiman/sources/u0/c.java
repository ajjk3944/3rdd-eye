package U0;

import L0.AbstractC3175e;
import L0.C3174d;
import L0.D;
import L0.U;
import O0.f;
import O0.g;
import O0.l;
import O0.m;
import O0.n;
import O0.o;
import Q0.A;
import Q0.AbstractC3434k;
import Q0.v;
import Q0.w;
import W0.h;
import W0.k;
import Y0.x;
import Yg.J;
import Zg.AbstractC3682n;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import l0.C6531g;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.e1;
import m0.g1;
import m0.j1;
import mh.q;
import mh.r;
import o0.AbstractC7040g;
import oh.AbstractC7137b;

/* loaded from: classes.dex */
public abstract class c {

    static final class a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Spannable f22116a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f22117b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Spannable spannable, r rVar) {
            super(3);
            this.f22116a = spannable;
            this.f22117b = rVar;
        }

        public final void a(D d10, int i10, int i11) {
            Spannable spannable = this.f22116a;
            r rVar = this.f22117b;
            AbstractC3434k abstractC3434kI = d10.i();
            A aN = d10.n();
            if (aN == null) {
                aN = A.f18971b.e();
            }
            v vVarL = d10.l();
            v vVarC = v.c(vVarL != null ? vVarL.i() : v.f19100b.b());
            w wVarM = d10.m();
            spannable.setSpan(new o((Typeface) rVar.y(abstractC3434kI, aN, vVarC, w.e(wVarM != null ? wVarM.m() : w.f19104b.a()))), i10, i11, 33);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((D) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    private static final MetricAffectingSpan a(long j10, Y0.d dVar) {
        long jG = Y0.v.g(j10);
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.b())) {
            return new f(dVar.N1(j10));
        }
        if (x.g(jG, aVar.a())) {
            return new O0.e(Y0.v.h(j10));
        }
        return null;
    }

    public static final void b(D d10, List list, q qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.s(f(d10, (D) ((C3174d.c) list.get(0)).g()), Integer.valueOf(((C3174d.c) list.get(0)).h()), Integer.valueOf(((C3174d.c) list.get(0)).f()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C3174d.c cVar = (C3174d.c) list.get(i12);
            numArr[i12] = Integer.valueOf(cVar.h());
            numArr[i12 + size] = Integer.valueOf(cVar.f());
        }
        AbstractC3682n.H(numArr);
        int iIntValue = ((Number) AbstractC3682n.Z(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            Integer num = numArr[i13];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                D dF = d10;
                for (int i14 = 0; i14 < size3; i14++) {
                    C3174d.c cVar2 = (C3174d.c) list.get(i14);
                    if (cVar2.h() != cVar2.f() && AbstractC3175e.n(iIntValue, iIntValue2, cVar2.h(), cVar2.f())) {
                        dF = f(dF, (D) cVar2.g());
                    }
                }
                if (dF != null) {
                    qVar.s(dF, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(D d10) {
        long jG = Y0.v.g(d10.o());
        x.a aVar = x.f24553b;
        return x.g(jG, aVar.b()) || x.g(Y0.v.g(d10.o()), aVar.a());
    }

    private static final boolean d(U u10) {
        return d.d(u10.N()) || u10.n() != null;
    }

    private static final boolean e(Y0.d dVar) {
        return ((double) dVar.y()) > 1.05d;
    }

    private static final D f(D d10, D d11) {
        return d10 == null ? d11 : d10.y(d11);
    }

    private static final float g(long j10, float f10, Y0.d dVar) {
        float fH;
        long jG = Y0.v.g(j10);
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.b())) {
            if (!e(dVar)) {
                return dVar.N1(j10);
            }
            fH = Y0.v.h(j10) / Y0.v.h(dVar.F0(f10));
        } else {
            if (!x.g(jG, aVar.a())) {
                return Float.NaN;
            }
            fH = Y0.v.h(j10);
        }
        return fH * f10;
    }

    public static final void h(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new BackgroundColorSpan(AbstractC6737x0.j(j10)), i10, i11);
        }
    }

    private static final void i(Spannable spannable, W0.a aVar, int i10, int i11) {
        if (aVar != null) {
            u(spannable, new O0.a(aVar.h()), i10, i11);
        }
    }

    private static final void j(Spannable spannable, AbstractC6713l0 abstractC6713l0, float f10, int i10, int i11) {
        if (abstractC6713l0 != null) {
            if (abstractC6713l0 instanceof j1) {
                k(spannable, ((j1) abstractC6713l0).b(), i10, i11);
            } else if (abstractC6713l0 instanceof e1) {
                u(spannable, new V0.b((e1) abstractC6713l0, f10), i10, i11);
            }
        }
    }

    public static final void k(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new ForegroundColorSpan(AbstractC6737x0.j(j10)), i10, i11);
        }
    }

    private static final void l(Spannable spannable, AbstractC7040g abstractC7040g, int i10, int i11) {
        if (abstractC7040g != null) {
            u(spannable, new V0.a(abstractC7040g), i10, i11);
        }
    }

    private static final void m(Spannable spannable, U u10, List list, r rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            C3174d.c cVar = (C3174d.c) obj;
            if (d.d((D) cVar.g()) || ((D) cVar.g()).m() != null) {
                arrayList.add(obj);
            }
        }
        b(d(u10) ? new D(0L, 0L, u10.o(), u10.m(), u10.n(), u10.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            u(spannable, new O0.b(str), i10, i11);
        }
    }

    public static final void o(Spannable spannable, long j10, Y0.d dVar, int i10, int i11) {
        long jG = Y0.v.g(j10);
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(AbstractC7137b.e(dVar.N1(j10)), false), i10, i11);
        } else if (x.g(jG, aVar.a())) {
            u(spannable, new RelativeSizeSpan(Y0.v.h(j10)), i10, i11);
        }
    }

    private static final void p(Spannable spannable, W0.o oVar, int i10, int i11) {
        if (oVar != null) {
            u(spannable, new ScaleXSpan(oVar.b()), i10, i11);
            u(spannable, new m(oVar.c()), i10, i11);
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, Y0.d dVar, h hVar) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new O0.h(fG, 0, (spannable.length() == 0 || t.v1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), h.c.f(hVar.c()), h.c.g(hVar.c()), hVar.b()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j10, float f10, Y0.d dVar) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new g(fG), 0, spannable.length());
    }

    public static final void s(Spannable spannable, S0.e eVar, int i10, int i11) {
        if (eVar != null) {
            u(spannable, U0.a.f22115a.a(eVar), i10, i11);
        }
    }

    private static final void t(Spannable spannable, g1 g1Var, int i10, int i11) {
        if (g1Var != null) {
            u(spannable, new l(AbstractC6737x0.j(g1Var.c()), C6531g.m(g1Var.d()), C6531g.n(g1Var.d()), d.b(g1Var.b())), i10, i11);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void v(Spannable spannable, C3174d.c cVar, Y0.d dVar) {
        int iH = cVar.h();
        int iF = cVar.f();
        D d10 = (D) cVar.g();
        i(spannable, d10.e(), iH, iF);
        k(spannable, d10.g(), iH, iF);
        j(spannable, d10.f(), d10.c(), iH, iF);
        x(spannable, d10.s(), iH, iF);
        o(spannable, d10.k(), dVar, iH, iF);
        n(spannable, d10.j(), iH, iF);
        p(spannable, d10.u(), iH, iF);
        s(spannable, d10.p(), iH, iF);
        h(spannable, d10.d(), iH, iF);
        t(spannable, d10.r(), iH, iF);
        l(spannable, d10.h(), iH, iF);
    }

    public static final void w(Spannable spannable, U u10, List list, Y0.d dVar, r rVar) {
        MetricAffectingSpan metricAffectingSpanA;
        m(spannable, u10, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) list.get(i10);
            int iH = cVar.h();
            int iF = cVar.f();
            if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                v(spannable, cVar, dVar);
                if (c((D) cVar.g())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C3174d.c cVar2 = (C3174d.c) list.get(i11);
                int iH2 = cVar2.h();
                int iF2 = cVar2.f();
                D d10 = (D) cVar2.g();
                if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanA = a(d10.o(), dVar)) != null) {
                    u(spannable, metricAffectingSpanA, iH2, iF2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, k kVar, int i10, int i11) {
        if (kVar != null) {
            k.a aVar = k.f23532b;
            u(spannable, new n(kVar.d(aVar.d()), kVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void y(Spannable spannable, W0.q qVar, float f10, Y0.d dVar) {
        if (qVar != null) {
            if ((Y0.v.e(qVar.b(), Y0.w.g(0)) && Y0.v.e(qVar.c(), Y0.w.g(0))) || Y0.w.h(qVar.b()) || Y0.w.h(qVar.c())) {
                return;
            }
            long jG = Y0.v.g(qVar.b());
            x.a aVar = x.f24553b;
            float fH = 0.0f;
            float fN1 = x.g(jG, aVar.b()) ? dVar.N1(qVar.b()) : x.g(jG, aVar.a()) ? Y0.v.h(qVar.b()) * f10 : 0.0f;
            long jG2 = Y0.v.g(qVar.c());
            if (x.g(jG2, aVar.b())) {
                fH = dVar.N1(qVar.c());
            } else if (x.g(jG2, aVar.a())) {
                fH = Y0.v.h(qVar.c()) * f10;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fN1), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }
}
