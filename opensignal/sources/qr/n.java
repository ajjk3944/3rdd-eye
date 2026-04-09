package qr;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20996a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.NOT_CONSIDERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.DROP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.VISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20996a = iArr;
    }
}
