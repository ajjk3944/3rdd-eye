package com.google.android.material.appbar;

import F1.AbstractC2771s;
import F1.C2780w0;
import F1.W;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import org.snmp4j.mp.PduHandle;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
abstract class b extends c {

    /* renamed from: d, reason: collision with root package name */
    final Rect f36981d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f36982e;

    /* renamed from: f, reason: collision with root package name */
    private int f36983f;

    /* renamed from: g, reason: collision with root package name */
    private int f36984g;

    public b() {
        this.f36981d = new Rect();
        this.f36982e = new Rect();
        this.f36983f = 0;
    }

    private static int L(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.c
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewG = G(coordinatorLayout.q(view));
        if (viewG == null) {
            super.F(coordinatorLayout, view, i10);
            this.f36983f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.f36981d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, viewG.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + viewG.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        C2780w0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && W.w(coordinatorLayout) && !W.w(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f36982e;
        AbstractC2771s.a(L(eVar.f30642c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iH = H(viewG);
        view.layout(rect2.left, rect2.top - iH, rect2.right, rect2.bottom - iH);
        this.f36983f = rect2.top - viewG.getBottom();
    }

    abstract View G(List list);

    final int H(View view) {
        if (this.f36984g == 0) {
            return 0;
        }
        float fI = I(view);
        int i10 = this.f36984g;
        return AbstractC8707a.b((int) (fI * i10), 0, i10);
    }

    abstract float I(View view);

    int J(View view) {
        return view.getMeasuredHeight();
    }

    final int K() {
        return this.f36983f;
    }

    public final void M(int i10) {
        this.f36984g = i10;
    }

    protected boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewG;
        C2780w0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewG = G(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (W.w(viewG) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iJ = size + J(viewG);
        int measuredHeight = viewG.getMeasuredHeight();
        if (N()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iJ -= measuredHeight;
        }
        coordinatorLayout.H(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iJ, i14 == -1 ? 1073741824 : PduHandle.NONE), i13);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36981d = new Rect();
        this.f36982e = new Rect();
        this.f36983f = 0;
    }
}
