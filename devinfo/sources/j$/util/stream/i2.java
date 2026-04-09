package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class i2 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f26607a;

    /* renamed from: b, reason: collision with root package name */
    public int f26608b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.W(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i4) {
        throw new IndexOutOfBoundsException();
    }

    public i2(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26607a = (Object[]) intFunction.apply((int) j);
        this.f26608b = 0;
    }

    public i2(Object[] objArr) {
        this.f26607a = objArr;
        this.f26608b = objArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        int i4 = this.f26608b;
        Object[] objArr = this.f26607a;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i4);
        return new j$.util.i1(objArr, 0, i4, 1040);
    }

    @Override // j$.util.stream.e2
    public final void k(Object[] objArr, int i4) {
        System.arraycopy(this.f26607a, 0, objArr, i4, this.f26608b);
    }

    @Override // j$.util.stream.e2
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.f26607a;
        if (objArr.length == this.f26608b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26608b;
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        for (int i4 = 0; i4 < this.f26608b; i4++) {
            consumer.n(this.f26607a[i4]);
        }
    }

    public String toString() {
        Object[] objArr = this.f26607a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f26608b), Arrays.toString(objArr));
    }
}
