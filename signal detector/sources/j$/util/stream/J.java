package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class J extends AbstractC2409c {

    /* renamed from: j, reason: collision with root package name */
    public final D f20888j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20889k;

    public J(D d6, boolean z6, AbstractC2404b abstractC2404b, Spliterator spliterator) {
        super(abstractC2404b, spliterator);
        this.f20889k = z6;
        this.f20888j = d6;
    }

    public J(J j6, Spliterator spliterator) {
        super(j6, spliterator);
        this.f20889k = j6.f20889k;
        this.f20888j = j6.f20888j;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2409c
    public final Object h() {
        return this.f20888j.f20838b;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final Object a() {
        AbstractC2510w1 abstractC2510w1 = this.f21056a;
        J3 j32 = (J3) this.f20888j.f20840d.get();
        abstractC2510w1.w0(this.f21057b, j32);
        Object obj = j32.get();
        if (this.f20889k) {
            if (obj != null) {
                AbstractC2419e abstractC2419e = this;
                while (abstractC2419e != null) {
                    AbstractC2419e abstractC2419e2 = (AbstractC2419e) abstractC2419e.getCompleter();
                    if (abstractC2419e2 != null && abstractC2419e2.f21059d != abstractC2419e) {
                        g();
                        return obj;
                    }
                    abstractC2419e = abstractC2419e2;
                }
                AtomicReference atomicReference = this.f21021h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f21021h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f20889k) {
            J j6 = (J) this.f21059d;
            J j7 = null;
            while (true) {
                if (j6 != j7) {
                    Object objI = j6.i();
                    if (objI != null && this.f20888j.f20839c.test(objI)) {
                        d(objI);
                        AbstractC2419e abstractC2419e = this;
                        while (true) {
                            if (abstractC2419e != null) {
                                AbstractC2419e abstractC2419e2 = (AbstractC2419e) abstractC2419e.getCompleter();
                                if (abstractC2419e2 != null && abstractC2419e2.f21059d != abstractC2419e) {
                                    g();
                                    break;
                                }
                                abstractC2419e = abstractC2419e2;
                            } else {
                                AtomicReference atomicReference = this.f21021h;
                                while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        j7 = j6;
                        j6 = (J) this.f21060e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
