package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
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
import androidx.media3.common.i0;
import h.f;
import i.m0;
import java.util.WeakHashMap;
import n.j;
import o.x;
import p.e;
import p.n2;
import p.r2;
import p.y0;
import p.z0;
import u3.f1;
import u3.h1;
import u3.l;
import u3.m;
import u3.v0;
import u3.w0;
import u3.x0;
import u3.z;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements y0, l, m {

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f945b0 = {h.a.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: c0, reason: collision with root package name */
    public static final h1 f946c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final Rect f947d0;
    public boolean B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final Rect I;
    public final Rect J;
    public final Rect K;
    public final Rect L;
    public h1 M;
    public h1 N;
    public h1 O;
    public h1 P;
    public p.c Q;
    public OverScroller R;
    public ViewPropertyAnimator S;
    public final id.b T;
    public final p.b U;
    public final p.b V;
    public final i0 W;

    /* renamed from: a, reason: collision with root package name */
    public int f948a;

    /* renamed from: a0, reason: collision with root package name */
    public final e f949a0;

    /* renamed from: d, reason: collision with root package name */
    public int f950d;

    /* renamed from: g, reason: collision with root package name */
    public ContentFrameLayout f951g;

    /* renamed from: r, reason: collision with root package name */
    public ActionBarContainer f952r;

    /* renamed from: x, reason: collision with root package name */
    public z0 f953x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f954y;

    static {
        int i10 = Build.VERSION.SDK_INT;
        u3.y0 x0Var = i10 >= 30 ? new x0() : i10 >= 29 ? new w0() : new v0();
        x0Var.g(k3.d.b(0, 1, 0, 1));
        f946c0 = x0Var.b();
        f947d0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f950d = 0;
        this.I = new Rect();
        this.J = new Rect();
        this.K = new Rect();
        this.L = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        h1 h1Var = h1.f23175b;
        this.M = h1Var;
        this.N = h1Var;
        this.O = h1Var;
        this.P = h1Var;
        this.T = new id.b(4, this);
        this.U = new p.b(this, 0);
        this.V = new p.b(this, 1);
        i(context);
        this.W = new i0();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.f949a0 = eVar;
        addView(eVar);
    }

    public static boolean g(View view, Rect rect, boolean z10) {
        boolean z11;
        p.d dVar = (p.d) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // u3.m
    public final void a(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b(view, i10, i11, i12, i13, i14);
    }

    @Override // u3.l
    public final void b(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // u3.l
    public final boolean c(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.d;
    }

    @Override // u3.l
    public final void d(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f954y != null) {
            if (this.f952r.getVisibility() == 0) {
                translationY = (int) (this.f952r.getTranslationY() + this.f952r.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f954y.setBounds(0, translationY, getWidth(), this.f954y.getIntrinsicHeight() + translationY);
            this.f954y.draw(canvas);
        }
    }

    @Override // u3.l
    public final void e(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // u3.l
    public final void f(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p.d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f952r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.W;
        return i0Var.f1700b | i0Var.f1699a;
    }

    public CharSequence getTitle() {
        k();
        return ((r2) this.f953x).f20152a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.U);
        removeCallbacks(this.V);
        ViewPropertyAnimator viewPropertyAnimator = this.S;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f945b0);
        this.f948a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f954y = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.R = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 == 2) {
            this.f953x.getClass();
        } else if (i10 == 5) {
            this.f953x.getClass();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        z0 wrapper;
        if (this.f951g == null) {
            this.f951g = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f952r = (ActionBarContainer) findViewById(f.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(f.action_bar);
            if (callbackFindViewById instanceof z0) {
                wrapper = (z0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f953x = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        r2 r2Var = (r2) this.f953x;
        Toolbar toolbar = r2Var.f20152a;
        if (r2Var.f20162m == null) {
            b bVar = new b(toolbar.getContext());
            r2Var.f20162m = bVar;
            bVar.E = f.action_menu_presenter;
        }
        b bVar2 = r2Var.f20162m;
        bVar2.f1047x = xVar;
        o.m mVar = (o.m) menu;
        if (mVar == null && toolbar.f1011a == null) {
            return;
        }
        toolbar.f();
        o.m mVar2 = toolbar.f1011a.L;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f1024k0);
            mVar2.r(toolbar.f1025l0);
        }
        if (toolbar.f1025l0 == null) {
            toolbar.f1025l0 = new n2(toolbar);
        }
        bVar2.N = true;
        if (mVar != null) {
            mVar.b(bVar2, toolbar.F);
            mVar.b(toolbar.f1025l0, toolbar.F);
        } else {
            bVar2.d(toolbar.F, null);
            toolbar.f1025l0.d(toolbar.F, null);
            bVar2.b(true);
            toolbar.f1025l0.b(true);
        }
        toolbar.f1011a.setPopupTheme(toolbar.G);
        toolbar.f1011a.setPresenter(bVar2);
        toolbar.f1024k0 = bVar2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        h1 h1VarG = h1.g(this, windowInsets);
        boolean zG = g(this.f952r, new Rect(h1VarG.b(), h1VarG.d(), h1VarG.c(), h1VarG.a()), false);
        WeakHashMap weakHashMap = u3.i0.f23177a;
        Rect rect = this.I;
        z.b(this, h1VarG, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        f1 f1Var = h1VarG.f23176a;
        h1 h1VarM = f1Var.m(i10, i11, i12, i13);
        this.M = h1VarM;
        boolean z10 = true;
        if (!this.N.equals(h1VarM)) {
            this.N = this.M;
            zG = true;
        }
        Rect rect2 = this.J;
        if (rect2.equals(rect)) {
            z10 = zG;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return f1Var.a().f23176a.c().f23176a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = u3.i0.f23177a;
        u3.x.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                p.d dVar = (p.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
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
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.E || !z10) {
            return false;
        }
        this.R.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.R.getFinalY() > this.f952r.getHeight()) {
            h();
            this.V.run();
        } else {
            h();
            this.U.run();
        }
        this.F = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.G + i11;
        this.G = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        m0 m0Var;
        j jVar;
        this.W.f1699a = i10;
        this.G = getActionBarHideOffset();
        h();
        p.c cVar = this.Q;
        if (cVar == null || (jVar = (m0Var = (m0) cVar).f11089u) == null) {
            return;
        }
        jVar.a();
        m0Var.f11089u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f952r.getVisibility() != 0) {
            return false;
        }
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.E || this.F) {
            return;
        }
        if (this.G <= this.f952r.getHeight()) {
            h();
            postDelayed(this.U, 600L);
        } else {
            h();
            postDelayed(this.V, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.H ^ i10;
        this.H = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        p.c cVar = this.Q;
        if (cVar != null) {
            m0 m0Var = (m0) cVar;
            m0Var.f11085q = !z11;
            if (z10 || !z11) {
                if (m0Var.f11086r) {
                    m0Var.f11086r = false;
                    m0Var.i0(true);
                }
            } else if (!m0Var.f11086r) {
                m0Var.f11086r = true;
                m0Var.i0(true);
            }
        }
        if ((i11 & 256) == 0 || this.Q == null) {
            return;
        }
        WeakHashMap weakHashMap = u3.i0.f23177a;
        u3.x.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f950d = i10;
        p.c cVar = this.Q;
        if (cVar != null) {
            ((m0) cVar).f11084p = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f952r.setTranslationY(-Math.max(0, Math.min(i10, this.f952r.getHeight())));
    }

    public void setActionBarVisibilityCallback(p.c cVar) {
        this.Q = cVar;
        if (getWindowToken() != null) {
            ((m0) this.Q).f11084p = this.f950d;
            int i10 = this.H;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = u3.i0.f23177a;
                u3.x.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.D = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            if (z10) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        r2 r2Var = (r2) this.f953x;
        r2Var.f20155d = i10 != 0 ? ic.a.r(r2Var.f20152a.getContext(), i10) : null;
        r2Var.c();
    }

    public void setLogo(int i10) {
        k();
        r2 r2Var = (r2) this.f953x;
        r2Var.f20156e = i10 != 0 ? ic.a.r(r2Var.f20152a.getContext(), i10) : null;
        r2Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.B = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p.y0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((r2) this.f953x).k = callback;
    }

    @Override // p.y0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        r2 r2Var = (r2) this.f953x;
        if (r2Var.f20158g) {
            return;
        }
        Toolbar toolbar = r2Var.f20152a;
        r2Var.f20159h = charSequence;
        if ((r2Var.f20153b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r2Var.f20158g) {
                u3.i0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new p.d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        r2 r2Var = (r2) this.f953x;
        r2Var.f20155d = drawable;
        r2Var.c();
    }
}
