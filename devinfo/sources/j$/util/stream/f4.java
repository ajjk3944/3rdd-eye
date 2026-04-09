package j$.util.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class f4 extends r4 implements q4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f26576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f26577d;

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
        this.f26745a = this.f26577d.apply(this.f26745a, ((f4) q4Var).f26745a);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26745a = this.f26575b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26745a = this.f26576c.apply(this.f26745a, obj);
    }

    public f4(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f26575b = obj;
        this.f26576c = biFunction;
        this.f26577d = binaryOperator;
    }
}
