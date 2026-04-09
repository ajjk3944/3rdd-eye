package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2452k2 implements InterfaceC2472o2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2472o2 f21108a;

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

    public AbstractC2452k2(InterfaceC2472o2 interfaceC2472o2) {
        this.f21108a = (InterfaceC2472o2) Objects.requireNonNull(interfaceC2472o2);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        this.f21108a.c(j6);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void m() {
        this.f21108a.m();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public boolean e() {
        return this.f21108a.e();
    }
}
