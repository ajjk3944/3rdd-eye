package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f32621b;

    public /* synthetic */ p(q qVar, int i4) {
        this.f32620a = i4;
        this.f32621b = qVar;
    }

    @Override // mk.a
    public final Object invoke() {
        int i4 = this.f32620a;
        q qVar = this.f32621b;
        switch (i4) {
            case 0:
                if (((b0) i2.k.h(qVar, d0.f32505a)) == null) {
                    q0.a aVar = qVar.f32632u;
                    if (aVar != null) {
                        qVar.q0(aVar);
                    }
                    qVar.f32632u = null;
                } else if (qVar.f32632u == null) {
                    km.y yVar = new km.y(13, qVar);
                    p pVar = new p(qVar, 1);
                    e0.i iVar = qVar.f32628q;
                    boolean z3 = qVar.f32629r;
                    float f10 = qVar.f32630s;
                    a0.u0 u0Var = q0.f.f32057a;
                    q0.a aVar2 = new q0.a(iVar, z3, f10, yVar, pVar);
                    qVar.p0(aVar2);
                    qVar.f32632u = aVar2;
                }
                return yj.u.f37649a;
            default:
                return c0.f32499a;
        }
    }
}
