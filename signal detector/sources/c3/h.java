package c3;

import C0.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5905a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5906b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5907c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5908d;

    public /* synthetic */ h(Executor executor, InterfaceC0402a interfaceC0402a, j jVar, int i) {
        this.f5905a = i;
        this.f5906b = executor;
        this.f5908d = interfaceC0402a;
        this.f5907c = jVar;
    }

    private final void c(j jVar) {
        if (jVar.f5914d) {
            synchronized (this.f5908d) {
            }
            this.f5906b.execute(new k(19, this));
        }
    }

    private final void d(j jVar) {
        synchronized (this.f5908d) {
        }
        this.f5906b.execute(new A1.d(this, 25, jVar));
    }

    private final void e(j jVar) {
        if (jVar.e() || jVar.f5914d) {
            return;
        }
        synchronized (this.f5908d) {
        }
        this.f5906b.execute(new A1.d(this, 26, jVar));
    }

    @Override // c3.c
    public void a(Exception exc) {
        ((j) this.f5907c).f(exc);
    }

    public final void b(j jVar) {
        switch (this.f5905a) {
            case 0:
                this.f5906b.execute(new A1.d(this, 23, jVar));
                return;
            case 1:
                this.f5906b.execute(new A1.d(this, 24, jVar));
                return;
            case 2:
                c(jVar);
                return;
            case 3:
                d(jVar);
                return;
            case 4:
                e(jVar);
                return;
            default:
                if (jVar.e()) {
                    synchronized (this.f5908d) {
                    }
                    this.f5906b.execute(new A1.d(this, 27, jVar));
                    return;
                }
                return;
        }
    }

    @Override // c3.d
    public void onSuccess(Object obj) {
        ((j) this.f5907c).g(obj);
    }

    public h(Executor executor, b bVar) {
        this.f5905a = 3;
        this.f5908d = new Object();
        this.f5906b = executor;
        this.f5907c = bVar;
    }

    public h(Executor executor, c cVar) {
        this.f5905a = 4;
        this.f5908d = new Object();
        this.f5906b = executor;
        this.f5907c = cVar;
    }

    public h(Executor executor, d dVar) {
        this.f5905a = 5;
        this.f5908d = new Object();
        this.f5906b = executor;
        this.f5907c = dVar;
    }

    public h(Executor executor, h hVar) {
        this.f5905a = 2;
        this.f5908d = new Object();
        this.f5906b = executor;
        this.f5907c = hVar;
    }
}
