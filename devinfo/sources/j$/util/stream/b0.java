package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface b0 extends g {
    IntStream A();

    boolean C();

    b0 a();

    j$.util.b0 average();

    b0 b();

    Stream boxed();

    b0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    b0 d(j$.util.q qVar);

    b0 distinct();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.g
    j$.util.h0 iterator();

    b0 limit(long j);

    b0 map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    boolean p();

    @Override // j$.util.stream.g
    b0 parallel();

    b0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.g
    b0 sequential();

    b0 skip(long j);

    b0 sorted();

    @Override // j$.util.stream.g
    j$.util.u0 spliterator();

    double sum();

    j$.util.x summaryStatistics();

    double[] toArray();

    boolean u();

    k1 v();
}
