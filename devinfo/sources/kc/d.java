package kc;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import e4.c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f28134c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f28135d;

    /* renamed from: e, reason: collision with root package name */
    public int f28136e;

    /* renamed from: f, reason: collision with root package name */
    public int f28137f;

    public d() {
        this.f28134c = new Rect();
        this.f28135d = new Rect();
        this.f28136e = 0;
    }

    @Override // p3.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11) {
        AppBarLayout appBarLayoutZ;
        c2 lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = appBarLayoutZ.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.s(i4, i10, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i12 == -1 ? 1073741824 : LinearLayoutManager.INVALID_OFFSET), view);
        return true;
    }

    @Override // kc.e
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        AppBarLayout appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view));
        if (appBarLayoutZ == null) {
            coordinatorLayout.r(i4, view);
            this.f28136e = 0;
            return;
        }
        p3.e eVar = (p3.e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f28134c;
        rect.set(paddingLeft, bottom, width, bottom2);
        c2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i10 = eVar.f31149c;
        if (i10 == 0) {
            i10 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f28135d;
        Gravity.apply(i10, measuredWidth, measuredHeight, rect, rect2, i4);
        int iY = y(appBarLayoutZ);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.f28136e = rect2.top - appBarLayoutZ.getBottom();
    }

    public final int y(View view) {
        int i4;
        if (this.f28137f == 0) {
            return 0;
        }
        float f10 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            p3.b bVar = ((p3.e) appBarLayout.getLayoutParams()).f31147a;
            int iY = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iY > downNestedPreScrollRange) && (i4 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f10 = (iY / i4) + 1.0f;
            }
        }
        int i10 = this.f28137f;
        return com.bumptech.glide.d.i((int) (f10 * i10), 0, i10);
    }

    public d(int i4) {
        super(0);
        this.f28134c = new Rect();
        this.f28135d = new Rect();
        this.f28136e = 0;
    }
}
