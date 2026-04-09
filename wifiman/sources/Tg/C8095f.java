package tg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;
import ng.InterfaceC6943d;

/* renamed from: tg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8095f extends gg.z implements InterfaceC6943d {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62360a;

    /* renamed from: tg.f$a */
    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62361a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62362b;

        /* renamed from: c, reason: collision with root package name */
        long f62363c;

        a(gg.B b10) {
            this.f62361a = b10;
        }

        @Override // gg.x
        public void a() {
            this.f62362b = EnumC6592b.DISPOSED;
            this.f62361a.onSuccess(Long.valueOf(this.f62363c));
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62362b, interfaceC6043c)) {
                this.f62362b = interfaceC6043c;
                this.f62361a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62362b.dispose();
            this.f62362b = EnumC6592b.DISPOSED;
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62363c++;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62362b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62362b = EnumC6592b.DISPOSED;
            this.f62361a.onError(th2);
        }
    }

    public C8095f(gg.v vVar) {
        this.f62360a = vVar;
    }

    @Override // gg.z
    public void N(gg.B b10) {
        this.f62360a.d(new a(b10));
    }

    @Override // ng.InterfaceC6943d
    public gg.s b() {
        return Eg.a.q(new C8094e(this.f62360a));
    }
}
