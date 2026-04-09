package v0;

import ar.m;
import ar.n;
import ar.o;
import ar.p;
import ar.q;
import ar.r;
import ar.s;
import ar.t;
import ar.u;
import br.b0;
import java.util.ArrayList;
import n0.k1;
import n0.w;
import n0.x;

/* loaded from: classes.dex */
public final class d implements n, o, p, q, r, s, t, u, ar.b, ar.c, ar.d, ar.e, ar.f, ar.g, ar.h, ar.i, ar.j, ar.l, m {

    /* renamed from: a, reason: collision with root package name */
    public final int f23736a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23737d;

    /* renamed from: g, reason: collision with root package name */
    public Object f23738g;

    /* renamed from: r, reason: collision with root package name */
    public k1 f23739r;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f23740x;

    public d(Object obj, int i10, boolean z10) {
        this.f23736a = i10;
        this.f23737d = z10;
        this.f23738g = obj;
    }

    public final Object e(int i10, n0.p pVar) {
        pVar.T(this.f23736a);
        j(pVar);
        int iA = i10 | (pVar.e(this) ? i.a(2, 0) : i.a(1, 0));
        Object obj = this.f23738g;
        br.l.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.c(2, obj);
        Object objW = ((n) obj).w(pVar, Integer.valueOf(iA));
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new c(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objW;
    }

    public final Object g(final Object obj, final Object obj2, n0.p pVar, final int i10) {
        pVar.T(this.f23736a);
        j(pVar);
        int iA = pVar.e(this) ? i.a(2, 2) : i.a(1, 2);
        Object obj3 = this.f23738g;
        br.l.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.c(4, obj3);
        Object objL = ((p) obj3).l(obj, obj2, pVar, Integer.valueOf(iA | i10));
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new n() { // from class: v0.b
                @Override // ar.n
                public final Object w(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int iM = w.m(i10) | 1;
                    this.f23732a.g(obj, obj2, (n0.p) obj4, iM);
                    return lq.b0.f15562a;
                }
            };
        }
        return objL;
    }

    @Override // ar.o
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3) {
        return i(obj, (n0.p) obj2, ((Number) obj3).intValue());
    }

    public final Object i(Object obj, n0.p pVar, int i10) {
        pVar.T(this.f23736a);
        j(pVar);
        int iA = pVar.e(this) ? i.a(2, 1) : i.a(1, 1);
        Object obj2 = this.f23738g;
        br.l.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        b0.c(3, obj2);
        Object objH = ((o) obj2).h(obj, pVar, Integer.valueOf(iA | i10));
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new x(this, obj, i10, 2);
        }
        return objH;
    }

    public final void j(n0.p pVar) {
        k1 k1VarU;
        if (!this.f23737d || (k1VarU = pVar.u()) == null) {
            return;
        }
        pVar.getClass();
        k1VarU.f17205b |= 1;
        if (i.e(this.f23739r, k1VarU)) {
            this.f23739r = k1VarU;
            return;
        }
        ArrayList arrayList = this.f23740x;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f23740x = arrayList2;
            arrayList2.add(k1VarU);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i.e((k1) arrayList.get(i10), k1VarU)) {
                arrayList.set(i10, k1VarU);
                return;
            }
        }
        arrayList.add(k1VarU);
    }

    @Override // ar.p
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (n0.p) obj3, ((Number) obj4).intValue());
    }

    @Override // ar.n
    public final /* bridge */ /* synthetic */ Object w(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (n0.p) obj);
    }
}
