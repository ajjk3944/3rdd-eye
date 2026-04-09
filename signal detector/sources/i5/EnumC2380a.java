package i5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2380a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2380a f20635a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2380a[] f20636b;

    static {
        EnumC2380a enumC2380a = new EnumC2380a("COROUTINE_SUSPENDED", 0);
        f20635a = enumC2380a;
        f20636b = new EnumC2380a[]{enumC2380a, new EnumC2380a("UNDECIDED", 1), new EnumC2380a("RESUMED", 2)};
    }

    public static EnumC2380a valueOf(String str) {
        return (EnumC2380a) Enum.valueOf(EnumC2380a.class, str);
    }

    public static EnumC2380a[] values() {
        return (EnumC2380a[]) f20636b.clone();
    }
}
