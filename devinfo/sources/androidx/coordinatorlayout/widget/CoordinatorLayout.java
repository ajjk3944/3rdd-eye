package androidx.coordinatorlayout.widget;

import a0.x0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.z0;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.liuzh.deviceinfo.R;
import d4.e;
import e4.c2;
import e4.k0;
import e4.m0;
import e4.q;
import e4.r;
import e4.v0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import nm.d0;
import o3.a;
import p3.c;
import p3.d;
import p3.f;
import p3.g;
import q8.b;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {

    /* renamed from: t, reason: collision with root package name */
    public static final String f871t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f872u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f873v;

    /* renamed from: w, reason: collision with root package name */
    public static final m f874w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f875x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f876a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f877b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f878c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f879d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f880e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f881f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f882h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f883i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public View f884k;

    /* renamed from: l, reason: collision with root package name */
    public b f885l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f886m;

    /* renamed from: n, reason: collision with root package name */
    public c2 f887n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f888o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f889p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f890q;

    /* renamed from: r, reason: collision with root package name */
    public d0 f891r;

    /* renamed from: s, reason: collision with root package name */
    public final z0 f892s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f871t = r02 != null ? r02.getName() : null;
        f874w = new m(14);
        f872u = new Class[]{Context.class, AttributeSet.class};
        f873v = new ThreadLocal();
        f875x = new e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f876a = new ArrayList();
        this.f877b = new x0(24);
        this.f878c = new ArrayList();
        this.f879d = new ArrayList();
        this.f880e = new int[2];
        this.f881f = new int[2];
        this.f892s = new z0();
        int[] iArr = a.f30406a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f883i = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                coordinatorLayout.f883i[i4] = (int) (r1[i4] * f10);
            }
        }
        coordinatorLayout.f889p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = v0.f22405a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f875x.k();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i4, Rect rect, Rect rect2, p3.e eVar, int i10, int i11) {
        int i12 = eVar.f31149c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i4);
        int i13 = eVar.f31150d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & AppLovinMediationAdapter.ERROR_CHILD_USER) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i4);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & AppLovinMediationAdapter.ERROR_CHILD_USER;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & AppLovinMediationAdapter.ERROR_CHILD_USER;
        int iWidth = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p3.e o(View view) {
        p3.e eVar = (p3.e) view.getLayoutParams();
        if (!eVar.f31148b) {
            if (view instanceof p3.a) {
                p3.b behavior = ((p3.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                p3.b bVar = eVar.f31147a;
                if (bVar != behavior) {
                    if (bVar != null) {
                        bVar.j();
                    }
                    eVar.f31147a = behavior;
                    eVar.f31148b = true;
                    if (behavior != null) {
                        behavior.g(eVar);
                    }
                }
                eVar.f31148b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    p3.b bVar2 = (p3.b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    p3.b bVar3 = eVar.f31147a;
                    if (bVar3 != bVar2) {
                        if (bVar3 != null) {
                            bVar3.j();
                        }
                        eVar.f31147a = bVar2;
                        eVar.f31148b = true;
                        if (bVar2 != null) {
                            bVar2.g(eVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            eVar.f31148b = true;
        }
        return eVar;
    }

    public static void w(int i4, View view) {
        p3.e eVar = (p3.e) view.getLayoutParams();
        int i10 = eVar.f31154i;
        if (i10 != i4) {
            WeakHashMap weakHashMap = v0.f22405a;
            view.offsetLeftAndRight(i4 - i10);
            eVar.f31154i = i4;
        }
    }

    public static void x(int i4, View view) {
        p3.e eVar = (p3.e) view.getLayoutParams();
        int i10 = eVar.j;
        if (i10 != i4) {
            WeakHashMap weakHashMap = v0.f22405a;
            view.offsetTopAndBottom(i4 - i10);
            eVar.j = i4;
        }
    }

    public final void b(p3.e eVar, Rect rect, int i4, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i4 + iMax, i10 + iMax2);
    }

    @Override // e4.q
    public final void c(int i4, View view) {
        z0 z0Var = this.f892s;
        if (i4 == 1) {
            z0Var.f1564b = 0;
        } else {
            z0Var.f1563a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p3.e eVar = (p3.e) childAt.getLayoutParams();
            if (eVar.a(i4)) {
                p3.b bVar = eVar.f31147a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i4);
                }
                if (i4 == 0) {
                    eVar.f31157m = false;
                } else if (i4 == 1) {
                    eVar.f31158n = false;
                }
                eVar.f31159o = false;
            }
        }
        this.f884k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p3.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // e4.r
    public final void d(View view, int i4, int i10, int i11, int i12, int i13, int[] iArr) {
        p3.b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z3 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                p3.e eVar = (p3.e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f31147a) != null) {
                    int[] iArr2 = this.f880e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, i10, i11, i12, iArr2);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z3) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        p3.b bVar = ((p3.e) view.getLayoutParams()).f31147a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f889p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // e4.q
    public final void e(View view, int i4, int i10, int i11, int i12, int i13) {
        d(view, i4, i10, i11, i12, 0, this.f881f);
    }

    @Override // e4.q
    public final boolean f(View view, View view2, int i4, int i10) {
        View view3;
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z3 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i11 = i4;
                i12 = i10;
            } else {
                p3.e eVar = (p3.e) childAt.getLayoutParams();
                p3.b bVar = eVar.f31147a;
                if (bVar != null) {
                    view3 = view;
                    i11 = i4;
                    i12 = i10;
                    boolean zT = bVar.t(this, childAt, view3, i11, i12);
                    z3 |= zT;
                    if (i12 == 0) {
                        eVar.f31157m = zT;
                    } else if (i12 == 1) {
                        eVar.f31158n = zT;
                    }
                } else {
                    view3 = view;
                    i11 = i4;
                    i12 = i10;
                    if (i12 == 0) {
                        eVar.f31157m = false;
                    } else if (i12 == 1) {
                        eVar.f31158n = false;
                    }
                }
            }
            i13++;
            view = view3;
            i4 = i11;
            i10 = i12;
        }
        return z3;
    }

    @Override // e4.q
    public final void g(View view, View view2, int i4, int i10) {
        z0 z0Var = this.f892s;
        if (i10 == 1) {
            z0Var.f1564b = i4;
        } else {
            z0Var.f1563a = i4;
        }
        this.f884k = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((p3.e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p3.e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p3.e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return DesugarCollections.unmodifiableList(this.f876a);
    }

    public final c2 getLastWindowInsets() {
        return this.f887n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        z0 z0Var = this.f892s;
        return z0Var.f1564b | z0Var.f1563a;
    }

    public Drawable getStatusBarBackground() {
        return this.f889p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // e4.q
    public final void h(View view, int i4, int i10, int[] iArr, int i11) {
        p3.b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                p3.e eVar = (p3.e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f31147a) != null) {
                    int[] iArr2 = this.f880e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, view, i4, i10, iArr2, i11);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z3) {
            q(1);
        }
    }

    public final void i(View view) {
        List list = (List) ((n0) this.f877b.f145b).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            View view2 = (View) list.get(i4);
            p3.b bVar = ((p3.e) view2.getLayoutParams()).f31147a;
            if (bVar != null) {
                bVar.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            l(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        n0 n0Var = (n0) this.f877b.f145b;
        int i4 = n0Var.f36920c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i4; i10++) {
            ArrayList arrayList2 = (ArrayList) n0Var.j(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(n0Var.f(i10));
            }
        }
        ArrayList arrayList3 = this.f879d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = g.f31162a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f31162a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f31163b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i4) {
        int[] iArr = this.f883i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f886m) {
            if (this.f885l == null) {
                this.f885l = new b(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f885l);
        }
        if (this.f887n == null) {
            WeakHashMap weakHashMap = v0.f22405a;
            if (getFitsSystemWindows()) {
                k0.c(this);
            }
        }
        this.f882h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f886m && this.f885l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f885l);
        }
        View view = this.f884k;
        if (view != null) {
            c(0, view);
        }
        this.f882h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f888o || this.f889p == null) {
            return;
        }
        c2 c2Var = this.f887n;
        int iD = c2Var != null ? c2Var.d() : 0;
        if (iD > 0) {
            this.f889p.setBounds(0, 0, getWidth(), iD);
            this.f889p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        p3.b bVar;
        WeakHashMap weakHashMap = v0.f22405a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f876a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((p3.e) view.getLayoutParams()).f31147a) == null || !bVar.l(this, view, layoutDirection))) {
                r(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                p3.e eVar = (p3.e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    p3.b bVar = eVar.f31147a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        p3.b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                p3.e eVar = (p3.e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f31147a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i10, int[] iArr) {
        h(view, i4, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i10, int i11, int i12) {
        e(view, i4, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        g(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f28876a);
        SparseArray sparseArray = fVar.f31161c;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            p3.b bVar = o(childAt).f31147a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            p3.b bVar = ((p3.e) childAt.getLayoutParams()).f31147a;
            if (id2 != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id2, parcelableS);
            }
        }
        fVar.f31161c = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            p3.e r6 = (p3.e) r6
            p3.b r6 = r6.f31147a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.j
            boolean r6 = r6.v(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.v(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i4, int i10) {
        e eVar = f875x;
        Rect rectA = a();
        l(rectA, view);
        try {
            return rectA.contains(i4, i10);
        } finally {
            rectA.setEmpty();
            eVar.i(rectA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r23) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q(int):void");
    }

    public final void r(int i4, View view) {
        Rect rectA;
        Rect rectA2;
        p3.e eVar = (p3.e) view.getLayoutParams();
        View view2 = eVar.f31155k;
        if (view2 == null && eVar.f31152f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        e eVar2 = f875x;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                l(rectA, view2);
                p3.e eVar3 = (p3.e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i4, rectA, rectA2, eVar3, measuredWidth, measuredHeight);
                b(eVar3, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                eVar2.i(rectA);
                rectA2.setEmpty();
                eVar2.i(rectA2);
            }
        }
        int i10 = eVar.f31151e;
        if (i10 < 0) {
            p3.e eVar4 = (p3.e) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin);
            if (this.f887n != null) {
                WeakHashMap weakHashMap = v0.f22405a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA.left = this.f887n.b() + rectA.left;
                    rectA.top = this.f887n.d() + rectA.top;
                    rectA.right -= this.f887n.c();
                    rectA.bottom -= this.f887n.a();
                }
            }
            rectA2 = a();
            int i11 = eVar4.f31149c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & AppLovinMediationAdapter.ERROR_CHILD_USER) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i4);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        p3.e eVar5 = (p3.e) view.getLayoutParams();
        int i12 = eVar5.f31149c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i4);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & AppLovinMediationAdapter.ERROR_CHILD_USER;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i4 == 1) {
            i10 = width - i10;
        }
        int iN = n(i10) - measuredWidth2;
        if (i13 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i13 == 5) {
            iN += measuredWidth2;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar5).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar5).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar5).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        p3.b bVar = ((p3.e) view.getLayoutParams()).f31147a;
        if (bVar == null || !bVar.q(this, view, rect, z3)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.g) {
            return;
        }
        v(false);
        this.g = true;
    }

    public final void s(int i4, int i10, int i11, View view) {
        measureChildWithMargins(view, i4, i10, i11, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f890q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f889p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f889p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f889p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f889p;
                WeakHashMap weakHashMap = v0.f22405a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f889p.setVisible(getVisibility() == 0, false);
                this.f889p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = v0.f22405a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? getContext().getDrawable(i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f889p;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f889p.setVisible(z3, false);
    }

    public final boolean t(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f878c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        m mVar = f874w;
        if (mVar != null) {
            Collections.sort(arrayList, mVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            p3.b bVar = ((p3.e) view.getLayoutParams()).f31147a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i4 == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i4 == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i4 == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.j = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            p3.b bVar = ((p3.e) childAt.getLayoutParams()).f31147a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((p3.e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f889p;
    }

    public final void y() {
        WeakHashMap weakHashMap = v0.f22405a;
        if (!getFitsSystemWindows()) {
            m0.j(this, null);
            return;
        }
        if (this.f891r == null) {
            this.f891r = new d0(3, this);
        }
        m0.j(this, this.f891r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p3.e ? new p3.e((p3.e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p3.e((ViewGroup.MarginLayoutParams) layoutParams) : new p3.e(layoutParams);
    }
}
