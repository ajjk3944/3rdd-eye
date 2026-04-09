package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2458l3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f21114d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f21115a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21116b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21117c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public C2458l3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f21115a = spliterator;
        this.f21116b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.f21117c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f21115a.tryAdvance(this)) {
            Object obj = this.f21117c;
            if (obj == null) {
                obj = f21114d;
            }
            if (this.f21116b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.o(this.f21117c);
                this.f21117c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f21115a.forEachRemaining(new j$.util.concurrent.t(8, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f21115a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C2458l3(spliteratorTrySplit, this.f21116b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f21115a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f21115a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f21115a.getComparator();
    }
}
