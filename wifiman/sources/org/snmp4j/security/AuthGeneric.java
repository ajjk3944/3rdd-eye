package org.snmp4j.security;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class AuthGeneric implements AuthenticationProtocol {
    private static final int HMAC_BUFFER_SIZE = 1048576;
    private static final long serialVersionUID = 4035708925348178888L;
    private int authenticationCodeLength;
    private final int digestLength;
    protected int hmacBlockSize;
    private final String protoName;
    private static final LogAdapter logger = LogFactory.getLogger(AuthGeneric.class);
    public static int HMAC_BLOCK_SIZE = 64;
    private static int DEFAULT_AUTHENTICATION_CODE_LENGTH = 12;

    public AuthGeneric(String str, int i10) {
        this.hmacBlockSize = HMAC_BLOCK_SIZE;
        this.authenticationCodeLength = DEFAULT_AUTHENTICATION_CODE_LENGTH;
        this.protoName = str;
        this.digestLength = i10;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public boolean authenticate(byte[] bArr, byte[] bArr2, int i10, int i11, ByteArrayWindow byteArrayWindow) {
        MessageDigest digestObject = getDigestObject();
        int i12 = this.hmacBlockSize;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i12];
        for (int i13 = 0; i13 < this.authenticationCodeLength; i13++) {
            byteArrayWindow.set(i13, (byte) 0);
        }
        if (bArr.length > this.hmacBlockSize) {
            bArr = digestObject.digest(bArr);
        }
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr3[i14] = (byte) (bArr[i14] ^ 54);
            bArr4[i14] = (byte) (bArr[i14] ^ 92);
        }
        for (int length = bArr.length; length < this.hmacBlockSize; length++) {
            bArr3[length] = 54;
            bArr4[length] = 92;
        }
        digestObject.update(bArr3);
        digestObject.update(bArr2, i10, i11);
        byte[] bArrDigest = digestObject.digest();
        digestObject.reset();
        digestObject.update(bArr4);
        digestObject.update(bArrDigest);
        byte[] bArrDigest2 = digestObject.digest();
        for (int i15 = 0; i15 < this.authenticationCodeLength; i15++) {
            byteArrayWindow.set(i15, bArrDigest2[i15]);
        }
        return true;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public byte[] changeDelta(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest digestObject = getDigestObject();
        int digestLength = digestObject.getDigestLength();
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug(this.protoName + "oldKey: " + new OctetString(bArr).toHexString());
            logAdapter.debug(this.protoName + "newKey: " + new OctetString(bArr2).toHexString());
            logAdapter.debug(this.protoName + "random: " + new OctetString(bArr3).toHexString());
        }
        int length = (bArr.length - 1) / digestObject.getDigestLength();
        OctetString octetString = new OctetString(bArr);
        OctetString octetString2 = new OctetString();
        for (int i10 = 0; i10 < length; i10++) {
            octetString.append(bArr3);
            digestObject.update(octetString.getValue());
            octetString.setValue(digestObject.digest());
            octetString2.append(new byte[digestLength]);
            for (int i11 = 0; i11 < digestLength; i11++) {
                int i12 = (i10 * digestLength) + i11;
                octetString2.set(i12, (byte) (octetString.get(i11) ^ bArr2[i12]));
            }
        }
        octetString.append(bArr3);
        digestObject.update(octetString.getValue());
        OctetString octetString3 = new OctetString(digestObject.digest(), 0, bArr.length - octetString2.length());
        for (int i13 = 0; i13 < octetString3.length(); i13++) {
            octetString3.set(i13, (byte) (octetString3.get(i13) ^ bArr2[(length * digestLength) + i13]));
        }
        byte[] bArr4 = new byte[bArr3.length + octetString2.length() + octetString3.length()];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(octetString2.getValue(), 0, bArr4, bArr3.length, octetString2.length());
        System.arraycopy(octetString3.getValue(), 0, bArr4, bArr3.length + octetString2.length(), octetString3.length());
        LogAdapter logAdapter2 = logger;
        if (logAdapter2.isDebugEnabled()) {
            logAdapter2.debug(this.protoName + "keyChange:" + new OctetString(bArr4).toHexString());
        }
        return bArr4;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public int getAuthenticationCodeLength() {
        return this.authenticationCodeLength;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public int getDigestLength() {
        return this.digestLength;
    }

    protected MessageDigest getDigestObject() {
        try {
            return MessageDigest.getInstance(this.protoName);
        } catch (NoSuchAlgorithmException unused) {
            throw new InternalError(this.protoName + " not supported in this VM.");
        }
    }

    @Override // org.snmp4j.security.SecurityProtocol
    public int getMaxKeyLength() {
        return getDigestLength();
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public byte[] hash(byte[] bArr) {
        MessageDigest digestObject = getDigestObject();
        digestObject.update(bArr);
        return digestObject.digest();
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public boolean isAuthentic(byte[] bArr, byte[] bArr2, int i10, int i11, ByteArrayWindow byteArrayWindow) {
        int i12 = this.authenticationCodeLength;
        ByteArrayWindow byteArrayWindow2 = new ByteArrayWindow(new byte[i12], 0, i12);
        System.arraycopy(byteArrayWindow.getValue(), byteArrayWindow.getOffset(), byteArrayWindow2.getValue(), 0, this.authenticationCodeLength);
        if (authenticate(bArr, bArr2, i10, i11, byteArrayWindow)) {
            return byteArrayWindow.equals(byteArrayWindow2, this.authenticationCodeLength);
        }
        return false;
    }

    @Override // org.snmp4j.security.SecurityProtocol
    public boolean isSupported() throws NoSuchAlgorithmException {
        try {
            MessageDigest.getInstance(this.protoName);
            return true;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public byte[] passwordToKey(OctetString octetString, byte[] bArr) {
        int i10;
        MessageDigest digestObject = getDigestObject();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
        byte[] value = octetString.getValue();
        int i11 = 0;
        int i12 = 0;
        while (i11 < 1048576) {
            int i13 = 0;
            while (true) {
                i10 = this.hmacBlockSize;
                if (i13 < i10) {
                    byteBufferAllocate.put(value[i12 % value.length]);
                    i13++;
                    i12++;
                }
            }
            i11 += i10;
        }
        byteBufferAllocate.flip();
        digestObject.update(byteBufferAllocate);
        byte[] bArrDigest = digestObject.digest();
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug(this.protoName + "First digest: " + new OctetString(bArrDigest).toHexString());
        }
        digestObject.reset();
        digestObject.update(bArrDigest);
        digestObject.update(bArr);
        digestObject.update(bArrDigest);
        byte[] bArrDigest2 = digestObject.digest();
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug(this.protoName + "localized key: " + new OctetString(bArrDigest2).toHexString());
        }
        return bArrDigest2;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol
    public byte[] hash(byte[] bArr, int i10, int i11) {
        MessageDigest digestObject = getDigestObject();
        digestObject.update(bArr, i10, i11);
        return digestObject.digest();
    }

    public AuthGeneric(String str, int i10, int i11) {
        this(str, i10);
        this.authenticationCodeLength = i11;
    }

    public AuthGeneric(String str, int i10, int i11, int i12) {
        this(str, i10, i11);
        this.hmacBlockSize = i12;
    }
}
