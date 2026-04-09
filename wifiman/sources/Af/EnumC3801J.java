package af;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import m8.AbstractC6780c;
import s9.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: af.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3801J {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3801J[] $VALUES;
    private final s9.d text;
    public static final EnumC3801J PERMISSION_LOCATION = new EnumC3801J("PERMISSION_LOCATION", 0, new d.b(AbstractC6780c.f53327I1));
    public static final EnumC3801J PERMISSION_CELLLAR = new EnumC3801J("PERMISSION_CELLLAR", 1, new d.b(AbstractC6780c.f53299E1));
    public static final EnumC3801J LOCATION_ACCESS = new EnumC3801J("LOCATION_ACCESS", 2, new d.b(AbstractC6780c.f53320H1));
    public static final EnumC3801J WIFIMAN_SUPPORT_DISABLED = new EnumC3801J("WIFIMAN_SUPPORT_DISABLED", 3, new d.b(AbstractC6780c.f53448a0));

    private static final /* synthetic */ EnumC3801J[] $values() {
        return new EnumC3801J[]{PERMISSION_LOCATION, PERMISSION_CELLLAR, LOCATION_ACCESS, WIFIMAN_SUPPORT_DISABLED};
    }

    static {
        EnumC3801J[] enumC3801JArr$values = $values();
        $VALUES = enumC3801JArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3801JArr$values);
    }

    private EnumC3801J(String str, int i10, s9.d dVar) {
        this.text = dVar;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3801J valueOf(String str) {
        return (EnumC3801J) Enum.valueOf(EnumC3801J.class, str);
    }

    public static EnumC3801J[] values() {
        return (EnumC3801J[]) $VALUES.clone();
    }

    public final s9.d getText() {
        return this.text;
    }
}
