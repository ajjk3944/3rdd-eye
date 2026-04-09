package org.snmp4j.mp;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MutablePDU;
import org.snmp4j.PDU;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Target;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.SecurityModels;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;
import org.snmp4j.util.PDUFactory;

/* loaded from: classes2.dex */
public class MPv2c implements MessageProcessingModel {
    public static final int ID = 1;
    private static final LogAdapter logger = LogFactory.getLogger(MPv2c.class);
    protected PDUFactory incomingPDUFactory;

    public MPv2c() {
        this.incomingPDUFactory = new PDUFactory() { // from class: org.snmp4j.mp.MPv2c.1
            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(Target target) {
                return new PDU();
            }

            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(MessageProcessingModel messageProcessingModel) {
                return new PDU();
            }
        };
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public int getID() {
        return 1;
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public boolean isProtocolVersionSupported(int i10) {
        return i10 == 1;
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public int prepareDataElements(MessageDispatcher messageDispatcher, Address address, BERInputStream bERInputStream, TransportStateReference transportStateReference, Integer32 integer32, Integer32 integer322, OctetString octetString, Integer32 integer323, MutablePDU mutablePDU, PduHandle pduHandle, Integer32 integer324, StatusInformation statusInformation, MutableStateReference mutableStateReference) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        int iDecodeHeader = BER.decodeHeader(bERInputStream, mutableByte);
        int position = (int) bERInputStream.getPosition();
        if (mutableByte.getValue() != 48) {
            logger.error("SNMPv2c PDU must start with a SEQUENCE");
            throw new IOException("SNMPv2c PDU must start with a SEQUENCE");
        }
        new Integer32().decodeBER(bERInputStream);
        octetString.decodeBER(bERInputStream);
        integer323.setValue(1);
        integer322.setValue(2);
        integer32.setValue(1);
        PDU pduCreatePDU = this.incomingPDUFactory.createPDU(this);
        mutablePDU.setPdu(pduCreatePDU);
        pduCreatePDU.decodeBER(bERInputStream);
        BER.checkSequenceLength(iDecodeHeader, ((int) bERInputStream.getPosition()) - position, pduCreatePDU);
        pduHandle.setTransactionID(pduCreatePDU.getRequestID().getValue());
        mutableStateReference.setStateReference(new StateReference(pduHandle, address, null, SecurityModels.getInstance().getSecurityModel(integer322), octetString.getValue(), 0));
        return 0;
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public int prepareOutgoingMessage(Address address, int i10, int i11, int i12, byte[] bArr, int i13, PDU pdu, boolean z10, PduHandle pduHandle, Address address2, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException {
        if (i13 != 1 || i12 != 2) {
            logger.error("MPv2c used with unsupported security model");
            return SnmpConstants.SNMP_MP_UNSUPPORTED_SECURITY_MODEL;
        }
        if (pdu instanceof ScopedPDU) {
            logger.error("ScopedPDU must not be used with MPv2c");
            throw new IllegalArgumentException("ScopedPDU must not be used with MPv2c");
        }
        if (!isProtocolVersionSupported(i11)) {
            logger.error("MPv2c used with unsupported SNMP version");
            return SnmpConstants.SNMP_MP_UNSUPPORTED_SECURITY_MODEL;
        }
        OctetString octetString = new OctetString(bArr);
        Integer32 integer32 = new Integer32(i11);
        int bERLength = pdu.getBERLength() + octetString.getBERLength() + integer32.getBERLength();
        bEROutputStream.setBuffer(ByteBuffer.allocate(BER.getBERLengthOfLength(bERLength) + bERLength + 1));
        BER.encodeHeader(bEROutputStream, 48, bERLength);
        integer32.encodeBER(bEROutputStream);
        octetString.encodeBER(bEROutputStream);
        pdu.encodeBER(bEROutputStream);
        return 0;
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public int prepareResponseMessage(int i10, int i11, int i12, byte[] bArr, int i13, PDU pdu, int i14, StateReference stateReference, StatusInformation statusInformation, BEROutputStream bEROutputStream) throws IOException {
        return prepareOutgoingMessage(stateReference.getAddress(), i11, i10, i12, bArr, i13, pdu, false, stateReference.getPduHandle(), null, bEROutputStream, null);
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public void releaseStateReference(PduHandle pduHandle) {
    }

    public MPv2c(PDUFactory pDUFactory) {
        this.incomingPDUFactory = new PDUFactory() { // from class: org.snmp4j.mp.MPv2c.1
            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(Target target) {
                return new PDU();
            }

            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(MessageProcessingModel messageProcessingModel) {
                return new PDU();
            }
        };
        if (pDUFactory != null) {
            this.incomingPDUFactory = pDUFactory;
        }
    }
}
