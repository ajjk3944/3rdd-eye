package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class j3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f26626a;

    /* renamed from: b, reason: collision with root package name */
    public int f26627b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.S(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.V(this, j, j8);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.M(this, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final /* bridge */ /* synthetic */ e2 a(int i4) {
        a(i4);
        throw null;
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final d2 a(int i4) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void k(Object[] objArr, int i4) {
        v3.P(this, (Long[]) objArr, i4);
    }

    @Override // j$.util.stream.d2
    public final void f(int i4, Object obj) {
        int i10 = this.f26627b;
        System.arraycopy(this.f26626a, 0, (long[]) obj, i4, i10);
    }

    @Override // j$.util.stream.d2
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i4 = 0; i4 < this.f26627b; i4++) {
            longConsumer.accept(this.f26626a[i4]);
        }
    }

    public j3(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26626a = new long[(int) j];
        this.f26627b = 0;
    }

    public j3(long[] jArr) {
        this.f26626a = jArr;
        this.f26627b = jArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        int i4 = this.f26627b;
        long[] jArr = this.f26626a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i4);
        return new j$.util.q1(jArr, 0, i4, 1040);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.c1 spliterator() {
        int i4 = this.f26627b;
        long[] jArr = this.f26626a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i4);
        return new j$.util.q1(jArr, 0, i4, 1040);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        long[] jArr = this.f26626a;
        int length = jArr.length;
        int i4 = this.f26627b;
        return length == i4 ? jArr : Arrays.copyOf(jArr, i4);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26627b;
    }

    public String toString() {
        long[] jArr = this.f26626a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f26627b), Arrays.toString(jArr));
    }
}
