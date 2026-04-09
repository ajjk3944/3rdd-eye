package tg;

import og.AbstractC7131a;

/* renamed from: tg.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8109u extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.p f62567b;

    /* renamed from: tg.u$a */
    static final class a extends AbstractC7131a {

        /* renamed from: f, reason: collision with root package name */
        final kg.p f62568f;

        a(gg.x xVar, kg.p pVar) {
            super(xVar);
            this.f62568f = pVar;
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f55683e != 0) {
                this.f55679a.h(null);
                return;
            }
            try {
                if (this.f62568f.test(obj)) {
                    this.f55679a.h(obj);
                }
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll;
            do {
                objPoll = this.f55681c.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.f62568f.test(objPoll));
            return objPoll;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return f(i10);
        }
    }

    public C8109u(gg.v vVar, kg.p pVar) {
        super(vVar);
        this.f62567b = pVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62567b));
    }
}
