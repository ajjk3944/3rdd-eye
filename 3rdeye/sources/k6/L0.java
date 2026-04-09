package K6;

import H6.C0672i;
import N7.AbstractC1293o4;
import N7.C1139d9;
import N7.C1438ya;
import N7.H9;
import N7.Ka;
import N7.T5;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class L0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3266h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3267j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3268k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(A7.b bVar, A7.d dVar, C1139d9 c1139d9, O6.w wVar) {
        super(1);
        this.f3265g = 1;
        this.i = bVar;
        this.f3266h = dVar;
        this.f3267j = c1139d9;
        this.f3268k = wVar;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f3265g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                ((C0759u0) this.i).p((O6.p) this.f3267j, (T5) this.f3268k, (A7.d) this.f3266h);
                break;
            case 1:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                A7.b bVar = (A7.b) this.i;
                A7.d dVar = (A7.d) this.f3266h;
                long jLongValue = ((Number) bVar.a(dVar)).longValue();
                H9 h9A = ((C1139d9) this.f3267j).f8109n.a(dVar);
                Long lValueOf = Long.valueOf(jLongValue);
                O6.w wVar = (O6.w) this.f3268k;
                DisplayMetrics displayMetrics = wVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                wVar.setLineHeight(C0713c.n0(lValueOf, displayMetrics, h9A));
                C0713c.i(wVar, Long.valueOf(jLongValue), h9A);
                break;
            case 2:
                kotlin.jvm.internal.l.f(it, "it");
                AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) this.f3268k;
                ((Z0) this.i).getClass();
                O6.y yVar = (O6.y) this.f3267j;
                DisplayMetrics displayMetrics2 = yVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
                yVar.setActiveTrackDrawable(C0713c.b0(abstractC1293o4, displayMetrics2, (A7.d) this.f3266h));
                break;
            case 3:
                kotlin.jvm.internal.l.f(it, "<anonymous parameter 0>");
                C1438ya c1438ya = (C1438ya) this.f3268k;
                ((x1) this.i).getClass();
                ((O6.B) this.f3267j).setEnabled(c1438ya.f9963o.a((A7.d) this.f3266h).booleanValue());
                break;
            default:
                String text = (String) it;
                kotlin.jvm.internal.l.f(text, "text");
                C0672i c0672i = (C0672i) this.f3268k;
                Ka ka2 = (Ka) this.f3266h;
                y1 y1Var = (y1) this.i;
                O6.q qVar = (O6.q) this.f3267j;
                y1Var.v(qVar, c0672i, ka2);
                y1Var.p(qVar, text);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(H6.B b10, View view, Object obj, Object obj2, int i) {
        super(1);
        this.f3265g = i;
        this.i = b10;
        this.f3267j = view;
        this.f3268k = obj;
        this.f3266h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Z0 z02, O6.y yVar, A7.d dVar, AbstractC1293o4 abstractC1293o4) {
        super(1);
        this.f3265g = 2;
        this.i = z02;
        this.f3267j = yVar;
        this.f3266h = dVar;
        this.f3268k = abstractC1293o4;
    }
}
