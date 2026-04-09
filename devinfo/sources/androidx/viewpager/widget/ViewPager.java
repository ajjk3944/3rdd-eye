package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.q0;
import b5.o;
import b5.z;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.material.datepicker.j;
import com.google.android.material.tabs.TabLayout;
import e4.m0;
import e4.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import je.u;
import n6.a;
import n6.b;
import n6.c;
import n6.d;
import n6.e;
import n6.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] V = {R.attr.layout_gravity};
    public static final m W = new m(13);

    /* renamed from: a0, reason: collision with root package name */
    public static final q0 f1572a0 = new q0(2);
    public final int A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F;
    public VelocityTracker G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final EdgeEffect L;
    public final EdgeEffect M;
    public boolean N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public e R;
    public ArrayList S;
    public final o T;
    public int U;

    /* renamed from: a, reason: collision with root package name */
    public int f1573a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1574b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1575c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1576d;

    /* renamed from: e, reason: collision with root package name */
    public a f1577e;

    /* renamed from: f, reason: collision with root package name */
    public int f1578f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f1579h;

    /* renamed from: i, reason: collision with root package name */
    public final Scroller f1580i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public jd.e f1581k;

    /* renamed from: l, reason: collision with root package name */
    public int f1582l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f1583m;

    /* renamed from: n, reason: collision with root package name */
    public int f1584n;

    /* renamed from: o, reason: collision with root package name */
    public int f1585o;

    /* renamed from: p, reason: collision with root package name */
    public float f1586p;

    /* renamed from: q, reason: collision with root package name */
    public float f1587q;

    /* renamed from: r, reason: collision with root package name */
    public int f1588r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1589s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1590t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1591u;

    /* renamed from: v, reason: collision with root package name */
    public int f1592v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1593w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1594x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1595y;

    /* renamed from: z, reason: collision with root package name */
    public int f1596z;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1574b = new ArrayList();
        this.f1575c = new c();
        this.f1576d = new Rect();
        this.g = -1;
        this.f1579h = null;
        this.f1586p = -3.4028235E38f;
        this.f1587q = Float.MAX_VALUE;
        this.f1592v = 1;
        this.F = -1;
        this.N = true;
        this.T = new o(28, this);
        this.U = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1580i = new Scroller(context2, f1572a0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.H = (int) (400.0f * f10);
        this.I = viewConfiguration.getScaledMaximumFlingVelocity();
        this.L = new EdgeEffect(context2);
        this.M = new EdgeEffect(context2);
        this.J = (int) (25.0f * f10);
        this.K = (int) (2.0f * f10);
        this.f1595y = (int) (f10 * 16.0f);
        v0.o(this, new j(1, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        km.o oVar = new km.o();
        oVar.f28446b = this;
        oVar.f28445a = new Rect();
        m0.j(this, oVar);
    }

    public static boolean c(View view, boolean z3, int i4, int i10, int i11) {
        int i12;
        if (!(view instanceof ViewGroup)) {
            return z3 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i13 = i10 + scrollX;
            if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && c(childAt, true, i4, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                break;
            }
        }
        if (z3 || !view.canScrollHorizontally(-i4)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.f1590t != z3) {
            this.f1590t = z3;
        }
    }

    public final c a(int i4, int i10) {
        c cVar = new c();
        cVar.f29769b = i4;
        cVar.f29768a = this.f1577e.f(this, i4);
        this.f1577e.getClass();
        cVar.f29771d = 1.0f;
        ArrayList arrayList = this.f1574b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(cVar);
            return cVar;
        }
        arrayList.add(i10, cVar);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i10) {
        c cVarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f29769b == this.f1578f) {
                    childAt.addFocusables(arrayList, i4, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c cVarH;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f29769b == this.f1578f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z3 = dVar.f29773a | (view.getClass().getAnnotation(b.class) != null);
        dVar.f29773a = z3;
        if (!this.f1589s) {
            super.addView(view, i4, layoutParams);
        } else {
            if (z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.f29776d = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.f1576d
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.g(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.g(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.f1578f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f1591u = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.g(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.g(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.m()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.m()
            goto Lcf
        Lc2:
            int r0 = r7.f1578f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f1591u = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i4) {
        if (this.f1577e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1586p)) : i4 > 0 && scrollX < ((int) (((float) clientWidth) * this.f1587q));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.j = true;
        Scroller scroller = this.f1580i;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = v0.f22405a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z3) {
        boolean z10 = this.U == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.f1580i;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f1591u = false;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f1574b;
            if (i4 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i4);
            if (cVar.f29770c) {
                cVar.f29770c = false;
                z10 = true;
            }
            i4++;
        }
        if (z10) {
            o oVar = this.T;
            if (!z3) {
                oVar.run();
            } else {
                WeakHashMap weakHashMap = v0.f22405a;
                postOnAnimation(oVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.b(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r6 = r5.b(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m()
            goto L62
        L41:
            r6 = 66
            boolean r6 = r5.b(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.f1578f
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.f1591u = r2
            r5.u(r6, r2, r1, r2)
            r6 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r6 = r5.b(r6)
            goto L62
        L61:
            r6 = r2
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c cVarH;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f29769b == this.f1578f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.M;
        EdgeEffect edgeEffect2 = this.L;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f1577e) != null && aVar.c() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1586p * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1587q + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = v0.f22405a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1583m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int iC = this.f1577e.c();
        this.f1573a = iC;
        ArrayList arrayList = this.f1574b;
        boolean z3 = arrayList.size() < (this.f1592v * 2) + 1 && arrayList.size() < iC;
        int iMax = this.f1578f;
        int i4 = 0;
        boolean z10 = false;
        while (i4 < arrayList.size()) {
            c cVar = (c) arrayList.get(i4);
            int iD = this.f1577e.d(cVar.f29768a);
            if (iD != -1) {
                if (iD == -2) {
                    arrayList.remove(i4);
                    i4--;
                    if (!z10) {
                        this.f1577e.i(this);
                        z10 = true;
                    }
                    this.f1577e.a(cVar.f29768a);
                    int i10 = this.f1578f;
                    if (i10 == cVar.f29769b) {
                        iMax = Math.max(0, Math.min(i10, iC - 1));
                    }
                } else {
                    int i11 = cVar.f29769b;
                    if (i11 != iD) {
                        if (i11 == this.f1578f) {
                            iMax = iD;
                        }
                        cVar.f29769b = iD;
                    }
                }
                z3 = true;
            }
            i4++;
        }
        if (z10) {
            this.f1577e.b();
        }
        Collections.sort(arrayList, W);
        if (z3) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                d dVar = (d) getChildAt(i12).getLayoutParams();
                if (!dVar.f29773a) {
                    dVar.f29775c = 0.0f;
                }
            }
            u(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i4) {
        e eVar = this.R;
        if (eVar != null) {
            eVar.b(i4);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.Q.get(i10);
                if (eVar2 != null) {
                    eVar2.b(i4);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f29775c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f1577e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f1578f;
    }

    public int getOffscreenPageLimit() {
        return this.f1592v;
    }

    public int getPageMargin() {
        return this.f1582l;
    }

    public final c h(View view) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f1574b;
            if (i4 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i4);
            a aVar = this.f1577e;
            Object obj = cVar.f29768a;
            ((ti.a) aVar).getClass();
            if (((z) obj).H == view) {
                return cVar;
            }
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n6.c i() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.f1582l
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList r10 = r13.f1574b
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            n6.c r11 = (n6.c) r11
            if (r9 != 0) goto L4c
            int r12 = r11.f29769b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            n6.c r4 = r13.f1575c
            r4.f29772e = r1
            r4.f29769b = r6
            n6.a r1 = r13.f1577e
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.f29771d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.f29772e
            float r4 = r6.f29771d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L59
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L72
        L59:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L71
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L65
            goto L71
        L65:
            int r4 = r6.f29769b
            float r7 = r6.f29771d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r0
            goto L22
        L71:
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.i():n6.c");
    }

    public final c j(int i4) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1574b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f29769b == i4) {
                return cVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.P
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            n6.d r8 = (n6.d) r8
            boolean r9 = r8.f29773a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f29774b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            n6.e r14 = r11.R
            if (r14 == 0) goto L73
            r14.c(r13, r12)
        L73:
            java.util.ArrayList r14 = r11.Q
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.Q
            java.lang.Object r2 = r2.get(r0)
            n6.e r2 = (n6.e) r2
            if (r2 == 0) goto L8a
            r2.c(r13, r12)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.O = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(float, int, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.B = motionEvent.getX(i4);
            this.F = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() throws Resources.NotFoundException {
        a aVar = this.f1577e;
        if (aVar == null || this.f1578f >= aVar.c() - 1) {
            return false;
        }
        int i4 = this.f1578f + 1;
        this.f1591u = false;
        u(i4, 0, true, false);
        return true;
    }

    public final boolean n(int i4) {
        if (this.f1574b.size() == 0) {
            if (!this.N) {
                this.O = false;
                k(0.0f, 0, 0);
                if (!this.O) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c cVarI = i();
        int clientWidth = getClientWidth();
        int i10 = this.f1582l;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = cVarI.f29769b;
        float f11 = ((i4 / f10) - cVarI.f29772e) / (cVarI.f29771d + (i10 / f10));
        this.O = false;
        k(f11, i12, (int) (i11 * f11));
        if (this.O) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f10) {
        boolean z3;
        boolean z10;
        float f11 = this.B - f10;
        this.B = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f1586p * clientWidth;
        float f13 = this.f1587q * clientWidth;
        ArrayList arrayList = this.f1574b;
        boolean z11 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) u.p(1, arrayList);
        if (cVar.f29769b != 0) {
            f12 = cVar.f29772e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (cVar2.f29769b != this.f1577e.c() - 1) {
            f13 = cVar2.f29772e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z3) {
                this.L.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.M.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i4 = (int) scrollX;
        this.B = (scrollX - i4) + this.B;
        scrollTo(i4, getScrollY());
        n(i4);
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.T);
        Scroller scroller = this.f1580i;
        if (scroller != null && !scroller.isFinished()) {
            this.f1580i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        float f10;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.f1582l <= 0 || this.f1583m == null) {
            return;
        }
        ArrayList arrayList2 = this.f1574b;
        if (arrayList2.size() <= 0 || this.f1577e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f1582l / width;
        int i11 = 0;
        c cVar = (c) arrayList2.get(0);
        float f12 = cVar.f29772e;
        int size = arrayList2.size();
        int i12 = cVar.f29769b;
        int i13 = ((c) arrayList2.get(size - 1)).f29769b;
        while (i12 < i13) {
            while (true) {
                i4 = cVar.f29769b;
                if (i12 <= i4 || i11 >= size) {
                    break;
                }
                i11++;
                cVar = (c) arrayList2.get(i11);
            }
            if (i12 == i4) {
                float f13 = cVar.f29772e;
                float f14 = cVar.f29771d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.f1577e.getClass();
                f10 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.f1582l + f10 > scrollX) {
                arrayList = arrayList2;
                i10 = scrollX;
                this.f1583m.setBounds(Math.round(f10), this.f1584n, Math.round(this.f1582l + f10), this.f1585o);
                this.f1583m.draw(canvas);
            } else {
                arrayList = arrayList2;
                i10 = scrollX;
            }
            if (f10 > i10 + r3) {
                return;
            }
            i12++;
            arrayList2 = arrayList;
            scrollX = i10;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f1593w) {
                return true;
            }
            if (this.f1594x) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.D = x10;
            this.B = x10;
            float y10 = motionEvent.getY();
            this.E = y10;
            this.C = y10;
            this.F = motionEvent.getPointerId(0);
            this.f1594x = false;
            this.j = true;
            Scroller scroller = this.f1580i;
            scroller.computeScrollOffset();
            if (this.U != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.K) {
                d(false);
                this.f1593w = false;
            } else {
                scroller.abortAnimation();
                this.f1591u = false;
                p();
                this.f1593w = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.F;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.B;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.E);
                if (f10 != 0.0f) {
                    float f11 = this.B;
                    if ((f11 >= this.f1596z || f10 <= 0.0f) && ((f11 <= getWidth() - this.f1596z || f10 >= 0.0f) && c(this, false, (int) f10, (int) x11, (int) y11))) {
                        this.B = x11;
                        this.C = y11;
                        this.f1594x = true;
                        return false;
                    }
                }
                int i10 = this.A;
                float f12 = i10;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.f1593w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.D;
                    float f14 = i10;
                    this.B = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.C = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.f1594x = true;
                }
                if (this.f1593w && o(x11)) {
                    WeakHashMap weakHashMap = v0.f22405a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        return this.f1593w;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        d dVar;
        d dVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.f1596z = Math.min(measuredWidth / 10, this.f1595y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z3 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f29773a) {
                int i14 = dVar2.f29774b;
                int i15 = i14 & 7;
                int i16 = i14 & AppLovinMediationAdapter.ERROR_CHILD_USER;
                boolean z10 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z3 = false;
                }
                int i17 = LinearLayoutManager.INVALID_OFFSET;
                if (z10) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1588r = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1589s = true;
        p();
        this.f1589s = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f29773a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.f29775c), 1073741824), this.f1588r);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i10;
        int i11;
        int i12;
        c cVarH;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f29769b == this.f1578f && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f28876a);
        if (this.f1577e != null) {
            u(fVar.f29777c, 0, false, true);
        } else {
            this.g = fVar.f29777c;
            this.f1579h = fVar.f29778d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f29777c = this.f1578f;
        a aVar = this.f1577e;
        if (aVar != null) {
            aVar.getClass();
            fVar.f29778d = null;
        }
        return fVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        if (i4 != i11) {
            int i13 = this.f1582l;
            r(i4, i11, i13, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        q(this.f1578f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[PHI: r7 r11 r15
  0x00c3: PHI (r7v16 int) = (r7v15 int), (r7v5 int), (r7v19 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145 A[PHI: r3 r12
  0x0145: PHI (r3v21 float) = (r3v19 float), (r3v20 float), (r3v18 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i4, int i10, int i11, int i12) {
        if (i10 > 0 && !this.f1574b.isEmpty()) {
            if (!this.f1580i.isFinished()) {
                this.f1580i.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        c cVarJ = j(this.f1578f);
        int iMin = (int) ((cVarJ != null ? Math.min(cVarJ.f29772e, this.f1587q) : 0.0f) * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f1589s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.F = -1;
        this.f1593w = false;
        this.f1594x = false;
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G = null;
        }
        this.L.onRelease();
        this.M.onRelease();
        return this.L.isFinished() || this.M.isFinished();
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f1574b;
        a aVar2 = this.f1577e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f29767b = null;
            }
            this.f1577e.i(this);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                c cVar = (c) arrayList.get(i4);
                a aVar3 = this.f1577e;
                int i10 = cVar.f29769b;
                aVar3.a(cVar.f29768a);
            }
            this.f1577e.b();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((d) getChildAt(i11).getLayoutParams()).f29773a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f1578f = 0;
            scrollTo(0, 0);
        }
        this.f1577e = aVar;
        this.f1573a = 0;
        if (aVar != null) {
            if (this.f1581k == null) {
                this.f1581k = new jd.e(2, this);
            }
            this.f1577e.h(this.f1581k);
            this.f1591u = false;
            boolean z3 = this.N;
            this.N = true;
            this.f1573a = this.f1577e.c();
            if (this.g >= 0) {
                this.f1577e.getClass();
                u(this.g, 0, false, true);
                this.g = -1;
                this.f1579h = null;
            } else if (z3) {
                requestLayout();
            } else {
                p();
            }
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.S.size();
        for (int i12 = 0; i12 < size; i12++) {
            jd.b bVar = (jd.b) this.S.get(i12);
            TabLayout tabLayout = bVar.f27498b;
            if (tabLayout.O == this) {
                tabLayout.i(aVar, bVar.f27497a);
            }
        }
    }

    public void setCurrentItem(int i4) {
        this.f1591u = false;
        u(i4, 0, !this.N, false);
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.f1592v) {
            this.f1592v = i4;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.R = eVar;
    }

    public void setPageMargin(int i4) {
        int i10 = this.f1582l;
        this.f1582l = i4;
        int width = getWidth();
        r(width, width, i4, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1583m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i4) {
        if (this.U == i4) {
            return;
        }
        this.U = i4;
        e eVar = this.R;
        if (eVar != null) {
            eVar.a(i4);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.Q.get(i10);
                if (eVar2 != null) {
                    eVar2.a(i4);
                }
            }
        }
    }

    public final void t(int i4, int i10, boolean z3, boolean z10) {
        int scrollX;
        int iAbs;
        c cVarJ = j(i4);
        int iMax = cVarJ != null ? (int) (Math.max(this.f1586p, Math.min(cVarJ.f29772e, this.f1587q)) * getClientWidth()) : 0;
        if (!z3) {
            if (z10) {
                f(i4);
            }
            d(false);
            scrollTo(iMax, 0);
            n(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1580i;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.j ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = iMax - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i14 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i14;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i10);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f1577e.getClass();
                    iAbs = (int) (((Math.abs(i12) / ((f10 * 1.0f) + this.f1582l)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.j = false;
                this.f1580i.startScroll(i11, scrollY, i12, i13, iMin);
                WeakHashMap weakHashMap = v0.f22405a;
                postInvalidateOnAnimation();
            }
        }
        if (z10) {
            f(i4);
        }
    }

    public final void u(int i4, int i10, boolean z3, boolean z10) throws Resources.NotFoundException {
        a aVar = this.f1577e;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f1574b;
        if (!z10 && this.f1578f == i4 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= this.f1577e.c()) {
            i4 = this.f1577e.c() - 1;
        }
        int i11 = this.f1592v;
        int i12 = this.f1578f;
        if (i4 > i12 + i11 || i4 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c) arrayList.get(i13)).f29770c = true;
            }
        }
        boolean z11 = this.f1578f != i4;
        if (!this.N) {
            q(i4);
            t(i4, i10, z3, z11);
        } else {
            this.f1578f = i4;
            if (z11) {
                f(i4);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1583m;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f29775c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V);
        dVar.f29774b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i4) {
        setPageMarginDrawable(getContext().getDrawable(i4));
    }
}
