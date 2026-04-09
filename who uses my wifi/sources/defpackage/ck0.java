package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ck0 extends jo0 {
    public RecyclerView a;
    public final bx0 b = new bx0(this);
    public vj0 c;
    public vj0 d;

    public static int b(View view, nr nrVar) {
        return ((nrVar.c(view) / 2) + nrVar.e(view)) - ((nrVar.l() / 2) + nrVar.k());
    }

    public static View c(ho0 ho0Var, nr nrVar) {
        int iV = ho0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (nrVar.l() / 2) + nrVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = ho0Var.u(i2);
            int iAbs = Math.abs(((nrVar.c(viewU) / 2) + nrVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] a(ho0 ho0Var, View view) {
        int[] iArr = new int[2];
        if (ho0Var.d()) {
            iArr[0] = b(view, d(ho0Var));
        } else {
            iArr[0] = 0;
        }
        if (ho0Var.e()) {
            iArr[1] = b(view, e(ho0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final nr d(ho0 ho0Var) {
        vj0 vj0Var = this.d;
        if (vj0Var == null || ((ho0) vj0Var.b) != ho0Var) {
            this.d = new vj0(ho0Var, 0);
        }
        return this.d;
    }

    public final nr e(ho0 ho0Var) {
        vj0 vj0Var = this.c;
        if (vj0Var == null || ((ho0) vj0Var.b) != ho0Var) {
            this.c = new vj0(ho0Var, 1);
        }
        return this.c;
    }

    public final void f() {
        ho0 layoutManager;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewC = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.a.b0(i, iArrA[1], false);
    }
}
