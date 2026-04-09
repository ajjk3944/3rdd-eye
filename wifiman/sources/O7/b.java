package O7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b TELEPORT = new b("TELEPORT", 0, "teleport");
    public static final b WIFIMAN_WIZARD_FW_UPGRADE = new b("WIFIMAN_WIZARD_FW_UPGRADE", 1, "wizard_upgrade");

    /* renamed from: id, reason: collision with root package name */
    private final String f17619id;

    private static final /* synthetic */ b[] $values() {
        return new b[]{TELEPORT, WIFIMAN_WIZARD_FW_UPGRADE};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = AbstractC5827b.a(bVarArr$values);
    }

    private b(String str, int i10, String str2) {
        this.f17619id = str2;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f17619id;
    }
}
