package e1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7664a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.Captured.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7664a = iArr;
    }
}
