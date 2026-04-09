package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public abstract class f5 implements j5 {

    /* renamed from: a, reason: collision with root package name */
    public final m5 f26578a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        v3.E(this, d10);
    }

    public f5(m5 m5Var) {
        this.f26578a = (m5) Objects.requireNonNull(m5Var);
    }

    @Override // j$.util.stream.m5
    public void c(long j) {
        this.f26578a.c(j);
    }

    @Override // j$.util.stream.m5
    public void end() {
        this.f26578a.end();
    }

    @Override // j$.util.stream.m5
    public boolean e() {
        return this.f26578a.e();
    }
}
