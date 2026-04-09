package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class i5 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final m5 f26617a;

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

    public i5(m5 m5Var) {
        this.f26617a = (m5) Objects.requireNonNull(m5Var);
    }

    @Override // j$.util.stream.m5
    public void c(long j) {
        this.f26617a.c(j);
    }

    @Override // j$.util.stream.m5
    public void end() {
        this.f26617a.end();
    }

    @Override // j$.util.stream.m5
    public boolean e() {
        return this.f26617a.e();
    }
}
