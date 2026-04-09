package qg;

import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class n0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59156c;

    static final class a implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59157a;

        /* renamed from: b, reason: collision with root package name */
        long f59158b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59159c;

        a(Dj.b bVar, long j10) {
            this.f59157a = bVar;
            this.f59158b = j10;
        }

        @Override // Dj.b
        public void a() {
            this.f59157a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59159c.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = this.f59158b;
            if (j10 != 0) {
                this.f59158b = j10 - 1;
            } else {
                this.f59157a.h(obj);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59159c, cVar)) {
                long j10 = this.f59158b;
                this.f59159c = cVar;
                this.f59157a.j(this);
                cVar.request(j10);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59157a.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59159c.request(j10);
        }
    }

    public n0(gg.i iVar, long j10) {
        super(iVar);
        this.f59156c = j10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59156c));
    }
}
