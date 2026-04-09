package androidx.coordinatorlayout.widget;

import F1.AbstractC2771s;
import F1.C;
import F1.C2780w0;
import F1.D;
import F1.E;
import F1.F;
import F1.W;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q1.AbstractC7410a;
import q1.AbstractC7411b;
import q1.AbstractC7412c;
import t1.AbstractC8021a;
import x1.AbstractC8416a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements C, D {

    /* renamed from: u, reason: collision with root package name */
    static final String f30613u;

    /* renamed from: v, reason: collision with root package name */
    static final Class[] f30614v;

    /* renamed from: w, reason: collision with root package name */
    static final ThreadLocal f30615w;

    /* renamed from: x, reason: collision with root package name */
    static final Comparator f30616x;

    /* renamed from: y, reason: collision with root package name */
    private static final E1.e f30617y;

    /* renamed from: a, reason: collision with root package name */
    private final List f30618a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b f30619b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30620c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30621d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f30622e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f30623f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f30624g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30625h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30626i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f30627j;

    /* renamed from: k, reason: collision with root package name */
    private View f30628k;

    /* renamed from: l, reason: collision with root package name */
    private View f30629l;

    /* renamed from: m, reason: collision with root package name */
    private f f30630m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30631n;

    /* renamed from: o, reason: collision with root package name */
    private C2780w0 f30632o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30633p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f30634q;

    /* renamed from: r, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f30635r;

    /* renamed from: s, reason: collision with root package name */
    private F f30636s;

    /* renamed from: t, reason: collision with root package name */
    private final E f30637t;

    class a implements F {
        a() {
        }

        @Override // F1.F
        public C2780w0 a(View view, C2780w0 c2780w0) {
            return CoordinatorLayout.this.U(c2780w0);
        }
    }

    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public C2780w0 f(CoordinatorLayout coordinatorLayout, View view, C2780w0 c2780w0) {
            return c2780w0;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    private class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f30635r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f30635r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    static class h implements Comparator {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fK = W.K(view);
            float fK2 = W.K(view2);
            if (fK > fK2) {
                return -1;
            }
            return fK < fK2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f30613u = r02 != null ? r02.getName() : null;
        f30616x = new h();
        f30614v = new Class[]{Context.class, AttributeSet.class};
        f30615w = new ThreadLocal();
        f30617y = new E1.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC7410a.f58330a);
    }

    private void A(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.f30632o != null && W.w(this) && !W.w(view)) {
            rectA.left += this.f30632o.j();
            rectA.top += this.f30632o.l();
            rectA.right -= this.f30632o.k();
            rectA.bottom -= this.f30632o.i();
        }
        Rect rectA2 = a();
        AbstractC2771s.a(Q(eVar.f30642c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        M(rectA);
        M(rectA2);
    }

    private void B(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            r(view2, rectA);
            s(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            M(rectA);
            M(rectA2);
        }
    }

    private void C(View view, int i10, int i11) {
        e eVar = (e) view.getLayoutParams();
        int iB = AbstractC2771s.b(R(eVar.f30642c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iU = u(i10) - measuredWidth;
        if (i12 == 1) {
            iU += measuredWidth / 2;
        } else if (i12 == 5) {
            iU += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(iU, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void D(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (W.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (bVarE == null || !bVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            M(rectA2);
            if (rectA.isEmpty()) {
                M(rectA);
                return;
            }
            int iB = AbstractC2771s.b(eVar.f30647h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.f30649j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                T(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.f30649j) < (i14 = rect.bottom)) {
                T(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                T(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.f30648i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                S(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.f30648i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                S(view, width - i11);
            }
            if (!z12) {
                S(view, 0);
            }
            M(rectA);
        }
    }

    static b I(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f30613u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f30615w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f30614v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean J(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f30620c;
        x(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            if (!(zK || z10) || actionMasked == 0) {
                if (!zK && bVarE != null) {
                    if (i10 == 0) {
                        zK = bVarE.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zK = bVarE.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f30628k = view;
                    }
                }
                boolean zC = eVar.c();
                boolean zH = eVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (bVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    bVarE.k(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    bVarE.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void K() {
        this.f30618a.clear();
        this.f30619b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVarW = w(childAt);
            eVarW.d(this, childAt);
            this.f30619b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (eVarW.b(this, childAt, childAt2)) {
                        if (!this.f30619b.d(childAt2)) {
                            this.f30619b.b(childAt2);
                        }
                        this.f30619b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f30618a.addAll(this.f30619b.h());
        Collections.reverse(this.f30618a);
    }

    private static void M(Rect rect) {
        rect.setEmpty();
        f30617y.a(rect);
    }

    private void O(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (bVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    bVarE.k(this, childAt, motionEventObtain);
                } else {
                    bVarE.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).l();
        }
        this.f30628k = null;
        this.f30625h = false;
    }

    private static int P(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int Q(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void S(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f30648i;
        if (i11 != i10) {
            W.W(view, i10 - i11);
            eVar.f30648i = i10;
        }
    }

    private void T(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f30649j;
        if (i11 != i10) {
            W.X(view, i10 - i11);
            eVar.f30649j = i10;
        }
    }

    private void V() {
        if (!W.w(this)) {
            W.y0(this, null);
            return;
        }
        if (this.f30636s == null) {
            this.f30636s = new a();
        }
        W.y0(this, this.f30636s);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f30617y.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private C2780w0 e(C2780w0 c2780w0) {
        b bVarE;
        if (c2780w0.o()) {
            return c2780w0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (W.w(childAt) && (bVarE = ((e) childAt.getLayoutParams()).e()) != null) {
                c2780w0 = bVarE.f(this, childAt, c2780w0);
                if (c2780w0.o()) {
                    break;
                }
            }
        }
        return c2780w0;
    }

    private void t(View view, int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int iB = AbstractC2771s.b(P(eVar.f30642c), i10);
        int iB2 = AbstractC2771s.b(Q(eVar.f30643d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int u(int i10) {
        int[] iArr = this.f30627j;
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

    private void x(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f30616x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean y(View view) {
        return this.f30619b.i(view);
    }

    void E(View view, int i10) {
        b bVarE;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f30650k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            r(eVar.f30650k, rectA);
            p(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i10, rectA, rectA3, eVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(eVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                W.W(view, i11);
            }
            if (i12 != 0) {
                W.X(view, i12);
            }
            if (z10 && (bVarE = eVar.e()) != null) {
                bVarE.h(this, view, eVar.f30650k);
            }
            M(rectA);
            M(rectA2);
            M(rectA3);
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

    public void G(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f30650k;
        if (view2 != null) {
            B(view, view2, i10);
            return;
        }
        int i11 = eVar.f30644e;
        if (i11 >= 0) {
            C(view, i11, i10);
        } else {
            A(view, i10);
        }
    }

    public void H(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    void N() {
        if (this.f30626i && this.f30630m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f30630m);
        }
        this.f30631n = false;
    }

    final C2780w0 U(C2780w0 c2780w0) {
        if (E1.d.a(this.f30632o, c2780w0)) {
            return c2780w0;
        }
        this.f30632o = c2780w0;
        boolean z10 = false;
        boolean z11 = c2780w0 != null && c2780w0.l() > 0;
        this.f30633p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        C2780w0 c2780w0E = e(c2780w0);
        requestLayout();
        return c2780w0E;
    }

    void b() {
        if (this.f30626i) {
            if (this.f30630m == null) {
                this.f30630m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f30630m);
        }
        this.f30631n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f30640a;
        if (bVar != null) {
            float fD = bVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f30622e == null) {
                    this.f30622e = new Paint();
                }
                this.f30622e.setColor(eVar.f30640a.c(this, view));
                this.f30622e.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f30622e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f30634q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void f() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (y(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f30631n) {
            if (z10) {
                b();
            } else {
                N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.f30618a);
    }

    public final C2780w0 getLastWindowInsets() {
        return this.f30632o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f30637t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f30634q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // F1.D
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVarE;
        boolean z10;
        int iMin;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i14) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.f30623f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f30623f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        iMin = Math.max(i15, this.f30623f[1]);
                    } else {
                        z10 = true;
                        iMin = Math.min(i15, this.f30623f[1]);
                    }
                    i15 = iMin;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z11) {
            F(1);
        }
    }

    @Override // F1.C
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, 0, this.f30624g);
    }

    @Override // F1.C
    public boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVarE = eVar.e();
                if (bVarE != null) {
                    boolean zA = bVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    eVar.q(i11, zA);
                } else {
                    eVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // F1.C
    public void m(View view, View view2, int i10, int i11) {
        b bVarE;
        this.f30637t.c(view, view2, i10, i11);
        this.f30629l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i11) && (bVarE = eVar.e()) != null) {
                bVarE.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // F1.C
    public void n(View view, int i10) {
        this.f30637t.d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i10)) {
                b bVarE = eVar.e();
                if (bVarE != null) {
                    bVarE.C(this, childAt, view, i10);
                }
                eVar.k(i10);
                eVar.j();
            }
        }
        this.f30629l = null;
    }

    @Override // F1.C
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        b bVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i12) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.f30623f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f30623f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f30623f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.f30631n) {
            if (this.f30630m == null) {
                this.f30630m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f30630m);
        }
        if (this.f30632o == null && W.w(this)) {
            W.j0(this);
        }
        this.f30626i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.f30631n && this.f30630m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f30630m);
        }
        View view = this.f30629l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f30626i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f30633p || this.f30634q == null) {
            return;
        }
        C2780w0 c2780w0 = this.f30632o;
        int iL = c2780w0 != null ? c2780w0.l() : 0;
        if (iL > 0) {
            this.f30634q.setBounds(0, 0, getWidth(), iL);
            this.f30634q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean zJ = J(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            O(true);
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b bVarE;
        int iZ = W.z(this);
        int size = this.f30618a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f30618a.get(i14);
            if (view.getVisibility() != 8 && ((bVarE = ((e) view.getLayoutParams()).e()) == null || !bVarE.l(this, view, iZ))) {
                G(view, iZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        b bVarE;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (bVarE = eVar.e()) != null) {
                    zN |= bVarE.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (zN) {
            F(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        b bVarE;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (bVarE = eVar.e()) != null) {
                    zO |= bVarE.o(this, childAt, view, f10, f11);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.f30659c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVarE = w(childAt).e();
            if (id2 != -1 && bVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (id2 != -1 && bVarE != null && (parcelableY = bVarE.y(this, childAt)) != null) {
                sparseArray.append(id2, parcelableY);
            }
        }
        gVar.f30659c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f30628k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f30628k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f30628k
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f30628k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.O(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List listG = this.f30619b.g(view);
        this.f30621d.clear();
        if (listG != null) {
            this.f30621d.addAll(listG);
        }
        return this.f30621d;
    }

    void r(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b bVarE = ((e) view.getLayoutParams()).e();
        if (bVarE == null || !bVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f30625h) {
            return;
        }
        O(false);
        this.f30625h = true;
    }

    void s(View view, int i10, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i10, rect, rect2, eVar, measuredWidth, measuredHeight);
        d(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f30635r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f30634q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f30634q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f30634q.setState(getDrawableState());
                }
                AbstractC8416a.m(this.f30634q, W.z(this));
                this.f30634q.setVisible(getVisibility() == 0, false);
                this.f30634q.setCallback(this);
            }
            W.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? AbstractC8021a.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f30634q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f30634q.setVisible(z10, false);
    }

    void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f30634q;
    }

    e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f30641b) {
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f30641b = true;
        }
        return eVar;
    }

    public boolean z(View view, int i10, int i11) {
        Rect rectA = a();
        r(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            M(rectA);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f30618a = new ArrayList();
        this.f30619b = new androidx.coordinatorlayout.widget.b();
        this.f30620c = new ArrayList();
        this.f30621d = new ArrayList();
        this.f30623f = new int[2];
        this.f30624g = new int[2];
        this.f30637t = new E(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, AbstractC7412c.f58333b, 0, AbstractC7411b.f58331a) : context.obtainStyledAttributes(attributeSet, AbstractC7412c.f58333b, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, AbstractC7412c.f58333b, attributeSet, typedArrayObtainStyledAttributes, 0, AbstractC7411b.f58331a);
            } else {
                saveAttributeDataForStyleable(context, AbstractC7412c.f58333b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC7412c.f58334c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f30627j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f30627j.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f30627j[i11] = (int) (r12[i11] * f10);
            }
        }
        this.f30634q = typedArrayObtainStyledAttributes.getDrawable(AbstractC7412c.f58335d);
        typedArrayObtainStyledAttributes.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (W.x(this) == 0) {
            W.u0(this, 1);
        }
    }

    protected static class g extends L1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        SparseArray f30659c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f30659c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f30659c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f30659c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f30659c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f30659c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        b f30640a;

        /* renamed from: b, reason: collision with root package name */
        boolean f30641b;

        /* renamed from: c, reason: collision with root package name */
        public int f30642c;

        /* renamed from: d, reason: collision with root package name */
        public int f30643d;

        /* renamed from: e, reason: collision with root package name */
        public int f30644e;

        /* renamed from: f, reason: collision with root package name */
        int f30645f;

        /* renamed from: g, reason: collision with root package name */
        public int f30646g;

        /* renamed from: h, reason: collision with root package name */
        public int f30647h;

        /* renamed from: i, reason: collision with root package name */
        int f30648i;

        /* renamed from: j, reason: collision with root package name */
        int f30649j;

        /* renamed from: k, reason: collision with root package name */
        View f30650k;

        /* renamed from: l, reason: collision with root package name */
        View f30651l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f30652m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f30653n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f30654o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f30655p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f30656q;

        /* renamed from: r, reason: collision with root package name */
        Object f30657r;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f30641b = false;
            this.f30642c = 0;
            this.f30643d = 0;
            this.f30644e = -1;
            this.f30645f = -1;
            this.f30646g = 0;
            this.f30647h = 0;
            this.f30656q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f30645f);
            this.f30650k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f30651l = null;
                    this.f30650k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f30645f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f30651l = null;
                this.f30650k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f30651l = null;
                    this.f30650k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f30651l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC2771s.b(((e) view.getLayoutParams()).f30646g, i10);
            return iB != 0 && (AbstractC2771s.b(this.f30647h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f30650k.getId() != this.f30645f) {
                return false;
            }
            View view2 = this.f30650k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f30651l = null;
                    this.f30650k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f30651l = view2;
            return true;
        }

        boolean a() {
            return this.f30650k == null && this.f30645f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b bVar;
            return view2 == this.f30651l || r(view2, W.z(coordinatorLayout)) || ((bVar = this.f30640a) != null && bVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f30640a == null) {
                this.f30652m = false;
            }
            return this.f30652m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f30645f == -1) {
                this.f30651l = null;
                this.f30650k = null;
                return null;
            }
            if (this.f30650k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f30650k;
        }

        public b e() {
            return this.f30640a;
        }

        boolean f() {
            return this.f30655p;
        }

        Rect g() {
            return this.f30656q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f30652m;
            if (z10) {
                return true;
            }
            b bVar = this.f30640a;
            boolean zA = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z10;
            this.f30652m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f30653n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f30654o;
        }

        void j() {
            this.f30655p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f30652m = false;
        }

        public void n(b bVar) {
            b bVar2 = this.f30640a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f30640a = bVar;
                this.f30657r = null;
                this.f30641b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        void o(boolean z10) {
            this.f30655p = z10;
        }

        void p(Rect rect) {
            this.f30656q.set(rect);
        }

        void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f30653n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f30654o = z10;
            }
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30641b = false;
            this.f30642c = 0;
            this.f30643d = 0;
            this.f30644e = -1;
            this.f30645f = -1;
            this.f30646g = 0;
            this.f30647h = 0;
            this.f30656q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7412c.f58336e);
            this.f30642c = typedArrayObtainStyledAttributes.getInteger(AbstractC7412c.f58337f, 0);
            this.f30645f = typedArrayObtainStyledAttributes.getResourceId(AbstractC7412c.f58338g, -1);
            this.f30643d = typedArrayObtainStyledAttributes.getInteger(AbstractC7412c.f58339h, 0);
            this.f30644e = typedArrayObtainStyledAttributes.getInteger(AbstractC7412c.f58343l, -1);
            this.f30646g = typedArrayObtainStyledAttributes.getInt(AbstractC7412c.f58342k, 0);
            this.f30647h = typedArrayObtainStyledAttributes.getInt(AbstractC7412c.f58341j, 0);
            int i10 = AbstractC7412c.f58340i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f30641b = zHasValue;
            if (zHasValue) {
                this.f30640a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            b bVar = this.f30640a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f30641b = false;
            this.f30642c = 0;
            this.f30643d = 0;
            this.f30644e = -1;
            this.f30645f = -1;
            this.f30646g = 0;
            this.f30647h = 0;
            this.f30656q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f30641b = false;
            this.f30642c = 0;
            this.f30643d = 0;
            this.f30644e = -1;
            this.f30645f = -1;
            this.f30646g = 0;
            this.f30647h = 0;
            this.f30656q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f30641b = false;
            this.f30642c = 0;
            this.f30643d = 0;
            this.f30644e = -1;
            this.f30645f = -1;
            this.f30646g = 0;
            this.f30647h = 0;
            this.f30656q = new Rect();
        }
    }
}
