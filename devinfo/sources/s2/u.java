package s2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33425a;

    public /* synthetic */ u(int i4) {
        this.f33425a = i4;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33425a) {
            case 0:
                f1.b bVar = (f1.b) obj;
                List list = ((y2.c) obj2).f37320a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(y.a((y2.b) list.get(i4), y.f33453z, bVar));
                }
                break;
            case 1:
                break;
            case 2:
                f1.b bVar2 = (f1.b) obj;
                c3.i iVar = (c3.i) obj2;
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                f1.b bVar3 = (f1.b) obj;
                p pVar = (p) obj2;
                Object objA = y.a(new c3.k(pVar.f33411a), y.f33444q, bVar3);
                Object objA2 = y.a(new c3.m(pVar.f33412b), y.f33445r, bVar3);
                Object objA3 = y.a(new d3.n(pVar.f33413c), y.f33449v, bVar3);
                c3.q qVar = pVar.f33414d;
                c3.q qVar2 = c3.q.f2731c;
                Object objA4 = y.a(qVar, y.f33439l, bVar3);
                Object objA5 = y.a(pVar.f33415e, z.f33454a, bVar3);
                c3.i iVar2 = pVar.f33416f;
                c3.i iVar3 = c3.i.f2715d;
                break;
            case 8:
                break;
            case 9:
                f1.b bVar4 = (f1.b) obj;
                a0 a0Var = (a0) obj2;
                p1.s sVar = new p1.s(a0Var.f33333a.b());
                x xVar = y.f33443p;
                Object objA6 = y.a(sVar, xVar, bVar4);
                d3.n nVar = new d3.n(a0Var.f33334b);
                x xVar2 = y.f33449v;
                Object objA7 = y.a(nVar, xVar2, bVar4);
                v2.k kVar = a0Var.f33335c;
                v2.k kVar2 = v2.k.f35776b;
                Object objA8 = y.a(kVar, y.f33440m, bVar4);
                Object objA9 = y.a(a0Var.f33336d, y.f33447t, bVar4);
                Object objA10 = y.a(a0Var.f33337e, y.f33448u, bVar4);
                String str = a0Var.g;
                Object objA11 = y.a(new d3.n(a0Var.f33339h), xVar2, bVar4);
                Object objA12 = y.a(a0Var.f33340i, y.f33441n, bVar4);
                Object objA13 = y.a(a0Var.j, y.f33438k, bVar4);
                y2.c cVar = a0Var.f33341k;
                y2.c cVar2 = y2.c.f37319c;
                Object objA14 = y.a(cVar, y.f33452y, bVar4);
                Object objA15 = y.a(new p1.s(a0Var.f33342l), xVar, bVar4);
                Object objA16 = y.a(a0Var.f33343m, y.j, bVar4);
                p1.i0 i0Var = a0Var.f33344n;
                p1.i0 i0Var2 = p1.i0.f30982d;
                break;
            case 10:
                f1.b bVar5 = (f1.b) obj;
                f0 f0Var = (f0) obj2;
                a0 a0Var2 = f0Var.f33375a;
                yb.i iVar4 = y.f33436h;
                break;
            case 11:
                r rVar = (r) obj2;
                Boolean boolValueOf = Boolean.valueOf(rVar.f33421a);
                yb.i iVar5 = y.f33430a;
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                c3.s sVar2 = (c3.s) obj2;
                break;
            case 15:
                break;
            case 16:
                ((Integer) obj).intValue();
                sh.c0 c0Var = (sh.c0) obj2;
                nk.k.e(c0Var, "tab");
                break;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((ck.h) obj).y((ck.f) obj2);
    }
}
