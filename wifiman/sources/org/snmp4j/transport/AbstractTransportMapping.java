package org.snmp4j.transport;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.snmp4j.TransportMapping;
import org.snmp4j.TransportStateReference;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public abstract class AbstractTransportMapping<A extends Address> implements TransportMapping<A> {
    protected List<TransportListener> transportListener = new ArrayList(1);
    protected int maxInboundMessageSize = 65535;
    protected boolean asyncMsgProcessingSupported = true;

    @Override // org.snmp4j.TransportMapping
    public synchronized void addTransportListener(TransportListener transportListener) {
        if (!this.transportListener.contains(transportListener)) {
            ArrayList arrayList = new ArrayList(this.transportListener);
            arrayList.add(transportListener);
            this.transportListener = arrayList;
        }
    }

    @Override // org.snmp4j.TransportMapping
    public abstract void close() throws IOException;

    protected void fireProcessMessage(Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference) {
        List<TransportListener> list = this.transportListener;
        if (list != null) {
            Iterator<TransportListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().processMessage(this, address, byteBuffer, transportStateReference);
            }
        }
    }

    @Override // org.snmp4j.TransportMapping
    public int getMaxInboundMessageSize() {
        return this.maxInboundMessageSize;
    }

    @Override // org.snmp4j.TransportMapping
    public abstract Class<? extends Address> getSupportedAddressClass();

    public boolean isAsyncMsgProcessingSupported() {
        return this.asyncMsgProcessingSupported;
    }

    @Override // org.snmp4j.TransportMapping
    public abstract void listen() throws IOException;

    public synchronized void removeAllTransportListeners() {
        this.transportListener = new ArrayList(1);
    }

    @Override // org.snmp4j.TransportMapping
    public synchronized void removeTransportListener(TransportListener transportListener) {
        List<TransportListener> list = this.transportListener;
        if (list != null && list.contains(transportListener)) {
            ArrayList arrayList = new ArrayList(this.transportListener);
            arrayList.remove(transportListener);
            this.transportListener = arrayList;
        }
    }

    @Override // org.snmp4j.TransportMapping
    public abstract void sendMessage(A a10, byte[] bArr, TransportStateReference transportStateReference) throws IOException;

    public void setAsyncMsgProcessingSupported(boolean z10) {
        this.asyncMsgProcessingSupported = z10;
    }
}
