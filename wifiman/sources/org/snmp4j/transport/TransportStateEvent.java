package org.snmp4j.transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public class TransportStateEvent extends EventObject {
    public static final int STATE_CLOSED = 4;
    public static final int STATE_CONNECTED = 1;
    public static final int STATE_DISCONNECTED_REMOTELY = 2;
    public static final int STATE_DISCONNECTED_TIMEOUT = 3;
    public static final int STATE_UNKNOWN = 0;
    private static final long serialVersionUID = 6440139076579035559L;
    private boolean cancelled;
    private IOException causingException;
    private ArrayList<byte[]> discardedMessages;
    private int newState;
    private Address peerAddress;

    public TransportStateEvent(TcpTransportMapping tcpTransportMapping, Address address, int i10, IOException iOException) {
        super(tcpTransportMapping);
        this.cancelled = false;
        this.newState = i10;
        this.peerAddress = address;
        this.causingException = iOException;
    }

    public IOException getCausingException() {
        return this.causingException;
    }

    public List<byte[]> getDiscardedMessages() {
        return this.discardedMessages;
    }

    public int getNewState() {
        return this.newState;
    }

    public Address getPeerAddress() {
        return this.peerAddress;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean z10) {
        this.cancelled = z10;
    }

    @Override // java.util.EventObject
    public String toString() {
        return TransportStateEvent.class.getName() + "[source=" + ((EventObject) this).source + ",peerAddress=" + this.peerAddress + ",newState=" + this.newState + ",cancelled=" + this.cancelled + ",causingException=" + this.causingException + "]";
    }

    public TransportStateEvent(TcpTransportMapping tcpTransportMapping, Address address, int i10, IOException iOException, List<byte[]> list) {
        this(tcpTransportMapping, address, i10, iOException);
        this.discardedMessages = new ArrayList<>(list);
    }
}
