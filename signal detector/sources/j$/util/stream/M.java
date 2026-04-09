package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class M extends P implements InterfaceC2462m2 {

    /* renamed from: b, reason: collision with root package name */
    public final IntConsumer f20911b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2462m2
    public final /* synthetic */ void d(Integer num) {
        AbstractC2510w1.G(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public M(IntConsumer intConsumer, boolean z6) {
        super(z6);
        this.f20911b = intConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        this.f20911b.accept(i);
    }
}
