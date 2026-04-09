package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class D implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20837a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20838b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f20839c;

    /* renamed from: d, reason: collision with root package name */
    public final Supplier f20840d;

    public D(boolean z6, EnumC2418d3 enumC2418d3, Object obj, Predicate predicate, Supplier supplier) {
        this.f20837a = (z6 ? 0 : EnumC2413c3.f21038r) | EnumC2413c3.f21041u;
        this.f20838b = obj;
        this.f20839c = predicate;
        this.f20840d = supplier;
    }

    @Override // j$.util.stream.I3
    public final int v() {
        return this.f20837a;
    }

    @Override // j$.util.stream.I3
    public final Object f(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        J3 j32 = (J3) this.f20840d.get();
        abstractC2404b.w0(spliterator, j32);
        Object obj = j32.get();
        return obj != null ? obj : this.f20838b;
    }

    @Override // j$.util.stream.I3
    public final Object j(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        AbstractC2404b abstractC2404b = (AbstractC2404b) abstractC2510w1;
        return new J(this, EnumC2413c3.ORDERED.d(abstractC2404b.f21006m), abstractC2404b, spliterator).invoke();
    }
}
