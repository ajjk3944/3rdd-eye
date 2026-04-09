package j$.util.stream;

import j$.util.C2392l;
import j$.util.C2393m;
import j$.util.C2395o;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2460m0 extends InterfaceC2434h {
    IntStream A();

    InterfaceC2460m0 a();

    C asDoubleStream();

    C2393m average();

    InterfaceC2460m0 b();

    Stream boxed();

    InterfaceC2460m0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC2460m0 d(j$.util.function.g gVar);

    InterfaceC2460m0 distinct();

    InterfaceC2460m0 e();

    C2395o findAny();

    C2395o findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC2434h
    j$.util.A iterator();

    C k();

    InterfaceC2460m0 limit(long j6);

    boolean m();

    Stream mapToObj(LongFunction longFunction);

    C2395o max();

    C2395o min();

    boolean p();

    @Override // j$.util.stream.InterfaceC2434h
    InterfaceC2460m0 parallel();

    InterfaceC2460m0 peek(LongConsumer longConsumer);

    long reduce(long j6, LongBinaryOperator longBinaryOperator);

    C2395o reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC2434h
    InterfaceC2460m0 sequential();

    InterfaceC2460m0 skip(long j6);

    InterfaceC2460m0 sorted();

    @Override // j$.util.stream.InterfaceC2434h
    j$.util.K spliterator();

    long sum();

    C2392l summaryStatistics();

    long[] toArray();

    boolean w();
}
