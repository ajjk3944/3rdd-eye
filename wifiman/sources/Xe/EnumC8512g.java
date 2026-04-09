package xe;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xe.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC8512g {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8512g[] $VALUES;
    public static final EnumC8512g NONE = new EnumC8512g("NONE", 0);
    public static final EnumC8512g SPEED_TEST_A2A = new EnumC8512g("SPEED_TEST_A2A", 1);
    public static final EnumC8512g WIFIMAN_WIZARD = new EnumC8512g("WIFIMAN_WIZARD", 2);
    public static final EnumC8512g DIRECT_CONSOLE_CONNECT = new EnumC8512g("DIRECT_CONSOLE_CONNECT", 3);

    private static final /* synthetic */ EnumC8512g[] $values() {
        return new EnumC8512g[]{NONE, SPEED_TEST_A2A, WIFIMAN_WIZARD, DIRECT_CONSOLE_CONNECT};
    }

    static {
        EnumC8512g[] enumC8512gArr$values = $values();
        $VALUES = enumC8512gArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8512gArr$values);
    }

    private EnumC8512g(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8512g valueOf(String str) {
        return (EnumC8512g) Enum.valueOf(EnumC8512g.class, str);
    }

    public static EnumC8512g[] values() {
        return (EnumC8512g[]) $VALUES.clone();
    }
}
