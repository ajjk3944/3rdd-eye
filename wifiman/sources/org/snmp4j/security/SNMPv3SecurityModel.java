package org.snmp4j.security;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class SNMPv3SecurityModel implements SecurityModel {
    protected OctetString localEngineID;

    protected static byte[] buildMessageBuffer(BERInputStream bERInputStream) throws IOException {
        bERInputStream.mark(16);
        int iDecodeHeader = BER.decodeHeader(bERInputStream, new BER.MutableByte()) + (((int) bERInputStream.getPosition()) - ((int) bERInputStream.getPosition()));
        byte[] bArr = new byte[iDecodeHeader];
        bERInputStream.reset();
        int iAvailable = bERInputStream.available();
        int i10 = 0;
        while (i10 < iDecodeHeader && iAvailable > 0) {
            int i11 = bERInputStream.read(bArr, i10, iDecodeHeader - i10);
            if (i11 < 0) {
                break;
            }
            i10 += i11;
        }
        return bArr;
    }

    protected static byte[] buildWholeMessage(Integer32 integer32, byte[] bArr, byte[] bArr2, SecurityParameters securityParameters) throws IOException {
        int bERLength = integer32.getBERLength() + bArr2.length + securityParameters.getBERLength() + bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BER.getBERLengthOfLength(bERLength) + bERLength + 1);
        BER.encodeHeader(byteArrayOutputStream, 48, bERLength);
        integer32.encodeBER(byteArrayOutputStream);
        byteArrayOutputStream.write(bArr2);
        securityParameters.encodeBER(byteArrayOutputStream);
        byteArrayOutputStream.write(bArr);
        securityParameters.setSecurityParametersPosition(integer32.getBERLength() + 1 + BER.getBERLengthOfLength(bERLength) + bArr2.length);
        return byteArrayOutputStream.toByteArray();
    }

    public OctetString getLocalEngineID() {
        return this.localEngineID;
    }
}
