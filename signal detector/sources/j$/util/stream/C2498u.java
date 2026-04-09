package j$.util.stream;

import j$.util.C2396p;
import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2498u extends AbstractC2437h2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21168b;

    /* renamed from: c, reason: collision with root package name */
    public final C2396p f21169c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2503v f21170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498u(C2503v c2503v, InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21170d = c2503v;
        InterfaceC2472o2 interfaceC2472o22 = this.f21082a;
        Objects.requireNonNull(interfaceC2472o22);
        this.f21169c = new C2396p(interfaceC2472o22, 1);
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f21082a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) throws Exception {
        C c6 = (C) ((j$.util.function.g) this.f21170d.f21175t).apply(d6);
        if (c6 != null) {
            try {
                boolean z6 = this.f21168b;
                C2396p c2396p = this.f21169c;
                if (!z6) {
                    c6.sequential().forEach(c2396p);
                } else {
                    j$.util.F fSpliterator = c6.sequential().spliterator();
                    while (!this.f21082a.e() && fSpliterator.tryAdvance((DoubleConsumer) c2396p)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    c6.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c6 != null) {
            c6.close();
        }
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        this.f21168b = true;
        return this.f21082a.e();
    }
}
