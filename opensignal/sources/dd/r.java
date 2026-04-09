package dd;

import androidx.media3.common.u;
import com.google.android.gms.internal.measurement.h4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7318a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final h4 f7319b = new h4(4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f7320c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f7321d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7322e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f7323f;

    public final void a(Executor executor, b bVar) {
        this.f7319b.o(new m(executor, bVar));
        q();
    }

    public final void b(Executor executor, c cVar) {
        this.f7319b.o(new m(executor, cVar));
        q();
    }

    public final void c(Executor executor, d dVar) {
        this.f7319b.o(new m(executor, dVar));
        q();
    }

    public final void d(Executor executor, e eVar) {
        this.f7319b.o(new m(executor, eVar));
        q();
    }

    public final r e(Executor executor, a aVar) {
        r rVar = new r();
        this.f7319b.o(new l(executor, aVar, rVar, 0));
        q();
        return rVar;
    }

    public final r f(Executor executor, a aVar) {
        r rVar = new r();
        this.f7319b.o(new l(executor, aVar, rVar, 1));
        q();
        return rVar;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.f7318a) {
            exc = this.f7323f;
        }
        return exc;
    }

    public final Object h() {
        Object obj;
        synchronized (this.f7318a) {
            try {
                cc.s.j("Task is not yet complete", this.f7320c);
                if (this.f7321d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f7323f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f7322e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f7318a) {
            z10 = this.f7320c;
        }
        return z10;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f7318a) {
            try {
                z10 = false;
                if (this.f7320c && !this.f7321d && this.f7323f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final r k(Executor executor, g gVar) {
        r rVar = new r();
        this.f7319b.o(new m(executor, gVar, rVar));
        q();
        return rVar;
    }

    public final void l(Object obj) {
        synchronized (this.f7318a) {
            p();
            this.f7320c = true;
            this.f7322e = obj;
        }
        this.f7319b.q(this);
    }

    public final boolean m(Object obj) {
        synchronized (this.f7318a) {
            try {
                if (this.f7320c) {
                    return false;
                }
                this.f7320c = true;
                this.f7322e = obj;
                this.f7319b.q(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(Exception exc) {
        cc.s.i(exc, "Exception must not be null");
        synchronized (this.f7318a) {
            p();
            this.f7320c = true;
            this.f7323f = exc;
        }
        this.f7319b.q(this);
    }

    public final void o() {
        synchronized (this.f7318a) {
            try {
                if (this.f7320c) {
                    return;
                }
                this.f7320c = true;
                this.f7321d = true;
                this.f7319b.q(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        if (this.f7320c) {
            int i10 = u.f1800a;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excG = g();
        }
    }

    public final void q() {
        synchronized (this.f7318a) {
            try {
                if (this.f7320c) {
                    this.f7319b.q(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
