package ih;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11366a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11367b;

    static {
        int[] iArr = new int[l.values().length];
        f11367b = iArr;
        try {
            iArr[l.OS_TRAFFIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11367b[l.SENT_TO_BUFFER_OR_REC_FROM_BUFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[d.values().length];
        f11366a = iArr2;
        try {
            iArr2[d.DOWNLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11366a[d.UPLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
