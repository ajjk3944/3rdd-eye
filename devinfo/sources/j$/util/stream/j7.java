package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j7 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f26632d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f26633a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26634b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26635c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    public j7(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f26633a = spliterator;
        this.f26634b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26635c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f26633a.tryAdvance(this)) {
            Object obj = this.f26635c;
            if (obj == null) {
                obj = f26632d;
            }
            if (this.f26634b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.n(this.f26635c);
                this.f26635c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f26633a.forEachRemaining(new j$.util.concurrent.t(8, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f26633a.trySplit();
        if (spliteratorTrySplit != null) {
            return new j7(spliteratorTrySplit, this.f26634b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26633a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f26633a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f26633a.getComparator();
    }
}
