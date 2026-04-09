package fm;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8995a;

    static {
        int[] iArr = new int[gm.b.values().length];
        try {
            iArr[gm.b.UNMAPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gm.b.LATENCY_RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gm.b.DOWNLOAD_RUNNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gm.b.UPLOAD_RUNNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[gm.b.LATENCY_STARTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[gm.b.LATENCY_FINISHED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[gm.b.DOWNLOAD_STARTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[gm.b.DOWNLOAD_FINISHED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[gm.b.UPLOAD_STARTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f8995a = iArr;
    }
}
