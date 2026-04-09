package org.snmp4j.event;

import java.util.EventObject;
import org.snmp4j.security.SecurityModel;
import org.snmp4j.security.UsmUserEntry;

/* loaded from: classes2.dex */
public class UsmUserEvent extends EventObject {
    public static final int USER_ADDED = 1;
    public static final int USER_CHANGED = 3;
    public static final int USER_REMOVED = 2;
    private static final long serialVersionUID = -2650579887988635391L;
    private int type;
    private UsmUserEntry user;

    public UsmUserEvent(SecurityModel securityModel, UsmUserEntry usmUserEntry, int i10) {
        super(securityModel);
        this.user = usmUserEntry;
        this.type = i10;
    }

    public int getType() {
        return this.type;
    }

    public UsmUserEntry getUser() {
        return this.user;
    }
}
