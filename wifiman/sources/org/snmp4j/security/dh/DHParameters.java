package org.snmp4j.security.dh;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class DHParameters implements Serializable {
    public static final DHParameters DEFAULT = new DHParameters(DHGroups.f57146P1, DHGroups.f57145G, 16);
    private BigInteger generator;
    private BigInteger prime;
    private int privateValueLength;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.prime = bigInteger;
        this.generator = bigInteger2;
        this.privateValueLength = i10;
    }

    public static OctetString encodeBER(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        int bigIntegerBERLength = BER.getBigIntegerBERLength(bigInteger);
        int bigIntegerBERLength2 = BER.getBigIntegerBERLength(bigInteger2) + bigIntegerBERLength + (i10 != 0 ? new Integer32(i10).getBERLength() : 0);
        BEROutputStream bEROutputStream = new BEROutputStream(ByteBuffer.allocate(BER.getBERLengthOfLength(bigIntegerBERLength2) + bigIntegerBERLength2 + 1));
        try {
            BER.encodeSequence(bEROutputStream, BER.ASN_SEQUENCE, bigIntegerBERLength2);
            BER.encodeBigInteger(bEROutputStream, (byte) 2, bigInteger);
            BER.encodeBigInteger(bEROutputStream, (byte) 2, bigInteger2);
            if (i10 != 0) {
                BER.encodeInteger(bEROutputStream, (byte) 2, i10);
            }
            return new OctetString(bEROutputStream.getBuffer().array());
        } catch (IOException unused) {
            return null;
        }
    }

    public static DHParameters getDHParametersFromBER(OctetString octetString) throws IOException {
        BERInputStream bERInputStream = new BERInputStream(ByteBuffer.wrap(octetString.getValue()));
        int iDecodeHeader = BER.decodeHeader(bERInputStream, new BER.MutableByte());
        long position = bERInputStream.getPosition();
        BER.MutableByte mutableByte = new BER.MutableByte();
        return new DHParameters(BER.decodeBigInteger(bERInputStream, mutableByte), BER.decodeBigInteger(bERInputStream, mutableByte), (bERInputStream.available() <= 0 || bERInputStream.getPosition() >= ((long) iDecodeHeader) + position) ? 0 : BER.decodeInteger(bERInputStream, mutableByte));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getPrivateValueLength() == dHParameters.getPrivateValueLength() && getPrime().equals(dHParameters.getPrime())) {
            return getGenerator().equals(dHParameters.getGenerator());
        }
        return false;
    }

    public BigInteger getGenerator() {
        return this.generator;
    }

    public BigInteger getPrime() {
        return this.prime;
    }

    public int getPrivateValueLength() {
        return this.privateValueLength;
    }

    public int hashCode() {
        return (((getPrime().hashCode() * 31) + getGenerator().hashCode()) * 31) + getPrivateValueLength();
    }

    public String toString() {
        return "DHParameters{prime=" + this.prime + ", generator=" + this.generator + ", privateValueLength=" + this.privateValueLength + '}';
    }
}
