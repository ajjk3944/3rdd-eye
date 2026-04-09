package tg;

import kg.InterfaceC6466c;
import og.AbstractC7131a;

/* renamed from: tg.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8101l extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62451b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6466c f62452c;

    /* renamed from: tg.l$a */
    static final class a extends AbstractC7131a {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f62453f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC6466c f62454g;

        /* renamed from: h, reason: collision with root package name */
        Object f62455h;

        /* renamed from: i, reason: collision with root package name */
        boolean f62456i;

        a(gg.x xVar, kg.n nVar, InterfaceC6466c interfaceC6466c) {
            super(xVar);
            this.f62453f = nVar;
            this.f62454g = interfaceC6466c;
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f55682d) {
                return;
            }
            if (this.f55683e != 0) {
                this.f55679a.h(obj);
                return;
            }
            try {
                Object objApply = this.f62453f.apply(obj);
                if (this.f62456i) {
                    boolean zA = this.f62454g.a(this.f62455h, objApply);
                    this.f62455h = objApply;
                    if (zA) {
                        return;
                    }
                } else {
                    this.f62456i = true;
                    this.f62455h = objApply;
                }
                this.f55679a.h(obj);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // Dg.g
        public Object poll() {
            while (true) {
                Object objPoll = this.f55681c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f62453f.apply(objPoll);
                if (!this.f62456i) {
                    this.f62456i = true;
                    this.f62455h = objApply;
                    return objPoll;
                }
                if (!this.f62454g.a(this.f62455h, objApply)) {
                    this.f62455h = objApply;
                    return objPoll;
                }
                this.f62455h = objApply;
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return f(i10);
        }
    }

    public C8101l(gg.v vVar, kg.n nVar, InterfaceC6466c interfaceC6466c) {
        super(vVar);
        this.f62451b = nVar;
        this.f62452c = interfaceC6466c;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62451b, this.f62452c));
    }
}
