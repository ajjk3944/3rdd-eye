package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class p7 extends c7 implements j$.util.z0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.stream.c7
    public final c7 e(Spliterator spliterator) {
        return new p7(this.f26528b, spliterator, this.f26527a);
    }

    @Override // j$.util.stream.c7
    public final void d() {
        u6 u6Var = new u6();
        this.f26533h = u6Var;
        Objects.requireNonNull(u6Var);
        this.f26531e = this.f26528b.x0(new o7(u6Var, 1));
        this.f26532f = new j$.util.q(11, this);
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.stream.c7, j$.util.Spliterator
    public final j$.util.z0 trySplit() {
        return (j$.util.z0) super.trySplit();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            u6 u6Var = (u6) this.f26533h;
            long j8 = this.g;
            int iR = u6Var.r(j8);
            if (u6Var.f26516c == 0 && iR == 0) {
                j = ((long[]) u6Var.f26804e)[(int) j8];
            } else {
                j = ((long[][]) u6Var.f26805f)[iR][(int) (j8 - u6Var.f26517d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f26533h == null && !this.f26534i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            o7 o7Var = new o7(longConsumer, 0);
            this.f26528b.w0(this.f26530d, o7Var);
            this.f26534i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
