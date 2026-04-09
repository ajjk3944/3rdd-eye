package r;

/* loaded from: classes.dex */
public interface I extends InterfaceC7533i {
    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);

    @Override // r.InterfaceC7533i
    default A0 a(s0 s0Var) {
        return new A0(this);
    }
}
