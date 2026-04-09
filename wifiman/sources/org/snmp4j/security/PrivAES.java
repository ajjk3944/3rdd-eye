package org.snmp4j.security;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class PrivAES extends PrivacyGeneric implements PrivacyProtocol {
    private static final int DECRYPT_PARAMS_LENGTH = 8;
    private static final int INIT_VECTOR_LENGTH = 16;
    private static final String PROTOCOL_CLASS = "AES";
    private static final String PROTOCOL_ID = "AES/CFB/NoPadding";
    private static final LogAdapter logger = LogFactory.getLogger(PrivAES.class);
    protected Salt salt;

    public PrivAES(int i10) {
        this.initVectorLength = 16;
        this.protocolId = PROTOCOL_ID;
        this.protocolClass = PROTOCOL_CLASS;
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.keyBytes = i10;
            this.salt = Salt.getInstance();
            this.cipherPool = new CipherPool();
        } else {
            throw new IllegalArgumentException("Only 128, 192 and 256 bit AES is allowed. Requested (" + (i10 * 8) + ").");
        }
    }

    public static String asHex(byte[] bArr) {
        return new OctetString(bArr).toHexString();
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] decrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams) {
        byte[] bArr3 = new byte[16];
        if (bArr2.length != this.keyBytes) {
            throw new IllegalArgumentException("Needed key length is " + this.keyBytes + ". Got " + bArr2.length + ".");
        }
        bArr3[0] = (byte) ((j10 >> 24) & 255);
        bArr3[1] = (byte) ((j10 >> 16) & 255);
        bArr3[2] = (byte) ((j10 >> 8) & 255);
        bArr3[3] = (byte) (j10 & 255);
        bArr3[4] = (byte) ((j11 >> 24) & 255);
        bArr3[5] = (byte) ((j11 >> 16) & 255);
        bArr3[6] = (byte) ((j11 >> 8) & 255);
        bArr3[7] = (byte) (j11 & 255);
        System.arraycopy(decryptParams.array, decryptParams.offset, bArr3, 8, 8);
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("initVect is " + asHex(bArr3));
        }
        return doDecrypt(bArr, i10, i11, bArr2, bArr3);
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] encrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr3 = new byte[16];
        long next = this.salt.getNext();
        if (bArr2.length != this.keyBytes) {
            throw new IllegalArgumentException("Needed key length is " + this.keyBytes + ". Got " + bArr2.length + ".");
        }
        if (decryptParams.array == null || decryptParams.length < 8) {
            decryptParams.array = new byte[8];
        }
        decryptParams.length = 8;
        decryptParams.offset = 0;
        bArr3[0] = (byte) ((j10 >> 24) & 255);
        bArr3[1] = (byte) ((j10 >> 16) & 255);
        bArr3[2] = (byte) ((j10 >> 8) & 255);
        bArr3[3] = (byte) (j10 & 255);
        bArr3[4] = (byte) ((j11 >> 24) & 255);
        bArr3[5] = (byte) ((j11 >> 16) & 255);
        bArr3[6] = (byte) ((j11 >> 8) & 255);
        bArr3[7] = (byte) (j11 & 255);
        int i12 = 56;
        int i13 = 8;
        while (i12 >= 0) {
            bArr3[i13] = (byte) ((next >> i12) & 255);
            i12 -= 8;
            i13++;
        }
        System.arraycopy(bArr3, 8, decryptParams.array, 0, 8);
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("initVect is " + asHex(bArr3));
        }
        byte[] bArrDoFinal = null;
        try {
            Cipher cipherDoInit = doInit(bArr2, bArr3);
            bArrDoFinal = cipherDoInit.doFinal(bArr, i10, i11);
            this.cipherPool.offerCipher(cipherDoInit);
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("aes encrypt: Data to encrypt " + asHex(bArr));
                logAdapter.debug("aes encrypt: used key " + asHex(bArr2));
                logAdapter.debug("aes encrypt: created privacy_params " + asHex(decryptParams.array));
                logAdapter.debug("aes encrypt: encrypted Data  " + asHex(bArrDoFinal));
            }
        } catch (Exception e10) {
            logger.error("Encrypt Exception " + e10);
        }
        return bArrDoFinal;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public byte[] extendShortKey(byte[] bArr, OctetString octetString, byte[] bArr2, AuthenticationProtocol authenticationProtocol) {
        int minKeyLength = getMinKeyLength();
        byte[] bArr3 = new byte[minKeyLength];
        int length = bArr.length;
        System.arraycopy(bArr, 0, bArr3, 0, length);
        while (length < minKeyLength) {
            byte[] bArrHash = authenticationProtocol.hash(bArr3, 0, length);
            if (bArrHash == null) {
                return null;
            }
            int digestLength = minKeyLength - length;
            if (digestLength > authenticationProtocol.getDigestLength()) {
                digestLength = authenticationProtocol.getDigestLength();
            }
            System.arraycopy(bArrHash, 0, bArr3, length, digestLength);
            length += digestLength;
        }
        return bArr3;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getDecryptParamsLength() {
        return 8;
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getEncryptedLength(int i10) {
        return i10;
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public int getMaxKeyLength() {
        return getMinKeyLength();
    }

    @Override // org.snmp4j.security.PrivacyProtocol
    public int getMinKeyLength() {
        return this.keyBytes;
    }
}
