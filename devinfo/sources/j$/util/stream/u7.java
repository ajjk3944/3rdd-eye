package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class u7 extends v7 implements Spliterator {
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

    public u7(Spliterator spliterator, long j, long j8) {
        super(spliterator, j, j8, 0L, Math.min(spliterator.estimateSize(), j8));
    }

    @Override // j$.util.stream.v7
    public final Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10) {
        return new u7(spliterator, j, j8, j9, j10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
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
            this.f26789c.tryAdvance(new f2(12));
            this.f26790d++;
        }
        if (j >= this.f26791e) {
            return false;
        }
        this.f26790d = j + 1;
        return this.f26789c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f26791e;
        long j8 = this.f26787a;
        if (j8 >= j) {
            return;
        }
        long j9 = this.f26790d;
        if (j9 >= j) {
            return;
        }
        if (j9 >= j8 && this.f26789c.estimateSize() + j9 <= this.f26788b) {
            this.f26789c.forEachRemaining(consumer);
            this.f26790d = this.f26791e;
            return;
        }
        while (j8 > this.f26790d) {
            this.f26789c.tryAdvance(new f2(13));
            this.f26790d++;
        }
        while (this.f26790d < this.f26791e) {
            this.f26789c.tryAdvance(consumer);
            this.f26790d++;
        }
    }
}
