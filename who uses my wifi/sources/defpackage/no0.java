package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class no0 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public mo0 g;
    public final /* synthetic */ RecyclerView h;

    public no0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(wo0 wo0Var, boolean z) {
        RecyclerView.j(wo0Var);
        View view = wo0Var.a;
        RecyclerView recyclerView = this.h;
        yo0 yo0Var = recyclerView.r0;
        if (yo0Var != null) {
            p0 p0VarJ = yo0Var.j();
            e61.l(view, p0VarJ instanceof xo0 ? (p0) ((xo0) p0VarJ).e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.k0 != null) {
                recyclerView.k.B(wo0Var);
            }
        }
        wo0Var.s = null;
        wo0Var.r = null;
        mo0 mo0VarC = c();
        mo0VarC.getClass();
        int i = wo0Var.f;
        ArrayList arrayList2 = mo0VarC.a(i).a;
        if (((lo0) mo0VarC.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        wo0Var.m();
        arrayList2.add(wo0Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.k0.b()) {
            return !recyclerView.k0.g ? i : recyclerView.i.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.k0.b() + recyclerView.y());
    }

    public final mo0 c() {
        if (this.g == null) {
            mo0 mo0Var = new mo0();
            mo0Var.a = new SparseArray();
            mo0Var.b = 0;
            this.g = mo0Var;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        ef efVar = this.h.j0;
        int[] iArr2 = efVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        efVar.d = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((wo0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        wo0 wo0VarI = RecyclerView.I(view);
        boolean zJ = wo0VarI.j();
        RecyclerView recyclerView = this.h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (wo0VarI.i()) {
            wo0VarI.n.k(wo0VarI);
        } else if (wo0VarI.p()) {
            wo0VarI.j &= -33;
        }
        h(wo0VarI);
        if (recyclerView.P == null || wo0VarI.g()) {
            return;
        }
        recyclerView.P.d(wo0VarI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.wo0 r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.h(wo0):void");
    }

    public final void i(View view) {
        eo0 eo0Var;
        wo0 wo0VarI = RecyclerView.I(view);
        int i = wo0VarI.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && wo0VarI.k() && (eo0Var = recyclerView.P) != null) {
            ln lnVar = (ln) eo0Var;
            if (wo0VarI.c().isEmpty() && lnVar.g && !wo0VarI.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                wo0VarI.n = this;
                wo0VarI.o = true;
                this.b.add(wo0VarI);
                return;
            }
        }
        if (wo0VarI.f() && !wo0VarI.h() && !recyclerView.q.g) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        wo0VarI.n = this;
        wo0VarI.o = false;
        this.a.add(wo0VarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x055b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wo0 j(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.j(int, long):wo0");
    }

    public final void k(wo0 wo0Var) {
        if (wo0Var.o) {
            this.b.remove(wo0Var);
        } else {
            this.a.remove(wo0Var);
        }
        wo0Var.n = null;
        wo0Var.o = false;
        wo0Var.j &= -33;
    }

    public final void l() {
        ho0 ho0Var = this.h.r;
        this.f = this.e + (ho0Var != null ? ho0Var.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
