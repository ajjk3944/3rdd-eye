package org.snmp4j.uri;

import java.net.URI;

/* loaded from: classes2.dex */
public interface SnmpUriCallback {
    boolean onResponse(SnmpUriResponse snmpUriResponse, URI uri, Object obj);
}
