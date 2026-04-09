package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class t7 extends v7 implements j$.util.c1 {
    public abstract Object b();

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public t7(j$.util.c1 c1Var, long j, long j8) {
        super(c1Var, j, j8, 0L, Math.min(c1Var.estimateSize(), j8));
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        long j8 = this.f26791e;
        long j9 = this.f26787a;
        if (j9 >= j8) {
            return false;
        }
        while (true) {
            j = this.f26790d;
            if (j9 <= j) {
                break;
            }
            ((j$.util.c1) this.f26789c).tryAdvance(b());
            this.f26790d++;
        }
        if (j >= this.f26791e) {
            return false;
        }
        this.f26790d = j + 1;
        return ((j$.util.c1) this.f26789c).tryAdvance(obj);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f26791e;
        long j8 = this.f26787a;
        if (j8 >= j) {
            return;
        }
        long j9 = this.f26790d;
        if (j9 >= j) {
            return;
        }
        if (j9 >= j8 && ((j$.util.c1) this.f26789c).estimateSize() + j9 <= this.f26788b) {
            ((j$.util.c1) this.f26789c).forEachRemaining(obj);
            this.f26790d = this.f26791e;
            return;
        }
        while (j8 > this.f26790d) {
            ((j$.util.c1) this.f26789c).tryAdvance(b());
            this.f26790d++;
        }
        while (this.f26790d < this.f26791e) {
            ((j$.util.c1) this.f26789c).tryAdvance(obj);
            this.f26790d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
