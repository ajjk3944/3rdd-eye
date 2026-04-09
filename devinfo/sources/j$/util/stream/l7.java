package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class l7 extends c7 implements j$.util.u0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.c7
    public final c7 e(Spliterator spliterator) {
        return new l7(this.f26528b, spliterator, this.f26527a);
    }

    @Override // j$.util.stream.c7
    public final void d() {
        q6 q6Var = new q6();
        this.f26533h = q6Var;
        Objects.requireNonNull(q6Var);
        this.f26531e = this.f26528b.x0(new k7(q6Var, 1));
        this.f26532f = new j$.util.q(9, this);
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d10;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            q6 q6Var = (q6) this.f26533h;
            long j = this.g;
            int iR = q6Var.r(j);
            if (q6Var.f26516c == 0 && iR == 0) {
                d10 = ((double[]) q6Var.f26804e)[(int) j];
            } else {
                d10 = ((double[][]) q6Var.f26805f)[iR][(int) (j - q6Var.f26517d[iR])];
            }
            doubleConsumer.accept(d10);
        }
        return zA;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f26533h == null && !this.f26534i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            k7 k7Var = new k7(doubleConsumer, 0);
            this.f26528b.w0(this.f26530d, k7Var);
            this.f26534i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
