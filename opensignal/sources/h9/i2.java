package h9;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10373a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10374b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f10375c;

    static {
        int[] iArr = new int[c1.values().length];
        f10375c = iArr;
        try {
            iArr[c1.Miter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10375c[c1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10375c[c1.Bevel.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[b1.values().length];
        f10374b = iArr2;
        try {
            iArr2[b1.Butt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10374b[b1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10374b[b1.Square.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[v.values().length];
        f10373a = iArr3;
        try {
            iArr3[v.xMidYMin.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10373a[v.xMidYMid.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f10373a[v.xMidYMax.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f10373a[v.xMaxYMin.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f10373a[v.xMaxYMid.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f10373a[v.xMaxYMax.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f10373a[v.xMinYMid.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f10373a[v.xMinYMax.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
