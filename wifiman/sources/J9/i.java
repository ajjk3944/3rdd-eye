package J9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DEFAULT = new i("DEFAULT", 0);
    public static final i DARK_BACKGROUND = new i("DARK_BACKGROUND", 1);
    public static final i BLUE_SELECTED_TAB = new i("BLUE_SELECTED_TAB", 2);
    public static final i BLUE_BORDER_SELECTED_TAB = new i("BLUE_BORDER_SELECTED_TAB", 3);

    private static final /* synthetic */ i[] $values() {
        return new i[]{DEFAULT, DARK_BACKGROUND, BLUE_SELECTED_TAB, BLUE_BORDER_SELECTED_TAB};
    }

    static {
        i[] iVarArr$values = $values();
        $VALUES = iVarArr$values;
        $ENTRIES = AbstractC5827b.a(iVarArr$values);
    }

    private i(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
