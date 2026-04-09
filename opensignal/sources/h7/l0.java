package h7;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l0 extends a1 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f10125a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f10126b = new q1(this);

    /* renamed from: c, reason: collision with root package name */
    public i0 f10127c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f10128d;

    public static int c(View view, j0 j0Var) {
        return ((j0Var.c(view) / 2) + j0Var.e(view)) - ((j0Var.l() / 2) + j0Var.k());
    }

    public static View d(y0 y0Var, j0 j0Var) {
        int iV = y0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (j0Var.l() / 2) + j0Var.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = y0Var.u(i11);
            int iAbs = Math.abs(((j0Var.c(viewU) / 2) + j0Var.e(viewU)) - iL);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10125a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        q1 q1Var = this.f10126b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.F0;
            if (arrayList != null) {
                arrayList.remove(q1Var);
            }
            this.f10125a.setOnFlingListener(null);
        }
        this.f10125a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f10125a.j(q1Var);
            this.f10125a.setOnFlingListener(this);
            new Scroller(this.f10125a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(y0 y0Var, View view) {
        int[] iArr = new int[2];
        if (y0Var.d()) {
            iArr[0] = c(view, f(y0Var));
        } else {
            iArr[0] = 0;
        }
        if (y0Var.e()) {
            iArr[1] = c(view, g(y0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(y0 y0Var) {
        if (y0Var.e()) {
            return d(y0Var, g(y0Var));
        }
        if (y0Var.d()) {
            return d(y0Var, f(y0Var));
        }
        return null;
    }

    public final j0 f(y0 y0Var) {
        i0 i0Var = this.f10128d;
        if (i0Var == null || ((y0) i0Var.f10099b) != y0Var) {
            this.f10128d = new i0(y0Var, 0);
        }
        return this.f10128d;
    }

    public final j0 g(y0 y0Var) {
        i0 i0Var = this.f10127c;
        if (i0Var == null || ((y0) i0Var.f10099b) != y0Var) {
            this.f10127c = new i0(y0Var, 1);
        }
        return this.f10127c;
    }

    public final void h() {
        y0 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f10125a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i10 = iArrB[0];
        if (i10 == 0 && iArrB[1] == 0) {
            return;
        }
        this.f10125a.k0(i10, false, iArrB[1]);
    }
}
