package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class G1 extends S1 implements R1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f20866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f20867d;

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
        this.f20964a = this.f20867d.apply(this.f20964a, ((G1) r12).f20964a);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20964a = this.f20865b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f20964a = this.f20866c.apply(this.f20964a, obj);
    }

    public G1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f20865b = obj;
        this.f20866c = biFunction;
        this.f20867d = binaryOperator;
    }
}
