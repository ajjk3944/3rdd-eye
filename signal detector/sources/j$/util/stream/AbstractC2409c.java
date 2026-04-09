package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2409c extends AbstractC2419e {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f21021h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC2409c(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        super(abstractC2510w1, spliterator);
        this.f21021h = new AtomicReference(null);
    }

    public AbstractC2409c(AbstractC2409c abstractC2409c, Spliterator spliterator) {
        super(abstractC2409c, spliterator);
        this.f21021h = abstractC2409c.f21021h;
    }

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f21057b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f21058c;
        if (jE == 0) {
            jE = AbstractC2419e.e(jEstimateSize);
            this.f21058c = jE;
        }
        AtomicReference atomicReference = this.f21021h;
        boolean z6 = false;
        AbstractC2409c abstractC2409c = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z7 = abstractC2409c.i;
            if (!z7) {
                CountedCompleter<?> completer = abstractC2409c.getCompleter();
                while (true) {
                    AbstractC2409c abstractC2409c2 = (AbstractC2409c) ((AbstractC2419e) completer);
                    if (z7 || abstractC2409c2 == null) {
                        break;
                    }
                    z7 = abstractC2409c2.i;
                    completer = abstractC2409c2.getCompleter();
                }
            }
            if (z7) {
                objH = abstractC2409c.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC2409c abstractC2409c3 = (AbstractC2409c) abstractC2409c.c(spliteratorTrySplit);
            abstractC2409c.f21059d = abstractC2409c3;
            AbstractC2409c abstractC2409c4 = (AbstractC2409c) abstractC2409c.c(spliterator);
            abstractC2409c.f21060e = abstractC2409c4;
            abstractC2409c.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC2409c = abstractC2409c3;
                abstractC2409c3 = abstractC2409c4;
            } else {
                abstractC2409c = abstractC2409c4;
            }
            z6 = !z6;
            abstractC2409c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = abstractC2409c.a();
        abstractC2409c.d(objH);
        abstractC2409c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC2419e
    public final void d(Object obj) {
        if (!b()) {
            this.f21061f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f21021h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.f21021h.get();
            return obj == null ? h() : obj;
        }
        return this.f21061f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC2409c abstractC2409c = this;
        for (AbstractC2409c abstractC2409c2 = (AbstractC2409c) ((AbstractC2419e) getCompleter()); abstractC2409c2 != null; abstractC2409c2 = (AbstractC2409c) ((AbstractC2419e) abstractC2409c2.getCompleter())) {
            if (abstractC2409c2.f21059d == abstractC2409c) {
                AbstractC2409c abstractC2409c3 = (AbstractC2409c) abstractC2409c2.f21060e;
                if (!abstractC2409c3.i) {
                    abstractC2409c3.f();
                }
            }
            abstractC2409c = abstractC2409c2;
        }
    }
}
