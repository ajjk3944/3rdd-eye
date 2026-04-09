package K6;

import H6.C0672i;
import N7.C1438ya;
import N7.H9;
import N7.Ka;
import N7.T5;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* renamed from: K6.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769z0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f3744h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3746k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0769z0(H6.B b10, View view, Object obj, Object obj2, int i) {
        super(1);
        this.f3743g = i;
        this.f3745j = b10;
        this.f3744h = view;
        this.f3746k = obj;
        this.i = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3743g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                ((C0759u0) this.f3745j).getClass();
                T5 t52 = (T5) this.f3746k;
                A7.b<Long> bVar = t52.f6314q;
                A7.d dVar = (A7.d) this.i;
                long jLongValue = bVar.a(dVar).longValue();
                long j4 = jLongValue >> 31;
                int i = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
                H9 h9A = t52.f6315r.a(dVar);
                O6.p pVar = (O6.p) this.f3744h;
                C0713c.e(pVar, i, h9A);
                C0713c.h(pVar, t52.f6269E.a(dVar).doubleValue(), i);
                break;
            case 1:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                C0713c.i((O6.p) this.f3744h, (Long) ((A7.b) this.f3745j).a((A7.d) this.i), (H9) this.f3746k);
                break;
            case 2:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                C1438ya c1438ya = (C1438ya) this.f3746k;
                ((x1) this.f3745j).getClass();
                A7.b<Integer> bVar2 = c1438ya.f9967s;
                ((O6.B) this.f3744h).setColorOn(bVar2 != null ? bVar2.a((A7.d) this.i) : null);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                ((y1) this.f3745j).v((O6.q) this.f3744h, (C0672i) this.f3746k, (Ka) this.i);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769z0(O6.p pVar, A7.b bVar, A7.d dVar, H9 h92) {
        super(1);
        this.f3743g = 1;
        this.f3744h = pVar;
        this.f3745j = bVar;
        this.i = dVar;
        this.f3746k = h92;
    }
}
