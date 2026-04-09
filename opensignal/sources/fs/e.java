package fs;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9063a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.INFLEXIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9063a = iArr;
    }
}
