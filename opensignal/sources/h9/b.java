package h9;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10304a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10305b;

    static {
        int[] iArr = new int[k.values().length];
        f10305b = iArr;
        try {
            iArr[k.first_child.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10305b[k.last_child.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10305b[k.only_child.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10305b[k.first_of_type.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10305b[k.last_of_type.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10305b[k.only_of_type.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f10305b[k.root.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10305b[k.empty.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f10305b[k.nth_child.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f10305b[k.nth_last_child.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f10305b[k.nth_of_type.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f10305b[k.nth_last_of_type.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f10305b[k.not.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f10305b[k.target.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f10305b[k.lang.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f10305b[k.link.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f10305b[k.visited.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f10305b[k.hover.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f10305b[k.active.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f10305b[k.focus.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f10305b[k.enabled.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f10305b[k.disabled.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f10305b[k.checked.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f10305b[k.indeterminate.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr2 = new int[d.values().length];
        f10304a = iArr2;
        try {
            iArr2[d.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f10304a[d.INCLUDES.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f10304a[d.DASHMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
