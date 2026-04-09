package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class r2 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f26743a;

    /* renamed from: b, reason: collision with root package name */
    public int f26744b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.Q(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.T(this, j, j8);
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
        v3.N(this, (Double[]) objArr, i4);
    }

    @Override // j$.util.stream.d2
    public final void f(int i4, Object obj) {
        int i10 = this.f26744b;
        System.arraycopy(this.f26743a, 0, (double[]) obj, i4, i10);
    }

    @Override // j$.util.stream.d2
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i4 = 0; i4 < this.f26744b; i4++) {
            doubleConsumer.accept(this.f26743a[i4]);
        }
    }

    public r2(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26743a = new double[(int) j];
        this.f26744b = 0;
    }

    public r2(double[] dArr) {
        this.f26743a = dArr;
        this.f26744b = dArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        int i4 = this.f26744b;
        double[] dArr = this.f26743a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i4);
        return new j$.util.j1(dArr, 0, i4, 1040);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.c1 spliterator() {
        int i4 = this.f26744b;
        double[] dArr = this.f26743a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i4);
        return new j$.util.j1(dArr, 0, i4, 1040);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        double[] dArr = this.f26743a;
        int length = dArr.length;
        int i4 = this.f26744b;
        return length == i4 ? dArr : Arrays.copyOf(dArr, i4);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26744b;
    }

    public String toString() {
        double[] dArr = this.f26743a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f26744b), Arrays.toString(dArr));
    }
}
