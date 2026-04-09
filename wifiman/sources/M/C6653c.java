package m;

import java.util.concurrent.Executor;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6653c extends AbstractC6655e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C6653c f52774c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f52775d = new Executor() { // from class: m.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C6653c.h(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f52776e = new Executor() { // from class: m.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C6653c.i(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6655e f52777a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6655e f52778b;

    private C6653c() {
        C6654d c6654d = new C6654d();
        this.f52778b = c6654d;
        this.f52777a = c6654d;
    }

    public static Executor f() {
        return f52776e;
    }

    public static C6653c g() {
        if (f52774c != null) {
            return f52774c;
        }
        synchronized (C6653c.class) {
            try {
                if (f52774c == null) {
                    f52774c = new C6653c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f52774c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // m.AbstractC6655e
    public void a(Runnable runnable) {
        this.f52777a.a(runnable);
    }

    @Override // m.AbstractC6655e
    public boolean b() {
        return this.f52777a.b();
    }

    @Override // m.AbstractC6655e
    public void c(Runnable runnable) {
        this.f52777a.c(runnable);
    }
}
