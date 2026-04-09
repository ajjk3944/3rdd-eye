package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.C2389i;
import j$.util.C2393m;
import j$.util.C2397q;
import j$.util.InterfaceC2398s;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f20820a;

    public /* synthetic */ A(DoubleStream doubleStream) {
        this.f20820a = doubleStream;
    }

    public static /* synthetic */ C f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof B ? ((B) doubleStream).f20826a : new A(doubleStream);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean B() {
        return this.f20820a.noneMatch(null);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C a() {
        return f(this.f20820a.takeWhile(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m average() {
        return AbstractC2383c.j(this.f20820a.average());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C b() {
        return f(this.f20820a.filter(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream boxed() {
        return C2403a3.f(this.f20820a.boxed());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C c() {
        return f(this.f20820a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20820a.close();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f20820a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ long count() {
        return this.f20820a.count();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C distinct() {
        return f(this.f20820a.distinct());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C e() {
        return f(this.f20820a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f20820a;
        if (obj instanceof A) {
            obj = ((A) obj).f20820a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m findAny() {
        return AbstractC2383c.j(this.f20820a.findAny());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m findFirst() {
        return AbstractC2383c.j(this.f20820a.findFirst());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f20820a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f20820a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20820a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ boolean isParallel() {
        return this.f20820a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2398s iterator() {
        ?? it = this.f20820a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.r ? ((j$.util.r) it).f20819a : new C2397q(it);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Iterator iterator() {
        return this.f20820a.iterator();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C limit(long j6) {
        return f(this.f20820a.limit(j6));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C2403a3.f(this.f20820a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m max() {
        return AbstractC2383c.j(this.f20820a.max());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m min() {
        return AbstractC2383c.j(this.f20820a.min());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean n() {
        return this.f20820a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h onClose(Runnable runnable) {
        return C2424f.f(this.f20820a.onClose(runnable));
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ C parallel() {
        return f(this.f20820a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h parallel() {
        return C2424f.f(this.f20820a.parallel());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C peek(DoubleConsumer doubleConsumer) {
        return f(this.f20820a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double reduce(double d6, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f20820a.reduce(d6, doubleBinaryOperator);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C2393m reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC2383c.j(this.f20820a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ C sequential() {
        return f(this.f20820a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h sequential() {
        return C2424f.f(this.f20820a.sequential());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C skip(long j6) {
        return f(this.f20820a.skip(j6));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C sorted() {
        return f(this.f20820a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ j$.util.F spliterator() {
        return j$.util.D.a(this.f20820a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f20820a.spliterator());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double sum() {
        return this.f20820a.sum();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean t() {
        return this.f20820a.allMatch(null);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double[] toArray() {
        return this.f20820a.toArray();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ InterfaceC2460m0 u() {
        return C2450k0.f(this.f20820a.mapToLong(null));
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h unordered() {
        return C2424f.f(this.f20820a.unordered());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ IntStream y() {
        return IntStream.VivifiedWrapper.convert(this.f20820a.mapToInt(null));
    }

    @Override // j$.util.stream.C
    public final C2389i summaryStatistics() {
        this.f20820a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.C
    public final C d(j$.util.function.g gVar) {
        DoubleStream doubleStream = this.f20820a;
        j$.util.function.g gVar2 = new j$.util.function.g(3);
        gVar2.f20799b = gVar;
        return f(doubleStream.flatMap(gVar2));
    }
}
