package j$.util;

import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class p1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f26438a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f26439b = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f26440c;

    /* renamed from: d, reason: collision with root package name */
    public long f26441d;

    /* renamed from: e, reason: collision with root package name */
    public int f26442e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return c.e(this, i4);
    }

    public p1(java.util.Collection collection, int i4) {
        this.f26438a = collection;
        this.f26440c = (i4 & Buffer.SEGMENTING_THRESHOLD) == 0 ? i4 | 16448 : i4;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f26439b;
        if (it == null) {
            it = this.f26438a.iterator();
            this.f26439b = it;
            size = this.f26438a.size();
            this.f26441d = size;
        } else {
            size = this.f26441d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i4 = this.f26442e + Segment.SHARE_MINIMUM;
        if (i4 > size) {
            i4 = (int) size;
        }
        if (i4 > 33554432) {
            i4 = 33554432;
        }
        Object[] objArr = new Object[i4];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i4) {
                break;
            }
        } while (it.hasNext());
        this.f26442e = i10;
        long j = this.f26441d;
        if (j != Long.MAX_VALUE) {
            this.f26441d = j - i10;
        }
        return new i1(objArr, 0, i10, this.f26440c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f26439b;
        if (it == null) {
            it = this.f26438a.iterator();
            this.f26439b = it;
            this.f26441d = this.f26438a.size();
        }
        c.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f26439b == null) {
            this.f26439b = this.f26438a.iterator();
            this.f26441d = this.f26438a.size();
        }
        if (!this.f26439b.hasNext()) {
            return false;
        }
        consumer.accept(this.f26439b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f26439b == null) {
            this.f26439b = this.f26438a.iterator();
            long size = this.f26438a.size();
            this.f26441d = size;
            return size;
        }
        return this.f26441d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26440c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
