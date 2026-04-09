package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f20657a;

    public /* synthetic */ I(Spliterator.OfLong ofLong) {
        this.f20657a = ofLong;
    }

    public static /* synthetic */ K a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof J ? ((J) ofLong).f20658a : new I(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20657a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f20657a;
        if (obj instanceof I) {
            obj = ((I) obj).f20657a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20657a.estimateSize();
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20657a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20657a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.K
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f20657a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20657a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20657a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20657a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20657a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20657a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f20657a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.K
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f20657a.tryAdvance(longConsumer);
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ K trySplit() {
        return a(this.f20657a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.a(this.f20657a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.a(this.f20657a.trySplit());
    }
}
