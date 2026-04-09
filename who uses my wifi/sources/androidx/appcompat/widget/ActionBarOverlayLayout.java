package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.b21;
import defpackage.c91;
import defpackage.d91;
import defpackage.e61;
import defpackage.e91;
import defpackage.ee0;
import defpackage.f91;
import defpackage.h21;
import defpackage.l91;
import defpackage.n1;
import defpackage.o1;
import defpackage.o91;
import defpackage.ob1;
import defpackage.od0;
import defpackage.p1;
import defpackage.q1;
import defpackage.r1;
import defpackage.r51;
import defpackage.rg0;
import defpackage.sg0;
import defpackage.t51;
import defpackage.t81;
import defpackage.tg0;
import defpackage.vm;
import defpackage.wm;
import defpackage.x61;
import defpackage.y1;
import defpackage.y20;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements vm, rg0, sg0 {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final o91 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final n1 C;
    public final o1 D;
    public final o1 E;
    public final tg0 F;
    public final r1 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public wm j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public o91 v;
    public o91 w;
    public o91 x;
    public o91 y;
    public p1 z;

    static {
        int i = Build.VERSION.SDK_INT;
        f91 e91Var = i >= 30 ? new e91() : i >= 29 ? new d91() : new c91();
        e91Var.g(y20.b(0, 1, 0, 1));
        I = e91Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        o91 o91Var = o91.b;
        this.v = o91Var;
        this.w = o91Var;
        this.x = o91Var;
        this.y = o91Var;
        this.C = new n1(0, this);
        this.D = new o1(this, 0);
        this.E = new o1(this, 1);
        i(context);
        this.F = new tg0();
        r1 r1Var = new r1(context);
        r1Var.setWillNotDraw(true);
        this.G = r1Var;
        addView(r1Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        q1 q1Var = (q1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) q1Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) q1Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) q1Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) q1Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) q1Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) q1Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) q1Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) q1Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.rg0
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.rg0
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q1;
    }

    @Override // defpackage.sg0
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.k != null) {
            if (this.i.getVisibility() == 0) {
                translationY = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.k.setBounds(0, translationY, getWidth(), this.k.getIntrinsicHeight() + translationY);
            this.k.draw(canvas);
        }
    }

    @Override // defpackage.rg0
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.rg0
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new q1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new q1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        tg0 tg0Var = this.F;
        return tg0Var.b | tg0Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((h21) this.j).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            this.j.getClass();
        } else if (i == 5) {
            this.j.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        wm wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof wm) {
                wrapper = (wm) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, ee0 ee0Var) {
        k();
        h21 h21Var = (h21) this.j;
        Toolbar toolbar = h21Var.a;
        if (h21Var.m == null) {
            h21Var.m = new y1(toolbar.getContext());
        }
        y1 y1Var = h21Var.m;
        y1Var.j = ee0Var;
        od0 od0Var = (od0) menu;
        if (od0Var == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        od0 od0Var2 = toolbar.f.u;
        if (od0Var2 == od0Var) {
            return;
        }
        if (od0Var2 != null) {
            od0Var2.r(toolbar.Q);
            od0Var2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new b21(toolbar);
        }
        y1Var.v = true;
        if (od0Var != null) {
            od0Var.b(y1Var, toolbar.o);
            od0Var.b(toolbar.R, toolbar.o);
        } else {
            y1Var.i(toolbar.o, null);
            toolbar.R.i(toolbar.o, null);
            y1Var.g();
            toolbar.R.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(y1Var);
        toolbar.Q = y1Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        o91 o91VarG = o91.g(this, windowInsets);
        boolean zG = g(this.i, new Rect(o91VarG.b(), o91VarG.d(), o91VarG.c(), o91VarG.a()), false);
        WeakHashMap weakHashMap = e61.a;
        Rect rect = this.r;
        t51.b(this, o91VarG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        l91 l91Var = o91VarG.a;
        o91 o91VarL = l91Var.l(i, i2, i3, i4);
        this.v = o91VarL;
        boolean z = true;
        if (!this.w.equals(o91VarL)) {
            this.w = this.v;
            zG = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return l91Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = e61.a;
        r51.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                q1 q1Var = (q1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) q1Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) q1Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        t81 t81Var;
        x61 x61Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        p1 p1Var = this.z;
        if (p1Var == null || (x61Var = (t81Var = (t81) p1Var).y) == null) {
            return;
        }
        x61Var.a();
        t81Var.y = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        p1 p1Var = this.z;
        if (p1Var != null) {
            t81 t81Var = (t81) p1Var;
            t81Var.u = !z2;
            if (z || !z2) {
                if (t81Var.v) {
                    t81Var.v = false;
                    t81Var.l0(true);
                }
            } else if (!t81Var.v) {
                t81Var.v = true;
                t81Var.l0(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = e61.a;
        r51.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        p1 p1Var = this.z;
        if (p1Var != null) {
            ((t81) p1Var).t = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(p1 p1Var) {
        this.z = p1Var;
        if (getWindowToken() != null) {
            ((t81) this.z).t = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = e61.a;
                r51.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        h21 h21Var = (h21) this.j;
        h21Var.d = i != 0 ? ob1.h(h21Var.a.getContext(), i) : null;
        h21Var.c();
    }

    public void setLogo(int i) {
        k();
        h21 h21Var = (h21) this.j;
        h21Var.e = i != 0 ? ob1.h(h21Var.a.getContext(), i) : null;
        h21Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    @Override // defpackage.vm
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((h21) this.j).k = callback;
    }

    @Override // defpackage.vm
    public void setWindowTitle(CharSequence charSequence) {
        k();
        h21 h21Var = (h21) this.j;
        if (h21Var.g) {
            return;
        }
        Toolbar toolbar = h21Var.a;
        h21Var.h = charSequence;
        if ((h21Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (h21Var.g) {
                e61.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new q1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        h21 h21Var = (h21) this.j;
        h21Var.d = drawable;
        h21Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.rg0
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
