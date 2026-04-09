package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2520y1 extends S1 implements R1, InterfaceC2467n2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f21199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f21200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2469o f21201d;

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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20964a = this.f21201d.apply(this.f20964a, ((C2520y1) r12).f20964a);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20964a = this.f21199b.get();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        this.f21200c.accept(this.f20964a, j6);
    }

    public C2520y1(Supplier supplier, ObjLongConsumer objLongConsumer, C2469o c2469o) {
        this.f21199b = supplier;
        this.f21200c = objLongConsumer;
        this.f21201d = c2469o;
    }
}
