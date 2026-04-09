package bk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2802a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CELLULAR_CONNECTED_STATE_UPDATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WIFI_CONNECTED_STATE_UPDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.WIFI_ON_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.CONNECTIVITY_STATE_UPDATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.CONNECTIVITY_CHANGE_UPDATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d.NETWORK_BLOCKED_UPDATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f2802a = iArr;
    }
}
