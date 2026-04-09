package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class k4 implements q4, k5 {

    /* renamed from: a, reason: collision with root package name */
    public int f26643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f26645c;

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(double d10) {
        v3.D();
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
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void d(Integer num) {
        v3.G(this, num);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    public k4(int i4, IntBinaryOperator intBinaryOperator) {
        this.f26644b = i4;
        this.f26645c = intBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        accept(((k4) q4Var).f26643a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26643a = this.f26644b;
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        this.f26643a = this.f26645c.applyAsInt(this.f26643a, i4);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f26643a);
    }
}
