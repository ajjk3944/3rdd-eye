package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class j4 extends r4 implements q4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f26628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f26629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f26630d;

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

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        this.f26630d.accept(this.f26745a, ((j4) q4Var).f26745a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26745a = this.f26628b.get();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26629c.accept(this.f26745a, obj);
    }

    public j4(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f26628b = supplier;
        this.f26629c = biConsumer;
        this.f26630d = biConsumer2;
    }
}
