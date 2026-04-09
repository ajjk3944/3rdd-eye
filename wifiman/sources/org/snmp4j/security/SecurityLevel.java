package org.snmp4j.security;

/* loaded from: classes2.dex */
public enum SecurityLevel {
    undefined(0),
    noAuthNoPriv(1),
    authNoPriv(2),
    authPriv(3);

    public static final int AUTH_NOPRIV = 2;
    public static final int AUTH_PRIV = 3;
    public static final int NOAUTH_NOPRIV = 1;
    private int snmpValue;

    SecurityLevel(int i10) {
        this.snmpValue = i10;
    }

    public static SecurityLevel get(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? undefined : authPriv : authNoPriv : noAuthNoPriv;
    }

    public int getSnmpValue() {
        return this.snmpValue;
    }
}
