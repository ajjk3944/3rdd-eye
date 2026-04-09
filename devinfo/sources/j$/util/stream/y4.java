package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class y4 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26824b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26825c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f26827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(q qVar, m5 m5Var) {
        super(m5Var);
        this.f26827e = qVar;
        m5 m5Var2 = this.f26617a;
        Objects.requireNonNull(m5Var2);
        this.f26826d = new j$.util.e0(m5Var2, 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        switch (this.f26824b) {
            case 0:
                this.f26617a.c(-1L);
                break;
            default:
                this.f26617a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f26824b) {
            case 0:
                j$.util.m0 m0Var = (j$.util.m0) this.f26826d;
                k1 k1Var = (k1) ((j$.util.q) ((d1) this.f26827e).f26551t).apply((j$.util.q) obj);
                if (k1Var != null) {
                    try {
                        if (!this.f26825c) {
                            k1Var.sequential().forEach(m0Var);
                        } else {
                            j$.util.z0 z0VarSpliterator = k1Var.sequential().spliterator();
                            while (!this.f26617a.e() && z0VarSpliterator.tryAdvance((LongConsumer) m0Var)) {
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
                    return;
                }
                return;
            default:
                j$.util.e0 e0Var = (j$.util.e0) this.f26826d;
                b0 b0Var = (b0) ((j$.util.q) ((q) this.f26827e).f26718t).apply((j$.util.q) obj);
                if (b0Var != null) {
                    try {
                        if (!this.f26825c) {
                            b0Var.sequential().forEach(e0Var);
                        } else {
                            j$.util.u0 u0VarSpliterator = b0Var.sequential().spliterator();
                            while (!this.f26617a.e() && u0VarSpliterator.tryAdvance((DoubleConsumer) e0Var)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            b0Var.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (b0Var != null) {
                    b0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        switch (this.f26824b) {
            case 0:
                this.f26825c = true;
                break;
            default:
                this.f26825c = true;
                break;
        }
        return this.f26617a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(d1 d1Var, m5 m5Var) {
        super(m5Var);
        this.f26827e = d1Var;
        m5 m5Var2 = this.f26617a;
        Objects.requireNonNull(m5Var2);
        this.f26826d = new j$.util.m0(m5Var2, 1);
    }
}
