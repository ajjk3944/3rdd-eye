package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24348a;

    public long a(long j, long j8) {
        float fMin = Math.min(Float.intBitsToFloat((int) (j8 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMin) & 4294967295L);
        int i4 = x0.f24436a;
        return jFloatToRawIntBits;
    }

    public String toString() {
        switch (this.f24348a) {
            case 2:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
