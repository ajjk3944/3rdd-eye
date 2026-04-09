package fg;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8843a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8844b;

    static {
        int[] iArr = new int[hg.f.values().length];
        f8844b = iArr;
        try {
            iArr[hg.f.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8844b[hg.f.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8844b[hg.f.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[hg.d.values().length];
        f8843a = iArr2;
        try {
            iArr2[hg.d.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8843a[hg.d.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
