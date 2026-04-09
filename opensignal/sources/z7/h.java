package z7;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import h7.f1;
import h7.j1;
import h7.y0;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public h(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(j1 j1Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.D0(j1Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // h7.y0
    public final void V(f1 f1Var, j1 j1Var, v3.c cVar) {
        super.V(f1Var, j1Var, cVar);
        this.E.O.getClass();
    }

    @Override // h7.y0
    public final void X(f1 f1Var, j1 j1Var, View view, v3.c cVar) {
        int iH;
        int iH2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.O.f13797d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f2155y.getClass();
            iH = y0.H(view);
        } else {
            iH = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f2155y.getClass();
            iH2 = y0.H(view);
        } else {
            iH2 = 0;
        }
        cVar.k(g.a.a(false, iH, 1, iH2, 1));
    }

    @Override // h7.y0
    public final boolean i0(f1 f1Var, j1 j1Var, int i10, Bundle bundle) {
        this.E.O.getClass();
        return super.i0(f1Var, j1Var, i10, bundle);
    }

    @Override // h7.y0
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }
}
