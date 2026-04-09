package x1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24953a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24954b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24953a = iArr;
        int[] iArr2 = new int[d0.values().length];
        try {
            iArr2[d0.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d0.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f24954b = iArr2;
    }
}
