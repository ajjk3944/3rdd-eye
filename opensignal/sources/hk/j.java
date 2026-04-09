package hk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10829a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.WAITING_FOR_TRIGGERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.EXECUTE_IMMEDIATELY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.EXECUTE_IMMEDIATELY_IGNORE_DELAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.EXECUTE_LATER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.SCHEDULE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.DO_NOT_HAVE_CONSENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[e.DO_NOTHING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f10829a = iArr;
    }
}
