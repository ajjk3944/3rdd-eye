package wg;

import gg.y;
import hg.InterfaceC6043c;
import hg.InterfaceC6044d;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public class h extends y.c {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f64971a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f64972b;

    public h(ThreadFactory threadFactory) {
        this.f64971a = n.a(threadFactory);
    }

    @Override // gg.y.c
    public InterfaceC6043c b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // gg.y.c
    public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f64972b ? EnumC6593c.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        if (this.f64972b) {
            return;
        }
        this.f64972b = true;
        this.f64971a.shutdownNow();
    }

    public m e(Runnable runnable, long j10, TimeUnit timeUnit, InterfaceC6044d interfaceC6044d) {
        m mVar = new m(Eg.a.x(runnable), interfaceC6044d);
        if (interfaceC6044d != null && !interfaceC6044d.a(mVar)) {
            return mVar;
        }
        try {
            mVar.a(j10 <= 0 ? this.f64971a.submit((Callable) mVar) : this.f64971a.schedule((Callable) mVar, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (interfaceC6044d != null) {
                interfaceC6044d.b(mVar);
            }
            Eg.a.v(e10);
        }
        return mVar;
    }

    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        l lVar = new l(Eg.a.x(runnable), true);
        try {
            lVar.c(j10 <= 0 ? this.f64971a.submit(lVar) : this.f64971a.schedule(lVar, j10, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            Eg.a.v(e10);
            return EnumC6593c.INSTANCE;
        }
    }

    public InterfaceC6043c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableX = Eg.a.x(runnable);
        if (j11 <= 0) {
            e eVar = new e(runnableX, this.f64971a);
            try {
                eVar.b(j10 <= 0 ? this.f64971a.submit(eVar) : this.f64971a.schedule(eVar, j10, timeUnit));
                return eVar;
            } catch (RejectedExecutionException e10) {
                Eg.a.v(e10);
                return EnumC6593c.INSTANCE;
            }
        }
        k kVar = new k(runnableX, true);
        try {
            kVar.c(this.f64971a.scheduleAtFixedRate(kVar, j10, j11, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e11) {
            Eg.a.v(e11);
            return EnumC6593c.INSTANCE;
        }
    }

    public void h() {
        if (this.f64972b) {
            return;
        }
        this.f64972b = true;
        this.f64971a.shutdown();
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f64972b;
    }
}
