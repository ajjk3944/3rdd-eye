package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class n7 extends c7 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.stream.c7
    public final c7 e(Spliterator spliterator) {
        return new n7(this.f26528b, spliterator, this.f26527a);
    }

    @Override // j$.util.stream.c7
    public final void d() {
        s6 s6Var = new s6();
        this.f26533h = s6Var;
        Objects.requireNonNull(s6Var);
        this.f26531e = this.f26528b.x0(new m7(s6Var, 1));
        this.f26532f = new j$.util.q(10, this);
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i4;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            s6 s6Var = (s6) this.f26533h;
            long j = this.g;
            int iR = s6Var.r(j);
            if (s6Var.f26516c == 0 && iR == 0) {
                i4 = ((int[]) s6Var.f26804e)[(int) j];
            } else {
                i4 = ((int[][]) s6Var.f26805f)[iR][(int) (j - s6Var.f26517d[iR])];
            }
            intConsumer.accept(i4);
        }
        return zA;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f26533h == null && !this.f26534i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            m7 m7Var = new m7(intConsumer, 0);
            this.f26528b.w0(this.f26530d, m7Var);
            this.f26534i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
