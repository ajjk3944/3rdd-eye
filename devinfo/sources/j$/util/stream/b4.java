package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class b4 implements q4, j5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26505a;

    /* renamed from: b, reason: collision with root package name */
    public double f26506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f26507c;

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

    public b4(DoubleBinaryOperator doubleBinaryOperator) {
        this.f26507c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        b4 b4Var = (b4) q4Var;
        if (b4Var.f26505a) {
            return;
        }
        accept(b4Var.f26506b);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26505a = true;
        this.f26506b = 0.0d;
    }

    @Override // j$.util.stream.m5
    public final void accept(double d10) {
        if (this.f26505a) {
            this.f26505a = false;
            this.f26506b = d10;
        } else {
            this.f26506b = this.f26507c.applyAsDouble(this.f26506b, d10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f26505a ? j$.util.b0.f26287c : new j$.util.b0(this.f26506b);
    }
}
