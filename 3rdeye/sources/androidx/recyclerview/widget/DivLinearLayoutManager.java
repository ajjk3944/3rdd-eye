package androidx.recyclerview.widget;

import H6.C0672i;
import N7.C1322q5;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c9.C2097r;
import java.util.HashSet;
import r7.C5533d;

/* compiled from: DivLinearLayoutManager.kt */
/* loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements L6.e {

    /* renamed from: E, reason: collision with root package name */
    public final C0672i f16374E;

    /* renamed from: F, reason: collision with root package name */
    public final O6.v f16375F;

    /* renamed from: G, reason: collision with root package name */
    public final C1322q5 f16376G;

    /* renamed from: H, reason: collision with root package name */
    public final HashSet<View> f16377H;

    /* compiled from: DivLinearLayoutManager.kt */
    public static final class a extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        public int f16378e;

        /* renamed from: f, reason: collision with root package name */
        public int f16379f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(C0672i c0672i, O6.v view, C1322q5 div, int i) {
        super(i);
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        view.getContext();
        this.f16374E = c0672i;
        this.f16375F = view;
        this.f16376G = div;
        this.f16377H = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void E0(RecyclerView.w recycler) {
        kotlin.jvm.internal.l.f(recycler, "recycler");
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m(view.getChildAt(i), true);
        }
        super.E0(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void G0(View child) {
        kotlin.jvm.internal.l.f(child, "child");
        super.G0(child);
        m(child, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void H0(int i) {
        super.H0(i);
        View viewR = r(i);
        if (viewR == null) {
            return;
        }
        m(viewR, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void I(int i) {
        super.I(i);
        View viewR = r(i);
        if (viewR == null) {
            return;
        }
        m(viewR, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q K() {
        a aVar = new a(-2, -2);
        aVar.f16378e = Integer.MAX_VALUE;
        aVar.f16379f = Integer.MAX_VALUE;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q L(Context context, AttributeSet attributeSet) {
        a aVar = new a(context, attributeSet);
        aVar.f16378e = Integer.MAX_VALUE;
        aVar.f16379f = Integer.MAX_VALUE;
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a source = (a) layoutParams;
            kotlin.jvm.internal.l.f(source, "source");
            a aVar = new a(source);
            aVar.f16378e = Integer.MAX_VALUE;
            aVar.f16379f = Integer.MAX_VALUE;
            aVar.f16378e = source.f16378e;
            aVar.f16379f = source.f16379f;
            return aVar;
        }
        if (layoutParams instanceof RecyclerView.q) {
            a aVar2 = new a((RecyclerView.q) layoutParams);
            aVar2.f16378e = Integer.MAX_VALUE;
            aVar2.f16379f = Integer.MAX_VALUE;
            return aVar2;
        }
        if (layoutParams instanceof C5533d) {
            C5533d source2 = (C5533d) layoutParams;
            kotlin.jvm.internal.l.f(source2, "source");
            a aVar3 = new a(source2);
            aVar3.f16378e = source2.f45764g;
            aVar3.f16379f = source2.f45765h;
            return aVar3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar4 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar4.f16378e = Integer.MAX_VALUE;
            aVar4.f16379f = Integer.MAX_VALUE;
            return aVar4;
        }
        a aVar5 = new a(layoutParams);
        aVar5.f16378e = Integer.MAX_VALUE;
        aVar5.f16379f = Integer.MAX_VALUE;
        return aVar5;
    }

    @Override // L6.e
    public final HashSet a() {
        return this.f16377H;
    }

    @Override // L6.e
    public final /* synthetic */ void b(View view, int i, int i10, int i11, int i12, boolean z10) {
        B4.g.f(this, view, i, i10, i11, i12, z10);
    }

    @Override // L6.e
    public final void c(int i, L6.l scrollPosition) {
        kotlin.jvm.internal.l.f(scrollPosition, "scrollPosition");
        B4.g.k(i, 0, this, scrollPosition);
    }

    @Override // L6.e
    public final void d(int i, int i10, L6.l scrollPosition) {
        kotlin.jvm.internal.l.f(scrollPosition, "scrollPosition");
        B4.g.k(i, i10, this, scrollPosition);
    }

    @Override // L6.e
    public final void g(View view, int i, int i10, int i11, int i12) {
        super.h0(view, i, i10, i11, i12);
    }

    @Override // L6.e
    public final C0672i getBindingContext() {
        return this.f16374E;
    }

    @Override // L6.e
    public final C1322q5 getDiv() {
        return this.f16376G;
    }

    @Override // L6.e
    public final RecyclerView getView() {
        return this.f16375F;
    }

    @Override // L6.e
    public final int h() {
        View viewL1 = l1(0, O(), true, false);
        if (viewL1 == null) {
            return -1;
        }
        return RecyclerView.p.b0(viewL1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void h0(View view, int i, int i10, int i11, int i12) {
        b(view, i, i10, i11, i12, false);
    }

    @Override // L6.e
    public final int i(View child) {
        kotlin.jvm.internal.l.f(child, "child");
        return RecyclerView.p.b0(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void i0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        a aVar = (a) layoutParams;
        Rect itemDecorInsetsForChild = this.f16375F.getItemDecorInsetsForChild(view);
        int iJ = B4.g.j(this.f16510n, this.f16508l, itemDecorInsetsForChild.right + Z() + Y() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + itemDecorInsetsForChild.left, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.f16379f, v());
        int iJ2 = B4.g.j(this.f16511o, this.f16509m, X() + a0() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.f16378e, w());
        if (S0(view, iJ, iJ2, aVar)) {
            view.measure(iJ, iJ2);
        }
    }

    @Override // L6.e
    public final int k() {
        View viewL1 = l1(O() - 1, -1, true, false);
        if (viewL1 == null) {
            return -1;
        }
        return RecyclerView.p.b0(viewL1);
    }

    @Override // L6.e
    public final int l() {
        return this.f16510n;
    }

    @Override // L6.e
    public final /* synthetic */ void m(View view, boolean z10) {
        B4.g.l(this, view, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void m0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void n0(RecyclerView recyclerView, RecyclerView.w recycler) {
        kotlin.jvm.internal.l.f(recycler, "recycler");
        B4.g.h(this, recyclerView, recycler);
    }

    @Override // L6.e
    public final int o(View view) {
        return B4.g.m(this, view);
    }

    @Override // L6.e
    public final i7.b p(int i) {
        RecyclerView.h adapter = this.f16375F.getAdapter();
        kotlin.jvm.internal.l.d(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (i7.b) C2097r.r0(i, ((L6.a) adapter).f3271l);
    }

    @Override // L6.e
    public final int q() {
        return this.f16414p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean x(RecyclerView.q qVar) {
        return qVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void z0(RecyclerView.B b10) {
        B4.g.i(this);
        super.z0(b10);
    }

    @Override // L6.e
    public final RecyclerView.p n() {
        return this;
    }
}
