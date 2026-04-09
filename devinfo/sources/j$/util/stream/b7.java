package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b7 {
    public static final b7 DOUBLE_VALUE;
    public static final b7 INT_VALUE;
    public static final b7 LONG_VALUE;
    public static final b7 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b7[] f26510a;

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) f26510a.clone();
    }

    static {
        b7 b7Var = new b7("REFERENCE", 0);
        REFERENCE = b7Var;
        b7 b7Var2 = new b7("INT_VALUE", 1);
        INT_VALUE = b7Var2;
        b7 b7Var3 = new b7("LONG_VALUE", 2);
        LONG_VALUE = b7Var3;
        b7 b7Var4 = new b7("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = b7Var4;
        f26510a = new b7[]{b7Var, b7Var2, b7Var3, b7Var4};
    }
}
