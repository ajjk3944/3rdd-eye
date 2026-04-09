package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class S3 extends AbstractC2447j2 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20965b;

    public S3(J2 j22, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20965b = true;
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21100a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        if (this.f20965b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j6);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return !this.f20965b || this.f21100a.e();
    }
}
