package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f26847a;

    public /* synthetic */ x0(Spliterator.OfLong ofLong) {
        this.f26847a = ofLong;
    }

    public static /* synthetic */ z0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof y0 ? ((y0) ofLong).f26848a : new x0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f26847a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f26847a;
        if (obj instanceof x0) {
            obj = ((x0) obj).f26847a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f26847a.estimateSize();
    }

    @Override // j$.util.c1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26847a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26847a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.z0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f26847a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f26847a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f26847a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return this.f26847a.hasCharacteristics(i4);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26847a.hashCode();
    }

    @Override // j$.util.c1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f26847a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f26847a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.z0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f26847a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return d1.a(this.f26847a.trySplit());
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ c1 trySplit() {
        return a1.a(this.f26847a.trySplit());
    }

    @Override // j$.util.z0, j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ z0 trySplit() {
        return a(this.f26847a.trySplit());
    }
}
