package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2403a3 implements Stream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f20997a;

    public /* synthetic */ C2403a3(java.util.stream.Stream stream) {
        this.f20997a = stream;
    }

    public static /* synthetic */ Stream f(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C2403a3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream C(j$.util.function.g gVar) {
        return IntStream.VivifiedWrapper.convert(this.f20997a.flatMapToInt(AbstractC2510w1.n0(gVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f20997a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f20997a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20997a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f20997a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f20997a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream d(j$.util.function.g gVar) {
        return f(this.f20997a.flatMap(AbstractC2510w1.n0(gVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return f(this.f20997a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return f(this.f20997a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f20997a;
        if (obj instanceof C2403a3) {
            obj = ((C2403a3) obj).f20997a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return f(this.f20997a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC2383c.i(this.f20997a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC2383c.i(this.f20997a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f20997a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f20997a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(C2444j c2444j) {
        return this.f20997a.collect(c2444j == null ? null : c2444j.f21094a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20997a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ boolean isParallel() {
        return this.f20997a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Iterator iterator() {
        return this.f20997a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j6) {
        return f(this.f20997a.limit(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return f(this.f20997a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C mapToDouble(ToDoubleFunction toDoubleFunction) {
        return A.f(this.f20997a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f20997a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2460m0 mapToLong(ToLongFunction toLongFunction) {
        return C2450k0.f(this.f20997a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC2383c.i(this.f20997a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC2383c.i(this.f20997a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f20997a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h onClose(Runnable runnable) {
        return C2424f.f(this.f20997a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h parallel() {
        return C2424f.f(this.f20997a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return f(this.f20997a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2460m0 r(j$.util.function.g gVar) {
        return C2450k0.f(this.f20997a.flatMapToLong(AbstractC2510w1.n0(gVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC2383c.i(this.f20997a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f20997a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f20997a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h sequential() {
        return C2424f.f(this.f20997a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j6) {
        return f(this.f20997a.skip(j6));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return f(this.f20997a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return f(this.f20997a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f20997a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return f(this.f20997a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f20997a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f20997a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h unordered() {
        return C2424f.f(this.f20997a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C z(j$.util.function.g gVar) {
        return A.f(this.f20997a.flatMapToDouble(AbstractC2510w1.n0(gVar)));
    }
}
