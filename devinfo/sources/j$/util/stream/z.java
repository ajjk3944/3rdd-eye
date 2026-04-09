package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f26831a;

    public /* synthetic */ z(DoubleStream doubleStream) {
        this.f26831a = doubleStream;
    }

    public static /* synthetic */ b0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof a0 ? ((a0) doubleStream).f26468a : new z(doubleStream);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.f26831a.mapToInt(null));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ boolean C() {
        return this.f26831a.noneMatch(null);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 a() {
        return f(this.f26831a.takeWhile(null));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 average() {
        return j$.util.c.j(this.f26831a.average());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 b() {
        return f(this.f26831a.filter(null));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ Stream boxed() {
        return y6.f(this.f26831a.boxed());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 c() {
        return f(this.f26831a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f26831a.close();
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f26831a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ long count() {
        return this.f26831a.count();
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 distinct() {
        return f(this.f26831a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f26831a;
        if (obj instanceof z) {
            obj = ((z) obj).f26831a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.util.c.j(this.f26831a.findAny());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.util.c.j(this.f26831a.findFirst());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f26831a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f26831a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26831a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f26831a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.b0, j$.util.stream.g
    public final /* synthetic */ j$.util.h0 iterator() {
        ?? it = this.f26831a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.g0 ? ((j$.util.g0) it).f26398a : new j$.util.f0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f26831a.iterator();
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 limit(long j) {
        return f(this.f26831a.limit(j));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 map(DoubleUnaryOperator doubleUnaryOperator) {
        return f(this.f26831a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return y6.f(this.f26831a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 max() {
        return j$.util.c.j(this.f26831a.max());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 min() {
        return j$.util.c.j(this.f26831a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.f26831a.onClose(runnable));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ boolean p() {
        return this.f26831a.anyMatch(null);
    }

    @Override // j$.util.stream.b0, j$.util.stream.g
    public final /* synthetic */ b0 parallel() {
        return f(this.f26831a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.f26831a.parallel());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 peek(DoubleConsumer doubleConsumer) {
        return f(this.f26831a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f26831a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.c.j(this.f26831a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.b0, j$.util.stream.g
    public final /* synthetic */ b0 sequential() {
        return f(this.f26831a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.f26831a.sequential());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 skip(long j) {
        return f(this.f26831a.skip(j));
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ b0 sorted() {
        return f(this.f26831a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f26831a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.b0, j$.util.stream.g
    public final /* synthetic */ j$.util.u0 spliterator() {
        return j$.util.s0.a(this.f26831a.spliterator());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ double sum() {
        return this.f26831a.sum();
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ double[] toArray() {
        return this.f26831a.toArray();
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ boolean u() {
        return this.f26831a.allMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.f26831a.unordered());
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ k1 v() {
        return i1.f(this.f26831a.mapToLong(null));
    }

    @Override // j$.util.stream.b0
    public final j$.util.x summaryStatistics() {
        this.f26831a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.b0
    public final b0 d(j$.util.q qVar) {
        DoubleStream doubleStream = this.f26831a;
        j$.util.q qVar2 = new j$.util.q(4);
        qVar2.f26444b = qVar;
        return f(doubleStream.flatMap(qVar2));
    }
}
