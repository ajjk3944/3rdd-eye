package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class L extends P implements InterfaceC2457l2 {

    /* renamed from: b, reason: collision with root package name */
    public final DoubleConsumer f20904b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
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

    public L(DoubleConsumer doubleConsumer, boolean z6) {
        super(z6);
        this.f20904b = doubleConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f20904b.accept(d6);
    }
}
