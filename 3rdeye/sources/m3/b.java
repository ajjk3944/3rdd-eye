package M3;

import L0.I;
import L0.S;
import L0.X;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class b extends c<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4170d;

    /* renamed from: e, reason: collision with root package name */
    public int f4171e;

    /* renamed from: f, reason: collision with root package name */
    public int f4172f;

    public b() {
        this.f4169c = new Rect();
        this.f4170d = new Rect();
        this.f4171e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        AppBarLayout appBarLayoutV;
        X lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (appBarLayoutV = v(coordinatorLayout.e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size > 0) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (appBarLayoutV.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iX = x(appBarLayoutV) + size;
        int measuredHeight = appBarLayoutV.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iX -= measuredHeight;
        }
        coordinatorLayout.s(view, i, i10, View.MeasureSpec.makeMeasureSpec(iX, i12 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION));
        return true;
    }

    @Override // M3.c
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutV = v(coordinatorLayout.e(view));
        int iH = 0;
        if (appBarLayoutV == null) {
            coordinatorLayout.r(i, view);
            this.f4171e = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = appBarLayoutV.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((appBarLayoutV.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.f4169c;
        rect.set(paddingLeft, bottom, width, bottom2);
        X lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i10 = fVar.f15470c;
        if (i10 == 0) {
            i10 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f4170d;
        Gravity.apply(i10, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.f4172f != 0) {
            float fW = w(appBarLayoutV);
            int i11 = this.f4172f;
            iH = B7.d.h((int) (fW * i11), 0, i11);
        }
        view.layout(rect2.left, rect2.top - iH, rect2.right, rect2.bottom - iH);
        this.f4171e = rect2.top - appBarLayoutV.getBottom();
    }

    public abstract AppBarLayout v(ArrayList arrayList);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4169c = new Rect();
        this.f4170d = new Rect();
        this.f4171e = 0;
    }
}
