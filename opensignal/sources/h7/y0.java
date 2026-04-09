package h7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public bj.c f10273a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f10274b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f10275c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f10276d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f10277e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10278f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10279g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10280h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10281i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f10282l;

    /* renamed from: m, reason: collision with root package name */
    public int f10283m;

    /* renamed from: n, reason: collision with root package name */
    public int f10284n;

    /* renamed from: o, reason: collision with root package name */
    public int f10285o;

    public y0() {
        b9.c cVar = new b9.c(29, this);
        h0 h0Var = new h0(this);
        this.f10275c = new io.sentry.internal.debugmeta.c(cVar);
        this.f10276d = new io.sentry.internal.debugmeta.c(h0Var);
        this.f10278f = false;
        this.f10279g = false;
        this.f10280h = true;
        this.f10281i = true;
    }

    public static int A(View view) {
        Rect rect = ((z0) view.getLayoutParams()).f10293b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((z0) view.getLayoutParams()).f10292a.b();
    }

    public static x0 I(Context context, AttributeSet attributeSet, int i10, int i11) {
        x0 x0Var = new x0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.c.RecyclerView, i10, i11);
        x0Var.f10259a = typedArrayObtainStyledAttributes.getInt(g7.c.RecyclerView_android_orientation, 1);
        x0Var.f10260b = typedArrayObtainStyledAttributes.getInt(g7.c.RecyclerView_spanCount, 1);
        x0Var.f10261c = typedArrayObtainStyledAttributes.getBoolean(g7.c.RecyclerView_reverseLayout, false);
        x0Var.f10262d = typedArrayObtainStyledAttributes.getBoolean(g7.c.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return x0Var;
    }

    public static boolean M(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void N(View view, int i10, int i11, int i12, int i13) {
        z0 z0Var = (z0) view.getLayoutParams();
        Rect rect = z0Var.f10293b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) z0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) z0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) z0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.y0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((z0) view.getLayoutParams()).f10293b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i10);

    public final int B() {
        RecyclerView recyclerView = this.f10274b;
        q0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.b();
        }
        return 0;
    }

    public final void B0(e0 e0Var) {
        e0 e0Var2 = this.f10277e;
        if (e0Var2 != null && e0Var != e0Var2 && e0Var2.f10042e) {
            e0Var2.j();
        }
        this.f10277e = e0Var;
        RecyclerView recyclerView = this.f10274b;
        m1 m1Var = recyclerView.A0;
        m1Var.B.removeCallbacks(m1Var);
        m1Var.f10138g.abortAnimation();
        if (e0Var.f10045h) {
            io.sentry.android.core.e0.p("RecyclerView", "An instance of " + e0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + e0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        e0Var.f10039b = recyclerView;
        e0Var.f10040c = this;
        int i10 = e0Var.f10038a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.D0.f10101a = i10;
        e0Var.f10042e = true;
        e0Var.f10041d = true;
        e0Var.f10043f = recyclerView.J.q(i10);
        e0Var.f10039b.A0.b();
        e0Var.f10045h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.f10274b;
        WeakHashMap weakHashMap = u3.i0.f23177a;
        return recyclerView.getLayoutDirection();
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(f1 f1Var, j1 j1Var) {
        return -1;
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((z0) view.getLayoutParams()).f10293b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f10274b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f10274b.H;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i10) {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            int iY = recyclerView.f2085y.y();
            for (int i11 = 0; i11 < iY; i11++) {
                recyclerView.f2085y.x(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void P(int i10) {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            int iY = recyclerView.f2085y.y();
            for (int i11 = 0; i11 < iY; i11++) {
                recyclerView.f2085y.x(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i10, f1 f1Var, j1 j1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f10274b;
        f1 f1Var = recyclerView.f2064g;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f10274b.canScrollVertically(-1) && !this.f10274b.canScrollHorizontally(-1) && !this.f10274b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        q0 q0Var = this.f10274b.I;
        if (q0Var != null) {
            accessibilityEvent.setItemCount(q0Var.b());
        }
    }

    public void V(f1 f1Var, j1 j1Var, v3.c cVar) {
        if (this.f10274b.canScrollVertically(-1) || this.f10274b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            cVar.l(true);
        }
        if (this.f10274b.canScrollVertically(1) || this.f10274b.canScrollHorizontally(1)) {
            cVar.a(4096);
            cVar.l(true);
        }
        cVar.j(a2.a.a(J(f1Var, j1Var), x(f1Var, j1Var), 0));
    }

    public final void W(View view, v3.c cVar) {
        n1 n1VarM = RecyclerView.M(view);
        if (n1VarM == null || n1VarM.h()) {
            return;
        }
        bj.c cVar2 = this.f10273a;
        if (((ArrayList) cVar2.f2797x).contains(n1VarM.f10155a)) {
            return;
        }
        RecyclerView recyclerView = this.f10274b;
        X(recyclerView.f2064g, recyclerView.D0, view, cVar);
    }

    public final void b(View view, int i10, boolean z10) {
        n1 n1VarM = RecyclerView.M(view);
        if (z10 || n1VarM.h()) {
            u.i0 i0Var = (u.i0) this.f10274b.B.f2830d;
            z1 z1VarA = (z1) i0Var.get(n1VarM);
            if (z1VarA == null) {
                z1VarA = z1.a();
                i0Var.put(n1VarM, z1VarA);
            }
            z1VarA.f10297a |= 1;
        } else {
            this.f10274b.B.F(n1VarM);
        }
        z0 z0Var = (z0) view.getLayoutParams();
        if (n1VarM.p() || n1VarM.i()) {
            if (n1VarM.i()) {
                n1VarM.f10166n.m(n1VarM);
            } else {
                n1VarM.j &= -33;
            }
            this.f10273a.h(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f10274b) {
                bj.c cVar = this.f10273a;
                dj.i iVar = (dj.i) cVar.f2796r;
                int iIndexOfChild = ((RecyclerView) ((b9.c) cVar.f2795g).f2478d).indexOfChild(view);
                int iA = (iIndexOfChild == -1 || iVar.C(iIndexOfChild)) ? -1 : iIndexOfChild - iVar.A(iIndexOfChild);
                if (i10 == -1) {
                    i10 = this.f10273a.y();
                }
                if (iA == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f10274b.indexOfChild(view));
                    throw new IllegalStateException(h0.b.j(this.f10274b, sb2));
                }
                if (iA != i10) {
                    y0 y0Var = this.f10274b.J;
                    View viewU = y0Var.u(iA);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iA + y0Var.f10274b.toString());
                    }
                    y0Var.u(iA);
                    y0Var.f10273a.s(iA);
                    z0 z0Var2 = (z0) viewU.getLayoutParams();
                    n1 n1VarM2 = RecyclerView.M(viewU);
                    if (n1VarM2.h()) {
                        u.i0 i0Var2 = (u.i0) y0Var.f10274b.B.f2830d;
                        z1 z1VarA2 = (z1) i0Var2.get(n1VarM2);
                        if (z1VarA2 == null) {
                            z1VarA2 = z1.a();
                            i0Var2.put(n1VarM2, z1VarA2);
                        }
                        z1VarA2.f10297a = 1 | z1VarA2.f10297a;
                    } else {
                        y0Var.f10274b.B.F(n1VarM2);
                    }
                    y0Var.f10273a.h(viewU, i10, z0Var2, n1VarM2.h());
                }
            } else {
                this.f10273a.e(view, i10, false);
                z0Var.f10294c = true;
                e0 e0Var = this.f10277e;
                if (e0Var != null && e0Var.f10042e) {
                    e0Var.f10039b.getClass();
                    n1 n1VarM3 = RecyclerView.M(view);
                    if ((n1VarM3 != null ? n1VarM3.b() : -1) == e0Var.f10038a) {
                        e0Var.f10043f = view;
                    }
                }
            }
        }
        if (z0Var.f10295d) {
            if (RecyclerView.X0) {
                Objects.toString(z0Var.f10292a);
            }
            n1VarM.f10155a.invalidate();
            z0Var.f10295d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(f1 f1Var, j1 j1Var);

    public abstract boolean e();

    public abstract void e0(j1 j1Var);

    public boolean f(z0 z0Var) {
        return z0Var != null;
    }

    public Parcelable g0() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[PHI: r3
  0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i0(h7.f1 r3, h7.j1 r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.f10274b
            r4 = 0
            if (r3 != 0) goto L7
            goto L8f
        L7:
            int r3 = r2.f10285o
            int r6 = r2.f10284n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.f10274b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView r1 = r2.f10274b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2c
            int r3 = r0.height()
            int r6 = r0.width()
        L2c:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L64
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L38
            r3 = r4
            r5 = r3
            goto L8b
        L38:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f10274b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4d
            int r5 = r2.G()
            int r3 = r3 - r5
            int r5 = r2.D()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4e
        L4d:
            r3 = r4
        L4e:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f10274b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L62
            int r5 = r2.E()
            int r6 = r6 - r5
            int r5 = r2.F()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8b
        L62:
            r5 = r4
            goto L8b
        L64:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f10274b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L77
            int r5 = r2.G()
            int r3 = r3 - r5
            int r5 = r2.D()
            int r3 = r3 - r5
            goto L78
        L77:
            r3 = r4
        L78:
            androidx.recyclerview.widget.RecyclerView r5 = r2.f10274b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L62
            int r5 = r2.E()
            int r6 = r6 - r5
            int r5 = r2.F()
            int r5 = r6 - r5
        L8b:
            if (r3 != 0) goto L90
            if (r5 != 0) goto L90
        L8f:
            return r4
        L90:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f10274b
            r4.k0(r5, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.y0.i0(h7.f1, h7.j1, int, android.os.Bundle):boolean");
    }

    public abstract int j(j1 j1Var);

    public final void j0(f1 f1Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).o()) {
                View viewU = u(iV);
                m0(iV);
                f1Var.i(viewU);
            }
        }
    }

    public abstract int k(j1 j1Var);

    public final void k0(f1 f1Var) {
        ArrayList arrayList = f1Var.f10058a;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((n1) arrayList.get(i10)).f10155a;
            n1 n1VarM = RecyclerView.M(view);
            if (!n1VarM.o()) {
                n1VarM.n(false);
                if (n1VarM.j()) {
                    this.f10274b.removeDetachedView(view, false);
                }
                v0 v0Var = this.f10274b.f2070l0;
                if (v0Var != null) {
                    v0Var.d(n1VarM);
                }
                n1VarM.n(true);
                n1 n1VarM2 = RecyclerView.M(view);
                n1VarM2.f10166n = null;
                n1VarM2.f10167o = false;
                n1VarM2.j &= -33;
                f1Var.j(n1VarM2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = f1Var.f10059b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f10274b.invalidate();
        }
    }

    public abstract int l(j1 j1Var);

    public final void l0(View view, f1 f1Var) {
        bj.c cVar = this.f10273a;
        b9.c cVar2 = (b9.c) cVar.f2795g;
        int i10 = cVar.f2794d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            cVar.f2794d = 1;
            cVar.f2798y = view;
            int iIndexOfChild = ((RecyclerView) cVar2.f2478d).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((dj.i) cVar.f2796r).E(iIndexOfChild)) {
                    cVar.K(view);
                }
                cVar2.v(iIndexOfChild);
            }
            cVar.f2794d = 0;
            cVar.f2798y = null;
            f1Var.i(view);
        } catch (Throwable th2) {
            cVar.f2794d = 0;
            cVar.f2798y = null;
            throw th2;
        }
    }

    public abstract int m(j1 j1Var);

    public final void m0(int i10) {
        if (u(i10) != null) {
            bj.c cVar = this.f10273a;
            b9.c cVar2 = (b9.c) cVar.f2795g;
            int i11 = cVar.f2794d;
            if (i11 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iZ = cVar.z(i10);
                View childAt = ((RecyclerView) cVar2.f2478d).getChildAt(iZ);
                if (childAt != null) {
                    cVar.f2794d = 1;
                    cVar.f2798y = childAt;
                    if (((dj.i) cVar.f2796r).E(iZ)) {
                        cVar.K(childAt);
                    }
                    cVar2.v(iZ);
                }
                cVar.f2794d = 0;
                cVar.f2798y = null;
            } catch (Throwable th2) {
                cVar.f2794d = 0;
                cVar.f2798y = null;
                throw th2;
            }
        }
    }

    public abstract int n(j1 j1Var);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f10284n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f10285o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f10284n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f10285o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f10274b
            android.graphics.Rect r5 = r5.F
            r8.y(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.k0(r11, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.y0.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int o(j1 j1Var);

    public final void o0() {
        RecyclerView recyclerView = this.f10274b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(f1 f1Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            n1 n1VarM = RecyclerView.M(viewU);
            if (n1VarM.o()) {
                if (RecyclerView.X0) {
                    n1VarM.toString();
                }
            } else if (!n1VarM.f() || n1VarM.h() || this.f10274b.I.f10190b) {
                u(iV);
                this.f10273a.s(iV);
                f1Var.k(viewU);
                this.f10274b.B.F(n1VarM);
            } else {
                m0(iV);
                f1Var.j(n1VarM);
            }
        }
    }

    public abstract int p0(int i10, f1 f1Var, j1 j1Var);

    public View q(int i10) {
        int iV = v();
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            n1 n1VarM = RecyclerView.M(viewU);
            if (n1VarM != null && n1VarM.b() == i10 && !n1VarM.o() && (this.f10274b.D0.f10107g || !n1VarM.h())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract void q0(int i10);

    public abstract z0 r();

    public abstract int r0(int i10, f1 f1Var, j1 j1Var);

    public z0 s(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public z0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z0 ? new z0((z0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new z0((ViewGroup.MarginLayoutParams) layoutParams) : new z0(layoutParams);
    }

    public final void t0(int i10, int i11) {
        this.f10284n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f10282l = mode;
        if (mode == 0 && !RecyclerView.f2050a1) {
            this.f10284n = 0;
        }
        this.f10285o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f10283m = mode2;
        if (mode2 != 0 || RecyclerView.f2050a1) {
            return;
        }
        this.f10285o = 0;
    }

    public final View u(int i10) {
        bj.c cVar = this.f10273a;
        if (cVar != null) {
            return cVar.x(i10);
        }
        return null;
    }

    public void u0(Rect rect, int i10, int i11) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f10274b;
        WeakHashMap weakHashMap = u3.i0.f23177a;
        this.f10274b.setMeasuredDimension(g(i10, iF, recyclerView.getMinimumWidth()), g(i11, iD, this.f10274b.getMinimumHeight()));
    }

    public final int v() {
        bj.c cVar = this.f10273a;
        if (cVar != null) {
            return cVar.y();
        }
        return 0;
    }

    public final void v0(int i10, int i11) {
        int iV = v();
        if (iV == 0) {
            this.f10274b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iV; i16++) {
            View viewU = u(i16);
            Rect rect = this.f10274b.F;
            y(rect, viewU);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f10274b.F.set(i15, i13, i12, i14);
        u0(this.f10274b.F, i10, i11);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f10274b = null;
            this.f10273a = null;
            this.f10284n = 0;
            this.f10285o = 0;
        } else {
            this.f10274b = recyclerView;
            this.f10273a = recyclerView.f2085y;
            this.f10284n = recyclerView.getWidth();
            this.f10285o = recyclerView.getHeight();
        }
        this.f10282l = 1073741824;
        this.f10283m = 1073741824;
    }

    public int x(f1 f1Var, j1 j1Var) {
        return -1;
    }

    public final boolean x0(View view, int i10, int i11, z0 z0Var) {
        return (!view.isLayoutRequested() && this.f10280h && M(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) z0Var).width) && M(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) z0Var).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        RecyclerView.N(rect, view);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i10, int i11, z0 z0Var) {
        return (this.f10280h && M(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) z0Var).width) && M(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) z0Var).height)) ? false : true;
    }

    public void Q() {
    }

    public void Z() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i10) {
    }

    public void Y(int i10, int i11) {
    }

    public void a0(int i10, int i11) {
    }

    public void b0(int i10, int i11) {
    }

    public void c0(int i10, int i11) {
    }

    public void i(int i10, androidx.datastore.preferences.protobuf.l lVar) {
    }

    public void X(f1 f1Var, j1 j1Var, View view, v3.c cVar) {
    }

    public void h(int i10, int i11, j1 j1Var, androidx.datastore.preferences.protobuf.l lVar) {
    }
}
