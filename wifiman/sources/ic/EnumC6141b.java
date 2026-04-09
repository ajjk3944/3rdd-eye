package ic;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6141b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC6141b[] $VALUES;
    public static final EnumC6141b NETWORKS = new EnumC6141b("NETWORKS", 0);
    public static final EnumC6141b CHANNEL_HEALTH = new EnumC6141b("CHANNEL_HEALTH", 1);

    private static final /* synthetic */ EnumC6141b[] $values() {
        return new EnumC6141b[]{NETWORKS, CHANNEL_HEALTH};
    }

    static {
        EnumC6141b[] enumC6141bArr$values = $values();
        $VALUES = enumC6141bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC6141bArr$values);
    }

    private EnumC6141b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6141b valueOf(String str) {
        return (EnumC6141b) Enum.valueOf(EnumC6141b.class, str);
    }

    public static EnumC6141b[] values() {
        return (EnumC6141b[]) $VALUES.clone();
    }
}
