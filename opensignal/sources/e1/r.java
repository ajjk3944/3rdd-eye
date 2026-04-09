package e1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7672a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7673b;

    static {
        int[] iArr = new int[t2.i.values().length];
        try {
            iArr[t2.i.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t2.i.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f7672a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f7673b = iArr2;
    }
}
