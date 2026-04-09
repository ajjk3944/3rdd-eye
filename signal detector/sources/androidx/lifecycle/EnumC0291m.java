package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0291m {
    private static final /* synthetic */ EnumC0291m[] $VALUES;
    public static final C0289k Companion;
    public static final EnumC0291m ON_ANY;
    public static final EnumC0291m ON_CREATE;
    public static final EnumC0291m ON_DESTROY;
    public static final EnumC0291m ON_PAUSE;
    public static final EnumC0291m ON_RESUME;
    public static final EnumC0291m ON_START;
    public static final EnumC0291m ON_STOP;

    static {
        EnumC0291m enumC0291m = new EnumC0291m("ON_CREATE", 0);
        ON_CREATE = enumC0291m;
        EnumC0291m enumC0291m2 = new EnumC0291m("ON_START", 1);
        ON_START = enumC0291m2;
        EnumC0291m enumC0291m3 = new EnumC0291m("ON_RESUME", 2);
        ON_RESUME = enumC0291m3;
        EnumC0291m enumC0291m4 = new EnumC0291m("ON_PAUSE", 3);
        ON_PAUSE = enumC0291m4;
        EnumC0291m enumC0291m5 = new EnumC0291m("ON_STOP", 4);
        ON_STOP = enumC0291m5;
        EnumC0291m enumC0291m6 = new EnumC0291m("ON_DESTROY", 5);
        ON_DESTROY = enumC0291m6;
        EnumC0291m enumC0291m7 = new EnumC0291m("ON_ANY", 6);
        ON_ANY = enumC0291m7;
        $VALUES = new EnumC0291m[]{enumC0291m, enumC0291m2, enumC0291m3, enumC0291m4, enumC0291m5, enumC0291m6, enumC0291m7};
        Companion = new C0289k();
    }

    public static EnumC0291m valueOf(String str) {
        return (EnumC0291m) Enum.valueOf(EnumC0291m.class, str);
    }

    public static EnumC0291m[] values() {
        return (EnumC0291m[]) $VALUES.clone();
    }

    public final EnumC0292n a() {
        switch (AbstractC0290l.f5242a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0292n.f5245c;
            case 3:
            case 4:
                return EnumC0292n.f5246d;
            case 5:
                return EnumC0292n.f5247e;
            case 6:
                return EnumC0292n.f5243a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
