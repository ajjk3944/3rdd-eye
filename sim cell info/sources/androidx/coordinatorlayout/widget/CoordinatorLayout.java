package androidx.coordinatorlayout.widget;

import a0.a0;
import a0.l;
import a0.m;
import a0.o;
import a0.p;
import a0.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
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

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements l, m {

    /* renamed from: u, reason: collision with root package name */
    static final String f1392u;

    /* renamed from: v, reason: collision with root package name */
    static final Class<?>[] f1393v;

    /* renamed from: w, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f1394w;

    /* renamed from: x, reason: collision with root package name */
    static final Comparator<View> f1395x;

    /* renamed from: y, reason: collision with root package name */
    private static final z.d<Rect> f1396y;

    /* renamed from: b, reason: collision with root package name */
    private final List<View> f1397b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f1398c;

    /* renamed from: d, reason: collision with root package name */
    private final List<View> f1399d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f1400e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1401f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1402g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1403h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1404i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1405j;

    /* renamed from: k, reason: collision with root package name */
    private View f1406k;

    /* renamed from: l, reason: collision with root package name */
    private View f1407l;

    /* renamed from: m, reason: collision with root package name */
    private g f1408m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1409n;

    /* renamed from: o, reason: collision with root package name */
    private a0 f1410o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1411p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1412q;

    /* renamed from: r, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f1413r;

    /* renamed from: s, reason: collision with root package name */
    private p f1414s;

    /* renamed from: t, reason: collision with root package name */
    private final o f1415t;

    class a implements p {
        a() {
        }

        @Override // a0.p
        public a0 a(View view, a0 a0Var) {
            return CoordinatorLayout.this.V(a0Var);
        }
    }

    public interface b {
        c a();
    }

    public static abstract class c<V extends View> {
        public boolean A(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return z(coordinatorLayout, v2, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v2, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
            if (i2 == 0) {
                B(coordinatorLayout, v2, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v2) {
            return d(coordinatorLayout, v2) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v2, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v2) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v2) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public a0 f(CoordinatorLayout coordinatorLayout, V v2, a0 a0Var) {
            return a0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v2, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i2) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3, boolean z2) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                p(coordinatorLayout, v2, view, i2, i3, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                r(coordinatorLayout, v2, view, i2, i3, i4, i5);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            s(coordinatorLayout, v2, view, i2, i3, i4, i5, i6);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                u(coordinatorLayout, v2, view, view2, i2);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z2) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1413r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1413r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f1418a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1419b;

        /* renamed from: c, reason: collision with root package name */
        public int f1420c;

        /* renamed from: d, reason: collision with root package name */
        public int f1421d;

        /* renamed from: e, reason: collision with root package name */
        public int f1422e;

        /* renamed from: f, reason: collision with root package name */
        int f1423f;

        /* renamed from: g, reason: collision with root package name */
        public int f1424g;

        /* renamed from: h, reason: collision with root package name */
        public int f1425h;

        /* renamed from: i, reason: collision with root package name */
        int f1426i;

        /* renamed from: j, reason: collision with root package name */
        int f1427j;

        /* renamed from: k, reason: collision with root package name */
        View f1428k;

        /* renamed from: l, reason: collision with root package name */
        View f1429l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f1430m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f1431n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f1432o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f1433p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f1434q;

        /* renamed from: r, reason: collision with root package name */
        Object f1435r;

        public f(int i2, int i3) {
            super(i2, i3);
            this.f1419b = false;
            this.f1420c = 0;
            this.f1421d = 0;
            this.f1422e = -1;
            this.f1423f = -1;
            this.f1424g = 0;
            this.f1425h = 0;
            this.f1434q = new Rect();
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1419b = false;
            this.f1420c = 0;
            this.f1421d = 0;
            this.f1422e = -1;
            this.f1423f = -1;
            this.f1424g = 0;
            this.f1425h = 0;
            this.f1434q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.c.f3035d);
            this.f1420c = typedArrayObtainStyledAttributes.getInteger(o.c.f3036e, 0);
            this.f1423f = typedArrayObtainStyledAttributes.getResourceId(o.c.f3037f, -1);
            this.f1421d = typedArrayObtainStyledAttributes.getInteger(o.c.f3038g, 0);
            this.f1422e = typedArrayObtainStyledAttributes.getInteger(o.c.f3042k, -1);
            this.f1424g = typedArrayObtainStyledAttributes.getInt(o.c.f3041j, 0);
            this.f1425h = typedArrayObtainStyledAttributes.getInt(o.c.f3040i, 0);
            int i2 = o.c.f3039h;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.f1419b = zHasValue;
            if (zHasValue) {
                this.f1418a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f1418a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1419b = false;
            this.f1420c = 0;
            this.f1421d = 0;
            this.f1422e = -1;
            this.f1423f = -1;
            this.f1424g = 0;
            this.f1425h = 0;
            this.f1434q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1419b = false;
            this.f1420c = 0;
            this.f1421d = 0;
            this.f1422e = -1;
            this.f1423f = -1;
            this.f1424g = 0;
            this.f1425h = 0;
            this.f1434q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1419b = false;
            this.f1420c = 0;
            this.f1421d = 0;
            this.f1422e = -1;
            this.f1423f = -1;
            this.f1424g = 0;
            this.f1425h = 0;
            this.f1434q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f1423f);
            this.f1428k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1429l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1423f) + " to anchor view " + view);
            }
            this.f1429l = null;
            this.f1428k = null;
        }

        private boolean r(View view, int i2) {
            int iB = a0.d.b(((f) view.getLayoutParams()).f1424g, i2);
            return iB != 0 && (a0.d.b(this.f1425h, i2) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1428k.getId() != this.f1423f) {
                return false;
            }
            View view2 = this.f1428k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1429l = null;
                    this.f1428k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1429l = view2;
            return true;
        }

        boolean a() {
            return this.f1428k == null && this.f1423f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f1429l || r(view2, s.t(coordinatorLayout)) || ((cVar = this.f1418a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f1418a == null) {
                this.f1430m = false;
            }
            return this.f1430m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1423f == -1) {
                this.f1429l = null;
                this.f1428k = null;
                return null;
            }
            if (this.f1428k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f1428k;
        }

        public c e() {
            return this.f1418a;
        }

        boolean f() {
            return this.f1433p;
        }

        Rect g() {
            return this.f1434q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z2 = this.f1430m;
            if (z2) {
                return true;
            }
            c cVar = this.f1418a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z2;
            this.f1430m = zA;
            return zA;
        }

        boolean i(int i2) {
            if (i2 == 0) {
                return this.f1431n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f1432o;
        }

        void j() {
            this.f1433p = false;
        }

        void k(int i2) {
            q(i2, false);
        }

        void l() {
            this.f1430m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f1418a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f1418a = cVar;
                this.f1435r = null;
                this.f1419b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z2) {
            this.f1433p = z2;
        }

        void p(Rect rect) {
            this.f1434q.set(rect);
        }

        void q(int i2, boolean z2) {
            if (i2 == 0) {
                this.f1431n = z2;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f1432o = z2;
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    protected static class h extends d0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        SparseArray<Parcelable> f1437d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f1437d = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f1437d.append(iArr[i3], parcelableArray[i3]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f1437d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f1437d.keyAt(i3);
                parcelableArr[i3] = this.f1437d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fY = s.y(view);
            float fY2 = s.y(view2);
            if (fY > fY2) {
                return -1;
            }
            return fY < fY2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1392u = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1395x = new i();
        } else {
            f1395x = null;
        }
        f1393v = new Class[]{Context.class, AttributeSet.class};
        f1394w = new ThreadLocal<>();
        f1396y = new z.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o.a.f3030a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1397b = new ArrayList();
        this.f1398c = new androidx.coordinatorlayout.widget.a<>();
        this.f1399d = new ArrayList();
        this.f1401f = new int[2];
        this.f1402g = new int[2];
        this.f1415t = new o(this);
        int[] iArr = o.c.f3032a;
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, o.b.f3031a) : context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int[] iArr2 = o.c.f3032a;
        if (i2 == 0) {
            s.O(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, o.b.f3031a);
        } else {
            s.O(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o.c.f3033b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1405j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f1405j.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f1405j[i3] = (int) (r12[i3] * f2);
            }
        }
        this.f1412q = typedArrayObtainStyledAttributes.getDrawable(o.c.f3034c);
        typedArrayObtainStyledAttributes.recycle();
        W();
        super.setOnHierarchyChangeListener(new e());
        if (s.r(this) == 0) {
            s.V(this, 1);
        }
    }

    private void A(View view, View view2, int i2) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            r(view2, rectA);
            s(view, i2, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            N(rectA);
            N(rectA2);
        }
    }

    private void B(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int iB = a0.d.b(S(fVar.f1420c), i3);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iU = u(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            iU += measuredWidth / 2;
        } else if (i4 == 5) {
            iU += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iU, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent C(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void D(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (s.D(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            N(rectA2);
            if (rectA.isEmpty()) {
                N(rectA);
                return;
            }
            int iB = a0.d.b(fVar.f1425h, i2);
            boolean z4 = true;
            if ((iB & 48) != 48 || (i7 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f1427j) >= (i8 = rect.top)) {
                z2 = false;
            } else {
                U(view, i8 - i7);
                z2 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f1427j) < (i6 = rect.bottom)) {
                U(view, height - i6);
                z2 = true;
            }
            if (!z2) {
                U(view, 0);
            }
            if ((iB & 3) != 3 || (i4 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f1426i) >= (i5 = rect.left)) {
                z3 = false;
            } else {
                T(view, i5 - i4);
                z3 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f1426i) >= (i3 = rect.right)) {
                z4 = z3;
            } else {
                T(view, width - i3);
            }
            if (!z4) {
                T(view, 0);
            }
            N(rectA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c I(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1392u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f1394w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1393v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean J(c cVar, View view, MotionEvent motionEvent, int i2) {
        if (i2 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i2 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean K(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1399d;
        x(list);
        int size = list.size();
        MotionEvent motionEventC = null;
        boolean zJ = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zJ || z2) || actionMasked == 0) {
                if (!z2 && !zJ && cVarE != null && (zJ = J(cVarE, view, motionEvent, i2))) {
                    this.f1406k = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = list.get(i4);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventC == null) {
                                    motionEventC = C(motionEvent);
                                }
                                J(cVarE2, view2, motionEventC, i2);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z2 = zH && !zC;
                if (zH && !z2) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventC == null) {
                    motionEventC = C(motionEvent);
                }
                J(cVarE, view, motionEventC, i2);
            }
        }
        list.clear();
        if (motionEventC != null) {
            motionEventC.recycle();
        }
        return zJ;
    }

    private void L() {
        this.f1397b.clear();
        this.f1398c.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVarW = w(childAt);
            fVarW.d(this, childAt);
            this.f1398c.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (fVarW.b(this, childAt, childAt2)) {
                        if (!this.f1398c.d(childAt2)) {
                            this.f1398c.b(childAt2);
                        }
                        this.f1398c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1397b.addAll(this.f1398c.g());
        Collections.reverse(this.f1397b);
    }

    private static void N(Rect rect) {
        rect.setEmpty();
        f1396y.a(rect);
    }

    private void P() {
        View view = this.f1406k;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarE.D(this, this.f1406k, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f1406k = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((f) getChildAt(i2).getLayoutParams()).l();
        }
        this.f1403h = false;
    }

    private static int Q(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int R(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int S(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void T(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f1426i;
        if (i3 != i2) {
            s.G(view, i2 - i3);
            fVar.f1426i = i2;
        }
    }

    private void U(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f1427j;
        if (i3 != i2) {
            s.H(view, i2 - i3);
            fVar.f1427j = i2;
        }
    }

    private void W() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!s.q(this)) {
            s.X(this, null);
            return;
        }
        if (this.f1414s == null) {
            this.f1414s = new a();
        }
        s.X(this, this.f1414s);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rectB = f1396y.b();
        return rectB == null ? new Rect() : rectB;
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int d(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void e(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private a0 f(a0 a0Var) {
        c cVarE;
        if (a0Var.i()) {
            return a0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (s.q(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                a0Var = cVarE.f(this, childAt, a0Var);
                if (a0Var.i()) {
                    break;
                }
            }
        }
        return a0Var;
    }

    private void t(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int iB = a0.d.b(Q(fVar.f1420c), i2);
        int iB2 = a0.d.b(R(fVar.f1421d), i2);
        int i5 = iB & 7;
        int i6 = iB & 112;
        int i7 = iB2 & 7;
        int i8 = iB2 & 112;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i3 / 2;
        } else if (i5 != 5) {
            iWidth -= i3;
        }
        if (i6 == 16) {
            iHeight -= i4 / 2;
        } else if (i6 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private int u(int i2) {
        StringBuilder sb;
        int[] iArr = this.f1405j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else {
            if (i2 >= 0 && i2 < iArr.length) {
                return iArr[i2];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    private void x(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f1395x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean y(View view) {
        return this.f1398c.h(view);
    }

    private void z(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f1410o != null && s.q(this) && !s.q(view)) {
            rectA.left += this.f1410o.e();
            rectA.top += this.f1410o.g();
            rectA.right -= this.f1410o.f();
            rectA.bottom -= this.f1410o.d();
        }
        Rect rectA2 = a();
        a0.d.a(R(fVar.f1420c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i2);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        N(rectA);
        N(rectA2);
    }

    void E(View view, int i2) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f1428k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            r(fVar.f1428k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(i2, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z2 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            e(fVar, rectA3, measuredWidth, measuredHeight);
            int i3 = rectA3.left - rectA2.left;
            int i4 = rectA3.top - rectA2.top;
            if (i3 != 0) {
                s.G(view, i3);
            }
            if (i4 != 0) {
                s.H(view, i4);
            }
            if (z2 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f1428k);
            }
            N(rectA);
            N(rectA2);
            N(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void F(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.F(int):void");
    }

    public void G(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f1428k;
        if (view2 != null) {
            A(view, view2, i2);
            return;
        }
        int i3 = fVar.f1422e;
        if (i3 >= 0) {
            B(view, i3, i2);
        } else {
            z(view, i2);
        }
    }

    public void H(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    void M(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void O() {
        if (this.f1404i && this.f1408m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1408m);
        }
        this.f1409n = false;
    }

    final a0 V(a0 a0Var) {
        if (z.c.a(this.f1410o, a0Var)) {
            return a0Var;
        }
        this.f1410o = a0Var;
        boolean z2 = a0Var != null && a0Var.g() > 0;
        this.f1411p = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        a0 a0VarF = f(a0Var);
        requestLayout();
        return a0VarF;
    }

    void b() {
        if (this.f1404i) {
            if (this.f1408m == null) {
                this.f1408m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1408m);
        }
        this.f1409n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1418a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f1400e == null) {
                    this.f1400e = new Paint();
                }
                this.f1400e.setColor(fVar.f1418a.c(this, view));
                this.f1400e.setAlpha(d(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1400e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1412q;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (y(getChildAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2 != this.f1409n) {
            if (z2) {
                b();
            } else {
                O();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        L();
        return Collections.unmodifiableList(this.f1397b);
    }

    public final a0 getLastWindowInsets() {
        return this.f1410o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1415t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1412q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // a0.l
    public void i(View view, View view2, int i2, int i3) {
        c cVarE;
        this.f1415t.c(view, view2, i2, i3);
        this.f1407l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i3) && (cVarE = fVar.e()) != null) {
                cVarE.v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // a0.m
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVarE;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i6) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f1401f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f1401f;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.f1401f[1]) : Math.min(iMax2, this.f1401f[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            F(1);
        }
    }

    @Override // a0.l
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        k(view, i2, i3, i4, i5, 0, this.f1402g);
    }

    @Override // a0.l
    public void m(View view, int i2) {
        this.f1415t.d(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i2)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i2);
                }
                fVar.k(i2);
                fVar.j();
            }
        }
        this.f1407l = null;
    }

    @Override // a0.l
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        c cVarE;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i4) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f1401f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f1401f;
                    iMax = i2 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f1401f;
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            F(1);
        }
    }

    @Override // a0.l
    public boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i2, i3);
                    z2 |= zA;
                    fVar.q(i3, zA);
                } else {
                    fVar.q(i3, false);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        P();
        if (this.f1409n) {
            if (this.f1408m == null) {
                this.f1408m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1408m);
        }
        if (this.f1410o == null && s.q(this)) {
            s.N(this);
        }
        this.f1404i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P();
        if (this.f1409n && this.f1408m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1408m);
        }
        View view = this.f1407l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1404i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1411p || this.f1412q == null) {
            return;
        }
        a0 a0Var = this.f1410o;
        int iG = a0Var != null ? a0Var.g() : 0;
        if (iG > 0) {
            this.f1412q.setBounds(0, 0, getWidth(), iG);
            this.f1412q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            P();
        }
        boolean zK = K(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1406k = null;
            P();
        }
        return zK;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVarE;
        int iT = s.t(this);
        int size = this.f1397b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f1397b.get(i6);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iT))) {
                G(view, iT);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c cVarE;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zN |= cVarE.n(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (zN) {
            F(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVarE;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zO |= cVarE.o(this, childAt, view, f2, f3);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        n(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        l(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        i(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f1437d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarE = w(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f1437d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a0.n
    public void onStopNestedScroll(View view) {
        m(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f1406k;
        boolean z2 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zK = cVarE != null ? cVarE.D(this, this.f1406k, motionEvent) : false;
        } else {
            zK = K(motionEvent, 1);
            if (actionMasked != 0 && zK) {
                z2 = true;
            }
        }
        if (this.f1406k == null || actionMasked == 3) {
            zK |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent motionEventC = C(motionEvent);
            super.onTouchEvent(motionEventC);
            motionEventC.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1406k = null;
            P();
        }
        return zK;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    void r(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1403h) {
            return;
        }
        if (this.f1406k == null) {
            c();
        }
        P();
        this.f1403h = true;
    }

    void s(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        W();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1413r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1412q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1412q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1412q.setState(getDrawableState());
                }
                u.a.l(this.f1412q, s.t(this));
                this.f1412q.setVisible(getVisibility() == 0, false);
                this.f1412q.setCallback(this);
            }
            s.K(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarBackground(i2 != 0 ? r.a.c(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1412q;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1412q.setVisible(z2, false);
    }

    void v(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1412q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f w(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1419b) {
            if (view instanceof b) {
                c cVarA = ((b) view).a();
                if (cVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(cVarA);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.n(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
            }
            fVar.f1419b = true;
        }
        return fVar;
    }
}
