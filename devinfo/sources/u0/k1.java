package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f34848a;

    public k1(mk.a aVar) {
        this.f34848a = new r0(aVar);
    }

    public abstract p.r a(Object obj);

    public q2 b() {
        return this.f34848a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q2 c(p.r rVar, q2 q2Var) {
        h0 h0Var = null;
        if (q2Var instanceof h0) {
            if (rVar.f30838d) {
                h0Var = (h0) q2Var;
                h0Var.f34821a.setValue(rVar.c());
            }
        } else if (q2Var instanceof p2) {
            if ((rVar.f30837c || rVar.f30836b != null) && !rVar.f30838d) {
                p2 p2Var = (p2) q2Var;
                if (nk.k.a(rVar.c(), p2Var.f34931a)) {
                    h0Var = p2Var;
                }
            }
        } else if (q2Var instanceof b0) {
            rVar.getClass();
        }
        if (h0Var != null) {
            return h0Var;
        }
        if (!rVar.f30838d) {
            return new p2(rVar.c());
        }
        Object obj = rVar.f30836b;
        j2 j2Var = (j2) rVar.f30835a;
        if (j2Var == null) {
            j2Var = e.g;
        }
        return new h0(new d1(obj, j2Var));
    }
}
