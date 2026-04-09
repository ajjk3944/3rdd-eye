package su;

import ir.f0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import lf.t1;
import n0.q0;
import ou.x;
import xu.n;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f22330a;

    /* renamed from: d, reason: collision with root package name */
    public volatile AtomicInteger f22331d = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f22332g;

    public f(i iVar, q0 q0Var) {
        this.f22332g = iVar;
        this.f22330a = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        String strConcat = "OkHttp ".concat(this.f22332g.f22336d.f19860a.f());
        i iVar = this.f22332g;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            iVar.f22339x.h();
            boolean z10 = false;
            try {
                try {
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ((wt.g) this.f22330a.f17289d).g(iVar.g());
                    xVar = iVar.f22335a;
                } catch (IOException e10) {
                    e = e10;
                    z10 = true;
                    if (z10) {
                        n nVar = n.f25563a;
                        n nVar2 = n.f25563a;
                        String str = "Callback failure for " + i.a(iVar);
                        nVar2.getClass();
                        n.i(str, 4, e);
                    } else {
                        q0 q0Var = this.f22330a;
                        if (!iVar.J) {
                            ((wt.g) q0Var.f17289d).g(t1.k(e));
                        }
                    }
                    xVar = iVar.f22335a;
                    xVar.f20004a.U(this);
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    iVar.d();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        f0.c(iOException, th);
                        q0 q0Var2 = this.f22330a;
                        if (!iVar.J) {
                            ((wt.g) q0Var2.f17289d).g(t1.k(iOException));
                        }
                    }
                    throw th;
                }
                xVar.f20004a.U(this);
            } catch (Throwable th4) {
                iVar.f22335a.f20004a.U(this);
                throw th4;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
