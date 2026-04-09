package e8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5428a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5428a[] $VALUES;
    private final String appName;
    private final String packageName;
    public static final EnumC5428a WIFIMAN = new EnumC5428a("WIFIMAN", 0, "com.ubnt.usurvey", "WiFiman");
    public static final EnumC5428a UISP = new EnumC5428a("UISP", 1, "com.ubnt.umobile", "UISP Mobile");
    public static final EnumC5428a NETWORK = new EnumC5428a("NETWORK", 2, "com.ubnt.easyunifi", "UniFi Network");
    public static final EnumC5428a PROTECT = new EnumC5428a("PROTECT", 3, "com.ubnt.unifi.protect", "UniFi Protect");
    public static final EnumC5428a CONNECT = new EnumC5428a("CONNECT", 4, "com.ui.unifi.connect.app", "UniFi Connect");
    public static final EnumC5428a ACCESS = new EnumC5428a("ACCESS", 5, "com.ui.access.app", "UniFi Access");
    public static final EnumC5428a AMPLIFI = new EnumC5428a("AMPLIFI", 6, "com.ubnt.unifihome", "AmpliFi WiFi");
    public static final EnumC5428a PLAY = new EnumC5428a("PLAY", 7, "com.ui.unifi.play", "UniFi Play");

    private static final /* synthetic */ EnumC5428a[] $values() {
        return new EnumC5428a[]{WIFIMAN, UISP, NETWORK, PROTECT, CONNECT, ACCESS, AMPLIFI, PLAY};
    }

    static {
        EnumC5428a[] enumC5428aArr$values = $values();
        $VALUES = enumC5428aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5428aArr$values);
    }

    private EnumC5428a(String str, int i10, String str2, String str3) {
        this.packageName = str2;
        this.appName = str3;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5428a valueOf(String str) {
        return (EnumC5428a) Enum.valueOf(EnumC5428a.class, str);
    }

    public static EnumC5428a[] values() {
        return (EnumC5428a[]) $VALUES.clone();
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
