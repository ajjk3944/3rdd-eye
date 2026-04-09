package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class U1 extends X1 implements InterfaceC2462m2 {
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

    @Override // j$.util.stream.S1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f20979b);
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20979b += ((X1) r12).f20979b;
    }

    @Override // j$.util.stream.X1, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        this.f20979b++;
    }
}
