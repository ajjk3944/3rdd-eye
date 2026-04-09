package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2630b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2630b f21803a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2630b f21804b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2630b f21805c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2630b f21806d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC2630b[] f21807e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2630b EF0;

    static {
        EnumC2630b enumC2630b = new EnumC2630b("PENALTY_LOG", 0);
        EnumC2630b enumC2630b2 = new EnumC2630b("PENALTY_DEATH", 1);
        EnumC2630b enumC2630b3 = new EnumC2630b("DETECT_FRAGMENT_REUSE", 2);
        f21803a = enumC2630b3;
        EnumC2630b enumC2630b4 = new EnumC2630b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f21804b = enumC2630b4;
        EnumC2630b enumC2630b5 = new EnumC2630b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f21805c = enumC2630b5;
        EnumC2630b enumC2630b6 = new EnumC2630b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC2630b enumC2630b7 = new EnumC2630b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC2630b enumC2630b8 = new EnumC2630b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC2630b enumC2630b9 = new EnumC2630b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f21806d = enumC2630b9;
        f21807e = new EnumC2630b[]{enumC2630b, enumC2630b2, enumC2630b3, enumC2630b4, enumC2630b5, enumC2630b6, enumC2630b7, enumC2630b8, enumC2630b9};
    }

    public static EnumC2630b valueOf(String str) {
        return (EnumC2630b) Enum.valueOf(EnumC2630b.class, str);
    }

    public static EnumC2630b[] values() {
        return (EnumC2630b[]) f21807e.clone();
    }
}
