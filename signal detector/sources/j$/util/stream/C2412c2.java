package j$.util.stream;

import j$.util.C2528t;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2412c2 extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21024b;

    /* renamed from: c, reason: collision with root package name */
    public final C2528t f21025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f21026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412c2(V v6, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21026d = v6;
        InterfaceC2472o2 interfaceC2472o22 = this.f21108a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f21025c = new C2528t(interfaceC2472o22, 1);
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21108a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) throws Exception {
        IntStream intStream = (IntStream) ((j$.util.function.g) this.f21026d.f20972t).apply((j$.util.function.g) obj);
        if (intStream != null) {
            try {
                boolean z6 = this.f21024b;
                C2528t c2528t = this.f21025c;
                if (!z6) {
                    intStream.sequential().forEach(c2528t);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f21108a.e() && ofIntSpliterator.tryAdvance((IntConsumer) c2528t)) {
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

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        this.f21024b = true;
        return this.f21108a.e();
    }
}
