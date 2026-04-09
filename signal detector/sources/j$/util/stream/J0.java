package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class J0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20890a;

    /* renamed from: b, reason: collision with root package name */
    public int f20891b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.W(this, j6, j7, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public J0(long j6, IntFunction intFunction) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20890a = (Object[]) intFunction.apply((int) j6);
        this.f20891b = 0;
    }

    public J0(Object[] objArr) {
        this.f20890a = objArr;
        this.f20891b = objArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i = this.f20891b;
        Object[] objArr = this.f20890a;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i);
        return new j$.util.U(objArr, 0, i, 1040);
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i) {
        System.arraycopy(this.f20890a, 0, objArr, i, this.f20891b);
    }

    @Override // j$.util.stream.G0
    public final Object[] n(IntFunction intFunction) {
        Object[] objArr = this.f20890a;
        if (objArr.length == this.f20891b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f20891b;
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f20891b; i++) {
            consumer.o(this.f20890a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.f20890a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f20891b), Arrays.toString(objArr));
    }
}
