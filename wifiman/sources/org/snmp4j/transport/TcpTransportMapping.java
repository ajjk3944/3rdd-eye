package org.snmp4j.transport;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;

/* loaded from: classes2.dex */
public abstract class TcpTransportMapping extends AbstractTransportMapping<TcpAddress> implements ConnectionOrientedTransportMapping<TcpAddress> {
    private static final LogAdapter logger = LogFactory.getLogger(TcpTransportMapping.class);
    protected TcpAddress tcpAddress;
    private transient Vector<TransportStateListener> transportStateListeners;
    protected Set<Address> suspendedAddresses = ConcurrentHashMap.newKeySet(5);
    protected boolean openSocketOnSending = true;

    public TcpTransportMapping(TcpAddress tcpAddress) {
        this.tcpAddress = tcpAddress;
    }

    @Override // org.snmp4j.transport.ConnectionOrientedTransportMapping
    public synchronized void addTransportStateListener(TransportStateListener transportStateListener) {
        try {
            if (this.transportStateListeners == null) {
                this.transportStateListeners = new Vector<>(2);
            }
            this.transportStateListeners.add(transportStateListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void cancelNonServerSelectionKey(SelectionKey selectionKey) {
        if (selectionKey.isAcceptable()) {
            return;
        }
        selectionKey.cancel();
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void close() throws IOException;

    protected void fireConnectionStateChanged(TransportStateEvent transportStateEvent) {
        ArrayList arrayList;
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Firing transport state event: " + transportStateEvent);
        }
        Vector<TransportStateListener> vector = this.transportStateListeners;
        if (vector != null) {
            try {
                synchronized (vector) {
                    arrayList = new ArrayList(vector);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((TransportStateListener) it.next()).connectionStateChanged(transportStateEvent);
                }
            } catch (RuntimeException e10) {
                logger.error("Exception in fireConnectionStateChanged: " + e10.getMessage(), e10);
                if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                    throw e10;
                }
            }
        }
    }

    public TcpAddress getAddress() {
        return this.tcpAddress;
    }

    public abstract MessageLengthDecoder getMessageLengthDecoder();

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public Class<? extends Address> getSupportedAddressClass() {
        return TcpAddress.class;
    }

    protected void handleDroppedMessageToSend(TcpAddress tcpAddress, byte[] bArr, TransportStateReference transportStateReference) {
        logger.warn("TCP message to be sent has been dropped, because transport mapping is closed: address=" + tcpAddress + ", message=" + OctetString.fromByteArray(bArr).toHexString());
    }

    public boolean isOpenSocketOnSending() {
        return this.openSocketOnSending;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void listen() throws IOException;

    abstract Object removeSocketEntry(TcpAddress tcpAddress);

    @Override // org.snmp4j.transport.ConnectionOrientedTransportMapping
    public synchronized void removeTransportStateListener(TransportStateListener transportStateListener) {
        Vector<TransportStateListener> vector = this.transportStateListeners;
        if (vector != null) {
            vector.remove(transportStateListener);
        }
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public abstract void sendMessage(TcpAddress tcpAddress, byte[] bArr, TransportStateReference transportStateReference) throws IOException;

    public abstract void setConnectionTimeout(long j10);

    public abstract void setMessageLengthDecoder(MessageLengthDecoder messageLengthDecoder);

    public void setOpenSocketOnSending(boolean z10) {
        this.openSocketOnSending = z10;
    }

    @Override // org.snmp4j.TransportMapping
    public TcpAddress getListenAddress() {
        return this.tcpAddress;
    }

    @Override // org.snmp4j.transport.ConnectionOrientedTransportMapping
    public boolean resumeAddress(TcpAddress tcpAddress) {
        return this.suspendedAddresses.remove(tcpAddress);
    }

    @Override // org.snmp4j.transport.ConnectionOrientedTransportMapping
    public void suspendAddress(TcpAddress tcpAddress) {
        this.suspendedAddresses.add(tcpAddress);
    }
}
