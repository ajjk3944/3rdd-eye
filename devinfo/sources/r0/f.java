package r0;

import u0.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1.h f32520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32521c;

    public /* synthetic */ f(Object obj, c1.h hVar, int i4) {
        this.f32519a = i4;
        this.f32521c = obj;
        this.f32520b = hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32519a) {
            case 0:
                u0.p pVar = (u0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i1.n nVarE = g0.x.e(g0.j0.a(b.f32491b, b.f32492c), (g0.a0) this.f32521c);
                    g0.g0 g0VarA = g0.f0.a(g0.e.f24110c, i1.b.f25539k, pVar, 54);
                    int iN = u0.q.n(pVar);
                    i1 i1VarL = pVar.l();
                    i1.n nVarW = com.bumptech.glide.d.w(nVarE, pVar);
                    i2.g.R8.getClass();
                    i2.x xVar = i2.f.f25653b;
                    pVar.Z();
                    if (pVar.S) {
                        pVar.k(xVar);
                    } else {
                        pVar.j0();
                    }
                    u0.q.x(g0VarA, i2.f.f25656e, pVar);
                    u0.q.x(i1VarL, i2.f.f25655d, pVar);
                    i2.e eVar = i2.f.f25657f;
                    if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
                        pVar.g0(Integer.valueOf(iN));
                        pVar.b(Integer.valueOf(iN), eVar);
                    }
                    u0.q.x(nVarW, i2.f.f25654c, pVar);
                    this.f32520b.a(g0.h0.f24119a, pVar, 6);
                    pVar.p(true);
                } else {
                    pVar.R();
                }
                break;
            default:
                u0.p pVar2 = (u0.p) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (pVar2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s0.a(((w0) this.f32521c).j, this.f32520b, pVar2, 0);
                } else {
                    pVar2.R();
                }
                break;
        }
        return yj.u.f37649a;
    }
}
