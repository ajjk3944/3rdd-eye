package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class S0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f20962a;

    /* renamed from: b, reason: collision with root package name */
    public int f20963b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2510w1.Q(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.T(this, j6, j7);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC2510w1.M(this, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC2510w1.N(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final void f(Object obj, int i) {
        int i3 = this.f20963b;
        System.arraycopy(this.f20962a, 0, (double[]) obj, i, i3);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.f20963b; i++) {
            doubleConsumer.accept(this.f20962a[i]);
        }
    }

    public S0(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20962a = new double[(int) j6];
        this.f20963b = 0;
    }

    public S0(double[] dArr) {
        this.f20962a = dArr;
        this.f20963b = dArr.length;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.N spliterator() {
        int i = this.f20963b;
        double[] dArr = this.f20962a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.V(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i = this.f20963b;
        double[] dArr = this.f20962a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.V(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        double[] dArr = this.f20962a;
        int length = dArr.length;
        int i = this.f20963b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f20963b;
    }

    public String toString() {
        double[] dArr = this.f20962a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f20963b), Arrays.toString(dArr));
    }
}
