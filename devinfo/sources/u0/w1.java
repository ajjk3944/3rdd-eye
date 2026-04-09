package u0;

import com.google.android.gms.internal.measurement.z3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w1 extends ck.a implements xk.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.d f35014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f35015c;

    /* JADX WARN: Illegal instructions before constructor call */
    public w1(h1.d dVar, x1 x1Var) {
        xk.s sVar = xk.s.f37234a;
        this.f35014b = dVar;
        this.f35015c = x1Var;
        super(sVar);
    }

    @Override // xk.t
    public final void E(ck.h hVar, Throwable th2) throws Throwable {
        h1.d dVar = this.f35014b;
        x1 x1Var = this.f35015c;
        z3.x(th2, new c0.p(5, dVar, x1Var));
        xk.t tVar = (xk.t) x1Var.f35020a.O(xk.s.f37234a);
        if (tVar == null) {
            throw th2;
        }
        tVar.E(hVar, th2);
    }
}
