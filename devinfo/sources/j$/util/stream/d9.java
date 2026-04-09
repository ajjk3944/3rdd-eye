package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class d9 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f26559a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26561c;

    /* renamed from: d, reason: collision with root package name */
    public int f26562d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public d9(Spliterator spliterator) {
        this.f26561c = true;
        this.f26559a = spliterator;
        this.f26560b = new AtomicBoolean();
    }

    public d9(Spliterator spliterator, d9 d9Var) {
        this.f26561c = true;
        this.f26559a = spliterator;
        d9Var.getClass();
        this.f26560b = d9Var.f26560b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26559a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26559a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f26559a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f26559a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f26562d == 0 && this.f26560b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
