package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i2) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        int f1856e;

        /* renamed from: f, reason: collision with root package name */
        int f1857f;

        public b(int i2, int i3) {
            super(i2, i3);
            this.f1856e = -1;
            this.f1857f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1856e = -1;
            this.f1857f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1856e = -1;
            this.f1857f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1856e = -1;
            this.f1857f = 0;
        }

        public int e() {
            return this.f1856e;
        }

        public int f() {
            return this.f1857f;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f1858a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f1859b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f1860c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1861d = false;

        static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        int b(int i2, int i3) {
            if (!this.f1861d) {
                return d(i2, i3);
            }
            int i4 = this.f1859b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iD = d(i2, i3);
            this.f1859b.put(i2, iD);
            return iD;
        }

        int c(int i2, int i3) {
            if (!this.f1860c) {
                return e(i2, i3);
            }
            int i4 = this.f1858a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iE = e(i2, i3);
            this.f1858a.put(i2, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f1861d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f1859b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f1859b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i2, int i3);

        public abstract int f(int i2);

        public void g() {
            this.f1859b.clear();
        }

        public void h() {
            this.f1858a.clear();
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        X2(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        X2(RecyclerView.o.g0(context, attributeSet, i2, i3).f2019b);
    }

    private void H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, boolean z2) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z2) {
            i6 = i2;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.L[i3];
            b bVar = (b) view.getLayoutParams();
            int iT2 = T2(vVar, a0Var, f0(view));
            bVar.f1857f = iT2;
            bVar.f1856e = i5;
            i5 += iT2;
            i3 += i4;
        }
    }

    private void I2() {
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            b bVar = (b) H(i2).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    private void J2(int i2) {
        this.K = K2(this.K, this.J, i2);
    }

    static int[] K2(int[] iArr, int i2, int i3) {
        int i4;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private void L2() {
        this.M.clear();
        this.N.clear();
    }

    private int M2(RecyclerView.a0 a0Var) {
        if (I() != 0 && a0Var.b() != 0) {
            N1();
            boolean zL2 = l2();
            View viewS1 = S1(!zL2, true);
            View viewR1 = R1(!zL2, true);
            if (viewS1 != null && viewR1 != null) {
                int iB = this.O.b(f0(viewS1), this.J);
                int iB2 = this.O.b(f0(viewR1), this.J);
                int iMax = this.f1867x ? Math.max(0, ((this.O.b(a0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zL2) {
                    return Math.round((iMax * (Math.abs(this.f1864u.d(viewR1) - this.f1864u.g(viewS1)) / ((this.O.b(f0(viewR1), this.J) - this.O.b(f0(viewS1), this.J)) + 1))) + (this.f1864u.m() - this.f1864u.g(viewS1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int N2(RecyclerView.a0 a0Var) {
        if (I() != 0 && a0Var.b() != 0) {
            N1();
            View viewS1 = S1(!l2(), true);
            View viewR1 = R1(!l2(), true);
            if (viewS1 != null && viewR1 != null) {
                if (!l2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int iD = this.f1864u.d(viewR1) - this.f1864u.g(viewS1);
                int iB = this.O.b(f0(viewS1), this.J);
                return (int) ((iD / ((this.O.b(f0(viewR1), this.J) - iB) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void O2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        boolean z2 = i2 == 1;
        int iS2 = S2(vVar, a0Var, aVar.f1871b);
        if (z2) {
            while (iS2 > 0) {
                int i3 = aVar.f1871b;
                if (i3 <= 0) {
                    return;
                }
                int i4 = i3 - 1;
                aVar.f1871b = i4;
                iS2 = S2(vVar, a0Var, i4);
            }
            return;
        }
        int iB = a0Var.b() - 1;
        int i5 = aVar.f1871b;
        while (i5 < iB) {
            int i6 = i5 + 1;
            int iS22 = S2(vVar, a0Var, i6);
            if (iS22 <= iS2) {
                break;
            }
            i5 = i6;
            iS2 = iS22;
        }
        aVar.f1871b = i5;
    }

    private void P2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int R2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.b(i2, this.J);
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private int S2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.c(i2, this.J);
        }
        int i3 = this.N.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private int T2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.f(i2);
        }
        int i3 = this.M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void U2(float f2, int i2) {
        J2(Math.max(Math.round(f2 * this.J), i2));
    }

    private void V2(View view, int i2, boolean z2) {
        int iJ;
        int iJ2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2023b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iQ2 = Q2(bVar.f1856e, bVar.f1857f);
        if (this.f1862s == 1) {
            iJ2 = RecyclerView.o.J(iQ2, i2, i4, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iJ = RecyclerView.o.J(this.f1864u.n(), W(), i3, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iJ3 = RecyclerView.o.J(iQ2, i2, i3, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iJ4 = RecyclerView.o.J(this.f1864u.n(), n0(), i4, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iJ = iJ3;
            iJ2 = iJ4;
        }
        W2(view, iJ2, iJ, z2);
    }

    private void W2(View view, int i2, int i3, boolean z2) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z2 ? D1(view, i2, i3, pVar) : B1(view, i2, i3, pVar)) {
            view.measure(i2, i3);
        }
    }

    private void Y2() {
        int iV;
        int iE0;
        if (j2() == 1) {
            iV = m0() - d0();
            iE0 = c0();
        } else {
            iV = V() - b0();
            iE0 = e0();
        }
        J2(iV - iE0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        return this.f1862s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean F1() {
        return this.D == null && !this.I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View H0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.H0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void H1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(a0Var) && iF > 0; i2++) {
            int i3 = cVar.f1882d;
            cVar2.a(i3, Math.max(0, cVar.f1885g));
            iF -= this.O.f(i3);
            cVar.f1882d += cVar.f1883e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int M(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f1862s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return R2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, b0.c cVar) {
        int iF;
        int iE;
        int iF2;
        boolean z2;
        boolean z3;
        int iE2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.M0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iR2 = R2(vVar, a0Var, bVar.a());
        if (this.f1862s == 0) {
            iE2 = bVar.e();
            iF = bVar.f();
            iF2 = 1;
            z2 = false;
            z3 = false;
            iE = iR2;
        } else {
            iF = 1;
            iE = bVar.e();
            iF2 = bVar.f();
            z2 = false;
            z3 = false;
            iE2 = iR2;
        }
        cVar.L(c.C0022c.a(iE2, iF, iE, iF2, z2, z3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    int Q2(int i2, int i3) {
        if (this.f1862s != 1 || !k2()) {
            int[] iArr = this.K;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.K;
        int i4 = this.J;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            I2();
        }
        super.V0(vVar, a0Var);
        L2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.a0 a0Var) {
        super.W0(a0Var);
        this.I = false;
    }

    public void X2(int i2) {
        if (i2 == this.J) {
            return;
        }
        this.I = true;
        if (i2 >= 1) {
            this.J = i2;
            this.O.h();
            q1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3, int i4) {
        N1();
        int iM = this.f1864u.m();
        int i5 = this.f1864u.i();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View viewH = H(i2);
            int iF0 = f0(viewH);
            if (iF0 >= 0 && iF0 < i4 && S2(vVar, a0Var, iF0) == 0) {
                if (((RecyclerView.p) viewH.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.f1864u.g(viewH) < i5 && this.f1864u.d(viewH) >= iM) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int i0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f1862s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return R2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void o2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        super.o2(vVar, a0Var, aVar, i2);
        Y2();
        if (a0Var.b() > 0 && !a0Var.e()) {
            O2(vVar, a0Var, aVar, i2);
        }
        P2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return this.Q ? M2(a0Var) : super.q(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return this.Q ? N2(a0Var) : super.r(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return this.Q ? M2(a0Var) : super.t(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int t1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Y2();
        P2();
        return super.t1(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return this.Q ? N2(a0Var) : super.u(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Y2();
        P2();
        return super.u1(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Rect rect, int i2, int i3) {
        int iM;
        int iM2;
        if (this.K == null) {
            super.y1(rect, i2, i3);
        }
        int iC0 = c0() + d0();
        int iE0 = e0() + b0();
        if (this.f1862s == 1) {
            iM2 = RecyclerView.o.m(i3, rect.height() + iE0, Z());
            int[] iArr = this.K;
            iM = RecyclerView.o.m(i2, iArr[iArr.length - 1] + iC0, a0());
        } else {
            iM = RecyclerView.o.m(i2, rect.width() + iC0, a0());
            int[] iArr2 = this.K;
            iM2 = RecyclerView.o.m(i3, iArr2[iArr2.length - 1] + iE0, Z());
        }
        x1(iM, iM2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void y2(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.y2(false);
    }
}
