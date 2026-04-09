package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class z3 implements q4, j5 {

    /* renamed from: a, reason: collision with root package name */
    public double f26833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f26834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f26835c;

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

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        v3.E(this, d10);
    }

    public z3(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f26834b = d10;
        this.f26835c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        accept(((z3) q4Var).f26833a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26833a = this.f26834b;
    }

    @Override // j$.util.stream.m5
    public final void accept(double d10) {
        this.f26833a = this.f26835c.applyAsDouble(this.f26833a, d10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f26833a);
    }
}
