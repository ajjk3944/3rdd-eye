package u0;

import com.google.android.gms.internal.measurement.z3;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q0 implements u1, xk.t {

    /* renamed from: a, reason: collision with root package name */
    public final ck.h f34935a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.e f34936b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.d f34937c;

    /* renamed from: d, reason: collision with root package name */
    public xk.a0 f34938d;

    public q0(ck.h hVar, mk.e eVar) {
        this.f34935a = hVar;
        this.f34936b = eVar;
        this.f34937c = xk.x.b(hVar.y(this));
    }

    @Override // xk.t
    public final void E(ck.h hVar, Throwable th2) throws Throwable {
        h1.d dVar = (h1.d) hVar.O(h1.d.f24803b);
        if (dVar != null) {
            z3.x(th2, new c0.p(5, dVar, this));
        }
        xk.t tVar = (xk.t) this.f34935a.O(xk.s.f37234a);
        if (tVar == null) {
            throw th2;
        }
        tVar.E(hVar, th2);
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        return wd.b.p(this, gVar);
    }

    @Override // u0.u1
    public final void a() {
        xk.a0 a0Var = this.f34938d;
        if (a0Var != null) {
            a0Var.s(new i0(1));
        }
        this.f34938d = null;
    }

    @Override // u0.u1
    public final void b() {
        xk.a0 a0Var = this.f34938d;
        if (a0Var != null) {
            a0Var.s(new i0(1));
        }
        this.f34938d = null;
    }

    @Override // u0.u1
    public final void d() {
        xk.a0 a0Var = this.f34938d;
        if (a0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            a0Var.e(cancellationException);
        }
        this.f34938d = xk.x.v(this.f34937c, null, null, this.f34936b, 3);
    }

    @Override // ck.f
    public final ck.g getKey() {
        return xk.s.f37234a;
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }
}
