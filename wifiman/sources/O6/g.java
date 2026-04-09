package O6;

import gg.t;
import gg.x;
import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
class g implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f17609d = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f17610a = f17609d.getAndIncrement();

    /* renamed from: b, reason: collision with root package name */
    final M6.j f17611b;

    /* renamed from: c, reason: collision with root package name */
    final t f17612c;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f17613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f17614b;

        /* renamed from: O6.g$a$a, reason: collision with other inner class name */
        class C0607a implements x {
            C0607a() {
            }

            @Override // gg.x
            public void a() {
                g.this.f17612c.a();
            }

            @Override // gg.x
            public void c(InterfaceC6043c interfaceC6043c) {
                g.this.f17612c.g(interfaceC6043c);
            }

            @Override // gg.x
            public void h(Object obj) {
                g.this.f17612c.h(obj);
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                g.this.f17612c.c(th2);
            }
        }

        a(j jVar, y yVar) {
            this.f17613a = jVar;
            this.f17614b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f17611b.N0(this.f17613a).e1(this.f17614b).d(new C0607a());
        }
    }

    g(M6.j jVar, t tVar) {
        this.f17611b = jVar;
        this.f17612c = tVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        int iCompareTo = this.f17611b.compareTo(gVar.f17611b);
        if (iCompareTo != 0 || gVar.f17611b == this.f17611b) {
            return iCompareTo;
        }
        return this.f17610a < gVar.f17610a ? -1 : 1;
    }

    public void b(j jVar, y yVar) {
        if (!this.f17612c.isDisposed()) {
            yVar.e(new a(jVar, yVar));
        } else {
            L6.b.s(this.f17611b);
            jVar.release();
        }
    }
}
