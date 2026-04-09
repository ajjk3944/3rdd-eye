package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a9;
import defpackage.e61;
import defpackage.ef;
import defpackage.go0;
import defpackage.h50;
import defpackage.ho0;
import defpackage.io0;
import defpackage.l92;
import defpackage.no0;
import defpackage.nr;
import defpackage.qx0;
import defpackage.rx0;
import defpackage.so0;
import defpackage.t90;
import defpackage.to0;
import defpackage.tx0;
import defpackage.w60;
import defpackage.yb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends ho0 implements so0 {
    public final l92 B;
    public final int C;
    public boolean D;
    public boolean E;
    public tx0 F;
    public final Rect G;
    public final qx0 H;
    public final boolean I;
    public int[] J;
    public final a9 K;
    public final int p;
    public final t90[] q;
    public final nr r;
    public final nr s;
    public final int t;
    public int u;
    public final h50 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        l92 l92Var = new l92();
        this.B = l92Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new qx0(this);
        this.I = true;
        this.K = new a9(13, this);
        go0 go0VarI = ho0.I(context, attributeSet, i, i2);
        int i3 = go0VarI.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            nr nrVar = this.r;
            this.r = this.s;
            this.s = nrVar;
            m0();
        }
        int i4 = go0VarI.b;
        c(null);
        if (i4 != this.p) {
            l92Var.c();
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new t90[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new t90(this, i5);
            }
            m0();
        }
        boolean z = go0VarI.c;
        c(null);
        tx0 tx0Var = this.F;
        if (tx0Var != null && tx0Var.m != z) {
            tx0Var.m = z;
        }
        this.w = z;
        m0();
        h50 h50Var = new h50();
        h50Var.a = true;
        h50Var.f = 0;
        h50Var.g = 0;
        this.v = h50Var;
        this.r = nr.a(this, this.t);
        this.s = nr.a(this, 1 - this.t);
    }

    public static int b1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.ho0
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int iI0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            if (iI0 == 0 && N0() != null) {
                this.B.c();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return yb.g(to0Var, this.r, F0(z), E0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int D0(no0 no0Var, h50 h50Var, to0 to0Var) {
        t90 t90Var;
        ?? r8;
        int iL;
        int iC;
        int iK;
        int iC2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.y.set(0, this.p, true);
        h50 h50Var2 = this.v;
        int i6 = h50Var2.i ? h50Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : h50Var.e == 1 ? h50Var.g + h50Var.b : h50Var.f - h50Var.b;
        int i7 = h50Var.e;
        for (int i8 = 0; i8 < this.p; i8++) {
            if (!((ArrayList) this.q[i8].f).isEmpty()) {
                a1(this.q[i8], i7, i6);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i9 = h50Var.c;
            if (i9 < 0 || i9 >= to0Var.b() || (!h50Var2.i && this.y.isEmpty())) {
                break;
            }
            View viewD = no0Var.d(h50Var.c);
            h50Var.c += h50Var.d;
            rx0 rx0Var = (rx0) viewD.getLayoutParams();
            int iB = rx0Var.a.b();
            l92 l92Var = this.B;
            int[] iArr = (int[]) l92Var.f;
            int i10 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i10 == -1) {
                if (R0(h50Var.e)) {
                    i3 = this.p - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.p;
                    i3 = i4;
                }
                t90 t90Var2 = null;
                if (h50Var.e == i5) {
                    int iK2 = this.r.k();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        t90 t90Var3 = this.q[i3];
                        int iJ = t90Var3.j(iK2);
                        if (iJ < i11) {
                            i11 = iJ;
                            t90Var2 = t90Var3;
                        }
                        i3 += i;
                    }
                } else {
                    int iG2 = this.r.g();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        t90 t90Var4 = this.q[i3];
                        int iL2 = t90Var4.l(iG2);
                        if (iL2 > i12) {
                            t90Var2 = t90Var4;
                            i12 = iL2;
                        }
                        i3 += i;
                    }
                }
                t90Var = t90Var2;
                l92Var.w(iB);
                ((int[]) l92Var.f)[iB] = t90Var.e;
            } else {
                t90Var = this.q[i10];
            }
            rx0Var.e = t90Var;
            if (h50Var.e == 1) {
                r8 = 0;
                b(viewD, -1, false);
            } else {
                r8 = 0;
                b(viewD, 0, false);
            }
            if (this.t == 1) {
                P0(viewD, ho0.w(r8, this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) rx0Var).width), ho0.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) rx0Var).height));
            } else {
                P0(viewD, ho0.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) rx0Var).width), ho0.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) rx0Var).height));
            }
            if (h50Var.e == 1) {
                iC = t90Var.j(iG);
                iL = this.r.c(viewD) + iC;
            } else {
                iL = t90Var.l(iG);
                iC = iL - this.r.c(viewD);
            }
            if (h50Var.e == 1) {
                t90 t90Var5 = rx0Var.e;
                t90Var5.getClass();
                rx0 rx0Var2 = (rx0) viewD.getLayoutParams();
                rx0Var2.e = t90Var5;
                ArrayList arrayList = (ArrayList) t90Var5.f;
                arrayList.add(viewD);
                t90Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    t90Var5.b = Integer.MIN_VALUE;
                }
                if (rx0Var2.a.h() || rx0Var2.a.k()) {
                    t90Var5.d = ((StaggeredGridLayoutManager) t90Var5.g).r.c(viewD) + t90Var5.d;
                }
            } else {
                t90 t90Var6 = rx0Var.e;
                t90Var6.getClass();
                rx0 rx0Var3 = (rx0) viewD.getLayoutParams();
                rx0Var3.e = t90Var6;
                ArrayList arrayList2 = (ArrayList) t90Var6.f;
                arrayList2.add(0, viewD);
                t90Var6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    t90Var6.c = Integer.MIN_VALUE;
                }
                if (rx0Var3.a.h() || rx0Var3.a.k()) {
                    t90Var6.d = ((StaggeredGridLayoutManager) t90Var6.g).r.c(viewD) + t90Var6.d;
                }
            }
            if (O0() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - t90Var.e) * this.u);
                iK = iC2 - this.s.c(viewD);
            } else {
                iK = this.s.k() + (t90Var.e * this.u);
                iC2 = this.s.c(viewD) + iK;
            }
            if (this.t == 1) {
                ho0.N(viewD, iK, iC, iC2, iL);
            } else {
                ho0.N(viewD, iC, iK, iL, iC2);
            }
            a1(t90Var, h50Var2.e, i6);
            T0(no0Var, h50Var2);
            if (h50Var2.h && viewD.hasFocusable()) {
                this.y.set(t90Var.e, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        if (!z) {
            T0(no0Var, h50Var2);
        }
        int iK3 = h50Var2.e == -1 ? this.r.k() - L0(this.r.k()) : K0(this.r.g()) - this.r.g();
        if (iK3 > 0) {
            return Math.min(h50Var.b, iK3);
        }
        return 0;
    }

    public final View E0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.r.e(viewU);
            int iB = this.r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.r.e(viewU);
            if (this.r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(no0 no0Var, to0 to0Var, boolean z) {
        int iG;
        int iK0 = K0(Integer.MIN_VALUE);
        if (iK0 != Integer.MIN_VALUE && (iG = this.r.g() - iK0) > 0) {
            int i = iG - (-X0(-iG, no0Var, to0Var));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void H0(no0 no0Var, to0 to0Var, boolean z) {
        int iK;
        int iL0 = L0(Integer.MAX_VALUE);
        if (iL0 != Integer.MAX_VALUE && (iK = iL0 - this.r.k()) > 0) {
            int iX0 = iK - X0(iK, no0Var, to0Var);
            if (!z || iX0 <= 0) {
                return;
            }
            this.r.o(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return ho0.H(u(0));
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return ho0.H(u(iV - 1));
    }

    public final int K0(int i) {
        int iJ = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.q[i2].j(i);
            if (iJ2 > iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // defpackage.ho0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i) {
        int iL = this.q[0].l(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iL2 = this.q[i2].l(i);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N0() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    @Override // defpackage.ho0
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            t90 t90Var = this.q[i2];
            int i3 = t90Var.b;
            if (i3 != Integer.MIN_VALUE) {
                t90Var.b = i3 + i;
            }
            int i4 = t90Var.c;
            if (i4 != Integer.MIN_VALUE) {
                t90Var.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // defpackage.ho0
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            t90 t90Var = this.q[i2];
            int i3 = t90Var.b;
            if (i3 != Integer.MIN_VALUE) {
                t90Var.b = i3 + i;
            }
            int i4 = t90Var.c;
            if (i4 != Integer.MIN_VALUE) {
                t90Var.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        rx0 rx0Var = (rx0) view.getLayoutParams();
        int iB1 = b1(i, ((ViewGroup.MarginLayoutParams) rx0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) rx0Var).rightMargin + rect.right);
        int iB12 = b1(i2, ((ViewGroup.MarginLayoutParams) rx0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) rx0Var).bottomMargin + rect.bottom);
        if (v0(view, iB1, iB12, rx0Var)) {
            view.measure(iB1, iB12);
        }
    }

    @Override // defpackage.ho0
    public final void Q() {
        this.B.c();
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(defpackage.no0 r17, defpackage.to0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(no0, to0, boolean):void");
    }

    public final boolean R0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == O0();
    }

    @Override // defpackage.ho0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, to0 to0Var) {
        int iI0;
        int i2;
        if (i > 0) {
            iI0 = J0();
            i2 = 1;
        } else {
            iI0 = I0();
            i2 = -1;
        }
        h50 h50Var = this.v;
        h50Var.a = true;
        Z0(iI0, to0Var);
        Y0(i2);
        h50Var.c = iI0 + h50Var.d;
        h50Var.b = Math.abs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // defpackage.ho0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r9, int r10, defpackage.no0 r11, defpackage.to0 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, no0, to0):android.view.View");
    }

    public final void T0(no0 no0Var, h50 h50Var) {
        if (!h50Var.a || h50Var.i) {
            return;
        }
        if (h50Var.b == 0) {
            if (h50Var.e == -1) {
                U0(no0Var, h50Var.g);
                return;
            } else {
                V0(no0Var, h50Var.f);
                return;
            }
        }
        int i = 1;
        if (h50Var.e == -1) {
            int i2 = h50Var.f;
            int iL = this.q[0].l(i2);
            while (i < this.p) {
                int iL2 = this.q[i].l(i2);
                if (iL2 > iL) {
                    iL = iL2;
                }
                i++;
            }
            int i3 = i2 - iL;
            U0(no0Var, i3 < 0 ? h50Var.g : h50Var.g - Math.min(i3, h50Var.b));
            return;
        }
        int i4 = h50Var.g;
        int iJ = this.q[0].j(i4);
        while (i < this.p) {
            int iJ2 = this.q[i].j(i4);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
            i++;
        }
        int i5 = iJ - h50Var.g;
        V0(no0Var, i5 < 0 ? h50Var.f : Math.min(i5, h50Var.b) + h50Var.f);
    }

    @Override // defpackage.ho0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iH = ho0.H(viewF0);
            int iH2 = ho0.H(viewE0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(no0 no0Var, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.r.e(viewU) < i || this.r.n(viewU) < i) {
                return;
            }
            rx0 rx0Var = (rx0) viewU.getLayoutParams();
            rx0Var.getClass();
            if (((ArrayList) rx0Var.e.f).size() == 1) {
                return;
            }
            t90 t90Var = rx0Var.e;
            ArrayList arrayList = (ArrayList) t90Var.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            rx0 rx0Var2 = (rx0) view.getLayoutParams();
            rx0Var2.e = null;
            if (rx0Var2.a.h() || rx0Var2.a.k()) {
                t90Var.d -= ((StaggeredGridLayoutManager) t90Var.g).r.c(view);
            }
            if (size == 1) {
                t90Var.b = Integer.MIN_VALUE;
            }
            t90Var.c = Integer.MIN_VALUE;
            j0(viewU, no0Var);
        }
    }

    public final void V0(no0 no0Var, int i) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.r.b(viewU) > i || this.r.m(viewU) > i) {
                return;
            }
            rx0 rx0Var = (rx0) viewU.getLayoutParams();
            rx0Var.getClass();
            if (((ArrayList) rx0Var.e.f).size() == 1) {
                return;
            }
            t90 t90Var = rx0Var.e;
            ArrayList arrayList = (ArrayList) t90Var.f;
            View view = (View) arrayList.remove(0);
            rx0 rx0Var2 = (rx0) view.getLayoutParams();
            rx0Var2.e = null;
            if (arrayList.size() == 0) {
                t90Var.c = Integer.MIN_VALUE;
            }
            if (rx0Var2.a.h() || rx0Var2.a.k()) {
                t90Var.d -= ((StaggeredGridLayoutManager) t90Var.g).r.c(view);
            }
            t90Var.b = Integer.MIN_VALUE;
            j0(viewU, no0Var);
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.ho0
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, no0 no0Var, to0 to0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, to0Var);
        h50 h50Var = this.v;
        int iD0 = D0(no0Var, h50Var, to0Var);
        if (h50Var.b >= iD0) {
            i = i < 0 ? -iD0 : iD0;
        }
        this.r.o(-i);
        this.D = this.x;
        h50Var.b = 0;
        T0(no0Var, h50Var);
        return i;
    }

    @Override // defpackage.ho0
    public final void Y() {
        this.B.c();
        m0();
    }

    public final void Y0(int i) {
        h50 h50Var = this.v;
        h50Var.e = i;
        h50Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.ho0
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i, to0 to0Var) {
        int iL;
        int iL2;
        int i2;
        h50 h50Var = this.v;
        boolean z = false;
        h50Var.b = 0;
        h50Var.c = i;
        w60 w60Var = this.e;
        if (w60Var == null || !w60Var.e || (i2 = to0Var.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
                iL2 = 0;
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            h50Var.g = this.r.f() + iL;
            h50Var.f = -iL2;
        } else {
            h50Var.f = this.r.k() - iL2;
            h50Var.g = this.r.g() + iL;
        }
        h50Var.h = false;
        h50Var.a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z = true;
        }
        h50Var.i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // defpackage.so0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.I0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // defpackage.ho0
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(t90 t90Var, int i, int i2) {
        int i3 = t90Var.d;
        int i4 = t90Var.e;
        if (i != -1) {
            int i5 = t90Var.c;
            if (i5 == Integer.MIN_VALUE) {
                t90Var.b();
                i5 = t90Var.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = t90Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) t90Var.f).get(0);
            rx0 rx0Var = (rx0) view.getLayoutParams();
            t90Var.b = ((StaggeredGridLayoutManager) t90Var.g).r.e(view);
            rx0Var.getClass();
            i6 = t90Var.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // defpackage.ho0
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    @Override // defpackage.ho0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.ho0
    public final void c0(no0 no0Var, to0 to0Var) {
        Q0(no0Var, to0Var, true);
    }

    @Override // defpackage.ho0
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.ho0
    public final void d0(to0 to0Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.ho0
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.ho0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof tx0) {
            tx0 tx0Var = (tx0) parcelable;
            this.F = tx0Var;
            if (this.z != -1) {
                tx0Var.f = -1;
                tx0Var.g = -1;
                tx0Var.i = null;
                tx0Var.h = 0;
                tx0Var.j = 0;
                tx0Var.k = null;
                tx0Var.l = null;
            }
            m0();
        }
    }

    @Override // defpackage.ho0
    public final boolean f(io0 io0Var) {
        return io0Var instanceof rx0;
    }

    @Override // defpackage.ho0
    public final Parcelable f0() {
        int iL;
        int iK;
        int[] iArr;
        tx0 tx0Var = this.F;
        if (tx0Var != null) {
            tx0 tx0Var2 = new tx0();
            tx0Var2.h = tx0Var.h;
            tx0Var2.f = tx0Var.f;
            tx0Var2.g = tx0Var.g;
            tx0Var2.i = tx0Var.i;
            tx0Var2.j = tx0Var.j;
            tx0Var2.k = tx0Var.k;
            tx0Var2.m = tx0Var.m;
            tx0Var2.n = tx0Var.n;
            tx0Var2.o = tx0Var.o;
            tx0Var2.l = tx0Var.l;
            return tx0Var2;
        }
        tx0 tx0Var3 = new tx0();
        tx0Var3.m = this.w;
        tx0Var3.n = this.D;
        tx0Var3.o = this.E;
        l92 l92Var = this.B;
        if (l92Var == null || (iArr = (int[]) l92Var.f) == null) {
            tx0Var3.j = 0;
        } else {
            tx0Var3.k = iArr;
            tx0Var3.j = iArr.length;
            tx0Var3.l = (ArrayList) l92Var.g;
        }
        if (v() <= 0) {
            tx0Var3.f = -1;
            tx0Var3.g = -1;
            tx0Var3.h = 0;
            return tx0Var3;
        }
        tx0Var3.f = this.D ? J0() : I0();
        View viewE0 = this.x ? E0(true) : F0(true);
        tx0Var3.g = viewE0 != null ? ho0.H(viewE0) : -1;
        int i = this.p;
        tx0Var3.h = i;
        tx0Var3.i = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            if (this.D) {
                iL = this.q[i2].j(Integer.MIN_VALUE);
                if (iL != Integer.MIN_VALUE) {
                    iK = this.r.g();
                    iL -= iK;
                }
            } else {
                iL = this.q[i2].l(Integer.MIN_VALUE);
                if (iL != Integer.MIN_VALUE) {
                    iK = this.r.k();
                    iL -= iK;
                }
            }
            tx0Var3.i[i2] = iL;
        }
        return tx0Var3;
    }

    @Override // defpackage.ho0
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.ho0
    public final void h(int i, int i2, to0 to0Var, ef efVar) {
        h50 h50Var;
        int iJ;
        int iL;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, to0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            h50Var = this.v;
            if (i3 >= i5) {
                break;
            }
            if (h50Var.d == -1) {
                iJ = h50Var.f;
                iL = this.q[i3].l(iJ);
            } else {
                iJ = this.q[i3].j(h50Var.g);
                iL = h50Var.g;
            }
            int i6 = iJ - iL;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = h50Var.c;
            if (i8 < 0 || i8 >= to0Var.b()) {
                return;
            }
            efVar.b(h50Var.c, this.J[i7]);
            h50Var.c += h50Var.d;
        }
    }

    @Override // defpackage.ho0
    public final int j(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return yb.f(to0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.ho0
    public final int k(to0 to0Var) {
        return C0(to0Var);
    }

    @Override // defpackage.ho0
    public final int l(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return yb.h(to0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.ho0
    public final int m(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return yb.f(to0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.ho0
    public final int n(to0 to0Var) {
        return C0(to0Var);
    }

    @Override // defpackage.ho0
    public final int n0(int i, no0 no0Var, to0 to0Var) {
        return X0(i, no0Var, to0Var);
    }

    @Override // defpackage.ho0
    public final int o(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return yb.h(to0Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.ho0
    public final void o0(int i) {
        tx0 tx0Var = this.F;
        if (tx0Var != null && tx0Var.f != i) {
            tx0Var.i = null;
            tx0Var.h = 0;
            tx0Var.f = -1;
            tx0Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.ho0
    public final int p0(int i, no0 no0Var, to0 to0Var) {
        return X0(i, no0Var, to0Var);
    }

    @Override // defpackage.ho0
    public final io0 r() {
        return this.t == 0 ? new rx0(-2, -1) : new rx0(-1, -2);
    }

    @Override // defpackage.ho0
    public final io0 s(Context context, AttributeSet attributeSet) {
        return new rx0(context, attributeSet);
    }

    @Override // defpackage.ho0
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = e61.a;
            iG2 = ho0.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = ho0.g(i, (this.u * i4) + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e61.a;
            iG = ho0.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = ho0.g(i2, (this.u * i4) + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.ho0
    public final io0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rx0((ViewGroup.MarginLayoutParams) layoutParams) : new rx0(layoutParams);
    }

    @Override // defpackage.ho0
    public final void y0(RecyclerView recyclerView, int i) {
        w60 w60Var = new w60(recyclerView.getContext());
        w60Var.a = i;
        z0(w60Var);
    }
}
