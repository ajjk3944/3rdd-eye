package b7;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class T {
    public static final int a(double d10) throws IllegalArgumentException {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d10 * 255.0f) + 0.5f);
    }
}
