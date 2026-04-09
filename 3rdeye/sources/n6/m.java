package N6;

import K6.C0713c;
import N7.Ba;
import N7.H9;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import y7.v;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ba.c f4737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f4738h;
    public final /* synthetic */ v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Ba.c cVar, A7.d dVar, v vVar) {
        super(1);
        this.f4737g = cVar;
        this.f4738h = dVar;
        this.i = vVar;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        Ba.c cVar = this.f4737g;
        A7.b<Long> bVar = cVar.f4986j;
        A7.d dVar = this.f4738h;
        long jLongValue = bVar.a(dVar).longValue();
        long j4 = jLongValue >> 31;
        int i = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        A7.b<H9> bVar2 = cVar.f4987k;
        H9 h9A = bVar2.a(dVar);
        v vVar = this.i;
        C0713c.e(vVar, i, h9A);
        C0713c.h(vVar, cVar.f4994r.a(dVar).doubleValue(), i);
        A7.b<Long> bVar3 = cVar.f4995s;
        C0713c.i(vVar, bVar3 != null ? bVar3.a(dVar) : null, bVar2.a(dVar));
        return C1992A.f18074a;
    }
}
