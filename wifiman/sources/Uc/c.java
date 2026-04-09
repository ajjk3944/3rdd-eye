package Uc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final String[] keys;
    public static final c TYPE = new c("TYPE", 0, "deviceType");
    public static final c NAME_FRIENDLY = new c("NAME_FRIENDLY", 1, "friendlyName");
    public static final c VENDOR_NAME = new c("VENDOR_NAME", 2, "manufacturer");
    public static final c VENDOR_URL = new c("VENDOR_URL", 3, "manufacturerURL");
    public static final c MODEL_NUMBER = new c("MODEL_NUMBER", 4, "modelNumber");
    public static final c MODEL_DESCRIPTION = new c("MODEL_DESCRIPTION", 5, "modelDescription");
    public static final c MODEL_NAME = new c("MODEL_NAME", 6, "modelName");
    public static final c MODEL_URL = new c("MODEL_URL", 7, "modelURL");
    public static final c SERIAL_NUMBER = new c("SERIAL_NUMBER", 8, "serialNumber", "serialNum");
    public static final c UDN = new c("UDN", 9, "UDN");
    public static final c FW_VERSION = new c("FW_VERSION", 10, "softwareVersion", "swVersion");
    public static final c FW_GEN = new c("FW_GEN", 11, "swGen");
    public static final c HW_VERSION = new c("HW_VERSION", 12, "hardwareVersion");
    public static final c NAME_DISPLAY = new c("NAME_DISPLAY", 13, "displayName");

    private static final /* synthetic */ c[] $values() {
        return new c[]{TYPE, NAME_FRIENDLY, VENDOR_NAME, VENDOR_URL, MODEL_NUMBER, MODEL_DESCRIPTION, MODEL_NAME, MODEL_URL, SERIAL_NUMBER, UDN, FW_VERSION, FW_GEN, HW_VERSION, NAME_DISPLAY};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
    }

    private c(String str, int i10, String... strArr) {
        this.keys = strArr;
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

    public final String[] getKeys() {
        return this.keys;
    }
}
