package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2406b1 implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21012a;

    /* renamed from: b, reason: collision with root package name */
    public int f21013b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2510w1.R(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.U(this, j6, j7);
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
        AbstractC2510w1.O(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final void f(Object obj, int i) {
        int i3 = this.f21013b;
        System.arraycopy(this.f21012a, 0, (int[]) obj, i, i3);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f21013b; i++) {
            intConsumer.accept(this.f21012a[i]);
        }
    }

    public C2406b1(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21012a = new int[(int) j6];
        this.f21013b = 0;
    }

    public C2406b1(int[] iArr) {
        this.f21012a = iArr;
        this.f21013b = iArr.length;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.N spliterator() {
        return Spliterators.spliterator(this.f21012a, 0, this.f21013b, 1040);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f21012a, 0, this.f21013b, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        int[] iArr = this.f21012a;
        int length = iArr.length;
        int i = this.f21013b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f21013b;
    }

    public String toString() {
        int[] iArr = this.f21012a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f21013b), Arrays.toString(iArr));
    }
}
