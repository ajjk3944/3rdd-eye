package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.C2392l;
import j$.util.C2393m;
import j$.util.C2395o;
import j$.util.C2533y;
import j$.util.C2534z;
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

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2450k0 implements InterfaceC2460m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f21105a;

    public /* synthetic */ C2450k0(LongStream longStream) {
        this.f21105a = longStream;
    }

    public static /* synthetic */ InterfaceC2460m0 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C2455l0 ? ((C2455l0) longStream).f21113a : new C2450k0(longStream);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.f21105a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 a() {
        return f(this.f21105a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C asDoubleStream() {
        return A.f(this.f21105a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2393m average() {
        return AbstractC2383c.j(this.f21105a.average());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 b() {
        return f(this.f21105a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ Stream boxed() {
        return C2403a3.f(this.f21105a.boxed());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 c() {
        return f(this.f21105a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21105a.close();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f21105a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ long count() {
        return this.f21105a.count();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 distinct() {
        return f(this.f21105a.distinct());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 e() {
        return f(this.f21105a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f21105a;
        if (obj instanceof C2450k0) {
            obj = ((C2450k0) obj).f21105a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2395o findAny() {
        return AbstractC2383c.l(this.f21105a.findAny());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2395o findFirst() {
        return AbstractC2383c.l(this.f21105a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f21105a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f21105a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21105a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ boolean isParallel() {
        return this.f21105a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2460m0, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ j$.util.A iterator() {
        ?? it = this.f21105a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C2534z ? ((C2534z) it).f21219a : new C2533y(it);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Iterator iterator() {
        return this.f21105a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C k() {
        return A.f(this.f21105a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 limit(long j6) {
        return f(this.f21105a.limit(j6));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ boolean m() {
        return this.f21105a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C2403a3.f(this.f21105a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2395o max() {
        return AbstractC2383c.l(this.f21105a.max());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2395o min() {
        return AbstractC2383c.l(this.f21105a.min());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h onClose(Runnable runnable) {
        return C2424f.f(this.f21105a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ boolean p() {
        return this.f21105a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h parallel() {
        return C2424f.f(this.f21105a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2460m0, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2460m0 parallel() {
        return f(this.f21105a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 peek(LongConsumer longConsumer) {
        return f(this.f21105a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ long reduce(long j6, LongBinaryOperator longBinaryOperator) {
        return this.f21105a.reduce(j6, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ C2395o reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC2383c.l(this.f21105a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h sequential() {
        return C2424f.f(this.f21105a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2460m0, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2460m0 sequential() {
        return f(this.f21105a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 skip(long j6) {
        return f(this.f21105a.skip(j6));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ InterfaceC2460m0 sorted() {
        return f(this.f21105a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2460m0, j$.util.stream.InterfaceC2434h
    public final /* synthetic */ j$.util.K spliterator() {
        return j$.util.I.a(this.f21105a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f21105a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ long sum() {
        return this.f21105a.sum();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ long[] toArray() {
        return this.f21105a.toArray();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h unordered() {
        return C2424f.f(this.f21105a.unordered());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final /* synthetic */ boolean w() {
        return this.f21105a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2392l summaryStatistics() {
        this.f21105a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 d(j$.util.function.g gVar) {
        LongStream longStream = this.f21105a;
        j$.util.function.g gVar2 = new j$.util.function.g(5);
        gVar2.f20799b = gVar;
        return f(longStream.flatMap(gVar2));
    }
}
