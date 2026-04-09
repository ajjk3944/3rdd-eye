package qg;

import yg.C8671f;

/* loaded from: classes4.dex */
public final class q0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final Dj.a f59207c;

    static final class a implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59208a;

        /* renamed from: b, reason: collision with root package name */
        final Dj.a f59209b;

        /* renamed from: d, reason: collision with root package name */
        boolean f59211d = true;

        /* renamed from: c, reason: collision with root package name */
        final C8671f f59210c = new C8671f(false);

        a(Dj.b bVar, Dj.a aVar) {
            this.f59208a = bVar;
            this.f59209b = aVar;
        }

        @Override // Dj.b
        public void a() {
            if (!this.f59211d) {
                this.f59208a.a();
            } else {
                this.f59211d = false;
                this.f59209b.b(this);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59211d) {
                this.f59211d = false;
            }
            this.f59208a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            this.f59210c.r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59208a.onError(th2);
        }
    }

    public q0(gg.i iVar, Dj.a aVar) {
        super(iVar);
        this.f59207c = aVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar, this.f59207c);
        bVar.j(aVar.f59210c);
        this.f58857b.D1(aVar);
    }
}
