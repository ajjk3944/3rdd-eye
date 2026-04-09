package ht;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10891a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10892b;

    static {
        int[] iArr = new int[lt.i.values().length];
        try {
            iArr[lt.i.INV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lt.i.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lt.i.IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f10891a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.CHECK_ONLY_LOWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j0.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j0.SKIP_LOWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f10892b = iArr2;
    }
}
