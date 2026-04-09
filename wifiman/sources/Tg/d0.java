package tg;

import hg.InterfaceC6043c;
import java.util.NoSuchElementException;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class d0 extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62346a;

    /* renamed from: b, reason: collision with root package name */
    final Object f62347b;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62348a;

        /* renamed from: b, reason: collision with root package name */
        final Object f62349b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62350c;

        /* renamed from: d, reason: collision with root package name */
        Object f62351d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62352e;

        a(gg.B b10, Object obj) {
            this.f62348a = b10;
            this.f62349b = obj;
        }

        @Override // gg.x
        public void a() {
            if (this.f62352e) {
                return;
            }
            this.f62352e = true;
            Object obj = this.f62351d;
            this.f62351d = null;
            if (obj == null) {
                obj = this.f62349b;
            }
            if (obj != null) {
                this.f62348a.onSuccess(obj);
            } else {
                this.f62348a.onError(new NoSuchElementException());
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62350c, interfaceC6043c)) {
                this.f62350c = interfaceC6043c;
                this.f62348a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62350c.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62352e) {
                return;
            }
            if (this.f62351d == null) {
                this.f62351d = obj;
                return;
            }
            this.f62352e = true;
            this.f62350c.dispose();
            this.f62348a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62350c.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62352e) {
                Eg.a.v(th2);
            } else {
                this.f62352e = true;
                this.f62348a.onError(th2);
            }
        }
    }

    public d0(gg.v vVar, Object obj) {
        this.f62346a = vVar;
        this.f62347b = obj;
    }

    @Override // gg.z
    public void N(gg.B b10) {
        this.f62346a.d(new a(b10, this.f62347b));
    }
}
