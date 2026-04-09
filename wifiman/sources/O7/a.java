package O7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int code;
    public static final a VPN_PROFILE_CREATION = new a("VPN_PROFILE_CREATION", 0, 0);
    public static final a SSO_ACCOUNT_DONE = new a("SSO_ACCOUNT_DONE", 1, 2);
    public static final a PACKAGE_INSTALL = new a("PACKAGE_INSTALL", 2, 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{VPN_PROFILE_CREATION, SSO_ACCOUNT_DONE, PACKAGE_INSTALL};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = AbstractC5827b.a(aVarArr$values);
    }

    private a(String str, int i10, int i11) {
        this.code = i11;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
