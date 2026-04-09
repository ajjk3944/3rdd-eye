package e1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7665a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7666b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.Redirected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.RedirectCancelled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7665a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f7666b = iArr2;
    }
}
