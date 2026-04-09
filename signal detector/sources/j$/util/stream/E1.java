package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class E1 extends S1 implements R1, InterfaceC2457l2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f20848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f20849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2469o f20850d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20964a = this.f20850d.apply(this.f20964a, ((E1) r12).f20964a);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20964a = this.f20848b.get();
    }

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f20849c.accept(this.f20964a, d6);
    }

    public E1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C2469o c2469o) {
        this.f20848b = supplier;
        this.f20849c = objDoubleConsumer;
        this.f20850d = c2469o;
    }
}
