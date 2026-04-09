package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class l8 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26665b;

    public l8(m8 m8Var, m5 m5Var) {
        super(m5Var);
        this.f26665b = true;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        this.f26589a.c(-1L);
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        if (this.f26665b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i4);
            throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final boolean e() {
        return !this.f26665b || this.f26589a.e();
    }
}
