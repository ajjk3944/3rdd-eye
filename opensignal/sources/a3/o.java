package a3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f66a;

    static {
        int[] iArr = new int[s.values().length];
        f66a = iArr;
        try {
            iArr[s.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f66a[s.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f66a[s.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
