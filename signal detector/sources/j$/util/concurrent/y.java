package j$.util.concurrent;

import j$.util.AbstractC2383c;
import j$.util.K;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class y implements K {

    /* renamed from: a, reason: collision with root package name */
    public long f20772a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20773b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20775d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public y(long j6, long j7, long j8, long j9) {
        this.f20772a = j6;
        this.f20773b = j7;
        this.f20774c = j8;
        this.f20775d = j9;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j6 = this.f20772a;
        long j7 = (this.f20773b + j6) >>> 1;
        if (j7 <= j6) {
            return null;
        }
        this.f20772a = j7;
        return new y(j6, j7, this.f20774c, this.f20775d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20773b - this.f20772a;
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j6 = this.f20772a;
        if (j6 >= this.f20773b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f20774c, this.f20775d));
        this.f20772a = j6 + 1;
        return true;
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j6 = this.f20772a;
        long j7 = this.f20773b;
        if (j6 < j7) {
            this.f20772a = j7;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.c(this.f20774c, this.f20775d));
                j6++;
            } while (j6 < j7);
        }
    }
}
