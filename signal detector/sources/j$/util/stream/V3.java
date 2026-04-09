package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class V3 extends AbstractC2437h2 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20974b;

    public V3(H2 h22, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20974b = true;
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21082a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        if (this.f20974b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d6);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return !this.f20974b || this.f21082a.e();
    }
}
