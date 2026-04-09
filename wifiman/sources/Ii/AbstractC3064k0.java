package Ii;

import Ii.AbstractC3062j0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Ii.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3064k0 extends AbstractC3060i0 {
    protected abstract Thread B0();

    protected void C0(long j10, AbstractC3062j0.c cVar) {
        T.f9282i.Q0(j10, cVar);
    }

    protected final void D0() {
        Thread threadB0 = B0();
        if (Thread.currentThread() != threadB0) {
            AbstractC3047c.a();
            LockSupport.unpark(threadB0);
        }
    }
}
