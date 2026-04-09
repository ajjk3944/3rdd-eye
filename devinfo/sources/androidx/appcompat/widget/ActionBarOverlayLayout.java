package androidx.appcompat.widget;

import ad.g;
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
import androidx.recyclerview.widget.z0;
import com.liuzh.deviceinfo.R;
import e4.c2;
import e4.k0;
import e4.m0;
import e4.m1;
import e4.n1;
import e4.o1;
import e4.p1;
import e4.q;
import e4.q1;
import e4.r;
import e4.r1;
import e4.v0;
import e4.z1;
import i.i0;
import java.util.WeakHashMap;
import jm.a;
import n.j;
import o.m;
import o.x;
import p.c;
import p.d;
import p.e;
import p.e1;
import p.f;
import p.f1;
import p.i3;
import p.k;
import p.n3;
import v3.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements e1, q, r {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final c2 D;
    public static final Rect E;
    public final z0 A;
    public final f B;

    /* renamed from: a, reason: collision with root package name */
    public int f721a;

    /* renamed from: b, reason: collision with root package name */
    public int f722b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f723c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f724d;

    /* renamed from: e, reason: collision with root package name */
    public f1 f725e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f726f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f727h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f728i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f729k;

    /* renamed from: l, reason: collision with root package name */
    public int f730l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f731m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f732n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f733o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f734p;

    /* renamed from: q, reason: collision with root package name */
    public c2 f735q;

    /* renamed from: r, reason: collision with root package name */
    public c2 f736r;

    /* renamed from: s, reason: collision with root package name */
    public c2 f737s;

    /* renamed from: t, reason: collision with root package name */
    public c2 f738t;

    /* renamed from: u, reason: collision with root package name */
    public d f739u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f740v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f741w;

    /* renamed from: x, reason: collision with root package name */
    public final g f742x;

    /* renamed from: y, reason: collision with root package name */
    public final c f743y;

    /* renamed from: z, reason: collision with root package name */
    public final c f744z;

    static {
        int i4 = Build.VERSION.SDK_INT;
        r1 q1Var = i4 >= 34 ? new q1() : i4 >= 31 ? new p1() : i4 >= 30 ? new o1() : i4 >= 29 ? new n1() : new m1();
        q1Var.g(b.c(0, 1, 0, 1));
        D = q1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f722b = 0;
        this.f731m = new Rect();
        this.f732n = new Rect();
        this.f733o = new Rect();
        this.f734p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c2 c2Var = c2.f22314b;
        this.f735q = c2Var;
        this.f736r = c2Var;
        this.f737s = c2Var;
        this.f738t = c2Var;
        this.f742x = new g(12, this);
        this.f743y = new c(this, 0);
        this.f744z = new c(this, 1);
        i(context);
        this.A = new z0();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.B = fVar;
        addView(fVar);
    }

    public static boolean a(View view, Rect rect, boolean z3) {
        boolean z10;
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i4 != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z10 = true;
        }
        if (z3) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    public final void b() {
        removeCallbacks(this.f743y);
        removeCallbacks(this.f744z);
        ViewPropertyAnimator viewPropertyAnimator = this.f741w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // e4.q
    public final void c(int i4, View view) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // e4.r
    public final void d(View view, int i4, int i10, int i11, int i12, int i13, int[] iArr) {
        e(view, i4, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f726f != null) {
            if (this.f724d.getVisibility() == 0) {
                translationY = (int) (this.f724d.getTranslationY() + this.f724d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f726f.setBounds(0, translationY, getWidth(), this.f726f.getIntrinsicHeight() + translationY);
            this.f726f.draw(canvas);
        }
    }

    @Override // e4.q
    public final void e(View view, int i4, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i4, i10, i11, i12);
        }
    }

    @Override // e4.q
    public final boolean f(View view, View view2, int i4, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // e4.q
    public final void g(View view, View view2, int i4, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f724d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        z0 z0Var = this.A;
        return z0Var.f1564b | z0Var.f1563a;
    }

    public CharSequence getTitle() {
        k();
        return ((n3) this.f725e).f30779a.getTitle();
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f721a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f726f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f740v = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 == 2) {
            ((n3) this.f725e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i4 == 5) {
            ((n3) this.f725e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        f1 wrapper;
        if (this.f723c == null) {
            this.f723c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f724d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof f1) {
                wrapper = (f1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f725e = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        n3 n3Var = (n3) this.f725e;
        Toolbar toolbar = n3Var.f30779a;
        if (n3Var.f30789m == null) {
            n3Var.f30789m = new k(toolbar.getContext());
        }
        k kVar = n3Var.f30789m;
        kVar.f30729e = xVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f818a == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f818a.f745p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.L);
            mVar2.r(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new i3(toolbar);
        }
        kVar.f30739q = true;
        if (mVar != null) {
            mVar.b(kVar, toolbar.j);
            mVar.b(toolbar.M, toolbar.j);
        } else {
            kVar.b(toolbar.j, null);
            toolbar.M.b(toolbar.j, null);
            kVar.f();
            toolbar.M.f();
        }
        toolbar.f818a.setPopupTheme(toolbar.f826k);
        toolbar.f818a.setPresenter(kVar);
        toolbar.L = kVar;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        c2 c2VarH = c2.h(this, windowInsets);
        boolean zA = a(this.f724d, new Rect(c2VarH.b(), c2VarH.d(), c2VarH.c(), c2VarH.a()), false);
        WeakHashMap weakHashMap = v0.f22405a;
        Rect rect = this.f731m;
        m0.b(this, c2VarH, rect);
        int i4 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        z1 z1Var = c2VarH.f22315a;
        c2 c2VarN = z1Var.n(i4, i10, i11, i12);
        this.f735q = c2VarN;
        boolean z3 = true;
        if (!this.f736r.equals(c2VarN)) {
            this.f736r = this.f735q;
            zA = true;
        }
        Rect rect2 = this.f732n;
        if (rect2.equals(rect)) {
            z3 = zA;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return z1Var.a().f22315a.c().f22315a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = v0.f22405a;
        k0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
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
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        if (!this.f728i || !z3) {
            return false;
        }
        this.f740v.fling(0, 0, 0, (int) f11, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (this.f740v.getFinalY() > this.f724d.getHeight()) {
            b();
            this.f744z.run();
        } else {
            b();
            this.f743y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i10, int i11, int i12) {
        int i13 = this.f729k + i10;
        this.f729k = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        i0 i0Var;
        j jVar;
        this.A.f1563a = i4;
        this.f729k = getActionBarHideOffset();
        b();
        d dVar = this.f739u;
        if (dVar == null || (jVar = (i0Var = (i0) dVar).f25323v) == null) {
            return;
        }
        jVar.a();
        i0Var.f25323v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f724d.getVisibility() != 0) {
            return false;
        }
        return this.f728i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f728i || this.j) {
            return;
        }
        if (this.f729k <= this.f724d.getHeight()) {
            b();
            postDelayed(this.f743y, 600L);
        } else {
            b();
            postDelayed(this.f744z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i10 = this.f730l ^ i4;
        this.f730l = i4;
        boolean z3 = (i4 & 4) == 0;
        boolean z10 = (i4 & 256) != 0;
        d dVar = this.f739u;
        if (dVar != null) {
            i0 i0Var = (i0) dVar;
            i0Var.f25318q = !z10;
            if (z3 || !z10) {
                if (i0Var.f25320s) {
                    i0Var.f25320s = false;
                    i0Var.Y(true);
                }
            } else if (!i0Var.f25320s) {
                i0Var.f25320s = true;
                i0Var.Y(true);
            }
        }
        if ((i10 & 256) == 0 || this.f739u == null) {
            return;
        }
        WeakHashMap weakHashMap = v0.f22405a;
        k0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f722b = i4;
        d dVar = this.f739u;
        if (dVar != null) {
            ((i0) dVar).f25317p = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        b();
        this.f724d.setTranslationY(-Math.max(0, Math.min(i4, this.f724d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f739u = dVar;
        if (getWindowToken() != null) {
            ((i0) this.f739u).f25317p = this.f722b;
            int i4 = this.f730l;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = v0.f22405a;
                k0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f727h = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f728i) {
            this.f728i = z3;
            if (z3) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        k();
        n3 n3Var = (n3) this.f725e;
        n3Var.f30782d = i4 != 0 ? a.l(i4, n3Var.f30779a.getContext()) : null;
        n3Var.c();
    }

    public void setLogo(int i4) {
        k();
        n3 n3Var = (n3) this.f725e;
        n3Var.f30783e = i4 != 0 ? a.l(i4, n3Var.f30779a.getContext()) : null;
        n3Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.g = z3;
    }

    @Override // p.e1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((n3) this.f725e).f30787k = callback;
    }

    @Override // p.e1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        n3 n3Var = (n3) this.f725e;
        if (n3Var.g) {
            return;
        }
        Toolbar toolbar = n3Var.f30779a;
        n3Var.f30785h = charSequence;
        if ((n3Var.f30780b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (n3Var.g) {
                v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        n3 n3Var = (n3) this.f725e;
        n3Var.f30782d = drawable;
        n3Var.c();
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i10, int[] iArr) {
    }

    @Override // e4.q
    public final void h(View view, int i4, int i10, int[] iArr, int i11) {
    }
}
