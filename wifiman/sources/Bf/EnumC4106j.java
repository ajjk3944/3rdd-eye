package bf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bf.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4106j {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC4106j[] $VALUES;
    public static final EnumC4106j DEFAULT = new EnumC4106j("DEFAULT", 0);
    public static final EnumC4106j EDIT = new EnumC4106j("EDIT", 1);

    private static final /* synthetic */ EnumC4106j[] $values() {
        return new EnumC4106j[]{DEFAULT, EDIT};
    }

    static {
        EnumC4106j[] enumC4106jArr$values = $values();
        $VALUES = enumC4106jArr$values;
        $ENTRIES = AbstractC5827b.a(enumC4106jArr$values);
    }

    private EnumC4106j(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4106j valueOf(String str) {
        return (EnumC4106j) Enum.valueOf(EnumC4106j.class, str);
    }

    public static EnumC4106j[] values() {
        return (EnumC4106j[]) $VALUES.clone();
    }
}
