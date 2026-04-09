package gd;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import u3.h1;

/* loaded from: classes.dex */
public abstract class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9512c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9513d;

    /* renamed from: e, reason: collision with root package name */
    public int f9514e;

    /* renamed from: f, reason: collision with root package name */
    public int f9515f;

    public e() {
        this.f9512c = new Rect();
        this.f9513d = new Rect();
        this.f9514e = 0;
    }

    @Override // e3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout appBarLayoutV;
        h1 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (appBarLayoutV = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutV.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int totalScrollRange = appBarLayoutV.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutV.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.t(view, i10, i11, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i13 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // gd.f
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutV = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view));
        if (appBarLayoutV == null) {
            coordinatorLayout.s(view, i10);
            this.f9514e = 0;
            return;
        }
        e3.e eVar = (e3.e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutV.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutV.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f9512c;
        rect.set(paddingLeft, bottom, width, bottom2);
        h1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i11 = eVar.f7773c;
        if (i11 == 0) {
            i11 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f9513d;
        Gravity.apply(i11, measuredWidth, measuredHeight, rect, rect2, i10);
        int iU = u(appBarLayoutV);
        view.layout(rect2.left, rect2.top - iU, rect2.right, rect2.bottom - iU);
        this.f9514e = rect2.top - appBarLayoutV.getBottom();
    }

    public final int u(View view) {
        int i10;
        if (this.f9515f == 0) {
            return 0;
        }
        float f10 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            e3.b bVar = ((e3.e) appBarLayout.getLayoutParams()).f7771a;
            int iU = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).u() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iU > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f10 = (iU / i10) + 1.0f;
            }
        }
        int i11 = this.f9515f;
        return dr.a.g((int) (f10 * i11), 0, i11);
    }

    public e(int i10) {
        super(0);
        this.f9512c = new Rect();
        this.f9513d = new Rect();
        this.f9514e = 0;
    }
}
