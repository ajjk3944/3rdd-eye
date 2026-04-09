package X6;

import M6.C0795a;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import kotlin.jvm.internal.u;

/* compiled from: ViewPager2Wrapper.kt */
/* loaded from: classes.dex */
public class q extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final Q1.f f13650b;

    /* renamed from: c, reason: collision with root package name */
    public M6.o f13651c;

    /* compiled from: ViewPager2Wrapper.kt */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements p9.p<RecyclerView.p, View, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13652b = new a(2, RecyclerView.p.class, "getDecoratedMeasuredHeight", "getDecoratedMeasuredHeight(Landroid/view/View;)I", 0);

        @Override // p9.p
        public final Integer invoke(RecyclerView.p pVar, View view) {
            RecyclerView.p p02 = pVar;
            View p12 = view;
            kotlin.jvm.internal.l.f(p02, "p0");
            kotlin.jvm.internal.l.f(p12, "p1");
            return Integer.valueOf(RecyclerView.p.T(p12));
        }
    }

    /* compiled from: ViewPager2Wrapper.kt */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements p9.p<RecyclerView.p, View, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13653b = new b(2, RecyclerView.p.class, "getDecoratedMeasuredWidth", "getDecoratedMeasuredWidth(Landroid/view/View;)I", 0);

        @Override // p9.p
        public final Integer invoke(RecyclerView.p pVar, View view) {
            RecyclerView.p p02 = pVar;
            View p12 = view;
            kotlin.jvm.internal.l.f(p02, "p0");
            kotlin.jvm.internal.l.f(p12, "p1");
            return Integer.valueOf(RecyclerView.p.U(p12));
        }
    }

    /* compiled from: ViewPager2Wrapper.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<RecyclerView, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f13654g = new c(1);

        @Override // p9.l
        public final C1992A invoke(RecyclerView recyclerView) {
            RecyclerView withRecyclerView = recyclerView;
            kotlin.jvm.internal.l.f(withRecyclerView, "$this$withRecyclerView");
            withRecyclerView.getRecycledViewPool().a();
            int i = 0;
            while (true) {
                if (!(i < withRecyclerView.getChildCount())) {
                    return C1992A.f18074a;
                }
                int i10 = i + 1;
                View childAt = withRecyclerView.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                childAt.setTranslationX(0.0f);
                childAt.setTranslationY(0.0f);
                i = i10;
            }
        }
    }

    /* compiled from: ViewPager2Wrapper.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<RecyclerView, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.v f13655g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RecyclerView.v vVar) {
            super(1);
            this.f13655g = vVar;
        }

        @Override // p9.l
        public final C1992A invoke(RecyclerView recyclerView) {
            RecyclerView withRecyclerView = recyclerView;
            kotlin.jvm.internal.l.f(withRecyclerView, "$this$withRecyclerView");
            withRecyclerView.setRecycledViewPool(this.f13655g);
            return C1992A.f18074a;
        }
    }

    public q(Context context) {
        super(context, null, 0);
        this.f13650b = new Q1.f(context);
        super.addView(getViewPager());
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    public final M6.o getPageTransformer$div_release() {
        return this.f13651c;
    }

    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public Q1.f getViewPager() {
        return this.f13650b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        if ((getOrientation() != 0 || getLayoutParams().height != -2) && (getOrientation() != 1 || getLayoutParams().width != -2)) {
            super.onMeasure(i, i10);
            return;
        }
        measureChild(getViewPager(), i, i10);
        int orientation = getOrientation();
        if (orientation == 0) {
            a aVar = a.f13652b;
            u uVar = new u();
            p pVar = new p(uVar, aVar);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                pVar.invoke(recyclerView);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(uVar.f43658b, 1073741824));
            return;
        }
        if (orientation != 1) {
            return;
        }
        b bVar = b.f13653b;
        u uVar2 = new u();
        p pVar2 = new p(uVar2, bVar);
        RecyclerView recyclerView2 = getRecyclerView();
        if (recyclerView2 != null) {
            pVar2.invoke(recyclerView2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(uVar2.f43658b, 1073741824), i10);
    }

    public final void setOrientation(int i) {
        C0795a c0795a = (C0795a) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i && c0795a != null && c0795a.f4228w == i) {
            return;
        }
        getViewPager().setOrientation(i);
        if (c0795a != null) {
            c0795a.f4228w = i;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        c.f13654g.invoke(recyclerView);
    }

    public final void setPageTransformer$div_release(M6.o oVar) {
        this.f13651c = oVar;
        getViewPager().setPageTransformer(oVar);
    }

    public final void setRecycledViewPool(RecyclerView.v viewPool) {
        kotlin.jvm.internal.l.f(viewPool, "viewPool");
        d dVar = new d(viewPool);
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        dVar.invoke(recyclerView);
    }
}
