package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public abstract class OpenSSLCipher extends CipherSpi {
    private int blockSize;
    byte[] encodedKey;
    private boolean encrypting;
    byte[] iv;
    Mode mode;
    private Padding padding;

    enum Mode {
        NONE,
        CBC,
        CTR,
        ECB,
        GCM,
        GCM_SIV,
        POLY1305;

        public static Mode getNormalized(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.equals("GCM-SIV")) {
                return GCM_SIV;
            }
            if (upperCase.equals("GCM_SIV")) {
                throw new IllegalArgumentException("Invalid mode");
            }
            return valueOf(upperCase);
        }
    }

    enum Padding {
        NOPADDING,
        PKCS5PADDING,
        PKCS7PADDING;

        public static Padding getNormalized(String str) {
            Padding paddingValueOf = valueOf(str.toUpperCase(Locale.US));
            return paddingValueOf == PKCS7PADDING ? PKCS5PADDING : paddingValueOf;
        }
    }

    OpenSSLCipher() {
        this.mode = Mode.ECB;
        this.padding = Padding.PKCS5PADDING;
    }

    private byte[] checkAndSetEncodedKey(int i10, Key key) throws InvalidKeyException {
        if (i10 == 1 || i10 == 3) {
            this.encrypting = true;
        } else {
            if (i10 != 2 && i10 != 4) {
                throw new InvalidParameterException("Unsupported opmode " + i10);
            }
            this.encrypting = false;
        }
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Only SecretKey is supported");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key.getEncoded() == null");
        }
        checkSupportedKeySize(encoded.length);
        this.encodedKey = encoded;
        return encoded;
    }

    abstract void checkSupportedKeySize(int i10) throws InvalidKeyException;

    abstract void checkSupportedMode(Mode mode) throws NoSuchAlgorithmException;

    abstract void checkSupportedPadding(Padding padding) throws NoSuchPaddingException;

    abstract int doFinalInternal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException;

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        int iUpdateInternal;
        int outputSizeForFinal = getOutputSizeForFinal(i11);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i11 > 0) {
            try {
                iUpdateInternal = updateInternal(bArr, i10, i11, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e10) {
                throw new RuntimeException("our calculated buffer was too small", e10);
            }
        } else {
            iUpdateInternal = 0;
        }
        try {
            int iDoFinalInternal = iUpdateInternal + doFinalInternal(bArr2, iUpdateInternal, outputSizeForFinal - iUpdateInternal);
            return iDoFinalInternal == outputSizeForFinal ? bArr2 : iDoFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iDoFinalInternal);
        } catch (ShortBufferException e11) {
            throw new RuntimeException("our calculated buffer was too small", e11);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.blockSize;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return this.iv;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) throws InvalidKeyException {
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Only SecretKey is supported");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key.getEncoded() == null");
        }
        checkSupportedKeySize(encoded.length);
        return encoded.length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i10) {
        return Math.max(getOutputSizeForUpdate(i10), getOutputSizeForFinal(i10));
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() throws NoSuchAlgorithmException, InvalidParameterSpecException {
        byte[] bArr = this.iv;
        if (bArr != null && bArr.length > 0) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(getBaseCipherName());
                algorithmParameters.init(new IvParameterSpec(this.iv));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException | InvalidParameterSpecException unused) {
            }
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i10, key);
        try {
            engineInitInternal(this.encodedKey, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new RuntimeException(e10);
        }
    }

    abstract void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            Mode normalized = Mode.getNormalized(str);
            checkSupportedMode(normalized);
            this.mode = normalized;
        } catch (IllegalArgumentException e10) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException("No such mode: " + str);
            noSuchAlgorithmException.initCause(e10);
            throw noSuchAlgorithmException;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        try {
            Padding normalized = Padding.getNormalized(str);
            checkSupportedPadding(normalized);
            this.padding = normalized;
        } catch (IllegalArgumentException e10) {
            NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException("No such padding: " + str);
            noSuchPaddingException.initCause(e10);
            throw noSuchPaddingException;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i10) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i10 == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i10 == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i10 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            throw new UnsupportedOperationException("wrappedKeyType == " + i10);
        } catch (InvalidKeySpecException e10) {
            throw new InvalidKeyException(e10);
        } catch (BadPaddingException e11) {
            throw new InvalidKeyException(e11);
        } catch (IllegalBlockSizeException e12) {
            throw new InvalidKeyException(e12);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int outputSizeForUpdate = getOutputSizeForUpdate(i11);
        byte[] bArr2 = outputSizeForUpdate > 0 ? new byte[outputSizeForUpdate] : EmptyArray.BYTE;
        try {
            int iUpdateInternal = updateInternal(bArr, i10, i11, bArr2, 0, outputSizeForUpdate);
            return bArr2.length == iUpdateInternal ? bArr2 : iUpdateInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iUpdateInternal);
        } catch (ShortBufferException unused) {
            throw new RuntimeException("calculated buffer size was wrong: " + outputSizeForUpdate);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            byte[] encoded = key.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e10);
            throw illegalBlockSizeException;
        }
    }

    abstract String getBaseCipherName();

    abstract int getCipherBlockSize();

    abstract int getOutputSizeForFinal(int i10);

    abstract int getOutputSizeForUpdate(int i10);

    Padding getPadding() {
        return this.padding;
    }

    protected AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        try {
            return algorithmParameters.getParameterSpec(IvParameterSpec.class);
        } catch (InvalidParameterSpecException e10) {
            throw new InvalidAlgorithmParameterException("Params must be convertible to IvParameterSpec", e10);
        }
    }

    boolean isEncrypting() {
        return this.encrypting;
    }

    boolean supportsVariableSizeIv() {
        return false;
    }

    boolean supportsVariableSizeKey() {
        return false;
    }

    abstract int updateInternal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) throws ShortBufferException;

    OpenSSLCipher(Mode mode, Padding padding) {
        this.mode = Mode.ECB;
        Padding padding2 = Padding.NOPADDING;
        this.mode = mode;
        this.padding = padding;
        this.blockSize = getCipherBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        checkAndSetEncodedKey(i10, key);
        engineInitInternal(this.encodedKey, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        engineInit(i10, key, getParameterSpec(algorithmParameters), secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws ShortBufferException {
        return updateInternal(bArr, i10, i11, bArr2, i12, getOutputSizeForUpdate(i11));
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iUpdateInternal;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i11);
            if (i11 > 0) {
                iUpdateInternal = updateInternal(bArr, i10, i11, bArr2, i12, outputSizeForFinal);
                i12 += iUpdateInternal;
                outputSizeForFinal -= iUpdateInternal;
            } else {
                iUpdateInternal = 0;
            }
            return iUpdateInternal + doFinalInternal(bArr2, i12, outputSizeForFinal);
        }
        throw new NullPointerException("output == null");
    }
}
