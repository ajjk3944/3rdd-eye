package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.k0;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import j4.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s0.x;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: a0, reason: collision with root package name */
    public static final int f11184a0 = k.Widget_Design_TabLayout;

    /* renamed from: b0, reason: collision with root package name */
    public static final r0.f f11185b0 = new r0.h(16);
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public com.google.android.material.tabs.a J;
    public final TimeInterpolator K;
    public c L;
    public final ArrayList M;
    public c N;
    public ValueAnimator O;
    public ViewPager P;
    public PagerAdapter Q;
    public DataSetObserver R;
    public h S;
    public b T;
    public boolean U;
    public int V;
    public final r0.f W;

    /* renamed from: a, reason: collision with root package name */
    public int f11186a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11187b;

    /* renamed from: c, reason: collision with root package name */
    public g f11188c;

    /* renamed from: d, reason: collision with root package name */
    public final f f11189d;

    /* renamed from: e, reason: collision with root package name */
    public int f11190e;

    /* renamed from: f, reason: collision with root package name */
    public int f11191f;

    /* renamed from: g, reason: collision with root package name */
    public int f11192g;

    /* renamed from: h, reason: collision with root package name */
    public int f11193h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11194i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11195j;

    /* renamed from: k, reason: collision with root package name */
    public int f11196k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f11197l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f11198m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f11199n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f11200o;

    /* renamed from: p, reason: collision with root package name */
    public int f11201p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f11202q;

    /* renamed from: r, reason: collision with root package name */
    public float f11203r;

    /* renamed from: s, reason: collision with root package name */
    public float f11204s;

    /* renamed from: t, reason: collision with root package name */
    public float f11205t;

    /* renamed from: u, reason: collision with root package name */
    public final int f11206u;

    /* renamed from: v, reason: collision with root package name */
    public int f11207v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11208w;

    /* renamed from: x, reason: collision with root package name */
    public final int f11209x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11210y;

    /* renamed from: z, reason: collision with root package name */
    public int f11211z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorGravity {
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11213a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.M(pagerAdapter2, this.f11213a);
            }
        }

        public void b(boolean z10) {
            this.f11213a = z10;
        }
    }

    public interface c {
        void d(g gVar);

        void f(g gVar);

        void i(g gVar);
    }

    public interface d extends c {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.F();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator f11216a;

        /* renamed from: b, reason: collision with root package name */
        public int f11217b;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f11219a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f11220b;

            public a(View view, View view2) {
                this.f11219a = view;
                this.f11220b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.f11219a, this.f11220b, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            this.f11217b = -1;
            setWillNotDraw(false);
        }

        public void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f11216a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f11186a != i10) {
                this.f11216a.cancel();
            }
            k(true, i10, i11);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f11200o.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f11200o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.C;
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
            if (TabLayout.this.f11200o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f11200o.getBounds();
                TabLayout.this.f11200o.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f11200o.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f11186a == -1) {
                tabLayout.f11186a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f11186a);
        }

        public final void f(int i10) {
            if (TabLayout.this.V == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.a aVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                aVar.c(tabLayout, childAt, tabLayout.f11200o);
                TabLayout.this.f11186a = i10;
            }
        }

        public final void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        public void h(int i10, float f10) {
            TabLayout.this.f11186a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f11216a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11216a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        public void i(int i10) {
            Rect bounds = TabLayout.this.f11200o.getBounds();
            TabLayout.this.f11200o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f11200o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f11200o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f10, tabLayout.f11200o);
            }
            postInvalidateOnAnimation();
        }

        public final void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f11186a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f11186a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f11216a.removeAllUpdateListeners();
                this.f11216a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11216a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.K);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f11216a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
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
                if (iMax * childCount <= getMeasuredWidth() - (((int) d0.g(getContext(), 16)) * 2)) {
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
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.A = 0;
                    tabLayout2.U(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public Object f11222a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f11223b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f11224c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f11225d;

        /* renamed from: f, reason: collision with root package name */
        public View f11227f;

        /* renamed from: h, reason: collision with root package name */
        public TabLayout f11229h;

        /* renamed from: i, reason: collision with root package name */
        public i f11230i;

        /* renamed from: e, reason: collision with root package name */
        public int f11226e = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f11228g = 1;

        /* renamed from: j, reason: collision with root package name */
        public int f11231j = -1;

        public View e() {
            return this.f11227f;
        }

        public Drawable f() {
            return this.f11223b;
        }

        public int g() {
            return this.f11226e;
        }

        public int h() {
            return this.f11228g;
        }

        public CharSequence i() {
            return this.f11224c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f11229h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f11226e;
        }

        public void k() {
            this.f11229h = null;
            this.f11230i = null;
            this.f11222a = null;
            this.f11223b = null;
            this.f11231j = -1;
            this.f11224c = null;
            this.f11225d = null;
            this.f11226e = -1;
            this.f11227f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f11229h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.K(this);
        }

        public g m(CharSequence charSequence) {
            this.f11225d = charSequence;
            s();
            return this;
        }

        public g n(int i10) {
            return o(LayoutInflater.from(this.f11230i.getContext()).inflate(i10, (ViewGroup) this.f11230i, false));
        }

        public g o(View view) {
            this.f11227f = view;
            s();
            return this;
        }

        public g p(Drawable drawable) {
            this.f11223b = drawable;
            TabLayout tabLayout = this.f11229h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.U(true);
            }
            s();
            return this;
        }

        public void q(int i10) {
            this.f11226e = i10;
        }

        public g r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f11225d) && !TextUtils.isEmpty(charSequence)) {
                this.f11230i.setContentDescription(charSequence);
            }
            this.f11224c = charSequence;
            s();
            return this;
        }

        public void s() {
            i iVar = this.f11230i;
            if (iVar != null) {
                iVar.p();
            }
        }
    }

    public static class h implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f11232a;

        /* renamed from: b, reason: collision with root package name */
        public int f11233b;

        /* renamed from: c, reason: collision with root package name */
        public int f11234c;

        public h(TabLayout tabLayout) {
            this.f11232a = new WeakReference(tabLayout);
        }

        public void a() {
            this.f11234c = 0;
            this.f11233b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f11233b = this.f11234c;
            this.f11234c = i10;
            TabLayout tabLayout = (TabLayout) this.f11232a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f11234c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            TabLayout tabLayout = (TabLayout) this.f11232a.get();
            if (tabLayout != null) {
                int i12 = this.f11234c;
                boolean z11 = true;
                if (i12 != 2 || this.f11233b == 1) {
                    z10 = true;
                } else {
                    z10 = true;
                    z11 = false;
                }
                if (i12 == 2 && this.f11233b == 0) {
                    z10 = false;
                }
                tabLayout.P(i10, f10, z11, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f11232a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f11234c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f11233b == 0));
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public g f11235a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f11236b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f11237c;

        /* renamed from: d, reason: collision with root package name */
        public View f11238d;

        /* renamed from: e, reason: collision with root package name */
        public BadgeDrawable f11239e;

        /* renamed from: f, reason: collision with root package name */
        public View f11240f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f11241g;

        /* renamed from: h, reason: collision with root package name */
        public ImageView f11242h;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f11243i;

        /* renamed from: j, reason: collision with root package name */
        public int f11244j;

        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f11246a;

            public a(View view) {
                this.f11246a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f11246a.getVisibility() == 0) {
                    i.this.o(this.f11246a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f11244j = 2;
            q(context);
            setPaddingRelative(TabLayout.this.f11190e, TabLayout.this.f11191f, TabLayout.this.f11192g, TabLayout.this.f11193h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            ViewCompat.u0(this, k0.b(getContext(), 1002));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f11239e;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f11239e == null) {
                this.f11239e = BadgeDrawable.e(getContext());
            }
            n();
            BadgeDrawable badgeDrawable = this.f11239e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f11243i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f11243i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        public final void f(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        public final void g(Canvas canvas) {
            Drawable drawable = this.f11243i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f11243i.draw(canvas);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f11236b, this.f11237c, this.f11240f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f11236b, this.f11237c, this.f11240f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public g getTab() {
            return this.f11235a;
        }

        public final boolean h() {
            return this.f11239e != null;
        }

        public final void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(j4.h.design_layout_tab_icon, (ViewGroup) this, false);
            this.f11237c = imageView;
            addView(imageView, 0);
        }

        public final void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(j4.h.design_layout_tab_text, (ViewGroup) this, false);
            this.f11236b = textView;
            addView(textView);
        }

        public void k() {
            setTab(null);
            setSelected(false);
        }

        public final void l(View view) {
            if (h() && view != null) {
                f(false);
                com.google.android.material.badge.a.a(this.f11239e, view, null);
                this.f11238d = view;
            }
        }

        public final void m() {
            if (h()) {
                f(true);
                View view = this.f11238d;
                if (view != null) {
                    com.google.android.material.badge.a.b(this.f11239e, view);
                    this.f11238d = null;
                }
            }
        }

        public final void n() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.f11240f != null) {
                    m();
                    return;
                }
                if (this.f11237c != null && (gVar2 = this.f11235a) != null && gVar2.f() != null) {
                    View view = this.f11238d;
                    ImageView imageView = this.f11237c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.f11237c);
                        return;
                    }
                }
                if (this.f11236b == null || (gVar = this.f11235a) == null || gVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.f11238d;
                TextView textView = this.f11236b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.f11236b);
                }
            }
        }

        public final void o(View view) {
            if (h() && view == this.f11238d) {
                com.google.android.material.badge.a.c(this.f11239e, view, null);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            x xVarR0 = x.R0(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f11239e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                xVarR0.q0(this.f11239e.i());
            }
            xVarR0.p0(x.f.a(0, 1, this.f11235a.g(), 1, false, isSelected()));
            if (isSelected()) {
                xVarR0.n0(false);
                xVarR0.e0(x.a.f24200i);
            }
            xVarR0.F0(getResources().getString(j4.j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f11207v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f11236b != null) {
                float f10 = TabLayout.this.f11203r;
                if (isSelected() && TabLayout.this.f11196k != -1) {
                    f10 = TabLayout.this.f11204s;
                }
                int i12 = this.f11244j;
                ImageView imageView = this.f11237c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f11236b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f11205t;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f11236b.getTextSize();
                int lineCount = this.f11236b.getLineCount();
                int maxLines = this.f11236b.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (TabLayout.this.D != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f11236b.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f11236b.setTextSize(0, f10);
                        this.f11236b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        public final void p() {
            s();
            g gVar = this.f11235a;
            setSelected(gVar != null && gVar.j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f11235a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f11235a.l();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$i] */
        public final void q(Context context) {
            int i10 = TabLayout.this.f11206u;
            if (i10 != 0) {
                Drawable drawableB = d.a.b(context, i10);
                this.f11243i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f11243i.setState(getDrawableState());
                }
            } else {
                this.f11243i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f11199n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = e5.a.a(TabLayout.this.f11199n);
                boolean z10 = TabLayout.this.I;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
        }

        public final void r() {
            setOrientation(!TabLayout.this.E ? 1 : 0);
            TextView textView = this.f11241g;
            if (textView == null && this.f11242h == null) {
                t(this.f11236b, this.f11237c, true);
            } else {
                t(textView, this.f11242h, false);
            }
        }

        public final void s() {
            ViewParent parent;
            g gVar = this.f11235a;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f11240f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f11240f);
                    }
                    addView(viewE);
                }
                this.f11240f = viewE;
                TextView textView = this.f11236b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f11237c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f11237c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f11241g = textView2;
                if (textView2 != null) {
                    this.f11244j = textView2.getMaxLines();
                }
                this.f11242h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f11240f;
                if (view2 != null) {
                    removeView(view2);
                    this.f11240f = null;
                }
                this.f11241g = null;
                this.f11242h = null;
            }
            if (this.f11240f == null) {
                if (this.f11237c == null) {
                    i();
                }
                if (this.f11236b == null) {
                    j();
                    this.f11244j = this.f11236b.getMaxLines();
                }
                TextViewCompat.m(this.f11236b, TabLayout.this.f11194i);
                if (!isSelected() || TabLayout.this.f11196k == -1) {
                    TextViewCompat.m(this.f11236b, TabLayout.this.f11195j);
                } else {
                    TextViewCompat.m(this.f11236b, TabLayout.this.f11196k);
                }
                ColorStateList colorStateList = TabLayout.this.f11197l;
                if (colorStateList != null) {
                    this.f11236b.setTextColor(colorStateList);
                }
                t(this.f11236b, this.f11237c, true);
                n();
                d(this.f11237c);
                d(this.f11236b);
            } else {
                TextView textView3 = this.f11241g;
                if (textView3 != null || this.f11242h != null) {
                    t(textView3, this.f11242h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f11225d)) {
                return;
            }
            setContentDescription(gVar.f11225d);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f11236b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f11237c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f11240f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(@Nullable g gVar) {
            if (gVar != this.f11235a) {
                this.f11235a = gVar;
                p();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void t(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r7.f11235a
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$g r0 = r7.f11235a
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = k0.a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f11198m
                r0.setTintList(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f11202q
                if (r2 == 0) goto L2d
                r0.setTintMode(r2)
            L2d:
                com.google.android.material.tabs.TabLayout$g r2 = r7.f11235a
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.i()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L77
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$g r5 = r7.f11235a
                int r5 = com.google.android.material.tabs.TabLayout.g.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = r4
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = r4
                goto L6e
            L6d:
                r5 = r3
            L6e:
                r8.setVisibility(r5)
                if (r0 != 0) goto L78
                r7.setVisibility(r4)
                goto L78
            L77:
                r6 = r4
            L78:
                if (r10 == 0) goto Lbc
                if (r9 == 0) goto Lbc
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L94
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L94
                android.content.Context r10 = r7.getContext()
                float r10 = com.google.android.material.internal.d0.g(r10, r3)
                int r10 = (int) r10
                goto L95
            L94:
                r10 = r4
            L95:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.E
                if (r3 == 0) goto Lad
                int r3 = r8.getMarginEnd()
                if (r10 == r3) goto Lbc
                r8.setMarginEnd(r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbc
            Lad:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbc
                r8.bottomMargin = r10
                r8.setMarginEnd(r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbc:
                com.google.android.material.tabs.TabLayout$g r8 = r7.f11235a
                if (r8 == 0) goto Lc4
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.g.c(r8)
            Lc4:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 23
                if (r8 <= r9) goto Ld1
                if (r0 != 0) goto Lcd
                goto Lce
            Lcd:
                r2 = r1
            Lce:
                androidx.appcompat.widget.e1.a(r7, r2)
            Ld1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.t(android.widget.TextView, android.widget.ImageView, boolean):void");
        }
    }

    public static class j implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f11248a;

        public j(ViewPager viewPager) {
            this.f11248a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void d(g gVar) throws Resources.NotFoundException {
            this.f11248a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void f(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void i(g gVar) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f11187b.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f11187b.get(i10);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f11208w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.D;
        if (i11 == 0 || i11 == 2) {
            return this.f11210y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f11189d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f11189d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f11189d.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof i) {
                        ((i) childAt).s();
                    }
                }
                i11++;
            }
        }
    }

    public static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    public final void A() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    public g B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (g) this.f11187b.get(i10);
    }

    public final boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public boolean D() {
        return this.F;
    }

    public g E() {
        g gVarV = v();
        gVarV.f11229h = this;
        gVarV.f11230i = w(gVarV);
        if (gVarV.f11231j != -1) {
            gVarV.f11230i.setId(gVarV.f11231j);
        }
        return gVarV;
    }

    public void F() {
        int currentItem;
        H();
        PagerAdapter pagerAdapter = this.Q;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                k(E().r(this.Q.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            K(B(currentItem));
        }
    }

    public boolean G(g gVar) {
        return f11185b0.a(gVar);
    }

    public void H() {
        for (int childCount = this.f11189d.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator it = this.f11187b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.k();
            G(gVar);
        }
        this.f11188c = null;
    }

    public void I(c cVar) {
        this.M.remove(cVar);
    }

    public final void J(int i10) {
        i iVar = (i) this.f11189d.getChildAt(i10);
        this.f11189d.removeViewAt(i10);
        if (iVar != null) {
            iVar.k();
            this.W.a(iVar);
        }
        requestLayout();
    }

    public void K(g gVar) {
        L(gVar, true);
    }

    public void L(g gVar, boolean z10) {
        g gVar2 = this.f11188c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                x(gVar);
                o(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                N(iG, 0.0f, true);
            } else {
                o(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f11188c = gVar;
        if (gVar2 != null && gVar2.f11229h != null) {
            z(gVar2);
        }
        if (gVar != null) {
            y(gVar);
        }
    }

    public void M(PagerAdapter pagerAdapter, boolean z10) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.Q;
        if (pagerAdapter2 != null && (dataSetObserver = this.R) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.Q = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.R == null) {
                this.R = new e();
            }
            pagerAdapter.registerDataSetObserver(this.R);
        }
        F();
    }

    public void N(int i10, float f10, boolean z10) {
        O(i10, f10, z10, true);
    }

    public void O(int i10, float f10, boolean z10, boolean z11) {
        P(i10, f10, z10, z11, true);
    }

    public void P(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f11189d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f11189d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int iR = r(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iR >= scrollX) || (i10 > getSelectedTabPosition() && iR <= scrollX) || i10 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z13 = (i10 < getSelectedTabPosition() && iR <= scrollX) || (i10 > getSelectedTabPosition() && iR >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.V == 1 || z12) {
            if (i10 < 0) {
                iR = 0;
            }
            scrollTo(iR, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    public void Q(ViewPager viewPager, boolean z10) {
        R(viewPager, z10, false);
    }

    public final void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            h hVar = this.S;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            I(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new h(this);
            }
            this.S.a();
            viewPager.addOnPageChangeListener(this.S);
            j jVar = new j(viewPager);
            this.N = jVar;
            g(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                M(adapter, z10);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.b(z10);
            viewPager.addOnAdapterChangeListener(this.T);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            M(null, false);
        }
        this.U = z11;
    }

    public final void S() {
        int size = this.f11187b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f11187b.get(i10)).s();
        }
    }

    public final void T(LinearLayout.LayoutParams layoutParams) {
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void U(boolean z10) {
        for (int i10 = 0; i10 < this.f11189d.getChildCount(); i10++) {
            View childAt = this.f11189d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            T((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void V(int i10) {
        this.V = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    public void g(c cVar) {
        if (this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f11188c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f11187b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f11198m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.f11207v;
    }

    public int getTabMode() {
        return this.D;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f11199n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f11200o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f11197l;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(g gVar) {
        k(gVar, this.f11187b.isEmpty());
    }

    public void j(g gVar, int i10, boolean z10) {
        if (gVar.f11229h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(gVar, i10);
        m(gVar);
        if (z10) {
            gVar.l();
        }
    }

    public void k(g gVar, boolean z10) {
        j(gVar, this.f11187b.size(), z10);
    }

    public final void l(j5.c cVar) {
        g gVarE = E();
        CharSequence charSequence = cVar.f21754a;
        if (charSequence != null) {
            gVarE.r(charSequence);
        }
        Drawable drawable = cVar.f21755b;
        if (drawable != null) {
            gVarE.p(drawable);
        }
        int i10 = cVar.f21756c;
        if (i10 != 0) {
            gVarE.n(i10);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            gVarE.m(cVar.getContentDescription());
        }
        i(gVarE);
    }

    public final void m(g gVar) {
        i iVar = gVar.f11230i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f11189d.addView(iVar, gVar.g(), u());
    }

    public final void n(View view) {
        if (!(view instanceof j5.c)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        l((j5.c) view);
    }

    public final void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f11189d.d()) {
            N(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iR = r(i10, 0.0f);
        if (scrollX != iR) {
            A();
            this.O.setIntValues(scrollX, iR);
            this.O.start();
        }
        this.f11189d.c(i10, this.B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5.h.e(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f11189d.getChildCount(); i10++) {
            View childAt = this.f11189d.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.R0(accessibilityNodeInfo).o0(x.e.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.d0.g(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f11209x
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.d0.g(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f11207v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.D
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f11189d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f11189d.setGravity(8388611);
    }

    public final void q() {
        int i10 = this.D;
        this.f11189d.setPaddingRelative((i10 == 0 || i10 == 2) ? Math.max(0, this.f11211z - this.f11190e) : 0, 0, 0, 0);
        int i11 = this.D;
        if (i11 == 0) {
            p(this.A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f11189d.setGravity(1);
        }
        U(true);
    }

    public final int r(int i10, float f10) {
        View childAt;
        int i11 = this.D;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f11189d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f11189d.getChildCount() ? this.f11189d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void s(g gVar, int i10) {
        gVar.q(i10);
        this.f11187b.add(i10, gVar);
        int size = this.f11187b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((g) this.f11187b.get(i12)).g() == this.f11186a) {
                i11 = i12;
            }
            ((g) this.f11187b.get(i12)).q(i12);
        }
        this.f11186a = i11;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g5.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            for (int i10 = 0; i10 < this.f11189d.getChildCount(); i10++) {
                View childAt = this.f11189d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).r();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(@BoolRes int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = k0.a.r(drawable).mutate();
        this.f11200o = drawableMutate;
        w4.d.k(drawableMutate, this.f11201p);
        int intrinsicHeight = this.G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f11200o.getIntrinsicHeight();
        }
        this.f11189d.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i10) {
        this.f11201p = i10;
        w4.d.k(this.f11200o, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.C != i10) {
            this.C = i10;
            this.f11189d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.G = i10;
        this.f11189d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.A != i10) {
            this.A = i10;
            q();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f11198m != colorStateList) {
            this.f11198m = colorStateList;
            S();
        }
    }

    public void setTabIconTintResource(@ColorRes int i10) {
        setTabIconTint(d.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.H = i10;
        if (i10 == 0) {
            this.J = new com.google.android.material.tabs.a();
            return;
        }
        if (i10 == 1) {
            this.J = new j5.a();
        } else {
            if (i10 == 2) {
                this.J = new j5.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.F = z10;
        this.f11189d.g();
        this.f11189d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            q();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f11199n != colorStateList) {
            this.f11199n = colorStateList;
            for (int i10 = 0; i10 < this.f11189d.getChildCount(); i10++) {
                View childAt = this.f11189d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i10) {
        setTabRippleColor(d.a.a(getContext(), i10));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f11197l != colorStateList) {
            this.f11197l = colorStateList;
            S();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        M(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            for (int i10 = 0; i10 < this.f11189d.getChildCount(); i10++) {
                View childAt = this.f11189d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        Q(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        T(layoutParams);
        return layoutParams;
    }

    public g v() {
        g gVar = (g) f11185b0.b();
        return gVar == null ? new g() : gVar;
    }

    public final i w(g gVar) {
        r0.f fVar = this.W;
        i iVar = fVar != null ? (i) fVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f11225d)) {
            iVar.setContentDescription(gVar.f11224c);
            return iVar;
        }
        iVar.setContentDescription(gVar.f11225d);
        return iVar;
    }

    public final void x(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).i(gVar);
        }
    }

    public final void y(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).d(gVar);
        }
    }

    public final void z(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).f(gVar);
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f11184a0;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f11186a = -1;
        this.f11187b = new ArrayList();
        this.f11196k = -1;
        this.f11201p = 0;
        this.f11207v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList();
        this.W = new r0.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f11189d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = l.TabLayout;
        int i12 = l.TabLayout_tabTextAppearance;
        TypedArray typedArrayI = a0.i(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListF = w4.d.f(getBackground());
        if (colorStateListF != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.i0(colorStateListF);
            materialShapeDrawable.W(context2);
            materialShapeDrawable.h0(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(d5.c.d(context2, typedArrayI, l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayI.getColor(l.TabLayout_tabIndicatorColor, 0));
        fVar.i(typedArrayI.getDimensionPixelSize(l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(l.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(l.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.TabLayout_tabPadding, 0);
        this.f11193h = dimensionPixelSize;
        this.f11192g = dimensionPixelSize;
        this.f11191f = dimensionPixelSize;
        this.f11190e = dimensionPixelSize;
        this.f11190e = typedArrayI.getDimensionPixelSize(l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f11191f = typedArrayI.getDimensionPixelSize(l.TabLayout_tabPaddingTop, this.f11191f);
        this.f11192g = typedArrayI.getDimensionPixelSize(l.TabLayout_tabPaddingEnd, this.f11192g);
        this.f11193h = typedArrayI.getDimensionPixelSize(l.TabLayout_tabPaddingBottom, this.f11193h);
        if (a0.g(context2)) {
            this.f11194i = j4.b.textAppearanceTitleSmall;
        } else {
            this.f11194i = j4.b.textAppearanceButton;
        }
        int resourceId = typedArrayI.getResourceId(i12, k.TextAppearance_Design_Tab);
        this.f11195j = resourceId;
        int[] iArr2 = c.j.TextAppearance;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = c.j.TextAppearance_android_textSize;
            this.f11203r = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = c.j.TextAppearance_android_textColor;
            this.f11197l = d5.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = l.TabLayout_tabSelectedTextAppearance;
            if (typedArrayI.hasValue(i15)) {
                this.f11196k = typedArrayI.getResourceId(i15, resourceId);
            }
            int i16 = this.f11196k;
            if (i16 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f11204s = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, (int) this.f11203r);
                    ColorStateList colorStateListA = d5.c.a(context2, typedArrayObtainStyledAttributes, i14);
                    if (colorStateListA != null) {
                        this.f11197l = t(this.f11197l.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i17 = l.TabLayout_tabTextColor;
            if (typedArrayI.hasValue(i17)) {
                this.f11197l = d5.c.a(context2, typedArrayI, i17);
            }
            int i18 = l.TabLayout_tabSelectedTextColor;
            if (typedArrayI.hasValue(i18)) {
                this.f11197l = t(this.f11197l.getDefaultColor(), typedArrayI.getColor(i18, 0));
            }
            this.f11198m = d5.c.a(context2, typedArrayI, l.TabLayout_tabIconTint);
            this.f11202q = d0.m(typedArrayI.getInt(l.TabLayout_tabIconTintMode, -1), null);
            this.f11199n = d5.c.a(context2, typedArrayI, l.TabLayout_tabRippleColor);
            this.B = typedArrayI.getInt(l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.K = b5.k.g(context2, j4.b.motionEasingEmphasizedInterpolator, k4.a.f21835b);
            this.f11208w = typedArrayI.getDimensionPixelSize(l.TabLayout_tabMinWidth, -1);
            this.f11209x = typedArrayI.getDimensionPixelSize(l.TabLayout_tabMaxWidth, -1);
            this.f11206u = typedArrayI.getResourceId(l.TabLayout_tabBackground, 0);
            this.f11211z = typedArrayI.getDimensionPixelSize(l.TabLayout_tabContentStart, 0);
            this.D = typedArrayI.getInt(l.TabLayout_tabMode, 1);
            this.A = typedArrayI.getInt(l.TabLayout_tabGravity, 0);
            this.E = typedArrayI.getBoolean(l.TabLayout_tabInlineLabel, false);
            this.I = typedArrayI.getBoolean(l.TabLayout_tabUnboundedRipple, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f11205t = resources.getDimensionPixelSize(j4.d.design_tab_text_size_2line);
            this.f11210y = resources.getDimensionPixelSize(j4.d.design_tab_scrollable_min_width);
            q();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(d.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
