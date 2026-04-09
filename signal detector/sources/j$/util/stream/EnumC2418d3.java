package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2418d3 {
    public static final EnumC2418d3 DOUBLE_VALUE;
    public static final EnumC2418d3 INT_VALUE;
    public static final EnumC2418d3 LONG_VALUE;
    public static final EnumC2418d3 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2418d3[] f21054a;

    public static EnumC2418d3 valueOf(String str) {
        return (EnumC2418d3) Enum.valueOf(EnumC2418d3.class, str);
    }

    public static EnumC2418d3[] values() {
        return (EnumC2418d3[]) f21054a.clone();
    }

    static {
        EnumC2418d3 enumC2418d3 = new EnumC2418d3("REFERENCE", 0);
        REFERENCE = enumC2418d3;
        EnumC2418d3 enumC2418d32 = new EnumC2418d3("INT_VALUE", 1);
        INT_VALUE = enumC2418d32;
        EnumC2418d3 enumC2418d33 = new EnumC2418d3("LONG_VALUE", 2);
        LONG_VALUE = enumC2418d33;
        EnumC2418d3 enumC2418d34 = new EnumC2418d3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC2418d34;
        f21054a = new EnumC2418d3[]{enumC2418d3, enumC2418d32, enumC2418d33, enumC2418d34};
    }
}
