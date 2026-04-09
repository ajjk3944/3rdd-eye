package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import kg.InterfaceC6465b;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class b0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6465b f62301b;

    /* renamed from: c, reason: collision with root package name */
    final kg.q f62302c;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62303a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6465b f62304b;

        /* renamed from: c, reason: collision with root package name */
        Object f62305c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6043c f62306d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62307e;

        a(gg.x xVar, InterfaceC6465b interfaceC6465b, Object obj) {
            this.f62303a = xVar;
            this.f62304b = interfaceC6465b;
            this.f62305c = obj;
        }

        @Override // gg.x
        public void a() {
            if (this.f62307e) {
                return;
            }
            this.f62307e = true;
            this.f62303a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62306d, interfaceC6043c)) {
                this.f62306d = interfaceC6043c;
                this.f62303a.c(this);
                this.f62303a.h(this.f62305c);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62306d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62307e) {
                return;
            }
            try {
                Object objApply = this.f62304b.apply(this.f62305c, obj);
                Objects.requireNonNull(objApply, "The accumulator returned a null value");
                this.f62305c = objApply;
                this.f62303a.h(objApply);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62306d.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62306d.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62307e) {
                Eg.a.v(th2);
            } else {
                this.f62307e = true;
                this.f62303a.onError(th2);
            }
        }
    }

    public b0(gg.v vVar, kg.q qVar, InterfaceC6465b interfaceC6465b) {
        super(vVar);
        this.f62301b = interfaceC6465b;
        this.f62302c = qVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        try {
            Object obj = this.f62302c.get();
            Objects.requireNonNull(obj, "The seed supplied is null");
            this.f62287a.d(new a(xVar, this.f62301b, obj));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, xVar);
        }
    }
}
