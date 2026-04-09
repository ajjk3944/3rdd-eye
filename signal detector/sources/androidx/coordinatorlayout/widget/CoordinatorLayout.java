package androidx.coordinatorlayout.widget;

import A0.e;
import D.a;
import E.b;
import E.c;
import E.f;
import E.h;
import E.i;
import Q.d;
import R.C0187n;
import R.D;
import R.F;
import R.InterfaceC0185l;
import R.InterfaceC0186m;
import R.O;
import R.r0;
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
import c1.g;
import com.apm.insight.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u.C2940i;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0185l, InterfaceC0186m {

    /* renamed from: H, reason: collision with root package name */
    public static final String f5056H;

    /* renamed from: I, reason: collision with root package name */
    public static final Class[] f5057I;

    /* renamed from: J, reason: collision with root package name */
    public static final ThreadLocal f5058J;

    /* renamed from: K, reason: collision with root package name */
    public static final h f5059K;

    /* renamed from: L, reason: collision with root package name */
    public static final d f5060L;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5061C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f5062D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f5063E;

    /* renamed from: F, reason: collision with root package name */
    public e f5064F;

    /* renamed from: G, reason: collision with root package name */
    public final C0187n f5065G;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5066a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5067b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5068c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5069d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f5070e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5071f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5072g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5073h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public View f5074j;

    /* renamed from: k, reason: collision with root package name */
    public View f5075k;

    /* renamed from: l, reason: collision with root package name */
    public f f5076l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5077m;

    /* renamed from: n, reason: collision with root package name */
    public r0 f5078n;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f5056H = r02 != null ? r02.getName() : null;
        f5059K = new h(0);
        f5057I = new Class[]{Context.class, AttributeSet.class};
        f5058J = new ThreadLocal();
        f5060L = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f5066a = new ArrayList();
        this.f5067b = new g(1);
        this.f5068c = new ArrayList();
        this.f5069d = new ArrayList();
        this.f5070e = new int[2];
        this.f5071f = new int[2];
        this.f5065G = new C0187n();
        int[] iArr = a.f1199a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r1[i] * f2);
            }
        }
        this.f5062D = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new E.d(this));
        WeakHashMap weakHashMap = O.f3270a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f5060L.h();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i, Rect rect, Rect rect2, E.e eVar, int i3, int i6) {
        int i7 = eVar.f1313c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i);
        int i8 = eVar.f1314d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int iWidth = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            iWidth -= i3 / 2;
        } else if (i9 != 5) {
            iWidth -= i3;
        }
        if (i10 == 16) {
            iHeight -= i6 / 2;
        } else if (i10 != 80) {
            iHeight -= i6;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i6 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static E.e o(View view) {
        E.e eVar = (E.e) view.getLayoutParams();
        if (!eVar.f1312b) {
            if (view instanceof E.a) {
                b behavior = ((E.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f1312b = true;
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
                    eVar.b((b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            eVar.f1312b = true;
        }
        return eVar;
    }

    public static void w(int i, View view) {
        E.e eVar = (E.e) view.getLayoutParams();
        int i3 = eVar.i;
        if (i3 != i) {
            WeakHashMap weakHashMap = O.f3270a;
            view.offsetLeftAndRight(i - i3);
            eVar.i = i;
        }
    }

    public static void x(int i, View view) {
        E.e eVar = (E.e) view.getLayoutParams();
        int i3 = eVar.f1319j;
        if (i3 != i) {
            WeakHashMap weakHashMap = O.f3270a;
            view.offsetTopAndBottom(i - i3);
            eVar.f1319j = i;
        }
    }

    @Override // R.InterfaceC0185l
    public final void a(int i, View view) {
        C0187n c0187n = this.f5065G;
        if (i == 1) {
            c0187n.f3350b = 0;
        } else {
            c0187n.f3349a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            E.e eVar = (E.e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f1311a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i);
                }
                if (i == 0) {
                    eVar.f1322m = false;
                } else if (i == 1) {
                    eVar.f1323n = false;
                }
                eVar.f1324o = false;
            }
        }
        this.f5075k = null;
    }

    @Override // R.InterfaceC0186m
    public final void b(View view, int i, int i3, int i6, int i7, int i8, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                E.e eVar = (E.e) childAt.getLayoutParams();
                if (eVar.a(i8) && (bVar = eVar.f1311a) != null) {
                    int[] iArr2 = this.f5070e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, i3, i6, i7, iArr2);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z6) {
            q(1);
        }
    }

    @Override // R.InterfaceC0185l
    public final void c(View view, int i, int i3, int i6, int i7, int i8) {
        b(view, i, i3, i6, i7, 0, this.f5071f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof E.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // R.InterfaceC0185l
    public final boolean d(View view, View view2, int i, int i3) {
        View view3;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = 0;
        boolean z6 = false;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i6 = i;
                i7 = i3;
            } else {
                E.e eVar = (E.e) childAt.getLayoutParams();
                b bVar = eVar.f1311a;
                if (bVar != null) {
                    view3 = view;
                    i6 = i;
                    i7 = i3;
                    boolean zT = bVar.t(this, childAt, view3, i6, i7);
                    z6 |= zT;
                    if (i7 == 0) {
                        eVar.f1322m = zT;
                    } else if (i7 == 1) {
                        eVar.f1323n = zT;
                    }
                } else {
                    view3 = view;
                    i6 = i;
                    i7 = i3;
                    if (i7 == 0) {
                        eVar.f1322m = false;
                    } else if (i7 == 1) {
                        eVar.f1323n = false;
                    }
                }
            }
            i8++;
            view = view3;
            i = i6;
            i3 = i7;
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        b bVar = ((E.e) view.getLayoutParams()).f1311a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5062D;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // R.InterfaceC0185l
    public final void e(View view, View view2, int i, int i3) {
        C0187n c0187n = this.f5065G;
        if (i3 == 1) {
            c0187n.f3350b = i;
        } else {
            c0187n.f3349a = i;
        }
        this.f5075k = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((E.e) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // R.InterfaceC0185l
    public final void f(View view, int i, int i3, int[] iArr, int i6) {
        b bVar;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                E.e eVar = (E.e) childAt.getLayoutParams();
                if (eVar.a(i6) && (bVar = eVar.f1311a) != null) {
                    int[] iArr2 = this.f5070e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, view, i, i3, iArr2, i6);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new E.e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new E.e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f5066a);
    }

    public final r0 getLastWindowInsets() {
        return this.f5078n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0187n c0187n = this.f5065G;
        return c0187n.f3350b | c0187n.f3349a;
    }

    public Drawable getStatusBarBackground() {
        return this.f5062D;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(E.e eVar, Rect rect, int i, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i3 + iMax2);
    }

    public final void i(View view) {
        List list = (List) ((C2940i) this.f5067b.f5897c).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            b bVar = ((E.e) view2.getLayoutParams()).f1311a;
            if (bVar != null) {
                bVar.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            l(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        C2940i c2940i = (C2940i) this.f5067b.f5897c;
        int i = c2940i.f23705c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList2 = (ArrayList) c2940i.j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2940i.f(i3));
            }
        }
        ArrayList arrayList3 = this.f5069d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = i.f1330a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = i.f1330a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        i.a(this, view, matrix);
        ThreadLocal threadLocal3 = i.f1331b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f5077m) {
            if (this.f5076l == null) {
                this.f5076l = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5076l);
        }
        if (this.f5078n == null) {
            WeakHashMap weakHashMap = O.f3270a;
            if (getFitsSystemWindows()) {
                D.c(this);
            }
        }
        this.f5073h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f5077m && this.f5076l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5076l);
        }
        View view = this.f5075k;
        if (view != null) {
            a(0, view);
        }
        this.f5073h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5061C || this.f5062D == null) {
            return;
        }
        r0 r0Var = this.f5078n;
        int iD = r0Var != null ? r0Var.d() : 0;
        if (iD > 0) {
            this.f5062D.setBounds(0, 0, getWidth(), iD);
            this.f5062D.draw(canvas);
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
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        b bVar;
        WeakHashMap weakHashMap = O.f3270a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f5066a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((bVar = ((E.e) view.getLayoutParams()).f1311a) == null || !bVar.l(this, view, layoutDirection))) {
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
    public final boolean onNestedFling(View view, float f2, float f5, boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                E.e eVar = (E.e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f1311a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f5) {
        b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                E.e eVar = (E.e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f1311a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
        f(view, i, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i3, int i6, int i7) {
        c(view, i, i3, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof E.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E.g gVar = (E.g) parcelable;
        super.onRestoreInstanceState(gVar.f3954a);
        SparseArray sparseArray = gVar.f1328c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = o(childAt).f1311a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        E.g gVar = new E.g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((E.e) childAt.getLayoutParams()).f1311a;
            if (id != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        gVar.f1328c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
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
            android.view.View r3 = r0.f5074j
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
            android.view.View r6 = r0.f5074j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            E.e r6 = (E.e) r6
            E.b r6 = r6.f1311a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f5074j
            boolean r6 = r6.v(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f5074j
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

    public final boolean p(View view, int i, int i3) {
        d dVar = f5060L;
        Rect rectG = g();
        l(view, rectG);
        try {
            return rectG.contains(i, i3);
        } finally {
            rectG.setEmpty();
            dVar.d(rectG);
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

    public final void r(int i, View view) {
        Rect rectG;
        Rect rectG2;
        E.e eVar = (E.e) view.getLayoutParams();
        View view2 = eVar.f1320k;
        if (view2 == null && eVar.f1316f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f5060L;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                l(view2, rectG);
                E.e eVar2 = (E.e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar.d(rectG);
                rectG2.setEmpty();
                dVar.d(rectG2);
            }
        }
        int i3 = eVar.f1315e;
        if (i3 < 0) {
            E.e eVar3 = (E.e) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f5078n != null) {
                WeakHashMap weakHashMap = O.f3270a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f5078n.b() + rectG.left;
                    rectG.top = this.f5078n.d() + rectG.top;
                    rectG.right -= this.f5078n.c();
                    rectG.bottom -= this.f5078n.a();
                }
            }
            rectG2 = g();
            int i6 = eVar3.f1313c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        E.e eVar4 = (E.e) view.getLayoutParams();
        int i7 = eVar4.f1313c;
        if (i7 == 0) {
            i7 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iN = n(i3) - measuredWidth2;
        if (i8 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i8 == 5) {
            iN += measuredWidth2;
        }
        int i10 = i9 != 16 ? i9 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        b bVar = ((E.e) view.getLayoutParams()).f1311a;
        if (bVar == null || !bVar.q(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f5072g) {
            return;
        }
        v(false);
        this.f5072g = true;
    }

    public final void s(int i, int i3, int i6, View view) {
        measureChildWithMargins(view, i, i3, i6, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5063E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5062D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5062D = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5062D.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5062D;
                WeakHashMap weakHashMap = O.f3270a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f5062D.setVisible(getVisibility() == 0, false);
                this.f5062D.setCallback(this);
            }
            WeakHashMap weakHashMap2 = O.f3270a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z6 = i == 0;
        Drawable drawable = this.f5062D;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f5062D.setVisible(z6, false);
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5068c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        h hVar = f5059K;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            b bVar = ((E.e) view.getLayoutParams()).f1311a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f5074j = view;
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

    public final void v(boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((E.e) childAt.getLayoutParams()).f1311a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((E.e) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f5074j = null;
        this.f5072g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5062D;
    }

    public final void y() {
        WeakHashMap weakHashMap = O.f3270a;
        if (!getFitsSystemWindows()) {
            F.k(this, null);
            return;
        }
        if (this.f5064F == null) {
            this.f5064F = new e(4, this);
        }
        F.k(this, this.f5064F);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E.e ? new E.e((E.e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new E.e((ViewGroup.MarginLayoutParams) layoutParams) : new E.e(layoutParams);
    }
}
