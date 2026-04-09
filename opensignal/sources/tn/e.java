package tn;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22911a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22912b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.IS_FILLED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.IS_NOT_FILLED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f22911a = iArr;
        int[] iArr2 = new int[rn.a.values().length];
        try {
            iArr2[rn.a.OR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rn.a.AND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f22912b = iArr2;
    }
}
