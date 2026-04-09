package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487r3 extends AbstractC2423e3 implements j$.util.K {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final AbstractC2423e3 e(Spliterator spliterator) {
        return new C2487r3(this.f21066b, spliterator, this.f21065a);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final void d() {
        W2 w22 = new W2();
        this.f21072h = w22;
        Objects.requireNonNull(w22);
        this.f21069e = this.f21066b.x0(new C2483q3(w22, 1));
        this.f21070f = new j$.util.function.g(this, 11);
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final j$.util.K trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j6;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            W2 w22 = (W2) this.f21072h;
            long j7 = this.f21071g;
            int iS = w22.s(j7);
            if (w22.f21052c == 0 && iS == 0) {
                j6 = ((long[]) w22.f20987e)[(int) j7];
            } else {
                j6 = ((long[][]) w22.f20988f)[iS][(int) (j7 - w22.f21053d[iS])];
            }
            longConsumer.accept(j6);
        }
        return zA;
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f21072h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C2483q3 c2483q3 = new C2483q3(longConsumer, 0);
            this.f21066b.w0(this.f21068d, c2483q3);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
