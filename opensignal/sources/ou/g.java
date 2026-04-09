package ou;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    public final qu.g f19907a;

    public g(File file, long j) {
        this.f19907a = new qu.g(file, j, ru.c.f21810h);
    }

    public final void b(a0 a0Var) {
        br.l.e(a0Var, "request");
        qu.g gVar = this.f19907a;
        String strF = d.f(a0Var.f19860a);
        synchronized (gVar) {
            br.l.e(strF, "key");
            gVar.q();
            gVar.b();
            qu.g.f0(strF);
            qu.d dVar = (qu.d) gVar.D.get(strF);
            if (dVar == null) {
                return;
            }
            gVar.Y(dVar);
            if (gVar.f21091y <= gVar.f21087d) {
                gVar.J = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19907a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f19907a.flush();
    }
}
