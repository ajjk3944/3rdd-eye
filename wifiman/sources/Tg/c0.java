package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class c0 extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62312a;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f62313a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62314b;

        /* renamed from: c, reason: collision with root package name */
        Object f62315c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62316d;

        a(gg.p pVar) {
            this.f62313a = pVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62316d) {
                return;
            }
            this.f62316d = true;
            Object obj = this.f62315c;
            this.f62315c = null;
            if (obj == null) {
                this.f62313a.a();
            } else {
                this.f62313a.onSuccess(obj);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62314b, interfaceC6043c)) {
                this.f62314b = interfaceC6043c;
                this.f62313a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62314b.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62316d) {
                return;
            }
            if (this.f62315c == null) {
                this.f62315c = obj;
                return;
            }
            this.f62316d = true;
            this.f62314b.dispose();
            this.f62313a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62314b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62316d) {
                Eg.a.v(th2);
            } else {
                this.f62316d = true;
                this.f62313a.onError(th2);
            }
        }
    }

    public c0(gg.v vVar) {
        this.f62312a = vVar;
    }

    @Override // gg.n
    public void v(gg.p pVar) {
        this.f62312a.d(new a(pVar));
    }
}
