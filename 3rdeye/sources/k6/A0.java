package K6;

import N7.Ba;
import N7.C1139d9;
import N7.H9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3169h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3170j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(A7.d dVar, C1139d9 c1139d9, O6.w wVar) {
        super(1);
        this.f3168g = 1;
        this.i = c1139d9;
        this.f3169h = dVar;
        this.f3170j = wVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3168g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                ((O6.p) this.i).setHighlightColor(((Number) ((A7.b) this.f3170j).a(this.f3169h)).intValue());
                break;
            case 1:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                C1139d9 c1139d9 = (C1139d9) this.i;
                A7.b<Long> bVar = c1139d9.f8108m;
                A7.d dVar = this.f3169h;
                long jLongValue = bVar.a(dVar).longValue();
                long j4 = jLongValue >> 31;
                int i = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
                H9 h9A = c1139d9.f8109n.a(dVar);
                O6.w wVar = (O6.w) this.f3170j;
                C0713c.e(wVar, i, h9A);
                C0713c.h(wVar, c1139d9.f8119x.a(dVar).doubleValue(), i);
                break;
            default:
                C0713c.j(((O6.C) this.i).getDivider(), ((Ba) this.f3170j).f4915A, this.f3169h);
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(View view, Object obj, A7.d dVar, int i) {
        super(1);
        this.f3168g = i;
        this.i = view;
        this.f3170j = obj;
        this.f3169h = dVar;
    }
}
