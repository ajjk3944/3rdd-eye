package org.snmp4j;

import java.util.EventObject;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.StateReference;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class CommandResponderEvent extends EventObject {
    private static final long serialVersionUID = 1969372060103366769L;
    private int maxSizeResponsePDU;
    private int messageProcessingModel;
    private PDU pdu;
    private PduHandle pduHandle;
    private Address peerAddress;
    private boolean processed;
    private int securityLevel;
    private int securityModel;
    private byte[] securityName;
    private StateReference stateReference;
    private TransportStateReference tmStateReference;
    private transient TransportMapping transportMapping;

    public CommandResponderEvent(MessageDispatcher messageDispatcher, TransportMapping transportMapping, Address address, int i10, int i11, byte[] bArr, int i12, PduHandle pduHandle, PDU pdu, int i13, StateReference stateReference) {
        super(messageDispatcher);
        setTransportMapping(transportMapping);
        setMessageProcessingModel(i10);
        setSecurityModel(i11);
        setSecurityName(bArr);
        setSecurityLevel(i12);
        setPduHandle(pduHandle);
        setPDU(pdu);
        setMaxSizeResponsePDU(i13);
        setStateReference(stateReference);
        setPeerAddress(address);
    }

    public int getMaxSizeResponsePDU() {
        return this.maxSizeResponsePDU;
    }

    public MessageDispatcher getMessageDispatcher() {
        return (MessageDispatcher) super.getSource();
    }

    public int getMessageProcessingModel() {
        return this.messageProcessingModel;
    }

    public PDU getPDU() {
        return this.pdu;
    }

    public PduHandle getPduHandle() {
        return this.pduHandle;
    }

    public Address getPeerAddress() {
        return this.peerAddress;
    }

    public int getSecurityLevel() {
        return this.securityLevel;
    }

    public int getSecurityModel() {
        return this.securityModel;
    }

    public byte[] getSecurityName() {
        return this.securityName;
    }

    public StateReference getStateReference() {
        return this.stateReference;
    }

    public TransportStateReference getTmStateReference() {
        return this.tmStateReference;
    }

    public TransportMapping getTransportMapping() {
        return this.transportMapping;
    }

    public boolean isProcessed() {
        return this.processed;
    }

    public void setMaxSizeResponsePDU(int i10) {
        this.maxSizeResponsePDU = i10;
    }

    public void setMessageProcessingModel(int i10) {
        this.messageProcessingModel = i10;
    }

    public void setPDU(PDU pdu) {
        this.pdu = pdu;
    }

    public void setPduHandle(PduHandle pduHandle) {
        this.pduHandle = pduHandle;
    }

    public void setPeerAddress(Address address) {
        this.peerAddress = address;
    }

    public void setProcessed(boolean z10) {
        this.processed = z10;
    }

    public void setSecurityLevel(int i10) {
        this.securityLevel = i10;
    }

    public void setSecurityModel(int i10) {
        this.securityModel = i10;
    }

    public void setSecurityName(byte[] bArr) {
        this.securityName = bArr;
    }

    public void setStateReference(StateReference stateReference) {
        this.stateReference = stateReference;
    }

    public void setTmStateReference(TransportStateReference transportStateReference) {
        this.tmStateReference = transportStateReference;
    }

    protected void setTransportMapping(TransportMapping transportMapping) {
        this.transportMapping = transportMapping;
    }

    @Override // java.util.EventObject
    public String toString() {
        return "CommandResponderEvent[securityModel=" + this.securityModel + ", securityLevel=" + this.securityLevel + ", maxSizeResponsePDU=" + this.maxSizeResponsePDU + ", pduHandle=" + this.pduHandle + ", stateReference=" + this.stateReference + ", pdu=" + this.pdu + ", messageProcessingModel=" + this.messageProcessingModel + ", securityName=" + new OctetString(this.securityName) + ", processed=" + this.processed + ", peerAddress=" + this.peerAddress + ", transportMapping=" + this.transportMapping + ", tmStateReference=" + this.tmStateReference + ']';
    }

    public CommandResponderEvent(Object obj, CommandResponderEvent commandResponderEvent) {
        super(obj);
        setTransportMapping(commandResponderEvent.transportMapping);
        setMessageProcessingModel(commandResponderEvent.messageProcessingModel);
        setSecurityModel(commandResponderEvent.securityModel);
        setSecurityName(commandResponderEvent.securityName);
        setSecurityLevel(commandResponderEvent.securityLevel);
        setPduHandle(commandResponderEvent.pduHandle);
        setPDU(commandResponderEvent.pdu);
        setMaxSizeResponsePDU(commandResponderEvent.maxSizeResponsePDU);
        setStateReference(commandResponderEvent.stateReference);
        setPeerAddress(commandResponderEvent.getPeerAddress());
    }
}
