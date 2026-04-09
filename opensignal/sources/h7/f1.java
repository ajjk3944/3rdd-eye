package h7;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10058a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10059b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10060c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10061d;

    /* renamed from: e, reason: collision with root package name */
    public int f10062e;

    /* renamed from: f, reason: collision with root package name */
    public int f10063f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f10064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10065h;

    public f1(RecyclerView recyclerView) {
        this.f10065h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f10058a = arrayList;
        this.f10059b = null;
        this.f10060c = new ArrayList();
        this.f10061d = Collections.unmodifiableList(arrayList);
        this.f10062e = 2;
        this.f10063f = 2;
    }

    public final void a(n1 n1Var, boolean z10) {
        RecyclerView.l(n1Var);
        View view = n1Var.f10155a;
        RecyclerView recyclerView = this.f10065h;
        p1 p1Var = recyclerView.K0;
        if (p1Var != null) {
            o1 o1Var = p1Var.f10185e;
            u3.i0.n(view, o1Var != null ? (u3.b) o1Var.f10177e.remove(view) : null);
        }
        if (z10) {
            ArrayList arrayList = recyclerView.K;
            if (arrayList.size() > 0) {
                throw h0.b.e(0, arrayList);
            }
            q0 q0Var = recyclerView.I;
            if (q0Var != null) {
                q0Var.p(n1Var);
            }
            if (recyclerView.D0 != null) {
                recyclerView.B.G(n1Var);
            }
            if (RecyclerView.X0) {
                Objects.toString(n1Var);
            }
        }
        n1Var.f10171s = null;
        n1Var.f10170r = null;
        e1 e1VarC = c();
        e1VarC.getClass();
        int i10 = n1Var.f10160f;
        ArrayList arrayList2 = e1VarC.a(i10).f10032a;
        if (((d1) e1VarC.f10052a.get(i10)).f10033b <= arrayList2.size()) {
            z3.a.a(view);
        } else {
            if (RecyclerView.W0 && arrayList2.contains(n1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            n1Var.m();
            arrayList2.add(n1Var);
        }
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f10065h;
        if (i10 >= 0 && i10 < recyclerView.D0.b()) {
            return !recyclerView.D0.f10107g ? i10 : recyclerView.f2083x.g(i10, 0);
        }
        StringBuilder sbU = h0.b.u("invalid position ", i10, ". State item count is ");
        sbU.append(recyclerView.D0.b());
        sbU.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public final e1 c() {
        if (this.f10064g == null) {
            e1 e1Var = new e1();
            e1Var.f10052a = new SparseArray();
            e1Var.f10053b = 0;
            e1Var.f10054c = Collections.newSetFromMap(new IdentityHashMap());
            this.f10064g = e1Var;
            e();
        }
        return this.f10064g;
    }

    public final View d(int i10) {
        return l(i10, Long.MAX_VALUE).f10155a;
    }

    public final void e() {
        RecyclerView recyclerView;
        q0 q0Var;
        e1 e1Var = this.f10064g;
        if (e1Var == null || (q0Var = (recyclerView = this.f10065h).I) == null || !recyclerView.O) {
            return;
        }
        e1Var.f10054c.add(q0Var);
    }

    public final void f(q0 q0Var, boolean z10) {
        e1 e1Var = this.f10064g;
        if (e1Var != null) {
            SparseArray sparseArray = e1Var.f10052a;
            Set set = e1Var.f10054c;
            set.remove(q0Var);
            if (set.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ArrayList arrayList = ((d1) sparseArray.get(sparseArray.keyAt(i10))).f10032a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    z3.a.a(((n1) arrayList.get(i11)).f10155a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f10060c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.f2052c1) {
            androidx.datastore.preferences.protobuf.l lVar = this.f10065h.C0;
            int[] iArr = (int[]) lVar.f1314d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lVar.f1313c = 0;
        }
    }

    public final void h(int i10) {
        boolean z10 = RecyclerView.W0;
        ArrayList arrayList = this.f10060c;
        n1 n1Var = (n1) arrayList.get(i10);
        if (RecyclerView.X0) {
            Objects.toString(n1Var);
        }
        a(n1Var, true);
        arrayList.remove(i10);
    }

    public final void i(View view) {
        n1 n1VarM = RecyclerView.M(view);
        boolean zJ = n1VarM.j();
        RecyclerView recyclerView = this.f10065h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (n1VarM.i()) {
            n1VarM.f10166n.m(n1VarM);
        } else if (n1VarM.p()) {
            n1VarM.j &= -33;
        }
        j(n1VarM);
        if (recyclerView.f2070l0 == null || n1VarM.g()) {
            return;
        }
        recyclerView.f2070l0.d(n1VarM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(h7.n1 r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.f1.j(h7.n1):void");
    }

    public final void k(View view) {
        v0 v0Var;
        n1 n1VarM = RecyclerView.M(view);
        int i10 = n1VarM.j & 12;
        RecyclerView recyclerView = this.f10065h;
        if (i10 == 0 && n1VarM.k() && (v0Var = recyclerView.f2070l0) != null) {
            n nVar = (n) v0Var;
            if (n1VarM.c().isEmpty() && nVar.f10143g && !n1VarM.f()) {
                if (this.f10059b == null) {
                    this.f10059b = new ArrayList();
                }
                n1VarM.f10166n = this;
                n1VarM.f10167o = true;
                this.f10059b.add(n1VarM);
                return;
            }
        }
        if (n1VarM.f() && !n1VarM.h() && !recyclerView.I.f10190b) {
            throw new IllegalArgumentException(h0.b.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        n1VarM.f10166n = this;
        n1VarM.f10167o = false;
        this.f10058a.add(n1VarM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h7.n1 l(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.f1.l(int, long):h7.n1");
    }

    public final void m(n1 n1Var) {
        if (n1Var.f10167o) {
            this.f10059b.remove(n1Var);
        } else {
            this.f10058a.remove(n1Var);
        }
        n1Var.f10166n = null;
        n1Var.f10167o = false;
        n1Var.j &= -33;
    }

    public final void n() {
        y0 y0Var = this.f10065h.J;
        this.f10063f = this.f10062e + (y0Var != null ? y0Var.j : 0);
        ArrayList arrayList = this.f10060c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f10063f; size--) {
            h(size);
        }
    }
}
