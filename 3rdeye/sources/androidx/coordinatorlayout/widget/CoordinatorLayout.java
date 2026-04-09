package androidx.coordinatorlayout.widget;

import D0.a;
import L0.C0787s;
import L0.I;
import L0.InterfaceC0786q;
import L0.InterfaceC0788t;
import L0.S;
import L0.X;
import L0.r;
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
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.work.s;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.C5316i;
import v0.C5671a;
import w0.C5712a;
import z0.C5848a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0786q, r {

    /* renamed from: u, reason: collision with root package name */
    public static final String f15443u;

    /* renamed from: v, reason: collision with root package name */
    public static final Class<?>[] f15444v;

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f15445w;

    /* renamed from: x, reason: collision with root package name */
    public static final i f15446x;

    /* renamed from: y, reason: collision with root package name */
    public static final K0.e f15447y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15448b;

    /* renamed from: c, reason: collision with root package name */
    public final G5.c f15449c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15450d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15451e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f15452f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f15453g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15454h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f15455j;

    /* renamed from: k, reason: collision with root package name */
    public View f15456k;

    /* renamed from: l, reason: collision with root package name */
    public View f15457l;

    /* renamed from: m, reason: collision with root package name */
    public g f15458m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15459n;

    /* renamed from: o, reason: collision with root package name */
    public X f15460o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15461p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f15462q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f15463r;

    /* renamed from: s, reason: collision with root package name */
    public a f15464s;

    /* renamed from: t, reason: collision with root package name */
    public final C0787s f15465t;

    public class a implements InterfaceC0788t {
        public a() {
        }

        @Override // L0.InterfaceC0788t
        public final X d(View view, X x10) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f15460o, x10)) {
                coordinatorLayout.f15460o = x10;
                boolean z10 = x10.d() > 0;
                coordinatorLayout.f15461p = z10;
                coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                X.k kVar = x10.f3850a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f15468a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return x10;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i, int i10) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void f() {
        }

        public void c(f fVar) {
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void n(View view, Parcelable parcelable) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i) {
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i10, int[] iArr, int i11) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f15463r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f15463r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends U0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f15484d;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f15484d = new SparseArray<>(i);
            for (int i10 = 0; i10 < i; i10++) {
                this.f15484d.append(iArr[i10], parcelableArray[i10]);
            }
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f15484d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f15484d.keyAt(i10);
                parcelableArr[i10] = this.f15484d.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            float fM = I.d.m(view);
            float fM2 = I.d.m(view2);
            if (fM > fM2) {
                return -1;
            }
            return fM < fM2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f15443u = r02 != null ? r02.getName() : null;
        f15446x = new i();
        f15444v = new Class[]{Context.class, AttributeSet.class};
        f15445w = new ThreadLocal<>();
        f15447y = new K0.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f15448b = new ArrayList();
        this.f15449c = new G5.c();
        this.f15450d = new ArrayList();
        this.f15451e = new ArrayList();
        this.f15452f = new int[2];
        this.f15453g = new int[2];
        this.f15465t = new C0787s();
        int[] iArr = C5671a.f47008a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f15455j = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f15455j[i10] = (int) (r2[i10] * f10);
            }
        }
        this.f15462q = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f15447y.a();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13 = fVar.f15470c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f15471d;
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
    public static f i(View view) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f15469b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f15468a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f15468a = behavior;
                    fVar.f15469b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
                fVar.f15469b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    c cVarNewInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    c cVar2 = fVar.f15468a;
                    if (cVar2 != cVarNewInstance) {
                        if (cVar2 != null) {
                            cVar2.f();
                        }
                        fVar.f15468a = cVarNewInstance;
                        fVar.f15469b = true;
                        if (cVarNewInstance != null) {
                            cVarNewInstance.c(fVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            fVar.f15469b = true;
        }
        return fVar;
    }

    public static void w(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.i;
        if (i11 != i10) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.i = i10;
        }
    }

    public static void x(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f15476j;
        if (i11 != i10) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f15476j = i10;
        }
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void c(View view) {
        List list = (List) ((C5316i) this.f15449c.f1911b).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            c cVar = ((f) view2.getLayoutParams()).f15468a;
            if (cVar != null) {
                cVar.d(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        c cVar = ((f) view.getLayoutParams()).f15468a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15462q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        C5316i c5316i = (C5316i) this.f15449c.f1911b;
        int i10 = c5316i.f44030d;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) c5316i.l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c5316i.g(i11));
            }
        }
        ArrayList arrayList3 = this.f15451e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C5712a.f47165a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C5712a.f47165a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C5712a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C5712a.f47166b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        u();
        return Collections.unmodifiableList(this.f15448b);
    }

    public final X getLastWindowInsets() {
        return this.f15460o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0787s c0787s = this.f15465t;
        return c0787s.f3932b | c0787s.f3931a;
    }

    public Drawable getStatusBarBackground() {
        return this.f15462q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i10) {
        int[] iArr = this.f15455j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // L0.InterfaceC0786q
    public final void j(int i10, View view) {
        C0787s c0787s = this.f15465t;
        if (i10 == 1) {
            c0787s.f3932b = 0;
        } else {
            c0787s.f3931a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f15468a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    fVar.f15479m = false;
                } else if (i10 == 1) {
                    fVar.f15480n = false;
                }
                fVar.f15481o = false;
            }
        }
        this.f15457l = null;
    }

    @Override // L0.r
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f15468a) != null) {
                    int[] iArr2 = this.f15452f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            q(1);
        }
    }

    @Override // L0.InterfaceC0786q
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        k(view, i10, i11, i12, i13, 0, this.f15453g);
    }

    @Override // L0.InterfaceC0786q
    public final boolean m(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f15468a;
                if (cVar != null) {
                    boolean zP = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= zP;
                    if (i11 == 0) {
                        fVar.f15479m = zP;
                    } else if (i11 == 1) {
                        fVar.f15480n = zP;
                    }
                } else if (i11 == 0) {
                    fVar.f15479m = false;
                } else if (i11 == 1) {
                    fVar.f15480n = false;
                }
            }
        }
        return z10;
    }

    @Override // L0.InterfaceC0786q
    public final void n(View view, View view2, int i10, int i11) {
        C0787s c0787s = this.f15465t;
        if (i11 == 1) {
            c0787s.f3932b = i10;
        } else {
            c0787s.f3931a = i10;
        }
        this.f15457l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // L0.InterfaceC0786q
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f15468a) != null) {
                    int[] iArr2 = this.f15452f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f15459n) {
            if (this.f15458m == null) {
                this.f15458m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f15458m);
        }
        if (this.f15460o == null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (getFitsSystemWindows()) {
                I.c.c(this);
            }
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f15459n && this.f15458m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f15458m);
        }
        View view = this.f15457l;
        if (view != null) {
            j(0, view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f15461p || this.f15462q == null) {
            return;
        }
        X x10 = this.f15460o;
        int iD = x10 != null ? x10.d() : 0;
        if (iD > 0) {
            this.f15462q.setBounds(0, 0, getWidth(), iD);
            this.f15462q.draw(canvas);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f15448b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f15468a) == null || !cVar.h(this, view, layoutDirection))) {
                r(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r28, int r29) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 502
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
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f15468a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f15468a) != null) {
                    zJ |= cVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        l(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        n(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f12348b);
        SparseArray<Parcelable> sparseArray = hVar.f15484d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = i(childAt).f15468a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f15468a;
            if (id != -1 && cVar != null && (parcelableO = cVar.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        hVar.f15484d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return m(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
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
            android.view.View r3 = r0.f15456k
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
            android.view.View r6 = r0.f15456k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f15468a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f15456k
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f15456k
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

    public final boolean p(View view, int i10, int i11) {
        K0.e eVar = f15447y;
        Rect rectA = a();
        f(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            eVar.c(rectA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0291 A[EDGE_INSN: B:147:0x0291->B:113:0x0291 BREAK  A[LOOP:2: B:118:0x02a9->B:136:0x02e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r26) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q(int):void");
    }

    public final void r(int i10, View view) {
        Rect rectA;
        Rect rectA2;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f15477k;
        if (view2 == null && fVar.f15473f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        K0.e eVar = f15447y;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                f(view2, rectA);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i10, rectA, rectA2, fVar2, measuredWidth, measuredHeight);
                b(fVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                eVar.c(rectA);
                rectA2.setEmpty();
                eVar.c(rectA2);
            }
        }
        int i11 = fVar.f15472e;
        if (i11 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.f15460o != null) {
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA.left = this.f15460o.b() + rectA.left;
                    rectA.top = this.f15460o.d() + rectA.top;
                    rectA.right -= this.f15460o.c();
                    rectA.bottom -= this.f15460o.a();
                }
            }
            rectA2 = a();
            int i12 = fVar3.f15470c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            Gravity.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i13 = fVar4.f15470c;
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
        int iH = h(i11) - measuredWidth2;
        if (i14 == 1) {
            iH += measuredWidth2 / 2;
        } else if (i14 == 5) {
            iH += measuredWidth2;
        }
        int i16 = i15 != 16 ? i15 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(iH, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f15468a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f15454h) {
            return;
        }
        v(false);
        this.f15454h = true;
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f15463r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f15462q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f15462q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f15462q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f15462q;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                a.b.b(drawable3, getLayoutDirection());
                this.f15462q.setVisible(getVisibility() == 0, false);
                this.f15462q.setCallback(this);
            }
            WeakHashMap<View, S> weakHashMap2 = I.f3792a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C5848a.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f15462q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f15462q.setVisible(z10, false);
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f15450d;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        i iVar = f15446x;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            c cVar = ((f) view.getLayoutParams()).f15468a;
            if (zG && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        cVar.g(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        cVar.r(this, view, motionEventObtain);
                    }
                }
            } else if (!zG && cVar != null) {
                if (i10 == 0) {
                    zG = cVar.g(this, view, motionEvent);
                } else if (i10 == 1) {
                    zG = cVar.r(this, view, motionEvent);
                }
                if (zG) {
                    this.f15456k = view;
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f15468a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, motionEventObtain);
                } else {
                    cVar.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f15456k = null;
        this.f15454h = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15462q;
    }

    public final void y() {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (!getFitsSystemWindows()) {
            I.d.u(this, null);
            return;
        }
        if (this.f15464s == null) {
            this.f15464s = new a();
        }
        I.d.u(this, this.f15464s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f15468a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15469b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15470c;

        /* renamed from: d, reason: collision with root package name */
        public int f15471d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15472e;

        /* renamed from: f, reason: collision with root package name */
        public final int f15473f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15474g;

        /* renamed from: h, reason: collision with root package name */
        public int f15475h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f15476j;

        /* renamed from: k, reason: collision with root package name */
        public View f15477k;

        /* renamed from: l, reason: collision with root package name */
        public View f15478l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f15479m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f15480n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f15481o;

        /* renamed from: p, reason: collision with root package name */
        public final Rect f15482p;

        public f() {
            super(-2, -2);
            this.f15469b = false;
            this.f15470c = 0;
            this.f15471d = 0;
            this.f15472e = -1;
            this.f15473f = -1;
            this.f15474g = 0;
            this.f15475h = 0;
            this.f15482p = new Rect();
        }

        public final boolean a(int i) {
            if (i == 0) {
                return this.f15479m;
            }
            if (i != 1) {
                return false;
            }
            return this.f15480n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c cVarNewInstance;
            super(context, attributeSet);
            this.f15469b = false;
            this.f15470c = 0;
            this.f15471d = 0;
            this.f15472e = -1;
            this.f15473f = -1;
            this.f15474g = 0;
            this.f15475h = 0;
            this.f15482p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5671a.f47009b);
            this.f15470c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f15473f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f15471d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f15472e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f15474g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f15475h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f15469b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f15443u;
                if (TextUtils.isEmpty(string)) {
                    cVarNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f15443u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f15445w;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f15444v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVarNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e4) {
                        throw new RuntimeException(s.d("Could not inflate Behavior subclass ", string), e4);
                    }
                }
                this.f15468a = cVarNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f15468a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f15469b = false;
            this.f15470c = 0;
            this.f15471d = 0;
            this.f15472e = -1;
            this.f15473f = -1;
            this.f15474g = 0;
            this.f15475h = 0;
            this.f15482p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f15469b = false;
            this.f15470c = 0;
            this.f15471d = 0;
            this.f15472e = -1;
            this.f15473f = -1;
            this.f15474g = 0;
            this.f15475h = 0;
            this.f15482p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15469b = false;
            this.f15470c = 0;
            this.f15471d = 0;
            this.f15472e = -1;
            this.f15473f = -1;
            this.f15474g = 0;
            this.f15475h = 0;
            this.f15482p = new Rect();
        }
    }
}
