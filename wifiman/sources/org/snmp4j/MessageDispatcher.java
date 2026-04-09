package org.snmp4j;

import java.nio.ByteBuffer;
import java.util.Collection;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.PduHandleCallback;
import org.snmp4j.mp.StateReference;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.smi.Address;
import org.snmp4j.transport.TransportListener;

/* loaded from: classes2.dex */
public interface MessageDispatcher extends TransportListener {
    void addCommandResponder(CommandResponder commandResponder);

    void addMessageProcessingModel(MessageProcessingModel messageProcessingModel);

    void addTransportMapping(TransportMapping<? extends Address> transportMapping);

    MessageProcessingModel getMessageProcessingModel(int i10);

    int getNextRequestID();

    TransportMapping getTransport(Address address);

    Collection<TransportMapping> getTransportMappings();

    @Override // org.snmp4j.transport.TransportListener
    void processMessage(TransportMapping transportMapping, Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference);

    void releaseStateReference(int i10, PduHandle pduHandle);

    void removeCommandResponder(CommandResponder commandResponder);

    void removeMessageProcessingModel(MessageProcessingModel messageProcessingModel);

    TransportMapping removeTransportMapping(TransportMapping<? extends Address> transportMapping);

    int returnResponsePdu(int i10, int i11, byte[] bArr, int i12, PDU pdu, int i13, StateReference stateReference, StatusInformation statusInformation) throws MessageException;

    PduHandle sendPdu(Target target, PDU pdu, boolean z10) throws MessageException;

    PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10) throws MessageException;

    PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10, PduHandleCallback<PDU> pduHandleCallback) throws MessageException;
}
