package sg;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicInteger;
import yg.EnumC8672g;
import zg.C8750c;
import zg.EnumC8754g;

/* renamed from: sg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7957c extends AtomicInteger implements gg.l {

    /* renamed from: a, reason: collision with root package name */
    final C8750c f61506a = new C8750c();

    /* renamed from: b, reason: collision with root package name */
    final int f61507b;

    /* renamed from: c, reason: collision with root package name */
    final EnumC8754g f61508c;

    /* renamed from: d, reason: collision with root package name */
    Dg.g f61509d;

    /* renamed from: e, reason: collision with root package name */
    Dj.c f61510e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f61511f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f61512g;

    /* renamed from: h, reason: collision with root package name */
    boolean f61513h;

    public AbstractC7957c(int i10, EnumC8754g enumC8754g) {
        this.f61508c = enumC8754g;
        this.f61507b = i10;
    }

    @Override // Dj.b
    public final void a() {
        this.f61511f = true;
        g();
    }

    void c() {
    }

    abstract void d();

    abstract void g();

    @Override // Dj.b
    public final void h(Object obj) {
        if (obj == null || this.f61509d.offer(obj)) {
            g();
        } else {
            this.f61510e.cancel();
            onError(new QueueOverflowException());
        }
    }

    @Override // gg.l
    public final void j(Dj.c cVar) {
        if (EnumC8672g.validate(this.f61510e, cVar)) {
            this.f61510e = cVar;
            if (cVar instanceof Dg.d) {
                Dg.d dVar = (Dg.d) cVar;
                int iRequestFusion = dVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f61509d = dVar;
                    this.f61513h = true;
                    this.f61511f = true;
                    o();
                    g();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f61509d = dVar;
                    o();
                    this.f61510e.request(this.f61507b);
                    return;
                }
            }
            this.f61509d = new Dg.h(this.f61507b);
            o();
            this.f61510e.request(this.f61507b);
        }
    }

    abstract void o();

    @Override // Dj.b
    public final void onError(Throwable th2) {
        if (this.f61506a.g(th2)) {
            if (this.f61508c == EnumC8754g.IMMEDIATE) {
                d();
            }
            this.f61511f = true;
            g();
        }
    }

    final void s() {
        this.f61512g = true;
        this.f61510e.cancel();
        d();
        this.f61506a.h();
        if (getAndIncrement() == 0) {
            this.f61509d.clear();
            c();
        }
    }
}
