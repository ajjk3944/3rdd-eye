package qg;

import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6467d;
import yg.C8671f;

/* loaded from: classes4.dex */
public final class e0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6467d f58963c;

    static final class a extends AtomicInteger implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58964a;

        /* renamed from: b, reason: collision with root package name */
        final C8671f f58965b;

        /* renamed from: c, reason: collision with root package name */
        final Dj.a f58966c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC6467d f58967d;

        /* renamed from: e, reason: collision with root package name */
        long f58968e;

        a(Dj.b bVar, InterfaceC6467d interfaceC6467d, C8671f c8671f, Dj.a aVar) {
            this.f58964a = bVar;
            this.f58965b = c8671f;
            this.f58966c = aVar;
            this.f58967d = interfaceC6467d;
        }

        @Override // Dj.b
        public void a() {
            try {
                if (this.f58967d.a()) {
                    this.f58964a.a();
                } else {
                    c();
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f58964a.onError(th2);
            }
        }

        void c() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f58965b.n()) {
                    long j10 = this.f58968e;
                    if (j10 != 0) {
                        this.f58968e = 0L;
                        this.f58965b.p(j10);
                    }
                    this.f58966c.b(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58968e++;
            this.f58964a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            this.f58965b.r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58964a.onError(th2);
        }
    }

    public e0(gg.i iVar, InterfaceC6467d interfaceC6467d) {
        super(iVar);
        this.f58963c = interfaceC6467d;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        C8671f c8671f = new C8671f(false);
        bVar.j(c8671f);
        new a(bVar, this.f58963c, c8671f, this.f58857b).c();
    }
}
