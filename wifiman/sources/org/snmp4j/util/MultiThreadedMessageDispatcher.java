package org.snmp4j.util;

import java.nio.ByteBuffer;
import java.util.Collection;
import org.snmp4j.CommandResponder;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageException;
import org.snmp4j.PDU;
import org.snmp4j.Target;
import org.snmp4j.TransportMapping;
import org.snmp4j.TransportStateReference;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.PduHandleCallback;
import org.snmp4j.mp.StateReference;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public class MultiThreadedMessageDispatcher implements MessageDispatcher {
    private MessageDispatcher dispatcher;
    private WorkerPool threadPool;

    class MessageTask implements WorkerTask {
        private Address incomingAddress;
        private TransportMapping sourceTransport;
        private TransportStateReference tmStateReference;
        private ByteBuffer wholeMessage;

        public MessageTask(TransportMapping transportMapping, Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference) {
            this.sourceTransport = transportMapping;
            this.incomingAddress = address;
            this.wholeMessage = byteBuffer;
            this.tmStateReference = transportStateReference;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() throws InterruptedException {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiThreadedMessageDispatcher.this.dispatcher.processMessage(this.sourceTransport, this.incomingAddress, this.wholeMessage, this.tmStateReference);
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
        }
    }

    public MultiThreadedMessageDispatcher(WorkerPool workerPool, MessageDispatcher messageDispatcher) {
        this.threadPool = workerPool;
        this.dispatcher = messageDispatcher;
    }

    @Override // org.snmp4j.MessageDispatcher
    public void addCommandResponder(CommandResponder commandResponder) {
        this.dispatcher.addCommandResponder(commandResponder);
    }

    @Override // org.snmp4j.MessageDispatcher
    public void addMessageProcessingModel(MessageProcessingModel messageProcessingModel) {
        this.dispatcher.addMessageProcessingModel(messageProcessingModel);
    }

    @Override // org.snmp4j.MessageDispatcher
    public void addTransportMapping(TransportMapping<? extends Address> transportMapping) {
        this.dispatcher.addTransportMapping(transportMapping);
    }

    @Override // org.snmp4j.MessageDispatcher
    public MessageProcessingModel getMessageProcessingModel(int i10) {
        return this.dispatcher.getMessageProcessingModel(i10);
    }

    @Override // org.snmp4j.MessageDispatcher
    public int getNextRequestID() {
        return this.dispatcher.getNextRequestID();
    }

    @Override // org.snmp4j.MessageDispatcher
    public TransportMapping getTransport(Address address) {
        return this.dispatcher.getTransport(address);
    }

    @Override // org.snmp4j.MessageDispatcher
    public Collection<TransportMapping> getTransportMappings() {
        return this.dispatcher.getTransportMappings();
    }

    @Override // org.snmp4j.MessageDispatcher, org.snmp4j.transport.TransportListener
    public void processMessage(TransportMapping transportMapping, Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference) {
        this.threadPool.execute(new MessageTask(transportMapping, address, byteBuffer, transportStateReference));
    }

    @Override // org.snmp4j.MessageDispatcher
    public void releaseStateReference(int i10, PduHandle pduHandle) {
        this.dispatcher.releaseStateReference(i10, pduHandle);
    }

    @Override // org.snmp4j.MessageDispatcher
    public void removeCommandResponder(CommandResponder commandResponder) {
        this.dispatcher.removeCommandResponder(commandResponder);
    }

    @Override // org.snmp4j.MessageDispatcher
    public void removeMessageProcessingModel(MessageProcessingModel messageProcessingModel) {
        this.dispatcher.removeMessageProcessingModel(messageProcessingModel);
    }

    @Override // org.snmp4j.MessageDispatcher
    public TransportMapping removeTransportMapping(TransportMapping<? extends Address> transportMapping) {
        return this.dispatcher.removeTransportMapping(transportMapping);
    }

    @Override // org.snmp4j.MessageDispatcher
    public int returnResponsePdu(int i10, int i11, byte[] bArr, int i12, PDU pdu, int i13, StateReference stateReference, StatusInformation statusInformation) throws MessageException {
        return this.dispatcher.returnResponsePdu(i10, i11, bArr, i12, pdu, i13, stateReference, statusInformation);
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(Target target, PDU pdu, boolean z10) throws MessageException {
        return this.dispatcher.sendPdu(target, pdu, z10);
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10) throws MessageException {
        return this.dispatcher.sendPdu(transportMapping, target, pdu, z10);
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10, PduHandleCallback<PDU> pduHandleCallback) throws MessageException {
        return this.dispatcher.sendPdu(transportMapping, target, pdu, z10, pduHandleCallback);
    }
}
