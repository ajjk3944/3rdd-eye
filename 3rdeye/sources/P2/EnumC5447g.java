package p2;

/* compiled from: LBlendMode.java */
/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5447g {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* compiled from: LBlendMode.java */
    /* renamed from: p2.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45041a;

        static {
            int[] iArr = new int[EnumC5447g.values().length];
            f45041a = iArr;
            try {
                iArr[EnumC5447g.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45041a[EnumC5447g.MULTIPLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45041a[EnumC5447g.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45041a[EnumC5447g.OVERLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45041a[EnumC5447g.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45041a[EnumC5447g.LIGHTEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45041a[EnumC5447g.ADD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45041a[EnumC5447g.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45041a[EnumC5447g.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45041a[EnumC5447g.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45041a[EnumC5447g.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45041a[EnumC5447g.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45041a[EnumC5447g.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45041a[EnumC5447g.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45041a[EnumC5447g.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45041a[EnumC5447g.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45041a[EnumC5447g.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45041a[EnumC5447g.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public C0.a toNativeBlendMode() {
        switch (a.f45041a[ordinal()]) {
            case 2:
                return C0.a.MODULATE;
            case 3:
                return C0.a.SCREEN;
            case 4:
                return C0.a.OVERLAY;
            case 5:
                return C0.a.DARKEN;
            case 6:
                return C0.a.LIGHTEN;
            case 7:
                return C0.a.PLUS;
            default:
                return null;
        }
    }
}
