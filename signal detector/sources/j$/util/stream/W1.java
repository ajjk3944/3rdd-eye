package j$.util.stream;

/* loaded from: classes2.dex */
public final class W1 extends X1 {
    @Override // j$.util.stream.S1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f20979b);
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        this.f20979b += ((X1) r12).f20979b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f20979b++;
    }
}
