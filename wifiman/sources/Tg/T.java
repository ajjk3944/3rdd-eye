package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class T extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62209b;

    static final class a implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final Hg.b f62210a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62211b;

        a(Hg.b bVar, AtomicReference atomicReference) {
            this.f62210a = bVar;
            this.f62211b = atomicReference;
        }

        @Override // gg.x
        public void a() {
            this.f62210a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62211b, interfaceC6043c);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62210a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62210a.onError(th2);
        }
    }

    static final class b extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62212a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62213b;

        b(gg.x xVar) {
            this.f62212a = xVar;
        }

        @Override // gg.x
        public void a() {
            EnumC6592b.dispose(this);
            this.f62212a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62213b, interfaceC6043c)) {
                this.f62213b = interfaceC6043c;
                this.f62212a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62213b.dispose();
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62212a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62213b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            EnumC6592b.dispose(this);
            this.f62212a.onError(th2);
        }
    }

    public T(gg.v vVar, kg.n nVar) {
        super(vVar);
        this.f62209b = nVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        Hg.b bVarK1 = Hg.b.k1();
        try {
            Object objApply = this.f62209b.apply(bVarK1);
            Objects.requireNonNull(objApply, "The selector returned a null ObservableSource");
            gg.v vVar = (gg.v) objApply;
            b bVar = new b(xVar);
            vVar.d(bVar);
            this.f62287a.d(new a(bVarK1, bVar));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, xVar);
        }
    }
}
