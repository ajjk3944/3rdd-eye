package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2442i2 implements InterfaceC2462m2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2472o2 f21088a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
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

    public AbstractC2442i2(InterfaceC2472o2 interfaceC2472o2) {
        this.f21088a = (InterfaceC2472o2) Objects.requireNonNull(interfaceC2472o2);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        this.f21088a.c(j6);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void m() {
        this.f21088a.m();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public boolean e() {
        return this.f21088a.e();
    }
}
