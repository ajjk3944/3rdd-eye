package androidx.recyclerview.widget;

import L0.S;
import M0.g;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import g0.C4356c;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f16385E;

    /* renamed from: F, reason: collision with root package name */
    public int f16386F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f16387G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f16388H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f16389I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f16390J;

    /* renamed from: K, reason: collision with root package name */
    public final a f16391K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f16392L;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        public int f16393e;

        /* renamed from: f, reason: collision with root package name */
        public int f16394f;

        public b(int i, int i10) {
            super(i, i10);
            this.f16393e = -1;
            this.f16394f = 0;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f16395a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f16396b = new SparseIntArray();

        public static int a(int i, int i10) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i; i13++) {
                i11++;
                if (i11 == i10) {
                    i12++;
                    i11 = 0;
                } else if (i11 > i10) {
                    i12++;
                    i11 = 1;
                }
            }
            return i11 + 1 > i10 ? i12 + 1 : i12;
        }

        public final void b() {
            this.f16395a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        this.f16385E = false;
        this.f16386F = -1;
        this.f16389I = new SparseIntArray();
        this.f16390J = new SparseIntArray();
        this.f16391K = new a();
        this.f16392L = new Rect();
        K1(RecyclerView.p.c0(context, attributeSet, i, i10).f16515b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int C(RecyclerView.B b10) {
        return b1(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int D(RecyclerView.B b10) {
        return c1(b10);
    }

    public final void D1(int i) {
        int i10;
        int[] iArr = this.f16387G;
        int i11 = this.f16386F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i / i11;
        int i14 = i % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f16387G = iArr;
    }

    public final void E1() {
        View[] viewArr = this.f16388H;
        if (viewArr == null || viewArr.length != this.f16386F) {
            this.f16388H = new View[this.f16386F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int F(RecyclerView.B b10) {
        return b1(b10);
    }

    public final int F1(int i, int i10) {
        if (this.f16414p != 1 || !r1()) {
            int[] iArr = this.f16387G;
            return iArr[i10 + i] - iArr[i];
        }
        int[] iArr2 = this.f16387G;
        int i11 = this.f16386F;
        return iArr2[i11 - i] - iArr2[(i11 - i) - i10];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int G(RecyclerView.B b10) {
        return c1(b10);
    }

    public final int G1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10 = b10.f16469g;
        a aVar = this.f16391K;
        if (!z10) {
            int i10 = this.f16386F;
            aVar.getClass();
            return c.a(i, i10);
        }
        int iB = wVar.b(i);
        if (iB != -1) {
            int i11 = this.f16386F;
            aVar.getClass();
            return c.a(iB, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int H1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10 = b10.f16469g;
        a aVar = this.f16391K;
        if (!z10) {
            int i10 = this.f16386F;
            aVar.getClass();
            return i % i10;
        }
        int i11 = this.f16390J.get(i, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = wVar.b(i);
        if (iB != -1) {
            int i12 = this.f16386F;
            aVar.getClass();
            return iB % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int I1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10 = b10.f16469g;
        a aVar = this.f16391K;
        if (!z10) {
            aVar.getClass();
            return 1;
        }
        int i10 = this.f16389I.get(i, -1);
        if (i10 != -1) {
            return i10;
        }
        if (wVar.b(i) != -1) {
            aVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void J1(View view, int i, boolean z10) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f16519b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iF1 = F1(bVar.f16393e, bVar.f16394f);
        if (this.f16414p == 1) {
            iP2 = RecyclerView.p.P(false, iF1, i, i11, ((ViewGroup.MarginLayoutParams) bVar).width);
            iP = RecyclerView.p.P(true, this.f16416r.l(), this.f16509m, i10, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iP3 = RecyclerView.p.P(false, iF1, i, i10, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iP4 = RecyclerView.p.P(true, this.f16416r.l(), this.f16508l, i11, ((ViewGroup.MarginLayoutParams) bVar).width);
            iP = iP3;
            iP2 = iP4;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? U0(view, iP2, iP, qVar) : S0(view, iP2, iP, qVar)) {
            view.measure(iP2, iP);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q K() {
        return this.f16414p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int K0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        L1();
        E1();
        return super.K0(i, wVar, b10);
    }

    public final void K1(int i) {
        if (i == this.f16386F) {
            return;
        }
        this.f16385E = true;
        if (i < 1) {
            throw new IllegalArgumentException(C4356c.h(i, "Span count should be at least 1. Provided "));
        }
        this.f16386F = i;
        this.f16391K.b();
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q L(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f16393e = -1;
        bVar.f16394f = 0;
        return bVar;
    }

    public final void L1() {
        int iX;
        int iA0;
        if (this.f16414p == 1) {
            iX = this.f16510n - Z();
            iA0 = Y();
        } else {
            iX = this.f16511o - X();
            iA0 = a0();
        }
        D1(iX - iA0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f16393e = -1;
            bVar.f16394f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f16393e = -1;
        bVar2.f16394f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final int M0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        L1();
        E1();
        return super.M0(i, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void P0(Rect rect, int i, int i10) {
        int iY;
        int iY2;
        if (this.f16387G == null) {
            super.P0(rect, i, i10);
        }
        int iZ = Z() + Y();
        int iX = X() + a0();
        if (this.f16414p == 1) {
            int iHeight = rect.height() + iX;
            RecyclerView recyclerView = this.f16499b;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            iY2 = RecyclerView.p.y(i10, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f16387G;
            iY = RecyclerView.p.y(i, iArr[iArr.length - 1] + iZ, this.f16499b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iZ;
            RecyclerView recyclerView2 = this.f16499b;
            WeakHashMap<View, S> weakHashMap2 = L0.I.f3792a;
            iY = RecyclerView.p.y(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f16387G;
            iY2 = RecyclerView.p.y(i10, iArr2[iArr2.length - 1] + iX, this.f16499b.getMinimumHeight());
        }
        this.f16499b.setMeasuredDimension(iY, iY2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int R(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f16414p == 1) {
            return this.f16386F;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return G1(b10.b() - 1, wVar, b10) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final boolean X0() {
        return this.f16424z == null && !this.f16385E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(RecyclerView.B b10, LinearLayoutManager.c cVar, s.b bVar) {
        int i;
        int i10 = this.f16386F;
        for (int i11 = 0; i11 < this.f16386F && (i = cVar.f16437d) >= 0 && i < b10.b() && i10 > 0; i11++) {
            bVar.a(cVar.f16437d, Math.max(0, cVar.f16440g));
            this.f16391K.getClass();
            i10--;
            cVar.f16437d += cVar.f16438e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int d0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f16414p == 0) {
            return this.f16386F;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return G1(b10.b() - 1, wVar, b10) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View m1(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i;
        int iO;
        int iO2 = O();
        int i10 = 1;
        if (z11) {
            iO = O() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = iO2;
            iO = 0;
        }
        int iB = b10.b();
        e1();
        int iK = this.f16416r.k();
        int iG = this.f16416r.g();
        View view = null;
        View view2 = null;
        while (iO != i) {
            View viewN = N(iO);
            int iB0 = RecyclerView.p.b0(viewN);
            if (iB0 >= 0 && iB0 < iB && H1(iB0, wVar, b10) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).f16518a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f16416r.e(viewN) < iG && this.f16416r.b(viewN) >= iK) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i10;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View o0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.w r25, androidx.recyclerview.widget.RecyclerView.B r26) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void q0(RecyclerView.w wVar, RecyclerView.B b10, M0.g gVar) {
        super.q0(wVar, b10, gVar);
        gVar.j(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void s0(RecyclerView.w wVar, RecyclerView.B b10, View view, M0.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            r0(view, gVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iG1 = G1(bVar.f16518a.getLayoutPosition(), wVar, b10);
        if (this.f16414p == 0) {
            gVar.k(g.e.a(false, bVar.f16393e, bVar.f16394f, iG1, 1));
        } else {
            gVar.k(g.e.a(false, iG1, 1, bVar.f16393e, bVar.f16394f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void s1(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i10;
        int i11;
        int iD;
        int iY;
        int iA0;
        int iD2;
        int iP;
        int iP2;
        boolean z10;
        int i12;
        View viewB;
        int iJ = this.f16416r.j();
        boolean z11 = iJ != 1073741824;
        int i13 = O() > 0 ? this.f16387G[this.f16386F] : 0;
        if (z11) {
            L1();
        }
        boolean z12 = cVar.f16438e == 1;
        int iH1 = this.f16386F;
        if (!z12) {
            iH1 = H1(cVar.f16437d, wVar, b10) + I1(cVar.f16437d, wVar, b10);
        }
        int i14 = 0;
        while (i14 < this.f16386F && (i12 = cVar.f16437d) >= 0 && i12 < b10.b() && iH1 > 0) {
            int i15 = cVar.f16437d;
            int iI1 = I1(i15, wVar, b10);
            if (iI1 > this.f16386F) {
                throw new IllegalArgumentException(B4.i.j(androidx.work.s.i("Item at position ", i15, " requires ", iI1, " spans but GridLayoutManager has only "), this.f16386F, " spans."));
            }
            iH1 -= iI1;
            if (iH1 < 0 || (viewB = cVar.b(wVar)) == null) {
                break;
            }
            this.f16388H[i14] = viewB;
            i14++;
        }
        if (i14 == 0) {
            bVar.f16431b = true;
            return;
        }
        if (z12) {
            i11 = 1;
            i10 = i14;
            i = 0;
        } else {
            i = i14 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i16 = 0;
        while (i != i10) {
            View view = this.f16388H[i];
            b bVar2 = (b) view.getLayoutParams();
            int iI12 = I1(RecyclerView.p.b0(view), wVar, b10);
            bVar2.f16394f = iI12;
            bVar2.f16393e = i16;
            i16 += iI12;
            i += i11;
        }
        float f10 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.f16388H[i18];
            if (cVar.f16443k != null) {
                z10 = false;
                if (z12) {
                    s(view2, -1, true);
                } else {
                    s(view2, 0, true);
                }
            } else if (z12) {
                z10 = false;
                s(view2, -1, false);
            } else {
                z10 = false;
                s(view2, 0, false);
            }
            u(view2, this.f16392L);
            J1(view2, iJ, z10);
            int iC = this.f16416r.c(view2);
            if (iC > i17) {
                i17 = iC;
            }
            float fD = (this.f16416r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f16394f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z11) {
            D1(Math.max(Math.round(f10 * this.f16386F), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.f16388H[i19];
                J1(view3, 1073741824, true);
                int iC2 = this.f16416r.c(view3);
                if (iC2 > i17) {
                    i17 = iC2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.f16388H[i20];
            if (this.f16416r.c(view4) != i17) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f16519b;
                int i21 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i22 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iF1 = F1(bVar3.f16393e, bVar3.f16394f);
                if (this.f16414p == 1) {
                    iP2 = RecyclerView.p.P(false, iF1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iP = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    iP = RecyclerView.p.P(false, iF1, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iP2 = iMakeMeasureSpec;
                }
                if (U0(view4, iP2, iP, (RecyclerView.q) view4.getLayoutParams())) {
                    view4.measure(iP2, iP);
                }
            }
        }
        bVar.f16430a = i17;
        if (this.f16414p != 1) {
            if (cVar.f16439f == -1) {
                int i23 = cVar.f16435b;
                iY = i23 - i17;
                iD = i23;
            } else {
                int i24 = cVar.f16435b;
                iD = i24 + i17;
                iY = i24;
            }
            iA0 = 0;
            iD2 = 0;
        } else if (cVar.f16439f == -1) {
            iD2 = cVar.f16435b;
            iA0 = iD2 - i17;
            iY = 0;
            iD = 0;
        } else {
            int i25 = cVar.f16435b;
            iA0 = i25;
            iD = 0;
            iD2 = i25 + i17;
            iY = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.f16388H[i26];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f16414p != 1) {
                iA0 = a0() + this.f16387G[bVar4.f16393e];
                iD2 = this.f16416r.d(view5) + iA0;
            } else if (r1()) {
                iD = this.f16387G[this.f16386F - bVar4.f16393e] + Y();
                iY = iD - this.f16416r.d(view5);
            } else {
                iY = Y() + this.f16387G[bVar4.f16393e];
                iD = this.f16416r.d(view5) + iY;
            }
            int i27 = iD;
            int i28 = iY;
            int i29 = iD2;
            h0(view5, i28, iA0, i27, i29);
            iY = i28;
            iD = i27;
            iD2 = i29;
            if (bVar4.f16518a.isRemoved() || bVar4.f16518a.isUpdated()) {
                bVar.f16432c = true;
            }
            bVar.f16433d = view5.hasFocusable() | bVar.f16433d;
        }
        Arrays.fill(this.f16388H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void t0(int i, int i10) {
        a aVar = this.f16391K;
        aVar.b();
        aVar.f16396b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void t1(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i) {
        L1();
        if (b10.b() > 0 && !b10.f16469g) {
            boolean z10 = i == 1;
            int iH1 = H1(aVar.f16426b, wVar, b10);
            if (z10) {
                while (iH1 > 0) {
                    int i10 = aVar.f16426b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    aVar.f16426b = i11;
                    iH1 = H1(i11, wVar, b10);
                }
            } else {
                int iB = b10.b() - 1;
                int i12 = aVar.f16426b;
                while (i12 < iB) {
                    int i13 = i12 + 1;
                    int iH12 = H1(i13, wVar, b10);
                    if (iH12 <= iH1) {
                        break;
                    }
                    i12 = i13;
                    iH1 = iH12;
                }
                aVar.f16426b = i12;
            }
        }
        E1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void u0() {
        a aVar = this.f16391K;
        aVar.b();
        aVar.f16396b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void v0(int i, int i10) {
        a aVar = this.f16391K;
        aVar.b();
        aVar.f16396b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void w0(int i, int i10) {
        a aVar = this.f16391K;
        aVar.b();
        aVar.f16396b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean x(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void x0(int i, int i10) {
        a aVar = this.f16391K;
        aVar.b();
        aVar.f16396b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void y0(RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10 = b10.f16469g;
        SparseIntArray sparseIntArray = this.f16390J;
        SparseIntArray sparseIntArray2 = this.f16389I;
        if (z10) {
            int iO = O();
            for (int i = 0; i < iO; i++) {
                b bVar = (b) N(i).getLayoutParams();
                int layoutPosition = bVar.f16518a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.f16394f);
                sparseIntArray.put(layoutPosition, bVar.f16393e);
            }
        }
        super.y0(wVar, b10);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public final void z0(RecyclerView.B b10) {
        super.z0(b10);
        this.f16385E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.z1(false);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f16385E = false;
        this.f16386F = -1;
        this.f16389I = new SparseIntArray();
        this.f16390J = new SparseIntArray();
        this.f16391K = new a();
        this.f16392L = new Rect();
        K1(i);
    }
}
