package a3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63a;

    static {
        int[] iArr = new int[s.values().length];
        f63a = iArr;
        try {
            iArr[s.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63a[s.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63a[s.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
