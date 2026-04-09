package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2408b3 {
    public static final EnumC2408b3 OP;
    public static final EnumC2408b3 SPLITERATOR;
    public static final EnumC2408b3 STREAM;
    public static final EnumC2408b3 TERMINAL_OP;
    public static final EnumC2408b3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2408b3[] f21014a;

    public static EnumC2408b3 valueOf(String str) {
        return (EnumC2408b3) Enum.valueOf(EnumC2408b3.class, str);
    }

    public static EnumC2408b3[] values() {
        return (EnumC2408b3[]) f21014a.clone();
    }

    static {
        EnumC2408b3 enumC2408b3 = new EnumC2408b3("SPLITERATOR", 0);
        SPLITERATOR = enumC2408b3;
        EnumC2408b3 enumC2408b32 = new EnumC2408b3("STREAM", 1);
        STREAM = enumC2408b32;
        EnumC2408b3 enumC2408b33 = new EnumC2408b3("OP", 2);
        OP = enumC2408b33;
        EnumC2408b3 enumC2408b34 = new EnumC2408b3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC2408b34;
        EnumC2408b3 enumC2408b35 = new EnumC2408b3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC2408b35;
        f21014a = new EnumC2408b3[]{enumC2408b3, enumC2408b32, enumC2408b33, enumC2408b34, enumC2408b35};
    }
}
