package h3;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24842a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.b f24843b;

    /* renamed from: c, reason: collision with root package name */
    public final xk.h f24844c;

    public /* synthetic */ n(vd.b bVar, xk.h hVar, int i4) {
        this.f24842a = i4;
        this.f24843b = bVar;
        this.f24844c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24842a) {
            case 0:
                vd.b bVar = this.f24843b;
                boolean zIsCancelled = bVar.isCancelled();
                xk.h hVar = this.f24844c;
                if (zIsCancelled) {
                    hVar.i(null);
                    return;
                }
                try {
                    hVar.resumeWith(g.h(bVar));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause != null) {
                        hVar.resumeWith(ci.b.h(cause));
                        return;
                    } else {
                        yj.d dVar = new yj.d();
                        nk.k.j(dVar, nk.k.class.getName());
                        throw dVar;
                    }
                }
            default:
                vd.b bVar2 = this.f24843b;
                boolean zIsCancelled2 = bVar2.isCancelled();
                xk.h hVar2 = this.f24844c;
                if (zIsCancelled2) {
                    hVar2.i(null);
                    return;
                }
                boolean z3 = false;
                while (true) {
                    try {
                        try {
                            Object obj = bVar2.get();
                            if (z3) {
                                Thread.currentThread().interrupt();
                            }
                            hVar2.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z3 = true;
                        } catch (Throwable th2) {
                            if (z3) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    } catch (ExecutionException e10) {
                        Throwable cause2 = e10.getCause();
                        nk.k.b(cause2);
                        hVar2.resumeWith(ci.b.h(cause2));
                        return;
                    }
                }
        }
    }
}
