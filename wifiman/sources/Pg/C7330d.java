package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import lg.C6595e;
import lg.EnumC6593c;

/* renamed from: pg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7330d extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final Iterable f57939a;

    /* renamed from: pg.d$a */
    static final class a extends AtomicInteger implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57940a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator f57941b;

        /* renamed from: c, reason: collision with root package name */
        final C6595e f57942c = new C6595e();

        a(InterfaceC5914d interfaceC5914d, Iterator it) {
            this.f57940a = interfaceC5914d;
            this.f57941b = it;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            d();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57942c.a(interfaceC6043c);
        }

        void d() {
            if (!this.f57942c.isDisposed() && getAndIncrement() == 0) {
                Iterator it = this.f57941b;
                while (!this.f57942c.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f57940a.a();
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            ((gg.f) next).e(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th2) {
                            AbstractC6152a.b(th2);
                            this.f57940a.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        AbstractC6152a.b(th3);
                        this.f57940a.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57940a.onError(th2);
        }
    }

    public C7330d(Iterable iterable) {
        this.f57939a = iterable;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        try {
            Iterator it = this.f57939a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            a aVar = new a(interfaceC5914d, it);
            interfaceC5914d.c(aVar.f57942c);
            aVar.d();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, interfaceC5914d);
        }
    }
}
