package tm;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22893a;

    static {
        int[] iArr = new int[um.a.values().length];
        try {
            iArr[um.a.WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[um.a.MOBILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[um.a.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f22893a = iArr;
    }
}
