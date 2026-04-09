package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class r8 extends f5 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26749b;

    public r8(f6 f6Var, m5 m5Var) {
        super(m5Var);
        this.f26749b = true;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        this.f26578a.c(-1L);
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        if (this.f26749b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d10);
            throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final boolean e() {
        return !this.f26749b || this.f26578a.e();
    }
}
