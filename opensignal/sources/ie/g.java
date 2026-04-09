package ie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import xd.l;

/* loaded from: classes.dex */
public final class g extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f11346g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f11347a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabLayout f11348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabLayout tabLayout, Context context) {
        super(context);
        this.f11348d = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f11348d;
        if (tabLayout.f5735t0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i10);
            io.sentry.hints.i iVar = tabLayout.f5722h0;
            Drawable drawable = tabLayout.K;
            iVar.getClass();
            RectF rectFK = io.sentry.hints.i.K(tabLayout, childAt);
            drawable.setBounds((int) rectFK.left, drawable.getBounds().top, (int) rectFK.right, drawable.getBounds().bottom);
            tabLayout.f5712a = i10;
        }
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f11348d;
        Rect bounds = tabLayout.K.getBounds();
        tabLayout.K.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        TabLayout tabLayout = this.f11348d;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.K;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.K.getBounds().bottom);
        } else {
            tabLayout.f5722h0.T(tabLayout, view, view2, f10, tabLayout.K);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i10, boolean z10, int i11) {
        TabLayout tabLayout = this.f11348d;
        if (tabLayout.f5712a == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f5712a = i10;
        f fVar = new f(this, childAt, childAt2);
        if (!z10) {
            this.f11347a.removeAllUpdateListeners();
            this.f11347a.addUpdateListener(fVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11347a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f5723i0);
        valueAnimator.setDuration(i11);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f11348d;
        int iHeight = tabLayout.K.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.K.getIntrinsicHeight();
        }
        int i10 = tabLayout.f5713a0;
        if (i10 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i10 != 1) {
            height = 0;
            if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.K.getBounds().width() > 0) {
            Rect bounds = tabLayout.K.getBounds();
            tabLayout.K.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.K.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f11347a;
        TabLayout tabLayout = this.f11348d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), false, -1);
            return;
        }
        if (tabLayout.f5712a == -1) {
            tabLayout.f5712a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f5712a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f11348d;
        boolean z10 = true;
        if (tabLayout.V == 1 || tabLayout.f5714b0 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) l.b(getContext(), 16)) * 2)) {
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                tabLayout.V = 0;
                tabLayout.j(false);
            }
            if (z10) {
                super.onMeasure(i10, i11);
            }
        }
    }
}
