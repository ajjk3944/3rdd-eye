package yi;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26395a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26396b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f26397c;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f26395a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.TX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.RX.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f26396b = iArr2;
        int[] iArr3 = new int[c.values().length];
        try {
            iArr3[c.BYTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[c.PACKETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[c.DROPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f26397c = iArr3;
    }
}
