package ss;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22234a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22235b;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22234a = iArr;
        int[] iArr2 = new int[s.values().length];
        try {
            iArr2[s.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[s.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f22235b = iArr2;
    }
}
