package qg;

import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class E extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    private final gg.v f58705b;

    static final class a implements gg.x, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58706a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f58707b;

        a(Dj.b bVar) {
            this.f58706a = bVar;
        }

        @Override // gg.x
        public void a() {
            this.f58706a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f58707b = interfaceC6043c;
            this.f58706a.j(this);
        }

        @Override // Dj.c
        public void cancel() {
            this.f58707b.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f58706a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f58706a.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
        }
    }

    public E(gg.v vVar) {
        this.f58705b = vVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58705b.d(new a(bVar));
    }
}
