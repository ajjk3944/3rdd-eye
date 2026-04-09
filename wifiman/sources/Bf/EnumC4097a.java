package bf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4097a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC4097a[] $VALUES;
    public static final EnumC4097a ON_LIST_TOP = new EnumC4097a("ON_LIST_TOP", 0);
    public static final EnumC4097a ON_LIST_BOTTOM = new EnumC4097a("ON_LIST_BOTTOM", 1);
    public static final EnumC4097a ON_LIST_TOP_BOTTOM = new EnumC4097a("ON_LIST_TOP_BOTTOM", 2);
    public static final EnumC4097a IN_LIST_MIDDLE = new EnumC4097a("IN_LIST_MIDDLE", 3);
    public static final EnumC4097a DRAGGING = new EnumC4097a("DRAGGING", 4);

    private static final /* synthetic */ EnumC4097a[] $values() {
        return new EnumC4097a[]{ON_LIST_TOP, ON_LIST_BOTTOM, ON_LIST_TOP_BOTTOM, IN_LIST_MIDDLE, DRAGGING};
    }

    static {
        EnumC4097a[] enumC4097aArr$values = $values();
        $VALUES = enumC4097aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC4097aArr$values);
    }

    private EnumC4097a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4097a valueOf(String str) {
        return (EnumC4097a) Enum.valueOf(EnumC4097a.class, str);
    }

    public static EnumC4097a[] values() {
        return (EnumC4097a[]) $VALUES.clone();
    }
}
