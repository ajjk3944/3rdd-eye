package qg;

import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class H extends AbstractC7484b {

    static final class a implements gg.l, Dg.d {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58719a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f58720b;

        a(Dj.b bVar) {
            this.f58719a = bVar;
        }

        @Override // Dj.b
        public void a() {
            this.f58719a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f58720b.cancel();
        }

        @Override // Dg.g
        public void clear() {
        }

        @Override // Dj.b
        public void h(Object obj) {
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return true;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58720b, cVar)) {
                this.f58720b = cVar;
                this.f58719a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dg.g
        public boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58719a.onError(th2);
        }

        @Override // Dg.g
        public Object poll() {
            return null;
        }

        @Override // Dj.c
        public void request(long j10) {
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public H(gg.i iVar) {
        super(iVar);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar));
    }
}
