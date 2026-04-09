package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface G0 {
    G0 a(int i);

    long count();

    void forEach(Consumer consumer);

    G0 j(long j6, long j7, IntFunction intFunction);

    void k(Object[] objArr, int i);

    Object[] n(IntFunction intFunction);

    int p();

    Spliterator spliterator();
}
