package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class t2 extends q6 implements y1, t1 {
    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.t1, j$.util.stream.w1
    public final y1 build() {
        return this;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final void end() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.T(this, j, j8);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.M(this, intFunction);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        v3.E(this, d10);
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

    @Override // j$.util.stream.w6, j$.util.stream.d2
    public final void f(int i4, Object obj) {
        super.f(i4, (double[]) obj);
    }

    @Override // j$.util.stream.w6, j$.util.stream.d2
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.q6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.q6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    public final j$.util.c1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.w6, j$.util.stream.d2
    public final Object b() {
        return (double[]) super.b();
    }
}
