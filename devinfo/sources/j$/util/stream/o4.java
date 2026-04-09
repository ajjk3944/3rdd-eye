package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class o4 implements q4, l5 {

    /* renamed from: a, reason: collision with root package name */
    public long f26693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f26695c;

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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l10) {
        v3.I(this, l10);
    }

    public o4(long j, LongBinaryOperator longBinaryOperator) {
        this.f26694b = j;
        this.f26695c = longBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        accept(((o4) q4Var).f26693a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26693a = this.f26694b;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f26693a = this.f26695c.applyAsLong(this.f26693a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f26693a);
    }
}
