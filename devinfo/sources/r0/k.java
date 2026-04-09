package r0;

import u0.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1.h f32557a;

    public k(c1.h hVar) {
        this.f32557a = hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        u0.p pVar = (u0.p) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            g0.l lVar = g0.e.f24108a;
            g0.o oVarA = g0.m.a(pVar);
            int iN = u0.q.n(pVar);
            i1 i1VarL = pVar.l();
            i1.n nVarW = com.bumptech.glide.d.w(i1.k.f25553a, pVar);
            i2.g.R8.getClass();
            i2.x xVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            u0.q.x(oVarA, i2.f.f25656e, pVar);
            u0.q.x(i1VarL, i2.f.f25655d, pVar);
            i2.e eVar = i2.f.f25657f;
            if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
                pVar.g0(Integer.valueOf(iN));
                pVar.b(Integer.valueOf(iN), eVar);
            }
            u0.q.x(nVarW, i2.f.f25654c, pVar);
            this.f32557a.a(g0.p.f24166a, pVar, 6);
            pVar.p(true);
        } else {
            pVar.R();
        }
        return yj.u.f37649a;
    }
}
