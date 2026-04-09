package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class i1 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f26606a;

    public /* synthetic */ i1(LongStream longStream) {
        this.f26606a = longStream;
    }

    public static /* synthetic */ k1 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j1 ? ((j1) longStream).f26624a : new i1(longStream);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ IntStream B() {
        return IntStream.VivifiedWrapper.convert(this.f26606a.mapToInt(null));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 a() {
        return f(this.f26606a.takeWhile(null));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ b0 asDoubleStream() {
        return z.f(this.f26606a.asDoubleStream());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.b0 average() {
        return j$.util.c.j(this.f26606a.average());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 b() {
        return f(this.f26606a.filter(null));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ Stream boxed() {
        return y6.f(this.f26606a.boxed());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 c() {
        return f(this.f26606a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f26606a.close();
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f26606a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ long count() {
        return this.f26606a.count();
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 distinct() {
        return f(this.f26606a.distinct());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 e() {
        return f(this.f26606a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f26606a;
        if (obj instanceof i1) {
            obj = ((i1) obj).f26606a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.d0 findAny() {
        return j$.util.c.l(this.f26606a.findAny());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.d0 findFirst() {
        return j$.util.c.l(this.f26606a.findFirst());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f26606a.forEach(longConsumer);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f26606a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26606a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f26606a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.k1, j$.util.stream.g
    public final /* synthetic */ j$.util.p0 iterator() {
        ?? it = this.f26606a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.o0 ? ((j$.util.o0) it).f26432a : new j$.util.n0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f26606a.iterator();
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ b0 k() {
        return z.f(this.f26606a.mapToDouble(null));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 limit(long j) {
        return f(this.f26606a.limit(j));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return y6.f(this.f26606a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.d0 max() {
        return j$.util.c.l(this.f26606a.max());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.d0 min() {
        return j$.util.c.l(this.f26606a.min());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ boolean n() {
        return this.f26606a.noneMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.f26606a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.f26606a.parallel());
    }

    @Override // j$.util.stream.k1, j$.util.stream.g
    public final /* synthetic */ k1 parallel() {
        return f(this.f26606a.parallel());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 peek(LongConsumer longConsumer) {
        return f(this.f26606a.peek(longConsumer));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ boolean r() {
        return this.f26606a.anyMatch(null);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f26606a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.c.l(this.f26606a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.f26606a.sequential());
    }

    @Override // j$.util.stream.k1, j$.util.stream.g
    public final /* synthetic */ k1 sequential() {
        return f(this.f26606a.sequential());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 skip(long j) {
        return f(this.f26606a.skip(j));
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ k1 sorted() {
        return f(this.f26606a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f26606a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.k1, j$.util.stream.g
    public final /* synthetic */ j$.util.z0 spliterator() {
        return j$.util.x0.a(this.f26606a.spliterator());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ long sum() {
        return this.f26606a.sum();
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ long[] toArray() {
        return this.f26606a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.f26606a.unordered());
    }

    @Override // j$.util.stream.k1
    public final /* synthetic */ boolean x() {
        return this.f26606a.allMatch(null);
    }

    @Override // j$.util.stream.k1
    public final j$.util.a0 summaryStatistics() {
        this.f26606a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.k1
    public final k1 d(j$.util.q qVar) {
        LongStream longStream = this.f26606a;
        j$.util.q qVar2 = new j$.util.q(6);
        qVar2.f26444b = qVar;
        return f(longStream.flatMap(qVar2));
    }
}
