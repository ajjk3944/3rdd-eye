package mp;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16907a;

    static {
        int[] iArr = new int[np.c.values().length];
        try {
            iArr[np.c.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[np.c.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[np.c.PortraitHorizontal.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16907a = iArr;
    }
}
