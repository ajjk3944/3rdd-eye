package d0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21717a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21720d;

    public /* synthetic */ f(i iVar, e2 e2Var, xk.y0 y0Var, x1 x1Var) {
        this.f21718b = iVar;
        this.f21719c = y0Var;
        this.f21720d = x1Var;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f21717a) {
            case 0:
                i iVar = (i) this.f21718b;
                xk.y0 y0Var = (xk.y0) this.f21719c;
                x1 x1Var = (x1) this.f21720d;
                float fFloatValue = ((Float) obj).floatValue();
                float f10 = iVar.f21748q ? 1.0f : -1.0f;
                z1 z1Var = iVar.f21747p;
                long jE = z1Var.e(z1Var.h(f10 * fFloatValue));
                z1 z1Var2 = x1Var.f21893a;
                float fG = z1Var.g(z1Var.e(z1Var2.c(z1Var2.f21927k, jE, 1))) * f10;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    y0Var.e(cancellationException);
                }
                return yj.u.f37649a;
            default:
                f1.e eVar = (f1.e) this.f21718b;
                f1.j jVar = (f1.j) this.f21720d;
                x.e0 e0Var = eVar.f23617b;
                Object obj2 = this.f21719c;
                if (!e0Var.b(obj2)) {
                    eVar.f23616a.remove(obj2);
                    e0Var.m(obj2, jVar);
                    return new f1.d(eVar, obj2, jVar);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
    }

    public /* synthetic */ f(f1.e eVar, Object obj, f1.j jVar) {
        this.f21718b = eVar;
        this.f21719c = obj;
        this.f21720d = jVar;
    }
}
