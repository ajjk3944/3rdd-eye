package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public final class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f22495d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f22496e;

    public g(kotlin.coroutines.d dVar, Thread thread, c1 c1Var) {
        super(dVar, true, true);
        this.f22495d = thread;
        this.f22496e = c1Var;
    }

    @Override // kotlinx.coroutines.y1
    public void H(Object obj) {
        if (kotlin.jvm.internal.p.a(Thread.currentThread(), this.f22495d)) {
            return;
        }
        Thread thread = this.f22495d;
        c.a();
        LockSupport.unpark(thread);
    }

    public final Object U0() throws Throwable {
        c.a();
        try {
            c1 c1Var = this.f22496e;
            if (c1Var != null) {
                c1.h0(c1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    c1 c1Var2 = this.f22496e;
                    long jK0 = c1Var2 != null ? c1Var2.k0() : Long.MAX_VALUE;
                    if (d()) {
                        c1 c1Var3 = this.f22496e;
                        if (c1Var3 != null) {
                            c1.c0(c1Var3, false, 1, null);
                        }
                        c.a();
                        Object objH = z1.h(i0());
                        c0 c0Var = objH instanceof c0 ? (c0) objH : null;
                        if (c0Var == null) {
                            return objH;
                        }
                        throw c0Var.f22236a;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jK0);
                } catch (Throwable th) {
                    c1 c1Var4 = this.f22496e;
                    if (c1Var4 != null) {
                        c1.c0(c1Var4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            L(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.y1
    public boolean o0() {
        return true;
    }
}
