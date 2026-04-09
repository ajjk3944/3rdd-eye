package qg;

import ig.AbstractC6152a;
import kg.InterfaceC6464a;
import yg.AbstractC8666a;
import yg.EnumC8672g;

/* renamed from: qg.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7496n extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6464a f59145c;

    /* renamed from: qg.n$a */
    static final class a extends AbstractC8666a implements Dg.a {

        /* renamed from: a, reason: collision with root package name */
        final Dg.a f59146a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6464a f59147b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59148c;

        /* renamed from: d, reason: collision with root package name */
        Dg.d f59149d;

        /* renamed from: e, reason: collision with root package name */
        boolean f59150e;

        a(Dg.a aVar, InterfaceC6464a interfaceC6464a) {
            this.f59146a = aVar;
            this.f59147b = interfaceC6464a;
        }

        @Override // Dj.b
        public void a() {
            this.f59146a.a();
            d();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59148c.cancel();
            d();
        }

        @Override // Dg.g
        public void clear() {
            this.f59149d.clear();
        }

        void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59147b.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59146a.h(obj);
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f59149d.isEmpty();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59148c, cVar)) {
                this.f59148c = cVar;
                if (cVar instanceof Dg.d) {
                    this.f59149d = (Dg.d) cVar;
                }
                this.f59146a.j(this);
            }
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            return this.f59146a.m(obj);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59146a.onError(th2);
            d();
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f59149d.poll();
            if (objPoll == null && this.f59150e) {
                d();
            }
            return objPoll;
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59148c.request(j10);
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            Dg.d dVar = this.f59149d;
            if (dVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = dVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f59150e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    /* renamed from: qg.n$b */
    static final class b extends AbstractC8666a implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59151a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6464a f59152b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59153c;

        /* renamed from: d, reason: collision with root package name */
        Dg.d f59154d;

        /* renamed from: e, reason: collision with root package name */
        boolean f59155e;

        b(Dj.b bVar, InterfaceC6464a interfaceC6464a) {
            this.f59151a = bVar;
            this.f59152b = interfaceC6464a;
        }

        @Override // Dj.b
        public void a() {
            this.f59151a.a();
            d();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59153c.cancel();
            d();
        }

        @Override // Dg.g
        public void clear() {
            this.f59154d.clear();
        }

        void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59152b.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59151a.h(obj);
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f59154d.isEmpty();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59153c, cVar)) {
                this.f59153c = cVar;
                if (cVar instanceof Dg.d) {
                    this.f59154d = (Dg.d) cVar;
                }
                this.f59151a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59151a.onError(th2);
            d();
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f59154d.poll();
            if (objPoll == null && this.f59155e) {
                d();
            }
            return objPoll;
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59153c.request(j10);
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            Dg.d dVar = this.f59154d;
            if (dVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = dVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f59155e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public C7496n(gg.i iVar, InterfaceC6464a interfaceC6464a) {
        super(iVar);
        this.f59145c = interfaceC6464a;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new a((Dg.a) bVar, this.f59145c));
        } else {
            this.f58857b.D1(new b(bVar, this.f59145c));
        }
    }
}
