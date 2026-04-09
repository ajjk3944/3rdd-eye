package O7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c TELEPORT = new c("TELEPORT", 0, 1);
    public static final c WIFIMAN_WIZARD_FW_UPGRADE = new c("WIFIMAN_WIZARD_FW_UPGRADE", 1, 2);

    /* renamed from: id, reason: collision with root package name */
    private final int f17620id;

    private static final /* synthetic */ c[] $values() {
        return new c[]{TELEPORT, WIFIMAN_WIZARD_FW_UPGRADE};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
    }

    private c(String str, int i10, int i11) {
        this.f17620id = i11;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f17620id;
    }
}
