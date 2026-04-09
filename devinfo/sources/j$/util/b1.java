package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Spliterator.OfPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f26290a;

    public /* synthetic */ b1(c1 c1Var) {
        this.f26290a = c1Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(c1 c1Var) {
        if (c1Var == null) {
            return null;
        }
        return c1Var instanceof a1 ? ((a1) c1Var).f26286a : c1Var instanceof u0 ? t0.a((u0) c1Var) : c1Var instanceof Spliterator.OfInt ? w0.a((Spliterator.OfInt) c1Var) : c1Var instanceof z0 ? y0.a((z0) c1Var) : new b1(c1Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f26290a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c1 c1Var = this.f26290a;
        if (obj instanceof b1) {
            obj = ((b1) obj).f26290a;
        }
        return c1Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f26290a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26290a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26290a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f26290a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f26290a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return this.f26290a.hasCharacteristics(i4);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26290a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f26290a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f26290a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f26290a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f26290a.trySplit());
    }
}
