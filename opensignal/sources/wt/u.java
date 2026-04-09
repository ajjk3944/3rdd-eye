package wt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24659a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f24659a = iArr;
    }
}
