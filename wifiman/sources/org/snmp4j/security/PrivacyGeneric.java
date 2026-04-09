package org.snmp4j.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public abstract class PrivacyGeneric implements PrivacyProtocol {
    private static final LogAdapter logger = LogFactory.getLogger(PrivacyGeneric.class);
    protected CipherPool cipherPool;
    protected int initVectorLength;
    protected int keyBytes;
    protected String protocolClass;
    protected String protocolId;
    protected Salt salt;

    protected byte[] doDecrypt(byte[] bArr, int i10, int i11, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal = null;
        try {
            Cipher cipherReuseCipher = this.cipherPool.reuseCipher();
            if (cipherReuseCipher == null) {
                cipherReuseCipher = Cipher.getInstance(this.protocolId);
            }
            cipherReuseCipher.init(2, new SecretKeySpec(bArr2, 0, this.keyBytes, this.protocolClass), new IvParameterSpec(bArr3));
            bArrDoFinal = cipherReuseCipher.doFinal(bArr, i10, i11);
            this.cipherPool.offerCipher(cipherReuseCipher);
            return bArrDoFinal;
        } catch (Exception e10) {
            LogAdapter logAdapter = logger;
            logAdapter.error(e10);
            if (!logAdapter.isDebugEnabled()) {
                return bArrDoFinal;
            }
            e10.printStackTrace();
            return bArrDoFinal;
        }
    }

    protected byte[] doFinal(byte[] bArr, int i10, int i11, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        return cipher.doFinal(bArr, i10, i11);
    }

    protected byte[] doFinalWithPadding(byte[] bArr, int i10, int i11, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int i12 = i11 % 8;
        if (i12 == 0) {
            return cipher.doFinal(bArr, i10, i11);
        }
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Using padding.");
        }
        byte[] bArr2 = new byte[((i11 / 8) + 1) * 8];
        cipher.doFinal(new byte[8], 0, 8 - i12, bArr2, cipher.update(bArr, i10, i11, bArr2));
        return bArr2;
    }

    protected Cipher doInit(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherReuseCipher = this.cipherPool.reuseCipher();
        if (cipherReuseCipher == null) {
            cipherReuseCipher = Cipher.getInstance(this.protocolId);
        }
        cipherReuseCipher.init(1, new SecretKeySpec(bArr, 0, this.keyBytes, this.protocolClass), new IvParameterSpec(bArr2));
        return cipherReuseCipher;
    }

    @Override // org.snmp4j.security.SecurityProtocol
    public boolean isSupported() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipherReuseCipher = this.cipherPool.reuseCipher();
            if (cipherReuseCipher == null) {
                cipherReuseCipher = Cipher.getInstance(this.protocolId);
            }
            cipherReuseCipher.init(1, new SecretKeySpec(new byte[this.keyBytes], 0, this.keyBytes, this.protocolClass), new IvParameterSpec(new byte[this.initVectorLength]));
            return true;
        } catch (InvalidAlgorithmParameterException e10) {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug(this.protocolClass + " privacy not available due to invalid parameter: " + e10.getMessage());
            }
            return false;
        } catch (InvalidKeyException unused) {
            LogAdapter logAdapter2 = logger;
            if (logAdapter2.isDebugEnabled()) {
                logAdapter2.debug(this.protocolClass + " privacy with key length " + this.keyBytes + " not supported");
            }
            return false;
        } catch (NoSuchAlgorithmException unused2) {
            LogAdapter logAdapter3 = logger;
            if (logAdapter3.isDebugEnabled()) {
                logAdapter3.debug(this.protocolClass + " privacy not available");
            }
            return false;
        } catch (NoSuchPaddingException unused3) {
            LogAdapter logAdapter4 = logger;
            if (logAdapter4.isDebugEnabled()) {
                logAdapter4.debug(this.protocolClass + " privacy not available without padding");
            }
            return false;
        }
    }
}
