package F0;

import G1.t;
import J0.b;
import J0.j;
import J0.k;
import J0.n;
import J0.q;
import Zg.AbstractC3689v;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: F0.a$a, reason: collision with other inner class name */
    static final class C0233a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0233a f5647a = new C0233a();

        C0233a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List list) {
        List listL;
        long jV;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listL = AbstractC3689v.l();
        } else {
            listL = new ArrayList();
            Object obj = list.get(0);
            int iN = AbstractC3689v.n(list);
            int i10 = 0;
            while (i10 < iN) {
                i10++;
                Object obj2 = list.get(i10);
                n nVar = (n) obj2;
                n nVar2 = (n) obj;
                listL.add(C6531g.d(AbstractC6532h.a(Math.abs(C6531g.m(nVar2.i().i()) - C6531g.m(nVar.i().i())), Math.abs(C6531g.n(nVar2.i().i()) - C6531g.n(nVar.i().i())))));
                obj = obj2;
            }
        }
        if (listL.size() == 1) {
            jV = ((C6531g) AbstractC3689v.q0(listL)).v();
        } else {
            if (listL.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objQ0 = AbstractC3689v.q0(listL);
            int iN2 = AbstractC3689v.n(listL);
            if (1 <= iN2) {
                int i11 = 1;
                while (true) {
                    objQ0 = C6531g.d(C6531g.r(((C6531g) objQ0).v(), ((C6531g) listL.get(i11)).v()));
                    if (i11 == iN2) {
                        break;
                    }
                    i11++;
                }
            }
            jV = ((C6531g) objQ0).v();
        }
        return C6531g.n(jV) < C6531g.m(jV);
    }

    public static final boolean b(n nVar) {
        j jVarN = nVar.n();
        q qVar = q.f9676a;
        return (k.a(jVarN, qVar.a()) == null && k.a(nVar.n(), qVar.z()) == null) ? false : true;
    }

    private static final boolean c(b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(n nVar, t tVar) {
        j jVarN = nVar.n();
        q qVar = q.f9676a;
        b bVar = (b) k.a(jVarN, qVar.a());
        if (bVar != null) {
            tVar.i0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (k.a(nVar.n(), qVar.z()) != null) {
            List listT = nVar.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar2 = (n) listT.get(i10);
                if (nVar2.n().f(q.f9676a.A())) {
                    arrayList.add(nVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        tVar.i0(t.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(n nVar, t tVar) {
        j jVarN = nVar.n();
        q qVar = q.f9676a;
        AbstractC5487d.a(k.a(jVarN, qVar.b()));
        n nVarR = nVar.r();
        if (nVarR == null || k.a(nVarR.n(), qVar.z()) == null) {
            return;
        }
        b bVar = (b) k.a(nVarR.n(), qVar.a());
        if ((bVar == null || !c(bVar)) && nVar.n().f(qVar.A())) {
            ArrayList arrayList = new ArrayList();
            List listT = nVarR.t();
            int size = listT.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                n nVar2 = (n) listT.get(i11);
                if (nVar2.n().f(q.f9676a.A())) {
                    arrayList.add(nVar2);
                    if (nVar2.q().p0() < nVar.q().p0()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            t.f fVarA = t.f.a(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) nVar.n().k(q.f9676a.A(), C0233a.f5647a)).booleanValue());
            if (fVarA != null) {
                tVar.j0(fVarA);
            }
        }
    }

    private static final t.e f(b bVar) {
        return t.e.a(bVar.b(), bVar.a(), false, 0);
    }
}
