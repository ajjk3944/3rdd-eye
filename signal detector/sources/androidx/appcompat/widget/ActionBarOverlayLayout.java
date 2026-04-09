package androidx.appcompat.widget;

import B3.x;
import R.C0187n;
import R.D;
import R.F;
import R.InterfaceC0185l;
import R.InterfaceC0186m;
import R.O;
import R.b0;
import R.c0;
import R.d0;
import R.e0;
import R.f0;
import R.o0;
import R.r0;
import a4.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import d4.C2272f;
import h.H;
import java.util.WeakHashMap;
import n.MenuC2677k;
import n.v;
import o.C2709e;
import o.C2711f;
import o.C2723l;
import o.InterfaceC2707d;
import o.InterfaceC2712f0;
import o.InterfaceC2714g0;
import o.RunnableC2705c;
import o.d1;
import o.i1;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2712f0, InterfaceC0185l, InterfaceC0186m {

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f4815Q = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: R, reason: collision with root package name */
    public static final r0 f4816R;

    /* renamed from: S, reason: collision with root package name */
    public static final Rect f4817S;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f4818C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f4819D;

    /* renamed from: E, reason: collision with root package name */
    public r0 f4820E;

    /* renamed from: F, reason: collision with root package name */
    public r0 f4821F;

    /* renamed from: G, reason: collision with root package name */
    public r0 f4822G;

    /* renamed from: H, reason: collision with root package name */
    public r0 f4823H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC2707d f4824I;

    /* renamed from: J, reason: collision with root package name */
    public OverScroller f4825J;

    /* renamed from: K, reason: collision with root package name */
    public ViewPropertyAnimator f4826K;

    /* renamed from: L, reason: collision with root package name */
    public final x f4827L;
    public final RunnableC2705c M;

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC2705c f4828N;

    /* renamed from: O, reason: collision with root package name */
    public final C0187n f4829O;

    /* renamed from: P, reason: collision with root package name */
    public final C2711f f4830P;

    /* renamed from: a, reason: collision with root package name */
    public int f4831a;

    /* renamed from: b, reason: collision with root package name */
    public int f4832b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f4833c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f4834d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2714g0 f4835e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4838h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4839j;

    /* renamed from: k, reason: collision with root package name */
    public int f4840k;

    /* renamed from: l, reason: collision with root package name */
    public int f4841l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4842m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f4843n;

    static {
        int i = Build.VERSION.SDK_INT;
        f0 e0Var = i >= 34 ? new e0() : i >= 30 ? new d0() : i >= 29 ? new c0() : new b0();
        e0Var.g(J.c.b(0, 1, 0, 1));
        f4816R = e0Var.b();
        f4817S = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4832b = 0;
        this.f4842m = new Rect();
        this.f4843n = new Rect();
        this.f4818C = new Rect();
        this.f4819D = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        r0 r0Var = r0.f3358b;
        this.f4820E = r0Var;
        this.f4821F = r0Var;
        this.f4822G = r0Var;
        this.f4823H = r0Var;
        this.f4827L = new x(10, this);
        this.M = new RunnableC2705c(this, 0);
        this.f4828N = new RunnableC2705c(this, 1);
        i(context);
        this.f4829O = new C0187n();
        C2711f c2711f = new C2711f(context);
        c2711f.setWillNotDraw(true);
        this.f4830P = c2711f;
        addView(c2711f);
    }

    public static boolean g(View view, Rect rect, boolean z6) {
        boolean z7;
        C2709e c2709e = (C2709e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2709e).leftMargin;
        int i3 = rect.left;
        if (i != i3) {
            ((ViewGroup.MarginLayoutParams) c2709e).leftMargin = i3;
            z7 = true;
        } else {
            z7 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c2709e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c2709e).topMargin = i7;
            z7 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c2709e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c2709e).rightMargin = i9;
            z7 = true;
        }
        if (z6) {
            int i10 = ((ViewGroup.MarginLayoutParams) c2709e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c2709e).bottomMargin = i11;
                return true;
            }
        }
        return z7;
    }

    @Override // R.InterfaceC0185l
    public final void a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // R.InterfaceC0186m
    public final void b(View view, int i, int i3, int i6, int i7, int i8, int[] iArr) {
        c(view, i, i3, i6, i7, i8);
    }

    @Override // R.InterfaceC0185l
    public final void c(View view, int i, int i3, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i, i3, i6, i7);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2709e;
    }

    @Override // R.InterfaceC0185l
    public final boolean d(View view, View view2, int i, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f4836f != null) {
            if (this.f4834d.getVisibility() == 0) {
                translationY = (int) (this.f4834d.getTranslationY() + this.f4834d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f4836f.setBounds(0, translationY, getWidth(), this.f4836f.getIntrinsicHeight() + translationY);
            this.f4836f.draw(canvas);
        }
    }

    @Override // R.InterfaceC0185l
    public final void e(View view, View view2, int i, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // R.InterfaceC0185l
    public final void f(View view, int i, int i3, int[] iArr, int i6) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2709e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2709e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4834d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0187n c0187n = this.f4829O;
        return c0187n.f3350b | c0187n.f3349a;
    }

    public CharSequence getTitle() {
        k();
        return ((i1) this.f4835e).f22522a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.M);
        removeCallbacks(this.f4828N);
        ViewPropertyAnimator viewPropertyAnimator = this.f4826K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4815Q);
        this.f4831a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4836f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4825J = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((i1) this.f4835e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((i1) this.f4835e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC2714g0 wrapper;
        if (this.f4833c == null) {
            this.f4833c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4834d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC2714g0) {
                wrapper = (InterfaceC2714g0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4835e = wrapper;
        }
    }

    public final void l(Menu menu, v vVar) {
        k();
        i1 i1Var = (i1) this.f4835e;
        Toolbar toolbar = i1Var.f22522a;
        if (i1Var.f22533m == null) {
            C2723l c2723l = new C2723l(toolbar.getContext());
            i1Var.f22533m = c2723l;
            c2723l.i = R.id.action_menu_presenter;
        }
        C2723l c2723l2 = i1Var.f22533m;
        c2723l2.f22557e = vVar;
        MenuC2677k menuC2677k = (MenuC2677k) menu;
        if (menuC2677k == null && toolbar.f5005a == null) {
            return;
        }
        toolbar.f();
        MenuC2677k menuC2677k2 = toolbar.f5005a.f4844D;
        if (menuC2677k2 == menuC2677k) {
            return;
        }
        if (menuC2677k2 != null) {
            menuC2677k2.r(toolbar.f5009c0);
            menuC2677k2.r(toolbar.f5011d0);
        }
        if (toolbar.f5011d0 == null) {
            toolbar.f5011d0 = new d1(toolbar);
        }
        c2723l2.f22546F = true;
        if (menuC2677k != null) {
            menuC2677k.b(c2723l2, toolbar.f5021j);
            menuC2677k.b(toolbar.f5011d0, toolbar.f5021j);
        } else {
            c2723l2.d(toolbar.f5021j, null);
            toolbar.f5011d0.d(toolbar.f5021j, null);
            c2723l2.b(true);
            toolbar.f5011d0.b(true);
        }
        toolbar.f5005a.setPopupTheme(toolbar.f5023k);
        toolbar.f5005a.setPresenter(c2723l2);
        toolbar.f5009c0 = c2723l2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        r0 r0VarG = r0.g(this, windowInsets);
        boolean zG = g(this.f4834d, new Rect(r0VarG.b(), r0VarG.d(), r0VarG.c(), r0VarG.a()), false);
        WeakHashMap weakHashMap = O.f3270a;
        Rect rect = this.f4842m;
        F.b(this, r0VarG, rect);
        int i = rect.left;
        int i3 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        o0 o0Var = r0VarG.f3359a;
        r0 r0VarL = o0Var.l(i, i3, i6, i7);
        this.f4820E = r0VarL;
        boolean z6 = true;
        if (!this.f4821F.equals(r0VarL)) {
            this.f4821F = this.f4820E;
            zG = true;
        }
        Rect rect2 = this.f4843n;
        if (rect2.equals(rect)) {
            z6 = zG;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return o0Var.a().f3359a.c().f3359a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = O.f3270a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C2709e c2709e = (C2709e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c2709e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c2709e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
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
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f5, boolean z6) {
        if (!this.i || !z6) {
            return false;
        }
        this.f4825J.fling(0, 0, 0, (int) f5, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (this.f4825J.getFinalY() > this.f4834d.getHeight()) {
            h();
            this.f4828N.run();
        } else {
            h();
            this.M.run();
        }
        this.f4839j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i3, int i6, int i7) {
        int i8 = this.f4840k + i3;
        this.f4840k = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        H h6;
        C2272f c2272f;
        this.f4829O.f3349a = i;
        this.f4840k = getActionBarHideOffset();
        h();
        InterfaceC2707d interfaceC2707d = this.f4824I;
        if (interfaceC2707d == null || (c2272f = (h6 = (H) interfaceC2707d).f20300t) == null) {
            return;
        }
        c2272f.b();
        h6.f20300t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4834d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f4839j) {
            return;
        }
        if (this.f4840k <= this.f4834d.getHeight()) {
            h();
            postDelayed(this.M, 600L);
        } else {
            h();
            postDelayed(this.f4828N, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i3 = this.f4841l ^ i;
        this.f4841l = i;
        boolean z6 = (i & 4) == 0;
        boolean z7 = (i & 256) != 0;
        InterfaceC2707d interfaceC2707d = this.f4824I;
        if (interfaceC2707d != null) {
            H h6 = (H) interfaceC2707d;
            h6.f20296p = !z7;
            if (z6 || !z7) {
                if (h6.f20297q) {
                    h6.f20297q = false;
                    h6.g0(true);
                }
            } else if (!h6.f20297q) {
                h6.f20297q = true;
                h6.g0(true);
            }
        }
        if ((i3 & 256) == 0 || this.f4824I == null) {
            return;
        }
        WeakHashMap weakHashMap = O.f3270a;
        D.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4832b = i;
        InterfaceC2707d interfaceC2707d = this.f4824I;
        if (interfaceC2707d != null) {
            ((H) interfaceC2707d).f20295o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f4834d.setTranslationY(-Math.max(0, Math.min(i, this.f4834d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2707d interfaceC2707d) {
        this.f4824I = interfaceC2707d;
        if (getWindowToken() != null) {
            ((H) this.f4824I).f20295o = this.f4832b;
            int i = this.f4841l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = O.f3270a;
                D.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f4838h = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.i) {
            this.i = z6;
            if (z6) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        i1 i1Var = (i1) this.f4835e;
        i1Var.f22525d = i != 0 ? t.i(i1Var.f22522a.getContext(), i) : null;
        i1Var.d();
    }

    public void setLogo(int i) {
        k();
        i1 i1Var = (i1) this.f4835e;
        i1Var.f22526e = i != 0 ? t.i(i1Var.f22522a.getContext(), i) : null;
        i1Var.d();
    }

    public void setOverlayMode(boolean z6) {
        this.f4837g = z6;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i) {
    }

    @Override // o.InterfaceC2712f0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i1) this.f4835e).f22531k = callback;
    }

    @Override // o.InterfaceC2712f0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        i1 i1Var = (i1) this.f4835e;
        if (i1Var.f22528g) {
            return;
        }
        Toolbar toolbar = i1Var.f22522a;
        i1Var.f22529h = charSequence;
        if ((i1Var.f22523b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i1Var.f22528g) {
                O.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2709e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i1 i1Var = (i1) this.f4835e;
        i1Var.f22525d = drawable;
        i1Var.d();
    }
}
