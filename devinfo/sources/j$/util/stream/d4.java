package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class d4 extends r4 implements q4, j5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f26552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f26553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f26554d;

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

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        this.f26745a = this.f26554d.apply(this.f26745a, ((d4) q4Var).f26745a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26745a = this.f26552b.get();
    }

    @Override // j$.util.stream.m5
    public final void accept(double d10) {
        this.f26553c.accept(this.f26745a, d10);
    }

    public d4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, n nVar) {
        this.f26552b = supplier;
        this.f26553c = objDoubleConsumer;
        this.f26554d = nVar;
    }
}
