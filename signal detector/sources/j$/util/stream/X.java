package j$.util.stream;

import j$.util.C2528t;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class X extends AbstractC2442i2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20976b;

    /* renamed from: c, reason: collision with root package name */
    public final C2528t f20977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f20978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(V v6, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f20978d = v6;
        InterfaceC2472o2 interfaceC2472o22 = this.f21088a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f20977c = new C2528t(interfaceC2472o22, 1);
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21088a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((K) this.f20978d.f20972t).apply(i);
        if (intStream != null) {
            try {
                boolean z6 = this.f20976b;
                C2528t c2528t = this.f20977c;
                if (!z6) {
                    intStream.sequential().forEach(c2528t);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f21088a.e() && ofIntSpliterator.tryAdvance((IntConsumer) c2528t)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        this.f20976b = true;
        return this.f21088a.e();
    }
}
