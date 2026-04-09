package O6;

import I6.q;
import gg.s;
import gg.t;
import gg.u;
import gg.y;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;

/* loaded from: classes3.dex */
public class b implements O6.a {

    /* renamed from: a, reason: collision with root package name */
    final h f17582a = new h();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f17583a;

        a(y yVar) {
            this.f17583a = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    g gVarD = b.this.f17582a.d();
                    M6.j jVar = gVarD.f17611b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    L6.b.t(jVar);
                    L6.b.r(jVar);
                    j jVar2 = new j();
                    gVarD.b(jVar2, this.f17583a);
                    jVar2.a();
                    L6.b.o(jVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    q.e(e10, "Error while processing client operation queue", new Object[0]);
                }
            }
        }
    }

    /* renamed from: O6.b$b, reason: collision with other inner class name */
    class C0606b implements u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M6.j f17585a;

        /* renamed from: O6.b$b$a */
        class a implements InterfaceC6464a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f17587a;

            a(g gVar) {
                this.f17587a = gVar;
            }

            @Override // kg.InterfaceC6464a
            public void run() {
                if (b.this.f17582a.c(this.f17587a)) {
                    L6.b.q(C0606b.this.f17585a);
                }
            }
        }

        C0606b(M6.j jVar) {
            this.f17585a = jVar;
        }

        @Override // gg.u
        public void a(t tVar) {
            g gVar = new g(this.f17585a, tVar);
            tVar.g(InterfaceC6043c.p(new a(gVar)));
            L6.b.p(this.f17585a);
            b.this.f17582a.a(gVar);
        }
    }

    public b(y yVar) {
        new Thread(new a(yVar)).start();
    }

    @Override // O6.a
    public s a(M6.j jVar) {
        return s.o(new C0606b(jVar));
    }
}
