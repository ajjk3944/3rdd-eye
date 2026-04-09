package org.snmp4j.smi;

/* loaded from: classes2.dex */
public enum MaxAccess {
    notAccessible("not-accessible"),
    accessibleForNotify("accessible-for-notify"),
    writeOnly("write-only"),
    readOnly("read-only"),
    readWrite("read-write"),
    readCreate("read-create");

    private String smiValue;

    MaxAccess(String str) {
        this.smiValue = str;
    }

    public static MaxAccess fromSmiValue(String str) {
        for (MaxAccess maxAccess : values()) {
            if (maxAccess.getSmiValue().equals(str)) {
                return maxAccess;
            }
        }
        return null;
    }

    public String getSmiValue() {
        return this.smiValue;
    }

    public boolean isCreatable() {
        return this == readCreate;
    }

    public boolean isReadOnly() {
        return this == readOnly;
    }

    public boolean isWritable() {
        return ordinal() >= readWrite.ordinal();
    }
}
