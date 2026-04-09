package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2437h2 implements InterfaceC2457l2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2472o2 f21082a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
    }

    public AbstractC2437h2(InterfaceC2472o2 interfaceC2472o2) {
        this.f21082a = (InterfaceC2472o2) Objects.requireNonNull(interfaceC2472o2);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        this.f21082a.c(j6);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void m() {
        this.f21082a.m();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public boolean e() {
        return this.f21082a.e();
    }
}
