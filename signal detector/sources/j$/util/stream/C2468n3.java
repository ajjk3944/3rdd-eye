package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2468n3 extends AbstractC2423e3 implements j$.util.F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final AbstractC2423e3 e(Spliterator spliterator) {
        return new C2468n3(this.f21066b, spliterator, this.f21065a);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final void d() {
        S2 s22 = new S2();
        this.f21072h = s22;
        Objects.requireNonNull(s22);
        this.f21069e = this.f21066b.x0(new C2463m3(s22, 1));
        this.f21070f = new j$.util.function.g(this, 9);
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final j$.util.F trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d6;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            S2 s22 = (S2) this.f21072h;
            long j6 = this.f21071g;
            int iS = s22.s(j6);
            if (s22.f21052c == 0 && iS == 0) {
                d6 = ((double[]) s22.f20987e)[(int) j6];
            } else {
                d6 = ((double[][]) s22.f20988f)[iS][(int) (j6 - s22.f21053d[iS])];
            }
            doubleConsumer.accept(d6);
        }
        return zA;
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f21072h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C2463m3 c2463m3 = new C2463m3(doubleConsumer, 0);
            this.f21066b.w0(this.f21068d, c2463m3);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
