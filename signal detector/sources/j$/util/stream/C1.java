package j$.util.stream;

import j$.util.C2393m;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class C1 implements R1, InterfaceC2457l2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20832a;

    /* renamed from: b, reason: collision with root package name */
    public double f20833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f20834c;

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

    public C1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f20834c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        C1 c12 = (C1) r12;
        if (c12.f20832a) {
            return;
        }
        accept(c12.f20833b);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20832a = true;
        this.f20833b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        if (this.f20832a) {
            this.f20832a = false;
            this.f20833b = d6;
        } else {
            this.f20833b = this.f20834c.applyAsDouble(this.f20833b, d6);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f20832a ? C2393m.f20807c : new C2393m(this.f20833b);
    }
}
