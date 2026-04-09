package org.snmp4j.transport;

import org.snmp4j.MessageException;

/* loaded from: classes2.dex */
public class UnsupportedAddressClassException extends MessageException {
    private static final long serialVersionUID = -864696255672171900L;
    private Class addressClass;

    public UnsupportedAddressClassException(String str, Class cls) {
        super(str);
        this.addressClass = cls;
    }

    public Class getAddressClass() {
        return this.addressClass;
    }
}
