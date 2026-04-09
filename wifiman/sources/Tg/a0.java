package tg;

import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public abstract class a0 {

    public static final class a extends AtomicInteger implements Dg.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62288a;

        /* renamed from: b, reason: collision with root package name */
        final Object f62289b;

        public a(gg.x xVar, Object obj) {
            this.f62288a = xVar;
            this.f62289b = obj;
        }

        @Override // Dg.g
        public void clear() {
            lazySet(3);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            set(3);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // Dg.g
        public boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // Dg.g
        public Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f62289b;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f62288a.h(this.f62289b);
                if (get() == 2) {
                    lazySet(3);
                    this.f62288a.a();
                }
            }
        }
    }

    static final class b extends gg.s {

        /* renamed from: a, reason: collision with root package name */
        final Object f62290a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62291b;

        b(Object obj, kg.n nVar) {
            this.f62290a = obj;
            this.f62291b = nVar;
        }

        @Override // gg.s
        public void L0(gg.x xVar) {
            try {
                Object objApply = this.f62291b.apply(this.f62290a);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                gg.v vVar = (gg.v) objApply;
                if (!(vVar instanceof kg.q)) {
                    vVar.d(xVar);
                    return;
                }
                try {
                    Object obj = ((kg.q) vVar).get();
                    if (obj == null) {
                        EnumC6593c.complete(xVar);
                        return;
                    }
                    a aVar = new a(xVar, obj);
                    xVar.c(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    EnumC6593c.error(th2, xVar);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                EnumC6593c.error(th3, xVar);
            }
        }
    }

    public static gg.s a(Object obj, kg.n nVar) {
        return Eg.a.q(new b(obj, nVar));
    }

    public static boolean b(gg.v vVar, gg.x xVar, kg.n nVar) {
        if (!(vVar instanceof kg.q)) {
            return false;
        }
        try {
            Object obj = ((kg.q) vVar).get();
            if (obj == null) {
                EnumC6593c.complete(xVar);
                return true;
            }
            try {
                Object objApply = nVar.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                gg.v vVar2 = (gg.v) objApply;
                if (vVar2 instanceof kg.q) {
                    try {
                        Object obj2 = ((kg.q) vVar2).get();
                        if (obj2 == null) {
                            EnumC6593c.complete(xVar);
                            return true;
                        }
                        a aVar = new a(xVar, obj2);
                        xVar.c(aVar);
                        aVar.run();
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        EnumC6593c.error(th2, xVar);
                        return true;
                    }
                } else {
                    vVar2.d(xVar);
                }
                return true;
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                EnumC6593c.error(th3, xVar);
                return true;
            }
        } catch (Throwable th4) {
            AbstractC6152a.b(th4);
            EnumC6593c.error(th4, xVar);
            return true;
        }
    }
}
