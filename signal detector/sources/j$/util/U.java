package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class U implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20681a;

    /* renamed from: b, reason: collision with root package name */
    public int f20682b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20683c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20684d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public U(Object[] objArr, int i, int i3, int i6) {
        this.f20681a = objArr;
        this.f20682b = i;
        this.f20683c = i3;
        this.f20684d = i6 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20682b;
        int i3 = (this.f20683c + i) >>> 1;
        if (i >= i3) {
            return null;
        }
        this.f20682b = i3;
        return new U(this.f20681a, i, i3, this.f20684d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f20681a;
        int length = objArr.length;
        int i3 = this.f20683c;
        if (length < i3 || (i = this.f20682b) < 0) {
            return;
        }
        this.f20682b = i3;
        if (i < i3) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i3);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f20682b;
        if (i < 0 || i >= this.f20683c) {
            return false;
        }
        this.f20682b = i + 1;
        consumer.accept(this.f20681a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20683c - this.f20682b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f20684d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
