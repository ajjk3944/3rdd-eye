package Ii;

import dh.InterfaceC5384i;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ii.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3055g extends AbstractC3043a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f9324d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3060i0 f9325e;

    public C3055g(InterfaceC5384i interfaceC5384i, Thread thread, AbstractC3060i0 abstractC3060i0) {
        super(interfaceC5384i, true, true);
        this.f9324d = thread;
        this.f9325e = abstractC3060i0;
    }

    public final Object R0() throws Throwable {
        AbstractC3047c.a();
        try {
            AbstractC3060i0 abstractC3060i0 = this.f9325e;
            if (abstractC3060i0 != null) {
                AbstractC3060i0.v0(abstractC3060i0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC3060i0 abstractC3060i02 = this.f9325e;
                    long jY0 = abstractC3060i02 != null ? abstractC3060i02.y0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC3060i0 abstractC3060i03 = this.f9325e;
                        if (abstractC3060i03 != null) {
                            AbstractC3060i0.q0(abstractC3060i03, false, 1, null);
                        }
                        AbstractC3047c.a();
                        Object objH = E0.h(Y());
                        C c10 = objH instanceof C ? (C) objH : null;
                        if (c10 == null) {
                            return objH;
                        }
                        throw c10.f9236a;
                    }
                    AbstractC3047c.a();
                    LockSupport.parkNanos(this, jY0);
                } catch (Throwable th2) {
                    AbstractC3060i0 abstractC3060i04 = this.f9325e;
                    if (abstractC3060i04 != null) {
                        AbstractC3060i0.q0(abstractC3060i04, false, 1, null);
                    }
                    throw th2;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            A(interruptedException);
            throw interruptedException;
        } catch (Throwable th3) {
            AbstractC3047c.a();
            throw th3;
        }
    }

    @Override // Ii.D0
    protected boolean i0() {
        return true;
    }

    @Override // Ii.D0
    protected void w(Object obj) {
        if (AbstractC6492s.d(Thread.currentThread(), this.f9324d)) {
            return;
        }
        Thread thread = this.f9324d;
        AbstractC3047c.a();
        LockSupport.unpark(thread);
    }
}
