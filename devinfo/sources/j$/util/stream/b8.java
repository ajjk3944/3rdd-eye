package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b8 {
    public static final b8 MAYBE_MORE;
    public static final b8 NO_MORE;
    public static final b8 UNLIMITED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b8[] f26511a;

    static {
        b8 b8Var = new b8("NO_MORE", 0);
        NO_MORE = b8Var;
        b8 b8Var2 = new b8("MAYBE_MORE", 1);
        MAYBE_MORE = b8Var2;
        b8 b8Var3 = new b8("UNLIMITED", 2);
        UNLIMITED = b8Var3;
        f26511a = new b8[]{b8Var, b8Var2, b8Var3};
    }

    public static b8 valueOf(String str) {
        return (b8) Enum.valueOf(b8.class, str);
    }

    public static b8[] values() {
        return (b8[]) f26511a.clone();
    }
}
