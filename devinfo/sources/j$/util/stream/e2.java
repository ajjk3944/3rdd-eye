package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface e2 {
    e2 a(int i4);

    long count();

    void forEach(Consumer consumer);

    e2 j(long j, long j8, IntFunction intFunction);

    void k(Object[] objArr, int i4);

    Object[] m(IntFunction intFunction);

    int o();

    Spliterator spliterator();
}
