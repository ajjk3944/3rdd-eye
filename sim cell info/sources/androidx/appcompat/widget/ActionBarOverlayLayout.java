package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, a0.n, a0.l, a0.m {
    static final int[] C = {a.a.f1b, R.attr.windowContentOverlay};
    private final Runnable A;
    private final a0.o B;

    /* renamed from: b, reason: collision with root package name */
    private int f710b;

    /* renamed from: c, reason: collision with root package name */
    private int f711c;

    /* renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f712d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f713e;

    /* renamed from: f, reason: collision with root package name */
    private d0 f714f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f715g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f716h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f717i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f718j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f719k;

    /* renamed from: l, reason: collision with root package name */
    boolean f720l;

    /* renamed from: m, reason: collision with root package name */
    private int f721m;

    /* renamed from: n, reason: collision with root package name */
    private int f722n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f723o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f724p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f725q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f726r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f727s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f728t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f729u;

    /* renamed from: v, reason: collision with root package name */
    private d f730v;

    /* renamed from: w, reason: collision with root package name */
    private OverScroller f731w;

    /* renamed from: x, reason: collision with root package name */
    ViewPropertyAnimator f732x;

    /* renamed from: y, reason: collision with root package name */
    final AnimatorListenerAdapter f733y;

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f734z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f732x = null;
            actionBarOverlayLayout.f720l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f732x = null;
            actionBarOverlayLayout.f720l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f732x = actionBarOverlayLayout.f713e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f733y);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f732x = actionBarOverlayLayout.f713e.animate().translationY(-ActionBarOverlayLayout.this.f713e.getHeight()).setListener(ActionBarOverlayLayout.this.f733y);
        }
    }

    public interface d {
        void a();

        void b(boolean z2);

        void c(int i2);

        void d();

        void e();

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f711c = 0;
        this.f723o = new Rect();
        this.f724p = new Rect();
        this.f725q = new Rect();
        this.f726r = new Rect();
        this.f727s = new Rect();
        this.f728t = new Rect();
        this.f729u = new Rect();
        this.f733y = new a();
        this.f734z = new b();
        this.A = new c();
        v(context);
        this.B = new a0.o(this);
    }

    private void A() {
        u();
        this.f734z.run();
    }

    private boolean B(float f2, float f3) {
        this.f731w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f731w.getFinalY() > this.f713e.getHeight();
    }

    private void p() {
        u();
        this.A.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
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
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f710b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f715g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f716h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f731w = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.A, 600L);
    }

    private void y() {
        u();
        postDelayed(this.f734z, 600L);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean a() {
        z();
        return this.f714f.a();
    }

    @Override // androidx.appcompat.widget.c0
    public void b(Menu menu, j.a aVar) {
        z();
        this.f714f.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        z();
        return this.f714f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public void d() {
        z();
        this.f714f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f715g == null || this.f716h) {
            return;
        }
        int bottom = this.f713e.getVisibility() == 0 ? (int) (this.f713e.getBottom() + this.f713e.getTranslationY() + 0.5f) : 0;
        this.f715g.setBounds(0, bottom, getWidth(), this.f715g.getIntrinsicHeight() + bottom);
        this.f715g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        z();
        return this.f714f.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        z();
        return this.f714f.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        z();
        a0.s.x(this);
        boolean zQ = q(this.f713e, rect, true, true, false, true);
        this.f726r.set(rect);
        c1.a(this, this.f726r, this.f723o);
        if (!this.f727s.equals(this.f726r)) {
            this.f727s.set(this.f726r);
            zQ = true;
        }
        if (!this.f724p.equals(this.f723o)) {
            this.f724p.set(this.f723o);
            zQ = true;
        }
        if (zQ) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean g() {
        z();
        return this.f714f.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f713e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f714f.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public void h(int i2) {
        z();
        if (i2 == 2) {
            this.f714f.l();
        } else if (i2 == 5) {
            this.f714f.r();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // a0.l
    public void i(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void j() {
        z();
        this.f714f.h();
    }

    @Override // a0.m
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        l(view, i2, i3, i4, i5, i6);
    }

    @Override // a0.l
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // a0.l
    public void m(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a0.l
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // a0.l
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        a0.s.N(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f713e, i2, 0, i3, 0);
        e eVar = (e) this.f713e.getLayoutParams();
        int iMax = Math.max(0, this.f713e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f713e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f713e.getMeasuredState());
        boolean z2 = (a0.s.x(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f710b;
            if (this.f718j && this.f713e.getTabContainer() != null) {
                measuredHeight += this.f710b;
            }
        } else {
            measuredHeight = this.f713e.getVisibility() != 8 ? this.f713e.getMeasuredHeight() : 0;
        }
        this.f725q.set(this.f723o);
        this.f728t.set(this.f726r);
        Rect rect = (this.f717i || z2) ? this.f728t : this.f725q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        q(this.f712d, this.f725q, true, true, true, true);
        if (!this.f729u.equals(this.f728t)) {
            this.f729u.set(this.f728t);
            this.f712d.a(this.f728t);
        }
        measureChildWithMargins(this.f712d, i2, 0, i3, 0);
        e eVar2 = (e) this.f712d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f712d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f712d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f712d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f719k || !z2) {
            return false;
        }
        if (B(f2, f3)) {
            p();
        } else {
            A();
        }
        this.f720l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f721m + i3;
        this.f721m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.b(view, view2, i2);
        this.f721m = getActionBarHideOffset();
        u();
        d dVar = this.f730v;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f713e.getVisibility() != 0) {
            return false;
        }
        return this.f719k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onStopNestedScroll(View view) {
        if (this.f719k && !this.f720l) {
            if (this.f721m <= this.f713e.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f730v;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.f722n ^ i2;
        this.f722n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.f730v;
        if (dVar != null) {
            dVar.b(!z3);
            if (z2 || !z3) {
                this.f730v.e();
            } else {
                this.f730v.d();
            }
        }
        if ((i3 & 256) == 0 || this.f730v == null) {
            return;
        }
        a0.s.N(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f711c = i2;
        d dVar = this.f730v;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f713e.setTranslationY(-Math.max(0, Math.min(i2, this.f713e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f730v = dVar;
        if (getWindowToken() != null) {
            this.f730v.c(this.f711c);
            int i2 = this.f722n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                a0.s.N(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f718j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f719k) {
            this.f719k = z2;
            if (z2) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        z();
        this.f714f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f714f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.f714f.n(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f717i = z2;
        this.f716h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f714f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f714f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.f734z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f732x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f717i;
    }

    void z() {
        if (this.f712d == null) {
            this.f712d = (ContentFrameLayout) findViewById(a.f.f73b);
            this.f713e = (ActionBarContainer) findViewById(a.f.f74c);
            this.f714f = t(findViewById(a.f.f72a));
        }
    }
}
