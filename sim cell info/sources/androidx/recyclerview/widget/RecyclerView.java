package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import b0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements a0.j {
    static final boolean A0;
    static final boolean B0;
    static final boolean C0;
    static final boolean D0;
    private static final boolean E0;
    private static final boolean F0;
    private static final Class<?>[] G0;
    static final Interpolator H0;
    private static final int[] z0 = {R.attr.nestedScrollingEnabled};
    private int A;
    boolean B;
    private final AccessibilityManager C;
    private List<q> D;
    boolean E;
    boolean F;
    private int G;
    private int H;
    private k I;
    private EdgeEffect J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    l N;
    private int O;
    private int P;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private r W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f1895a0;

    /* renamed from: b, reason: collision with root package name */
    private final x f1896b;

    /* renamed from: b0, reason: collision with root package name */
    private final int f1897b0;

    /* renamed from: c, reason: collision with root package name */
    final v f1898c;

    /* renamed from: c0, reason: collision with root package name */
    private float f1899c0;

    /* renamed from: d, reason: collision with root package name */
    private y f1900d;

    /* renamed from: d0, reason: collision with root package name */
    private float f1901d0;

    /* renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f1902e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f1903e0;

    /* renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.b f1904f;

    /* renamed from: f0, reason: collision with root package name */
    final c0 f1905f0;

    /* renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.m f1906g;

    /* renamed from: g0, reason: collision with root package name */
    androidx.recyclerview.widget.e f1907g0;

    /* renamed from: h, reason: collision with root package name */
    boolean f1908h;

    /* renamed from: h0, reason: collision with root package name */
    e.b f1909h0;

    /* renamed from: i, reason: collision with root package name */
    final Runnable f1910i;

    /* renamed from: i0, reason: collision with root package name */
    final a0 f1911i0;

    /* renamed from: j, reason: collision with root package name */
    final Rect f1912j;

    /* renamed from: j0, reason: collision with root package name */
    private t f1913j0;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f1914k;

    /* renamed from: k0, reason: collision with root package name */
    private List<t> f1915k0;

    /* renamed from: l, reason: collision with root package name */
    final RectF f1916l;

    /* renamed from: l0, reason: collision with root package name */
    boolean f1917l0;

    /* renamed from: m, reason: collision with root package name */
    g f1918m;

    /* renamed from: m0, reason: collision with root package name */
    boolean f1919m0;

    /* renamed from: n, reason: collision with root package name */
    o f1920n;

    /* renamed from: n0, reason: collision with root package name */
    private l.b f1921n0;

    /* renamed from: o, reason: collision with root package name */
    w f1922o;

    /* renamed from: o0, reason: collision with root package name */
    boolean f1923o0;

    /* renamed from: p, reason: collision with root package name */
    final ArrayList<n> f1924p;

    /* renamed from: p0, reason: collision with root package name */
    androidx.recyclerview.widget.i f1925p0;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList<s> f1926q;

    /* renamed from: q0, reason: collision with root package name */
    private j f1927q0;

    /* renamed from: r, reason: collision with root package name */
    private s f1928r;
    private final int[] r0;

    /* renamed from: s, reason: collision with root package name */
    boolean f1929s;
    private a0.k s0;

    /* renamed from: t, reason: collision with root package name */
    boolean f1930t;
    private final int[] t0;

    /* renamed from: u, reason: collision with root package name */
    boolean f1931u;
    private final int[] u0;

    /* renamed from: v, reason: collision with root package name */
    boolean f1932v;
    final int[] v0;

    /* renamed from: w, reason: collision with root package name */
    private int f1933w;
    final List<d0> w0;

    /* renamed from: x, reason: collision with root package name */
    boolean f1934x;
    private Runnable x0;

    /* renamed from: y, reason: collision with root package name */
    boolean f1935y;
    private final m.b y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1936z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f1932v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f1929s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f1935y) {
                recyclerView2.f1934x = true;
            } else {
                recyclerView2.t();
            }
        }
    }

    public static class a0 {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f1939b;

        /* renamed from: m, reason: collision with root package name */
        int f1950m;

        /* renamed from: n, reason: collision with root package name */
        long f1951n;

        /* renamed from: o, reason: collision with root package name */
        int f1952o;

        /* renamed from: p, reason: collision with root package name */
        int f1953p;

        /* renamed from: q, reason: collision with root package name */
        int f1954q;

        /* renamed from: a, reason: collision with root package name */
        int f1938a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f1940c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f1941d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f1942e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f1943f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f1944g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f1945h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f1946i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f1947j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f1948k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f1949l = false;

        void a(int i2) {
            if ((this.f1942e & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1942e));
        }

        public int b() {
            return this.f1945h ? this.f1940c - this.f1941d : this.f1943f;
        }

        public int c() {
            return this.f1938a;
        }

        public boolean d() {
            return this.f1938a != -1;
        }

        public boolean e() {
            return this.f1945h;
        }

        void f(g gVar) {
            this.f1942e = 1;
            this.f1943f = gVar.c();
            this.f1945h = false;
            this.f1946i = false;
            this.f1947j = false;
        }

        public boolean g() {
            return this.f1949l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1938a + ", mData=" + this.f1939b + ", mItemCount=" + this.f1943f + ", mIsMeasuring=" + this.f1947j + ", mPreviousLayoutItemCount=" + this.f1940c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1941d + ", mStructureChanged=" + this.f1944g + ", mInPreLayout=" + this.f1945h + ", mRunSimpleAnimations=" + this.f1948k + ", mRunPredictiveAnimations=" + this.f1949l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.N;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f1923o0 = false;
        }
    }

    public static abstract class b0 {
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f1956b;

        /* renamed from: c, reason: collision with root package name */
        private int f1957c;

        /* renamed from: d, reason: collision with root package name */
        OverScroller f1958d;

        /* renamed from: e, reason: collision with root package name */
        Interpolator f1959e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1960f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1961g;

        c0() {
            Interpolator interpolator = RecyclerView.H0;
            this.f1959e = interpolator;
            this.f1960f = false;
            this.f1961g = false;
            this.f1958d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i2, int i3, int i4, int i5) {
            int iRound;
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float fB = f3 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f2)) * f3);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float b(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            a0.s.L(RecyclerView.this, this);
        }

        public void c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f1957c = 0;
            this.f1956b = 0;
            Interpolator interpolator = this.f1959e;
            Interpolator interpolator2 = RecyclerView.H0;
            if (interpolator != interpolator2) {
                this.f1959e = interpolator2;
                this.f1958d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f1958d.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f1960f) {
                this.f1961g = true;
            } else {
                d();
            }
        }

        public void f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.H0;
            }
            if (this.f1959e != interpolator) {
                this.f1959e = interpolator;
                this.f1958d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1957c = 0;
            this.f1956b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1958d.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1958d.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f1958d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1920n == null) {
                g();
                return;
            }
            this.f1961g = false;
            this.f1960f = true;
            recyclerView.t();
            OverScroller overScroller = this.f1958d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1956b;
                int i5 = currY - this.f1957c;
                this.f1956b = currX;
                this.f1957c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.E(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.v0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.s(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1918m != null) {
                    int[] iArr3 = recyclerView3.v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.c1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.v0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    z zVar = recyclerView4.f1920n.f2004g;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.f1924p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.F(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.v0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.H(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                z zVar2 = recyclerView7.f1920n.f2004g;
                if (z2) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i8, currVelocity);
                    }
                    if (RecyclerView.D0) {
                        RecyclerView.this.f1909h0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView8.f1907g0;
                    if (eVar != null) {
                        eVar.f(recyclerView8, i3, i2);
                    }
                }
            }
            RecyclerView recyclerView9 = RecyclerView.this;
            z zVar3 = recyclerView9.f1920n.f2004g;
            this.f1960f = false;
            if (this.f1961g) {
                d();
            } else {
                recyclerView9.setScrollState(0);
                RecyclerView.this.n1(1);
            }
        }
    }

    class d implements m.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.m.b
        public void a(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f1898c.J(d0Var);
            RecyclerView.this.m(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.m.b
        public void b(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1920n.j1(d0Var.f1965a, recyclerView.f1898c);
        }

        @Override // androidx.recyclerview.widget.m.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z2 = recyclerView.E;
            l lVar = recyclerView.N;
            if (z2) {
                if (!lVar.b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.I0();
        }

        @Override // androidx.recyclerview.widget.m.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.k(d0Var, cVar, cVar2);
        }
    }

    public static abstract class d0 {

        /* renamed from: s, reason: collision with root package name */
        private static final List<Object> f1964s = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f1965a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f1966b;

        /* renamed from: j, reason: collision with root package name */
        int f1974j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f1982r;

        /* renamed from: c, reason: collision with root package name */
        int f1967c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f1968d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f1969e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f1970f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f1971g = -1;

        /* renamed from: h, reason: collision with root package name */
        d0 f1972h = null;

        /* renamed from: i, reason: collision with root package name */
        d0 f1973i = null;

        /* renamed from: k, reason: collision with root package name */
        List<Object> f1975k = null;

        /* renamed from: l, reason: collision with root package name */
        List<Object> f1976l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f1977m = 0;

        /* renamed from: n, reason: collision with root package name */
        v f1978n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f1979o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f1980p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f1981q = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1965a = view;
        }

        private void g() {
            if (this.f1975k == null) {
                ArrayList arrayList = new ArrayList();
                this.f1975k = arrayList;
                this.f1976l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i2, boolean z2) {
            if (this.f1968d == -1) {
                this.f1968d = this.f1967c;
            }
            if (this.f1971g == -1) {
                this.f1971g = this.f1967c;
            }
            if (z2) {
                this.f1971g += i2;
            }
            this.f1967c += i2;
            if (this.f1965a.getLayoutParams() != null) {
                ((p) this.f1965a.getLayoutParams()).f2024c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int iR = this.f1981q;
            if (iR == -1) {
                iR = a0.s.r(this.f1965a);
            }
            this.f1980p = iR;
            recyclerView.e1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.e1(this, this.f1980p);
            this.f1980p = 0;
        }

        void D() {
            this.f1974j = 0;
            this.f1967c = -1;
            this.f1968d = -1;
            this.f1969e = -1L;
            this.f1971g = -1;
            this.f1977m = 0;
            this.f1972h = null;
            this.f1973i = null;
            d();
            this.f1980p = 0;
            this.f1981q = -1;
            RecyclerView.q(this);
        }

        void E() {
            if (this.f1968d == -1) {
                this.f1968d = this.f1967c;
            }
        }

        void F(int i2, int i3) {
            this.f1974j = (i2 & i3) | (this.f1974j & (i3 ^ (-1)));
        }

        public final void G(boolean z2) {
            int i2;
            int i3 = this.f1977m;
            int i4 = z2 ? i3 - 1 : i3 + 1;
            this.f1977m = i4;
            if (i4 < 0) {
                this.f1977m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i4 == 1) {
                i2 = this.f1974j | 16;
            } else if (!z2 || i4 != 0) {
                return;
            } else {
                i2 = this.f1974j & (-17);
            }
            this.f1974j = i2;
        }

        void H(v vVar, boolean z2) {
            this.f1978n = vVar;
            this.f1979o = z2;
        }

        boolean I() {
            return (this.f1974j & 16) != 0;
        }

        boolean J() {
            return (this.f1974j & 128) != 0;
        }

        void K() {
            this.f1978n.J(this);
        }

        boolean L() {
            return (this.f1974j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1974j) == 0) {
                g();
                this.f1975k.add(obj);
            }
        }

        void b(int i2) {
            this.f1974j = i2 | this.f1974j;
        }

        void c() {
            this.f1968d = -1;
            this.f1971g = -1;
        }

        void d() {
            List<Object> list = this.f1975k;
            if (list != null) {
                list.clear();
            }
            this.f1974j &= -1025;
        }

        void e() {
            this.f1974j &= -33;
        }

        void f() {
            this.f1974j &= -257;
        }

        boolean h() {
            return (this.f1974j & 16) == 0 && a0.s.A(this.f1965a);
        }

        void i(int i2, int i3, boolean z2) {
            b(8);
            A(i3, z2);
            this.f1967c = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.f1982r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.a0(this);
        }

        public final long k() {
            return this.f1969e;
        }

        public final int l() {
            return this.f1970f;
        }

        public final int m() {
            int i2 = this.f1971g;
            return i2 == -1 ? this.f1967c : i2;
        }

        public final int n() {
            return this.f1968d;
        }

        List<Object> o() {
            if ((this.f1974j & 1024) != 0) {
                return f1964s;
            }
            List<Object> list = this.f1975k;
            return (list == null || list.size() == 0) ? f1964s : this.f1976l;
        }

        boolean p(int i2) {
            return (i2 & this.f1974j) != 0;
        }

        boolean q() {
            return (this.f1974j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f1965a.getParent() == null || this.f1965a.getParent() == this.f1982r) ? false : true;
        }

        boolean s() {
            return (this.f1974j & 1) != 0;
        }

        boolean t() {
            return (this.f1974j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1967c + " id=" + this.f1969e + ", oldPos=" + this.f1968d + ", pLpos:" + this.f1971g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f1979o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f1977m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1965a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f1974j & 16) == 0 && !a0.s.A(this.f1965a);
        }

        boolean v() {
            return (this.f1974j & 8) != 0;
        }

        boolean w() {
            return this.f1978n != null;
        }

        boolean x() {
            return (this.f1974j & 256) != 0;
        }

        boolean y() {
            return (this.f1974j & 2) != 0;
        }

        boolean z() {
            return (this.f1974j & 2) != 0;
        }
    }

    class e implements b.InterfaceC0017b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void b(int i2) {
            d0 d0VarD0;
            View viewA = a(i2);
            if (viewA != null && (d0VarD0 = RecyclerView.d0(viewA)) != null) {
                if (d0VarD0.x() && !d0VarD0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0VarD0 + RecyclerView.this.O());
                }
                d0VarD0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void c(View view) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0 != null) {
                d0VarD0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void d(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0 != null) {
                if (!d0VarD0.x() && !d0VarD0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0VarD0 + RecyclerView.this.O());
                }
                d0VarD0.f();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void e(View view) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0 != null) {
                d0VarD0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void f(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.x(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public int h() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void i(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public void j() {
            int iH = h();
            for (int i2 = 0; i2 < iH; i2++) {
                View viewA = a(i2);
                RecyclerView.this.y(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0017b
        public d0 k(View view) {
            return RecyclerView.d0(view);
        }
    }

    class f implements a.InterfaceC0016a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void a(int i2, int i3) {
            RecyclerView.this.y0(i2, i3);
            RecyclerView.this.f1917l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void d(int i2, int i3) {
            RecyclerView.this.x0(i2, i3);
            RecyclerView.this.f1917l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public d0 e(int i2) {
            d0 d0VarY = RecyclerView.this.Y(i2, true);
            if (d0VarY == null || RecyclerView.this.f1904f.n(d0VarY.f1965a)) {
                return null;
            }
            return d0VarY;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void f(int i2, int i3, Object obj) {
            RecyclerView.this.q1(i2, i3, obj);
            RecyclerView.this.f1919m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void g(int i2, int i3) {
            RecyclerView.this.z0(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1917l0 = true;
            recyclerView.f1911i0.f1941d += i3;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0016a
        public void h(int i2, int i3) {
            RecyclerView.this.z0(i2, i3, false);
            RecyclerView.this.f1917l0 = true;
        }

        void i(a.b bVar) {
            int i2 = bVar.f2090a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f1920n.P0(recyclerView, bVar.f2091b, bVar.f2093d);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f1920n.S0(recyclerView2, bVar.f2091b, bVar.f2093d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f1920n.U0(recyclerView3, bVar.f2091b, bVar.f2093d, bVar.f2092c);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f1920n.R0(recyclerView4, bVar.f2091b, bVar.f2093d, 1);
            }
        }
    }

    public static abstract class g<VH extends d0> {

        /* renamed from: a, reason: collision with root package name */
        private final h f1985a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f1986b = false;

        public final void a(VH vh, int i2) {
            vh.f1967c = i2;
            if (f()) {
                vh.f1969e = d(i2);
            }
            vh.F(1, 519);
            w.a.a("RV OnBindView");
            j(vh, i2, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.f1965a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f2024c = true;
            }
            w.a.b();
        }

        public final VH b(ViewGroup viewGroup, int i2) {
            try {
                w.a.a("RV CreateView");
                VH vh = (VH) k(viewGroup, i2);
                if (vh.f1965a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f1970f = i2;
                return vh;
            } finally {
                w.a.b();
            }
        }

        public abstract int c();

        public long d(int i2) {
            return -1L;
        }

        public int e(int i2) {
            return 0;
        }

        public final boolean f() {
            return this.f1986b;
        }

        public final void g() {
            this.f1985a.a();
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(VH vh, int i2);

        public void j(VH vh, int i2, List<Object> list) {
            i(vh, i2);
        }

        public abstract VH k(ViewGroup viewGroup, int i2);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(VH vh) {
            return false;
        }

        public void n(VH vh) {
        }

        public void o(VH vh) {
        }

        public void p(VH vh) {
        }

        public void q(i iVar) {
            this.f1985a.registerObserver(iVar);
        }

        public void r(i iVar) {
            this.f1985a.unregisterObserver(iVar);
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class i {
        public void a() {
        }
    }

    public interface j {
        int a(int i2, int i3);
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private b f1987a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<a> f1988b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f1989c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f1990d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f1991e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f1992f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f1993a;

            /* renamed from: b, reason: collision with root package name */
            public int f1994b;

            /* renamed from: c, reason: collision with root package name */
            public int f1995c;

            /* renamed from: d, reason: collision with root package name */
            public int f1996d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i2) {
                View view = d0Var.f1965a;
                this.f1993a = view.getLeft();
                this.f1994b = view.getTop();
                this.f1995c = view.getRight();
                this.f1996d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i2 = d0Var.f1974j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int iN = d0Var.n();
            int iJ = d0Var.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i2 : i2 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.f1987a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f1988b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1988b.get(i2).a();
            }
            this.f1988b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f1989c;
        }

        public long m() {
            return this.f1992f;
        }

        public long n() {
            return this.f1991e;
        }

        public long o() {
            return this.f1990d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i2, List<Object> list) {
            return q().a(d0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f1987a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.G(true);
            if (d0Var.f1972h != null && d0Var.f1973i == null) {
                d0Var.f1972h = null;
            }
            d0Var.f1973i = null;
            if (d0Var.I() || RecyclerView.this.R0(d0Var.f1965a) || !d0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f1965a, false);
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f1998a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f1999b;

        /* renamed from: c, reason: collision with root package name */
        private final l.b f2000c;

        /* renamed from: d, reason: collision with root package name */
        private final l.b f2001d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.l f2002e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.l f2003f;

        /* renamed from: g, reason: collision with root package name */
        z f2004g;

        /* renamed from: h, reason: collision with root package name */
        boolean f2005h;

        /* renamed from: i, reason: collision with root package name */
        boolean f2006i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2007j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f2008k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f2009l;

        /* renamed from: m, reason: collision with root package name */
        int f2010m;

        /* renamed from: n, reason: collision with root package name */
        boolean f2011n;

        /* renamed from: o, reason: collision with root package name */
        private int f2012o;

        /* renamed from: p, reason: collision with root package name */
        private int f2013p;

        /* renamed from: q, reason: collision with root package name */
        private int f2014q;

        /* renamed from: r, reason: collision with root package name */
        private int f2015r;

        class a implements l.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i2) {
                return o.this.H(i2);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b() {
                return o.this.m0() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return o.this.c0();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d(View view) {
                return o.this.S(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return o.this.P(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }
        }

        class b implements l.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i2) {
                return o.this.H(i2);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b() {
                return o.this.V() - o.this.b0();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d(View view) {
                return o.this.N(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return o.this.T(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }
        }

        public interface c {
            void a(int i2, int i3);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f2018a;

            /* renamed from: b, reason: collision with root package name */
            public int f2019b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f2020c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2021d;
        }

        public o() {
            a aVar = new a();
            this.f2000c = aVar;
            b bVar = new b();
            this.f2001d = bVar;
            this.f2002e = new androidx.recyclerview.widget.l(aVar);
            this.f2003f = new androidx.recyclerview.widget.l(bVar);
            this.f2005h = false;
            this.f2006i = false;
            this.f2007j = false;
            this.f2008k = true;
            this.f2009l = true;
        }

        public static int J(int i2, int i3, int i4, int i5, boolean z2) {
            int iMax = Math.max(0, i2 - i4);
            if (z2) {
                if (i5 < 0) {
                    if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                        i3 = 0;
                        i5 = 0;
                    } else {
                        i5 = iMax;
                    }
                }
                i3 = 1073741824;
            } else {
                if (i5 < 0) {
                    if (i5 != -1) {
                        if (i5 == -2) {
                            i3 = (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i3 = 0;
                        i5 = 0;
                    }
                    i5 = iMax;
                }
                i3 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        private int[] K(View view, Rect rect) {
            int[] iArr = new int[2];
            int iC0 = c0();
            int iE0 = e0();
            int iM0 = m0() - d0();
            int iV = V() - b0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - iC0;
            int iMin = Math.min(0, i2);
            int i3 = top - iE0;
            int iMin2 = Math.min(0, i3);
            int i4 = iWidth - iM0;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, iHeight - iV);
            if (X() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i4);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        private void e(View view, int i2, boolean z2) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (z2 || d0VarD0.v()) {
                this.f1999b.f1906g.b(d0VarD0);
            } else {
                this.f1999b.f1906g.p(d0VarD0);
            }
            p pVar = (p) view.getLayoutParams();
            if (d0VarD0.L() || d0VarD0.w()) {
                if (d0VarD0.w()) {
                    d0VarD0.K();
                } else {
                    d0VarD0.e();
                }
                this.f1998a.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1999b) {
                int iM = this.f1998a.m(view);
                if (i2 == -1) {
                    i2 = this.f1998a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1999b.indexOfChild(view) + this.f1999b.O());
                }
                if (iM != i2) {
                    this.f1999b.f1920n.z0(iM, i2);
                }
            } else {
                this.f1998a.a(view, i2, false);
                pVar.f2024c = true;
            }
            if (pVar.f2025d) {
                d0VarD0.f1965a.invalidate();
                pVar.f2025d = false;
            }
        }

        public static d g0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f2663f, i2, i3);
            dVar.f2018a = typedArrayObtainStyledAttributes.getInt(g0.c.f2664g, 1);
            dVar.f2019b = typedArrayObtainStyledAttributes.getInt(g0.c.f2674q, 1);
            dVar.f2020c = typedArrayObtainStyledAttributes.getBoolean(g0.c.f2673p, false);
            dVar.f2021d = typedArrayObtainStyledAttributes.getBoolean(g0.c.f2675r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int m(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        private boolean r0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iC0 = c0();
            int iE0 = e0();
            int iM0 = m0() - d0();
            int iV = V() - b0();
            Rect rect = this.f1999b.f1912j;
            O(focusedChild, rect);
            return rect.left - i2 < iM0 && rect.right - i2 > iC0 && rect.top - i3 < iV && rect.bottom - i3 > iE0;
        }

        private void s1(v vVar, int i2, View view) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0.J()) {
                return;
            }
            if (d0VarD0.t() && !d0VarD0.v() && !this.f1999b.f1918m.f()) {
                n1(i2);
                vVar.C(d0VarD0);
            } else {
                w(i2);
                vVar.D(view);
                this.f1999b.f1906g.k(d0VarD0);
            }
        }

        private static boolean u0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void x(int i2, View view) {
            this.f1998a.d(i2);
        }

        public View A(View view) {
            View viewQ;
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null || (viewQ = recyclerView.Q(view)) == null || this.f1998a.n(viewQ)) {
                return null;
            }
            return viewQ;
        }

        public void A0(int i2) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                recyclerView.v0(i2);
            }
        }

        void A1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1999b = null;
                this.f1998a = null;
                height = 0;
                this.f2014q = 0;
            } else {
                this.f1999b = recyclerView;
                this.f1998a = recyclerView.f1904f;
                this.f2014q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f2015r = height;
            this.f2012o = 1073741824;
            this.f2013p = 1073741824;
        }

        public View B(int i2) {
            int I = I();
            for (int i3 = 0; i3 < I; i3++) {
                View viewH = H(i3);
                d0 d0VarD0 = RecyclerView.d0(viewH);
                if (d0VarD0 != null && d0VarD0.m() == i2 && !d0VarD0.J() && (this.f1999b.f1911i0.e() || !d0VarD0.v())) {
                    return viewH;
                }
            }
            return null;
        }

        public void B0(int i2) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                recyclerView.w0(i2);
            }
        }

        boolean B1(View view, int i2, int i3, p pVar) {
            return (!view.isLayoutRequested() && this.f2008k && u0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && u0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public abstract p C();

        public void C0(g gVar, g gVar2) {
        }

        boolean C1() {
            return false;
        }

        public p D(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean D0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        boolean D1(View view, int i2, int i3, p pVar) {
            return (this.f2008k && u0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && u0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p E(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void E0(RecyclerView recyclerView) {
        }

        void E1() {
        }

        public int F() {
            return -1;
        }

        @Deprecated
        public void F0(RecyclerView recyclerView) {
        }

        public boolean F1() {
            return false;
        }

        public int G(View view) {
            return ((p) view.getLayoutParams()).f2023b.bottom;
        }

        public void G0(RecyclerView recyclerView, v vVar) {
            F0(recyclerView);
        }

        public View H(int i2) {
            androidx.recyclerview.widget.b bVar = this.f1998a;
            if (bVar != null) {
                return bVar.f(i2);
            }
            return null;
        }

        public View H0(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        public int I() {
            androidx.recyclerview.widget.b bVar = this.f1998a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void I0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1999b;
            J0(recyclerView.f1898c, recyclerView.f1911i0, accessibilityEvent);
        }

        public void J0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1999b.canScrollVertically(-1) && !this.f1999b.canScrollHorizontally(-1) && !this.f1999b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            g gVar = this.f1999b.f1918m;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public void K0(v vVar, a0 a0Var, b0.c cVar) {
            if (this.f1999b.canScrollVertically(-1) || this.f1999b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.P(true);
            }
            if (this.f1999b.canScrollVertically(1) || this.f1999b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.P(true);
            }
            cVar.K(c.b.a(i0(vVar, a0Var), M(vVar, a0Var), t0(vVar, a0Var), j0(vVar, a0Var)));
        }

        public boolean L() {
            RecyclerView recyclerView = this.f1999b;
            return recyclerView != null && recyclerView.f1908h;
        }

        void L0(b0.c cVar) {
            RecyclerView recyclerView = this.f1999b;
            K0(recyclerView.f1898c, recyclerView.f1911i0, cVar);
        }

        public int M(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null || recyclerView.f1918m == null || !j()) {
                return 1;
            }
            return this.f1999b.f1918m.c();
        }

        void M0(View view, b0.c cVar) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0 == null || d0VarD0.v() || this.f1998a.n(d0VarD0.f1965a)) {
                return;
            }
            RecyclerView recyclerView = this.f1999b;
            N0(recyclerView.f1898c, recyclerView.f1911i0, view, cVar);
        }

        public int N(View view) {
            return view.getBottom() + G(view);
        }

        public void N0(v vVar, a0 a0Var, View view, b0.c cVar) {
            cVar.L(c.C0022c.a(k() ? f0(view) : 0, 1, j() ? f0(view) : 0, 1, false, false));
        }

        public void O(View view, Rect rect) {
            RecyclerView.e0(view, rect);
        }

        public View O0(View view, int i2) {
            return null;
        }

        public int P(View view) {
            return view.getLeft() - Y(view);
        }

        public void P0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int Q(View view) {
            Rect rect = ((p) view.getLayoutParams()).f2023b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void Q0(RecyclerView recyclerView) {
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f2023b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void R0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int S(View view) {
            return view.getRight() + h0(view);
        }

        public void S0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int T(View view) {
            return view.getTop() - k0(view);
        }

        public void T0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View U() {
            View focusedChild;
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1998a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void U0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            T0(recyclerView, i2, i3);
        }

        public int V() {
            return this.f2015r;
        }

        public void V0(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int W() {
            return this.f2013p;
        }

        public void W0(a0 a0Var) {
        }

        public int X() {
            return a0.s.t(this.f1999b);
        }

        public void X0(v vVar, a0 a0Var, int i2, int i3) {
            this.f1999b.v(i2, i3);
        }

        public int Y(View view) {
            return ((p) view.getLayoutParams()).f2023b.left;
        }

        @Deprecated
        public boolean Y0(RecyclerView recyclerView, View view, View view2) {
            return v0() || recyclerView.r0();
        }

        public int Z() {
            return a0.s.u(this.f1999b);
        }

        public boolean Z0(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return Y0(recyclerView, view, view2);
        }

        public void a(View view) {
            b(view, -1);
        }

        public int a0() {
            return a0.s.v(this.f1999b);
        }

        public void a1(Parcelable parcelable) {
        }

        public void b(View view, int i2) {
            e(view, i2, true);
        }

        public int b0() {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable b1() {
            return null;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void c1(int i2) {
        }

        public void d(View view, int i2) {
            e(view, i2, false);
        }

        public int d0() {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        boolean d1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1999b;
            return e1(recyclerView.f1898c, recyclerView.f1911i0, i2, bundle);
        }

        public int e0() {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean e1(v vVar, a0 a0Var, int i2, Bundle bundle) {
            int iV;
            int iM0;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                iV = recyclerView.canScrollVertically(1) ? (V() - e0()) - b0() : 0;
                if (this.f1999b.canScrollHorizontally(1)) {
                    iM0 = (m0() - c0()) - d0();
                    i3 = iV;
                    i4 = iM0;
                }
                i3 = iV;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                iV = recyclerView.canScrollVertically(-1) ? -((V() - e0()) - b0()) : 0;
                if (this.f1999b.canScrollHorizontally(-1)) {
                    iM0 = -((m0() - c0()) - d0());
                    i3 = iV;
                    i4 = iM0;
                }
                i3 = iV;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f1999b.j1(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void f(String str) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                recyclerView.n(str);
            }
        }

        public int f0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        boolean f1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1999b;
            return g1(recyclerView.f1898c, recyclerView.f1911i0, view, i2, bundle);
        }

        public void g(View view, int i2) {
            h(view, i2, (p) view.getLayoutParams());
        }

        public boolean g1(v vVar, a0 a0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public void h(View view, int i2, p pVar) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0.v()) {
                this.f1999b.f1906g.b(d0VarD0);
            } else {
                this.f1999b.f1906g.p(d0VarD0);
            }
            this.f1998a.c(view, i2, pVar, d0VarD0.v());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).f2023b.right;
        }

        public void h1(v vVar) {
            for (int I = I() - 1; I >= 0; I--) {
                if (!RecyclerView.d0(H(I)).J()) {
                    k1(I, vVar);
                }
            }
        }

        public void i(View view, Rect rect) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h0(view));
            }
        }

        public int i0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView == null || recyclerView.f1918m == null || !k()) {
                return 1;
            }
            return this.f1999b.f1918m.c();
        }

        void i1(v vVar) {
            int iJ = vVar.j();
            for (int i2 = iJ - 1; i2 >= 0; i2--) {
                View viewN = vVar.n(i2);
                d0 d0VarD0 = RecyclerView.d0(viewN);
                if (!d0VarD0.J()) {
                    d0VarD0.G(false);
                    if (d0VarD0.x()) {
                        this.f1999b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f1999b.N;
                    if (lVar != null) {
                        lVar.j(d0VarD0);
                    }
                    d0VarD0.G(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f1999b.invalidate();
            }
        }

        public boolean j() {
            return false;
        }

        public int j0(v vVar, a0 a0Var) {
            return 0;
        }

        public void j1(View view, v vVar) {
            m1(view);
            vVar.B(view);
        }

        public boolean k() {
            return false;
        }

        public int k0(View view) {
            return ((p) view.getLayoutParams()).f2023b.top;
        }

        public void k1(int i2, v vVar) {
            View viewH = H(i2);
            n1(i2);
            vVar.B(viewH);
        }

        public boolean l(p pVar) {
            return pVar != null;
        }

        public void l0(View view, boolean z2, Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((p) view.getLayoutParams()).f2023b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1999b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1999b.f1916l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean l1(Runnable runnable) {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int m0() {
            return this.f2014q;
        }

        public void m1(View view) {
            this.f1998a.p(view);
        }

        public void n(int i2, int i3, a0 a0Var, c cVar) {
        }

        public int n0() {
            return this.f2012o;
        }

        public void n1(int i2) {
            if (H(i2) != null) {
                this.f1998a.q(i2);
            }
        }

        public void o(int i2, c cVar) {
        }

        boolean o0() {
            int I = I();
            for (int i2 = 0; i2 < I; i2++) {
                ViewGroup.LayoutParams layoutParams = H(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean o1(RecyclerView recyclerView, View view, Rect rect, boolean z2) {
            return p1(recyclerView, view, rect, z2, false);
        }

        public int p(a0 a0Var) {
            return 0;
        }

        public boolean p0() {
            return this.f2006i;
        }

        public boolean p1(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            int[] iArrK = K(view, rect);
            int i2 = iArrK[0];
            int i3 = iArrK[1];
            if ((z3 && !r0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z2) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.g1(i2, i3);
            }
            return true;
        }

        public int q(a0 a0Var) {
            return 0;
        }

        public boolean q0() {
            return this.f2007j;
        }

        public void q1() {
            RecyclerView recyclerView = this.f1999b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public void r1() {
            this.f2005h = true;
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public final boolean s0() {
            return this.f2009l;
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public boolean t0(v vVar, a0 a0Var) {
            return false;
        }

        public int t1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public int u1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public void v(v vVar) {
            for (int I = I() - 1; I >= 0; I--) {
                s1(vVar, I, H(I));
            }
        }

        public boolean v0() {
            return false;
        }

        void v1(RecyclerView recyclerView) {
            w1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void w(int i2) {
            x(i2, H(i2));
        }

        public boolean w0(View view, boolean z2, boolean z3) {
            boolean z4 = this.f2002e.b(view, 24579) && this.f2003f.b(view, 24579);
            return z2 ? z4 : !z4;
        }

        void w1(int i2, int i3) {
            this.f2014q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f2012o = mode;
            if (mode == 0 && !RecyclerView.B0) {
                this.f2014q = 0;
            }
            this.f2015r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f2013p = mode2;
            if (mode2 != 0 || RecyclerView.B0) {
                return;
            }
            this.f2015r = 0;
        }

        public void x0(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f2023b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void x1(int i2, int i3) {
            this.f1999b.setMeasuredDimension(i2, i3);
        }

        void y(RecyclerView recyclerView) {
            this.f2006i = true;
            E0(recyclerView);
        }

        public void y0(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect rectH0 = this.f1999b.h0(view);
            int i4 = i2 + rectH0.left + rectH0.right;
            int i5 = i3 + rectH0.top + rectH0.bottom;
            int iJ = J(m0(), n0(), c0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).width, j());
            int iJ2 = J(V(), W(), e0() + b0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).height, k());
            if (B1(view, iJ, iJ2, pVar)) {
                view.measure(iJ, iJ2);
            }
        }

        public void y1(Rect rect, int i2, int i3) {
            x1(m(i2, rect.width() + c0() + d0(), a0()), m(i3, rect.height() + e0() + b0(), Z()));
        }

        void z(RecyclerView recyclerView, v vVar) {
            this.f2006i = false;
            G0(recyclerView, vVar);
        }

        public void z0(int i2, int i3) {
            View viewH = H(i2);
            if (viewH != null) {
                w(i2);
                g(viewH, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f1999b.toString());
            }
        }

        void z1(int i2, int i3) {
            int I = I();
            if (I == 0) {
                this.f1999b.v(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < I; i8++) {
                View viewH = H(i8);
                Rect rect = this.f1999b.f1912j;
                O(viewH, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f1999b.f1912j.set(i6, i7, i4, i5);
            y1(this.f1999b.f1912j, i2, i3);
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        d0 f2022a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f2023b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2024c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2025d;

        public p(int i2, int i3) {
            super(i2, i3);
            this.f2023b = new Rect();
            this.f2024c = true;
            this.f2025d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2023b = new Rect();
            this.f2024c = true;
            this.f2025d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2023b = new Rect();
            this.f2024c = true;
            this.f2025d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2023b = new Rect();
            this.f2024c = true;
            this.f2025d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f2023b = new Rect();
            this.f2024c = true;
            this.f2025d = false;
        }

        public int a() {
            return this.f2022a.m();
        }

        public boolean b() {
            return this.f2022a.y();
        }

        public boolean c() {
            return this.f2022a.v();
        }

        public boolean d() {
            return this.f2022a.t();
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
    }

    public interface s {
        void a(boolean z2);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class u {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f2026a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f2027b = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<d0> f2028a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f2029b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f2030c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f2031d = 0;

            a() {
            }
        }

        private a g(int i2) {
            a aVar = this.f2026a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2026a.put(i2, aVar2);
            return aVar2;
        }

        void a() {
            this.f2027b++;
        }

        public void b() {
            for (int i2 = 0; i2 < this.f2026a.size(); i2++) {
                this.f2026a.valueAt(i2).f2028a.clear();
            }
        }

        void c() {
            this.f2027b--;
        }

        void d(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f2031d = j(aVarG.f2031d, j2);
        }

        void e(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f2030c = j(aVarG.f2030c, j2);
        }

        public d0 f(int i2) {
            a aVar = this.f2026a.get(i2);
            if (aVar == null || aVar.f2028a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f2028a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z2) {
            if (gVar != null) {
                c();
            }
            if (!z2 && this.f2027b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int iL = d0Var.l();
            ArrayList<d0> arrayList = g(iL).f2028a;
            if (this.f2026a.get(iL).f2029b <= arrayList.size()) {
                return;
            }
            d0Var.D();
            arrayList.add(d0Var);
        }

        long j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        boolean k(int i2, long j2, long j3) {
            long j4 = g(i2).f2031d;
            return j4 == 0 || j2 + j4 < j3;
        }

        boolean l(int i2, long j2, long j3) {
            long j4 = g(i2).f2030c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    public final class v {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<d0> f2032a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<d0> f2033b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<d0> f2034c;

        /* renamed from: d, reason: collision with root package name */
        private final List<d0> f2035d;

        /* renamed from: e, reason: collision with root package name */
        private int f2036e;

        /* renamed from: f, reason: collision with root package name */
        int f2037f;

        /* renamed from: g, reason: collision with root package name */
        u f2038g;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f2032a = arrayList;
            this.f2033b = null;
            this.f2034c = new ArrayList<>();
            this.f2035d = Collections.unmodifiableList(arrayList);
            this.f2036e = 2;
            this.f2037f = 2;
        }

        private boolean H(d0 d0Var, int i2, int i3, long j2) {
            d0Var.f1982r = RecyclerView.this;
            int iL = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.f2038g.k(iL, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.f1918m.a(d0Var, i2);
            this.f2038g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.f1911i0.e()) {
                return true;
            }
            d0Var.f1971g = i3;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.q0()) {
                View view = d0Var.f1965a;
                if (a0.s.r(view) == 0) {
                    a0.s.V(view, 1);
                }
                androidx.recyclerview.widget.i iVar = RecyclerView.this.f1925p0;
                if (iVar == null) {
                    return;
                }
                a0.a aVarN = iVar.n();
                if (aVarN instanceof i.a) {
                    ((i.a) aVarN).o(view);
                }
                a0.s.Q(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z2) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.f1965a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i2) {
            a(this.f2034c.get(i2), true);
            this.f2034c.remove(i2);
        }

        public void B(View view) {
            d0 d0VarD0 = RecyclerView.d0(view);
            if (d0VarD0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0VarD0.w()) {
                d0VarD0.K();
            } else if (d0VarD0.L()) {
                d0VarD0.e();
            }
            C(d0VarD0);
            if (RecyclerView.this.N == null || d0VarD0.u()) {
                return;
            }
            RecyclerView.this.N.j(d0VarD0);
        }

        void C(d0 d0Var) {
            boolean z2;
            boolean z3 = true;
            if (d0Var.w() || d0Var.f1965a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.w());
                sb.append(" isAttached:");
                sb.append(d0Var.f1965a.getParent() != null);
                sb.append(RecyclerView.this.O());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.O());
            }
            if (d0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.O());
            }
            boolean zH = d0Var.h();
            g gVar = RecyclerView.this.f1918m;
            if ((gVar != null && zH && gVar.m(d0Var)) || d0Var.u()) {
                if (this.f2037f <= 0 || d0Var.p(526)) {
                    z2 = false;
                } else {
                    int size = this.f2034c.size();
                    if (size >= this.f2037f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.D0 && size > 0 && !RecyclerView.this.f1909h0.d(d0Var.f1967c)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.f1909h0.d(this.f2034c.get(i2).f1967c)) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                        size = i2 + 1;
                    }
                    this.f2034c.add(size, d0Var);
                    z2 = true;
                }
                if (z2) {
                    z = z2;
                    z3 = false;
                } else {
                    a(d0Var, true);
                    z = z2;
                }
            } else {
                z3 = false;
            }
            RecyclerView.this.f1906g.q(d0Var);
            if (z || z3 || !zH) {
                return;
            }
            d0Var.f1982r = null;
        }

        void D(View view) {
            ArrayList<d0> arrayList;
            d0 d0VarD0 = RecyclerView.d0(view);
            if (!d0VarD0.p(12) && d0VarD0.y() && !RecyclerView.this.o(d0VarD0)) {
                if (this.f2033b == null) {
                    this.f2033b = new ArrayList<>();
                }
                d0VarD0.H(this, true);
                arrayList = this.f2033b;
            } else {
                if (d0VarD0.t() && !d0VarD0.v() && !RecyclerView.this.f1918m.f()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.O());
                }
                d0VarD0.H(this, false);
                arrayList = this.f2032a;
            }
            arrayList.add(d0VarD0);
        }

        void E(u uVar) {
            u uVar2 = this.f2038g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f2038g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f2038g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i2) {
            this.f2036e = i2;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[PHI: r1 r4
  0x012c: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$d0) = (r1v11 androidx.recyclerview.widget.RecyclerView$d0), (r1v30 androidx.recyclerview.widget.RecyclerView$d0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            (d0Var.f1979o ? this.f2033b : this.f2032a).remove(d0Var);
            d0Var.f1978n = null;
            d0Var.f1979o = false;
            d0Var.e();
        }

        void K() {
            o oVar = RecyclerView.this.f1920n;
            this.f2037f = this.f2036e + (oVar != null ? oVar.f2010m : 0);
            for (int size = this.f2034c.size() - 1; size >= 0 && this.f2034c.size() > this.f2037f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.f1911i0.e();
            }
            int i2 = d0Var.f1967c;
            if (i2 >= 0 && i2 < RecyclerView.this.f1918m.c()) {
                if (RecyclerView.this.f1911i0.e() || RecyclerView.this.f1918m.e(d0Var.f1967c) == d0Var.l()) {
                    return !RecyclerView.this.f1918m.f() || d0Var.k() == RecyclerView.this.f1918m.d(d0Var.f1967c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.O());
        }

        void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f2034c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f2034c.get(size);
                if (d0Var != null && (i4 = d0Var.f1967c) >= i2 && i4 < i5) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        void a(d0 d0Var, boolean z2) {
            RecyclerView.q(d0Var);
            View view = d0Var.f1965a;
            androidx.recyclerview.widget.i iVar = RecyclerView.this.f1925p0;
            if (iVar != null) {
                a0.a aVarN = iVar.n();
                a0.s.Q(view, aVarN instanceof i.a ? ((i.a) aVarN).n(view) : null);
            }
            if (z2) {
                g(d0Var);
            }
            d0Var.f1982r = null;
            i().i(d0Var);
        }

        public void c() {
            this.f2032a.clear();
            z();
        }

        void d() {
            int size = this.f2034c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2034c.get(i2).c();
            }
            int size2 = this.f2032a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f2032a.get(i3).c();
            }
            ArrayList<d0> arrayList = this.f2033b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f2033b.get(i4).c();
                }
            }
        }

        void e() {
            this.f2032a.clear();
            ArrayList<d0> arrayList = this.f2033b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.f1911i0.b()) {
                return !RecyclerView.this.f1911i0.e() ? i2 : RecyclerView.this.f1902e.m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.f1911i0.b() + RecyclerView.this.O());
        }

        void g(d0 d0Var) {
            w wVar = RecyclerView.this.f1922o;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.f1918m;
            if (gVar != null) {
                gVar.p(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1911i0 != null) {
                recyclerView.f1906g.q(d0Var);
            }
        }

        d0 h(int i2) {
            int size;
            int iM;
            ArrayList<d0> arrayList = this.f2033b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    d0 d0Var = this.f2033b.get(i3);
                    if (!d0Var.L() && d0Var.m() == i2) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f1918m.f() && (iM = RecyclerView.this.f1902e.m(i2)) > 0 && iM < RecyclerView.this.f1918m.c()) {
                    long jD = RecyclerView.this.f1918m.d(iM);
                    for (int i4 = 0; i4 < size; i4++) {
                        d0 d0Var2 = this.f2033b.get(i4);
                        if (!d0Var2.L() && d0Var2.k() == jD) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f2038g == null) {
                this.f2038g = new u();
            }
            return this.f2038g;
        }

        int j() {
            return this.f2032a.size();
        }

        public List<d0> k() {
            return this.f2035d;
        }

        d0 l(long j2, int i2, boolean z2) {
            for (int size = this.f2032a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f2032a.get(size);
                if (d0Var.k() == j2 && !d0Var.L()) {
                    if (i2 == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.f1911i0.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z2) {
                        this.f2032a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f1965a, false);
                        y(d0Var.f1965a);
                    }
                }
            }
            int size2 = this.f2034c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f2034c.get(size2);
                if (d0Var2.k() == j2 && !d0Var2.r()) {
                    if (i2 == d0Var2.l()) {
                        if (!z2) {
                            this.f2034c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z2) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        d0 m(int i2, boolean z2) {
            View viewE;
            int size = this.f2032a.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.f2032a.get(i3);
                if (!d0Var.L() && d0Var.m() == i2 && !d0Var.t() && (RecyclerView.this.f1911i0.f1945h || !d0Var.v())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z2 || (viewE = RecyclerView.this.f1904f.e(i2)) == null) {
                int size2 = this.f2034c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    d0 d0Var2 = this.f2034c.get(i4);
                    if (!d0Var2.t() && d0Var2.m() == i2 && !d0Var2.r()) {
                        if (!z2) {
                            this.f2034c.remove(i4);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 d0VarD0 = RecyclerView.d0(viewE);
            RecyclerView.this.f1904f.s(viewE);
            int iM = RecyclerView.this.f1904f.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f1904f.d(iM);
                D(viewE);
                d0VarD0.b(8224);
                return d0VarD0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0VarD0 + RecyclerView.this.O());
        }

        View n(int i2) {
            return this.f2032a.get(i2).f1965a;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        View p(int i2, boolean z2) {
            return I(i2, z2, Long.MAX_VALUE).f1965a;
        }

        void s() {
            int size = this.f2034c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.f2034c.get(i2).f1965a.getLayoutParams();
                if (pVar != null) {
                    pVar.f2024c = true;
                }
            }
        }

        void t() {
            int size = this.f2034c.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.f2034c.get(i2);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.f1918m;
            if (gVar == null || !gVar.f()) {
                z();
            }
        }

        void u(int i2, int i3) {
            int size = this.f2034c.size();
            for (int i4 = 0; i4 < size; i4++) {
                d0 d0Var = this.f2034c.get(i4);
                if (d0Var != null && d0Var.f1967c >= i2) {
                    d0Var.A(i3, true);
                }
            }
        }

        void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f2034c.size();
            for (int i8 = 0; i8 < size; i8++) {
                d0 d0Var = this.f2034c.get(i8);
                if (d0Var != null && (i7 = d0Var.f1967c) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        d0Var.A(i3 - i2, false);
                    } else {
                        d0Var.A(i4, false);
                    }
                }
            }
        }

        void w(int i2, int i3, boolean z2) {
            int i4 = i2 + i3;
            for (int size = this.f2034c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f2034c.get(size);
                if (d0Var != null) {
                    int i5 = d0Var.f1967c;
                    if (i5 >= i4) {
                        d0Var.A(-i3, z2);
                    } else if (i5 >= i2) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z2) {
            c();
            i().h(gVar, gVar2, z2);
        }

        void y(View view) {
            d0 d0VarD0 = RecyclerView.d0(view);
            d0VarD0.f1978n = null;
            d0VarD0.f1979o = false;
            d0VarD0.e();
            C(d0VarD0);
        }

        void z() {
            for (int size = this.f2034c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f2034c.clear();
            if (RecyclerView.D0) {
                RecyclerView.this.f1909h0.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.n(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1911i0.f1944g = true;
            recyclerView.L0(true);
            if (RecyclerView.this.f1902e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    public static class y extends d0.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        Parcelable f2041d;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i2) {
                return new y[i2];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2041d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        void b(y yVar) {
            this.f2041d = yVar.f2041d;
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f2041d, 0);
        }
    }

    public static abstract class z {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        A0 = i2 == 18 || i2 == 19 || i2 == 20;
        B0 = i2 >= 23;
        C0 = i2 >= 16;
        D0 = i2 >= 21;
        E0 = i2 <= 15;
        F0 = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        H0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.a.f2654a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i2);
        this.f1896b = new x();
        this.f1898c = new v();
        this.f1906g = new androidx.recyclerview.widget.m();
        this.f1910i = new a();
        this.f1912j = new Rect();
        this.f1914k = new Rect();
        this.f1916l = new RectF();
        this.f1924p = new ArrayList<>();
        this.f1926q = new ArrayList<>();
        this.f1933w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new k();
        this.N = new androidx.recyclerview.widget.c();
        this.O = 0;
        this.P = -1;
        this.f1899c0 = Float.MIN_VALUE;
        this.f1901d0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.f1903e0 = true;
        this.f1905f0 = new c0();
        this.f1909h0 = D0 ? new e.b() : null;
        this.f1911i0 = new a0();
        this.f1917l0 = false;
        this.f1919m0 = false;
        this.f1921n0 = new m();
        this.f1923o0 = false;
        this.r0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new ArrayList();
        this.x0 = new b();
        this.y0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.f1899c0 = a0.t.b(viewConfiguration, context);
        this.f1901d0 = a0.t.d(viewConfiguration, context);
        this.f1895a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1897b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.v(this.f1921n0);
        l0();
        n0();
        m0();
        if (a0.s.r(this) == 0) {
            a0.s.V(this, 1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.i(this));
        int[] iArr = g0.c.f2663f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(g0.c.f2672o);
        if (typedArrayObtainStyledAttributes.getInt(g0.c.f2666i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1908h = typedArrayObtainStyledAttributes.getBoolean(g0.c.f2665h, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(g0.c.f2667j, false);
        this.f1931u = z3;
        if (z3) {
            o0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g0.c.f2670m), typedArrayObtainStyledAttributes.getDrawable(g0.c.f2671n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(g0.c.f2668k), typedArrayObtainStyledAttributes.getDrawable(g0.c.f2669l));
        }
        typedArrayObtainStyledAttributes.recycle();
        u(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = z0;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
            }
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void B() {
        this.f1911i0.a(1);
        P(this.f1911i0);
        this.f1911i0.f1947j = false;
        k1();
        this.f1906g.f();
        C0();
        K0();
        Z0();
        a0 a0Var = this.f1911i0;
        a0Var.f1946i = a0Var.f1948k && this.f1919m0;
        this.f1919m0 = false;
        this.f1917l0 = false;
        a0Var.f1945h = a0Var.f1949l;
        a0Var.f1943f = this.f1918m.c();
        T(this.r0);
        if (this.f1911i0.f1948k) {
            int iG = this.f1904f.g();
            for (int i2 = 0; i2 < iG; i2++) {
                d0 d0VarD0 = d0(this.f1904f.f(i2));
                if (!d0VarD0.J() && (!d0VarD0.t() || this.f1918m.f())) {
                    this.f1906g.e(d0VarD0, this.N.t(this.f1911i0, d0VarD0, l.e(d0VarD0), d0VarD0.o()));
                    if (this.f1911i0.f1946i && d0VarD0.y() && !d0VarD0.v() && !d0VarD0.J() && !d0VarD0.t()) {
                        this.f1906g.c(b0(d0VarD0), d0VarD0);
                    }
                }
            }
        }
        if (this.f1911i0.f1949l) {
            a1();
            a0 a0Var2 = this.f1911i0;
            boolean z2 = a0Var2.f1944g;
            a0Var2.f1944g = false;
            this.f1920n.V0(this.f1898c, a0Var2);
            this.f1911i0.f1944g = z2;
            for (int i3 = 0; i3 < this.f1904f.g(); i3++) {
                d0 d0VarD02 = d0(this.f1904f.f(i3));
                if (!d0VarD02.J() && !this.f1906g.i(d0VarD02)) {
                    int iE = l.e(d0VarD02);
                    boolean zP = d0VarD02.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    l.c cVarT = this.N.t(this.f1911i0, d0VarD02, iE, d0VarD02.o());
                    if (zP) {
                        N0(d0VarD02, cVarT);
                    } else {
                        this.f1906g.a(d0VarD02, cVarT);
                    }
                }
            }
        }
        r();
        D0();
        m1(false);
        this.f1911i0.f1942e = 2;
    }

    private void C() {
        k1();
        C0();
        this.f1911i0.a(6);
        this.f1902e.j();
        this.f1911i0.f1943f = this.f1918m.c();
        a0 a0Var = this.f1911i0;
        a0Var.f1941d = 0;
        a0Var.f1945h = false;
        this.f1920n.V0(this.f1898c, a0Var);
        a0 a0Var2 = this.f1911i0;
        a0Var2.f1944g = false;
        this.f1900d = null;
        a0Var2.f1948k = a0Var2.f1948k && this.N != null;
        a0Var2.f1942e = 4;
        D0();
        m1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f1911i0
            r1 = 4
            r0.a(r1)
            r11.k1()
            r11.C0()
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f1911i0
            r1 = 1
            r0.f1942e = r1
            boolean r0 = r0.f1948k
            if (r0 == 0) goto L88
            androidx.recyclerview.widget.b r0 = r11.f1904f
            int r0 = r0.g()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L81
            androidx.recyclerview.widget.b r2 = r11.f1904f
            android.view.View r2 = r2.f(r0)
            androidx.recyclerview.widget.RecyclerView$d0 r5 = d0(r2)
            boolean r2 = r5.J()
            if (r2 == 0) goto L2f
            goto L7e
        L2f:
            long r2 = r11.b0(r5)
            androidx.recyclerview.widget.RecyclerView$l r4 = r11.N
            androidx.recyclerview.widget.RecyclerView$a0 r6 = r11.f1911i0
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r4.s(r6, r5)
            androidx.recyclerview.widget.m r6 = r11.f1906g
            androidx.recyclerview.widget.RecyclerView$d0 r6 = r6.g(r2)
            if (r6 == 0) goto L79
            boolean r7 = r6.J()
            if (r7 != 0) goto L79
            androidx.recyclerview.widget.m r7 = r11.f1906g
            boolean r8 = r7.h(r6)
            androidx.recyclerview.widget.m r7 = r11.f1906g
            boolean r9 = r7.h(r5)
            if (r8 == 0) goto L5a
            if (r6 != r5) goto L5a
            goto L79
        L5a:
            androidx.recyclerview.widget.m r7 = r11.f1906g
            androidx.recyclerview.widget.RecyclerView$l$c r7 = r7.n(r6)
            androidx.recyclerview.widget.m r10 = r11.f1906g
            r10.d(r5, r4)
            androidx.recyclerview.widget.m r4 = r11.f1906g
            androidx.recyclerview.widget.RecyclerView$l$c r10 = r4.m(r5)
            if (r7 != 0) goto L71
            r11.i0(r2, r5, r6)
            goto L7e
        L71:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.l(r4, r5, r6, r7, r8, r9)
            goto L7e
        L79:
            androidx.recyclerview.widget.m r2 = r11.f1906g
            r2.d(r5, r4)
        L7e:
            int r0 = r0 + (-1)
            goto L1c
        L81:
            androidx.recyclerview.widget.m r0 = r11.f1906g
            androidx.recyclerview.widget.m$b r2 = r11.y0
            r0.o(r2)
        L88:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f1920n
            androidx.recyclerview.widget.RecyclerView$v r2 = r11.f1898c
            r0.i1(r2)
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f1911i0
            int r2 = r0.f1943f
            r0.f1940c = r2
            r2 = 0
            r11.E = r2
            r11.F = r2
            r0.f1948k = r2
            r0.f1949l = r2
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f1920n
            r0.f2005h = r2
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f1898c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r0 = r0.f2033b
            if (r0 == 0) goto Lab
            r0.clear()
        Lab:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f1920n
            boolean r3 = r0.f2011n
            if (r3 == 0) goto Lba
            r0.f2010m = r2
            r0.f2011n = r2
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f1898c
            r0.K()
        Lba:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f1920n
            androidx.recyclerview.widget.RecyclerView$a0 r3 = r11.f1911i0
            r0.W0(r3)
            r11.D0()
            r11.m1(r2)
            androidx.recyclerview.widget.m r0 = r11.f1906g
            r0.f()
            int[] r0 = r11.r0
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.w(r3, r0)
            if (r0 == 0) goto Ldb
            r11.H(r2, r2)
        Ldb:
            r11.O0()
            r11.X0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D():void");
    }

    private void F0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.U = y2;
            this.S = y2;
        }
    }

    private boolean J(MotionEvent motionEvent) {
        s sVar = this.f1928r;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return S(motionEvent);
        }
        sVar.c(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f1928r = null;
        }
        return true;
    }

    private boolean J0() {
        return this.N != null && this.f1920n.F1();
    }

    private void K0() {
        boolean z2;
        if (this.E) {
            this.f1902e.u();
            if (this.F) {
                this.f1920n.Q0(this);
            }
        }
        if (J0()) {
            this.f1902e.s();
        } else {
            this.f1902e.j();
        }
        boolean z3 = false;
        boolean z4 = this.f1917l0 || this.f1919m0;
        this.f1911i0.f1948k = this.f1932v && this.N != null && ((z2 = this.E) || z4 || this.f1920n.f2005h) && (!z2 || this.f1918m.f());
        a0 a0Var = this.f1911i0;
        if (a0Var.f1948k && z4 && !this.E && J0()) {
            z3 = true;
        }
        a0Var.f1949l = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.L()
            android.widget.EdgeEffect r3 = r6.J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.d.a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.M()
            android.widget.EdgeEffect r3 = r6.L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.N()
            android.widget.EdgeEffect r9 = r6.K
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.K()
            android.widget.EdgeEffect r9 = r6.M
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            a0.s.K(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.M0(float, float, float, float):void");
    }

    private void O0() {
        View viewFindViewById;
        if (!this.f1903e0 || this.f1918m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!F0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f1904f.n(focusedChild)) {
                    return;
                }
            } else if (this.f1904f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewV = null;
        d0 d0VarX = (this.f1911i0.f1951n == -1 || !this.f1918m.f()) ? null : X(this.f1911i0.f1951n);
        if (d0VarX != null && !this.f1904f.n(d0VarX.f1965a) && d0VarX.f1965a.hasFocusable()) {
            viewV = d0VarX.f1965a;
        } else if (this.f1904f.g() > 0) {
            viewV = V();
        }
        if (viewV != null) {
            int i2 = this.f1911i0.f1952o;
            if (i2 != -1 && (viewFindViewById = viewV.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewV = viewFindViewById;
            }
            viewV.requestFocus();
        }
    }

    private void P0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.J.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            a0.s.K(this);
        }
    }

    private boolean S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1926q.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.f1926q.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.f1928r = sVar;
                return true;
            }
        }
        return false;
    }

    private void T(int[] iArr) {
        int iG = this.f1904f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iG; i4++) {
            d0 d0VarD0 = d0(this.f1904f.f(i4));
            if (!d0VarD0.J()) {
                int iM = d0VarD0.m();
                if (iM < i2) {
                    i2 = iM;
                }
                if (iM > i3) {
                    i3 = iM;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewU = U(viewGroup.getChildAt(i2));
            if (recyclerViewU != null) {
                return recyclerViewU;
            }
        }
        return null;
    }

    private View V() {
        d0 d0VarW;
        a0 a0Var = this.f1911i0;
        int i2 = a0Var.f1950m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iB = a0Var.b();
        for (int i3 = i2; i3 < iB; i3++) {
            d0 d0VarW2 = W(i3);
            if (d0VarW2 == null) {
                break;
            }
            if (d0VarW2.f1965a.hasFocusable()) {
                return d0VarW2.f1965a;
            }
        }
        int iMin = Math.min(iB, i2);
        do {
            iMin--;
            if (iMin < 0 || (d0VarW = W(iMin)) == null) {
                return null;
            }
        } while (!d0VarW.f1965a.hasFocusable());
        return d0VarW.f1965a;
    }

    private void W0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1912j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f2024c) {
                Rect rect = pVar.f2023b;
                Rect rect2 = this.f1912j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1912j);
            offsetRectIntoDescendantCoords(view, this.f1912j);
        }
        this.f1920n.p1(this, view, this.f1912j, !this.f1932v, view2 == null);
    }

    private void X0() {
        a0 a0Var = this.f1911i0;
        a0Var.f1951n = -1L;
        a0Var.f1950m = -1;
        a0Var.f1952o = -1;
    }

    private void Y0() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        n1(0);
        P0();
    }

    private void Z0() {
        View focusedChild = (this.f1903e0 && hasFocus() && this.f1918m != null) ? getFocusedChild() : null;
        d0 d0VarR = focusedChild != null ? R(focusedChild) : null;
        if (d0VarR == null) {
            X0();
            return;
        }
        this.f1911i0.f1951n = this.f1918m.f() ? d0VarR.k() : -1L;
        this.f1911i0.f1950m = this.E ? -1 : d0VarR.v() ? d0VarR.f1968d : d0VarR.j();
        this.f1911i0.f1952o = f0(d0VarR.f1965a);
    }

    static d0 d0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f2022a;
    }

    private void d1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.f1918m;
        if (gVar2 != null) {
            gVar2.r(this.f1896b);
            this.f1918m.l(this);
        }
        if (!z2 || z3) {
            Q0();
        }
        this.f1902e.u();
        g gVar3 = this.f1918m;
        this.f1918m = gVar;
        if (gVar != null) {
            gVar.q(this.f1896b);
            gVar.h(this);
        }
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.C0(gVar3, this.f1918m);
        }
        this.f1898c.x(gVar3, this.f1918m, z2);
        this.f1911i0.f1944g = true;
    }

    static void e0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f2023b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private void f(d0 d0Var) {
        View view = d0Var.f1965a;
        boolean z2 = view.getParent() == this;
        this.f1898c.J(c0(view));
        if (d0Var.x()) {
            this.f1904f.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f1904f;
        if (z2) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    private int f0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String g0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private a0.k getScrollingChildHelper() {
        if (this.s0 == null) {
            this.s0 = new a0.k(this);
        }
        return this.s0;
    }

    private void i0(long j2, d0 d0Var, d0 d0Var2) {
        int iG = this.f1904f.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarD0 = d0(this.f1904f.f(i2));
            if (d0VarD0 != d0Var && b0(d0VarD0) == j2) {
                g gVar = this.f1918m;
                if (gVar == null || !gVar.f()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0VarD0 + " \n View Holder 2:" + d0Var + O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0VarD0 + " \n View Holder 2:" + d0Var + O());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + O());
    }

    private boolean k0() {
        int iG = this.f1904f.g();
        for (int i2 = 0; i2 < iG; i2++) {
            d0 d0VarD0 = d0(this.f1904f.f(i2));
            if (d0VarD0 != null && !d0VarD0.J() && d0VarD0.y()) {
                return true;
            }
        }
        return false;
    }

    private void l(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.G(false);
        if (z2) {
            f(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                f(d0Var2);
            }
            d0Var.f1972h = d0Var2;
            f(d0Var);
            this.f1898c.J(d0Var);
            d0Var2.G(false);
            d0Var2.f1973i = d0Var;
        }
        if (this.N.b(d0Var, d0Var2, cVar, cVar2)) {
            I0();
        }
    }

    @SuppressLint({"InlinedApi"})
    private void m0() {
        if (a0.s.s(this) == 0) {
            a0.s.W(this, 8);
        }
    }

    private void n0() {
        this.f1904f = new androidx.recyclerview.widget.b(new e());
    }

    private void p() {
        Y0();
        setScrollState(0);
    }

    private void p1() {
        this.f1905f0.g();
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.E1();
        }
    }

    static void q(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f1966b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == d0Var.f1965a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                d0Var.f1966b = null;
                return;
            }
        }
    }

    private boolean s0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || Q(view2) == null) {
            return false;
        }
        if (view == null || Q(view) == null) {
            return true;
        }
        this.f1912j.set(0, 0, view.getWidth(), view.getHeight());
        this.f1914k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f1912j);
        offsetDescendantRectToMyCoords(view2, this.f1914k);
        char c2 = 65535;
        int i4 = this.f1920n.X() == 1 ? -1 : 1;
        Rect rect = this.f1912j;
        int i5 = rect.left;
        Rect rect2 = this.f1914k;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + O());
    }

    private void u(Context context, String str, AttributeSet attributeSet, int i2, int i3) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strG0 = g0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strG0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(G0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strG0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strG0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strG0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strG0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strG0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strG0, e8);
            }
        }
    }

    private boolean w(int i2, int i3) {
        T(this.r0);
        int[] iArr = this.r0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void z() {
        int i2 = this.A;
        this.A = 0;
        if (i2 == 0 || !q0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        b0.b.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    void A() {
        String str;
        if (this.f1918m == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f1920n != null) {
                a0 a0Var = this.f1911i0;
                a0Var.f1947j = false;
                if (a0Var.f1942e != 1) {
                    if (!this.f1902e.q() && this.f1920n.m0() == getWidth() && this.f1920n.V() == getHeight()) {
                        this.f1920n.v1(this);
                    }
                    D();
                    return;
                }
                B();
                this.f1920n.v1(this);
                C();
                D();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    public void A0(View view) {
    }

    public void B0(View view) {
    }

    void C0() {
        this.G++;
    }

    void D0() {
        E0(true);
    }

    public boolean E(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    void E0(boolean z2) {
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 < 1) {
            this.G = 0;
            if (z2) {
                z();
                I();
            }
        }
    }

    public final void F(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    void G(int i2) {
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.c1(i2);
        }
        G0(i2);
        t tVar = this.f1913j0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.f1915k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1915k0.get(size).a(this, i2);
            }
        }
    }

    public void G0(int i2) {
    }

    void H(int i2, int i3) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        H0(i2, i3);
        t tVar = this.f1913j0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.f1915k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1915k0.get(size).b(this, i2, i3);
            }
        }
        this.H--;
    }

    public void H0(int i2, int i3) {
    }

    void I() {
        int i2;
        for (int size = this.w0.size() - 1; size >= 0; size--) {
            d0 d0Var = this.w0.get(size);
            if (d0Var.f1965a.getParent() == this && !d0Var.J() && (i2 = d0Var.f1981q) != -1) {
                a0.s.V(d0Var.f1965a, i2);
                d0Var.f1981q = -1;
            }
        }
        this.w0.clear();
    }

    void I0() {
        if (this.f1923o0 || !this.f1929s) {
            return;
        }
        a0.s.L(this, this.x0);
        this.f1923o0 = true;
    }

    void K() {
        int measuredWidth;
        int measuredHeight;
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 3);
        this.M = edgeEffectA;
        if (this.f1908h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    void L() {
        int measuredHeight;
        int measuredWidth;
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 0);
        this.J = edgeEffectA;
        if (this.f1908h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void L0(boolean z2) {
        this.F = z2 | this.F;
        this.E = true;
        u0();
    }

    void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 2);
        this.L = edgeEffectA;
        if (this.f1908h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void N() {
        int measuredWidth;
        int measuredHeight;
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 1);
        this.K = edgeEffectA;
        if (this.f1908h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    void N0(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.f1911i0.f1946i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.f1906g.c(b0(d0Var), d0Var);
        }
        this.f1906g.e(d0Var, cVar);
    }

    String O() {
        return " " + super.toString() + ", adapter:" + this.f1918m + ", layout:" + this.f1920n + ", context:" + getContext();
    }

    final void P(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.f1953p = 0;
            a0Var.f1954q = 0;
        } else {
            OverScroller overScroller = this.f1905f0.f1958d;
            a0Var.f1953p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f1954q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View Q(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void Q0() {
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.h1(this.f1898c);
            this.f1920n.i1(this.f1898c);
        }
        this.f1898c.c();
    }

    public d0 R(View view) {
        View viewQ = Q(view);
        if (viewQ == null) {
            return null;
        }
        return c0(viewQ);
    }

    boolean R0(View view) {
        k1();
        boolean zR = this.f1904f.r(view);
        if (zR) {
            d0 d0VarD0 = d0(view);
            this.f1898c.J(d0VarD0);
            this.f1898c.C(d0VarD0);
        }
        m1(!zR);
        return zR;
    }

    public void S0(n nVar) {
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.f("Cannot remove item decoration during a scroll  or layout");
        }
        this.f1924p.remove(nVar);
        if (this.f1924p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        t0();
        requestLayout();
    }

    public void T0(s sVar) {
        this.f1926q.remove(sVar);
        if (this.f1928r == sVar) {
            this.f1928r = null;
        }
    }

    public void U0(t tVar) {
        List<t> list = this.f1915k0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void V0() {
        d0 d0Var;
        int iG = this.f1904f.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.f1904f.f(i2);
            d0 d0VarC0 = c0(viewF);
            if (d0VarC0 != null && (d0Var = d0VarC0.f1973i) != null) {
                View view = d0Var.f1965a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public d0 W(int i2) {
        d0 d0Var = null;
        if (this.E) {
            return null;
        }
        int iJ = this.f1904f.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            d0 d0VarD0 = d0(this.f1904f.i(i3));
            if (d0VarD0 != null && !d0VarD0.v() && a0(d0VarD0) == i2) {
                if (!this.f1904f.n(d0VarD0.f1965a)) {
                    return d0VarD0;
                }
                d0Var = d0VarD0;
            }
        }
        return d0Var;
    }

    public d0 X(long j2) {
        g gVar = this.f1918m;
        d0 d0Var = null;
        if (gVar != null && gVar.f()) {
            int iJ = this.f1904f.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                d0 d0VarD0 = d0(this.f1904f.i(i2));
                if (d0VarD0 != null && !d0VarD0.v() && d0VarD0.k() == j2) {
                    if (!this.f1904f.n(d0VarD0.f1965a)) {
                        return d0VarD0;
                    }
                    d0Var = d0VarD0;
                }
            }
        }
        return d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.d0 Y(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f1904f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f1904f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = d0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f1967c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f1904f
            android.view.View r4 = r3.f1965a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Z(int i2, int i3) {
        o oVar = this.f1920n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f1935y) {
            return false;
        }
        boolean zJ = oVar.j();
        boolean zK = this.f1920n.k();
        if (zJ == 0 || Math.abs(i2) < this.f1895a0) {
            i2 = 0;
        }
        if (!zK || Math.abs(i3) < this.f1895a0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = zJ != 0 || zK;
            dispatchNestedFling(f2, f3, z2);
            int i4 = zJ;
            if (z2) {
                if (zK) {
                    i4 = (zJ ? 1 : 0) | 2;
                }
                l1(i4, 1);
                int i5 = this.f1897b0;
                int iMax = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.f1897b0;
                this.f1905f0.c(iMax, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    void a(int i2, int i3) {
        if (i2 < 0) {
            L();
            if (this.J.isFinished()) {
                this.J.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            M();
            if (this.L.isFinished()) {
                this.L.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            N();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            K();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        a0.s.K(this);
    }

    int a0(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.f1902e.e(d0Var.f1967c);
    }

    void a1() {
        int iJ = this.f1904f.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarD0 = d0(this.f1904f.i(i2));
            if (!d0VarD0.J()) {
                d0VarD0.E();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.f1920n;
        if (oVar == null || !oVar.D0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    long b0(d0 d0Var) {
        return this.f1918m.f() ? d0Var.k() : d0Var.f1967c;
    }

    boolean b1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        t();
        if (this.f1918m != null) {
            int[] iArr = this.v0;
            iArr[0] = 0;
            iArr[1] = 0;
            c1(i2, i3, iArr);
            int[] iArr2 = this.v0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f1924p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.v0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        F(i5, i4, i6, i7, this.t0, 0, iArr3);
        int[] iArr4 = this.v0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.T;
        int[] iArr5 = this.t0;
        this.T = i12 - iArr5[0];
        this.U -= iArr5[1];
        int[] iArr6 = this.u0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !a0.i.a(motionEvent, 8194)) {
                M0(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            s(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            H(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    public d0 c0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return d0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void c1(int i2, int i3, int[] iArr) {
        k1();
        C0();
        w.a.a("RV Scroll");
        P(this.f1911i0);
        int iT1 = i2 != 0 ? this.f1920n.t1(i2, this.f1898c, this.f1911i0) : 0;
        int iU1 = i3 != 0 ? this.f1920n.u1(i3, this.f1898c, this.f1911i0) : 0;
        w.a.b();
        V0();
        D0();
        m1(false);
        if (iArr != null) {
            iArr[0] = iT1;
            iArr[1] = iU1;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f1920n.l((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.j()) {
            return this.f1920n.p(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.j()) {
            return this.f1920n.q(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.j()) {
            return this.f1920n.r(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.k()) {
            return this.f1920n.s(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.k()) {
            return this.f1920n.t(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f1920n;
        if (oVar != null && oVar.k()) {
            return this.f1920n.u(this.f1911i0);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f1924p.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f1924p.get(i2).i(canvas, this, this.f1911i0);
        }
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f1908h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1908h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1908h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.L;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1908h) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.N == null || this.f1924p.size() <= 0 || !this.N.p()) ? z2 : true) {
            a0.s.K(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    boolean e1(d0 d0Var, int i2) {
        if (!r0()) {
            a0.s.V(d0Var.f1965a, i2);
            return true;
        }
        d0Var.f1981q = i2;
        this.w0.add(d0Var);
        return false;
    }

    boolean f1(AccessibilityEvent accessibilityEvent) {
        if (!r0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? b0.b.a(accessibilityEvent) : 0;
        this.A |= iA != 0 ? iA : 0;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewH0;
        boolean z2;
        View viewO0 = this.f1920n.O0(view, i2);
        if (viewO0 != null) {
            return viewO0;
        }
        boolean z3 = (this.f1918m == null || this.f1920n == null || r0() || this.f1935y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.f1920n.k()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (E0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f1920n.j()) {
                int i4 = (this.f1920n.X() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (E0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                k1();
                this.f1920n.H0(view, i2, this.f1898c, this.f1911i0);
                m1(false);
            }
            viewH0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                k1();
                viewH0 = this.f1920n.H0(view, i2, this.f1898c, this.f1911i0);
                m1(false);
            } else {
                viewH0 = viewFindNextFocus;
            }
        }
        if (viewH0 == null || viewH0.hasFocusable()) {
            return s0(view, viewH0, i2) ? viewH0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        W0(viewH0, null);
        return view;
    }

    public void g(n nVar) {
        h(nVar, -1);
    }

    public void g1(int i2, int i3) {
        h1(i2, i3, null);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f1920n;
        if (oVar != null) {
            return oVar.C();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f1920n;
        if (oVar != null) {
            return oVar.D(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f1920n;
        if (oVar != null) {
            return oVar.E(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f1918m;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f1920n;
        return oVar != null ? oVar.F() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.f1927q0;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1908h;
    }

    public androidx.recyclerview.widget.i getCompatAccessibilityDelegate() {
        return this.f1925p0;
    }

    public k getEdgeEffectFactory() {
        return this.I;
    }

    public l getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.f1924p.size();
    }

    public o getLayoutManager() {
        return this.f1920n;
    }

    public int getMaxFlingVelocity() {
        return this.f1897b0;
    }

    public int getMinFlingVelocity() {
        return this.f1895a0;
    }

    long getNanoTime() {
        if (D0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1903e0;
    }

    public u getRecycledViewPool() {
        return this.f1898c.i();
    }

    public int getScrollState() {
        return this.O;
    }

    public void h(n nVar, int i2) {
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.f("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1924p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.f1924p.add(nVar);
        } else {
            this.f1924p.add(i2, nVar);
        }
        t0();
        requestLayout();
    }

    Rect h0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f2024c) {
            return pVar.f2023b;
        }
        if (this.f1911i0.e() && (pVar.b() || pVar.d())) {
            return pVar.f2023b;
        }
        Rect rect = pVar.f2023b;
        rect.set(0, 0, 0, 0);
        int size = this.f1924p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1912j.set(0, 0, 0, 0);
            this.f1924p.get(i2).e(this.f1912j, view, this, this.f1911i0);
            int i3 = rect.left;
            Rect rect2 = this.f1912j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f2024c = false;
        return rect;
    }

    public void h1(int i2, int i3, Interpolator interpolator) {
        i1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(s sVar) {
        this.f1926q.add(sVar);
    }

    public void i1(int i2, int i3, Interpolator interpolator, int i4) {
        j1(i2, i3, interpolator, i4, false);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f1929s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1935y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(t tVar) {
        if (this.f1915k0 == null) {
            this.f1915k0 = new ArrayList();
        }
        this.f1915k0.add(tVar);
    }

    public boolean j0() {
        return !this.f1932v || this.E || this.f1902e.p();
    }

    void j1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.f1920n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1935y) {
            return;
        }
        if (!oVar.j()) {
            i2 = 0;
        }
        if (!this.f1920n.k()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            l1(i5, 1);
        }
        this.f1905f0.f(i2, i3, i4, interpolator);
    }

    void k(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.N.a(d0Var, cVar, cVar2)) {
            I0();
        }
    }

    void k1() {
        int i2 = this.f1933w + 1;
        this.f1933w = i2;
        if (i2 != 1 || this.f1935y) {
            return;
        }
        this.f1934x = false;
    }

    void l0() {
        this.f1902e = new androidx.recyclerview.widget.a(new f());
    }

    public boolean l1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    void m(d0 d0Var, l.c cVar, l.c cVar2) {
        f(d0Var);
        d0Var.G(false);
        if (this.N.c(d0Var, cVar, cVar2)) {
            I0();
        }
    }

    void m1(boolean z2) {
        if (this.f1933w < 1) {
            this.f1933w = 1;
        }
        if (!z2 && !this.f1935y) {
            this.f1934x = false;
        }
        if (this.f1933w == 1) {
            if (z2 && this.f1934x && !this.f1935y && this.f1920n != null && this.f1918m != null) {
                A();
            }
            if (!this.f1935y) {
                this.f1934x = false;
            }
        }
        this.f1933w--;
    }

    void n(String str) {
        if (r0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + O());
        }
        if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + O()));
        }
    }

    public void n1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    boolean o(d0 d0Var) {
        l lVar = this.N;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    void o0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(g0.b.f2655a), resources.getDimensionPixelSize(g0.b.f2657c), resources.getDimensionPixelOffset(g0.b.f2656b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + O());
        }
    }

    public void o1() {
        setScrollState(0);
        p1();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = 0;
        this.f1929s = true;
        this.f1932v = this.f1932v && !isLayoutRequested();
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.y(this);
        }
        this.f1923o0 = false;
        if (D0) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f2181f;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.f1907g0 = eVar;
            if (eVar == null) {
                this.f1907g0 = new androidx.recyclerview.widget.e();
                Display displayO = a0.s.o(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayO != null) {
                    float refreshRate = displayO.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f1907g0;
                eVar2.f2185d = (long) (1.0E9f / f2);
                threadLocal.set(eVar2);
            }
            this.f1907g0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        o1();
        this.f1929s = false;
        o oVar = this.f1920n;
        if (oVar != null) {
            oVar.z(this, this.f1898c);
        }
        this.w0.clear();
        removeCallbacks(this.x0);
        this.f1906g.j();
        if (!D0 || (eVar = this.f1907g0) == null) {
            return;
        }
        eVar.j(this);
        this.f1907g0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1924p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1924p.get(i2).g(canvas, this, this.f1911i0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f1920n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f1935y
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f1920n
            boolean r0 = r0.k()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f1920n
            boolean r3 = r3.j()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f1920n
            boolean r3 = r3.k()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f1920n
            boolean r3 = r3.j()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.f1899c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1901d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.b1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1935y) {
            return false;
        }
        this.f1928r = null;
        if (S(motionEvent)) {
            p();
            return true;
        }
        o oVar = this.f1920n;
        if (oVar == null) {
            return false;
        }
        boolean zJ = oVar.j();
        boolean zK = this.f1920n.k();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1936z) {
                this.f1936z = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.U = y2;
            this.S = y2;
            if (this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                n1(1);
            }
            int[] iArr = this.u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zJ;
            if (zK) {
                i2 = (zJ ? 1 : 0) | 2;
            }
            l1(i2, 0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            n1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i3 = x3 - this.R;
                int i4 = y3 - this.S;
                if (zJ == 0 || Math.abs(i3) <= this.V) {
                    z2 = false;
                } else {
                    this.T = x3;
                    z2 = true;
                }
                if (zK && Math.abs(i4) > this.V) {
                    this.U = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x4;
            this.R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y4;
            this.S = y4;
        } else if (actionMasked == 6) {
            F0(motionEvent);
        }
        return this.O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        w.a.a("RV OnLayout");
        A();
        w.a.b();
        this.f1932v = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        o oVar = this.f1920n;
        if (oVar == null) {
            v(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.q0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f1920n.X0(this.f1898c, this.f1911i0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.f1918m == null) {
                return;
            }
            if (this.f1911i0.f1942e == 1) {
                B();
            }
            this.f1920n.w1(i2, i3);
            this.f1911i0.f1947j = true;
            C();
            this.f1920n.z1(i2, i3);
            if (this.f1920n.C1()) {
                this.f1920n.w1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f1911i0.f1947j = true;
                C();
                this.f1920n.z1(i2, i3);
                return;
            }
            return;
        }
        if (this.f1930t) {
            this.f1920n.X0(this.f1898c, this.f1911i0, i2, i3);
            return;
        }
        if (this.B) {
            k1();
            C0();
            K0();
            D0();
            a0 a0Var = this.f1911i0;
            if (a0Var.f1949l) {
                a0Var.f1945h = true;
            } else {
                this.f1902e.j();
                this.f1911i0.f1945h = false;
            }
            this.B = false;
            m1(false);
        } else if (this.f1911i0.f1949l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f1918m;
        if (gVar != null) {
            this.f1911i0.f1943f = gVar.c();
        } else {
            this.f1911i0.f1943f = 0;
        }
        k1();
        this.f1920n.X0(this.f1898c, this.f1911i0, i2, i3);
        m1(false);
        this.f1911i0.f1945h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (r0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f1900d = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.f1920n;
        if (oVar == null || (parcelable2 = this.f1900d.f2041d) == null) {
            return;
        }
        oVar.a1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f1900d;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            o oVar = this.f1920n;
            yVar.f2041d = oVar != null ? oVar.b1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
  0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p0() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    boolean q0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void q1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.f1904f.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.f1904f.i(i6);
            d0 d0VarD0 = d0(viewI);
            if (d0VarD0 != null && !d0VarD0.J() && (i4 = d0VarD0.f1967c) >= i2 && i4 < i5) {
                d0VarD0.b(2);
                d0VarD0.a(obj);
                ((p) viewI.getLayoutParams()).f2024c = true;
            }
        }
        this.f1898c.M(i2, i3);
    }

    void r() {
        int iJ = this.f1904f.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarD0 = d0(this.f1904f.i(i2));
            if (!d0VarD0.J()) {
                d0VarD0.c();
            }
        }
        this.f1898c.d();
    }

    public boolean r0() {
        return this.G > 0;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        d0 d0VarD0 = d0(view);
        if (d0VarD0 != null) {
            if (d0VarD0.x()) {
                d0VarD0.f();
            } else if (!d0VarD0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0VarD0 + O());
            }
        }
        view.clearAnimation();
        y(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f1920n.Z0(this, this.f1911i0, view, view2) && view2 != null) {
            W0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1920n.o1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.f1926q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1926q.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1933w != 0 || this.f1935y) {
            this.f1934x = true;
        } else {
            super.requestLayout();
        }
    }

    void s(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.J.onRelease();
            zIsFinished = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            a0.s.K(this);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.f1920n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1935y) {
            return;
        }
        boolean zJ = oVar.j();
        boolean zK = this.f1920n.k();
        if (zJ || zK) {
            if (!zJ) {
                i2 = 0;
            }
            if (!zK) {
                i3 = 0;
            }
            b1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (f1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.i iVar) {
        this.f1925p0 = iVar;
        a0.s.Q(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        d1(gVar, false, true);
        L0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.f1927q0) {
            return;
        }
        this.f1927q0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1908h) {
            p0();
        }
        this.f1908h = z2;
        super.setClipToPadding(z2);
        if (this.f1932v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        z.g.b(kVar);
        this.I = kVar;
        p0();
    }

    public void setHasFixedSize(boolean z2) {
        this.f1930t = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.N;
        if (lVar2 != null) {
            lVar2.k();
            this.N.v(null);
        }
        this.N = lVar;
        if (lVar != null) {
            lVar.v(this.f1921n0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f1898c.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f1920n) {
            return;
        }
        o1();
        if (this.f1920n != null) {
            l lVar = this.N;
            if (lVar != null) {
                lVar.k();
            }
            this.f1920n.h1(this.f1898c);
            this.f1920n.i1(this.f1898c);
            this.f1898c.c();
            if (this.f1929s) {
                this.f1920n.z(this, this.f1898c);
            }
            this.f1920n.A1(null);
            this.f1920n = null;
        } else {
            this.f1898c.c();
        }
        this.f1904f.o();
        this.f1920n = oVar;
        if (oVar != null) {
            if (oVar.f1999b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f1999b.O());
            }
            oVar.A1(this);
            if (this.f1929s) {
                this.f1920n.y(this);
            }
        }
        this.f1898c.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f1913j0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1903e0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.f1898c.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.f1922o = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.O) {
            return;
        }
        this.O = i2;
        if (i2 != 2) {
            p1();
        }
        G(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i2 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.V = scaledTouchSlop;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f1898c.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, a0.j
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.f1935y) {
            n("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1935y = true;
                this.f1936z = true;
                o1();
                return;
            }
            this.f1935y = false;
            if (this.f1934x && this.f1920n != null && this.f1918m != null) {
                requestLayout();
            }
            this.f1934x = false;
        }
    }

    void t() {
        if (!this.f1932v || this.E) {
            w.a.a("RV FullInvalidate");
            A();
            w.a.b();
            return;
        }
        if (this.f1902e.p()) {
            if (this.f1902e.o(4) && !this.f1902e.o(11)) {
                w.a.a("RV PartialInvalidate");
                k1();
                C0();
                this.f1902e.s();
                if (!this.f1934x) {
                    if (k0()) {
                        A();
                    } else {
                        this.f1902e.i();
                    }
                }
                m1(true);
                D0();
            } else {
                if (!this.f1902e.p()) {
                    return;
                }
                w.a.a("RV FullInvalidate");
                A();
            }
            w.a.b();
        }
    }

    void t0() {
        int iJ = this.f1904f.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((p) this.f1904f.i(i2).getLayoutParams()).f2024c = true;
        }
        this.f1898c.s();
    }

    void u0() {
        int iJ = this.f1904f.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            d0 d0VarD0 = d0(this.f1904f.i(i2));
            if (d0VarD0 != null && !d0VarD0.J()) {
                d0VarD0.b(6);
            }
        }
        t0();
        this.f1898c.t();
    }

    void v(int i2, int i3) {
        setMeasuredDimension(o.m(i2, getPaddingLeft() + getPaddingRight(), a0.s.v(this)), o.m(i3, getPaddingTop() + getPaddingBottom(), a0.s.u(this)));
    }

    public void v0(int i2) {
        int iG = this.f1904f.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.f1904f.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void w0(int i2) {
        int iG = this.f1904f.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.f1904f.f(i3).offsetTopAndBottom(i2);
        }
    }

    void x(View view) {
        d0 d0VarD0 = d0(view);
        A0(view);
        g gVar = this.f1918m;
        if (gVar != null && d0VarD0 != null) {
            gVar.n(d0VarD0);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).b(view);
            }
        }
    }

    void x0(int i2, int i3) {
        int iJ = this.f1904f.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            d0 d0VarD0 = d0(this.f1904f.i(i4));
            if (d0VarD0 != null && !d0VarD0.J() && d0VarD0.f1967c >= i2) {
                d0VarD0.A(i3, false);
                this.f1911i0.f1944g = true;
            }
        }
        this.f1898c.u(i2, i3);
        requestLayout();
    }

    void y(View view) {
        d0 d0VarD0 = d0(view);
        B0(view);
        g gVar = this.f1918m;
        if (gVar != null && d0VarD0 != null) {
            gVar.o(d0VarD0);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).a(view);
            }
        }
    }

    void y0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.f1904f.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            d0 d0VarD0 = d0(this.f1904f.i(i8));
            if (d0VarD0 != null && (i7 = d0VarD0.f1967c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    d0VarD0.A(i3 - i2, false);
                } else {
                    d0VarD0.A(i6, false);
                }
                this.f1911i0.f1944g = true;
            }
        }
        this.f1898c.v(i2, i3);
        requestLayout();
    }

    void z0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.f1904f.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            d0 d0VarD0 = d0(this.f1904f.i(i5));
            if (d0VarD0 != null && !d0VarD0.J()) {
                int i6 = d0VarD0.f1967c;
                if (i6 >= i4) {
                    d0VarD0.A(-i3, z2);
                } else if (i6 >= i2) {
                    d0VarD0.i(i2 - 1, -i3, z2);
                }
                this.f1911i0.f1944g = true;
            }
        }
        this.f1898c.w(i2, i3, z2);
        requestLayout();
    }
}
