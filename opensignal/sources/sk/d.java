package sk;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22071a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22072b;

    static {
        int[] iArr = new int[f.values().length];
        f22072b = iArr;
        try {
            iArr[f.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22072b[f.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22072b[f.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[g.values().length];
        f22071a = iArr2;
        try {
            iArr2[g.DOWNLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22071a[g.UPLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22071a[g.LATENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22071a[g.SIGNAL_BARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
