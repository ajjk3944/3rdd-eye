package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2381a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f20689a;

    /* renamed from: b, reason: collision with root package name */
    public int f20690b;

    /* renamed from: c, reason: collision with root package name */
    public int f20691c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C2381a(java.util.List list) {
        this.f20689a = list;
        this.f20690b = 0;
        this.f20691c = -1;
    }

    public C2381a(C2381a c2381a, int i, int i3) {
        this.f20689a = c2381a.f20689a;
        this.f20690b = i;
        this.f20691c = i3;
    }

    public final int a() {
        java.util.List list = this.f20689a;
        int i = this.f20691c;
        if (i >= 0) {
            return i;
        }
        int size = list.size();
        this.f20691c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i = this.f20690b;
        int i3 = (iA + i) >>> 1;
        if (i >= i3) {
            return null;
        }
        this.f20690b = i3;
        return new C2381a(this, i, i3);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i = this.f20690b;
        if (i >= iA) {
            return false;
        }
        this.f20690b = i + 1;
        try {
            consumer.accept(this.f20689a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f20689a;
        int iA = a();
        this.f20690b = iA;
        for (int i = this.f20690b; i < iA; i++) {
            try {
                consumer.accept(list.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f20690b;
    }
}
