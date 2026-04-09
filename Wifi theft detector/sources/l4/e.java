package l4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23160d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f23161e;

    /* renamed from: f, reason: collision with root package name */
    public int f23162f;

    /* renamed from: g, reason: collision with root package name */
    public int f23163g;

    public e() {
        this.f23160d = new Rect();
        this.f23161e = new Rect();
        this.f23162f = 0;
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // l4.f
    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewL = L(coordinatorLayout.r(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i10);
            this.f23162f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.f23160d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f23161e;
        Gravity.apply(R(eVar.f2334c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f23162f = rect2.top - viewL.getBottom();
    }

    public abstract View L(List list);

    public final int M(View view) {
        if (this.f23163g == 0) {
            return 0;
        }
        float fN = N(view);
        int i10 = this.f23163g;
        return m0.a.b((int) (fN * i10), 0, i10);
    }

    public abstract float N(View view);

    public final int O() {
        return this.f23163g;
    }

    public int P(View view) {
        return view.getMeasuredHeight();
    }

    public final int Q() {
        return this.f23162f;
    }

    public final void S(int i10) {
        this.f23163g = i10;
    }

    public boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewL;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewL = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewL.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iP -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iP, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23160d = new Rect();
        this.f23161e = new Rect();
        this.f23162f = 0;
    }
}
