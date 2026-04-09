package q8;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20725a;

    static {
        int[] iArr = new int[o8.b.values().length];
        try {
            iArr[o8.b.UNCHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o8.b.TRANSLUCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o8.b.OPAQUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[m8.g.values().length];
        try {
            iArr2[m8.g.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m8.g.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f20725a = iArr2;
    }
}
