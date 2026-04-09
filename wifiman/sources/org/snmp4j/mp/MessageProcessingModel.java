package org.snmp4j.mp;

import java.io.IOException;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MutablePDU;
import org.snmp4j.PDU;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface MessageProcessingModel {
    public static final int MPv1 = 0;
    public static final int MPv2c = 1;
    public static final int MPv2u = 2;
    public static final int MPv3 = 3;

    int getID();

    boolean isProtocolVersionSupported(int i10);

    int prepareDataElements(MessageDispatcher messageDispatcher, Address address, BERInputStream bERInputStream, TransportStateReference transportStateReference, Integer32 integer32, Integer32 integer322, OctetString octetString, Integer32 integer323, MutablePDU mutablePDU, PduHandle pduHandle, Integer32 integer324, StatusInformation statusInformation, MutableStateReference mutableStateReference) throws IOException;

    int prepareOutgoingMessage(Address address, int i10, int i11, int i12, byte[] bArr, int i13, PDU pdu, boolean z10, PduHandle pduHandle, Address address2, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException;

    int prepareResponseMessage(int i10, int i11, int i12, byte[] bArr, int i13, PDU pdu, int i14, StateReference stateReference, StatusInformation statusInformation, BEROutputStream bEROutputStream) throws IOException;

    void releaseStateReference(PduHandle pduHandle);
}
