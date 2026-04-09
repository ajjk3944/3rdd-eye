package jj;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13742a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.LTE_CELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.NR_CELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.GSM_CELL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.CDMA_CELL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.WCDMA_CELL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f13742a = iArr;
    }
}
