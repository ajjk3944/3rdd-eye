package org.snmp4j.transport;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.snmp4j.TransportStateReference;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.SshAddress;
import org.snmp4j.transport.ssh.SshSession;
import org.snmp4j.transport.ssh.SshTransportAdapter;

/* loaded from: classes2.dex */
public class DefaultSshTransportMapping extends AbstractTransportMapping<SshAddress> {
    private static final LogAdapter logger = LogFactory.getLogger(DefaultSshTransportMapping.class);
    private SshTransportAdapter transportAdapter;
    private final Map<SessionID, SshSession> sessions = new HashMap();
    private CounterSupport counterSupport = CounterSupport.getInstance();

    protected class SessionID {
        private SshAddress address;
        private OctetString tmSecurityName;

        public SessionID(OctetString octetString, SshAddress sshAddress) {
            this.tmSecurityName = octetString;
            this.address = sshAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SessionID sessionID = (SessionID) obj;
            SshAddress sshAddress = this.address;
            if (sshAddress == null ? sessionID.address != null : !sshAddress.equals(sessionID.address)) {
                return false;
            }
            OctetString octetString = this.tmSecurityName;
            if (octetString != null) {
                if (octetString.equals(sessionID.tmSecurityName)) {
                    return true;
                }
            } else if (sessionID.tmSecurityName == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            OctetString octetString = this.tmSecurityName;
            int iHashCode = (octetString != null ? octetString.hashCode() : 0) * 31;
            SshAddress sshAddress = this.address;
            return iHashCode + (sshAddress != null ? sshAddress.hashCode() : 0);
        }

        public String toString() {
            return "DefaultSshTransportMapping.SessionID[tmSecurityName=" + this.tmSecurityName + ", address=" + this.address + ']';
        }
    }

    public DefaultSshTransportMapping(SshTransportAdapter sshTransportAdapter) {
        this.transportAdapter = sshTransportAdapter;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void close() throws IOException {
    }

    protected void fireIncrementCounter(CounterEvent counterEvent) {
        this.counterSupport.fireIncrementCounter(counterEvent);
    }

    @Override // org.snmp4j.TransportMapping
    public SshAddress getListenAddress() {
        return null;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public Class<? extends Address> getSupportedAddressClass() {
        return SshAddress.class;
    }

    @Override // org.snmp4j.TransportMapping
    public boolean isListening() {
        return false;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void listen() throws IOException {
    }

    protected SshSession openSession(SshAddress sshAddress, TransportStateReference transportStateReference, int i10) {
        fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpSshtmSessionOpens));
        return this.transportAdapter.openClientSession(transportStateReference, i10);
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void sendMessage(SshAddress sshAddress, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
        SshSession sshSession;
        SessionID sessionID = new SessionID(transportStateReference.getSecurityName(), sshAddress);
        synchronized (this.sessions) {
            sshSession = this.sessions.get(sessionID);
        }
        if (sshSession == null) {
            if (!transportStateReference.isSameSecurity()) {
                openSession(sshAddress, transportStateReference, this.maxInboundMessageSize);
                return;
            }
            logger.warn("Cannot (re)open session because tmStateReference requires 'sameSecurity'");
            throw new IOException("Session '" + sshAddress + "' for '" + transportStateReference.getSecurityName() + "' closed/unavailable");
        }
    }
}
