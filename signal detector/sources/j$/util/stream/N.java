package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class N extends P implements InterfaceC2467n2 {

    /* renamed from: b, reason: collision with root package name */
    public final LongConsumer f20921b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    @Override // j$.util.stream.I3
    public final Object f(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        abstractC2404b.w0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.I3
    public final /* bridge */ /* synthetic */ Object j(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        a(abstractC2510w1, spliterator);
        return null;
    }

    public N(LongConsumer longConsumer, boolean z6) {
        super(z6);
        this.f20921b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        this.f20921b.accept(j6);
    }
}
