package r0;

import j2.a1;
import u0.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1.n f32588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.j0 f32589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.x f32592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.i f32593f;
    public final /* synthetic */ boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mk.a f32594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f32595i;
    public final /* synthetic */ c1.h j;

    public l0(i1.n nVar, p1.j0 j0Var, long j, float f10, c0.x xVar, e0.i iVar, boolean z3, mk.a aVar, float f11, c1.h hVar) {
        this.f32588a = nVar;
        this.f32589b = j0Var;
        this.f32590c = j;
        this.f32591d = f10;
        this.f32592e = xVar;
        this.f32593f = iVar;
        this.g = z3;
        this.f32594h = aVar;
        this.f32595i = f11;
        this.j = hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        u0.p pVar = (u0.p) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            g2.l lVar = t.f32655a;
            i1.n nVarB = c0.o.d(m0.a(this.f32588a.b(x.f32708a), this.f32589b, m0.b(this.f32590c, this.f32591d, pVar), this.f32592e, ((d3.c) pVar.j(a1.f27074h)).I(this.f32595i)), this.f32593f, d0.a(7, 0.0f), this.g, this.f32594h).b(new s0.b(new b7.w(19)));
            g2.j0 j0VarC = g0.h.c(i1.b.f25531a, true);
            int iN = u0.q.n(pVar);
            i1 i1VarL = pVar.l();
            i1.n nVarW = com.bumptech.glide.d.w(nVarB, pVar);
            i2.g.R8.getClass();
            i2.x xVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            u0.q.x(j0VarC, i2.f.f25656e, pVar);
            u0.q.x(i1VarL, i2.f.f25655d, pVar);
            i2.e eVar = i2.f.f25657f;
            if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
                pVar.g0(Integer.valueOf(iN));
                pVar.b(Integer.valueOf(iN), eVar);
            }
            u0.q.x(nVarW, i2.f.f25654c, pVar);
            this.j.invoke(pVar, 0);
            pVar.p(true);
        } else {
            pVar.R();
        }
        return yj.u.f37649a;
    }
}
