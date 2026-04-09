package org.snmp4j.transport;

import java.io.IOException;
import org.snmp4j.TransportStateReference;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.UdpAddress;

/* loaded from: classes2.dex */
public abstract class UdpTransportMapping extends AbstractTransportMapping<UdpAddress> {
    protected UdpAddress udpAddress;

    public UdpTransportMapping(UdpAddress udpAddress) {
        this.udpAddress = udpAddress;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void close() throws IOException;

    public UdpAddress getAddress() {
        return this.udpAddress;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public Class<? extends Address> getSupportedAddressClass() {
        return UdpAddress.class;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void listen() throws IOException;

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void sendMessage(UdpAddress udpAddress, byte[] bArr, TransportStateReference transportStateReference) throws IOException;

    @Override // org.snmp4j.TransportMapping
    public UdpAddress getListenAddress() {
        return this.udpAddress;
    }
}
