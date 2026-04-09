package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class c1 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f26522b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.m0 f26523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f26524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, m5 m5Var) {
        super(m5Var);
        this.f26524d = d1Var;
        m5 m5Var2 = this.f26600a;
        Objects.requireNonNull(m5Var2);
        this.f26523c = new j$.util.m0(m5Var2, 1);
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        this.f26600a.c(-1L);
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) throws Exception {
        k1 k1Var = (k1) ((j$.util.q) this.f26524d.f26551t).apply(j);
        if (k1Var != null) {
            try {
                boolean z3 = this.f26522b;
                j$.util.m0 m0Var = this.f26523c;
                if (!z3) {
                    k1Var.sequential().forEach(m0Var);
                } else {
                    j$.util.z0 z0VarSpliterator = k1Var.sequential().spliterator();
                    while (!this.f26600a.e() && z0VarSpliterator.tryAdvance((LongConsumer) m0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    k1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (k1Var != null) {
            k1Var.close();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final boolean e() {
        this.f26522b = true;
        return this.f26600a.e();
    }
}
