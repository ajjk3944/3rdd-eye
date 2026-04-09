package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n00 extends s61 {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public n00() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // defpackage.vj
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutZ;
        o91 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
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
        coordinatorLayout.s(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.s61
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view));
        if (appBarLayoutZ == null) {
            coordinatorLayout.r(view, i);
            this.e = 0;
            return;
        }
        yj yjVar = (yj) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) yjVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) yjVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) yjVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) yjVar).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        o91 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i2 = yjVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iY = y(appBarLayoutZ);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.e = rect2.top - appBarLayoutZ.getBottom();
    }

    public final int y(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            vj vjVar = ((yj) appBarLayout.getLayoutParams()).a;
            int iY = vjVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) vjVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iY > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iY / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return bd2.h((int) (f * i2), 0, i2);
    }

    public n00(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
