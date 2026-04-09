package cb;

import Ab.h;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4235a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC4235a[] $VALUES;
    public static final EnumC4235a PRODUCTION = new EnumC4235a("PRODUCTION", 0, "https://config.svc.ui.com", "https://trace.svc.ui.com", h.PRODUCTION);
    public static final EnumC4235a STAGING = new EnumC4235a("STAGING", 1, "https://config.stg.svc.ui.com", "https://trace.dev.svc.ui.com", h.STAGING);
    private final String cloudConfigUrl;
    private final h ssoConfig;
    private final String tracesUrl;

    private static final /* synthetic */ EnumC4235a[] $values() {
        return new EnumC4235a[]{PRODUCTION, STAGING};
    }

    static {
        EnumC4235a[] enumC4235aArr$values = $values();
        $VALUES = enumC4235aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC4235aArr$values);
    }

    private EnumC4235a(String str, int i10, String str2, String str3, h hVar) {
        this.cloudConfigUrl = str2;
        this.tracesUrl = str3;
        this.ssoConfig = hVar;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4235a valueOf(String str) {
        return (EnumC4235a) Enum.valueOf(EnumC4235a.class, str);
    }

    public static EnumC4235a[] values() {
        return (EnumC4235a[]) $VALUES.clone();
    }

    public final String getCloudConfigUrl() {
        return this.cloudConfigUrl;
    }

    public final h getSsoConfig() {
        return this.ssoConfig;
    }

    public final String getTracesUrl() {
        return this.tracesUrl;
    }
}
