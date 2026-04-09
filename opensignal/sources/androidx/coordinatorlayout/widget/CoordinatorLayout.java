package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import androidx.media3.common.i0;
import b9.e;
import d3.b;
import d3.c;
import dv.h;
import e3.f;
import e3.g;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kg.r;
import t3.d;
import u3.h1;
import u3.l;
import u3.m;
import u3.x;
import u3.z;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements l, m {
    public static final String P;
    public static final Class[] Q;
    public static final ThreadLocal R;
    public static final h S;
    public static final d T;
    public boolean B;
    public boolean D;
    public final int[] E;
    public View F;
    public View G;
    public f H;
    public boolean I;
    public h1 J;
    public boolean K;
    public Drawable L;
    public ViewGroup.OnHierarchyChangeListener M;
    public e N;
    public final i0 O;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1202a;

    /* renamed from: d, reason: collision with root package name */
    public final r f1203d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1204g;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f1205r;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1206x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1207y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public SparseArray f1208g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f1208g = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f1208g.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f1208g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1208g.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f1208g.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        P = r02 != null ? r02.getName() : null;
        S = new h(1);
        Q = new Class[]{Context.class, AttributeSet.class};
        R = new ThreadLocal();
        T = new d(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10 = d3.a.coordinatorLayoutStyle;
        super(context, attributeSet, i10);
        this.f1202a = new ArrayList();
        this.f1203d = new r(14);
        this.f1204g = new ArrayList();
        this.f1205r = new int[2];
        this.f1206x = new int[2];
        this.f1207y = new int[2];
        this.O = new i0();
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, c.CoordinatorLayout, 0, b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, c.CoordinatorLayout, i10, 0);
        if (i10 == 0) {
            u3.i0.m(this, context, c.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, b.Widget_Support_CoordinatorLayout);
        } else {
            u3.i0.m(this, context, c.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.E = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.E[i11] = (int) (r3[i11] * f10);
            }
        }
        this.L = typedArrayObtainStyledAttributes.getDrawable(c.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        A();
        super.setOnHierarchyChangeListener(new e3.d(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) T.a();
        return rect == null ? new Rect() : rect;
    }

    private int getFullContentHeight() {
        int height = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            e3.e eVar = (e3.e) childAt.getLayoutParams();
            height += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        }
        return height;
    }

    public static void m(int i10, Rect rect, Rect rect2, e3.e eVar, int i11, int i12) {
        int i13 = eVar.f7773c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.f7774d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int iWidth = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e3.e o(View view) {
        e3.e eVar = (e3.e) view.getLayoutParams();
        if (!eVar.f7772b) {
            if (view instanceof e3.a) {
                e3.b behavior = ((e3.a) view).getBehavior();
                if (behavior == null) {
                    e0.d("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f7772b = true;
                return eVar;
            }
            e3.c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (e3.c) superclass.getAnnotation(e3.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((e3.b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e4) {
                    e0.c("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f7772b = true;
        }
        return eVar;
    }

    public static void y(View view, int i10) {
        e3.e eVar = (e3.e) view.getLayoutParams();
        int i11 = eVar.f7779i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = u3.i0.f23177a;
            view.offsetLeftAndRight(i10 - i11);
            eVar.f7779i = i10;
        }
    }

    public static void z(View view, int i10) {
        e3.e eVar = (e3.e) view.getLayoutParams();
        int i11 = eVar.j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = u3.i0.f23177a;
            view.offsetTopAndBottom(i10 - i11);
            eVar.j = i10;
        }
    }

    public final void A() {
        WeakHashMap weakHashMap = u3.i0.f23177a;
        if (!getFitsSystemWindows()) {
            z.j(this, null);
            return;
        }
        if (this.N == null) {
            this.N = new e(16, this);
        }
        z.j(this, this.N);
        setSystemUiVisibility(1280);
    }

    @Override // u3.m
    public final void a(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e3.b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e3.e eVar = (e3.e) childAt.getLayoutParams();
                if (eVar.a(i14) && (bVar = eVar.f7771a) != null) {
                    int[] iArr2 = this.f1205r;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            r(1);
        }
    }

    @Override // u3.l
    public final void b(View view, int i10, int i11, int i12, int i13, int i14) {
        a(view, i10, i11, i12, i13, 0, this.f1206x);
    }

    @Override // u3.l
    public final boolean c(View view, View view2, int i10, int i11) {
        View view3;
        int i12;
        int i13;
        int childCount = getChildCount();
        int i14 = 0;
        boolean z10 = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i12 = i10;
                i13 = i11;
            } else {
                e3.e eVar = (e3.e) childAt.getLayoutParams();
                e3.b bVar = eVar.f7771a;
                if (bVar != null) {
                    view3 = view;
                    i12 = i10;
                    i13 = i11;
                    boolean zP = bVar.p(this, childAt, view3, i12, i13);
                    z10 |= zP;
                    if (i13 == 0) {
                        eVar.f7781m = zP;
                    } else if (i13 == 1) {
                        eVar.f7782n = zP;
                    }
                } else {
                    view3 = view;
                    i12 = i10;
                    i13 = i11;
                    if (i13 == 0) {
                        eVar.f7781m = false;
                    } else if (i13 == 1) {
                        eVar.f7782n = false;
                    }
                }
            }
            i14++;
            view = view3;
            i10 = i12;
            i11 = i13;
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e3.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // u3.l
    public final void d(View view, View view2, int i10, int i11) {
        i0 i0Var = this.O;
        if (i11 == 1) {
            i0Var.f1700b = i10;
        } else {
            i0Var.f1699a = i10;
        }
        this.G = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e3.e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? q(-getHeight()) : q(-((int) (getHeight() * 0.2f)));
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? q(getHeight()) : q((int) (getHeight() * 0.2f));
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? q(-getFullContentHeight()) : q(getFullContentHeight() - getHeight());
            }
            if (keyCode == 92) {
                return q(-getHeight());
            }
            if (keyCode == 93) {
                return q(getHeight());
            }
            if (keyCode == 122) {
                return q(-getFullContentHeight());
            }
            if (keyCode == 123) {
                return q(getFullContentHeight() - getHeight());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e3.b bVar = ((e3.e) view.getLayoutParams()).f7771a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // u3.l
    public final void e(View view, int i10) {
        i0 i0Var = this.O;
        if (i10 == 1) {
            i0Var.f1700b = 0;
        } else {
            i0Var.f1699a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e3.e eVar = (e3.e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                e3.b bVar = eVar.f7771a;
                if (bVar != null) {
                    bVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    eVar.f7781m = false;
                } else if (i10 == 1) {
                    eVar.f7782n = false;
                }
                eVar.f7783o = false;
            }
        }
        this.G = null;
    }

    @Override // u3.l
    public final void f(View view, int i10, int i11, int[] iArr, int i12) {
        e3.b bVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e3.e eVar = (e3.e) childAt.getLayoutParams();
                if (eVar.a(i12) && (bVar = eVar.f7771a) != null) {
                    int[] iArr2 = this.f1205r;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            r(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e3.e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e3.e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        w();
        return Collections.unmodifiableList(this.f1202a);
    }

    public final h1 getLastWindowInsets() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.O;
        return i0Var.f1700b | i0Var.f1699a;
    }

    public Drawable getStatusBarBackground() {
        return this.L;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e3.e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void i(View view) {
        ArrayList arrayList = (ArrayList) ((u.i0) this.f1203d.f14396d).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view2 = (View) arrayList.get(i10);
            e3.b bVar = ((e3.e) view2.getLayoutParams()).f7771a;
            if (bVar != null) {
                bVar.d(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            l(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List k(View view) {
        u.i0 i0Var = (u.i0) this.f1203d.f14396d;
        int i10 = i0Var.f23077g;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) i0Var.i(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(i0Var.f(i11));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = g.f7786a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f7786a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f7787b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i10) {
        int[] iArr = this.E;
        if (iArr == null) {
            e0.d("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        e0.d("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.I) {
            if (this.H == null) {
                this.H = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.H);
        }
        if (this.J == null) {
            WeakHashMap weakHashMap = u3.i0.f23177a;
            if (getFitsSystemWindows()) {
                x.c(this);
            }
        }
        this.D = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.I && this.H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.H);
        }
        View view = this.G;
        if (view != null) {
            e(view, 0);
        }
        this.D = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.K || this.L == null) {
            return;
        }
        h1 h1Var = this.J;
        int iD = h1Var != null ? h1Var.d() : 0;
        if (iD > 0) {
            this.L.setBounds(0, 0, getWidth(), iD);
            this.L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
        }
        boolean zV = v(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zV;
        }
        this.F = null;
        x();
        return zV;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        e3.b bVar;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1202a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((bVar = ((e3.e) view.getLayoutParams()).f7771a) == null || !bVar.h(this, view, layoutDirection))) {
                s(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e3.e eVar = (e3.e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    e3.b bVar = eVar.f7771a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        e3.b bVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e3.e eVar = (e3.e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f7771a) != null) {
                    zJ |= bVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        f(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        b(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        d(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        SparseArray sparseArray = savedState.f1208g;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            e3.b bVar = o(childAt).f7771a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            e3.b bVar = ((e3.e) childAt.getLayoutParams()).f7771a;
            if (id2 != -1 && bVar != null && (parcelableO = bVar.o(childAt)) != null) {
                sparseArray.append(id2, parcelableO);
            }
        }
        savedState.f1208g = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return c(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zV;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.F;
        boolean z10 = false;
        if (view != null) {
            e3.b bVar = ((e3.e) view.getLayoutParams()).f7771a;
            zV = bVar != null ? bVar.r(this, this.F, motionEvent) : false;
        } else {
            zV = v(motionEvent, 1);
            if (actionMasked != 0 && zV) {
                z10 = true;
            }
        }
        if (this.F == null || actionMasked == 3) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zV;
        }
        this.F = null;
        x();
        return zV;
    }

    public final boolean p(View view, int i10, int i11) {
        d dVar = T;
        Rect rectG = g();
        l(rectG, view);
        try {
            return rectG.contains(i10, i11);
        } finally {
            rectG.setEmpty();
            dVar.c(rectG);
        }
    }

    public final boolean q(int i10) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        c(this, view, 2, 1);
        f(view, 0, i10, this.f1207y, 1);
        int[] iArr = this.f1207y;
        int i11 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        a(view, 0, i11, 0, i10, 1, iArr);
        e(view, 1);
        return iArr[1] > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r23) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        e3.b bVar = ((e3.e) view.getLayoutParams()).f7771a;
        if (bVar == null || !bVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.B) {
            return;
        }
        if (this.F == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                e3.b bVar = ((e3.e) childAt.getLayoutParams()).f7771a;
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    bVar.g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        x();
        this.B = true;
    }

    public final void s(View view, int i10) {
        Rect rectG;
        Rect rectG2;
        e3.e eVar = (e3.e) view.getLayoutParams();
        View view2 = eVar.k;
        if (view2 == null && eVar.f7776f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = T;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                l(rectG, view2);
                e3.e eVar2 = (e3.e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i10, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar.c(rectG);
                rectG2.setEmpty();
                dVar.c(rectG2);
            }
        }
        int i11 = eVar.f7775e;
        if (i11 < 0) {
            e3.e eVar3 = (e3.e) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.J != null) {
                WeakHashMap weakHashMap = u3.i0.f23177a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.J.b() + rectG.left;
                    rectG.top = this.J.d() + rectG.top;
                    rectG.right -= this.J.c();
                    rectG.bottom -= this.J.a();
                }
            }
            rectG2 = g();
            int i12 = eVar3.f7773c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            Gravity.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i10);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        e3.e eVar4 = (e3.e) view.getLayoutParams();
        int i13 = eVar4.f7773c;
        if (i13 == 0) {
            i13 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i11 = width - i11;
        }
        int iN = n(i11) - measuredWidth2;
        if (i14 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i14 == 5) {
            iN += measuredWidth2;
        }
        int i16 = i15 != 16 ? i15 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        A();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.M = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.L = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                this.L.setLayoutDirection(getLayoutDirection());
                this.L.setVisible(getVisibility() == 0, false);
                this.L.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? getContext().getDrawable(i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.L;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.L.setVisible(z10, false);
    }

    public final void t(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean u(e3.b bVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return bVar.g(this, view, motionEvent);
        }
        if (i10 == 1) {
            return bVar.r(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public final boolean v(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1204g;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        h hVar = S;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zU = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            e3.b bVar = ((e3.e) view.getLayoutParams()).f7771a;
            if (zU && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    u(bVar, view, motionEventObtain, i10);
                }
            } else if (!zU && bVar != null && (zU = u(bVar, view, motionEvent, i10))) {
                this.F = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        View view2 = (View) arrayList.get(i13);
                        e3.b bVar2 = ((e3.e) view2.getLayoutParams()).f7771a;
                        if (bVar2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            u(bVar2, view2, motionEventObtain, i10);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zU;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.w():void");
    }

    public final void x() {
        View view = this.F;
        if (view != null) {
            e3.b bVar = ((e3.e) view.getLayoutParams()).f7771a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                bVar.r(this, this.F, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.F = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((e3.e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.B = false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e3.e ? new e3.e((e3.e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e3.e((ViewGroup.MarginLayoutParams) layoutParams) : new e3.e(layoutParams);
    }
}
