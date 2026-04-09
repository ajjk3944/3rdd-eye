package ts;

import rr.z;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22965a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22966b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f22967c;

    static {
        int[] iArr = new int[z.values().length];
        f22967c = iArr;
        try {
            iArr[z.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22967c[z.SEALED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22967c[z.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22967c[z.ABSTRACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[l.values().length];
        f22966b = iArr2;
        try {
            iArr2[l.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22966b[l.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22966b[l.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[f.values().length];
        f22965a = iArr3;
        try {
            iArr3[f.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f22965a[f.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f22965a[f.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f22965a[f.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
