package X6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import kotlin.jvm.internal.u;

/* compiled from: ViewPager2Wrapper.kt */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements p9.l<RecyclerView, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f13648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k f13649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(u uVar, p9.p<? super RecyclerView.p, ? super View, Integer> pVar) {
        super(1);
        this.f13648g = uVar;
        this.f13649h = (kotlin.jvm.internal.k) pVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.k, p9.p] */
    @Override // p9.l
    public final C1992A invoke(RecyclerView recyclerView) {
        RecyclerView withRecyclerView = recyclerView;
        kotlin.jvm.internal.l.f(withRecyclerView, "$this$withRecyclerView");
        int i = 0;
        while (i < withRecyclerView.getChildCount()) {
            int i10 = i + 1;
            View childAt = withRecyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            RecyclerView.p layoutManager = withRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                u uVar = this.f13648g;
                uVar.f43658b = Math.max(uVar.f43658b, ((Number) this.f13649h.invoke(layoutManager, childAt)).intValue());
            }
            i = i10;
        }
        return C1992A.f18074a;
    }
}
