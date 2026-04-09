package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class O1 extends S1 implements R1, InterfaceC2462m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f20929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f20930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2469o f20931d;

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2462m2
    public final /* synthetic */ void d(Integer num) {
        AbstractC2510w1.G(this, num);
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
        this.f20964a = this.f20931d.apply(this.f20964a, ((O1) r12).f20964a);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20964a = this.f20929b.get();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        this.f20930c.accept(this.f20964a, i);
    }

    public O1(Supplier supplier, ObjIntConsumer objIntConsumer, C2469o c2469o) {
        this.f20929b = supplier;
        this.f20930c = objIntConsumer;
        this.f20931d = c2469o;
    }
}
