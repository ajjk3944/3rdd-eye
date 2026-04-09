package org.snmp4j.security;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class PrivDES extends PrivacyGeneric {
    private static final int DECRYPT_PARAMS_LENGTH = 8;
    private static final int INIT_VECTOR_LENGTH = 8;
    private static final int INPUT_KEY_LENGTH = 16;
    private static final int KEY_LENGTH = 8;
    private static final String PROTOCOL_CLASS = "DES";
    private static final String PROTOCOL_ID = "DES/CBC/NoPadding";
    private static final long serialVersionUID = 2526070176429255416L;
    protected Salt salt;
    public static final OID ID = new OID("1.3.6.1.6.3.10.1.2.2");
    private static final LogAdapter logger = LogFactory.getLogger(PrivDES.class);

    public PrivDES() {
        this.initVectorLength = 8;
        this.protocolId = PROTOCOL_ID;
        this.protocolClass = PROTOCOL_CLASS;
        this.keyBytes = 8;
        this.salt = Salt.getInstance();
        this.cipherPool = new CipherPool();
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] decrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams) {
        if (i11 % 8 != 0 || i11 < 8 || decryptParams.length != 8) {
            throw new IllegalArgumentException("Length (" + i11 + ") is not multiple of 8 or decrypt params has not length 8 (" + decryptParams.length + ").");
        }
        if (bArr2.length >= 16) {
            byte[] bArr3 = new byte[8];
            for (int i12 = 0; i12 < 8; i12++) {
                bArr3[i12] = (byte) (bArr2[i12 + 8] ^ decryptParams.array[i12]);
            }
            return doDecrypt(bArr, i10, i11, bArr2, bArr3);
        }
        logger.error("Wrong Key length: need at least 16 bytes, is " + bArr2.length + " bytes.");
        throw new IllegalArgumentException("decryptionKey has illegal length " + bArr2.length + " (should be at least 16).");
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] encrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams) {
        int next = (int) this.salt.getNext();
        if (bArr2.length < 16) {
            logger.error("Wrong Key length: need at least 16 bytes, is " + bArr2.length + " bytes.");
            throw new IllegalArgumentException("encryptionKey has illegal length " + bArr2.length + " (should be at least 16).");
        }
        if (decryptParams.array == null || decryptParams.length < 8) {
            decryptParams.array = new byte[8];
        }
        decryptParams.length = 8;
        decryptParams.offset = 0;
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Preparing decrypt_params.");
        }
        for (int i12 = 0; i12 < 4; i12++) {
            byte[] bArr3 = decryptParams.array;
            bArr3[3 - i12] = (byte) ((j10 >> r9) & 255);
            bArr3[7 - i12] = (byte) ((next >> (i12 * 8)) & 255);
        }
        byte[] bArr4 = new byte[8];
        LogAdapter logAdapter2 = logger;
        if (logAdapter2.isDebugEnabled()) {
            logAdapter2.debug("Preparing iv for encryption.");
        }
        for (int i13 = 0; i13 < 8; i13++) {
            bArr4[i13] = (byte) (bArr2[i13 + 8] ^ decryptParams.array[i13]);
        }
        byte[] bArrDoFinalWithPadding = null;
        try {
            Cipher cipherDoInit = doInit(bArr2, bArr4);
            bArrDoFinalWithPadding = doFinalWithPadding(bArr, i10, i11, cipherDoInit);
            this.cipherPool.offerCipher(cipherDoInit);
        } catch (Exception e10) {
            LogAdapter logAdapter3 = logger;
            logAdapter3.error(e10);
            if (logAdapter3.isDebugEnabled()) {
                e10.printStackTrace();
            }
        }
        LogAdapter logAdapter4 = logger;
        if (logAdapter4.isDebugEnabled()) {
            logAdapter4.debug("Encryption finished.");
        }
        return bArrDoFinalWithPadding;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] extendShortKey(byte[] bArr, OctetString octetString, byte[] bArr2, AuthenticationProtocol authenticationProtocol) {
        return bArr;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getDecryptParamsLength() {
        return 8;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getEncryptedLength(int i10) {
        return i10 % 8 == 0 ? i10 : ((i10 / 8) + 1) * 8;
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        return (OID) ID.clone();
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public int getMaxKeyLength() {
        return getMinKeyLength();
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getMinKeyLength() {
        return 16;
    }

    @Override // org.snmp4j.security.PrivacyGeneric, org.snmp4j.security.SecurityProtocol
    public boolean isSupported() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            if (this.cipherPool.reuseCipher() == null) {
                Cipher.getInstance("DESede/CBC/NoPadding");
            }
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
