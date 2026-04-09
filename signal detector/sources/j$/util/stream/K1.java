package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class K1 extends S1 implements R1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f20898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f20899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f20900d;

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20900d.accept(this.f20964a, ((K1) r12).f20964a);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20964a = this.f20898b.get();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f20899c.accept(this.f20964a, obj);
    }

    public K1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f20898b = supplier;
        this.f20899c = biConsumer;
        this.f20900d = biConsumer2;
    }
}
