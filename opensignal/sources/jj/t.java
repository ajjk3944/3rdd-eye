package jj;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13755a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.LOCATION_ENABLED_MANDATORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.LOCATION_ENABLED_OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.LOCATION_DISABLED_MANDATORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u.LOCATION_DISABLED_OPTIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13755a = iArr;
    }
}
