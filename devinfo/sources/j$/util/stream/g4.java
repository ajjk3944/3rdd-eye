package j$.util.stream;

import j$.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class g4 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26586a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f26588c;

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

    public g4(BinaryOperator binaryOperator) {
        this.f26588c = binaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        g4 g4Var = (g4) q4Var;
        if (g4Var.f26586a) {
            return;
        }
        n(g4Var.f26587b);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.f26586a = true;
        this.f26587b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        if (this.f26586a) {
            this.f26586a = false;
            this.f26587b = obj;
        } else {
            this.f26587b = this.f26588c.apply(this.f26587b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f26586a ? Optional.empty() : Optional.of(this.f26587b);
    }
}
