package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.datastore.preferences.protobuf.l;
import h7.a0;
import h7.c0;
import h7.d0;
import h7.f1;
import h7.j1;
import h7.y0;
import h7.z0;
import io.sentry.android.core.e0;
import java.util.Arrays;
import java.util.WeakHashMap;
import ma.v;
import u3.i0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final io.sentry.internal.debugmeta.c K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new io.sentry.internal.debugmeta.c(23);
        this.L = new Rect();
        p1(y0.I(context, attributeSet, i10, i11).f10260b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final boolean C0() {
        return this.f2046z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(j1 j1Var, d0 d0Var, l lVar) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = d0Var.f10025d) >= 0 && i10 < j1Var.b() && i11 > 0; i12++) {
            lVar.b(d0Var.f10025d, Math.max(0, d0Var.f10028g));
            this.K.getClass();
            i11--;
            d0Var.f10025d += d0Var.f10026e;
        }
    }

    @Override // h7.y0
    public final int J(f1 f1Var, j1 j1Var) {
        if (this.f2036p == 0) {
            return this.F;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return l1(j1Var.b() - 1, f1Var, j1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View R0(f1 f1Var, j1 j1Var, boolean z10, boolean z11) {
        int i10;
        int iV;
        int iV2 = v();
        int i11 = 1;
        if (z11) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
        }
        int iB = j1Var.b();
        J0();
        int iK = this.f2038r.k();
        int iG = this.f2038r.g();
        View view = null;
        View view2 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iH = y0.H(viewU);
            if (iH >= 0 && iH < iB && m1(iH, f1Var, j1Var) == 0) {
                if (((z0) viewU.getLayoutParams()).f10292a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f2038r.e(viewU) < iG && this.f2038r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, h7.f1 r25, h7.j1 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, h7.f1, h7.j1):android.view.View");
    }

    @Override // h7.y0
    public final void V(f1 f1Var, j1 j1Var, v3.c cVar) {
        super.V(f1Var, j1Var, cVar);
        cVar.i(GridView.class.getName());
    }

    @Override // h7.y0
    public final void X(f1 f1Var, j1 j1Var, View view, v3.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a0)) {
            W(view, cVar);
            return;
        }
        a0 a0Var = (a0) layoutParams;
        int iL1 = l1(a0Var.f10292a.b(), f1Var, j1Var);
        if (this.f2036p == 0) {
            cVar.k(g.a.a(false, a0Var.f9997e, a0Var.f9998f, iL1, 1));
        } else {
            cVar.k(g.a.a(false, iL1, 1, a0Var.f9997e, a0Var.f9998f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(f1 f1Var, j1 j1Var, d0 d0Var, c0 c0Var) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iG;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r12;
        int i13;
        View viewB;
        int iJ = this.f2038r.j();
        boolean z10 = iJ != 1073741824;
        int i14 = v() > 0 ? this.G[this.F] : 0;
        if (z10) {
            q1();
        }
        boolean z11 = d0Var.f10026e == 1;
        int iM1 = this.F;
        if (!z11) {
            iM1 = m1(d0Var.f10025d, f1Var, j1Var) + n1(d0Var.f10025d, f1Var, j1Var);
        }
        int i15 = 0;
        while (i15 < this.F && (i13 = d0Var.f10025d) >= 0 && i13 < j1Var.b() && iM1 > 0) {
            int i16 = d0Var.f10025d;
            int iN1 = n1(i16, f1Var, j1Var);
            if (iN1 > this.F) {
                StringBuilder sb2 = new StringBuilder("Item at position ");
                sb2.append(i16);
                sb2.append(" requires ");
                sb2.append(iN1);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(h0.b.i(this.F, " spans.", sb2));
            }
            iM1 -= iN1;
            if (iM1 < 0 || (viewB = d0Var.b(f1Var)) == null) {
                break;
            }
            this.H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            c0Var.f10019b = true;
            return;
        }
        if (z11) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.H[i10];
            a0 a0Var = (a0) view.getLayoutParams();
            int iN12 = n1(y0.H(view), f1Var, j1Var);
            a0Var.f9998f = iN12;
            a0Var.f9997e = i17;
            i17 += iN12;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.H[i19];
            if (d0Var.k != null) {
                r12 = 0;
                r12 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z11) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f10274b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.O(view2));
            }
            o1(view2, iJ, r12);
            int iC = this.f2038r.c(view2);
            if (iC > i18) {
                i18 = iC;
            }
            float fD = (this.f2038r.d(view2) * 1.0f) / ((a0) view2.getLayoutParams()).f9998f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            i1(Math.max(Math.round(f10 * this.F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.H[i20];
                o1(view3, 1073741824, true);
                int iC2 = this.f2038r.c(view3);
                if (iC2 > i18) {
                    i18 = iC2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.H[i21];
            if (this.f2038r.c(view4) != i18) {
                a0 a0Var2 = (a0) view4.getLayoutParams();
                Rect rect2 = a0Var2.f10293b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) a0Var2).topMargin + ((ViewGroup.MarginLayoutParams) a0Var2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) a0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) a0Var2).rightMargin;
                int iK1 = k1(a0Var2.f9997e, a0Var2.f9998f);
                if (this.f2036p == 1) {
                    iW2 = y0.w(false, iK1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) a0Var2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iW = y0.w(false, iK1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) a0Var2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (z0(view4, iW2, iW, (z0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        c0Var.f10018a = i18;
        if (this.f2036p != 1) {
            if (d0Var.f10027f == -1) {
                int i24 = d0Var.f10023b;
                iE = i24 - i18;
                iG = 0;
                iD = i24;
            } else {
                int i25 = d0Var.f10023b;
                iD = i25 + i18;
                iG = 0;
                iE = i25;
            }
            iD2 = iG;
        } else if (d0Var.f10027f == -1) {
            iD2 = d0Var.f10023b;
            iG = iD2 - i18;
            iE = 0;
            iD = 0;
        } else {
            int i26 = d0Var.f10023b;
            iD = 0;
            iG = i26;
            iD2 = i26 + i18;
            iE = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.H[i27];
            a0 a0Var3 = (a0) view5.getLayoutParams();
            if (this.f2036p != 1) {
                iG = G() + this.G[a0Var3.f9997e];
                iD2 = this.f2038r.d(view5) + iG;
            } else if (W0()) {
                int iE2 = E() + this.G[this.F - a0Var3.f9997e];
                iD = iE2;
                iE = iE2 - this.f2038r.d(view5);
            } else {
                iE = E() + this.G[a0Var3.f9997e];
                iD = this.f2038r.d(view5) + iE;
            }
            y0.N(view5, iE, iG, iD, iD2);
            if (a0Var3.f10292a.h() || a0Var3.f10292a.k()) {
                c0Var.f10020c = true;
            }
            c0Var.f10021d = view5.hasFocusable() | c0Var.f10021d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // h7.y0
    public final void Y(int i10, int i11) {
        io.sentry.internal.debugmeta.c cVar = this.K;
        cVar.r();
        ((SparseIntArray) cVar.f12354g).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(f1 f1Var, j1 j1Var, v vVar, int i10) {
        q1();
        if (j1Var.b() > 0 && !j1Var.f10107g) {
            boolean z10 = i10 == 1;
            int iM1 = m1(vVar.f16622b, f1Var, j1Var);
            if (z10) {
                while (iM1 > 0) {
                    int i11 = vVar.f16622b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    vVar.f16622b = i12;
                    iM1 = m1(i12, f1Var, j1Var);
                }
            } else {
                int iB = j1Var.b() - 1;
                int i13 = vVar.f16622b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iM12 = m1(i14, f1Var, j1Var);
                    if (iM12 <= iM1) {
                        break;
                    }
                    i13 = i14;
                    iM1 = iM12;
                }
                vVar.f16622b = i13;
            }
        }
        j1();
    }

    @Override // h7.y0
    public final void Z() {
        io.sentry.internal.debugmeta.c cVar = this.K;
        cVar.r();
        ((SparseIntArray) cVar.f12354g).clear();
    }

    @Override // h7.y0
    public final void a0(int i10, int i11) {
        io.sentry.internal.debugmeta.c cVar = this.K;
        cVar.r();
        ((SparseIntArray) cVar.f12354g).clear();
    }

    @Override // h7.y0
    public final void b0(int i10, int i11) {
        io.sentry.internal.debugmeta.c cVar = this.K;
        cVar.r();
        ((SparseIntArray) cVar.f12354g).clear();
    }

    @Override // h7.y0
    public final void c0(int i10, int i11) {
        io.sentry.internal.debugmeta.c cVar = this.K;
        cVar.r();
        ((SparseIntArray) cVar.f12354g).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final void d0(f1 f1Var, j1 j1Var) {
        boolean z10 = j1Var.f10107g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                a0 a0Var = (a0) u(i10).getLayoutParams();
                int iB = a0Var.f10292a.b();
                sparseIntArray2.put(iB, a0Var.f9998f);
                sparseIntArray.put(iB, a0Var.f9997e);
            }
        }
        super.d0(f1Var, j1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final void e0(j1 j1Var) {
        super.e0(j1Var);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.e1(false);
    }

    @Override // h7.y0
    public final boolean f(z0 z0Var) {
        return z0Var instanceof a0;
    }

    public final void i1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final void j1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int k(j1 j1Var) {
        return G0(j1Var);
    }

    public final int k1(int i10, int i11) {
        if (this.f2036p != 1 || !W0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int l(j1 j1Var) {
        return H0(j1Var);
    }

    public final int l1(int i10, f1 f1Var, j1 j1Var) {
        boolean z10 = j1Var.f10107g;
        io.sentry.internal.debugmeta.c cVar = this.K;
        if (!z10) {
            int i11 = this.F;
            cVar.getClass();
            return io.sentry.internal.debugmeta.c.n(i10, i11);
        }
        int iB = f1Var.b(i10);
        if (iB != -1) {
            int i12 = this.F;
            cVar.getClass();
            return io.sentry.internal.debugmeta.c.n(iB, i12);
        }
        e0.p("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int m1(int i10, f1 f1Var, j1 j1Var) {
        boolean z10 = j1Var.f10107g;
        io.sentry.internal.debugmeta.c cVar = this.K;
        if (!z10) {
            int i11 = this.F;
            cVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = f1Var.b(i10);
        if (iB != -1) {
            int i13 = this.F;
            cVar.getClass();
            return iB % i13;
        }
        e0.p("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int n(j1 j1Var) {
        return G0(j1Var);
    }

    public final int n1(int i10, f1 f1Var, j1 j1Var) {
        boolean z10 = j1Var.f10107g;
        io.sentry.internal.debugmeta.c cVar = this.K;
        if (!z10) {
            cVar.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (f1Var.b(i10) != -1) {
            cVar.getClass();
            return 1;
        }
        e0.p("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int o(j1 j1Var) {
        return H0(j1Var);
    }

    public final void o1(View view, int i10, boolean z10) {
        int iW;
        int iW2;
        a0 a0Var = (a0) view.getLayoutParams();
        Rect rect = a0Var.f10293b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) a0Var).topMargin + ((ViewGroup.MarginLayoutParams) a0Var).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) a0Var).leftMargin + ((ViewGroup.MarginLayoutParams) a0Var).rightMargin;
        int iK1 = k1(a0Var.f9997e, a0Var.f9998f);
        if (this.f2036p == 1) {
            iW2 = y0.w(false, iK1, i10, i12, ((ViewGroup.MarginLayoutParams) a0Var).width);
            iW = y0.w(true, this.f2038r.l(), this.f10283m, i11, ((ViewGroup.MarginLayoutParams) a0Var).height);
        } else {
            int iW3 = y0.w(false, iK1, i10, i11, ((ViewGroup.MarginLayoutParams) a0Var).height);
            int iW4 = y0.w(true, this.f2038r.l(), this.f10282l, i12, ((ViewGroup.MarginLayoutParams) a0Var).width);
            iW = iW3;
            iW2 = iW4;
        }
        z0 z0Var = (z0) view.getLayoutParams();
        if (z10 ? z0(view, iW2, iW, z0Var) : x0(view, iW2, iW, z0Var)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int p0(int i10, f1 f1Var, j1 j1Var) {
        q1();
        j1();
        return super.p0(i10, f1Var, j1Var);
    }

    public final void p1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(h0.b.h(i10, "Span count should be at least 1. Provided "));
        }
        this.F = i10;
        this.K.r();
        o0();
    }

    public final void q1() {
        int iD;
        int iG;
        if (this.f2036p == 1) {
            iD = this.f10284n - F();
            iG = E();
        } else {
            iD = this.f10285o - D();
            iG = G();
        }
        i1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final z0 r() {
        return this.f2036p == 0 ? new a0(-2, -1) : new a0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h7.y0
    public final int r0(int i10, f1 f1Var, j1 j1Var) {
        q1();
        j1();
        return super.r0(i10, f1Var, j1Var);
    }

    @Override // h7.y0
    public final z0 s(Context context, AttributeSet attributeSet) {
        a0 a0Var = new a0(context, attributeSet);
        a0Var.f9997e = -1;
        a0Var.f9998f = 0;
        return a0Var;
    }

    @Override // h7.y0
    public final z0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a0 a0Var = new a0((ViewGroup.MarginLayoutParams) layoutParams);
            a0Var.f9997e = -1;
            a0Var.f9998f = 0;
            return a0Var;
        }
        a0 a0Var2 = new a0(layoutParams);
        a0Var2.f9997e = -1;
        a0Var2.f9998f = 0;
        return a0Var2;
    }

    @Override // h7.y0
    public final void u0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.u0(rect, i10, i11);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f2036p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f10274b;
            WeakHashMap weakHashMap = i0.f23177a;
            iG2 = y0.g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = y0.g(i10, iArr[iArr.length - 1] + iF, this.f10274b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f10274b;
            WeakHashMap weakHashMap2 = i0.f23177a;
            iG = y0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = y0.g(i11, iArr2[iArr2.length - 1] + iD, this.f10274b.getMinimumHeight());
        }
        this.f10274b.setMeasuredDimension(iG, iG2);
    }

    @Override // h7.y0
    public final int x(f1 f1Var, j1 j1Var) {
        if (this.f2036p == 1) {
            return this.F;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return l1(j1Var.b() - 1, f1Var, j1Var) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new io.sentry.internal.debugmeta.c(23);
        this.L = new Rect();
        p1(i10);
    }
}
