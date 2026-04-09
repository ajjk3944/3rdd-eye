package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class O extends P {

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f20928b;

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

    public O(Consumer consumer, boolean z6) {
        super(z6);
        this.f20928b = consumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f20928b.o(obj);
    }
}
