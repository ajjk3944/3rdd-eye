package j$.util.stream;

import j$.util.C2394n;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class N1 implements R1, InterfaceC2462m2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20922a;

    /* renamed from: b, reason: collision with root package name */
    public int f20923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f20924c;

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

    public N1(IntBinaryOperator intBinaryOperator) {
        this.f20924c = intBinaryOperator;
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        N1 n12 = (N1) r12;
        if (n12.f20922a) {
            return;
        }
        accept(n12.f20923b);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20922a = true;
        this.f20923b = 0;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        if (this.f20922a) {
            this.f20922a = false;
            this.f20923b = i;
        } else {
            this.f20923b = this.f20924c.applyAsInt(this.f20923b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f20922a ? C2394n.f20810c : new C2394n(this.f20923b);
    }
}
