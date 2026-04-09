package tn;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22922a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.IS_EXACTLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.INCLUDES_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.INCLUDES_ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.DOES_NOT_INCLUDE_ANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f22922a = iArr;
    }
}
