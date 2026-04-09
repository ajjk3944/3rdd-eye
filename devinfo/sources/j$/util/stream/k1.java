package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface k1 extends g {
    IntStream B();

    k1 a();

    b0 asDoubleStream();

    j$.util.b0 average();

    k1 b();

    Stream boxed();

    k1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    k1 d(j$.util.q qVar);

    k1 distinct();

    k1 e();

    j$.util.d0 findAny();

    j$.util.d0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.g
    j$.util.p0 iterator();

    b0 k();

    k1 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.d0 max();

    j$.util.d0 min();

    boolean n();

    @Override // j$.util.stream.g
    k1 parallel();

    k1 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.d0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.g
    k1 sequential();

    k1 skip(long j);

    k1 sorted();

    @Override // j$.util.stream.g
    j$.util.z0 spliterator();

    long sum();

    j$.util.a0 summaryStatistics();

    long[] toArray();

    boolean x();
}
