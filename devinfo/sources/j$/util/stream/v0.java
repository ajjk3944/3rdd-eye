package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class v0 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f26771b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.i0 f26772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f26773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t0 t0Var, m5 m5Var) {
        super(m5Var);
        this.f26773d = t0Var;
        m5 m5Var2 = this.f26589a;
        Objects.requireNonNull(m5Var2);
        this.f26772c = new j$.util.i0(m5Var2, 1);
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        this.f26589a.c(-1L);
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) throws Exception {
        IntStream intStream = (IntStream) ((k0) this.f26773d.f26759t).apply(i4);
        if (intStream != null) {
            try {
                boolean z3 = this.f26771b;
                j$.util.i0 i0Var = this.f26772c;
                if (!z3) {
                    intStream.sequential().forEach(i0Var);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f26589a.e() && ofIntSpliterator.tryAdvance((IntConsumer) i0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final boolean e() {
        this.f26771b = true;
        return this.f26589a.e();
    }
}
