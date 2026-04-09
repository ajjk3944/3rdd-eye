package qg;

import ig.AbstractC6152a;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class u0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.p f59262c;

    static final class a implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59263a;

        /* renamed from: b, reason: collision with root package name */
        final kg.p f59264b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59265c;

        /* renamed from: d, reason: collision with root package name */
        boolean f59266d;

        a(Dj.b bVar, kg.p pVar) {
            this.f59263a = bVar;
            this.f59264b = pVar;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59266d) {
                return;
            }
            this.f59266d = true;
            this.f59263a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59265c.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59266d) {
                return;
            }
            this.f59263a.h(obj);
            try {
                if (this.f59264b.test(obj)) {
                    this.f59266d = true;
                    this.f59265c.cancel();
                    this.f59263a.a();
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59265c.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59265c, cVar)) {
                this.f59265c = cVar;
                this.f59263a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59266d) {
                Eg.a.v(th2);
            } else {
                this.f59266d = true;
                this.f59263a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59265c.request(j10);
        }
    }

    public u0(gg.i iVar, kg.p pVar) {
        super(iVar);
        this.f59262c = pVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59262c));
    }
}
