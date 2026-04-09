package j$.util.concurrent;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class x implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public long f20768a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20770c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20771d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
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
        return AbstractC2383c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j6, long j7, int i, int i3) {
        this.f20768a = j6;
        this.f20769b = j7;
        this.f20770c = i;
        this.f20771d = i3;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j6 = this.f20768a;
        long j7 = (this.f20769b + j6) >>> 1;
        if (j7 <= j6) {
            return null;
        }
        this.f20768a = j7;
        return new x(j6, j7, this.f20770c, this.f20771d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20769b - this.f20768a;
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f20768a;
        if (j6 >= this.f20769b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f20770c, this.f20771d));
        this.f20768a = j6 + 1;
        return true;
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j6 = this.f20768a;
        long j7 = this.f20769b;
        if (j6 < j7) {
            this.f20768a = j7;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f20770c, this.f20771d));
                j6++;
            } while (j6 < j7);
        }
    }
}
