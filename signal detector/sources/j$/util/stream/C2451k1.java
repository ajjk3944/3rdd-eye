package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2451k1 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f21106a;

    /* renamed from: b, reason: collision with root package name */
    public int f21107b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2510w1.S(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.V(this, j6, j7);
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
        AbstractC2510w1.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final void f(Object obj, int i) {
        int i3 = this.f21107b;
        System.arraycopy(this.f21106a, 0, (long[]) obj, i, i3);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.f21107b; i++) {
            longConsumer.accept(this.f21106a[i]);
        }
    }

    public C2451k1(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21106a = new long[(int) j6];
        this.f21107b = 0;
    }

    public C2451k1(long[] jArr) {
        this.f21106a = jArr;
        this.f21107b = jArr.length;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.N spliterator() {
        int i = this.f21107b;
        long[] jArr = this.f21106a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.c0(jArr, 0, i, 1040);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i = this.f21107b;
        long[] jArr = this.f21106a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.c0(jArr, 0, i, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        long[] jArr = this.f21106a;
        int length = jArr.length;
        int i = this.f21107b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f21107b;
    }

    public String toString() {
        long[] jArr = this.f21106a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f21107b), Arrays.toString(jArr));
    }
}
