package com.yandex.div.core.view2.divs.gallery;

import A7.b;
import B4.g;
import H6.C0672i;
import K6.C0713c;
import L6.a;
import L6.e;
import N7.C1322q5;
import N7.C9;
import N7.S2;
import O6.v;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c9.C2097r;
import java.util.HashSet;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* compiled from: DivGridLayoutManager.kt */
/* loaded from: classes.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements e {

    /* renamed from: L, reason: collision with root package name */
    public final C0672i f23938L;

    /* renamed from: M, reason: collision with root package name */
    public final v f23939M;

    /* renamed from: N, reason: collision with root package name */
    public final C1322q5 f23940N;

    /* renamed from: O, reason: collision with root package name */
    public final HashSet<View> f23941O;

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(C0672i c0672i, v view, C1322q5 div, int i) {
        int i10;
        l.f(view, "view");
        l.f(div, "div");
        b<Long> bVar = div.f8964h;
        if (bVar != null) {
            long jLongValue = bVar.a(c0672i.f2147b).longValue();
            long j4 = jLongValue >> 31;
            i10 = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i10 = 1;
        }
        super(i10, i);
        this.f23938L = c0672i;
        this.f23939M = view;
        this.f23940N = div;
        this.f23941O = new HashSet<>();
    }

    public final int C1() {
        Long lA = this.f23940N.f8975t.a(this.f23938L.f2147b);
        DisplayMetrics displayMetrics = this.f23939M.getResources().getDisplayMetrics();
        l.e(displayMetrics, "view.resources.displayMetrics");
        return C0713c.B(lA, displayMetrics);
    }

    public final int D1(int i) {
        if (i == this.f16554t) {
            return C1();
        }
        b<Long> bVar = this.f23940N.f8966k;
        if (bVar == null) {
            return C1();
        }
        Long lValueOf = Long.valueOf(bVar.a(this.f23938L.f2147b).longValue());
        DisplayMetrics displayMetrics = this.f23939M.getResources().getDisplayMetrics();
        l.e(displayMetrics, "view.resources.displayMetrics");
        return C0713c.B(lValueOf, displayMetrics);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void E0(RecyclerView.w recycler) {
        l.f(recycler, "recycler");
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m(view.getChildAt(i), true);
        }
        super.E0(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void G0(View child) {
        l.f(child, "child");
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

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int X() {
        return super.X() - (D1(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int Y() {
        return super.Y() - (D1(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int Z() {
        return super.Z() - (D1(0) / 2);
    }

    @Override // L6.e
    public final HashSet a() {
        return this.f23941O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int a0() {
        return super.a0() - (D1(1) / 2);
    }

    @Override // L6.e
    public final /* synthetic */ void b(View view, int i, int i10, int i11, int i12, boolean z10) {
        g.f(this, view, i, i10, i11, i12, z10);
    }

    @Override // L6.e
    public final void c(int i, L6.l scrollPosition) {
        l.f(scrollPosition, "scrollPosition");
        g.k(i, 0, this, scrollPosition);
    }

    @Override // L6.e
    public final void d(int i, int i10, L6.l scrollPosition) {
        l.f(scrollPosition, "scrollPosition");
        g.k(i, i10, this, scrollPosition);
    }

    @Override // L6.e
    public final int e() {
        int iV = V();
        int i = this.f16550p;
        if (iV < i) {
            iV = i;
        }
        int[] iArr = new int[iV];
        if (iV < i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f16550p + ", array size:" + iV);
        }
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            StaggeredGridLayoutManager.f fVar = this.f16551q[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f16557w ? fVar.e(0, fVar.f16585a.size(), false, true, false) : fVar.e(r5.size() - 1, -1, false, true, false);
        }
        if (iV != 0) {
            return iArr[iV - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // L6.e
    public final void g(View view, int i, int i10, int i11, int i12) {
        super.h0(view, i, i10, i11, i12);
    }

    @Override // L6.e
    public final C0672i getBindingContext() {
        return this.f23938L;
    }

    @Override // L6.e
    public final C1322q5 getDiv() {
        return this.f23940N;
    }

    @Override // L6.e
    public final RecyclerView getView() {
        return this.f23939M;
    }

    @Override // L6.e
    public final int h() {
        int iV = V();
        int i = this.f16550p;
        if (iV < i) {
            iV = i;
        }
        int[] iArr = new int[iV];
        if (iV < i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f16550p + ", array size:" + iV);
        }
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            StaggeredGridLayoutManager.f fVar = this.f16551q[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f16557w ? fVar.e(r6.size() - 1, -1, true, true, false) : fVar.e(0, fVar.f16585a.size(), true, true, false);
        }
        if (iV != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void h0(View view, int i, int i10, int i11, int i12) {
        b(view, i, i10, i11, i12, false);
    }

    @Override // L6.e
    public final int i(View child) {
        l.f(child, "child");
        return RecyclerView.p.b0(child);
    }

    @Override // L6.e
    public final int j() {
        int iV = V();
        int i = this.f16550p;
        if (iV < i) {
            iV = i;
        }
        int[] iArr = new int[iV];
        if (iV < i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f16550p + ", array size:" + iV);
        }
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            StaggeredGridLayoutManager.f fVar = this.f16551q[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f16557w ? fVar.e(r6.size() - 1, -1, false, true, false) : fVar.e(0, fVar.f16585a.size(), false, true, false);
        }
        if (iV != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // L6.e
    public final int k() {
        int iV = V();
        int i = this.f16550p;
        if (iV < i) {
            iV = i;
        }
        int[] iArr = new int[iV];
        if (iV < i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f16550p + ", array size:" + iV);
        }
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            StaggeredGridLayoutManager.f fVar = this.f16551q[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f16557w ? fVar.e(0, fVar.f16585a.size(), true, true, false) : fVar.e(r5.size() - 1, -1, true, true, false);
        }
        if (iV != 0) {
            return iArr[iV - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Override // L6.e
    public final int l() {
        return this.f16510n;
    }

    @Override // L6.e
    public final /* synthetic */ void m(View view, boolean z10) {
        g.l(this, view, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void m0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void n0(RecyclerView recyclerView, RecyclerView.w recycler) {
        l.f(recycler, "recycler");
        super.n0(recyclerView, recycler);
        g.h(this, recyclerView, recycler);
    }

    @Override // L6.e
    public final int o(View view) {
        return g.m(this, view);
    }

    @Override // L6.e
    public final i7.b p(int i) {
        RecyclerView.h adapter = this.f23939M.getAdapter();
        l.d(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (i7.b) C2097r.r0(i, ((a) adapter).f3271l);
    }

    @Override // L6.e
    public final int q() {
        return this.f16554t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void u(View view, Rect outRect) {
        i7.b bVarP;
        l.f(outRect, "outRect");
        super.u(view, outRect);
        int iB0 = RecyclerView.p.b0(view);
        if (iB0 == -1 || (bVarP = p(iB0)) == null) {
            return;
        }
        S2 s2D = bVarP.f38460a.d();
        boolean z10 = s2D.getHeight() instanceof C9.a;
        boolean z11 = s2D.getWidth() instanceof C9.a;
        int iD1 = 0;
        boolean z12 = this.f16550p > 1;
        int iD12 = (z10 && z12) ? D1(1) / 2 : 0;
        if (z11 && z12) {
            iD1 = D1(0) / 2;
        }
        outRect.set(outRect.left - iD1, outRect.top - iD12, outRect.right - iD1, outRect.bottom - iD12);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void z0(RecyclerView.B b10) {
        g.i(this);
        super.z0(b10);
    }

    @Override // L6.e
    public final RecyclerView.p n() {
        return this;
    }
}
