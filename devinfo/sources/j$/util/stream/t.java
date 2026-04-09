package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class t extends f5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f26755b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.e0 f26756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f26757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, m5 m5Var) {
        super(m5Var);
        this.f26757d = qVar;
        m5 m5Var2 = this.f26578a;
        Objects.requireNonNull(m5Var2);
        this.f26756c = new j$.util.e0(m5Var2, 1);
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        this.f26578a.c(-1L);
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) throws Exception {
        b0 b0Var = (b0) ((j$.util.q) this.f26757d.f26718t).apply(d10);
        if (b0Var != null) {
            try {
                boolean z3 = this.f26755b;
                j$.util.e0 e0Var = this.f26756c;
                if (!z3) {
                    b0Var.sequential().forEach(e0Var);
                } else {
                    j$.util.u0 u0VarSpliterator = b0Var.sequential().spliterator();
                    while (!this.f26578a.e() && u0VarSpliterator.tryAdvance((DoubleConsumer) e0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    b0Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b0Var != null) {
            b0Var.close();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final boolean e() {
        this.f26755b = true;
        return this.f26578a.e();
    }
}
