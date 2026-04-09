package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import b4.d;
import com.google.android.material.datepicker.k;
import com.google.android.material.tabs.TabLayout;
import h0.b;
import i3.g;
import ie.e;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import om.f;
import pb.l0;
import sm.i;
import u3.i0;
import u3.z;
import x7.c;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: u0, reason: collision with root package name */
    public static final int[] f2118u0 = {R.attr.layout_gravity};

    /* renamed from: v0, reason: collision with root package name */
    public static final i f2119v0 = new i(3);

    /* renamed from: w0, reason: collision with root package name */
    public static final d f2120w0 = new d(2);
    public int B;
    public Parcelable D;
    public final Scroller E;
    public boolean F;
    public e G;
    public int H;
    public Drawable I;
    public int J;
    public int K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public final int T;
    public int U;
    public final int V;
    public boolean W;

    /* renamed from: a, reason: collision with root package name */
    public int f2121a;

    /* renamed from: a0, reason: collision with root package name */
    public float f2122a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f2123b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f2124c0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2125d;

    /* renamed from: d0, reason: collision with root package name */
    public float f2126d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f2127e0;

    /* renamed from: f0, reason: collision with root package name */
    public VelocityTracker f2128f0;

    /* renamed from: g, reason: collision with root package name */
    public final c f2129g;

    /* renamed from: g0, reason: collision with root package name */
    public final int f2130g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f2131h0;

    /* renamed from: i0, reason: collision with root package name */
    public final int f2132i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f2133j0;

    /* renamed from: k0, reason: collision with root package name */
    public final EdgeEffect f2134k0;

    /* renamed from: l0, reason: collision with root package name */
    public final EdgeEffect f2135l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2136m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2137n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2138o0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f2139p0;

    /* renamed from: q0, reason: collision with root package name */
    public x7.e f2140q0;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2141r;

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList f2142r0;

    /* renamed from: s0, reason: collision with root package name */
    public final l0 f2143s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2144t0;

    /* renamed from: x, reason: collision with root package name */
    public x7.a f2145x;

    /* renamed from: y, reason: collision with root package name */
    public int f2146y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public int f2147g;

        /* renamed from: r, reason: collision with root package name */
        public Parcelable f2148r;

        /* renamed from: x, reason: collision with root package name */
        public final ClassLoader f2149x;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f2147g = parcel.readInt();
            this.f2148r = parcel.readParcelable(classLoader);
            this.f2149x = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return b.i(this.f2147g, "}", sb2);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2147g);
            parcel.writeParcelable(this.f2148r, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2125d = new ArrayList();
        this.f2129g = new c();
        this.f2141r = new Rect();
        this.B = -1;
        this.D = null;
        this.L = -3.4028235E38f;
        this.M = Float.MAX_VALUE;
        this.Q = 1;
        this.W = true;
        this.f2127e0 = -1;
        this.f2136m0 = true;
        this.f2143s0 = new l0(7, this);
        this.f2144t0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.E = new Scroller(context, f2120w0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.V = viewConfiguration.getScaledPagingTouchSlop();
        this.f2130g0 = (int) (400.0f * f10);
        this.f2131h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2134k0 = new EdgeEffect(context);
        this.f2135l0 = new EdgeEffect(context);
        this.f2132i0 = (int) (25.0f * f10);
        this.f2133j0 = (int) (2.0f * f10);
        this.T = (int) (f10 * 16.0f);
        i0.n(this, new k(3, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        z.j(this, new f(this));
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (!(view instanceof ViewGroup)) {
            return z10 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i14 = i11 + scrollX;
            if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z10 || !view.canScrollHorizontally(-i10)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
        }
    }

    public final c a(int i10, int i11) {
        c cVar = new c();
        cVar.f25060b = i10;
        cVar.f25059a = this.f2145x.e(this, i10);
        this.f2145x.getClass();
        cVar.f25062d = 1.0f;
        ArrayList arrayList = this.f2125d;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(cVar);
            return cVar;
        }
        arrayList.add(i11, cVar);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c cVarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f25060b == this.f2146y) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c cVarH;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f25060b == this.f2146y) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        x7.d dVar = (x7.d) layoutParams;
        boolean z10 = dVar.f25064a | (view.getClass().getAnnotation(x7.b.class) != null);
        dVar.f25064a = z10;
        if (!this.N) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.f25067d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r8) throws java.lang.InterruptedException, android.content.res.Resources.NotFoundException {
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
            io.sentry.android.core.e0.d(r2, r0)
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
            android.graphics.Rect r6 = r7.f2141r
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.g(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.g(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.f2146y
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.P = r3
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
            int r0 = r7.f2146y
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.P = r3
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
    public final boolean canScrollHorizontally(int i10) {
        if (this.f2145x == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.L)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.M));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof x7.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() throws InterruptedException {
        this.F = true;
        if (this.E.isFinished() || !this.E.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.E.getCurrX();
        int currY = this.E.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                this.E.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z10) throws InterruptedException {
        boolean z11 = this.f2144t0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.E;
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
        this.P = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2125d;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f25061c) {
                cVar.f25061c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            l0 l0Var = this.f2143s0;
            if (!z10) {
                l0Var.run();
            } else {
                WeakHashMap weakHashMap = i0.f23177a;
                postOnAnimation(l0Var);
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
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws java.lang.InterruptedException, android.content.res.Resources.NotFoundException {
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
            int r6 = r5.f2146y
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.P = r2
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f25060b == this.f2146y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        x7.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2145x) != null && aVar.c() > 1)) {
            if (!this.f2134k0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.L * width);
                this.f2134k0.setSize(height, width);
                zDraw = this.f2134k0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f2135l0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.M + 1.0f)) * width2);
                this.f2135l0.setSize(height2, width2);
                zDraw |= this.f2135l0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f2134k0.finish();
            this.f2135l0.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int iC = this.f2145x.c();
        this.f2121a = iC;
        ArrayList arrayList = this.f2125d;
        boolean z10 = arrayList.size() < (this.Q * 2) + 1 && arrayList.size() < iC;
        int i10 = this.f2146y;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar = (c) arrayList.get(i11);
            x7.a aVar = this.f2145x;
            Object obj = cVar.f25059a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f2119v0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                x7.d dVar = (x7.d) getChildAt(i12).getLayoutParams();
                if (!dVar.f25064a) {
                    dVar.f25066c = 0.0f;
                }
            }
            u(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i10) {
        x7.e eVar = this.f2140q0;
        if (eVar != null) {
            eVar.b(i10);
        }
        ArrayList arrayList = this.f2139p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                x7.e eVar2 = (x7.e) this.f2139p0.get(i11);
                if (eVar2 != null) {
                    eVar2.b(i10);
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
        x7.d dVar = new x7.d(-1, -1);
        dVar.f25066c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public x7.a getAdapter() {
        return this.f2145x;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2146y;
    }

    public int getOffscreenPageLimit() {
        return this.Q;
    }

    public int getPageMargin() {
        return this.H;
    }

    public final c h(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2125d;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (this.f2145x.f(view, cVar.f25059a)) {
                return cVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.c i() {
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
            int r3 = r13.H
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
            java.util.ArrayList r10 = r13.f2125d
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            x7.c r11 = (x7.c) r11
            if (r9 != 0) goto L4c
            int r12 = r11.f25060b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            x7.c r4 = r13.f2129g
            r4.f25063e = r1
            r4.f25060b = r6
            x7.a r1 = r13.f2145x
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.f25062d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.f25063e
            float r4 = r6.f25062d
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
            int r4 = r6.f25060b
            float r7 = r6.f25062d
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.i():x7.c");
    }

    public final c j(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2125d;
            if (i11 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar.f25060b == i10) {
                return cVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f2138o0
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
            x7.d r8 = (x7.d) r8
            boolean r9 = r8.f25064a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f25065b
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
            x7.e r14 = r11.f2140q0
            if (r14 == 0) goto L73
            r14.c(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.f2139p0
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.f2139p0
            java.lang.Object r2 = r2.get(r0)
            x7.e r2 = (x7.e) r2
            if (r2 == 0) goto L8a
            r2.c(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.f2137n0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int, float, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2127e0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2122a0 = motionEvent.getX(i10);
            this.f2127e0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2128f0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() throws InterruptedException, Resources.NotFoundException {
        x7.a aVar = this.f2145x;
        if (aVar == null || this.f2146y >= aVar.c() - 1) {
            return false;
        }
        int i10 = this.f2146y + 1;
        this.P = false;
        u(i10, 0, true, false);
        return true;
    }

    public final boolean n(int i10) {
        if (this.f2125d.size() == 0) {
            if (!this.f2136m0) {
                this.f2137n0 = false;
                k(0, 0.0f, 0);
                if (!this.f2137n0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c cVarI = i();
        int clientWidth = getClientWidth();
        int i11 = this.H;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = cVarI.f25060b;
        float f11 = ((i10 / f10) - cVarI.f25063e) / (cVarI.f25062d + (i11 / f10));
        this.f2137n0 = false;
        k(i13, f11, (int) (i12 * f11));
        if (this.f2137n0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f10, float f11) {
        boolean z10;
        float f12 = this.f2122a0 - f10;
        this.f2122a0 = f10;
        float height = f11 / getHeight();
        float width = f12 / getWidth();
        float fY = (g.r(this.f2134k0) != 0.0f ? -g.y(this.f2134k0, -width, 1.0f - height) : g.r(this.f2135l0) != 0.0f ? g.y(this.f2135l0, width, height) : 0.0f) * getWidth();
        float f13 = f12 - fY;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = fY != 0.0f;
        if (Math.abs(f13) < 1.0E-4f) {
            return z13;
        }
        float scrollX = getScrollX() + f13;
        float clientWidth = getClientWidth();
        float f14 = this.L * clientWidth;
        float f15 = this.M * clientWidth;
        ArrayList arrayList = this.f2125d;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) b.f(1, arrayList);
        if (cVar.f25060b != 0) {
            f14 = cVar.f25063e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f25060b != this.f2145x.c() - 1) {
            f15 = cVar2.f25063e * clientWidth;
        } else {
            z12 = true;
        }
        if (scrollX < f14) {
            if (z10) {
                g.y(this.f2134k0, (f14 - scrollX) / clientWidth, 1.0f - (f11 / getHeight()));
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f14;
        } else if (scrollX > f15) {
            if (z12) {
                g.y(this.f2135l0, (scrollX - f15) / clientWidth, f11 / getHeight());
            } else {
                z11 = z13;
            }
            z13 = z11;
            scrollX = f15;
        }
        int i10 = (int) scrollX;
        this.f2122a0 = (scrollX - i10) + this.f2122a0;
        scrollTo(i10, getScrollY());
        n(i10);
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2136m0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2143s0);
        Scroller scroller = this.E;
        if (scroller != null && !scroller.isFinished()) {
            this.E.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        ArrayList arrayList;
        int i11;
        super.onDraw(canvas);
        if (this.H <= 0 || this.I == null) {
            return;
        }
        ArrayList arrayList2 = this.f2125d;
        if (arrayList2.size() <= 0 || this.f2145x == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.H / width;
        int i12 = 0;
        c cVar = (c) arrayList2.get(0);
        float f12 = cVar.f25063e;
        int size = arrayList2.size();
        int i13 = cVar.f25060b;
        int i14 = ((c) arrayList2.get(size - 1)).f25060b;
        while (i13 < i14) {
            while (true) {
                i10 = cVar.f25060b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                cVar = (c) arrayList2.get(i12);
            }
            if (i13 == i10) {
                float f13 = cVar.f25063e;
                float f14 = cVar.f25062d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.f2145x.getClass();
                f10 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.H + f10 > scrollX) {
                arrayList = arrayList2;
                i11 = scrollX;
                this.I.setBounds(Math.round(f10), this.J, Math.round(this.H + f10), this.K);
                this.I.draw(canvas);
            } else {
                arrayList = arrayList2;
                i11 = scrollX;
            }
            if (f10 > i11 + r3) {
                return;
            }
            i13++;
            arrayList2 = arrayList;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws InterruptedException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.R) {
                return true;
            }
            if (this.S) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f2124c0 = x10;
            this.f2122a0 = x10;
            float y10 = motionEvent.getY();
            this.f2126d0 = y10;
            this.f2123b0 = y10;
            this.f2127e0 = motionEvent.getPointerId(0);
            this.S = false;
            this.F = true;
            this.E.computeScrollOffset();
            if (this.f2144t0 == 2 && Math.abs(this.E.getFinalX() - this.E.getCurrX()) > this.f2133j0) {
                this.E.abortAnimation();
                this.P = false;
                p();
                this.R = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else if (g.r(this.f2134k0) == 0.0f && g.r(this.f2135l0) == 0.0f) {
                d(false);
                this.R = false;
            } else {
                this.R = true;
                setScrollState(1);
                if (g.r(this.f2134k0) != 0.0f) {
                    g.y(this.f2134k0, 0.0f, 1.0f - (this.f2123b0 / getHeight()));
                }
                if (g.r(this.f2135l0) != 0.0f) {
                    g.y(this.f2135l0, 0.0f, this.f2123b0 / getHeight());
                }
            }
        } else if (action == 2) {
            int i10 = this.f2127e0;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f2122a0;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f2126d0);
                if (f10 != 0.0f) {
                    float f11 = this.f2122a0;
                    if ((this.W || ((f11 >= this.U || f10 <= 0.0f) && (f11 <= getWidth() - this.U || f10 >= 0.0f))) && c((int) f10, (int) x11, (int) y11, this, false)) {
                        this.f2122a0 = x11;
                        this.f2123b0 = y11;
                        this.S = true;
                        return false;
                    }
                }
                float f12 = this.V;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.R = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    this.f2122a0 = f10 > 0.0f ? this.f2124c0 + this.V : this.f2124c0 - this.V;
                    this.f2123b0 = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.S = true;
                }
                if (this.R && o(x11, y11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f2128f0 == null) {
            this.f2128f0 = VelocityTracker.obtain();
        }
        this.f2128f0.addMovement(motionEvent);
        return this.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        x7.d dVar;
        x7.d dVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.U = Math.min(measuredWidth / 10, this.T);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (dVar2 = (x7.d) childAt.getLayoutParams()) != null && dVar2.f25064a) {
                int i15 = dVar2.f25065b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.N = true;
        p();
        this.N = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((dVar = (x7.d) childAt2.getLayoutParams()) == null || !dVar.f25064a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.f25066c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c cVarH;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (cVarH = h(childAt)) != null && cVarH.f25060b == this.f2146y && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws InterruptedException, Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        if (this.f2145x != null) {
            u(savedState.f2147g, 0, false, true);
        } else {
            this.B = savedState.f2147g;
            this.D = savedState.f2148r;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2147g = this.f2146y;
        if (this.f2145x != null) {
            savedState.f2148r = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) throws InterruptedException {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.H;
            r(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws java.lang.InterruptedException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        q(this.f2146y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[PHI: r7 r11 r15
  0x00c3: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145 A[PHI: r3 r12
  0x0145: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i10, int i11, int i12, int i13) throws InterruptedException {
        if (i11 > 0 && !this.f2125d.isEmpty()) {
            if (!this.E.isFinished()) {
                this.E.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        c cVarJ = j(this.f2146y);
        int iMin = (int) ((cVarJ != null ? Math.min(cVarJ.f25063e, this.M) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.N) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f2127e0 = -1;
        this.R = false;
        this.S = false;
        VelocityTracker velocityTracker = this.f2128f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2128f0 = null;
        }
        this.f2134k0.onRelease();
        this.f2135l0.onRelease();
        return (this.f2134k0.isFinished() && this.f2135l0.isFinished()) ? false : true;
    }

    public void setAdapter(x7.a aVar) throws InterruptedException, Resources.NotFoundException {
        ArrayList arrayList = this.f2125d;
        x7.a aVar2 = this.f2145x;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f2145x.h(this);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c cVar = (c) arrayList.get(i10);
                x7.a aVar3 = this.f2145x;
                int i11 = cVar.f25060b;
                aVar3.a(this, cVar.f25059a);
            }
            this.f2145x.b();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((x7.d) getChildAt(i12).getLayoutParams()).f25064a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f2146y = 0;
            scrollTo(0, 0);
        }
        this.f2145x = aVar;
        this.f2121a = 0;
        if (aVar != null) {
            if (this.G == null) {
                this.G = new e(2, this);
            }
            synchronized (this.f2145x) {
            }
            this.P = false;
            boolean z10 = this.f2136m0;
            this.f2136m0 = true;
            this.f2121a = this.f2145x.c();
            if (this.B >= 0) {
                this.f2145x.getClass();
                u(this.B, 0, false, true);
                this.B = -1;
                this.D = null;
            } else if (z10) {
                requestLayout();
            } else {
                p();
            }
        }
        ArrayList arrayList2 = this.f2142r0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f2142r0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ie.b bVar = (ie.b) this.f2142r0.get(i13);
            TabLayout tabLayout = bVar.f11340b;
            if (tabLayout.f5728n0 == this) {
                tabLayout.g(aVar, bVar.f11339a);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.P = false;
        u(i10, 0, !this.f2136m0, false);
    }

    public void setDragInGutterEnabled(boolean z10) {
        this.W = z10;
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            e0.p("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.Q) {
            this.Q = i10;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(x7.e eVar) {
        this.f2140q0 = eVar;
    }

    public void setPageMargin(int i10) throws InterruptedException {
        int i11 = this.H;
        this.H = i10;
        int width = getWidth();
        r(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.I = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f2144t0 == i10) {
            return;
        }
        this.f2144t0 = i10;
        x7.e eVar = this.f2140q0;
        if (eVar != null) {
            eVar.a(i10);
        }
        ArrayList arrayList = this.f2139p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                x7.e eVar2 = (x7.e) this.f2139p0.get(i11);
                if (eVar2 != null) {
                    eVar2.a(i10);
                }
            }
        }
    }

    public final void t(int i10, int i11, boolean z10, boolean z11) throws InterruptedException {
        int scrollX;
        int iAbs;
        c cVarJ = j(i10);
        int iMax = cVarJ != null ? (int) (Math.max(this.L, Math.min(cVarJ.f25063e, this.M)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                f(i10);
            }
            d(false);
            scrollTo(iMax, 0);
            n(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.E;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.F ? this.E.getCurrX() : this.E.getStartX();
                this.E.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f2145x.getClass();
                    iAbs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.H)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.F = false;
                this.E.startScroll(i12, scrollY, i13, i14, iMin);
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            f(i10);
        }
    }

    public final void u(int i10, int i11, boolean z10, boolean z11) throws InterruptedException, Resources.NotFoundException {
        x7.a aVar = this.f2145x;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f2125d;
        if (!z11 && this.f2146y == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f2145x.c()) {
            i10 = this.f2145x.c() - 1;
        }
        int i12 = this.Q;
        int i13 = this.f2146y;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f25061c = true;
            }
        }
        boolean z12 = this.f2146y != i10;
        if (!this.f2136m0) {
            q(i10);
            t(i10, i11, z10, z12);
        } else {
            this.f2146y = i10;
            if (z12) {
                f(i10);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        x7.d dVar = new x7.d(context, attributeSet);
        dVar.f25066c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2118u0);
        dVar.f25065b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
