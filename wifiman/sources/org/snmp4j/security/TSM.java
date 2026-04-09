package org.snmp4j.security;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class TSM extends SNMPv3SecurityModel {
    private static final int MAX_PREFIX_LENGTH = 4;
    private static final byte PREFIX_SEPARATOR = 58;
    private static final LogAdapter logger = LogFactory.getLogger(TSM.class);
    private CounterSupport counterSupport;
    private boolean usePrefix;

    public TSM() {
        this(new OctetString(MPv3.createLocalEngineID()), false);
    }

    private int generateMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityStateReference securityStateReference, SecurityParameters securityParameters, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException {
        TsmSecurityStateReference tsmSecurityStateReference = (TsmSecurityStateReference) securityStateReference;
        if (tsmSecurityStateReference == null || tsmSecurityStateReference.getTmStateReference() == null) {
            transportStateReference.setSameSecurity(false);
            if (this.usePrefix) {
                String transportDomainPrefix = getTransportDomainPrefix(transportStateReference.getAddress());
                if (transportDomainPrefix == null) {
                    fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTsmUnknownPrefixes));
                    return SnmpConstants.SNMPv3_TSM_UNKNOWN_PREFIXES;
                }
                String securityNamePrefix = getSecurityNamePrefix(bArr3);
                if (securityNamePrefix == null || !securityNamePrefix.equals(transportDomainPrefix)) {
                    fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTsmInvalidPrefixes));
                    return SnmpConstants.SNMPv3_TSM_UNKNOWN_PREFIXES;
                }
                transportStateReference.setSecurityName(new OctetString(new String(bArr3).substring(securityNamePrefix.length() + 1)));
            } else {
                transportStateReference.setSecurityName(new OctetString(bArr3));
            }
        } else {
            TransportStateReference tmStateReference = tsmSecurityStateReference.getTmStateReference();
            tmStateReference.setRequestedSecurityLevel(tmStateReference.getTransportSecurityLevel());
            tmStateReference.setSameSecurity(true);
        }
        byte[] bArrBuildWholeMessage = SNMPv3SecurityModel.buildWholeMessage(new Integer32(i10), SNMPv3SecurityModel.buildMessageBuffer(bERInputStream), bArr, securityParameters);
        bEROutputStream.setBuffer((ByteBuffer) ByteBuffer.wrap(bArrBuildWholeMessage).position(bArrBuildWholeMessage.length));
        return 0;
    }

    private void updateStatusInfo(int i10, StatusInformation statusInformation, CounterEvent counterEvent) {
        if (statusInformation != null) {
            statusInformation.setSecurityLevel(new Integer32(i10));
            statusInformation.setErrorIndication(new VariableBinding(counterEvent.getOid(), counterEvent.getCurrentValue()));
        }
    }

    protected void fireIncrementCounter(CounterEvent counterEvent) {
        this.counterSupport.fireIncrementCounter(counterEvent);
    }

    @Override // org.snmp4j.security.SecurityModel
    public int generateRequestMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityParameters securityParameters, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException {
        return generateMessage(i10, bArr, i11, i12, bArr2, bArr3, i13, bERInputStream, null, securityParameters, bEROutputStream, transportStateReference);
    }

    @Override // org.snmp4j.security.SecurityModel
    public int generateResponseMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityStateReference securityStateReference, SecurityParameters securityParameters, BEROutputStream bEROutputStream) throws IOException {
        return generateMessage(i10, bArr, i11, i12, bArr2, bArr3, i13, bERInputStream, securityStateReference, securityParameters, bEROutputStream, null);
    }

    public CounterSupport getCounterSupport() {
        return this.counterSupport;
    }

    @Override // org.snmp4j.security.SecurityModel
    public int getID() {
        return 4;
    }

    protected String getSecurityNamePrefix(byte[] bArr) {
        String str = new String(new OctetString(bArr).getValue());
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf > 4) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    protected String getTransportDomainPrefix(Address address) {
        return GenericAddress.getTDomainPrefix(address.getClass());
    }

    @Override // org.snmp4j.security.SecurityModel
    public boolean hasAuthoritativeEngineID() {
        return false;
    }

    public boolean isUsePrefix() {
        return this.usePrefix;
    }

    @Override // org.snmp4j.security.SecurityModel
    public SecurityParameters newSecurityParametersInstance() {
        return new TsmSecurityParameters();
    }

    @Override // org.snmp4j.security.SecurityModel
    public SecurityStateReference newSecurityStateReference() {
        return new TsmSecurityStateReference();
    }

    @Override // org.snmp4j.security.SecurityModel
    public int processIncomingMsg(int i10, int i11, SecurityParameters securityParameters, SecurityModel securityModel, int i12, BERInputStream bERInputStream, TransportStateReference transportStateReference, OctetString octetString, OctetString octetString2, BEROutputStream bEROutputStream, Integer32 integer32, SecurityStateReference securityStateReference, StatusInformation statusInformation) throws IOException {
        octetString.setValue(this.localEngineID.getValue());
        if (transportStateReference == null || !transportStateReference.isTransportSecurityValid()) {
            fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTsmInvalidCaches));
            return SnmpConstants.SNMPv3_TSM_INVALID_CACHES;
        }
        if (this.usePrefix) {
            String tDomainPrefix = GenericAddress.getTDomainPrefix(transportStateReference.getAddress().getClass());
            if (tDomainPrefix == null) {
                CounterEvent counterEvent = new CounterEvent(this, SnmpConstants.snmpTsmUnknownPrefixes);
                fireIncrementCounter(counterEvent);
                updateStatusInfo(i12, statusInformation, counterEvent);
                return SnmpConstants.SNMPv3_TSM_UNKNOWN_PREFIXES;
            }
            if (tDomainPrefix.length() <= 0 || tDomainPrefix.length() > 4) {
                CounterEvent counterEvent2 = new CounterEvent(this, SnmpConstants.snmpTsmInvalidPrefixes);
                fireIncrementCounter(counterEvent2);
                updateStatusInfo(i12, statusInformation, counterEvent2);
                return SnmpConstants.SNMPv3_TSM_UNKNOWN_PREFIXES;
            }
            OctetString octetString3 = new OctetString(tDomainPrefix);
            octetString3.append(PREFIX_SEPARATOR);
            octetString3.append(transportStateReference.getSecurityName());
            octetString2.setValue(octetString3.getValue());
        } else {
            octetString2.setValue(transportStateReference.getSecurityName().getValue());
        }
        if (i12 > transportStateReference.getTransportSecurityLevel().getSnmpValue()) {
            CounterEvent counterEvent3 = new CounterEvent(this, SnmpConstants.snmpTsmInadequateSecurityLevels);
            fireIncrementCounter(counterEvent3);
            updateStatusInfo(i12, statusInformation, counterEvent3);
            return SnmpConstants.SNMPv3_TSM_INADEQUATE_SECURITY_LEVELS;
        }
        ((TsmSecurityStateReference) securityStateReference).setTmStateReference(transportStateReference);
        TsmSecurityParameters tsmSecurityParameters = (TsmSecurityParameters) securityParameters;
        int scopedPduPosition = tsmSecurityParameters.getScopedPduPosition();
        byte[] bArrBuildMessageBuffer = SNMPv3SecurityModel.buildMessageBuffer(bERInputStream);
        bEROutputStream.setFilledBuffer(ByteBuffer.wrap(bArrBuildMessageBuffer, scopedPduPosition, bArrBuildMessageBuffer.length - scopedPduPosition));
        integer32.setValue(i11 - tsmSecurityParameters.getBERMaxLength(i12));
        return 0;
    }

    public void setLocalEngineID(OctetString octetString) {
        this.localEngineID = octetString;
    }

    public void setUsePrefix(boolean z10) {
        this.usePrefix = z10;
    }

    @Override // org.snmp4j.security.SecurityModel
    public boolean supportsEngineIdDiscovery() {
        return false;
    }

    public TSM(OctetString octetString, boolean z10) {
        this.counterSupport = CounterSupport.getInstance();
        this.localEngineID = octetString;
        this.usePrefix = z10;
    }
}
