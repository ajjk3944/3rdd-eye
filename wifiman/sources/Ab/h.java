package Ab;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final String accountUrl;
    private final String ssoUrl;
    private final String ubicAuthCookieName;
    public static final h PRODUCTION = new h("PRODUCTION", 0, "https://sso.ui.com/", "https://account.ui.com/", "UBIC_AUTH");
    public static final h STAGING = new h("STAGING", 1, "https://sso.stg.ui.com/", "https://account.stg.ui.com/", "STG_UBIC_AUTH");
    public static final h DEV = new h("DEV", 2, "https://sso.dev.ui.com/", "https://account.dev.ui.com/", "DEV_UBIC_AUTH");

    private static final /* synthetic */ h[] $values() {
        return new h[]{PRODUCTION, STAGING, DEV};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = AbstractC5827b.a(hVarArr$values);
    }

    private h(String str, int i10, String str2, String str3, String str4) {
        this.ssoUrl = str2;
        this.accountUrl = str3;
        this.ubicAuthCookieName = str4;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final String getSsoUrl() {
        return this.ssoUrl;
    }

    public final String getUbicAuthCookieName() {
        return this.ubicAuthCookieName;
    }
}
