package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.r;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.SimpleResolver;
import r0.h;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements d0, e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final String f2304u;

    /* renamed from: v, reason: collision with root package name */
    public static final Class[] f2305v;

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f2306w;

    /* renamed from: x, reason: collision with root package name */
    public static final Comparator f2307x;

    /* renamed from: y, reason: collision with root package name */
    public static final r0.f f2308y;

    /* renamed from: a, reason: collision with root package name */
    public final List f2309a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.b f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2311c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2312d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2313e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2314f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2315g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2316h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2317i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2318j;

    /* renamed from: k, reason: collision with root package name */
    public View f2319k;

    /* renamed from: l, reason: collision with root package name */
    public View f2320l;

    /* renamed from: m, reason: collision with root package name */
    public f f2321m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2322n;

    /* renamed from: o, reason: collision with root package name */
    public WindowInsetsCompat f2323o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2324p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2325q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2326r;

    /* renamed from: s, reason: collision with root package name */
    public g0 f2327s;

    /* renamed from: t, reason: collision with root package name */
    public final f0 f2328t;

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    public class a implements g0 {
        public a() {
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.W(windowInsetsCompat);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, view, view2);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view) {
            return h(coordinatorLayout, view) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public WindowInsetsCompat j(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void k(e eVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2326r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2326r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    public static class g implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = ViewCompat.L(view);
            float fL2 = ViewCompat.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2304u = r02 != null ? r02.getName() : null;
        f2307x = new g();
        f2305v = new Class[]{Context.class, AttributeSet.class};
        f2306w = new ThreadLocal();
        f2308y = new h(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    public static c K(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2304u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f2306w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2305v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void O(Rect rect) {
        rect.setEmpty();
        f2308y.a(rect);
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    public static Rect a() {
        Rect rect = (Rect) f2308y.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public final boolean A(View view) {
        return this.f2310b.j(view);
    }

    public boolean B(View view, int i10, int i11) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            O(rectA);
        }
    }

    public final void C(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.f2323o != null && ViewCompat.v(this) && !ViewCompat.v(view)) {
            rectA.left += this.f2323o.j();
            rectA.top += this.f2323o.l();
            rectA.right -= this.f2323o.k();
            rectA.bottom -= this.f2323o.i();
        }
        Rect rectA2 = a();
        r.a(S(eVar.f2334c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    public final void D(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    public final void E(View view, int i10, int i11) {
        e eVar = (e) view.getLayoutParams();
        int iB = r.b(T(eVar.f2334c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iW = w(i10) - measuredWidth;
        if (i12 == 1) {
            iW += measuredWidth / 2;
        } else if (i12 == 5) {
            iW += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void F(View view, Rect rect, int i10) {
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
        if (ViewCompat.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            c cVarF = eVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = r.b(eVar.f2339h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.f2341j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.f2341j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.f2340i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.f2340i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    public void G(View view, int i10) {
        c cVarF;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f2342k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(eVar.f2342k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, rectA, rectA3, eVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(eVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                ViewCompat.T(view, i11);
            }
            if (i12 != 0) {
                ViewCompat.U(view, i12);
            }
            if (z10 && (cVarF = eVar.f()) != null) {
                cVarF.l(this, view, eVar.f2342k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.H(int):void");
    }

    public void I(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f2342k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = eVar.f2336e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f2311c;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            e eVar = (e) view.getLayoutParams();
            c cVarF = eVar.f();
            if (!(zO || z10) || actionMasked == 0) {
                if (!zO && cVarF != null) {
                    if (i10 == 0) {
                        zO = cVarF.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = cVarF.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f2319k = view;
                    }
                }
                boolean zC = eVar.c();
                boolean zI = eVar.i(this, view);
                z10 = zI && !zC;
                if (zI && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    public final void M() {
        this.f2309a.clear();
        this.f2310b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVarY = y(childAt);
            eVarY.d(this, childAt);
            this.f2310b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (eVarY.b(this, childAt, childAt2)) {
                        if (!this.f2310b.d(childAt2)) {
                            this.f2310b.b(childAt2);
                        }
                        this.f2310b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2309a.addAll(this.f2310b.i());
        Collections.reverse(this.f2309a);
    }

    public void N(View view, Rect rect) {
        ((e) view.getLayoutParams()).q(rect);
    }

    public void P() {
        if (this.f2317i && this.f2321m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2321m);
        }
        this.f2322n = false;
    }

    public final void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((e) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.o(this, childAt, motionEventObtain);
                } else {
                    cVarF.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).m();
        }
        this.f2319k = null;
        this.f2316h = false;
    }

    public final void U(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f2340i;
        if (i11 != i10) {
            ViewCompat.T(view, i10 - i11);
            eVar.f2340i = i10;
        }
    }

    public final void V(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f2341j;
        if (i11 != i10) {
            ViewCompat.U(view, i10 - i11);
            eVar.f2341j = i10;
        }
    }

    public final WindowInsetsCompat W(WindowInsetsCompat windowInsetsCompat) {
        if (r0.d.a(this.f2323o, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f2323o = windowInsetsCompat;
        boolean z10 = false;
        boolean z11 = windowInsetsCompat != null && windowInsetsCompat.l() > 0;
        this.f2324p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        WindowInsetsCompat windowInsetsCompatE = e(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatE;
    }

    public final void X() {
        if (!ViewCompat.v(this)) {
            ViewCompat.t0(this, null);
            return;
        }
        if (this.f2327s == null) {
            this.f2327s = new a();
        }
        ViewCompat.t0(this, this.f2327s);
        setSystemUiVisibility(SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE);
    }

    public void b() {
        if (this.f2317i) {
            if (this.f2321m == null) {
                this.f2321m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2321m);
        }
        this.f2322n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void d(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r2.f2332a
            if (r3 == 0) goto L8f
            float r3 = r3.h(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
            android.graphics.Paint r4 = r0.f2313e
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f2313e = r4
        L22:
            android.graphics.Paint r4 = r0.f2313e
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f2332a
            int r2 = r2.g(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f2313e
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = c(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L65
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L65:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f2313e
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L91
        L8f:
            r4 = r17
        L91:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2325q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat) {
        c cVarF;
        if (windowInsetsCompat.p()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (ViewCompat.v(childAt) && (cVarF = ((e) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = cVarF.j(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.p()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void f(View view) {
        List listG = this.f2310b.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarF = ((e) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f2322n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f2309a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2323o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2328t.a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f2325q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // androidx.core.view.d0
    public void i(View view, View view2, int i10, int i11) {
        c cVarF;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f2328t.c(view, view2, i10, i11);
        this.f2320l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.j(i11) && (cVarF = eVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.d0
    public void j(View view, int i10) {
        this.f2328t.d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.j(i10)) {
                c cVarF = eVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i10);
                }
                eVar.l(i10);
                eVar.k();
            }
        }
        this.f2320l = null;
    }

    @Override // androidx.core.view.d0
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(i12) && (cVarF = eVar.f()) != null) {
                    int[] iArr2 = this.f2314f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2314f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f2314f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // androidx.core.view.e0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.j(i14) && (cVarF = eVar.f()) != null) {
                    int[] iArr2 = this.f2314f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2314f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f2314f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // androidx.core.view.d0
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f2315g);
    }

    @Override // androidx.core.view.d0
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                c cVarF = eVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    eVar.r(i11, zE);
                } else {
                    eVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f2322n) {
            if (this.f2321m == null) {
                this.f2321m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2321m);
        }
        if (this.f2323o == null && ViewCompat.v(this)) {
            ViewCompat.g0(this);
        }
        this.f2317i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f2322n && this.f2321m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2321m);
        }
        View view = this.f2320l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2317i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2324p || this.f2325q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f2323o;
        int iL = windowInsetsCompat != null ? windowInsetsCompat.l() : 0;
        if (iL > 0) {
            this.f2325q.setBounds(0, 0, getWidth(), iL);
            this.f2325q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zL;
        }
        Q(true);
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iY = ViewCompat.y(this);
        int size = this.f2309a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f2309a.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((e) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iY))) {
                I(view, iY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.j(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.r(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.H(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.j(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.s(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        SparseArray sparseArray = savedState.f2329c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarF = y(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarF = ((e) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id, parcelableC);
            }
        }
        savedState.f2329c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
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
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2319k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2319k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2319k
            boolean r6 = r6.H(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f2319k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.Q(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List listH = this.f2310b.h(view);
        this.f2312d.clear();
        if (listH != null) {
            this.f2312d.addAll(listH);
        }
        return this.f2312d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((e) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2316h) {
            return;
        }
        Q(false);
        this.f2316h = true;
    }

    public List s(View view) {
        List listG = this.f2310b.g(view);
        this.f2312d.clear();
        if (listG != null) {
            this.f2312d.addAll(listG);
        }
        return this.f2312d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2326r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f2325q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2325q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2325q.setState(getDrawableState());
                }
                k0.a.m(this.f2325q, ViewCompat.y(this));
                this.f2325q.setVisible(getVisibility() == 0, false);
                this.f2325q.setCallback(this);
            }
            ViewCompat.a0(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i10) {
        setStatusBarBackground(i10 != 0 ? ContextCompat.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2325q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2325q.setVisible(z10, false);
    }

    public void t(View view, Rect rect) {
        d0.c.a(this, view, rect);
    }

    public void u(View view, int i10, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, eVar, measuredWidth, measuredHeight);
        d(eVar, rect2, measuredWidth, measuredHeight);
    }

    public final void v(View view, int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int iB = r.b(R(eVar.f2334c), i10);
        int iB2 = r.b(S(eVar.f2335d), i10);
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

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2325q;
    }

    public final int w(int i10) {
        int[] iArr = this.f2318j;
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

    public void x(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e y(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f2333b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.o(behavior);
                eVar.f2333b = true;
                return eVar;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    eVar.o(defaultBehavior.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f2333b = true;
        }
        return eVar;
    }

    public final void z(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f2307x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c0.a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f2309a = new ArrayList();
        this.f2310b = new d0.b();
        this.f2311c = new ArrayList();
        this.f2312d = new ArrayList();
        this.f2314f = new int[2];
        this.f2315g = new int[2];
        this.f2328t = new f0(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c0.c.CoordinatorLayout, 0, c0.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c0.c.CoordinatorLayout, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, c0.c.CoordinatorLayout, attributeSet, typedArray, 0, c0.b.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, c0.c.CoordinatorLayout, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(c0.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f2318j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f2318j.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f2318j[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f2325q = typedArray.getDrawable(c0.c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        X();
        super.setOnHierarchyChangeListener(new d());
        if (ViewCompat.w(this) == 0) {
            ViewCompat.q0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray f2329c;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2329c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f2329c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f2329c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2329c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f2329c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f2332a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2333b;

        /* renamed from: c, reason: collision with root package name */
        public int f2334c;

        /* renamed from: d, reason: collision with root package name */
        public int f2335d;

        /* renamed from: e, reason: collision with root package name */
        public int f2336e;

        /* renamed from: f, reason: collision with root package name */
        public int f2337f;

        /* renamed from: g, reason: collision with root package name */
        public int f2338g;

        /* renamed from: h, reason: collision with root package name */
        public int f2339h;

        /* renamed from: i, reason: collision with root package name */
        public int f2340i;

        /* renamed from: j, reason: collision with root package name */
        public int f2341j;

        /* renamed from: k, reason: collision with root package name */
        public View f2342k;

        /* renamed from: l, reason: collision with root package name */
        public View f2343l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f2344m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2345n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f2346o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f2347p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f2348q;

        /* renamed from: r, reason: collision with root package name */
        public Object f2349r;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f2333b = false;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = -1;
            this.f2337f = -1;
            this.f2338g = 0;
            this.f2339h = 0;
            this.f2348q = new Rect();
        }

        public boolean a() {
            return this.f2342k == null && this.f2337f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f2343l || s(view2, ViewCompat.y(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f2332a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f2332a == null) {
                this.f2344m = false;
            }
            return this.f2344m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2337f == -1) {
                this.f2343l = null;
                this.f2342k = null;
                return null;
            }
            if (this.f2342k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f2342k;
        }

        public int e() {
            return this.f2337f;
        }

        public c f() {
            return this.f2332a;
        }

        public boolean g() {
            return this.f2347p;
        }

        public Rect h() {
            return this.f2348q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2344m;
            if (z10) {
                return true;
            }
            c cVar = this.f2332a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f2344m = zE;
            return zE;
        }

        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f2345n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2346o;
        }

        public void k() {
            this.f2347p = false;
        }

        public void l(int i10) {
            r(i10, false);
        }

        public void m() {
            this.f2344m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f2337f);
            this.f2342k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2343l = null;
                    this.f2342k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2337f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f2343l = null;
                this.f2342k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f2343l = null;
                    this.f2342k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f2343l = viewFindViewById;
        }

        public void o(c cVar) {
            c cVar2 = this.f2332a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f2332a = cVar;
                this.f2349r = null;
                this.f2333b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        public void p(boolean z10) {
            this.f2347p = z10;
        }

        public void q(Rect rect) {
            this.f2348q.set(rect);
        }

        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2345n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2346o = z10;
            }
        }

        public final boolean s(View view, int i10) {
            int iB = r.b(((e) view.getLayoutParams()).f2338g, i10);
            return iB != 0 && (r.b(this.f2339h, i10) & iB) == iB;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2342k.getId() != this.f2337f) {
                return false;
            }
            View view2 = this.f2342k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2343l = null;
                    this.f2342k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2343l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2333b = false;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = -1;
            this.f2337f = -1;
            this.f2338g = 0;
            this.f2339h = 0;
            this.f2348q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c0.c.CoordinatorLayout_Layout);
            this.f2334c = typedArrayObtainStyledAttributes.getInteger(c0.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2337f = typedArrayObtainStyledAttributes.getResourceId(c0.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2335d = typedArrayObtainStyledAttributes.getInteger(c0.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2336e = typedArrayObtainStyledAttributes.getInteger(c0.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2338g = typedArrayObtainStyledAttributes.getInt(c0.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2339h = typedArrayObtainStyledAttributes.getInt(c0.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = c0.c.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f2333b = zHasValue;
            if (zHasValue) {
                this.f2332a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f2332a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2333b = false;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = -1;
            this.f2337f = -1;
            this.f2338g = 0;
            this.f2339h = 0;
            this.f2348q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2333b = false;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = -1;
            this.f2337f = -1;
            this.f2338g = 0;
            this.f2339h = 0;
            this.f2348q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2333b = false;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = -1;
            this.f2337f = -1;
            this.f2338g = 0;
            this.f2339h = 0;
            this.f2348q = new Rect();
        }
    }
}
