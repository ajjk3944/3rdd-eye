package gk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9626a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ROLLING_WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.FIXED_WINDOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.EVENT_BASED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9626a = iArr;
    }
}
