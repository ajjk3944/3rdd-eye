package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2447j2 implements InterfaceC2467n2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2472o2 f21100a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    public AbstractC2447j2(InterfaceC2472o2 interfaceC2472o2) {
        this.f21100a = (InterfaceC2472o2) Objects.requireNonNull(interfaceC2472o2);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        this.f21100a.c(j6);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public void m() {
        this.f21100a.m();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public boolean e() {
        return this.f21100a.e();
    }
}
