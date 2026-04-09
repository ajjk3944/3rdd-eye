package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f26843a;

    public /* synthetic */ v0(Spliterator.OfInt ofInt) {
        this.f26843a = ofInt;
    }

    public static /* synthetic */ Spliterator.OfInt a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof w0 ? ((w0) ofInt).f26844a : new v0(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f26843a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f26843a;
        if (obj instanceof v0) {
            obj = ((v0) obj).f26843a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f26843a.estimateSize();
    }

    @Override // j$.util.c1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26843a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26843a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f26843a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f26843a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f26843a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return this.f26843a.hasCharacteristics(i4);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26843a.hashCode();
    }

    @Override // j$.util.c1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f26843a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f26843a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f26843a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return a(this.f26843a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return d1.a(this.f26843a.trySplit());
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ c1 trySplit() {
        return a1.a(this.f26843a.trySplit());
    }
}
