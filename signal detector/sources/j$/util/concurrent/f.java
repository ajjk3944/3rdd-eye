package j$.util.concurrent;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {
    public final ConcurrentHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public long f20730j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    public f(l[] lVarArr, int i, int i3, int i6, long j6, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i3, i6);
        this.i = concurrentHashMap;
        this.f20730j = j6;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20750f;
        int i3 = this.f20751g;
        int i6 = (i + i3) >>> 1;
        if (i6 <= i) {
            return null;
        }
        l[] lVarArr = this.f20745a;
        this.f20751g = i6;
        long j6 = this.f20730j >>> 1;
        this.f20730j = j6;
        return new f(lVarArr, this.f20752h, i6, i3, j6, this.i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l lVarA = a();
            if (lVarA == null) {
                return;
            } else {
                consumer.o(new k(lVarA.f20738b, lVarA.f20739c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l lVarA = a();
        if (lVarA == null) {
            return false;
        }
        consumer.o(new k(lVarA.f20738b, lVarA.f20739c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20730j;
    }
}
