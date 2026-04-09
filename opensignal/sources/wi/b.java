package wi;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24531a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.BATTERY_STATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.DEVICE_SHUTDOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.POWER_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.SCREEN_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.RADIO_STATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.WIFI_SCAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f24531a = iArr;
    }
}
