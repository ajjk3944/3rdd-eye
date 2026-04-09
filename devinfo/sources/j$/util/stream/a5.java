package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class a5 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f26476b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.util.i0 f26477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f26478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(t0 t0Var, m5 m5Var) {
        super(m5Var);
        this.f26478d = t0Var;
        m5 m5Var2 = this.f26617a;
        Objects.requireNonNull(m5Var2);
        this.f26477c = new j$.util.i0(m5Var2, 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        this.f26617a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) throws Exception {
        IntStream intStream = (IntStream) ((j$.util.q) this.f26478d.f26759t).apply((j$.util.q) obj);
        if (intStream != null) {
            try {
                boolean z3 = this.f26476b;
                j$.util.i0 i0Var = this.f26477c;
                if (!z3) {
                    intStream.sequential().forEach(i0Var);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f26617a.e() && ofIntSpliterator.tryAdvance((IntConsumer) i0Var)) {
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

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        this.f26476b = true;
        return this.f26617a.e();
    }
}
