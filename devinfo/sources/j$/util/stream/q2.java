package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q2 extends h2 {
    @Override // j$.util.stream.e2
    public final e2 j(long j, long j8, IntFunction intFunction) {
        if (j == 0 && j8 == this.f26596c) {
            return this;
        }
        long jCount = this.f26594a.count();
        if (j >= jCount) {
            return this.f26595b.j(j - jCount, j8 - jCount, intFunction);
        }
        if (j8 > jCount) {
            return v3.c0(b7.REFERENCE, this.f26594a.j(j, jCount, intFunction), this.f26595b.j(0L, j8 - jCount, intFunction));
        }
        return this.f26594a.j(j, j8, intFunction);
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new h3(this);
    }

    @Override // j$.util.stream.e2
    public final void k(Object[] objArr, int i4) {
        Objects.requireNonNull(objArr);
        e2 e2Var = this.f26594a;
        e2Var.k(objArr, i4);
        this.f26595b.k(objArr, i4 + ((int) e2Var.count()));
    }

    @Override // j$.util.stream.e2
    public final Object[] m(IntFunction intFunction) {
        long j = this.f26596c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        this.f26594a.forEach(consumer);
        this.f26595b.forEach(consumer);
    }

    public final String toString() {
        long j = this.f26596c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.f26594a, this.f26595b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
