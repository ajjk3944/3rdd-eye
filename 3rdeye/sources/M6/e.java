package M6;

import H6.C0672i;
import K6.P;
import N7.C1333r3;
import O6.t;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import i7.C4460a;
import java.util.ArrayList;

/* compiled from: DivPagerBinder.kt */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.t f4237g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1333r3 f4238h;
    public final /* synthetic */ C0672i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(O6.t tVar, C1333r3 c1333r3, C0672i c0672i) {
        super(1);
        this.f4237g = tVar;
        this.f4238h = c1333r3;
        this.i = c0672i;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) throws Exception {
        kotlin.jvm.internal.l.f(it, "it");
        O6.t tVar = this.f4237g;
        C0795a c0795a = (C0795a) tVar.getViewPager().getAdapter();
        if (c0795a != null) {
            ArrayList arrayListA = C4460a.a(this.f4238h, this.i.f2147b);
            ArrayList arrayList = c0795a.f3269j;
            int size = arrayList.size();
            c0795a.f4231z = 0;
            O6.t tVar2 = c0795a.f4226u;
            int currentItem$div_release = tVar2.getCurrentItem$div_release();
            c0795a.f4219A = currentItem$div_release;
            P.a aVar = new P.a(arrayList, arrayListA);
            androidx.recyclerview.widget.p.a(aVar).a(new P.b(arrayListA));
            c0795a.e();
            if (c0795a.f4231z != size) {
                currentItem$div_release = c0795a.f4219A;
            }
            tVar2.setCurrentItem$div_release(currentItem$div_release);
        }
        t.b pagerOnItemsCountChange$div_release = tVar.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null) {
            O6.s this$0 = (O6.s) ((D7.c) pagerOnItemsCountChange$div_release).f1075c;
            kotlin.jvm.internal.l.f(this$0, "this$0");
            s7.f fVar = this$0.f46163b;
            if (fVar != null) {
                this$0.a(fVar);
            }
        }
        RecyclerView recyclerView = tVar.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.scrollToPosition(tVar.getCurrentItem$div_release());
        }
        tVar.getViewPager().addOnLayoutChangeListener(new d(tVar));
        return C1992A.f18074a;
    }
}
