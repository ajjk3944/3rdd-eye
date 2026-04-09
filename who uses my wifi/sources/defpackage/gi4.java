package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gi4 {
    public final Object a = new Object();
    public final wy0 b = new wy0(8);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object b() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new nr0(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void d(Exception exc) {
        ou1.k(exc, "Exception must not be null");
        synchronized (this.a) {
            g();
            this.c = true;
            this.f = exc;
        }
        this.b.g(this);
    }

    public final void e(Object obj) {
        synchronized (this.a) {
            g();
            this.c = true;
            this.e = obj;
        }
        this.b.g(this);
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        boolean z;
        if (this.c) {
            int i = vf.f;
            synchronized (this.a) {
                z = this.c;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excA = a();
        }
    }

    public final void h() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
