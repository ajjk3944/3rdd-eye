package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class V implements F {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f20685a;

    /* renamed from: b, reason: collision with root package name */
    public int f20686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20688d;

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

    public V(double[] dArr, int i, int i3, int i6) {
        this.f20685a = dArr;
        this.f20686b = i;
        this.f20687c = i3;
        this.f20688d = i6 | 16448;
    }

    @Override // j$.util.Spliterator
    public final F trySplit() {
        int i = this.f20686b;
        int i3 = (this.f20687c + i) >>> 1;
        if (i >= i3) {
            return null;
        }
        this.f20686b = i3;
        return new V(this.f20685a, i, i3, this.f20688d);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i;
        doubleConsumer.getClass();
        double[] dArr = this.f20685a;
        int length = dArr.length;
        int i3 = this.f20687c;
        if (length < i3 || (i = this.f20686b) < 0) {
            return;
        }
        this.f20686b = i3;
        if (i < i3) {
            do {
                doubleConsumer.accept(dArr[i]);
                i++;
            } while (i < i3);
        }
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i = this.f20686b;
        if (i < 0 || i >= this.f20687c) {
            return false;
        }
        this.f20686b = i + 1;
        doubleConsumer.accept(this.f20685a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20687c - this.f20686b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f20688d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
