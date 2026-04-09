package tn;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22920a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22921b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.IS_BETWEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.HAS_ANY_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22920a = iArr;
        int[] iArr2 = new int[rn.a.values().length];
        try {
            iArr2[rn.a.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[rn.a.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f22921b = iArr2;
    }
}
