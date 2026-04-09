package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2635a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2635a f21812a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2635a f21813b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2635a f21814c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2635a[] f21815d;

    static {
        EnumC2635a enumC2635a = new EnumC2635a("PREFER_ARGB_8888", 0);
        f21812a = enumC2635a;
        EnumC2635a enumC2635a2 = new EnumC2635a("PREFER_RGB_565", 1);
        f21813b = enumC2635a2;
        f21815d = new EnumC2635a[]{enumC2635a, enumC2635a2};
        f21814c = enumC2635a;
    }

    public static EnumC2635a valueOf(String str) {
        return (EnumC2635a) Enum.valueOf(EnumC2635a.class, str);
    }

    public static EnumC2635a[] values() {
        return (EnumC2635a[]) f21815d.clone();
    }
}
