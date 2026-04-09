package org.snmp4j.util;

import org.snmp4j.Session;

/* loaded from: classes2.dex */
public abstract class AbstractSnmpUtility {
    protected PDUFactory pduFactory;
    protected Session session;

    public AbstractSnmpUtility(Session session, PDUFactory pDUFactory) {
        this.session = session;
        this.pduFactory = pDUFactory;
    }
}
