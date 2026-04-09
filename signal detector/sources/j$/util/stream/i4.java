package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class i4 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f21090a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f21091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21092c;

    /* renamed from: d, reason: collision with root package name */
    public int f21093d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public i4(Spliterator spliterator) {
        this.f21092c = true;
        this.f21090a = spliterator;
        this.f21091b = new AtomicBoolean();
    }

    public i4(Spliterator spliterator, i4 i4Var) {
        this.f21092c = true;
        this.f21090a = spliterator;
        i4Var.getClass();
        this.f21091b = i4Var.f21091b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f21090a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f21090a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f21090a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f21090a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f21093d == 0 && this.f21091b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }
}
