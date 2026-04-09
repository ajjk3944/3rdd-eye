package c3;

import A1.w;
import M2.u;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5911a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final w f5912b = new w(3);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5913c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5914d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5915e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f5916f;

    public final void a(b bVar) {
        this.f5912b.i(new h(g.f5903a, bVar));
        j();
    }

    public final Exception b() {
        Exception exc;
        synchronized (this.f5911a) {
            exc = this.f5916f;
        }
        return exc;
    }

    public final Object c() {
        Object obj;
        synchronized (this.f5911a) {
            try {
                if (!this.f5913c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f5914d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f5916f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f5915e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f5911a) {
            z6 = this.f5913c;
        }
        return z6;
    }

    public final boolean e() {
        boolean z6;
        synchronized (this.f5911a) {
            try {
                z6 = false;
                if (this.f5913c && !this.f5914d && this.f5916f == null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public final void f(Exception exc) {
        u.f(exc, "Exception must not be null");
        synchronized (this.f5911a) {
            i();
            this.f5913c = true;
            this.f5916f = exc;
        }
        this.f5912b.k(this);
    }

    public final void g(Object obj) {
        synchronized (this.f5911a) {
            i();
            this.f5913c = true;
            this.f5915e = obj;
        }
        this.f5912b.k(this);
    }

    public final void h() {
        synchronized (this.f5911a) {
            try {
                if (this.f5913c) {
                    return;
                }
                this.f5913c = true;
                this.f5914d = true;
                this.f5912b.k(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        if (this.f5913c) {
            int i = B5.j.f798a;
            if (!d()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
        }
    }

    public final void j() {
        synchronized (this.f5911a) {
            try {
                if (this.f5913c) {
                    this.f5912b.k(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
