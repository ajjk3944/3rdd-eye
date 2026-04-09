package w;

/* loaded from: classes.dex */
public interface q extends f {
    @Override // w.f
    default g0 a(om.f fVar) {
        return new js.e(this);
    }

    float b(long j, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j, float f10, float f11, float f12);
}
