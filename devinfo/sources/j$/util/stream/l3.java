package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class l3 extends u6 implements c2, v1 {
    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.v1, j$.util.stream.w1
    public final c2 build() {
        return this;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
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
        return v3.V(this, j, j8);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l10) {
        v3.I(this, l10);
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

    @Override // j$.util.stream.w6, j$.util.stream.d2
    public final void f(int i4, Object obj) {
        super.f(i4, (long[]) obj);
    }

    @Override // j$.util.stream.w6, j$.util.stream.d2
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.u6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.u6, j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
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
        return (long[]) super.b();
    }
}
