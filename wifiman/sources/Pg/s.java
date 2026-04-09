package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class s extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final Iterable f57988a;

    static final class a extends AtomicBoolean implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final C6042b f57989a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC5914d f57990b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f57991c;

        a(InterfaceC5914d interfaceC5914d, C6042b c6042b, AtomicInteger atomicInteger) {
            this.f57990b = interfaceC5914d;
            this.f57989a = c6042b;
            this.f57991c = atomicInteger;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (this.f57991c.decrementAndGet() == 0) {
                this.f57990b.a();
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57989a.a(interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57989a.dispose();
            set(true);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57989a.isDisposed();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57989a.dispose();
            if (compareAndSet(false, true)) {
                this.f57990b.onError(th2);
            } else {
                Eg.a.v(th2);
            }
        }
    }

    public s(Iterable iterable) {
        this.f57988a = iterable;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        C6042b c6042b = new C6042b();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        a aVar = new a(interfaceC5914d, c6042b, atomicInteger);
        interfaceC5914d.c(aVar);
        try {
            Iterator it = this.f57988a.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator it2 = it;
            while (!c6042b.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        aVar.a();
                        return;
                    }
                    if (c6042b.isDisposed()) {
                        return;
                    }
                    try {
                        Object next = it2.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        gg.f fVar = (gg.f) next;
                        if (c6042b.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        fVar.e(aVar);
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        c6042b.dispose();
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    c6042b.dispose();
                    aVar.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            AbstractC6152a.b(th4);
            interfaceC5914d.onError(th4);
        }
    }
}
