package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements u0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk.a f30033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f30034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f30035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk.v f30036d;

    public f(mk.a aVar, u0 u0Var, u0 u0Var2, xk.v vVar) {
        this.f30033a = aVar;
        this.f30034b = u0Var;
        this.f30035c = u0Var2;
        this.f30036d = vVar;
    }

    @Override // u0.f0
    public final void a() {
        u0 u0Var = this.f30034b;
        if (((Boolean) u0Var.getValue()).booleanValue()) {
            e0.b bVar = (e0.b) this.f30035c.getValue();
            if (bVar != null) {
                xk.x.v(this.f30036d, null, null, new e(bVar, null, 0), 3);
            }
            if (((Boolean) u0Var.getValue()).booleanValue()) {
                this.f30033a.invoke();
            }
            u0Var.setValue(Boolean.FALSE);
        }
    }
}
