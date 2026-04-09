package L3;

import G3.C0152f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class f extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2577c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f2579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f2579b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.f2579b;
        if (tabLayout.f18479e0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            C0152f c0152f = tabLayout.f18470W;
            Drawable drawable = tabLayout.f18451C;
            c0152f.getClass();
            RectF rectFB = C0152f.b(tabLayout, childAt);
            drawable.setBounds((int) rectFB.left, drawable.getBounds().top, (int) rectFB.right, drawable.getBounds().bottom);
            tabLayout.f18471a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.f2579b;
        Rect bounds = tabLayout.f18451C.getBounds();
        tabLayout.f18451C.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f2) {
        TabLayout tabLayout = this.f2579b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f18451C;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f18451C.getBounds().bottom);
        } else {
            tabLayout.f18470W.t(tabLayout, view, view2, f2, tabLayout.f18451C);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i3, boolean z6) {
        TabLayout tabLayout = this.f2579b;
        if (tabLayout.f18471a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f18471a = i;
        e eVar = new e(this, childAt, childAt2);
        if (!z6) {
            this.f2578a.removeAllUpdateListeners();
            this.f2578a.addUpdateListener(eVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2578a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f18472a0);
        valueAnimator.setDuration(i3);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f2579b;
        int iHeight = tabLayout.f18451C.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f18451C.getIntrinsicHeight();
        }
        int i = tabLayout.f18463P;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f18451C.getBounds().width() > 0) {
            Rect bounds = tabLayout.f18451C.getBounds();
            tabLayout.f18451C.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f18451C.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        ValueAnimator valueAnimator = this.f2578a;
        TabLayout tabLayout = this.f2579b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f18471a == -1) {
            tabLayout.f18471a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f18471a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f2579b;
        boolean z6 = true;
        if (tabLayout.f18461N == 1 || tabLayout.f18464Q == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC2993B.e(getContext(), 16)) * 2)) {
                boolean z7 = false;
                for (int i7 = 0; i7 < childCount; i7++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i7).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z7 = true;
                    }
                }
                z6 = z7;
            } else {
                tabLayout.f18461N = 0;
                tabLayout.i(false);
            }
            if (z6) {
                super.onMeasure(i, i3);
            }
        }
    }
}
