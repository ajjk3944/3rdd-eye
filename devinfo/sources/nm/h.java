package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.a f30047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f30048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk.v f30049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f30050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(mk.a aVar, u0 u0Var, xk.v vVar, u0 u0Var2, int i4) {
        super(0);
        this.f30046a = i4;
        this.f30047b = aVar;
        this.f30048c = u0Var;
        this.f30049d = vVar;
        this.f30050e = u0Var2;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f30046a) {
            case 0:
                e0.b bVar = (e0.b) this.f30048c.getValue();
                if (bVar != null) {
                    xk.x.v(this.f30049d, null, null, new e(bVar, null, 2), 3);
                }
                u0 u0Var = this.f30050e;
                if (((Boolean) u0Var.getValue()).booleanValue()) {
                    this.f30047b.invoke();
                }
                u0Var.setValue(Boolean.FALSE);
                break;
            default:
                e0.b bVar2 = (e0.b) this.f30048c.getValue();
                if (bVar2 != null) {
                    xk.x.v(this.f30049d, null, null, new e(bVar2, null, 3), 3);
                }
                u0 u0Var2 = this.f30050e;
                if (((Boolean) u0Var2.getValue()).booleanValue()) {
                    this.f30047b.invoke();
                }
                u0Var2.setValue(Boolean.FALSE);
                break;
        }
        return yj.u.f37649a;
    }
}
