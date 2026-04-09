package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2489s0 implements InterfaceC2472o2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21157a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21158b;

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    public AbstractC2489s0(EnumC2494t0 enumC2494t0) {
        this.f21158b = !enumC2494t0.f21164b;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f21157a;
    }
}
