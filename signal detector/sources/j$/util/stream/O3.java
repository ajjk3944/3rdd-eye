package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class O3 extends AbstractC2442i2 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20934b;

    public O3(P3 p32, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20934b = true;
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21088a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        if (this.f20934b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return !this.f20934b || this.f21088a.e();
    }
}
