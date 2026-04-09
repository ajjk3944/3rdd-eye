package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2478p3 extends AbstractC2423e3 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final AbstractC2423e3 e(Spliterator spliterator) {
        return new C2478p3(this.f21066b, spliterator, this.f21065a);
    }

    @Override // j$.util.stream.AbstractC2423e3
    public final void d() {
        U2 u22 = new U2();
        this.f21072h = u22;
        Objects.requireNonNull(u22);
        this.f21069e = this.f21066b.x0(new C2473o3(u22, 1));
        this.f21070f = new j$.util.function.g(this, 10);
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2423e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            U2 u22 = (U2) this.f21072h;
            long j6 = this.f21071g;
            int iS = u22.s(j6);
            if (u22.f21052c == 0 && iS == 0) {
                i = ((int[]) u22.f20987e)[(int) j6];
            } else {
                i = ((int[][]) u22.f20988f)[iS][(int) (j6 - u22.f21053d[iS])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f21072h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C2473o3 c2473o3 = new C2473o3(intConsumer, 0);
            this.f21066b.w0(this.f21068d, c2473o3);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
