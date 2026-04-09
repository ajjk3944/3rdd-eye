package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.a00;
import defpackage.a1;
import defpackage.e61;
import defpackage.ef;
import defpackage.ex0;
import defpackage.gw3;
import defpackage.ho0;
import defpackage.io0;
import defpackage.no0;
import defpackage.r60;
import defpackage.s60;
import defpackage.t60;
import defpackage.to0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final gw3 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new gw3(9);
        this.L = new Rect();
        m1(ho0.I(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final boolean A0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(to0 to0Var, t60 t60Var, ef efVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = t60Var.d) >= 0 && i < to0Var.b() && i2 > 0; i3++) {
            efVar.b(t60Var.d, Math.max(0, t60Var.g));
            this.K.getClass();
            i2--;
            t60Var.d += t60Var.e;
        }
    }

    @Override // defpackage.ho0
    public final int J(no0 no0Var, to0 to0Var) {
        if (this.p == 0) {
            return this.F;
        }
        if (to0Var.b() < 1) {
            return 0;
        }
        return i1(to0Var.b() - 1, no0Var, to0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(no0 no0Var, to0 to0Var, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = to0Var.b();
        H0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iH = ho0.H(viewU);
            if (iH >= 0 && iH < iB && j1(iH, no0Var, to0Var) == 0) {
                if (((io0) viewU.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, defpackage.no0 r25, defpackage.to0 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, no0, to0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(no0 no0Var, to0 to0Var, t60 t60Var, s60 s60Var) {
        int i;
        int i2;
        int i3;
        int iD;
        int iG;
        int iE;
        int iD2;
        int iW;
        int iW2;
        ?? r12;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            n1();
        }
        boolean z2 = t60Var.e == 1;
        int iJ1 = this.F;
        if (!z2) {
            iJ1 = j1(t60Var.d, no0Var, to0Var) + k1(t60Var.d, no0Var, to0Var);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = t60Var.d) >= 0 && i4 < to0Var.b() && iJ1 > 0) {
            int i7 = t60Var.d;
            int iK1 = k1(i7, no0Var, to0Var);
            if (iK1 > this.F) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iK1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(ex0.i(sb, this.F, " spans."));
            }
            iJ1 -= iK1;
            if (iJ1 < 0 || (viewB = t60Var.b(no0Var)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            s60Var.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            a00 a00Var = (a00) view.getLayoutParams();
            int iK12 = k1(ho0.H(view), no0Var, to0Var);
            a00Var.f = iK12;
            a00Var.e = i8;
            i8 += iK12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (t60Var.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            l1(view2, iJ, r12);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((a00) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            f1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                l1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                a00 a00Var2 = (a00) view4.getLayoutParams();
                Rect rect2 = a00Var2.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) a00Var2).topMargin + ((ViewGroup.MarginLayoutParams) a00Var2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) a00Var2).leftMargin + ((ViewGroup.MarginLayoutParams) a00Var2).rightMargin;
                int iH1 = h1(a00Var2.e, a00Var2.f);
                if (this.p == 1) {
                    iW2 = ho0.w(false, iH1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) a00Var2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = ho0.w(false, iH1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) a00Var2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (io0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        s60Var.a = i9;
        if (this.p != 1) {
            if (t60Var.f == -1) {
                int i15 = t60Var.b;
                iE = i15 - i9;
                iG = 0;
                iD = i15;
            } else {
                int i16 = t60Var.b;
                iD = i16 + i9;
                iG = 0;
                iE = i16;
            }
            iD2 = iG;
        } else if (t60Var.f == -1) {
            iD2 = t60Var.b;
            iG = iD2 - i9;
            iE = 0;
            iD = 0;
        } else {
            int i17 = t60Var.b;
            iD = 0;
            iG = i17;
            iD2 = i17 + i9;
            iE = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            a00 a00Var3 = (a00) view5.getLayoutParams();
            if (this.p != 1) {
                iG = G() + this.G[a00Var3.e];
                iD2 = this.r.d(view5) + iG;
            } else if (T0()) {
                int iE2 = E() + this.G[this.F - a00Var3.e];
                iD = iE2;
                iE = iE2 - this.r.d(view5);
            } else {
                iE = E() + this.G[a00Var3.e];
                iD = this.r.d(view5) + iE;
            }
            ho0.N(view5, iE, iG, iD, iD2);
            if (a00Var3.a.h() || a00Var3.a.k()) {
                s60Var.c = true;
            }
            s60Var.d = view5.hasFocusable() | s60Var.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // defpackage.ho0
    public final void V(no0 no0Var, to0 to0Var, View view, a1 a1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = a1Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a00)) {
            W(view, a1Var);
            return;
        }
        a00 a00Var = (a00) layoutParams;
        int iI1 = i1(a00Var.a.b(), no0Var, to0Var);
        if (this.p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(a00Var.e, a00Var.f, iI1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iI1, 1, a00Var.e, a00Var.f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(no0 no0Var, to0 to0Var, r60 r60Var, int i) {
        n1();
        if (to0Var.b() > 0 && !to0Var.g) {
            boolean z = i == 1;
            int iJ1 = j1(r60Var.b, no0Var, to0Var);
            if (z) {
                while (iJ1 > 0) {
                    int i2 = r60Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    r60Var.b = i3;
                    iJ1 = j1(i3, no0Var, to0Var);
                }
            } else {
                int iB = to0Var.b() - 1;
                int i4 = r60Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iJ12 = j1(i5, no0Var, to0Var);
                    if (iJ12 <= iJ1) {
                        break;
                    }
                    i4 = i5;
                    iJ1 = iJ12;
                }
                r60Var.b = i4;
            }
        }
        g1();
    }

    @Override // defpackage.ho0
    public final void X(int i, int i2) {
        gw3 gw3Var = this.K;
        gw3Var.r();
        ((SparseIntArray) gw3Var.h).clear();
    }

    @Override // defpackage.ho0
    public final void Y() {
        gw3 gw3Var = this.K;
        gw3Var.r();
        ((SparseIntArray) gw3Var.h).clear();
    }

    @Override // defpackage.ho0
    public final void Z(int i, int i2) {
        gw3 gw3Var = this.K;
        gw3Var.r();
        ((SparseIntArray) gw3Var.h).clear();
    }

    @Override // defpackage.ho0
    public final void a0(int i, int i2) {
        gw3 gw3Var = this.K;
        gw3Var.r();
        ((SparseIntArray) gw3Var.h).clear();
    }

    @Override // defpackage.ho0
    public final void b0(int i, int i2) {
        gw3 gw3Var = this.K;
        gw3Var.r();
        ((SparseIntArray) gw3Var.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final void c0(no0 no0Var, to0 to0Var) {
        boolean z = to0Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                a00 a00Var = (a00) u(i).getLayoutParams();
                int iB = a00Var.a.b();
                sparseIntArray2.put(iB, a00Var.f);
                sparseIntArray.put(iB, a00Var.e);
            }
        }
        super.c0(no0Var, to0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final void d0(to0 to0Var) {
        super.d0(to0Var);
        this.E = false;
    }

    @Override // defpackage.ho0
    public final boolean f(io0 io0Var) {
        return io0Var instanceof a00;
    }

    public final void f1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i, int i2) {
        if (this.p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int i1(int i, no0 no0Var, to0 to0Var) {
        boolean z = to0Var.g;
        gw3 gw3Var = this.K;
        if (!z) {
            int i2 = this.F;
            gw3Var.getClass();
            return gw3.q(i, i2);
        }
        int iB = no0Var.b(i);
        if (iB == -1) {
            return 0;
        }
        int i3 = this.F;
        gw3Var.getClass();
        return gw3.q(iB, i3);
    }

    public final int j1(int i, no0 no0Var, to0 to0Var) {
        boolean z = to0Var.g;
        gw3 gw3Var = this.K;
        if (!z) {
            int i2 = this.F;
            gw3Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = no0Var.b(i);
        if (iB == -1) {
            return 0;
        }
        int i4 = this.F;
        gw3Var.getClass();
        return iB % i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int k(to0 to0Var) {
        return E0(to0Var);
    }

    public final int k1(int i, no0 no0Var, to0 to0Var) {
        boolean z = to0Var.g;
        gw3 gw3Var = this.K;
        if (!z) {
            gw3Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (no0Var.b(i) == -1) {
            return 1;
        }
        gw3Var.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int l(to0 to0Var) {
        return F0(to0Var);
    }

    public final void l1(View view, int i, boolean z) {
        int iW;
        int iW2;
        a00 a00Var = (a00) view.getLayoutParams();
        Rect rect = a00Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) a00Var).topMargin + ((ViewGroup.MarginLayoutParams) a00Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) a00Var).leftMargin + ((ViewGroup.MarginLayoutParams) a00Var).rightMargin;
        int iH1 = h1(a00Var.e, a00Var.f);
        if (this.p == 1) {
            iW2 = ho0.w(false, iH1, i, i3, ((ViewGroup.MarginLayoutParams) a00Var).width);
            iW = ho0.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) a00Var).height);
        } else {
            int iW3 = ho0.w(false, iH1, i, i2, ((ViewGroup.MarginLayoutParams) a00Var).height);
            int iW4 = ho0.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) a00Var).width);
            iW = iW3;
            iW2 = iW4;
        }
        io0 io0Var = (io0) view.getLayoutParams();
        if (z ? x0(view, iW2, iW, io0Var) : v0(view, iW2, iW, io0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(ex0.f("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.K.r();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int n(to0 to0Var) {
        return E0(to0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int n0(int i, no0 no0Var, to0 to0Var) {
        n1();
        g1();
        return super.n0(i, no0Var, to0Var);
    }

    public final void n1() {
        int iD;
        int iG;
        if (this.p == 1) {
            iD = this.n - F();
            iG = E();
        } else {
            iD = this.o - D();
            iG = G();
        }
        f1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int o(to0 to0Var) {
        return F0(to0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final int p0(int i, no0 no0Var, to0 to0Var) {
        n1();
        g1();
        return super.p0(i, no0Var, to0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ho0
    public final io0 r() {
        return this.p == 0 ? new a00(-2, -1) : new a00(-1, -2);
    }

    @Override // defpackage.ho0
    public final io0 s(Context context, AttributeSet attributeSet) {
        a00 a00Var = new a00(context, attributeSet);
        a00Var.e = -1;
        a00Var.f = 0;
        return a00Var;
    }

    @Override // defpackage.ho0
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = e61.a;
            iG2 = ho0.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = ho0.g(i, iArr[iArr.length - 1] + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e61.a;
            iG = ho0.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = ho0.g(i2, iArr2[iArr2.length - 1] + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.ho0
    public final io0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a00 a00Var = new a00((ViewGroup.MarginLayoutParams) layoutParams);
            a00Var.e = -1;
            a00Var.f = 0;
            return a00Var;
        }
        a00 a00Var2 = new a00(layoutParams);
        a00Var2.e = -1;
        a00Var2.f = 0;
        return a00Var2;
    }

    @Override // defpackage.ho0
    public final int x(no0 no0Var, to0 to0Var) {
        if (this.p == 1) {
            return this.F;
        }
        if (to0Var.b() < 1) {
            return 0;
        }
        return i1(to0Var.b() - 1, no0Var, to0Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new gw3(9);
        this.L = new Rect();
        m1(i);
    }
}
