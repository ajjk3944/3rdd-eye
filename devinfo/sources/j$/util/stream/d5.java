package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class d5 extends e5 {
    @Override // j$.util.stream.a
    public final boolean G0() {
        return false;
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !a7.ORDERED.l(this.f26462m) ? this : new z4(this, a7.f26490r);
    }
}
