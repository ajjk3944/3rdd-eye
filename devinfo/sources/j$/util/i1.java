package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class i1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f26410a;

    /* renamed from: b, reason: collision with root package name */
    public int f26411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26413d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return c.e(this, i4);
    }

    public i1(Object[] objArr, int i4, int i10, int i11) {
        this.f26410a = objArr;
        this.f26411b = i4;
        this.f26412c = i10;
        this.f26413d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i4 = this.f26411b;
        int i10 = (this.f26412c + i4) >>> 1;
        if (i4 >= i10) {
            return null;
        }
        this.f26411b = i10;
        return new i1(this.f26410a, i4, i10, this.f26413d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i4;
        consumer.getClass();
        Object[] objArr = this.f26410a;
        int length = objArr.length;
        int i10 = this.f26412c;
        if (length < i10 || (i4 = this.f26411b) < 0) {
            return;
        }
        this.f26411b = i10;
        if (i4 < i10) {
            do {
                consumer.accept(objArr[i4]);
                i4++;
            } while (i4 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i4 = this.f26411b;
        if (i4 < 0 || i4 >= this.f26412c) {
            return false;
        }
        this.f26411b = i4 + 1;
        consumer.accept(this.f26410a[i4]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26412c - this.f26411b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26413d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
