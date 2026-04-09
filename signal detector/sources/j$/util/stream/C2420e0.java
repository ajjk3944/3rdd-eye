package j$.util.stream;

import j$.util.C2532x;
import j$.util.Objects;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2420e0 extends AbstractC2447j2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21062b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532x f21063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2425f0 f21064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2420e0(C2425f0 c2425f0, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21064d = c2425f0;
        InterfaceC2472o2 interfaceC2472o22 = this.f21100a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f21063c = new C2532x(interfaceC2472o22, 1);
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21100a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) throws Exception {
        InterfaceC2460m0 interfaceC2460m0 = (InterfaceC2460m0) ((j$.util.function.g) this.f21064d.f21075t).apply(j6);
        if (interfaceC2460m0 != null) {
            try {
                boolean z6 = this.f21062b;
                C2532x c2532x = this.f21063c;
                if (!z6) {
                    interfaceC2460m0.sequential().forEach(c2532x);
                } else {
                    j$.util.K kSpliterator = interfaceC2460m0.sequential().spliterator();
                    while (!this.f21100a.e() && kSpliterator.tryAdvance((LongConsumer) c2532x)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC2460m0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC2460m0 != null) {
            interfaceC2460m0.close();
        }
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        this.f21062b = true;
        return this.f21100a.e();
    }
}
