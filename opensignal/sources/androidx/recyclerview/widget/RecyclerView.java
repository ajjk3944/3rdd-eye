package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import androidx.datastore.preferences.protobuf.l;
import com.google.android.gms.internal.measurement.e5;
import dj.i;
import h7.a1;
import h7.b1;
import h7.c1;
import h7.d1;
import h7.e0;
import h7.e1;
import h7.f1;
import h7.g1;
import h7.h0;
import h7.j1;
import h7.k1;
import h7.l1;
import h7.m0;
import h7.m1;
import h7.n;
import h7.n0;
import h7.n1;
import h7.o0;
import h7.p1;
import h7.q0;
import h7.t0;
import h7.u0;
import h7.v0;
import h7.w0;
import h7.x;
import h7.y0;
import h7.z;
import h7.z0;
import h7.z1;
import i3.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.o;
import u3.c0;
import u3.i0;
import u3.j;
import u3.j0;
import u3.k;
import y1.i2;
import y1.u1;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, j {
    public static boolean W0 = false;
    public static boolean X0 = false;
    public static final int[] Y0 = {R.attr.nestedScrollingEnabled};
    public static final float Z0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: a1, reason: collision with root package name */
    public static final boolean f2050a1 = true;

    /* renamed from: b1, reason: collision with root package name */
    public static final boolean f2051b1 = true;

    /* renamed from: c1, reason: collision with root package name */
    public static final boolean f2052c1 = true;

    /* renamed from: d1, reason: collision with root package name */
    public static final Class[] f2053d1;

    /* renamed from: e1, reason: collision with root package name */
    public static final b4.d f2054e1;

    /* renamed from: f1, reason: collision with root package name */
    public static final k1 f2055f1;
    public final m1 A0;
    public final bm.e B;
    public z B0;
    public final l C0;
    public boolean D;
    public final j1 D0;
    public final m0 E;
    public c1 E0;
    public final Rect F;
    public ArrayList F0;
    public final Rect G;
    public boolean G0;
    public final RectF H;
    public boolean H0;
    public q0 I;
    public final n0 I0;
    public y0 J;
    public boolean J0;
    public final ArrayList K;
    public p1 K0;
    public final ArrayList L;
    public final int[] L0;
    public final ArrayList M;
    public k M0;
    public b1 N;
    public final int[] N0;
    public boolean O;
    public final int[] O0;
    public boolean P;
    public final int[] P0;
    public boolean Q;
    public final ArrayList Q0;
    public int R;
    public final m0 R0;
    public boolean S;
    public boolean S0;
    public boolean T;
    public int T0;
    public boolean U;
    public int U0;
    public int V;
    public final n0 V0;
    public boolean W;

    /* renamed from: a, reason: collision with root package name */
    public final float f2056a;

    /* renamed from: a0, reason: collision with root package name */
    public final AccessibilityManager f2057a0;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList f2058b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2059c0;

    /* renamed from: d, reason: collision with root package name */
    public final b f2060d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2061d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f2062e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f2063f0;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f2064g;

    /* renamed from: g0, reason: collision with root package name */
    public u0 f2065g0;

    /* renamed from: h0, reason: collision with root package name */
    public EdgeEffect f2066h0;

    /* renamed from: i0, reason: collision with root package name */
    public EdgeEffect f2067i0;

    /* renamed from: j0, reason: collision with root package name */
    public EdgeEffect f2068j0;

    /* renamed from: k0, reason: collision with root package name */
    public EdgeEffect f2069k0;

    /* renamed from: l0, reason: collision with root package name */
    public v0 f2070l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f2071m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f2072n0;

    /* renamed from: o0, reason: collision with root package name */
    public VelocityTracker f2073o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2074p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2075q0;

    /* renamed from: r, reason: collision with root package name */
    public SavedState f2076r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2077r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2078s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2079t0;

    /* renamed from: u0, reason: collision with root package name */
    public a1 f2080u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int f2081v0;

    /* renamed from: w0, reason: collision with root package name */
    public final int f2082w0;

    /* renamed from: x, reason: collision with root package name */
    public final h7.b f2083x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f2084x0;

    /* renamed from: y, reason: collision with root package name */
    public final bj.c f2085y;

    /* renamed from: y0, reason: collision with root package name */
    public final float f2086y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2087z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* renamed from: g, reason: collision with root package name */
        public Parcelable f2088g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2088g = parcel.readParcelable(classLoader == null ? y0.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f2088g, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f2053d1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2054e1 = new b4.d(1);
        f2055f1 = new k1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g7.a.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i10));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static n1 M(View view) {
        if (view == null) {
            return null;
        }
        return ((z0) view.getLayoutParams()).f10292a;
    }

    public static void N(Rect rect, View view) {
        z0 z0Var = (z0) view.getLayoutParams();
        Rect rect2 = z0Var.f10293b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) z0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) z0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) z0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin);
    }

    private k getScrollingChildHelper() {
        if (this.M0 == null) {
            this.M0 = new k(this);
        }
        return this.M0;
    }

    public static void l(n1 n1Var) {
        WeakReference weakReference = n1Var.f10156b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == n1Var.f10155a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            n1Var.f10156b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && g.r(edgeEffect) != 0.0f) {
            int iRound = Math.round(g.y(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || g.r(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(g.y(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        W0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        X0 = z10;
    }

    public final void A() {
        if (this.f2068j0 != null) {
            return;
        }
        ((k1) this.f2065g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2068j0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f2067i0 != null) {
            return;
        }
        ((k1) this.f2065g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2067i0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.I + ", layout:" + this.J + ", context:" + getContext();
    }

    public final void D(j1 j1Var) {
        if (getScrollState() != 2) {
            j1Var.getClass();
            return;
        }
        OverScroller overScroller = this.A0.f10138g;
        overScroller.getFinalX();
        overScroller.getCurrX();
        j1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b1 b1Var = (b1) arrayList.get(i10);
            if (b1Var.b(this, motionEvent) && action != 3) {
                this.N = b1Var;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int iY = this.f2085y.y();
        if (iY == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iY; i12++) {
            n1 n1VarM = M(this.f2085y.x(i12));
            if (!n1VarM.o()) {
                int iB = n1VarM.b();
                if (iB < i10) {
                    i10 = iB;
                }
                if (iB > i11) {
                    i11 = iB;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final n1 I(int i10) {
        n1 n1Var = null;
        if (this.f2059c0) {
            return null;
        }
        int iB = this.f2085y.B();
        for (int i11 = 0; i11 < iB; i11++) {
            n1 n1VarM = M(this.f2085y.A(i11));
            if (n1VarM != null && !n1VarM.h() && J(n1VarM) == i10) {
                if (!((ArrayList) this.f2085y.f2797x).contains(n1VarM.f10155a)) {
                    return n1VarM;
                }
                n1Var = n1VarM;
            }
        }
        return n1Var;
    }

    public final int J(n1 n1Var) {
        if ((n1Var.j & 524) == 0 && n1Var.e()) {
            int i10 = n1Var.f10157c;
            ArrayList arrayList = (ArrayList) this.f2083x.f10001c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h7.a aVar = (h7.a) arrayList.get(i11);
                int i12 = aVar.f9994a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = aVar.f9995b;
                        if (i13 <= i10) {
                            int i14 = aVar.f9996c;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = aVar.f9995b;
                        if (i15 == i10) {
                            i10 = aVar.f9996c;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (aVar.f9996c <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (aVar.f9995b <= i10) {
                    i10 += aVar.f9996c;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long K(n1 n1Var) {
        return this.I.f10190b ? n1Var.f10159e : n1Var.f10157c;
    }

    public final n1 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect O(View view) {
        z0 z0Var = (z0) view.getLayoutParams();
        boolean z10 = z0Var.f10294c;
        Rect rect = z0Var.f10293b;
        if (z10) {
            j1 j1Var = this.D0;
            if (!j1Var.f10107g || (!z0Var.f10292a.k() && !z0Var.f10292a.f())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.F;
                    rect2.set(0, 0, 0, 0);
                    ((w0) arrayList.get(i10)).c(rect2, view, this, j1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                z0Var.f10294c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean P() {
        return !this.Q || this.f2059c0 || this.f2083x.j();
    }

    public final void Q() {
        if (this.L.size() == 0) {
            return;
        }
        y0 y0Var = this.J;
        if (y0Var != null) {
            y0Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        T();
        requestLayout();
    }

    public final boolean R() {
        return this.f2062e0 > 0;
    }

    public final void S(int i10) {
        if (this.J == null) {
            return;
        }
        setScrollState(2);
        this.J.q0(i10);
        awakenScrollBars();
    }

    public final void T() {
        int iB = this.f2085y.B();
        for (int i10 = 0; i10 < iB; i10++) {
            ((z0) this.f2085y.A(i10).getLayoutParams()).f10294c = true;
        }
        ArrayList arrayList = this.f2064g.f10060c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z0 z0Var = (z0) ((n1) arrayList.get(i11)).f10155a.getLayoutParams();
            if (z0Var != null) {
                z0Var.f10294c = true;
            }
        }
    }

    public final void U(int i10, boolean z10, int i11) {
        int i12 = i10 + i11;
        int iB = this.f2085y.B();
        for (int i13 = 0; i13 < iB; i13++) {
            n1 n1VarM = M(this.f2085y.A(i13));
            if (n1VarM != null && !n1VarM.o()) {
                int i14 = n1VarM.f10157c;
                j1 j1Var = this.D0;
                if (i14 >= i12) {
                    if (X0) {
                        n1VarM.toString();
                    }
                    n1VarM.l(-i11, z10);
                    j1Var.f10106f = true;
                } else if (i14 >= i10) {
                    if (X0) {
                        n1VarM.toString();
                    }
                    n1VarM.a(8);
                    n1VarM.l(-i11, z10);
                    n1VarM.f10157c = i10 - 1;
                    j1Var.f10106f = true;
                }
            }
        }
        f1 f1Var = this.f2064g;
        ArrayList arrayList = f1Var.f10060c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n1 n1Var = (n1) arrayList.get(size);
            if (n1Var != null) {
                int i15 = n1Var.f10157c;
                if (i15 >= i12) {
                    if (X0) {
                        n1Var.toString();
                    }
                    n1Var.l(-i11, z10);
                } else if (i15 >= i10) {
                    n1Var.a(8);
                    f1Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.f2062e0++;
    }

    public final void W(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f2062e0 - 1;
        this.f2062e0 = i11;
        if (i11 < 1) {
            if (W0 && i11 < 0) {
                throw new IllegalStateException(h0.b.j(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f2062e0 = 0;
            if (z10) {
                int i12 = this.V;
                this.V = 0;
                if (i12 != 0 && (accessibilityManager = this.f2057a0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.Q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n1 n1Var = (n1) arrayList.get(size);
                    if (n1Var.f10155a.getParent() == this && !n1Var.o() && (i10 = n1Var.f10169q) != -1) {
                        View view = n1Var.f10155a;
                        WeakHashMap weakHashMap = i0.f23177a;
                        view.setImportantForAccessibility(i10);
                        n1Var.f10169q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2072n0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2072n0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2077r0 = x10;
            this.f2074p0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2078s0 = y10;
            this.f2075q0 = y10;
        }
    }

    public final void Y() {
        if (this.J0 || !this.O) {
            return;
        }
        WeakHashMap weakHashMap = i0.f23177a;
        postOnAnimation(this.R0);
        this.J0 = true;
    }

    public final void Z() {
        boolean z10;
        boolean z11 = false;
        if (this.f2059c0) {
            h7.b bVar = this.f2083x;
            bVar.q((ArrayList) bVar.f10001c);
            bVar.q((ArrayList) bVar.f10002d);
            bVar.f9999a = 0;
            if (this.f2061d0) {
                this.J.Z();
            }
        }
        if (this.f2070l0 == null || !this.J.C0()) {
            this.f2083x.d();
        } else {
            this.f2083x.p();
        }
        boolean z12 = this.G0 || this.H0;
        boolean z13 = this.Q && this.f2070l0 != null && ((z10 = this.f2059c0) || z12 || this.J.f10278f) && (!z10 || this.I.f10190b);
        j1 j1Var = this.D0;
        j1Var.j = z13;
        if (z13 && z12 && !this.f2059c0 && this.f2070l0 != null && this.J.C0()) {
            z11 = true;
        }
        j1Var.k = z11;
    }

    public final void a0(boolean z10) {
        this.f2061d0 = z10 | this.f2061d0;
        this.f2059c0 = true;
        int iB = this.f2085y.B();
        for (int i10 = 0; i10 < iB; i10++) {
            n1 n1VarM = M(this.f2085y.A(i10));
            if (n1VarM != null && !n1VarM.o()) {
                n1VarM.a(6);
            }
        }
        T();
        f1 f1Var = this.f2064g;
        ArrayList arrayList = f1Var.f10060c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n1 n1Var = (n1) arrayList.get(i11);
            if (n1Var != null) {
                n1Var.a(6);
                n1Var.a(1024);
            }
        }
        q0 q0Var = f1Var.f10065h.I;
        if (q0Var == null || !q0Var.f10190b) {
            f1Var.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        y0 y0Var = this.J;
        if (y0Var != null) {
            y0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(n1 n1Var, androidx.media3.common.i0 i0Var) {
        n1Var.j &= -8193;
        boolean z10 = this.D0.f10108h;
        bm.e eVar = this.B;
        if (z10 && n1Var.k() && !n1Var.h() && !n1Var.o()) {
            ((o) eVar.f2831g).e(n1Var, K(n1Var));
        }
        u.i0 i0Var2 = (u.i0) eVar.f2830d;
        z1 z1VarA = (z1) i0Var2.get(n1Var);
        if (z1VarA == null) {
            z1VarA = z1.a();
            i0Var2.put(n1Var, z1VarA);
        }
        z1VarA.f10298b = i0Var;
        z1VarA.f10297a |= 4;
    }

    public final int c0(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f2066h0;
        float f11 = 0.0f;
        if (edgeEffect == null || g.r(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f2068j0;
            if (edgeEffect2 != null && g.r(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f2068j0.onRelease();
                } else {
                    float fY = g.y(this.f2068j0, width, height);
                    if (g.r(this.f2068j0) == 0.0f) {
                        this.f2068j0.onRelease();
                    }
                    f11 = fY;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f2066h0.onRelease();
            } else {
                float f12 = -g.y(this.f2066h0, -width, 1.0f - height);
                if (g.r(this.f2066h0) == 0.0f) {
                    this.f2066h0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof z0) && this.J.f((z0) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.d()) {
            return this.J.j(this.D0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.d()) {
            return this.J.k(this.D0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.d()) {
            return this.J.l(this.D0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.e()) {
            return this.J.m(this.D0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.e()) {
            return this.J.n(this.D0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        y0 y0Var = this.J;
        if (y0Var != null && y0Var.e()) {
            return this.J.o(this.D0);
        }
        return 0;
    }

    public final int d0(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f2067i0;
        float f11 = 0.0f;
        if (edgeEffect == null || g.r(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f2069k0;
            if (edgeEffect2 != null && g.r(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f2069k0.onRelease();
                } else {
                    float fY = g.y(this.f2069k0, height, 1.0f - width);
                    if (g.r(this.f2069k0) == 0.0f) {
                        this.f2069k0.onRelease();
                    }
                    f11 = fY;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f2067i0.onRelease();
            } else {
                float f12 = -g.y(this.f2067i0, -height, width);
                if (g.r(this.f2067i0) == 0.0f) {
                    this.f2067i0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((w0) arrayList.get(i10)).e(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2066h0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.D ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2066h0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2067i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.D) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2067i0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2068j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.D ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2068j0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2069k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.D) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2069k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f2070l0 == null || arrayList.size() <= 0 || !this.f2070l0.f()) ? z10 : true) {
            WeakHashMap weakHashMap = i0.f23177a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.F;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof z0) {
            z0 z0Var = (z0) layoutParams;
            if (!z0Var.f10294c) {
                Rect rect2 = z0Var.f10293b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.J.n0(this, view, this.F, !this.Q, view2 == null);
    }

    public final void f0() {
        VelocityTracker velocityTracker = this.f2073o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        o0(0);
        EdgeEffect edgeEffect = this.f2066h0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2066h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2067i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2067i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2068j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2068j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2069k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2069k0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i0.f23177a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        y0 y0Var = this.J;
        if (y0Var != null) {
            return y0Var.r();
        }
        throw new IllegalStateException(h0.b.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        y0 y0Var = this.J;
        if (y0Var != null) {
            return y0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(h0.b.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public q0 getAdapter() {
        return this.I;
    }

    @Override // android.view.View
    public int getBaseline() {
        y0 y0Var = this.J;
        if (y0Var == null) {
            return super.getBaseline();
        }
        y0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.D;
    }

    public p1 getCompatAccessibilityDelegate() {
        return this.K0;
    }

    public u0 getEdgeEffectFactory() {
        return this.f2065g0;
    }

    public v0 getItemAnimator() {
        return this.f2070l0;
    }

    public int getItemDecorationCount() {
        return this.L.size();
    }

    public y0 getLayoutManager() {
        return this.J;
    }

    public int getMaxFlingVelocity() {
        return this.f2082w0;
    }

    public int getMinFlingVelocity() {
        return this.f2081v0;
    }

    public long getNanoTime() {
        if (f2052c1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public a1 getOnFlingListener() {
        return this.f2080u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2087z0;
    }

    public e1 getRecycledViewPool() {
        return this.f2064g.c();
    }

    public int getScrollState() {
        return this.f2071m0;
    }

    public final void h(n1 n1Var) {
        View view = n1Var.f10155a;
        boolean z10 = view.getParent() == this;
        this.f2064g.m(L(view));
        if (n1Var.j()) {
            this.f2085y.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f2085y.e(view, -1, true);
            return;
        }
        bj.c cVar = this.f2085y;
        int iIndexOfChild = ((RecyclerView) ((b9.c) cVar.f2795g).f2478d).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((i) cVar.f2796r).G(iIndexOfChild);
            cVar.C(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i10, int i11, int[] iArr) {
        n1 n1Var;
        m0();
        V();
        int i12 = p3.f.f20247a;
        Trace.beginSection("RV Scroll");
        j1 j1Var = this.D0;
        D(j1Var);
        f1 f1Var = this.f2064g;
        int iP0 = i10 != 0 ? this.J.p0(i10, f1Var, j1Var) : 0;
        int iR0 = i11 != 0 ? this.J.r0(i11, f1Var, j1Var) : 0;
        Trace.endSection();
        bj.c cVar = this.f2085y;
        int iY = cVar.y();
        for (int i13 = 0; i13 < iY; i13++) {
            View viewX = cVar.x(i13);
            n1 n1VarL = L(viewX);
            if (n1VarL != null && (n1Var = n1VarL.f10163i) != null) {
                View view = n1Var.f10155a;
                int left = viewX.getLeft();
                int top = viewX.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = iP0;
            iArr[1] = iR0;
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(w0 w0Var) {
        y0 y0Var = this.J;
        if (y0Var != null) {
            y0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(w0Var);
        T();
        requestLayout();
    }

    public final void i0(int i10) {
        e0 e0Var;
        if (this.T) {
            return;
        }
        setScrollState(0);
        m1 m1Var = this.A0;
        m1Var.B.removeCallbacks(m1Var);
        m1Var.f10138g.abortAnimation();
        y0 y0Var = this.J;
        if (y0Var != null && (e0Var = y0Var.f10277e) != null) {
            e0Var.j();
        }
        y0 y0Var2 = this.J;
        if (y0Var2 == null) {
            io.sentry.android.core.e0.d("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y0Var2.q0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.O;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.T;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f23188d;
    }

    public final void j(c1 c1Var) {
        if (this.F0 == null) {
            this.F0 = new ArrayList();
        }
        this.F0.add(c1Var);
    }

    public final boolean j0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fR = g.r(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f2056a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d6 = Z0;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * dLog) * ((double) f10))) < fR;
    }

    public final void k(String str) {
        if (R()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(h0.b.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f2063f0 > 0) {
            io.sentry.android.core.e0.q("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(h0.b.j(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i10, boolean z10, int i11) {
        y0 y0Var = this.J;
        if (y0Var == null) {
            io.sentry.android.core.e0.d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.T) {
            return;
        }
        if (!y0Var.d()) {
            i10 = 0;
        }
        if (!this.J.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.A0.c(i10, i11, Integer.MIN_VALUE, null);
    }

    public final void l0(int i10) {
        if (this.T) {
            return;
        }
        y0 y0Var = this.J;
        if (y0Var == null) {
            io.sentry.android.core.e0.d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y0Var.A0(this, i10);
        }
    }

    public final void m() {
        int iB = this.f2085y.B();
        for (int i10 = 0; i10 < iB; i10++) {
            n1 n1VarM = M(this.f2085y.A(i10));
            if (!n1VarM.o()) {
                n1VarM.f10158d = -1;
                n1VarM.f10161g = -1;
            }
        }
        f1 f1Var = this.f2064g;
        ArrayList arrayList = f1Var.f10058a;
        ArrayList arrayList2 = f1Var.f10060c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            n1 n1Var = (n1) arrayList2.get(i11);
            n1Var.f10158d = -1;
            n1Var.f10161g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            n1 n1Var2 = (n1) arrayList.get(i12);
            n1Var2.f10158d = -1;
            n1Var2.f10161g = -1;
        }
        ArrayList arrayList3 = f1Var.f10059b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                n1 n1Var3 = (n1) f1Var.f10059b.get(i13);
                n1Var3.f10158d = -1;
                n1Var3.f10161g = -1;
            }
        }
    }

    public final void m0() {
        int i10 = this.R + 1;
        this.R = i10;
        if (i10 != 1 || this.T) {
            return;
        }
        this.S = false;
    }

    public final void n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2066h0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f2066h0.onRelease();
            zIsFinished = this.f2066h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2068j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f2068j0.onRelease();
            zIsFinished |= this.f2068j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2067i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f2067i0.onRelease();
            zIsFinished |= this.f2067i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2069k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f2069k0.onRelease();
            zIsFinished |= this.f2069k0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i0.f23177a;
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z10) {
        if (this.R < 1) {
            if (W0) {
                throw new IllegalStateException(h0.b.j(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.R = 1;
        }
        if (!z10 && !this.T) {
            this.S = false;
        }
        if (this.R == 1) {
            if (z10 && this.S && !this.T && this.J != null && this.I != null) {
                s();
            }
            if (!this.T) {
                this.S = false;
            }
        }
        this.R--;
    }

    public final void o0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2062e0 = r0
            r1 = 1
            r5.O = r1
            boolean r2 = r5.Q
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.Q = r2
            h7.f1 r2 = r5.f2064g
            r2.e()
            h7.y0 r2 = r5.J
            if (r2 == 0) goto L26
            r2.f10279g = r1
            r2.R(r5)
        L26:
            r5.J0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f2052c1
            if (r0 == 0) goto L8e
            java.lang.ThreadLocal r0 = h7.z.f10286x
            java.lang.Object r1 = r0.get()
            h7.z r1 = (h7.z) r1
            r5.B0 = r1
            if (r1 != 0) goto L74
            h7.z r1 = new h7.z
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10288a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10291r = r2
            r5.B0 = r1
            java.util.WeakHashMap r1 = u3.i0.f23177a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            h7.z r2 = r5.B0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10290g = r3
            r0.set(r2)
        L74:
            h7.z r0 = r5.B0
            java.util.ArrayList r0 = r0.f10288a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.W0
            if (r1 == 0) goto L8b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L83
            goto L8b
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8b:
            r0.add(r5)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z zVar;
        e0 e0Var;
        super.onDetachedFromWindow();
        v0 v0Var = this.f2070l0;
        if (v0Var != null) {
            v0Var.e();
        }
        int i10 = 0;
        setScrollState(0);
        m1 m1Var = this.A0;
        m1Var.B.removeCallbacks(m1Var);
        m1Var.f10138g.abortAnimation();
        y0 y0Var = this.J;
        if (y0Var != null && (e0Var = y0Var.f10277e) != null) {
            e0Var.j();
        }
        this.O = false;
        y0 y0Var2 = this.J;
        if (y0Var2 != null) {
            y0Var2.f10279g = false;
            y0Var2.S(this);
        }
        this.Q0.clear();
        removeCallbacks(this.R0);
        this.B.getClass();
        while (z1.f10296d.a() != null) {
        }
        f1 f1Var = this.f2064g;
        ArrayList arrayList = f1Var.f10060c;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            z3.a.a(((n1) arrayList.get(i11)).f10155a);
        }
        f1Var.f(f1Var.f10065h.I, false);
        int i12 = z3.a.f26622a;
        while (i10 < getChildCount()) {
            int i13 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = z3.a.b(childAt).f26624a;
            for (int iZ = e5.z(arrayList2); -1 < iZ; iZ--) {
                y1.a aVar = ((u1) arrayList2.get(iZ)).f25782a;
                i2 i2Var = aVar.f25622g;
                if (i2Var != null) {
                    i2Var.a();
                }
                aVar.f25622g = null;
                aVar.requestLayout();
            }
            i10 = i13;
        }
        if (!f2052c1 || (zVar = this.B0) == null) {
            return;
        }
        boolean zRemove = zVar.f10288a.remove(this);
        if (W0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.B0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w0) arrayList.get(i10)).d(canvas, this, this.D0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.T) {
            this.N = null;
            if (F(motionEvent)) {
                f0();
                setScrollState(0);
                return true;
            }
            y0 y0Var = this.J;
            if (y0Var != null) {
                boolean zD = y0Var.d();
                boolean zE = this.J.e();
                if (this.f2073o0 == null) {
                    this.f2073o0 = VelocityTracker.obtain();
                }
                this.f2073o0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.U) {
                        this.U = false;
                    }
                    this.f2072n0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f2077r0 = x10;
                    this.f2074p0 = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f2078s0 = y10;
                    this.f2075q0 = y10;
                    EdgeEffect edgeEffect = this.f2066h0;
                    if (edgeEffect == null || g.r(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z10 = false;
                    } else {
                        g.y(this.f2066h0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f2068j0;
                    boolean z12 = z10;
                    if (edgeEffect2 != null) {
                        z12 = z10;
                        if (g.r(edgeEffect2) != 0.0f) {
                            z12 = z10;
                            if (!canScrollHorizontally(1)) {
                                g.y(this.f2068j0, 0.0f, motionEvent.getY() / getHeight());
                                z12 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f2067i0;
                    boolean z13 = z12;
                    if (edgeEffect3 != null) {
                        z13 = z12;
                        if (g.r(edgeEffect3) != 0.0f) {
                            z13 = z12;
                            if (!canScrollVertically(-1)) {
                                g.y(this.f2067i0, 0.0f, motionEvent.getX() / getWidth());
                                z13 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f2069k0;
                    boolean z14 = z13;
                    if (edgeEffect4 != null) {
                        z14 = z13;
                        if (g.r(edgeEffect4) != 0.0f) {
                            z14 = z13;
                            if (!canScrollVertically(1)) {
                                g.y(this.f2069k0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z14 = true;
                            }
                        }
                    }
                    if (z14 || this.f2071m0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.O0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zD;
                    if (zE) {
                        i10 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f2073o0.clear();
                    o0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2072n0);
                    if (iFindPointerIndex < 0) {
                        io.sentry.android.core.e0.d("RecyclerView", "Error processing scroll; pointer index for id " + this.f2072n0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f2071m0 != 1) {
                        int i11 = x11 - this.f2074p0;
                        int i12 = y11 - this.f2075q0;
                        if (zD == 0 || Math.abs(i11) <= this.f2079t0) {
                            z11 = false;
                        } else {
                            this.f2077r0 = x11;
                            z11 = true;
                        }
                        if (zE && Math.abs(i12) > this.f2079t0) {
                            this.f2078s0 = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    f0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2072n0 = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2077r0 = x12;
                    this.f2074p0 = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2078s0 = y12;
                    this.f2075q0 = y12;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.f2071m0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = p3.f.f20247a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.Q = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        y0 y0Var = this.J;
        if (y0Var == null) {
            q(i10, i11);
            return;
        }
        boolean zL = y0Var.L();
        boolean z10 = false;
        j1 j1Var = this.D0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.J.f10274b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.S0 = z10;
            if (z10 || this.I == null) {
                return;
            }
            if (j1Var.f10104d == 1) {
                t();
            }
            this.J.t0(i10, i11);
            j1Var.f10109i = true;
            u();
            this.J.v0(i10, i11);
            if (this.J.y0()) {
                this.J.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                j1Var.f10109i = true;
                u();
                this.J.v0(i10, i11);
            }
            this.T0 = getMeasuredWidth();
            this.U0 = getMeasuredHeight();
            return;
        }
        if (this.P) {
            this.J.f10274b.q(i10, i11);
            return;
        }
        if (this.W) {
            m0();
            V();
            Z();
            W(true);
            if (j1Var.k) {
                j1Var.f10107g = true;
            } else {
                this.f2083x.d();
                j1Var.f10107g = false;
            }
            this.W = false;
            n0(false);
        } else if (j1Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        q0 q0Var = this.I;
        if (q0Var != null) {
            j1Var.f10105e = q0Var.b();
        } else {
            j1Var.f10105e = 0;
        }
        m0();
        this.J.f10274b.q(i10, i11);
        n0(false);
        j1Var.f10107g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f2076r = savedState;
        super.onRestoreInstanceState(savedState.f1243a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2076r;
        if (savedState2 != null) {
            savedState.f2088g = savedState2.f2088g;
            return savedState;
        }
        y0 y0Var = this.J;
        if (y0Var != null) {
            savedState.f2088g = y0Var.g0();
            return savedState;
        }
        savedState.f2088g = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f2069k0 = null;
        this.f2067i0 = null;
        this.f2068j0 = null;
        this.f2066h0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b2, code lost:
    
        if (r5 == 0) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd A[PHI: r1
  0x00fd: PHI (r1v70 int) = (r1v54 int), (r1v74 int) binds: [B:51:0x00e6, B:55:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (!this.Q || this.f2059c0) {
            int i10 = p3.f.f20247a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        h7.b bVar = this.f2083x;
        if (bVar.j()) {
            int i11 = bVar.f9999a;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (bVar.j()) {
                    int i12 = p3.f.f20247a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = p3.f.f20247a;
            Trace.beginSection("RV PartialInvalidate");
            m0();
            V();
            bVar.p();
            if (!this.S) {
                bj.c cVar = this.f2085y;
                int iY = cVar.y();
                int i14 = 0;
                while (true) {
                    if (i14 < iY) {
                        n1 n1VarM = M(cVar.x(i14));
                        if (n1VarM != null && !n1VarM.o() && n1VarM.k()) {
                            s();
                            break;
                        }
                        i14++;
                    } else {
                        bVar.c();
                        break;
                    }
                }
            }
            n0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i0.f23177a;
        setMeasuredDimension(y0.g(i10, paddingRight, getMinimumWidth()), y0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        n1 n1VarM = M(view);
        q0 q0Var = this.I;
        if (q0Var != null && n1VarM != null) {
            q0Var.o(n1VarM);
        }
        ArrayList arrayList = this.f2058b0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z7.g) this.f2058b0.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        n1 n1VarM = M(view);
        if (n1VarM != null) {
            if (n1VarM.j()) {
                n1VarM.j &= -257;
            } else if (!n1VarM.o()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(n1VarM);
                throw new IllegalArgumentException(h0.b.j(this, sb2));
            }
        } else if (W0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(h0.b.j(this, sb3));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        e0 e0Var = this.J.f10277e;
        if ((e0Var == null || !e0Var.f10042e) && !R() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.J.n0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b1) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R != 0 || this.T) {
            this.S = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03aa  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        y0 y0Var = this.J;
        if (y0Var == null) {
            io.sentry.android.core.e0.d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.T) {
            return;
        }
        boolean zD = y0Var.d();
        boolean zE = this.J.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            g0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        io.sentry.android.core.e0.p("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.V |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(p1 p1Var) {
        this.K0 = p1Var;
        i0.n(this, p1Var);
    }

    public void setAdapter(q0 q0Var) {
        setLayoutFrozen(false);
        q0 q0Var2 = this.I;
        b bVar = this.f2060d;
        if (q0Var2 != null) {
            q0Var2.f10189a.unregisterObserver(bVar);
            this.I.l(this);
        }
        v0 v0Var = this.f2070l0;
        if (v0Var != null) {
            v0Var.e();
        }
        y0 y0Var = this.J;
        f1 f1Var = this.f2064g;
        if (y0Var != null) {
            y0Var.j0(f1Var);
            this.J.k0(f1Var);
        }
        f1Var.f10058a.clear();
        f1Var.g();
        h7.b bVar2 = this.f2083x;
        bVar2.q((ArrayList) bVar2.f10001c);
        bVar2.q((ArrayList) bVar2.f10002d);
        bVar2.f9999a = 0;
        q0 q0Var3 = this.I;
        this.I = q0Var;
        if (q0Var != null) {
            q0Var.f10189a.registerObserver(bVar);
            q0Var.i(this);
        }
        y0 y0Var2 = this.J;
        if (y0Var2 != null) {
            y0Var2.Q();
        }
        q0 q0Var4 = this.I;
        f1Var.f10058a.clear();
        f1Var.g();
        f1Var.f(q0Var3, true);
        e1 e1VarC = f1Var.c();
        if (q0Var3 != null) {
            e1VarC.f10053b--;
        }
        if (e1VarC.f10053b == 0) {
            SparseArray sparseArray = e1VarC.f10052a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                d1 d1Var = (d1) sparseArray.valueAt(i10);
                Iterator it = d1Var.f10032a.iterator();
                while (it.hasNext()) {
                    z3.a.a(((n1) it.next()).f10155a);
                }
                d1Var.f10032a.clear();
            }
        }
        if (q0Var4 != null) {
            e1VarC.f10053b++;
        }
        f1Var.e();
        this.D0.f10106f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.D) {
            this.f2069k0 = null;
            this.f2067i0 = null;
            this.f2068j0 = null;
            this.f2066h0 = null;
        }
        this.D = z10;
        super.setClipToPadding(z10);
        if (this.Q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(u0 u0Var) {
        u0Var.getClass();
        this.f2065g0 = u0Var;
        this.f2069k0 = null;
        this.f2067i0 = null;
        this.f2068j0 = null;
        this.f2066h0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.P = z10;
    }

    public void setItemAnimator(v0 v0Var) {
        v0 v0Var2 = this.f2070l0;
        if (v0Var2 != null) {
            v0Var2.e();
            this.f2070l0.f10218a = null;
        }
        this.f2070l0 = v0Var;
        if (v0Var != null) {
            v0Var.f10218a = this.I0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        f1 f1Var = this.f2064g;
        f1Var.f10062e = i10;
        f1Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(y0 y0Var) {
        e0 e0Var;
        if (y0Var == this.J) {
            return;
        }
        setScrollState(0);
        m1 m1Var = this.A0;
        m1Var.B.removeCallbacks(m1Var);
        m1Var.f10138g.abortAnimation();
        y0 y0Var2 = this.J;
        if (y0Var2 != null && (e0Var = y0Var2.f10277e) != null) {
            e0Var.j();
        }
        y0 y0Var3 = this.J;
        f1 f1Var = this.f2064g;
        if (y0Var3 != null) {
            v0 v0Var = this.f2070l0;
            if (v0Var != null) {
                v0Var.e();
            }
            this.J.j0(f1Var);
            this.J.k0(f1Var);
            f1Var.f10058a.clear();
            f1Var.g();
            if (this.O) {
                y0 y0Var4 = this.J;
                y0Var4.f10279g = false;
                y0Var4.S(this);
            }
            this.J.w0(null);
            this.J = null;
        } else {
            f1Var.f10058a.clear();
            f1Var.g();
        }
        bj.c cVar = this.f2085y;
        RecyclerView recyclerView = (RecyclerView) ((b9.c) cVar.f2795g).f2478d;
        ((i) cVar.f2796r).F();
        ArrayList arrayList = (ArrayList) cVar.f2797x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n1 n1VarM = M((View) arrayList.get(size));
            if (n1VarM != null) {
                int i10 = n1VarM.f10168p;
                if (recyclerView.R()) {
                    n1VarM.f10169q = i10;
                    recyclerView.Q0.add(n1VarM);
                } else {
                    View view = n1VarM.f10155a;
                    WeakHashMap weakHashMap = i0.f23177a;
                    view.setImportantForAccessibility(i10);
                }
                n1VarM.f10168p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.J = y0Var;
        if (y0Var != null) {
            if (y0Var.f10274b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(y0Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(h0.b.j(y0Var.f10274b, sb2));
            }
            y0Var.w0(this);
            if (this.O) {
                y0 y0Var5 = this.J;
                y0Var5.f10279g = true;
                y0Var5.R(this);
            }
        }
        f1Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f23188d) {
            ViewGroup viewGroup = scrollingChildHelper.f23187c;
            WeakHashMap weakHashMap = i0.f23177a;
            u3.z.k(viewGroup);
        }
        scrollingChildHelper.f23188d = z10;
    }

    public void setOnFlingListener(a1 a1Var) {
        this.f2080u0 = a1Var;
    }

    @Deprecated
    public void setOnScrollListener(c1 c1Var) {
        this.E0 = c1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2087z0 = z10;
    }

    public void setRecycledViewPool(e1 e1Var) {
        f1 f1Var = this.f2064g;
        RecyclerView recyclerView = f1Var.f10065h;
        f1Var.f(recyclerView.I, false);
        if (f1Var.f10064g != null) {
            r2.f10053b--;
        }
        f1Var.f10064g = e1Var;
        if (e1Var != null && recyclerView.getAdapter() != null) {
            f1Var.f10064g.f10053b++;
        }
        f1Var.e();
    }

    public void setScrollState(int i10) {
        e0 e0Var;
        if (i10 == this.f2071m0) {
            return;
        }
        if (X0) {
            new Exception();
        }
        this.f2071m0 = i10;
        if (i10 != 2) {
            m1 m1Var = this.A0;
            m1Var.B.removeCallbacks(m1Var);
            m1Var.f10138g.abortAnimation();
            y0 y0Var = this.J;
            if (y0Var != null && (e0Var = y0Var.f10277e) != null) {
                e0Var.j();
            }
        }
        y0 y0Var2 = this.J;
        if (y0Var2 != null) {
            y0Var2.h0(i10);
        }
        c1 c1Var = this.E0;
        if (c1Var != null) {
            c1Var.a(i10);
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c1) this.F0.get(size)).a(i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f2079t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            io.sentry.android.core.e0.p("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f2079t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(l1 l1Var) {
        this.f2064g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        e0 e0Var;
        if (z10 != this.T) {
            k("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.T = false;
                if (this.S && this.J != null && this.I != null) {
                    requestLayout();
                }
                this.S = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.T = true;
            this.U = true;
            setScrollState(0);
            m1 m1Var = this.A0;
            m1Var.B.removeCallbacks(m1Var);
            m1Var.f10138g.abortAnimation();
            y0 y0Var = this.J;
            if (y0Var == null || (e0Var = y0Var.f10277e) == null) {
                return;
            }
            e0Var.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void u() {
        m0();
        V();
        j1 j1Var = this.D0;
        j1Var.a(6);
        this.f2083x.d();
        j1Var.f10105e = this.I.b();
        j1Var.f10103c = 0;
        if (this.f2076r != null) {
            q0 q0Var = this.I;
            q0Var.getClass();
            int i10 = o0.f10175a[q0Var.f10191c.ordinal()];
            if (i10 != 1 && (i10 != 2 || q0Var.b() > 0)) {
                Parcelable parcelable = this.f2076r.f2088g;
                if (parcelable != null) {
                    this.J.f0(parcelable);
                }
                this.f2076r = null;
            }
        }
        j1Var.f10107g = false;
        this.J.d0(this.f2064g, j1Var);
        j1Var.f10106f = false;
        j1Var.j = j1Var.j && this.f2070l0 != null;
        j1Var.f10104d = 4;
        W(true);
        n0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.f2063f0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        c1 c1Var = this.E0;
        if (c1Var != null) {
            c1Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c1) this.F0.get(size)).b(this, i10, i11);
            }
        }
        this.f2063f0--;
    }

    public final void y() {
        if (this.f2069k0 != null) {
            return;
        }
        ((k1) this.f2065g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2069k0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f2066h0 != null) {
            return;
        }
        ((k1) this.f2065g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2066h0 = edgeEffect;
        if (this.D) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        float fA;
        boolean z10;
        char c4;
        TypedArray typedArray;
        Constructor constructor;
        super(context, attributeSet, i10);
        this.f2060d = new b(this);
        this.f2064g = new f1(this);
        this.B = new bm.e(24);
        this.E = new m0(this, 0);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = 0;
        this.f2059c0 = false;
        this.f2061d0 = false;
        this.f2062e0 = 0;
        this.f2063f0 = 0;
        this.f2065g0 = f2055f1;
        n nVar = new n();
        Object[] objArr = null;
        nVar.f10218a = null;
        nVar.f10219b = new ArrayList();
        nVar.f10220c = 120L;
        nVar.f10221d = 120L;
        nVar.f10222e = 250L;
        nVar.f10223f = 250L;
        int i11 = 1;
        nVar.f10143g = true;
        nVar.f10144h = new ArrayList();
        nVar.f10145i = new ArrayList();
        nVar.j = new ArrayList();
        nVar.k = new ArrayList();
        nVar.f10146l = new ArrayList();
        nVar.f10147m = new ArrayList();
        nVar.f10148n = new ArrayList();
        nVar.f10149o = new ArrayList();
        nVar.f10150p = new ArrayList();
        nVar.f10151q = new ArrayList();
        nVar.f10152r = new ArrayList();
        this.f2070l0 = nVar;
        this.f2071m0 = 0;
        this.f2072n0 = -1;
        this.f2084x0 = Float.MIN_VALUE;
        this.f2086y0 = Float.MIN_VALUE;
        this.f2087z0 = true;
        this.A0 = new m1(this);
        this.C0 = f2052c1 ? new l() : null;
        j1 j1Var = new j1();
        j1Var.f10101a = -1;
        j1Var.f10102b = 0;
        j1Var.f10103c = 0;
        j1Var.f10104d = 1;
        j1Var.f10105e = 0;
        j1Var.f10106f = false;
        j1Var.f10107g = false;
        j1Var.f10108h = false;
        j1Var.f10109i = false;
        j1Var.j = false;
        j1Var.k = false;
        this.D0 = j1Var;
        this.G0 = false;
        this.H0 = false;
        n0 n0Var = new n0(this);
        this.I0 = n0Var;
        this.J0 = false;
        this.L0 = new int[2];
        this.N0 = new int[2];
        this.O0 = new int[2];
        this.P0 = new int[2];
        this.Q0 = new ArrayList();
        this.R0 = new m0(this, i11);
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = new n0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2079t0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = j0.f23184a;
            fA = a2.e.d(viewConfiguration);
        } else {
            fA = j0.a(viewConfiguration, context);
        }
        this.f2084x0 = fA;
        this.f2086y0 = i12 >= 26 ? a2.e.e(viewConfiguration) : j0.a(viewConfiguration, context);
        this.f2081v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2082w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2056a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2070l0.f10218a = n0Var;
        h0 h0Var = new h0(this);
        h7.b bVar = new h7.b();
        bVar.f10000b = new t3.c(30);
        bVar.f10001c = new ArrayList();
        bVar.f10002d = new ArrayList();
        bVar.f9999a = 0;
        bVar.f10003e = h0Var;
        bVar.f10004f = new h0(bVar);
        this.f2083x = bVar;
        this.f2085y = new bj.c(new b9.c(28, this));
        WeakHashMap weakHashMap = i0.f23177a;
        if ((i12 >= 26 ? c0.a(this) : 0) == 0 && i12 >= 26) {
            c0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2057a0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new p1(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.c.RecyclerView, i10, 0);
        i0.m(this, context, g7.c.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(g7.c.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(g7.c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(g7.c.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(g7.c.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g7.c.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g7.c.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g7.c.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(g7.c.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(h0.b.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c4 = 2;
            z10 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            new x(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(g7.b.fastscroll_default_thickness), resources.getDimensionPixelSize(g7.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(g7.b.fastscroll_margin));
        } else {
            z10 = 1;
            c4 = 2;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(y0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f2053d1);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[z10] = attributeSet;
                        objArr2[c4] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(z10);
                    setLayoutManager((y0) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int[] iArr = Y0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        i0.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(z3.a.f26623b, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        y0 y0Var = this.J;
        if (y0Var != null) {
            return y0Var.t(layoutParams);
        }
        throw new IllegalStateException(h0.b.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(g1 g1Var) {
    }
}
