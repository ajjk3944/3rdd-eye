package vu;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends cv.d {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f24062m;

    public x(y yVar) {
        this.f24062m = yVar;
    }

    @Override // cv.d
    public final void j() {
        this.f24062m.e(c.CANCEL);
        q qVar = this.f24062m.f24064b;
        synchronized (qVar) {
            long j = qVar.J;
            long j7 = qVar.I;
            if (j < j7) {
                return;
            }
            qVar.I = j7 + 1;
            qVar.K = System.nanoTime() + 1000000000;
            qVar.D.c(new qu.f(w.g.j(new StringBuilder(), qVar.f24030g, " ping"), qVar, 3), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
