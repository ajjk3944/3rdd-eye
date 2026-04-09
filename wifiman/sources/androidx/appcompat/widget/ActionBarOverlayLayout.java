package androidx.appcompat.widget;

import F1.C2780w0;
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
import androidx.appcompat.view.menu.j;
import h.AbstractC5927a;
import h.AbstractC5932f;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements I, F1.C, F1.D {

    /* renamed from: G, reason: collision with root package name */
    static final int[] f26996G = {AbstractC5927a.f47939b, R.attr.windowContentOverlay};

    /* renamed from: H, reason: collision with root package name */
    private static final C2780w0 f26997H = new C2780w0.a().d(w1.f.b(0, 1, 0, 1)).a();

    /* renamed from: I, reason: collision with root package name */
    private static final Rect f26998I = new Rect();

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f26999A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f27000B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f27001C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f27002D;

    /* renamed from: E, reason: collision with root package name */
    private final F1.E f27003E;

    /* renamed from: F, reason: collision with root package name */
    private final f f27004F;

    /* renamed from: a, reason: collision with root package name */
    private int f27005a;

    /* renamed from: b, reason: collision with root package name */
    private int f27006b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f27007c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f27008d;

    /* renamed from: e, reason: collision with root package name */
    private J f27009e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f27010f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27011g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27012h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27013i;

    /* renamed from: j, reason: collision with root package name */
    boolean f27014j;

    /* renamed from: k, reason: collision with root package name */
    private int f27015k;

    /* renamed from: l, reason: collision with root package name */
    private int f27016l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f27017m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f27018n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f27019o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f27020p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f27021q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f27022r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f27023s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f27024t;

    /* renamed from: u, reason: collision with root package name */
    private C2780w0 f27025u;

    /* renamed from: v, reason: collision with root package name */
    private C2780w0 f27026v;

    /* renamed from: w, reason: collision with root package name */
    private C2780w0 f27027w;

    /* renamed from: x, reason: collision with root package name */
    private C2780w0 f27028x;

    /* renamed from: y, reason: collision with root package name */
    private d f27029y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f27030z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26999A = null;
            actionBarOverlayLayout.f27014j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26999A = null;
            actionBarOverlayLayout.f27014j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26999A = actionBarOverlayLayout.f27008d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f27000B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26999A = actionBarOverlayLayout.f27008d.animate().translationY(-ActionBarOverlayLayout.this.f27008d.getHeight()).setListener(ActionBarOverlayLayout.this.f27000B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void f(int i10);
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

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27006b = 0;
        this.f27017m = new Rect();
        this.f27018n = new Rect();
        this.f27019o = new Rect();
        this.f27020p = new Rect();
        this.f27021q = new Rect();
        this.f27022r = new Rect();
        this.f27023s = new Rect();
        this.f27024t = new Rect();
        C2780w0 c2780w0 = C2780w0.f5774b;
        this.f27025u = c2780w0;
        this.f27026v = c2780w0;
        this.f27027w = c2780w0;
        this.f27028x = c2780w0;
        this.f27000B = new a();
        this.f27001C = new b();
        this.f27002D = new c();
        w(context);
        this.f27003E = new F1.E(this);
        f fVar = new f(context);
        this.f27004F = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.f27001C.run();
    }

    private boolean C(float f10) {
        this.f27030z.fling(0, 0, 0, (int) f10, 0, 0, PduHandle.NONE, MPv3.MAX_MESSAGE_ID);
        return this.f27030z.getFinalY() > this.f27008d.getHeight();
    }

    private void p() {
        v();
        this.f27002D.run();
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
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private boolean r() {
        F1.W.f(this.f27004F, f26997H, this.f27020p);
        return !this.f27020p.equals(f26998I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J u(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f26996G);
        this.f27005a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f27010f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f27030z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.f27002D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.f27001C, 600L);
    }

    void A() {
        if (this.f27007c == null) {
            this.f27007c = (ContentFrameLayout) findViewById(AbstractC5932f.f48029b);
            this.f27008d = (ActionBarContainer) findViewById(AbstractC5932f.f48030c);
            this.f27009e = u(findViewById(AbstractC5932f.f48028a));
        }
    }

    @Override // androidx.appcompat.widget.I
    public void a(Menu menu, j.a aVar) {
        A();
        this.f27009e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.I
    public boolean b() {
        A();
        return this.f27009e.b();
    }

    @Override // androidx.appcompat.widget.I
    public void c() {
        A();
        this.f27009e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.I
    public boolean d() {
        A();
        return this.f27009e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f27010f != null) {
            int bottom = this.f27008d.getVisibility() == 0 ? (int) (this.f27008d.getBottom() + this.f27008d.getTranslationY() + 0.5f) : 0;
            this.f27010f.setBounds(0, bottom, getWidth(), this.f27010f.getIntrinsicHeight() + bottom);
            this.f27010f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        A();
        return this.f27009e.e();
    }

    @Override // androidx.appcompat.widget.I
    public boolean f() {
        A();
        return this.f27009e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        A();
        return this.f27009e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f27008d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f27003E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f27009e.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f27009e.s();
        } else if (i10 == 5) {
            this.f27009e.t();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.I
    public void i() {
        A();
        this.f27009e.h();
    }

    @Override // F1.D
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    @Override // F1.C
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // F1.C
    public boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // F1.C
    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // F1.C
    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // F1.C
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        C2780w0 c2780w0X = C2780w0.x(windowInsets, this);
        boolean zQ = q(this.f27008d, new Rect(c2780w0X.j(), c2780w0X.l(), c2780w0X.k(), c2780w0X.i()), true, true, false, true);
        F1.W.f(this, c2780w0X, this.f27017m);
        Rect rect = this.f27017m;
        C2780w0 c2780w0M = c2780w0X.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f27025u = c2780w0M;
        boolean z10 = true;
        if (!this.f27026v.equals(c2780w0M)) {
            this.f27026v = this.f27025u;
            zQ = true;
        }
        if (this.f27018n.equals(this.f27017m)) {
            z10 = zQ;
        } else {
            this.f27018n.set(this.f27017m);
        }
        if (z10) {
            requestLayout();
        }
        return c2780w0X.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        F1.W.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f27008d, i10, 0, i11, 0);
        e eVar = (e) this.f27008d.getLayoutParams();
        int iMax = Math.max(0, this.f27008d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f27008d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f27008d.getMeasuredState());
        boolean z10 = (F1.W.J(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z10) {
            measuredHeight = this.f27005a;
            if (this.f27012h && this.f27008d.getTabContainer() != null) {
                measuredHeight += this.f27005a;
            }
        } else {
            measuredHeight = this.f27008d.getVisibility() != 8 ? this.f27008d.getMeasuredHeight() : 0;
        }
        this.f27019o.set(this.f27017m);
        this.f27027w = this.f27025u;
        if (this.f27011g || z10 || !r()) {
            this.f27027w = new C2780w0.a(this.f27027w).d(w1.f.b(this.f27027w.j(), this.f27027w.l() + measuredHeight, this.f27027w.k(), this.f27027w.i())).a();
        } else {
            Rect rect = this.f27019o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f27027w = this.f27027w.m(0, measuredHeight, 0, 0);
        }
        q(this.f27007c, this.f27019o, true, true, true, true);
        if (!this.f27028x.equals(this.f27027w)) {
            C2780w0 c2780w0 = this.f27027w;
            this.f27028x = c2780w0;
            F1.W.g(this.f27007c, c2780w0);
        }
        measureChildWithMargins(this.f27007c, i10, 0, i11, 0);
        e eVar2 = (e) this.f27007c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f27007c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f27007c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f27007c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f27013i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f27014j = true;
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
        int i14 = this.f27015k + i11;
        this.f27015k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f27003E.b(view, view2, i10);
        this.f27015k = getActionBarHideOffset();
        v();
        d dVar = this.f27029y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f27008d.getVisibility() != 0) {
            return false;
        }
        return this.f27013i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f27013i && !this.f27014j) {
            if (this.f27015k <= this.f27008d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f27029y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f27016l ^ i10;
        this.f27016l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        d dVar = this.f27029y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f27029y.a();
            } else {
                this.f27029y.d();
            }
        }
        if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f27029y == null) {
            return;
        }
        F1.W.j0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f27006b = i10;
        d dVar = this.f27029y;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f27008d.setTranslationY(-Math.max(0, Math.min(i10, this.f27008d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f27029y = dVar;
        if (getWindowToken() != null) {
            this.f27029y.f(this.f27006b);
            int i10 = this.f27016l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                F1.W.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f27012h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f27013i) {
            this.f27013i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f27009e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f27009e.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f27011g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f27009e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f27009e.setWindowTitle(charSequence);
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

    void v() {
        removeCallbacks(this.f27001C);
        removeCallbacks(this.f27002D);
        ViewPropertyAnimator viewPropertyAnimator = this.f26999A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f27011g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f27009e.setIcon(drawable);
    }
}
