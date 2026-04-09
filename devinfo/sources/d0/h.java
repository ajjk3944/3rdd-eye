package d0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f21737b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f21739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f21740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f21741f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, e2 e2Var, c cVar, long j, ck.c cVar2) {
        super(2, cVar2);
        this.f21739d = iVar;
        this.f21740e = e2Var;
        this.f21741f = cVar;
        this.g = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        h hVar = new h(this.f21739d, this.f21740e, this.f21741f, this.g, cVar);
        hVar.f21738c = obj;
        return hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f21739d;
        o7.c cVar = iVar.f21750s;
        int i4 = this.f21737b;
        try {
            try {
                if (i4 == 0) {
                    ci.b.D(obj);
                    xk.y0 y0VarO = xk.x.o(((xk.v) this.f21738c).A());
                    iVar.f21753v = true;
                    z1 z1Var = iVar.f21747p;
                    c0.v0 v0Var = c0.v0.f2516a;
                    g gVar = new g(this.f21740e, iVar, this.f21741f, this.g, y0VarO, null);
                    this.f21737b = 1;
                    Object objF = z1Var.f(v0Var, gVar, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                cVar.y();
                iVar.f21753v = false;
                cVar.q(null);
                iVar.f21751t = false;
                return yj.u.f37649a;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            iVar.f21753v = false;
            cVar.q(null);
            iVar.f21751t = false;
            throw th2;
        }
    }
}
