package u6;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35146a;

    static {
        String strG = t6.v.g("WorkerWrapper");
        nk.k.d(strG, "tagWithPrefix(...)");
        f35146a = strG;
    }

    public static final Object a(vd.b bVar, t6.u uVar, ek.j jVar) {
        Object obj;
        try {
            if (!bVar.isDone()) {
                xk.h hVar = new xk.h(1, a.a.r(jVar));
                hVar.s();
                bVar.a(new h3.n(bVar, hVar, 1), t6.k.f34375a);
                hVar.u(new g1.a(3, uVar, bVar));
                return hVar.r();
            }
            boolean z3 = false;
            while (true) {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th2) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            nk.k.b(cause);
            throw cause;
        }
    }
}
