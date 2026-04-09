package tg;

import java.util.List;
import java.util.Set;
import nm.e0;
import sh.c0;
import u0.p;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements mk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f34593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f34594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f34595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f34596d;

    public m(List list, e0 e0Var, o oVar, Set set) {
        this.f34593a = list;
        this.f34594b = e0Var;
        this.f34595c = oVar;
        this.f34596d = set;
    }

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        i0.c cVar = (i0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        p pVar = (p) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i4 = (pVar.f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i4 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i4 |= pVar.d(iIntValue) ? 32 : 16;
        }
        if (pVar.O(i4 & 1, (i4 & 147) != 146)) {
            c0 c0Var = (c0) this.f34593a.get(iIntValue);
            pVar.W(-380876102);
            wb.e.a(cVar, this.f34594b, c0Var.f33654c, null, false, null, c1.n.c(-1534204089, new l(this.f34595c, c0Var, this.f34596d), pVar), pVar, (i4 & 14) | 1572864);
            pVar.p(false);
        } else {
            pVar.R();
        }
        return u.f37649a;
    }
}
