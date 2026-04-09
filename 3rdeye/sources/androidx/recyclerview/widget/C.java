package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class C extends G {

    /* renamed from: c, reason: collision with root package name */
    public z f16368c;

    /* renamed from: d, reason: collision with root package name */
    public y f16369d;

    public static int f(View view, A a10) {
        return ((a10.c(view) / 2) + a10.e(view)) - ((a10.l() / 2) + a10.k());
    }

    public static View g(RecyclerView.p pVar, A a10) {
        int iO = pVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iL = (a10.l() / 2) + a10.k();
        int i = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = pVar.N(i10);
            int iAbs = Math.abs(((a10.c(viewN) / 2) + a10.e(viewN)) - iL);
            if (iAbs < i) {
                view = viewN;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.G
    public int[] b(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.v()) {
            iArr[0] = f(view, h(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.w()) {
            iArr[1] = f(view, i(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.G
    @SuppressLint({"UnknownNullness"})
    public View c(RecyclerView.p pVar) {
        if (pVar.w()) {
            return g(pVar, i(pVar));
        }
        if (pVar.v()) {
            return g(pVar, h(pVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.G
    @SuppressLint({"UnknownNullness"})
    public int d(RecyclerView.p pVar, int i, int i10) {
        PointF pointFF;
        int iV = pVar.V();
        if (iV != 0) {
            View view = null;
            A aI = pVar.w() ? i(pVar) : pVar.v() ? h(pVar) : null;
            if (aI != null) {
                int iO = pVar.O();
                boolean z10 = false;
                int i11 = Integer.MAX_VALUE;
                int i12 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i13 = 0; i13 < iO; i13++) {
                    View viewN = pVar.N(i13);
                    if (viewN != null) {
                        int iF = f(viewN, aI);
                        if (iF <= 0 && iF > i12) {
                            view2 = viewN;
                            i12 = iF;
                        }
                        if (iF >= 0 && iF < i11) {
                            view = viewN;
                            i11 = iF;
                        }
                    }
                }
                boolean z11 = !pVar.v() ? i10 <= 0 : i <= 0;
                if (z11 && view != null) {
                    return RecyclerView.p.b0(view);
                }
                if (!z11 && view2 != null) {
                    return RecyclerView.p.b0(view2);
                }
                if (z11) {
                    view = view2;
                }
                if (view != null) {
                    int iB0 = RecyclerView.p.b0(view);
                    int iV2 = pVar.V();
                    if ((pVar instanceof RecyclerView.A.b) && (pointFF = ((RecyclerView.A.b) pVar).f(iV2 - 1)) != null && (pointFF.x < 0.0f || pointFF.y < 0.0f)) {
                        z10 = true;
                    }
                    int i14 = iB0 + (z10 == z11 ? -1 : 1);
                    if (i14 >= 0 && i14 < iV) {
                        return i14;
                    }
                }
            }
        }
        return -1;
    }

    public final A h(RecyclerView.p pVar) {
        y yVar = this.f16369d;
        if (yVar == null || yVar.f16364a != pVar) {
            this.f16369d = new y(pVar);
        }
        return this.f16369d;
    }

    public final A i(RecyclerView.p pVar) {
        z zVar = this.f16368c;
        if (zVar == null || zVar.f16364a != pVar) {
            this.f16368c = new z(pVar);
        }
        return this.f16368c;
    }
}
