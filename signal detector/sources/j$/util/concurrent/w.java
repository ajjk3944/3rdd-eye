package j$.util.concurrent;

import j$.util.AbstractC2383c;
import j$.util.F;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w implements F {

    /* renamed from: a, reason: collision with root package name */
    public long f20764a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20765b;

    /* renamed from: c, reason: collision with root package name */
    public final double f20766c;

    /* renamed from: d, reason: collision with root package name */
    public final double f20767d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
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
        return AbstractC2383c.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j6, long j7, double d6, double d7) {
        this.f20764a = j6;
        this.f20765b = j7;
        this.f20766c = d6;
        this.f20767d = d7;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j6 = this.f20764a;
        long j7 = (this.f20765b + j6) >>> 1;
        if (j7 <= j6) {
            return null;
        }
        this.f20764a = j7;
        return new w(j6, j7, this.f20766c, this.f20767d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20765b - this.f20764a;
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f20764a;
        if (j6 >= this.f20765b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f20766c, this.f20767d));
        this.f20764a = j6 + 1;
        return true;
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j6 = this.f20764a;
        long j7 = this.f20765b;
        if (j6 < j7) {
            this.f20764a = j7;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f20766c, this.f20767d));
                j6++;
            } while (j6 < j7);
        }
    }
}
