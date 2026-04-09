package dt;

import h7.h0;
import rr.o0;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: e, reason: collision with root package name */
    public final ls.j f7540e;

    /* renamed from: f, reason: collision with root package name */
    public final u f7541f;

    /* renamed from: g, reason: collision with root package name */
    public final qs.b f7542g;

    /* renamed from: h, reason: collision with root package name */
    public final ls.i f7543h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7544i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ls.j jVar, ns.f fVar, h0 h0Var, o0 o0Var, u uVar) {
        super(fVar, h0Var, o0Var, 0);
        br.l.e(jVar, "classProto");
        br.l.e(fVar, "nameResolver");
        this.f7540e = jVar;
        this.f7541f = uVar;
        this.f7542g = io.sentry.config.a.T(fVar, jVar.f15803x);
        ls.i iVar = (ls.i) ns.e.f18533f.e(jVar.f15802r);
        this.f7543h = iVar == null ? ls.i.CLASS : iVar;
        this.f7544i = ns.e.f18534g.e(jVar.f15802r).booleanValue();
    }

    @Override // dt.w
    public final qs.c b() {
        return this.f7542g.b();
    }
}
