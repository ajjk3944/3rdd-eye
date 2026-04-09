package h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f2676c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f2677d = new ExecutorC0030a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f2678e = new b();

    /* renamed from: a, reason: collision with root package name */
    private c f2679a;

    /* renamed from: b, reason: collision with root package name */
    private c f2680b;

    /* renamed from: h.a$a, reason: collision with other inner class name */
    static class ExecutorC0030a implements Executor {
        ExecutorC0030a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        h.b bVar = new h.b();
        this.f2680b = bVar;
        this.f2679a = bVar;
    }

    public static a d() {
        if (f2676c != null) {
            return f2676c;
        }
        synchronized (a.class) {
            if (f2676c == null) {
                f2676c = new a();
            }
        }
        return f2676c;
    }

    @Override // h.c
    public void a(Runnable runnable) {
        this.f2679a.a(runnable);
    }

    @Override // h.c
    public boolean b() {
        return this.f2679a.b();
    }

    @Override // h.c
    public void c(Runnable runnable) {
        this.f2679a.c(runnable);
    }
}
