package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class p4 implements q4, l5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26710a;

    /* renamed from: b, reason: collision with root package name */
    public long f26711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f26712c;

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

    public p4(LongBinaryOperator longBinaryOperator) {
        this.f26712c = longBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        p4 p4Var = (p4) q4Var;
        if (p4Var.f26710a) {
            return;
        }
        accept(p4Var.f26711b);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26710a = true;
        this.f26711b = 0L;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.f26710a) {
            this.f26710a = false;
            this.f26711b = j;
        } else {
            this.f26711b = this.f26712c.applyAsLong(this.f26711b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f26710a ? j$.util.d0.f26364c : new j$.util.d0(this.f26711b);
    }
}
