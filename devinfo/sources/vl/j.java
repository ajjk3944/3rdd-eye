package vl;

import a0.x0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final km.n f36327a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f36328b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f36329c;

    public j(m mVar, km.n nVar) {
        this.f36329c = mVar;
        this.f36327a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var;
        String str = "OkHttp " + ((rl.n) this.f36329c.f36333b.f36146b).g();
        m mVar = this.f36329c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            mVar.f36335d.h();
            boolean z3 = false;
            try {
                try {
                    try {
                        this.f36327a.u(mVar.g());
                        x0Var = mVar.f36332a.f33154a;
                    } catch (IOException e2) {
                        e = e2;
                        z3 = true;
                        if (z3) {
                            bm.e eVar = bm.e.f2349a;
                            bm.e.f2349a.j("Callback failure for " + m.a(mVar), 4, e);
                        } else {
                            this.f36327a.j(e);
                        }
                        x0Var = mVar.f36332a.f33154a;
                        x0Var.getClass();
                        x0.I(x0Var, null, null, this, 3);
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = true;
                        mVar.cancel();
                        if (!z3) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f36327a.j(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        x0Var = mVar.f36332a.f33154a;
                        x0Var.getClass();
                        x0.I(x0Var, null, null, this, 3);
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                }
                x0Var.getClass();
                x0.I(x0Var, null, null, this, 3);
            } catch (Throwable th4) {
                x0 x0Var2 = mVar.f36332a.f33154a;
                x0Var2.getClass();
                x0.I(x0Var2, null, null, this, 3);
                throw th4;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
