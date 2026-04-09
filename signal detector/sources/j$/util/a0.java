package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class a0 implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f20692a;

    /* renamed from: b, reason: collision with root package name */
    public int f20693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20695d;

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

    public a0(int[] iArr, int i, int i3, int i6) {
        this.f20692a = iArr;
        this.f20693b = i;
        this.f20694c = i3;
        this.f20695d = i6 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i = this.f20693b;
        int i3 = (this.f20694c + i) >>> 1;
        if (i >= i3) {
            return null;
        }
        this.f20693b = i3;
        return new a0(this.f20692a, i, i3, this.f20695d);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f20692a;
        int length = iArr.length;
        int i3 = this.f20694c;
        if (length < i3 || (i = this.f20693b) < 0) {
            return;
        }
        this.f20693b = i3;
        if (i < i3) {
            do {
                intConsumer.accept(iArr[i]);
                i++;
            } while (i < i3);
        }
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f20693b;
        if (i < 0 || i >= this.f20694c) {
            return false;
        }
        this.f20693b = i + 1;
        intConsumer.accept(this.f20692a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20694c - this.f20693b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f20695d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
