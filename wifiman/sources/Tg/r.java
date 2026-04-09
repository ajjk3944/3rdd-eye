package tg;

import hg.InterfaceC6043c;
import java.util.NoSuchElementException;
import lg.EnumC6592b;
import ng.InterfaceC6943d;

/* loaded from: classes4.dex */
public final class r extends gg.z implements InterfaceC6943d {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62556a;

    /* renamed from: b, reason: collision with root package name */
    final long f62557b;

    /* renamed from: c, reason: collision with root package name */
    final Object f62558c;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62559a;

        /* renamed from: b, reason: collision with root package name */
        final long f62560b;

        /* renamed from: c, reason: collision with root package name */
        final Object f62561c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6043c f62562d;

        /* renamed from: e, reason: collision with root package name */
        long f62563e;

        /* renamed from: f, reason: collision with root package name */
        boolean f62564f;

        a(gg.B b10, long j10, Object obj) {
            this.f62559a = b10;
            this.f62560b = j10;
            this.f62561c = obj;
        }

        @Override // gg.x
        public void a() {
            if (this.f62564f) {
                return;
            }
            this.f62564f = true;
            Object obj = this.f62561c;
            if (obj != null) {
                this.f62559a.onSuccess(obj);
            } else {
                this.f62559a.onError(new NoSuchElementException());
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62562d, interfaceC6043c)) {
                this.f62562d = interfaceC6043c;
                this.f62559a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62562d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62564f) {
                return;
            }
            long j10 = this.f62563e;
            if (j10 != this.f62560b) {
                this.f62563e = j10 + 1;
                return;
            }
            this.f62564f = true;
            this.f62562d.dispose();
            this.f62559a.onSuccess(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62562d.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62564f) {
                Eg.a.v(th2);
            } else {
                this.f62564f = true;
                this.f62559a.onError(th2);
            }
        }
    }

    public r(gg.v vVar, long j10, Object obj) {
        this.f62556a = vVar;
        this.f62557b = j10;
        this.f62558c = obj;
    }

    @Override // gg.z
    public void N(gg.B b10) {
        this.f62556a.d(new a(b10, this.f62557b, this.f62558c));
    }

    @Override // ng.InterfaceC6943d
    public gg.s b() {
        return Eg.a.q(new C8105p(this.f62556a, this.f62557b, this.f62558c, true));
    }
}
