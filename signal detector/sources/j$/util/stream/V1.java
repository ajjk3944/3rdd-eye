package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class V1 extends X1 implements InterfaceC2467n2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    @Override // j$.util.stream.S1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f20979b);
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20979b += ((X1) r12).f20979b;
    }

    @Override // j$.util.stream.X1, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        this.f20979b++;
    }
}
