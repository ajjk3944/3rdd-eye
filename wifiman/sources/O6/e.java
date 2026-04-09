package O6;

import I6.q;
import K6.B;
import K6.InterfaceC3141n;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import gg.s;
import gg.t;
import gg.u;
import gg.y;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kg.InterfaceC6468e;

/* loaded from: classes3.dex */
public class e implements d, InterfaceC3141n {

    /* renamed from: a, reason: collision with root package name */
    private final String f17590a;

    /* renamed from: b, reason: collision with root package name */
    private final B f17591b;

    /* renamed from: c, reason: collision with root package name */
    private Cg.a f17592c;

    /* renamed from: e, reason: collision with root package name */
    private final Future f17594e;

    /* renamed from: d, reason: collision with root package name */
    final h f17593d = new h();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f17595f = true;

    /* renamed from: g, reason: collision with root package name */
    private BleException f17596g = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f17597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17598b;

        a(y yVar, String str) {
            this.f17597a = yVar;
            this.f17598b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f17595f) {
                try {
                    g gVarD = e.this.f17593d.d();
                    M6.j jVar = gVarD.f17611b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    L6.b.t(jVar);
                    L6.b.r(jVar);
                    j jVar2 = new j();
                    gVarD.b(jVar2, this.f17597a);
                    jVar2.a();
                    L6.b.o(jVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    synchronized (e.this) {
                        try {
                            if (e.this.f17595f) {
                                q.e(e10, "Error while processing connection operation queue", new Object[0]);
                            }
                        } finally {
                        }
                    }
                }
            }
            e.this.d();
            q.p("Terminated (%s)", L6.b.d(this.f17598b));
        }
    }

    class b implements u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M6.j f17600a;

        class a implements InterfaceC6468e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f17602a;

            a(g gVar) {
                this.f17602a = gVar;
            }

            @Override // kg.InterfaceC6468e
            public void cancel() {
                if (e.this.f17593d.c(this.f17602a)) {
                    L6.b.q(b.this.f17600a);
                }
            }
        }

        b(M6.j jVar) {
            this.f17600a = jVar;
        }

        @Override // gg.u
        public void a(t tVar) {
            g gVar = new g(this.f17600a, tVar);
            tVar.d(new a(gVar));
            L6.b.p(this.f17600a);
            e.this.f17593d.a(gVar);
        }
    }

    class c extends Cg.a {
        c() {
        }

        @Override // gg.x
        public void a() {
        }

        @Override // gg.x
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void h(BleException bleException) {
            e.this.e(bleException);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
        }
    }

    e(String str, B b10, ExecutorService executorService, y yVar) {
        this.f17590a = str;
        this.f17591b = b10;
        this.f17594e = executorService.submit(new a(yVar, str));
    }

    @Override // O6.a
    public synchronized s a(M6.j jVar) {
        if (this.f17595f) {
            return s.o(new b(jVar));
        }
        return s.L(this.f17596g);
    }

    @Override // K6.InterfaceC3141n
    public void b() {
        this.f17592c.dispose();
        this.f17592c = null;
        e(new BleDisconnectedException(this.f17590a, -1));
    }

    @Override // K6.InterfaceC3141n
    public void c() {
        this.f17592c = (Cg.a) this.f17591b.a().N0(new c());
    }

    synchronized void d() {
        while (!this.f17593d.b()) {
            this.f17593d.e().f17612c.c(this.f17596g);
        }
    }

    public synchronized void e(BleException bleException) {
        if (this.f17596g != null) {
            return;
        }
        q.c(bleException, "Connection operations queue to be terminated (%s)", L6.b.d(this.f17590a));
        this.f17595f = false;
        this.f17596g = bleException;
        this.f17594e.cancel(true);
    }
}
