package tn;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22931a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22932b;

    static {
        int[] iArr = new int[rn.a.values().length];
        try {
            iArr[rn.a.OR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rn.a.AND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22931a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.ANSWER_CONTAINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u.ANSWER_DOES_NOT_CONTAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u.QUESTION_IS_ANSWERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u.QUESTION_IS_NOT_ANSWERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[u.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f22932b = iArr2;
    }
}
