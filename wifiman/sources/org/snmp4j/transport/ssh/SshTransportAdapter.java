package org.snmp4j.transport.ssh;

import org.snmp4j.TransportStateReference;

/* loaded from: classes2.dex */
public interface SshTransportAdapter<I> {
    boolean closeSession(Long l10);

    SshSession<I> openClientSession(TransportStateReference transportStateReference, int i10);

    SshSession<I> openServerSession(TransportStateReference transportStateReference, int i10);
}
