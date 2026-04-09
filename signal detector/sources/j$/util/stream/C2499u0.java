package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2499u0 extends AbstractC2409c {

    /* renamed from: j, reason: collision with root package name */
    public final j$.util.concurrent.t f21171j;

    public C2499u0(j$.util.concurrent.t tVar, AbstractC2404b abstractC2404b, Spliterator spliterator) {
        super(abstractC2404b, spliterator);
        this.f21171j = tVar;
    }

    public C2499u0(C2499u0 c2499u0, Spliterator spliterator) {
        super(c2499u0, spliterator);
        this.f21171j = c2499u0.f21171j;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new C2499u0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2419e
    public final Object a() {
        AbstractC2510w1 abstractC2510w1 = this.f21056a;
        AbstractC2489s0 abstractC2489s0 = (AbstractC2489s0) ((Supplier) this.f21171j.f20763c).get();
        abstractC2510w1.w0(this.f21057b, abstractC2489s0);
        boolean z6 = abstractC2489s0.f21158b;
        if (z6 == ((EnumC2494t0) this.f21171j.f20762b).f21164b) {
            Boolean boolValueOf = Boolean.valueOf(z6);
            AtomicReference atomicReference = this.f21021h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC2409c
    public final Object h() {
        return Boolean.valueOf(!((EnumC2494t0) this.f21171j.f20762b).f21164b);
    }
}
