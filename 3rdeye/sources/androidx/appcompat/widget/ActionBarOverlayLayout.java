package androidx.appcompat.widget;

import L0.C0787s;
import L0.I;
import L0.InterfaceC0786q;
import L0.S;
import L0.X;
import L0.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h.t;
import java.util.WeakHashMap;
import m.g;
import o.InterfaceC5373A;
import o.InterfaceC5374B;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC5373A, InterfaceC0786q, r {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f14541D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: E, reason: collision with root package name */
    public static final X f14542E;

    /* renamed from: F, reason: collision with root package name */
    public static final Rect f14543F;

    /* renamed from: A, reason: collision with root package name */
    public final c f14544A;

    /* renamed from: B, reason: collision with root package name */
    public final C0787s f14545B;

    /* renamed from: C, reason: collision with root package name */
    public final f f14546C;

    /* renamed from: b, reason: collision with root package name */
    public int f14547b;

    /* renamed from: c, reason: collision with root package name */
    public int f14548c;

    /* renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f14549d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f14550e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC5374B f14551f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f14552g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14553h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14554j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14555k;

    /* renamed from: l, reason: collision with root package name */
    public int f14556l;

    /* renamed from: m, reason: collision with root package name */
    public int f14557m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f14558n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f14559o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f14560p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f14561q;

    /* renamed from: r, reason: collision with root package name */
    public X f14562r;

    /* renamed from: s, reason: collision with root package name */
    public X f14563s;

    /* renamed from: t, reason: collision with root package name */
    public X f14564t;

    /* renamed from: u, reason: collision with root package name */
    public X f14565u;

    /* renamed from: v, reason: collision with root package name */
    public d f14566v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f14567w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f14568x;

    /* renamed from: y, reason: collision with root package name */
    public final a f14569y;

    /* renamed from: z, reason: collision with root package name */
    public final b f14570z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14568x = null;
            actionBarOverlayLayout.f14555k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f14568x = null;
            actionBarOverlayLayout.f14555k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f14568x = actionBarOverlayLayout.f14550e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f14569y);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f14568x = actionBarOverlayLayout.f14550e.animate().translationY(-actionBarOverlayLayout.f14550e.getHeight()).setListener(actionBarOverlayLayout.f14569y);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        X.e dVar = i >= 30 ? new X.d() : i >= 29 ? new X.c() : new X.b();
        dVar.g(C0.e.b(0, 1, 0, 1));
        f14542E = dVar.b();
        f14543F = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14548c = 0;
        this.f14558n = new Rect();
        this.f14559o = new Rect();
        this.f14560p = new Rect();
        this.f14561q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        X x10 = X.f3849b;
        this.f14562r = x10;
        this.f14563s = x10;
        this.f14564t = x10;
        this.f14565u = x10;
        this.f14569y = new a();
        this.f14570z = new b();
        this.f14544A = new c();
        r(context);
        this.f14545B = new C0787s();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.f14546C = fVar;
        addView(fVar);
    }

    public static boolean p(View view, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // o.InterfaceC5373A
    public final boolean a() {
        s();
        return this.f14551f.a();
    }

    @Override // o.InterfaceC5373A
    public final void b() {
        s();
        this.f14551f.b();
    }

    @Override // o.InterfaceC5373A
    public final boolean c() {
        s();
        return this.f14551f.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // o.InterfaceC5373A
    public final void d(androidx.appcompat.view.menu.f fVar, j.a aVar) {
        s();
        this.f14551f.d(fVar, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f14552g != null) {
            if (this.f14550e.getVisibility() == 0) {
                translationY = (int) (this.f14550e.getTranslationY() + this.f14550e.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f14552g.setBounds(0, translationY, getWidth(), this.f14552g.getIntrinsicHeight() + translationY);
            this.f14552g.draw(canvas);
        }
    }

    @Override // o.InterfaceC5373A
    public final boolean e() {
        s();
        return this.f14551f.e();
    }

    @Override // o.InterfaceC5373A
    public final boolean f() {
        s();
        return this.f14551f.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // o.InterfaceC5373A
    public final boolean g() {
        s();
        return this.f14551f.g();
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
        ActionBarContainer actionBarContainer = this.f14550e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0787s c0787s = this.f14545B;
        return c0787s.f3932b | c0787s.f3931a;
    }

    public CharSequence getTitle() {
        s();
        return this.f14551f.getTitle();
    }

    @Override // o.InterfaceC5373A
    public final void h(int i) {
        s();
        if (i == 2) {
            this.f14551f.p();
        } else if (i == 5) {
            this.f14551f.q();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // o.InterfaceC5373A
    public final void i() {
        s();
        this.f14551f.h();
    }

    @Override // L0.InterfaceC0786q
    public final void j(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // L0.r
    public final void k(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        l(view, i, i10, i11, i12, i13);
    }

    @Override // L0.InterfaceC0786q
    public final void l(View view, int i, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i, i10, i11, i12);
        }
    }

    @Override // L0.InterfaceC0786q
    public final boolean m(View view, View view2, int i, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // L0.InterfaceC0786q
    public final void n(View view, View view2, int i, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        X xH = X.h(this, windowInsets);
        boolean zP = p(this.f14550e, new Rect(xH.b(), xH.d(), xH.c(), xH.a()), false);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        Rect rect = this.f14558n;
        I.d.b(this, xH, rect);
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        X.k kVar = xH.f3850a;
        X xL = kVar.l(i, i10, i11, i12);
        this.f14562r = xL;
        boolean z10 = true;
        if (!this.f14563s.equals(xL)) {
            this.f14563s = this.f14562r;
            zP = true;
        }
        Rect rect2 = this.f14559o;
        if (rect2.equals(rect)) {
            z10 = zP;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f3850a.c().f3850a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
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
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f14554j || !z10) {
            return false;
        }
        this.f14567w.fling(0, 0, 0, (int) f11, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.f14567w.getFinalY() > this.f14550e.getHeight()) {
            q();
            this.f14544A.run();
        } else {
            q();
            this.f14570z.run();
        }
        this.f14555k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        int i13 = this.f14556l + i10;
        this.f14556l = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        t tVar;
        g gVar;
        this.f14545B.f3931a = i;
        this.f14556l = getActionBarHideOffset();
        q();
        d dVar = this.f14566v;
        if (dVar == null || (gVar = (tVar = (t) dVar).f38139s) == null) {
            return;
        }
        gVar.a();
        tVar.f38139s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f14550e.getVisibility() != 0) {
            return false;
        }
        return this.f14554j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f14554j || this.f14555k) {
            return;
        }
        if (this.f14556l <= this.f14550e.getHeight()) {
            q();
            postDelayed(this.f14570z, 600L);
        } else {
            q();
            postDelayed(this.f14544A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i10 = this.f14557m ^ i;
        this.f14557m = i;
        boolean z10 = (i & 4) == 0;
        boolean z11 = (i & 256) != 0;
        d dVar = this.f14566v;
        if (dVar != null) {
            t tVar = (t) dVar;
            tVar.f38135o = !z11;
            if (z10 || !z11) {
                if (tVar.f38136p) {
                    tVar.f38136p = false;
                    tVar.u(true);
                }
            } else if (!tVar.f38136p) {
                tVar.f38136p = true;
                tVar.u(true);
            }
        }
        if ((i10 & 256) == 0 || this.f14566v == null) {
            return;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f14548c = i;
        d dVar = this.f14566v;
        if (dVar != null) {
            ((t) dVar).f38134n = i;
        }
    }

    public final void q() {
        removeCallbacks(this.f14570z);
        removeCallbacks(this.f14544A);
        ViewPropertyAnimator viewPropertyAnimator = this.f14568x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f14541D);
        this.f14547b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f14552g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f14567w = new OverScroller(context);
    }

    public final void s() {
        InterfaceC5374B wrapper;
        if (this.f14549d == null) {
            this.f14549d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f14550e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC5374B) {
                wrapper = (InterfaceC5374B) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f14551f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.f14550e.setTranslationY(-Math.max(0, Math.min(i, this.f14550e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f14566v = dVar;
        if (getWindowToken() != null) {
            ((t) this.f14566v).f38134n = this.f14548c;
            int i = this.f14557m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f14554j) {
            this.f14554j = z10;
            if (z10) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.f14551f.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.f14551f.l(i);
    }

    public void setOverlayMode(boolean z10) {
        this.f14553h = z10;
    }

    @Override // o.InterfaceC5373A
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f14551f.setWindowCallback(callback);
    }

    @Override // o.InterfaceC5373A
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f14551f.setWindowTitle(charSequence);
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
        s();
        this.f14551f.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
    }

    @Override // L0.InterfaceC0786q
    public final void o(View view, int i, int i10, int[] iArr, int i11) {
    }
}
