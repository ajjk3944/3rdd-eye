package qg;

import ig.AbstractC6152a;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import yg.EnumC8669d;
import yg.EnumC8672g;

/* renamed from: qg.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7498p extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6469f f59180c;

    /* renamed from: d, reason: collision with root package name */
    private final kg.o f59181d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6464a f59182e;

    /* renamed from: qg.p$a */
    static final class a implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59183a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6469f f59184b;

        /* renamed from: c, reason: collision with root package name */
        final kg.o f59185c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC6464a f59186d;

        /* renamed from: e, reason: collision with root package name */
        Dj.c f59187e;

        a(Dj.b bVar, InterfaceC6469f interfaceC6469f, kg.o oVar, InterfaceC6464a interfaceC6464a) {
            this.f59183a = bVar;
            this.f59184b = interfaceC6469f;
            this.f59186d = interfaceC6464a;
            this.f59185c = oVar;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59187e != EnumC8672g.CANCELLED) {
                this.f59183a.a();
            }
        }

        @Override // Dj.c
        public void cancel() {
            Dj.c cVar = this.f59187e;
            EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
            if (cVar != enumC8672g) {
                this.f59187e = enumC8672g;
                try {
                    this.f59186d.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
                cVar.cancel();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59183a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            try {
                this.f59184b.accept(cVar);
                if (EnumC8672g.validate(this.f59187e, cVar)) {
                    this.f59187e = cVar;
                    this.f59183a.j(this);
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                cVar.cancel();
                this.f59187e = EnumC8672g.CANCELLED;
                EnumC8669d.error(th2, this.f59183a);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59187e != EnumC8672g.CANCELLED) {
                this.f59183a.onError(th2);
            } else {
                Eg.a.v(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            try {
                this.f59185c.a(j10);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
            this.f59187e.request(j10);
        }
    }

    public C7498p(gg.i iVar, InterfaceC6469f interfaceC6469f, kg.o oVar, InterfaceC6464a interfaceC6464a) {
        super(iVar);
        this.f59180c = interfaceC6469f;
        this.f59181d = oVar;
        this.f59182e = interfaceC6464a;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59180c, this.f59181d, this.f59182e));
    }
}
