package jd;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27504c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f27505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f27506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabLayout tabLayout, Context context) {
        super(context);
        this.f27506b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i4) {
        TabLayout tabLayout = this.f27506b;
        if (tabLayout.U == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i4);
            j6.i iVar = tabLayout.I;
            Drawable drawable = tabLayout.f20582o;
            iVar.getClass();
            RectF rectFI = j6.i.i(tabLayout, childAt);
            drawable.setBounds((int) rectFI.left, drawable.getBounds().top, (int) rectFI.right, drawable.getBounds().bottom);
            tabLayout.f20570a = i4;
        }
    }

    public final void b(int i4) {
        TabLayout tabLayout = this.f27506b;
        Rect bounds = tabLayout.f20582o.getBounds();
        tabLayout.f20582o.setBounds(bounds.left, 0, bounds.right, i4);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        TabLayout tabLayout = this.f27506b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f20582o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f20582o.getBounds().bottom);
        } else {
            tabLayout.I.s(tabLayout, view, view2, f10, tabLayout.f20582o);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i4, int i10, boolean z3) {
        TabLayout tabLayout = this.f27506b;
        if (tabLayout.f20570a == i4) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i4);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f20570a = i4;
        f fVar = new f(this, childAt, childAt2);
        if (!z3) {
            this.f27505a.removeAllUpdateListeners();
            this.f27505a.addUpdateListener(fVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f27505a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.J);
        valueAnimator.setDuration(i10);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f27506b;
        int iHeight = tabLayout.f20582o.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f20582o.getIntrinsicHeight();
        }
        int i4 = tabLayout.B;
        if (i4 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i4 != 1) {
            height = 0;
            if (i4 != 2) {
                iHeight = i4 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f20582o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f20582o.getBounds();
            tabLayout.f20582o.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f20582o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        ValueAnimator valueAnimator = this.f27505a;
        TabLayout tabLayout = this.f27506b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f20570a == -1) {
            tabLayout.f20570a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f20570a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f27506b;
        boolean z3 = true;
        if (tabLayout.f20593z == 1 || tabLayout.C == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) m.d(16, getContext())) * 2)) {
                boolean z10 = false;
                for (int i12 = 0; i12 < childCount; i12++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z10 = true;
                    }
                }
                z3 = z10;
            } else {
                tabLayout.f20593z = 0;
                tabLayout.l(false);
            }
            if (z3) {
                super.onMeasure(i4, i10);
            }
        }
    }
}
