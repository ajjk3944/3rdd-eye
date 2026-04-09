package org.xbill.DNS;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.util.Date;
import org.xbill.DNS.DNSSEC;

/* loaded from: classes4.dex */
public class SIG0 {
    private static final short VALIDITY = 300;

    private SIG0() {
    }

    public static void signMessage(Message message, KEYRecord kEYRecord, PrivateKey privateKey, SIGRecord sIGRecord) throws NumberFormatException, DNSSEC.DNSSECException {
        int iIntValue = Options.intValue("sig0validity");
        if (iIntValue < 0) {
            iIntValue = 300;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        message.addRecord(DNSSEC.signMessage(message, sIGRecord, kEYRecord, privateKey, new Date(jCurrentTimeMillis), new Date(jCurrentTimeMillis + (iIntValue * 1000))), 3);
    }

    public static void verifyMessage(Message message, byte[] bArr, KEYRecord kEYRecord, SIGRecord sIGRecord) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, DNSSEC.DNSSECException {
        SIGRecord sIGRecord2;
        Record[] sectionArray = message.getSectionArray(3);
        int i10 = 0;
        while (true) {
            if (i10 >= sectionArray.length) {
                sIGRecord2 = null;
                break;
            } else {
                if (sectionArray[i10].getType() == 24 && ((SIGRecord) sectionArray[i10]).getTypeCovered() == 0) {
                    sIGRecord2 = (SIGRecord) sectionArray[i10];
                    break;
                }
                i10++;
            }
        }
        DNSSEC.verifyMessage(message, bArr, sIGRecord2, sIGRecord, kEYRecord);
    }
}
