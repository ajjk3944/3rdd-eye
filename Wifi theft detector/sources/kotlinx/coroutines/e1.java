package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.d1;

/* loaded from: classes4.dex */
public abstract class e1 extends c1 {
    public abstract Thread n0();

    public void o0(long j10, d1.c cVar) {
        m0.f22576h.B0(j10, cVar);
    }

    public final void p0() {
        Thread threadN0 = n0();
        if (Thread.currentThread() != threadN0) {
            c.a();
            LockSupport.unpark(threadN0);
        }
    }
}
