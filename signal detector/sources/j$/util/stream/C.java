package j$.util.stream;

import j$.util.C2389i;
import j$.util.C2393m;
import j$.util.InterfaceC2398s;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface C extends InterfaceC2434h {
    boolean B();

    C a();

    C2393m average();

    C b();

    Stream boxed();

    C c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    C d(j$.util.function.g gVar);

    C distinct();

    C e();

    C2393m findAny();

    C2393m findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.InterfaceC2434h
    InterfaceC2398s iterator();

    C limit(long j6);

    Stream mapToObj(DoubleFunction doubleFunction);

    C2393m max();

    C2393m min();

    boolean n();

    @Override // j$.util.stream.InterfaceC2434h
    C parallel();

    C peek(DoubleConsumer doubleConsumer);

    double reduce(double d6, DoubleBinaryOperator doubleBinaryOperator);

    C2393m reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.InterfaceC2434h
    C sequential();

    C skip(long j6);

    C sorted();

    @Override // j$.util.stream.InterfaceC2434h
    j$.util.F spliterator();

    double sum();

    C2389i summaryStatistics();

    boolean t();

    double[] toArray();

    InterfaceC2460m0 u();

    IntStream y();
}
