package O7;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final String f17621id;
    public static final d APP_CONFIG = new d("APP_CONFIG", 0, "app_config");
    public static final d THEME = new d("THEME", 1, "theme");
    public static final d LOCALE = new d("LOCALE", 2, "locale");
    public static final d WIFI_SCANNER = new d("WIFI_SCANNER", 3, "wifi_scan");
    public static final d PASSCODES = new d("PASSCODES", 4, "pass");
    public static final d UIDB = new d("UIDB", 5, "uidb");

    private static final /* synthetic */ d[] $values() {
        return new d[]{APP_CONFIG, THEME, LOCALE, WIFI_SCANNER, PASSCODES, UIDB};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = AbstractC5827b.a(dVarArr$values);
    }

    private d(String str, int i10, String str2) {
        this.f17621id = str2;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f17621id;
    }
}
