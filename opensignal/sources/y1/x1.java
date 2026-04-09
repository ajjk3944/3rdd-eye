package y1;

/* loaded from: classes.dex */
public interface x1 {
    default long a() {
        float f10 = 48;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }
}
