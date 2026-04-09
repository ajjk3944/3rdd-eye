package j;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f21674c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f21675d = new Executor() { // from class: j.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f21676e = new Executor() { // from class: j.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public e f21677a;

    /* renamed from: b, reason: collision with root package name */
    public final e f21678b;

    public c() {
        d dVar = new d();
        this.f21678b = dVar;
        this.f21677a = dVar;
    }

    public static Executor f() {
        return f21676e;
    }

    public static c g() {
        if (f21674c != null) {
            return f21674c;
        }
        synchronized (c.class) {
            try {
                if (f21674c == null) {
                    f21674c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21674c;
    }

    @Override // j.e
    public void a(Runnable runnable) {
        this.f21677a.a(runnable);
    }

    @Override // j.e
    public boolean b() {
        return this.f21677a.b();
    }

    @Override // j.e
    public void c(Runnable runnable) {
        this.f21677a.c(runnable);
    }
}
