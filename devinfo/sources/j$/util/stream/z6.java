package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z6 {
    public static final z6 OP;
    public static final z6 SPLITERATOR;
    public static final z6 STREAM;
    public static final z6 TERMINAL_OP;
    public static final z6 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z6[] f26837a;

    public static z6 valueOf(String str) {
        return (z6) Enum.valueOf(z6.class, str);
    }

    public static z6[] values() {
        return (z6[]) f26837a.clone();
    }

    static {
        z6 z6Var = new z6("SPLITERATOR", 0);
        SPLITERATOR = z6Var;
        z6 z6Var2 = new z6("STREAM", 1);
        STREAM = z6Var2;
        z6 z6Var3 = new z6("OP", 2);
        OP = z6Var3;
        z6 z6Var4 = new z6("TERMINAL_OP", 3);
        TERMINAL_OP = z6Var4;
        z6 z6Var5 = new z6("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = z6Var5;
        f26837a = new z6[]{z6Var, z6Var2, z6Var3, z6Var4, z6Var5};
    }
}
