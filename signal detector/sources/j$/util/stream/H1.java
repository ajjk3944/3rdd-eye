package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class H1 implements R1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20872a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f20874c;

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

    public H1(BinaryOperator binaryOperator) {
        this.f20874c = binaryOperator;
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        H1 h12 = (H1) r12;
        if (h12.f20872a) {
            return;
        }
        o(h12.f20873b);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20872a = true;
        this.f20873b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        if (this.f20872a) {
            this.f20872a = false;
            this.f20873b = obj;
        } else {
            this.f20873b = this.f20874c.apply(this.f20873b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f20872a ? Optional.empty() : Optional.of(this.f20873b);
    }
}
