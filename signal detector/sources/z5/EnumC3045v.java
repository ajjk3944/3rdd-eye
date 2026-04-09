package z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z5.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3045v {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3045v f24556a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3045v[] f24557b;

    static {
        EnumC3045v enumC3045v = new EnumC3045v("DEFAULT", 0);
        f24556a = enumC3045v;
        f24557b = new EnumC3045v[]{enumC3045v, new EnumC3045v("LAZY", 1), new EnumC3045v("ATOMIC", 2), new EnumC3045v("UNDISPATCHED", 3)};
    }

    public static EnumC3045v valueOf(String str) {
        return (EnumC3045v) Enum.valueOf(EnumC3045v.class, str);
    }

    public static EnumC3045v[] values() {
        return (EnumC3045v[]) f24557b.clone();
    }
}
