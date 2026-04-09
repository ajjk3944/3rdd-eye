package v0;

import ar.n;
import br.b0;
import java.util.ArrayList;
import n0.k1;
import n0.p;
import n0.v;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f23749a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final j f23750b = new j(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(p pVar, n nVar) {
        br.l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        b0.c(2, nVar);
        nVar.w(pVar, 1);
    }

    public static final d d(int i10, lq.e eVar, p pVar) {
        Object objI = pVar.I();
        if (objI == n0.j.f17190a) {
            objI = new d(eVar, i10, true);
            pVar.b0(objI);
        }
        d dVar = (d) objI;
        if (!br.l.a(dVar.f23738g, eVar)) {
            boolean z10 = dVar.f23738g == null;
            dVar.f23738g = eVar;
            if (!z10 && dVar.f23737d) {
                k1 k1Var = dVar.f23739r;
                if (k1Var != null) {
                    v vVar = k1Var.f17204a;
                    if (vVar != null) {
                        vVar.n(k1Var, null);
                    }
                    dVar.f23739r = null;
                }
                ArrayList arrayList = dVar.f23740x;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        k1 k1Var2 = (k1) arrayList.get(i11);
                        v vVar2 = k1Var2.f17204a;
                        if (vVar2 != null) {
                            vVar2.n(k1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return dVar;
    }

    public static final boolean e(k1 k1Var, k1 k1Var2) {
        if (k1Var == null) {
            return true;
        }
        if (k1Var instanceof k1) {
            return !k1Var.b() || k1Var.equals(k1Var2) || br.l.a(k1Var.f17206c, k1Var2.f17206c);
        }
        return false;
    }
}
