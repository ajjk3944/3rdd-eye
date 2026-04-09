package N6;

import K6.C0713c;
import N7.Ba;
import N7.C1362t4;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import b9.C1992A;
import y7.t;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ba f4729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f4730h;
    public final /* synthetic */ t<?> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Ba ba2, A7.d dVar, t<?> tVar) {
        super(1);
        this.f4729g = ba2;
        this.f4730h = dVar;
        this.i = tVar;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        Ba ba2 = this.f4729g;
        Ba.c cVar = ba2.f4918D;
        if (cVar == null) {
            cVar = d.f4698q;
        }
        C1362t4 c1362t4 = cVar.f4996t;
        A7.d dVar = this.f4730h;
        A7.b<Long> bVar = cVar.f4995s;
        long jLongValue = c1362t4.f9216a.a(dVar).longValue() + c1362t4.f9221f.a(dVar).longValue() + (bVar != null ? bVar.a(dVar).longValue() : (long) (cVar.f4986j.a(dVar).floatValue() * 1.3f));
        C1362t4 c1362t42 = ba2.f4919E;
        long jLongValue2 = c1362t42.f9216a.a(dVar).longValue() + c1362t42.f9221f.a(dVar).longValue() + jLongValue;
        t<?> tVar = this.i;
        DisplayMetrics metrics = tVar.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
        Long lValueOf = Long.valueOf(jLongValue2);
        kotlin.jvm.internal.l.e(metrics, "metrics");
        layoutParams.height = C0713c.W(lValueOf, metrics);
        return C1992A.f18074a;
    }
}
