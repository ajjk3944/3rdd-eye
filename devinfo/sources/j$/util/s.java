package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class s implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f26452a;

    public s(Spliterator spliterator) {
        this.f26452a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f26452a.tryAdvance(new q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f26452a.forEachRemaining(new q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f26452a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new s(spliteratorTrySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26452a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f26452a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26452a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i4) {
        return this.f26452a.hasCharacteristics(i4);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f26452a.getComparator();
    }
}
