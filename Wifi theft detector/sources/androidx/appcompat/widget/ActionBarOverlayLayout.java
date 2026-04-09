package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements d0, androidx.core.view.d0, androidx.core.view.e0 {
    public static final int[] G = {c.a.actionBarSize, R.attr.windowContentOverlay};
    public static final WindowInsetsCompat H = new WindowInsetsCompat.b().d(j0.b.b(0, 1, 0, 1)).a();
    public static final Rect I = new Rect();
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final androidx.core.view.f0 E;
    public final f F;

    /* renamed from: a, reason: collision with root package name */
    public int f829a;

    /* renamed from: b, reason: collision with root package name */
    public int f830b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f831c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f832d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f833e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f834f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f835g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f836h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f837i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f838j;

    /* renamed from: k, reason: collision with root package name */
    public int f839k;

    /* renamed from: l, reason: collision with root package name */
    public int f840l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f841m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f842n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f843o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f844p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f845q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f846r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f847s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f848t;

    /* renamed from: u, reason: collision with root package name */
    public WindowInsetsCompat f849u;

    /* renamed from: v, reason: collision with root package name */
    public WindowInsetsCompat f850v;

    /* renamed from: w, reason: collision with root package name */
    public WindowInsetsCompat f851w;

    /* renamed from: x, reason: collision with root package name */
    public WindowInsetsCompat f852x;

    /* renamed from: y, reason: collision with root package name */
    public d f853y;

    /* renamed from: z, reason: collision with root package name */
    public OverScroller f854z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f838j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f838j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f832d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f832d.animate().translationY(-ActionBarOverlayLayout.this.f832d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    public void A() {
        if (this.f831c == null) {
            this.f831c = (ContentFrameLayout) findViewById(c.f.action_bar_activity_content);
            this.f832d = (ActionBarContainer) findViewById(c.f.action_bar_container);
            this.f833e = u(findViewById(c.f.action_bar));
        }
    }

    public final void B() {
        v();
        this.C.run();
    }

    public final boolean C(float f10) {
        this.f854z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f854z.getFinalY() > this.f832d.getHeight();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        A();
        return this.f833e.a();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        A();
        return this.f833e.b();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        A();
        return this.f833e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.d0
    public void d(Menu menu, h.a aVar) {
        A();
        this.f833e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f834f != null) {
            int bottom = this.f832d.getVisibility() == 0 ? (int) (this.f832d.getBottom() + this.f832d.getTranslationY() + 0.5f) : 0;
            this.f834f.setBounds(0, bottom, getWidth(), this.f834f.getIntrinsicHeight() + bottom);
            this.f834f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        A();
        return this.f833e.e();
    }

    @Override // androidx.appcompat.widget.d0
    public void f() {
        A();
        this.f833e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        A();
        return this.f833e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f832d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f833e.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f833e.p();
        } else if (i10 == 5) {
            this.f833e.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.d0
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.d0
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.d0
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void l() {
        A();
        this.f833e.r();
    }

    @Override // androidx.core.view.e0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.d0
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.d0
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(windowInsets, this);
        boolean zQ = q(this.f832d, new Rect(windowInsetsCompatX.j(), windowInsetsCompatX.l(), windowInsetsCompatX.k(), windowInsetsCompatX.i()), true, true, false, true);
        ViewCompat.f(this, windowInsetsCompatX, this.f841m);
        Rect rect = this.f841m;
        WindowInsetsCompat windowInsetsCompatN = windowInsetsCompatX.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f849u = windowInsetsCompatN;
        boolean z10 = true;
        if (!this.f850v.equals(windowInsetsCompatN)) {
            this.f850v = this.f849u;
            zQ = true;
        }
        if (this.f842n.equals(this.f841m)) {
            z10 = zQ;
        } else {
            this.f842n.set(this.f841m);
        }
        if (z10) {
            requestLayout();
        }
        return windowInsetsCompatX.a().c().b().v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        ViewCompat.g0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f832d, i10, 0, i11, 0);
        e eVar = (e) this.f832d.getLayoutParams();
        int iMax = Math.max(0, this.f832d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f832d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f832d.getMeasuredState());
        boolean z10 = (ViewCompat.K(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f829a;
            if (this.f836h && this.f832d.getTabContainer() != null) {
                measuredHeight += this.f829a;
            }
        } else {
            measuredHeight = this.f832d.getVisibility() != 8 ? this.f832d.getMeasuredHeight() : 0;
        }
        this.f843o.set(this.f841m);
        this.f851w = this.f849u;
        if (this.f835g || z10 || !r()) {
            this.f851w = new WindowInsetsCompat.b(this.f851w).d(j0.b.b(this.f851w.j(), this.f851w.l() + measuredHeight, this.f851w.k(), this.f851w.i())).a();
        } else {
            Rect rect = this.f843o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f851w = this.f851w.n(0, measuredHeight, 0, 0);
        }
        q(this.f831c, this.f843o, true, true, true, true);
        if (!this.f852x.equals(this.f851w)) {
            WindowInsetsCompat windowInsetsCompat = this.f851w;
            this.f852x = windowInsetsCompat;
            ViewCompat.g(this.f831c, windowInsetsCompat);
        }
        measureChildWithMargins(this.f831c, i10, 0, i11, 0);
        e eVar2 = (e) this.f831c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f831c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f831c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f831c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f837i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f838j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f839k + i11;
        this.f839k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.b(view, view2, i10);
        this.f839k = getActionBarHideOffset();
        v();
        d dVar = this.f853y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f832d.getVisibility() != 0) {
            return false;
        }
        return this.f837i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f837i && !this.f838j) {
            if (this.f839k <= this.f832d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f853y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f840l ^ i10;
        this.f840l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f853y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f853y.a();
            } else {
                this.f853y.d();
            }
        }
        if ((i11 & 256) == 0 || this.f853y == null) {
            return;
        }
        ViewCompat.g0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f830b = i10;
        d dVar = this.f853y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public final void p() {
        v();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public final boolean r() {
        ViewCompat.f(this.F, H, this.f844p);
        return !this.f844p.equals(I);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f832d.setTranslationY(-Math.max(0, Math.min(i10, this.f832d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f853y = dVar;
        if (getWindowToken() != null) {
            this.f853y.onWindowVisibilityChanged(this.f830b);
            int i10 = this.f840l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                ViewCompat.g0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f836h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f837i) {
            this.f837i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f833e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f833e.t(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f835g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f833e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f833e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 u(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void v() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f829a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f834f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f854z = new OverScroller(context);
    }

    public boolean x() {
        return this.f835g;
    }

    public final void y() {
        v();
        postDelayed(this.D, 600L);
    }

    public final void z() {
        v();
        postDelayed(this.C, 600L);
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f830b = 0;
        this.f841m = new Rect();
        this.f842n = new Rect();
        this.f843o = new Rect();
        this.f844p = new Rect();
        this.f845q = new Rect();
        this.f846r = new Rect();
        this.f847s = new Rect();
        this.f848t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f2669b;
        this.f849u = windowInsetsCompat;
        this.f850v = windowInsetsCompat;
        this.f851w = windowInsetsCompat;
        this.f852x = windowInsetsCompat;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        w(context);
        this.E = new androidx.core.view.f0(this);
        f fVar = new f(context);
        this.F = fVar;
        addView(fVar);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f833e.setIcon(drawable);
    }
}
