package j$.util.stream;

/* loaded from: classes2.dex */
public final class v4 extends w4 {
    @Override // j$.util.stream.r4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f26798b);
    }

    @Override // j$.util.stream.q4
    public final void i(q4 q4Var) {
        this.f26798b += ((w4) q4Var).f26798b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f26798b++;
    }
}
