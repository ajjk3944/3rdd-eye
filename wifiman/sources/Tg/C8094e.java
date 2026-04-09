package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* renamed from: tg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8094e extends AbstractC8090a {

    /* renamed from: tg.e$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62353a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62354b;

        /* renamed from: c, reason: collision with root package name */
        long f62355c;

        a(gg.x xVar) {
            this.f62353a = xVar;
        }

        @Override // gg.x
        public void a() {
            this.f62353a.h(Long.valueOf(this.f62355c));
            this.f62353a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62354b, interfaceC6043c)) {
                this.f62354b = interfaceC6043c;
                this.f62353a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62354b.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62355c++;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62354b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62353a.onError(th2);
        }
    }

    public C8094e(gg.v vVar) {
        super(vVar);
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar));
    }
}
