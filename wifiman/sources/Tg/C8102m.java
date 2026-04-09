package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import kg.InterfaceC6464a;
import lg.EnumC6592b;
import og.AbstractC7132b;

/* renamed from: tg.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8102m extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6464a f62472b;

    /* renamed from: tg.m$a */
    static final class a extends AbstractC7132b implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62473a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6464a f62474b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62475c;

        /* renamed from: d, reason: collision with root package name */
        Dg.b f62476d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62477e;

        a(gg.x xVar, InterfaceC6464a interfaceC6464a) {
            this.f62473a = xVar;
            this.f62474b = interfaceC6464a;
        }

        @Override // gg.x
        public void a() {
            this.f62473a.a();
            d();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62475c, interfaceC6043c)) {
                this.f62475c = interfaceC6043c;
                if (interfaceC6043c instanceof Dg.b) {
                    this.f62476d = (Dg.b) interfaceC6043c;
                }
                this.f62473a.c(this);
            }
        }

        @Override // Dg.g
        public void clear() {
            this.f62476d.clear();
        }

        void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f62474b.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62475c.dispose();
            d();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62473a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62475c.isDisposed();
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f62476d.isEmpty();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62473a.onError(th2);
            d();
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f62476d.poll();
            if (objPoll == null && this.f62477e) {
                d();
            }
            return objPoll;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            Dg.b bVar = this.f62476d;
            if (bVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = bVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f62477e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public C8102m(gg.v vVar, InterfaceC6464a interfaceC6464a) {
        super(vVar);
        this.f62472b = interfaceC6464a;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62472b));
    }
}
