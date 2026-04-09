package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class r extends AbstractC7607a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f60566b;

    static final class a extends AtomicReference implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60567a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f60568b;

        /* renamed from: rg.r$a$a, reason: collision with other inner class name */
        static final class C2121a implements gg.p {

            /* renamed from: a, reason: collision with root package name */
            final gg.p f60569a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference f60570b;

            C2121a(gg.p pVar, AtomicReference atomicReference) {
                this.f60569a = pVar;
                this.f60570b = atomicReference;
            }

            @Override // gg.p
            public void a() {
                this.f60569a.a();
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this.f60570b, interfaceC6043c);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                this.f60569a.onError(th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                this.f60569a.onSuccess(obj);
            }
        }

        a(gg.p pVar, kg.n nVar) {
            this.f60567a = pVar;
            this.f60568b = nVar;
        }

        @Override // gg.p
        public void a() {
            this.f60567a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                this.f60567a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            try {
                Object objApply = this.f60568b.apply(th2);
                Objects.requireNonNull(objApply, "The resumeFunction returned a null MaybeSource");
                gg.r rVar = (gg.r) objApply;
                EnumC6592b.replace(this, null);
                rVar.a(new C2121a(this.f60567a, this));
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f60567a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60567a.onSuccess(obj);
        }
    }

    public r(gg.r rVar, kg.n nVar) {
        super(rVar);
        this.f60566b = nVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar, this.f60566b));
    }
}
