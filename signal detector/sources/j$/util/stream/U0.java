package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class U0 extends S2 implements A0, InterfaceC2504v0 {
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

    @Override // j$.util.stream.InterfaceC2504v0, j$.util.stream.InterfaceC2519y0
    public final A0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.T(this, j6, j7);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC2510w1.M(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC2510w1.N(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.F0
    public final void f(Object obj, int i) {
        super.f((double[]) obj, i);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.F0
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.N spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        clear();
        t(j6);
    }

    @Override // j$.util.stream.Y2, j$.util.stream.F0
    public final Object b() {
        return (double[]) super.b();
    }
}
