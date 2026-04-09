package org.xbill.DNS;

import java.io.IOException;
import java.security.PublicKey;
import org.xbill.DNS.DNSSEC;

/* loaded from: classes4.dex */
public class DNSKEYRecord extends KEYBase {
    private static final long serialVersionUID = -8679800040426675002L;

    public static class Flags {
        public static final int REVOKE = 128;
        public static final int SEP_KEY = 1;
        public static final int ZONE_KEY = 256;

        private Flags() {
        }
    }

    public static class Protocol {
        public static final int DNSSEC = 3;

        private Protocol() {
        }
    }

    public DNSKEYRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new DNSKEYRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.flags = tokenizer.getUInt16();
        this.proto = tokenizer.getUInt8();
        String string = tokenizer.getString();
        int iValue = DNSSEC.Algorithm.value(string);
        this.alg = iValue;
        if (iValue >= 0) {
            this.key = tokenizer.getBase64();
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid algorithm: ");
        stringBuffer.append(string);
        throw tokenizer.exception(stringBuffer.toString());
    }

    public DNSKEYRecord(Name name, int i10, long j10, int i11, int i12, int i13, byte[] bArr) {
        super(name, 48, i10, j10, i11, i12, i13, bArr);
    }

    public DNSKEYRecord(Name name, int i10, long j10, int i11, int i12, int i13, PublicKey publicKey) throws DNSSEC.DNSSECException {
        super(name, 48, i10, j10, i11, i12, i13, DNSSEC.fromPublicKey(publicKey, i13));
        this.publicKey = publicKey;
    }
}
