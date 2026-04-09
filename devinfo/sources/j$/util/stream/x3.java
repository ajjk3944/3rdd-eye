package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class x3 extends r4 implements q4, l5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f26813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f26814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f26815d;

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

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        this.f26745a = this.f26815d.apply(this.f26745a, ((x3) q4Var).f26745a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26745a = this.f26813b.get();
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f26814c.accept(this.f26745a, j);
    }

    public x3(Supplier supplier, ObjLongConsumer objLongConsumer, n nVar) {
        this.f26813b = supplier;
        this.f26814c = objLongConsumer;
        this.f26815d = nVar;
    }
}
