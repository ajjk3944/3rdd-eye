package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class a3 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f26471a;

    /* renamed from: b, reason: collision with root package name */
    public int f26472b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.R(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.U(this, j, j8);
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
        v3.O(this, (Integer[]) objArr, i4);
    }

    @Override // j$.util.stream.d2
    public final void f(int i4, Object obj) {
        int i10 = this.f26472b;
        System.arraycopy(this.f26471a, 0, (int[]) obj, i4, i10);
    }

    @Override // j$.util.stream.d2
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i4 = 0; i4 < this.f26472b; i4++) {
            intConsumer.accept(this.f26471a[i4]);
        }
    }

    public a3(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26471a = new int[(int) j];
        this.f26472b = 0;
    }

    public a3(int[] iArr) {
        this.f26471a = iArr;
        this.f26472b = iArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f26471a, 0, this.f26472b, 1040);
    }

    @Override // j$.util.stream.d2, j$.util.stream.e2
    public final j$.util.c1 spliterator() {
        return Spliterators.spliterator(this.f26471a, 0, this.f26472b, 1040);
    }

    @Override // j$.util.stream.d2
    public final Object b() {
        int[] iArr = this.f26471a;
        int length = iArr.length;
        int i4 = this.f26472b;
        return length == i4 ? iArr : Arrays.copyOf(iArr, i4);
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26472b;
    }

    public String toString() {
        int[] iArr = this.f26471a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f26472b), Arrays.toString(iArr));
    }
}
