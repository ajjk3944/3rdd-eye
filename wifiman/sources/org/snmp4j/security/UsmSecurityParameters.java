package org.snmp4j.security;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class UsmSecurityParameters implements SecurityParameters {
    private static final int MAX_BER_LENGTH_WITHOU_SEC_PARAMS = 80;
    private static final LogAdapter logger = LogFactory.getLogger(UsmSecurityParameters.class);
    private int authParametersPosition;
    private byte[] authenticationKey;
    private OctetString authenticationParameters;
    private AuthenticationProtocol authenticationProtocol;
    private Integer32 authoritativeEngineBoots;
    private OctetString authoritativeEngineID;
    private Integer32 authoritativeEngineTime;
    private int decodedLength;
    private byte[] privacyKey;
    private OctetString privacyParameters;
    private PrivacyProtocol privacyProtocol;
    private int securityParametersPosition;
    private int sequencePosition;
    private OctetString userName;

    public UsmSecurityParameters() {
        this.authoritativeEngineID = new OctetString();
        this.authoritativeEngineBoots = new Integer32();
        this.authoritativeEngineTime = new Integer32();
        this.userName = new OctetString();
        this.authenticationProtocol = null;
        this.privacyProtocol = null;
        this.privacyParameters = new OctetString();
        this.authenticationParameters = new OctetString();
        this.securityParametersPosition = -1;
        this.authParametersPosition = -1;
        this.decodedLength = -1;
        this.sequencePosition = -1;
    }

    private int getBEREncodedAuthParamsPosition() {
        return getBERLength() - (this.authenticationParameters.getBERPayloadLength() + this.privacyParameters.getBERLength());
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        int position = (int) bERInputStream.getPosition();
        this.decodedLength = position;
        BER.MutableByte mutableByte = new BER.MutableByte();
        int iDecodeHeader = BER.decodeHeader(bERInputStream, mutableByte);
        long position2 = bERInputStream.getPosition();
        if (mutableByte.getValue() != 4) {
            String str = "BER decoding error: Expected BER OCTETSTRING but found: " + ((int) mutableByte.getValue());
            logger.warn(str);
            throw new IOException(str);
        }
        this.sequencePosition = (int) bERInputStream.getPosition();
        int iDecodeHeader2 = BER.decodeHeader(bERInputStream, mutableByte);
        long position3 = bERInputStream.getPosition();
        if (mutableByte.getValue() != 48) {
            String str2 = "BER decoding error: Expected BER SEQUENCE but found: " + ((int) mutableByte.getValue());
            logger.warn(str2);
            throw new IOException(str2);
        }
        this.authoritativeEngineID.decodeBER(bERInputStream);
        this.authoritativeEngineBoots.decodeBER(bERInputStream);
        this.authoritativeEngineTime.decodeBER(bERInputStream);
        this.userName.decodeBER(bERInputStream);
        this.authParametersPosition = (int) (bERInputStream.getPosition() - position);
        int position4 = (int) bERInputStream.getPosition();
        this.authenticationParameters.decodeBER(bERInputStream);
        this.authParametersPosition = (int) (this.authParametersPosition + ((bERInputStream.getPosition() - position4) - this.authenticationParameters.getBERPayloadLength()));
        this.privacyParameters.decodeBER(bERInputStream);
        this.decodedLength = (int) (bERInputStream.getPosition() - this.decodedLength);
        if (BER.isCheckSequenceLength()) {
            BER.checkSequenceLength(iDecodeHeader2, (int) (bERInputStream.getPosition() - position3), this);
            BER.checkSequenceLength(iDecodeHeader, (int) (bERInputStream.getPosition() - position2), this);
        }
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, 4, getBERPayloadLength());
        BER.encodeHeader(outputStream, 48, getBERUsmPayloadLength());
        this.authoritativeEngineID.encodeBER(outputStream);
        this.authoritativeEngineBoots.encodeBER(outputStream);
        this.authoritativeEngineTime.encodeBER(outputStream);
        this.userName.encodeBER(outputStream);
        this.authenticationParameters.encodeBER(outputStream);
        this.privacyParameters.encodeBER(outputStream);
    }

    public int getAuthParametersPosition() {
        int i10 = this.authParametersPosition;
        return i10 >= 0 ? i10 : getBEREncodedAuthParamsPosition();
    }

    public byte[] getAuthenticationKey() {
        return this.authenticationKey;
    }

    public OctetString getAuthenticationParameters() {
        return this.authenticationParameters;
    }

    public AuthenticationProtocol getAuthenticationProtocol() {
        return this.authenticationProtocol;
    }

    public int getAuthoritativeEngineBoots() {
        return this.authoritativeEngineBoots.getValue();
    }

    public byte[] getAuthoritativeEngineID() {
        return this.authoritativeEngineID.getValue();
    }

    public int getAuthoritativeEngineTime() {
        return this.authoritativeEngineTime.getValue();
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        int bERPayloadLength = getBERPayloadLength();
        return bERPayloadLength + BER.getBERLengthOfLength(bERPayloadLength) + 1;
    }

    @Override // org.snmp4j.security.SecurityParameters
    public int getBERMaxLength(int i10) {
        int maxAuthDigestLength;
        SecurityProtocols securityProtocols = SecurityProtocols.getInstance();
        if (i10 > 1) {
            maxAuthDigestLength = securityProtocols.getMaxAuthDigestLength() + BER.getBERLengthOfLength(securityProtocols.getMaxAuthDigestLength()) + 1;
            if (i10 == 3) {
                maxAuthDigestLength += securityProtocols.getMaxPrivDecryptParamsLength() + BER.getBERLengthOfLength(securityProtocols.getMaxPrivDecryptParamsLength()) + 1;
            }
        } else {
            maxAuthDigestLength = 2;
        }
        int i11 = maxAuthDigestLength + MAX_BER_LENGTH_WITHOU_SEC_PARAMS;
        return i11 + BER.getBERLengthOfLength(i11) + 1;
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        int bERUsmPayloadLength = getBERUsmPayloadLength();
        return bERUsmPayloadLength + BER.getBERLengthOfLength(bERUsmPayloadLength) + 1;
    }

    public int getBERUsmPayloadLength() {
        return this.authoritativeEngineID.getBERLength() + this.authoritativeEngineBoots.getBERLength() + this.authoritativeEngineTime.getBERLength() + this.userName.getBERLength() + this.authenticationParameters.getBERLength() + this.privacyParameters.getBERLength();
    }

    public byte[] getPrivacyKey() {
        return this.privacyKey;
    }

    public OctetString getPrivacyParameters() {
        return this.privacyParameters;
    }

    public PrivacyProtocol getPrivacyProtocol() {
        return this.privacyProtocol;
    }

    public int getScopedPduPosition() {
        int bERLength;
        int securityParametersPosition = this.decodedLength;
        if (securityParametersPosition >= 0) {
            bERLength = getSecurityParametersPosition();
        } else {
            securityParametersPosition = getSecurityParametersPosition();
            bERLength = getBERLength();
        }
        return securityParametersPosition + bERLength;
    }

    @Override // org.snmp4j.security.SecurityParameters
    public int getSecurityParametersPosition() {
        return this.securityParametersPosition;
    }

    public int getSequencePosition() {
        return this.sequencePosition;
    }

    public OctetString getUserName() {
        return this.userName;
    }

    public void setAuthenticationKey(byte[] bArr) {
        this.authenticationKey = bArr;
    }

    public void setAuthenticationParameters(OctetString octetString) {
        this.authenticationParameters = octetString;
    }

    public void setAuthenticationProtocol(AuthenticationProtocol authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol;
    }

    public void setAuthoritativeEngineBoots(int i10) {
        this.authoritativeEngineBoots.setValue(i10);
    }

    public void setAuthoritativeEngineID(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Authoritative engine ID must not be null");
        }
        this.authoritativeEngineID.setValue(bArr);
    }

    public void setAuthoritativeEngineTime(int i10) {
        this.authoritativeEngineTime.setValue(i10);
    }

    public void setPrivacyKey(byte[] bArr) {
        this.privacyKey = bArr;
    }

    public void setPrivacyParameters(OctetString octetString) {
        this.privacyParameters = octetString;
    }

    public void setPrivacyProtocol(PrivacyProtocol privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
    }

    @Override // org.snmp4j.security.SecurityParameters
    public void setSecurityParametersPosition(int i10) {
        this.securityParametersPosition = i10;
    }

    public void setUserName(OctetString octetString) {
        this.userName = octetString;
    }

    public UsmSecurityParameters(OctetString octetString, Integer32 integer32, Integer32 integer322, OctetString octetString2, AuthenticationProtocol authenticationProtocol, PrivacyProtocol privacyProtocol) {
        this.authoritativeEngineID = new OctetString();
        this.authoritativeEngineBoots = new Integer32();
        this.authoritativeEngineTime = new Integer32();
        this.userName = new OctetString();
        this.authenticationProtocol = null;
        this.privacyProtocol = null;
        this.privacyParameters = new OctetString();
        this.authenticationParameters = new OctetString();
        this.securityParametersPosition = -1;
        this.authParametersPosition = -1;
        this.decodedLength = -1;
        this.sequencePosition = -1;
        this.authoritativeEngineID = octetString;
        this.authoritativeEngineBoots = integer32;
        this.authoritativeEngineTime = integer322;
        this.privacyProtocol = privacyProtocol;
        this.userName = octetString2;
        this.authenticationProtocol = authenticationProtocol;
    }
}
