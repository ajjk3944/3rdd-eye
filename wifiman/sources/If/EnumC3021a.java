package If;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: If.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3021a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3021a[] $VALUES;
    public static final EnumC3021a LOADING = new EnumC3021a("LOADING", 0);
    public static final EnumC3021a REQUIREMENTS_NOT_MET = new EnumC3021a("REQUIREMENTS_NOT_MET", 1);
    public static final EnumC3021a DISCOVERING = new EnumC3021a("DISCOVERING", 2);
    public static final EnumC3021a ADOPTION_READY = new EnumC3021a("ADOPTION_READY", 3);
    public static final EnumC3021a ADOPTION_FAILED = new EnumC3021a("ADOPTION_FAILED", 4);
    public static final EnumC3021a CONNECTING = new EnumC3021a("CONNECTING", 5);
    public static final EnumC3021a CONNECTED = new EnumC3021a("CONNECTED", 6);
    public static final EnumC3021a FW_UPDATE = new EnumC3021a("FW_UPDATE", 7);
    public static final EnumC3021a FW_UPDATE_PROGRESS = new EnumC3021a("FW_UPDATE_PROGRESS", 8);
    public static final EnumC3021a COMPLIANCE = new EnumC3021a("COMPLIANCE", 9);

    private static final /* synthetic */ EnumC3021a[] $values() {
        return new EnumC3021a[]{LOADING, REQUIREMENTS_NOT_MET, DISCOVERING, ADOPTION_READY, ADOPTION_FAILED, CONNECTING, CONNECTED, FW_UPDATE, FW_UPDATE_PROGRESS, COMPLIANCE};
    }

    static {
        EnumC3021a[] enumC3021aArr$values = $values();
        $VALUES = enumC3021aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3021aArr$values);
    }

    private EnumC3021a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3021a valueOf(String str) {
        return (EnumC3021a) Enum.valueOf(EnumC3021a.class, str);
    }

    public static EnumC3021a[] values() {
        return (EnumC3021a[]) $VALUES.clone();
    }
}
