package androidx.recyclerview.widget;

import G1.t;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    boolean f31790I;

    /* renamed from: J, reason: collision with root package name */
    int f31791J;

    /* renamed from: K, reason: collision with root package name */
    int[] f31792K;

    /* renamed from: L, reason: collision with root package name */
    View[] f31793L;

    /* renamed from: M, reason: collision with root package name */
    final SparseIntArray f31794M;

    /* renamed from: N, reason: collision with root package name */
    final SparseIntArray f31795N;

    /* renamed from: O, reason: collision with root package name */
    c f31796O;

    /* renamed from: P, reason: collision with root package name */
    final Rect f31797P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f31798Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f31801a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f31802b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f31803c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31804d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f31804d) {
                return d(i10, i11);
            }
            int i12 = this.f31802b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f31802b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f31803c) {
                return e(i10, i11);
            }
            int i12 = this.f31801a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f31801a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f31804d || (iA = a(this.f31802b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f31802b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f31802b.clear();
        }

        public void h() {
            this.f31801a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f31790I = false;
        this.f31791J = -1;
        this.f31794M = new SparseIntArray();
        this.f31795N = new SparseIntArray();
        this.f31796O = new a();
        this.f31797P = new Rect();
        h3(RecyclerView.o.m0(context, attributeSet, i10, i11).f31991b);
    }

    private void R2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f31793L[i11];
            b bVar = (b) view.getLayoutParams();
            int iD3 = d3(uVar, zVar, l0(view));
            bVar.f31800f = iD3;
            bVar.f31799e = i14;
            i14 += iD3;
            i11 += i13;
        }
    }

    private void S2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            b bVar = (b) N(i10).getLayoutParams();
            int iA = bVar.a();
            this.f31794M.put(iA, bVar.f());
            this.f31795N.put(iA, bVar.e());
        }
    }

    private void T2(int i10) {
        this.f31792K = U2(this.f31792K, this.f31791J, i10);
    }

    static int[] U2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void V2() {
        this.f31794M.clear();
        this.f31795N.clear();
    }

    private int W2(RecyclerView.z zVar) {
        if (O() != 0 && zVar.b() != 0) {
            X1();
            boolean zV2 = v2();
            View viewC2 = c2(!zV2, true);
            View viewB2 = b2(!zV2, true);
            if (viewC2 != null && viewB2 != null) {
                int iB = this.f31796O.b(l0(viewC2), this.f31791J);
                int iB2 = this.f31796O.b(l0(viewB2), this.f31791J);
                int iMax = this.f31818x ? Math.max(0, ((this.f31796O.b(zVar.b() - 1, this.f31791J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zV2) {
                    return Math.round((iMax * (Math.abs(this.f31815u.d(viewB2) - this.f31815u.g(viewC2)) / ((this.f31796O.b(l0(viewB2), this.f31791J) - this.f31796O.b(l0(viewC2), this.f31791J)) + 1))) + (this.f31815u.m() - this.f31815u.g(viewC2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int X2(RecyclerView.z zVar) {
        if (O() != 0 && zVar.b() != 0) {
            X1();
            View viewC2 = c2(!v2(), true);
            View viewB2 = b2(!v2(), true);
            if (viewC2 != null && viewB2 != null) {
                if (!v2()) {
                    return this.f31796O.b(zVar.b() - 1, this.f31791J) + 1;
                }
                int iD = this.f31815u.d(viewB2) - this.f31815u.g(viewC2);
                int iB = this.f31796O.b(l0(viewC2), this.f31791J);
                return (int) ((iD / ((this.f31796O.b(l0(viewB2), this.f31791J) - iB) + 1)) * (this.f31796O.b(zVar.b() - 1, this.f31791J) + 1));
            }
        }
        return 0;
    }

    private void Y2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iC3 = c3(uVar, zVar, aVar.f31822b);
        if (z10) {
            while (iC3 > 0) {
                int i11 = aVar.f31822b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f31822b = i12;
                iC3 = c3(uVar, zVar, i12);
            }
            return;
        }
        int iB = zVar.b() - 1;
        int i13 = aVar.f31822b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iC32 = c3(uVar, zVar, i14);
            if (iC32 <= iC3) {
                break;
            }
            i13 = i14;
            iC3 = iC32;
        }
        aVar.f31822b = i13;
    }

    private void Z2() {
        View[] viewArr = this.f31793L;
        if (viewArr == null || viewArr.length != this.f31791J) {
            this.f31793L = new View[this.f31791J];
        }
    }

    private int b3(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.f31796O.b(i10, this.f31791J);
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f31796O.b(iF, this.f31791J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int c3(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.f31796O.c(i10, this.f31791J);
        }
        int i11 = this.f31795N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f31796O.c(iF, this.f31791J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int d3(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        if (!zVar.e()) {
            return this.f31796O.f(i10);
        }
        int i11 = this.f31794M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f31796O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void e3(float f10, int i10) {
        T2(Math.max(Math.round(f10 * this.f31791J), i10));
    }

    private void f3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f31995b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iA3 = a3(bVar.f31799e, bVar.f31800f);
        if (this.f31813s == 1) {
            iP2 = RecyclerView.o.P(iA3, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.o.P(this.f31815u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.o.P(iA3, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.o.P(this.f31815u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        g3(view, iP2, iP, z10);
    }

    private void g3(View view, int i10, int i11, boolean z10) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10 ? L1(view, i10, i11, pVar) : J1(view, i10, i11, pVar)) {
            view.measure(i10, i11);
        }
    }

    private void i3() {
        int iB0;
        int iK0;
        if (t2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        T2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.f31798Q ? X2(zVar) : super.A(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        i3();
        Z2();
        return super.A1(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        i3();
        Z2();
        return super.C1(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.f31792K == null) {
            super.G1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f31813s == 1) {
            iS2 = RecyclerView.o.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.f31792K;
            iS = RecyclerView.o.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.o.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.f31792K;
            iS2 = RecyclerView.o.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return this.f31813s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void I2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.I2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f31808D == null && !this.f31790I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.f31791J;
        for (int i10 = 0; i10 < this.f31791J && cVar.c(zVar) && iF > 0; i10++) {
            int i11 = cVar.f31833d;
            cVar2.a(i11, Math.max(0, cVar.f31836g));
            iF -= this.f31796O.f(i11);
            cVar.f31833d += cVar.f31834e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f31813s == 1) {
            return this.f31791J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return b3(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView.u uVar, RecyclerView.z zVar, View view, t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, tVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iB3 = b3(uVar, zVar, bVar.a());
        if (this.f31813s == 0) {
            tVar.j0(t.f.a(bVar.e(), bVar.f(), iB3, 1, false, false));
        } else {
            tVar.j0(t.f.a(iB3, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        this.f31796O.h();
        this.f31796O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView) {
        this.f31796O.h();
        this.f31796O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f31796O.h();
        this.f31796O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        this.f31796O.h();
        this.f31796O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f31796O.h();
        this.f31796O.g();
    }

    int a3(int i10, int i11) {
        if (this.f31813s != 1 || !u2()) {
            int[] iArr = this.f31792K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f31792K;
        int i12 = this.f31791J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            S2();
        }
        super.b1(uVar, zVar);
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f31790I = false;
    }

    public void h3(int i10) {
        if (i10 == this.f31791J) {
            return;
        }
        this.f31790I = true;
        if (i10 >= 1) {
            this.f31791J = i10;
            this.f31796O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View l2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11, int i12) {
        X1();
        int iM = this.f31815u.m();
        int i13 = this.f31815u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewN = N(i10);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < i12 && c3(uVar, zVar, iL0) == 0) {
                if (((RecyclerView.p) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f31815u.g(viewN) < i13 && this.f31815u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f31813s == 0) {
            return this.f31791J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return b3(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.f31798Q ? W2(zVar) : super.w(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void w2(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.f31798Q ? X2(zVar) : super.x(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void y2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        super.y2(uVar, zVar, aVar, i10);
        i3();
        if (zVar.b() > 0 && !zVar.e()) {
            Y2(uVar, zVar, aVar, i10);
        }
        Z2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.f31798Q ? W2(zVar) : super.z(zVar);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        int f31799e;

        /* renamed from: f, reason: collision with root package name */
        int f31800f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31799e = -1;
            this.f31800f = 0;
        }

        public int e() {
            return this.f31799e;
        }

        public int f() {
            return this.f31800f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f31799e = -1;
            this.f31800f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31799e = -1;
            this.f31800f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31799e = -1;
            this.f31800f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f31790I = false;
        this.f31791J = -1;
        this.f31794M = new SparseIntArray();
        this.f31795N = new SparseIntArray();
        this.f31796O = new a();
        this.f31797P = new Rect();
        h3(i10);
    }
}
