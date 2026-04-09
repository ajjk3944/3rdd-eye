package org.xbill.DNS;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class DNSSEC {
    private static final int ASN1_INT = 2;
    private static final int ASN1_SEQ = 48;
    private static final int DSA_LEN = 20;
    private static final ECKeyInfo GOST = new ECKeyInfo(32, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", "A6", "1", "8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
    private static final ECKeyInfo ECDSA_P256 = new ECKeyInfo(32, "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
    private static final ECKeyInfo ECDSA_P384 = new ECKeyInfo(48, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");

    public static class Algorithm {
        public static final int DH = 2;
        public static final int DSA = 3;
        public static final int DSA_NSEC3_SHA1 = 6;
        public static final int ECC_GOST = 12;
        public static final int ECDSAP256SHA256 = 13;
        public static final int ECDSAP384SHA384 = 14;
        public static final int INDIRECT = 252;
        public static final int PRIVATEDNS = 253;
        public static final int PRIVATEOID = 254;
        public static final int RSAMD5 = 1;
        public static final int RSASHA1 = 5;
        public static final int RSASHA256 = 8;
        public static final int RSASHA512 = 10;
        public static final int RSA_NSEC3_SHA1 = 7;
        private static Mnemonic algs;

        static {
            Mnemonic mnemonic = new Mnemonic("DNSSEC algorithm", 2);
            algs = mnemonic;
            mnemonic.setMaximum(255);
            algs.setNumericAllowed(true);
            algs.add(1, "RSAMD5");
            algs.add(2, "DH");
            algs.add(3, "DSA");
            algs.add(5, "RSASHA1");
            algs.add(6, "DSA-NSEC3-SHA1");
            algs.add(7, "RSA-NSEC3-SHA1");
            algs.add(8, "RSASHA256");
            algs.add(10, "RSASHA512");
            algs.add(12, "ECC-GOST");
            algs.add(13, "ECDSAP256SHA256");
            algs.add(14, "ECDSAP384SHA384");
            algs.add(252, "INDIRECT");
            algs.add(253, "PRIVATEDNS");
            algs.add(254, "PRIVATEOID");
        }

        private Algorithm() {
        }

        public static String string(int i10) {
            return algs.getText(i10);
        }

        public static int value(String str) {
            return algs.getValue(str);
        }
    }

    public static class DNSSECException extends Exception {
        public DNSSECException(String str) {
            super(str);
        }
    }

    public static class ECKeyInfo {

        /* renamed from: a, reason: collision with root package name */
        public BigInteger f23834a;

        /* renamed from: b, reason: collision with root package name */
        public BigInteger f23835b;
        EllipticCurve curve;
        public BigInteger gx;
        public BigInteger gy;
        int length;

        /* renamed from: n, reason: collision with root package name */
        public BigInteger f23836n;

        /* renamed from: p, reason: collision with root package name */
        public BigInteger f23837p;
        ECParameterSpec spec;

        public ECKeyInfo(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            this.length = i10;
            this.f23837p = new BigInteger(str, 16);
            this.f23834a = new BigInteger(str2, 16);
            this.f23835b = new BigInteger(str3, 16);
            this.gx = new BigInteger(str4, 16);
            this.gy = new BigInteger(str5, 16);
            this.f23836n = new BigInteger(str6, 16);
            this.curve = new EllipticCurve(new ECFieldFp(this.f23837p), this.f23834a, this.f23835b);
            this.spec = new ECParameterSpec(this.curve, new ECPoint(this.gx, this.gy), this.f23836n, 1);
        }
    }

    public static class IncompatibleKeyException extends IllegalArgumentException {
        public IncompatibleKeyException() {
            super("incompatible keys");
        }
    }

    public static class KeyMismatchException extends DNSSECException {
        private KEYBase key;
        private SIGBase sig;

        public KeyMismatchException(KEYBase kEYBase, SIGBase sIGBase) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key ");
            stringBuffer.append(kEYBase.getName());
            stringBuffer.append("/");
            stringBuffer.append(Algorithm.string(kEYBase.getAlgorithm()));
            stringBuffer.append("/");
            stringBuffer.append(kEYBase.getFootprint());
            stringBuffer.append(" ");
            stringBuffer.append("does not match signature ");
            stringBuffer.append(sIGBase.getSigner());
            stringBuffer.append("/");
            stringBuffer.append(Algorithm.string(sIGBase.getAlgorithm()));
            stringBuffer.append("/");
            stringBuffer.append(sIGBase.getFootprint());
            super(stringBuffer.toString());
        }
    }

    public static class MalformedKeyException extends DNSSECException {
        public MalformedKeyException(KEYBase kEYBase) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid key data: ");
            stringBuffer.append(kEYBase.rdataToString());
            super(stringBuffer.toString());
        }
    }

    public static class NoSignatureException extends DNSSECException {
        public NoSignatureException() {
            super("no signature found");
        }
    }

    public static class SignatureExpiredException extends DNSSECException {
        private Date now;
        private Date when;

        public SignatureExpiredException(Date date, Date date2) {
            super("signature expired");
            this.when = date;
            this.now = date2;
        }

        public Date getExpiration() {
            return this.when;
        }

        public Date getVerifyTime() {
            return this.now;
        }
    }

    public static class SignatureNotYetValidException extends DNSSECException {
        private Date now;
        private Date when;

        public SignatureNotYetValidException(Date date, Date date2) {
            super("signature is not yet valid");
            this.when = date;
            this.now = date2;
        }

        public Date getExpiration() {
            return this.when;
        }

        public Date getVerifyTime() {
            return this.now;
        }
    }

    public static class SignatureVerificationException extends DNSSECException {
        public SignatureVerificationException() {
            super("signature verification failed");
        }
    }

    public static class UnsupportedAlgorithmException extends DNSSECException {
        public UnsupportedAlgorithmException(int i10) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unsupported algorithm: ");
            stringBuffer.append(i10);
            super(stringBuffer.toString());
        }
    }

    private DNSSEC() {
    }

    private static int BigIntegerLength(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    private static byte[] DSASignaturefromDNS(byte[] bArr) throws IOException, DNSSECException {
        if (bArr.length != 41) {
            throw new SignatureVerificationException();
        }
        DNSInput dNSInput = new DNSInput(bArr);
        DNSOutput dNSOutput = new DNSOutput();
        dNSInput.readU8();
        byte[] byteArray = dNSInput.readByteArray(20);
        int i10 = byteArray[0] < 0 ? 21 : 20;
        byte[] byteArray2 = dNSInput.readByteArray(20);
        int i11 = byteArray2[0] >= 0 ? 20 : 21;
        dNSOutput.writeU8(48);
        dNSOutput.writeU8(i10 + i11 + 4);
        dNSOutput.writeU8(2);
        dNSOutput.writeU8(i10);
        if (i10 > 20) {
            dNSOutput.writeU8(0);
        }
        dNSOutput.writeByteArray(byteArray);
        dNSOutput.writeU8(2);
        dNSOutput.writeU8(i11);
        if (i11 > 20) {
            dNSOutput.writeU8(0);
        }
        dNSOutput.writeByteArray(byteArray2);
        return dNSOutput.toByteArray();
    }

    private static byte[] DSASignaturetoDNS(byte[] bArr, int i10) throws IOException {
        DNSInput dNSInput = new DNSInput(bArr);
        DNSOutput dNSOutput = new DNSOutput();
        dNSOutput.writeU8(i10);
        if (dNSInput.readU8() != 48) {
            throw new IOException();
        }
        dNSInput.readU8();
        if (dNSInput.readU8() != 2) {
            throw new IOException();
        }
        int u82 = dNSInput.readU8();
        if (u82 == 21) {
            if (dNSInput.readU8() != 0) {
                throw new IOException();
            }
        } else if (u82 != 20) {
            throw new IOException();
        }
        dNSOutput.writeByteArray(dNSInput.readByteArray(20));
        if (dNSInput.readU8() != 2) {
            throw new IOException();
        }
        int u83 = dNSInput.readU8();
        if (u83 == 21) {
            if (dNSInput.readU8() != 0) {
                throw new IOException();
            }
        } else if (u83 != 20) {
            throw new IOException();
        }
        dNSOutput.writeByteArray(dNSInput.readByteArray(20));
        return dNSOutput.toByteArray();
    }

    private static byte[] ECDSASignaturefromDNS(byte[] bArr, ECKeyInfo eCKeyInfo) throws IOException, DNSSECException {
        if (bArr.length != eCKeyInfo.length * 2) {
            throw new SignatureVerificationException();
        }
        DNSInput dNSInput = new DNSInput(bArr);
        DNSOutput dNSOutput = new DNSOutput();
        byte[] byteArray = dNSInput.readByteArray(eCKeyInfo.length);
        int i10 = eCKeyInfo.length;
        int i11 = byteArray[0] < 0 ? i10 + 1 : i10;
        byte[] byteArray2 = dNSInput.readByteArray(i10);
        int i12 = eCKeyInfo.length;
        if (byteArray2[0] < 0) {
            i12++;
        }
        dNSOutput.writeU8(48);
        dNSOutput.writeU8(i11 + i12 + 4);
        dNSOutput.writeU8(2);
        dNSOutput.writeU8(i11);
        if (i11 > eCKeyInfo.length) {
            dNSOutput.writeU8(0);
        }
        dNSOutput.writeByteArray(byteArray);
        dNSOutput.writeU8(2);
        dNSOutput.writeU8(i12);
        if (i12 > eCKeyInfo.length) {
            dNSOutput.writeU8(0);
        }
        dNSOutput.writeByteArray(byteArray2);
        return dNSOutput.toByteArray();
    }

    private static byte[] ECDSASignaturetoDNS(byte[] bArr, ECKeyInfo eCKeyInfo) throws IOException {
        DNSInput dNSInput = new DNSInput(bArr);
        DNSOutput dNSOutput = new DNSOutput();
        if (dNSInput.readU8() != 48) {
            throw new IOException();
        }
        dNSInput.readU8();
        if (dNSInput.readU8() != 2) {
            throw new IOException();
        }
        int u82 = dNSInput.readU8();
        int i10 = eCKeyInfo.length;
        if (u82 == i10 + 1) {
            if (dNSInput.readU8() != 0) {
                throw new IOException();
            }
        } else if (u82 != i10) {
            throw new IOException();
        }
        dNSOutput.writeByteArray(dNSInput.readByteArray(eCKeyInfo.length));
        if (dNSInput.readU8() != 2) {
            throw new IOException();
        }
        int u83 = dNSInput.readU8();
        int i11 = eCKeyInfo.length;
        if (u83 == i11 + 1) {
            if (dNSInput.readU8() != 0) {
                throw new IOException();
            }
        } else if (u83 != i11) {
            throw new IOException();
        }
        dNSOutput.writeByteArray(dNSInput.readByteArray(eCKeyInfo.length));
        return dNSOutput.toByteArray();
    }

    private static byte[] ECGOSTSignaturefromDNS(byte[] bArr, ECKeyInfo eCKeyInfo) throws IOException, DNSSECException {
        if (bArr.length == eCKeyInfo.length * 2) {
            return bArr;
        }
        throw new SignatureVerificationException();
    }

    public static String algString(int i10) throws UnsupportedAlgorithmException {
        switch (i10) {
            case 1:
                return "MD5withRSA";
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new UnsupportedAlgorithmException(i10);
            case 3:
            case 6:
                return "SHA1withDSA";
            case 5:
            case 7:
                return "SHA1withRSA";
            case 8:
                return "SHA256withRSA";
            case 10:
                return "SHA512withRSA";
            case 12:
                return "GOST3411withECGOST3410";
            case 13:
                return "SHA256withECDSA";
            case 14:
                return "SHA384withECDSA";
        }
    }

    public static void checkAlgorithm(PrivateKey privateKey, int i10) throws UnsupportedAlgorithmException {
        switch (i10) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
                if (!(privateKey instanceof RSAPrivateKey)) {
                    throw new IncompatibleKeyException();
                }
                return;
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new UnsupportedAlgorithmException(i10);
            case 3:
            case 6:
                if (!(privateKey instanceof DSAPrivateKey)) {
                    throw new IncompatibleKeyException();
                }
                return;
            case 12:
            case 13:
            case 14:
                if (!(privateKey instanceof ECPrivateKey)) {
                    throw new IncompatibleKeyException();
                }
                return;
        }
    }

    public static byte[] digestMessage(SIGRecord sIGRecord, Message message, byte[] bArr) {
        DNSOutput dNSOutput = new DNSOutput();
        digestSIG(dNSOutput, sIGRecord);
        if (bArr != null) {
            dNSOutput.writeByteArray(bArr);
        }
        message.toWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public static byte[] digestRRset(RRSIGRecord rRSIGRecord, RRset rRset) {
        DNSOutput dNSOutput = new DNSOutput();
        digestSIG(dNSOutput, rRSIGRecord);
        int size = rRset.size();
        Record[] recordArr = new Record[size];
        Iterator itRrs = rRset.rrs();
        Name name = rRset.getName();
        int labels = rRSIGRecord.getLabels() + 1;
        Name nameWild = name.labels() > labels ? name.wild(name.labels() - labels) : null;
        int i10 = size;
        while (itRrs.hasNext()) {
            i10--;
            recordArr[i10] = (Record) itRrs.next();
        }
        Arrays.sort(recordArr);
        DNSOutput dNSOutput2 = new DNSOutput();
        if (nameWild != null) {
            nameWild.toWireCanonical(dNSOutput2);
        } else {
            name.toWireCanonical(dNSOutput2);
        }
        dNSOutput2.writeU16(rRset.getType());
        dNSOutput2.writeU16(rRset.getDClass());
        dNSOutput2.writeU32(rRSIGRecord.getOrigTTL());
        for (int i11 = 0; i11 < size; i11++) {
            dNSOutput.writeByteArray(dNSOutput2.toByteArray());
            int iCurrent = dNSOutput.current();
            dNSOutput.writeU16(0);
            dNSOutput.writeByteArray(recordArr[i11].rdataToWireCanonical());
            int iCurrent2 = (dNSOutput.current() - iCurrent) - 2;
            dNSOutput.save();
            dNSOutput.jump(iCurrent);
            dNSOutput.writeU16(iCurrent2);
            dNSOutput.restore();
        }
        return dNSOutput.toByteArray();
    }

    private static void digestSIG(DNSOutput dNSOutput, SIGBase sIGBase) {
        dNSOutput.writeU16(sIGBase.getTypeCovered());
        dNSOutput.writeU8(sIGBase.getAlgorithm());
        dNSOutput.writeU8(sIGBase.getLabels());
        dNSOutput.writeU32(sIGBase.getOrigTTL());
        dNSOutput.writeU32(sIGBase.getExpire().getTime() / 1000);
        dNSOutput.writeU32(sIGBase.getTimeSigned().getTime() / 1000);
        dNSOutput.writeU16(sIGBase.getFootprint());
        sIGBase.getSigner().toWireCanonical(dNSOutput);
    }

    private static byte[] fromDSAPublicKey(DSAPublicKey dSAPublicKey) {
        DNSOutput dNSOutput = new DNSOutput();
        BigInteger q10 = dSAPublicKey.getParams().getQ();
        BigInteger p10 = dSAPublicKey.getParams().getP();
        BigInteger g10 = dSAPublicKey.getParams().getG();
        BigInteger y10 = dSAPublicKey.getY();
        int length = (p10.toByteArray().length - 64) / 8;
        dNSOutput.writeU8(length);
        writeBigInteger(dNSOutput, q10);
        writeBigInteger(dNSOutput, p10);
        int i10 = (length * 8) + 64;
        writePaddedBigInteger(dNSOutput, g10, i10);
        writePaddedBigInteger(dNSOutput, y10, i10);
        return dNSOutput.toByteArray();
    }

    private static byte[] fromECDSAPublicKey(ECPublicKey eCPublicKey, ECKeyInfo eCKeyInfo) {
        DNSOutput dNSOutput = new DNSOutput();
        BigInteger affineX = eCPublicKey.getW().getAffineX();
        BigInteger affineY = eCPublicKey.getW().getAffineY();
        writePaddedBigInteger(dNSOutput, affineX, eCKeyInfo.length);
        writePaddedBigInteger(dNSOutput, affineY, eCKeyInfo.length);
        return dNSOutput.toByteArray();
    }

    private static byte[] fromECGOSTPublicKey(ECPublicKey eCPublicKey, ECKeyInfo eCKeyInfo) {
        DNSOutput dNSOutput = new DNSOutput();
        BigInteger affineX = eCPublicKey.getW().getAffineX();
        BigInteger affineY = eCPublicKey.getW().getAffineY();
        writePaddedBigIntegerLittleEndian(dNSOutput, affineX, eCKeyInfo.length);
        writePaddedBigIntegerLittleEndian(dNSOutput, affineY, eCKeyInfo.length);
        return dNSOutput.toByteArray();
    }

    public static byte[] fromPublicKey(PublicKey publicKey, int i10) throws DNSSECException {
        switch (i10) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
                if (publicKey instanceof RSAPublicKey) {
                    return fromRSAPublicKey((RSAPublicKey) publicKey);
                }
                throw new IncompatibleKeyException();
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new UnsupportedAlgorithmException(i10);
            case 3:
            case 6:
                if (publicKey instanceof DSAPublicKey) {
                    return fromDSAPublicKey((DSAPublicKey) publicKey);
                }
                throw new IncompatibleKeyException();
            case 12:
                if (publicKey instanceof ECPublicKey) {
                    return fromECGOSTPublicKey((ECPublicKey) publicKey, GOST);
                }
                throw new IncompatibleKeyException();
            case 13:
                if (publicKey instanceof ECPublicKey) {
                    return fromECDSAPublicKey((ECPublicKey) publicKey, ECDSA_P256);
                }
                throw new IncompatibleKeyException();
            case 14:
                if (publicKey instanceof ECPublicKey) {
                    return fromECDSAPublicKey((ECPublicKey) publicKey, ECDSA_P384);
                }
                throw new IncompatibleKeyException();
        }
    }

    private static byte[] fromRSAPublicKey(RSAPublicKey rSAPublicKey) {
        DNSOutput dNSOutput = new DNSOutput();
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBigIntegerLength = BigIntegerLength(publicExponent);
        if (iBigIntegerLength < 256) {
            dNSOutput.writeU8(iBigIntegerLength);
        } else {
            dNSOutput.writeU8(0);
            dNSOutput.writeU16(iBigIntegerLength);
        }
        writeBigInteger(dNSOutput, publicExponent);
        writeBigInteger(dNSOutput, modulus);
        return dNSOutput.toByteArray();
    }

    public static byte[] generateDSDigest(DNSKEYRecord dNSKEYRecord, int i10) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        try {
            if (i10 == 1) {
                messageDigest = MessageDigest.getInstance("sha-1");
            } else if (i10 == 2) {
                messageDigest = MessageDigest.getInstance("sha-256");
            } else if (i10 == 3) {
                messageDigest = MessageDigest.getInstance("GOST3411");
            } else {
                if (i10 != 4) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("unknown DS digest type ");
                    stringBuffer.append(i10);
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                messageDigest = MessageDigest.getInstance("sha-384");
            }
            messageDigest.update(dNSKEYRecord.getName().toWireCanonical());
            messageDigest.update(dNSKEYRecord.rdataToWireCanonical());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("no message digest support");
        }
    }

    private static boolean matches(SIGBase sIGBase, KEYBase kEYBase) {
        return kEYBase.getAlgorithm() == sIGBase.getAlgorithm() && kEYBase.getFootprint() == sIGBase.getFootprint() && kEYBase.getName().equals(sIGBase.getSigner());
    }

    private static BigInteger readBigInteger(DNSInput dNSInput, int i10) throws IOException {
        return new BigInteger(1, dNSInput.readByteArray(i10));
    }

    private static BigInteger readBigIntegerLittleEndian(DNSInput dNSInput, int i10) throws IOException {
        byte[] byteArray = dNSInput.readByteArray(i10);
        reverseByteArray(byteArray);
        return new BigInteger(1, byteArray);
    }

    private static void reverseByteArray(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int length = (bArr.length - i10) - 1;
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length];
            bArr[length] = b10;
        }
    }

    private static byte[] sign(PrivateKey privateKey, PublicKey publicKey, int i10, byte[] bArr, String str) throws SignatureException, InvalidKeyException, DNSSECException {
        try {
            Signature signature = str != null ? Signature.getInstance(algString(i10), str) : Signature.getInstance(algString(i10));
            signature.initSign(privateKey);
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            if (publicKey instanceof DSAPublicKey) {
                try {
                    return DSASignaturetoDNS(bArrSign, (BigIntegerLength(((DSAPublicKey) publicKey).getParams().getP()) - 64) / 8);
                } catch (IOException unused) {
                    throw new IllegalStateException();
                }
            }
            if (publicKey instanceof ECPublicKey) {
                try {
                    switch (i10) {
                        case 12:
                            break;
                        case 13:
                            return ECDSASignaturetoDNS(bArrSign, ECDSA_P256);
                        case 14:
                            return ECDSASignaturetoDNS(bArrSign, ECDSA_P384);
                        default:
                            throw new UnsupportedAlgorithmException(i10);
                    }
                } catch (IOException unused2) {
                    throw new IllegalStateException();
                }
            }
            return bArrSign;
        } catch (GeneralSecurityException e10) {
            throw new DNSSECException(e10.toString());
        }
    }

    public static SIGRecord signMessage(Message message, SIGRecord sIGRecord, KEYRecord kEYRecord, PrivateKey privateKey, Date date, Date date2) throws DNSSECException {
        int algorithm = kEYRecord.getAlgorithm();
        checkAlgorithm(privateKey, algorithm);
        SIGRecord sIGRecord2 = new SIGRecord(Name.root, 255, 0L, 0, algorithm, 0L, date2, date, kEYRecord.getFootprint(), kEYRecord.getName(), null);
        DNSOutput dNSOutput = new DNSOutput();
        digestSIG(dNSOutput, sIGRecord2);
        if (sIGRecord != null) {
            dNSOutput.writeByteArray(sIGRecord.getSignature());
        }
        dNSOutput.writeByteArray(message.toWire());
        sIGRecord2.setSignature(sign(privateKey, kEYRecord.getPublicKey(), algorithm, dNSOutput.toByteArray(), (String) null));
        return sIGRecord2;
    }

    private static PublicKey toDSAPublicKey(KEYBase kEYBase) throws MalformedKeyException, GeneralSecurityException, IOException {
        DNSInput dNSInput = new DNSInput(kEYBase.getKey());
        int u82 = dNSInput.readU8();
        if (u82 > 8) {
            throw new MalformedKeyException(kEYBase);
        }
        BigInteger bigInteger = readBigInteger(dNSInput, 20);
        int i10 = (u82 * 8) + 64;
        BigInteger bigInteger2 = readBigInteger(dNSInput, i10);
        BigInteger bigInteger3 = readBigInteger(dNSInput, i10);
        return KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(readBigInteger(dNSInput, i10), bigInteger2, bigInteger, bigInteger3));
    }

    private static PublicKey toECDSAPublicKey(KEYBase kEYBase, ECKeyInfo eCKeyInfo) throws MalformedKeyException, GeneralSecurityException, IOException {
        DNSInput dNSInput = new DNSInput(kEYBase.getKey());
        return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(readBigInteger(dNSInput, eCKeyInfo.length), readBigInteger(dNSInput, eCKeyInfo.length)), eCKeyInfo.spec));
    }

    private static PublicKey toECGOSTPublicKey(KEYBase kEYBase, ECKeyInfo eCKeyInfo) throws MalformedKeyException, GeneralSecurityException, IOException {
        DNSInput dNSInput = new DNSInput(kEYBase.getKey());
        return KeyFactory.getInstance("ECGOST3410").generatePublic(new ECPublicKeySpec(new ECPoint(readBigIntegerLittleEndian(dNSInput, eCKeyInfo.length), readBigIntegerLittleEndian(dNSInput, eCKeyInfo.length)), eCKeyInfo.spec));
    }

    public static PublicKey toPublicKey(KEYBase kEYBase) throws DNSSECException {
        int algorithm = kEYBase.getAlgorithm();
        try {
            switch (algorithm) {
                case 1:
                case 5:
                case 7:
                case 8:
                case 10:
                    return toRSAPublicKey(kEYBase);
                case 2:
                case 4:
                case 9:
                case 11:
                default:
                    throw new UnsupportedAlgorithmException(algorithm);
                case 3:
                case 6:
                    return toDSAPublicKey(kEYBase);
                case 12:
                    return toECGOSTPublicKey(kEYBase, GOST);
                case 13:
                    return toECDSAPublicKey(kEYBase, ECDSA_P256);
                case 14:
                    return toECDSAPublicKey(kEYBase, ECDSA_P384);
            }
        } catch (IOException unused) {
            throw new MalformedKeyException(kEYBase);
        } catch (GeneralSecurityException e10) {
            throw new DNSSECException(e10.toString());
        }
    }

    private static PublicKey toRSAPublicKey(KEYBase kEYBase) throws GeneralSecurityException, IOException {
        DNSInput dNSInput = new DNSInput(kEYBase.getKey());
        int u82 = dNSInput.readU8();
        if (u82 == 0) {
            u82 = dNSInput.readU16();
        }
        BigInteger bigInteger = readBigInteger(dNSInput, u82);
        return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(readBigInteger(dNSInput), bigInteger));
    }

    private static byte[] trimByteArray(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        return bArr2;
    }

    private static void verify(PublicKey publicKey, int i10, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, DNSSECException {
        if (publicKey instanceof DSAPublicKey) {
            try {
                bArr2 = DSASignaturefromDNS(bArr2);
            } catch (IOException unused) {
                throw new IllegalStateException();
            }
        } else if (publicKey instanceof ECPublicKey) {
            try {
                switch (i10) {
                    case 12:
                        bArr2 = ECGOSTSignaturefromDNS(bArr2, GOST);
                        break;
                    case 13:
                        bArr2 = ECDSASignaturefromDNS(bArr2, ECDSA_P256);
                        break;
                    case 14:
                        bArr2 = ECDSASignaturefromDNS(bArr2, ECDSA_P384);
                        break;
                    default:
                        throw new UnsupportedAlgorithmException(i10);
                }
            } catch (IOException unused2) {
                throw new IllegalStateException();
            }
        }
        try {
            Signature signature = Signature.getInstance(algString(i10));
            signature.initVerify(publicKey);
            signature.update(bArr);
            if (signature.verify(bArr2)) {
            } else {
                throw new SignatureVerificationException();
            }
        } catch (GeneralSecurityException e10) {
            throw new DNSSECException(e10.toString());
        }
    }

    public static void verifyMessage(Message message, byte[] bArr, SIGRecord sIGRecord, SIGRecord sIGRecord2, KEYRecord kEYRecord) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, DNSSECException {
        if (message.sig0start == 0) {
            throw new NoSignatureException();
        }
        if (!matches(sIGRecord, kEYRecord)) {
            throw new KeyMismatchException(kEYRecord, sIGRecord);
        }
        Date date = new Date();
        if (date.compareTo(sIGRecord.getExpire()) > 0) {
            throw new SignatureExpiredException(sIGRecord.getExpire(), date);
        }
        if (date.compareTo(sIGRecord.getTimeSigned()) < 0) {
            throw new SignatureNotYetValidException(sIGRecord.getTimeSigned(), date);
        }
        DNSOutput dNSOutput = new DNSOutput();
        digestSIG(dNSOutput, sIGRecord);
        if (sIGRecord2 != null) {
            dNSOutput.writeByteArray(sIGRecord2.getSignature());
        }
        Header header = (Header) message.getHeader().clone();
        header.decCount(3);
        dNSOutput.writeByteArray(header.toWire());
        dNSOutput.writeByteArray(bArr, 12, message.sig0start - 12);
        verify(kEYRecord.getPublicKey(), sIGRecord.getAlgorithm(), dNSOutput.toByteArray(), sIGRecord.getSignature());
    }

    private static void writeBigInteger(DNSOutput dNSOutput, BigInteger bigInteger) {
        dNSOutput.writeByteArray(trimByteArray(bigInteger.toByteArray()));
    }

    private static void writePaddedBigInteger(DNSOutput dNSOutput, BigInteger bigInteger, int i10) {
        byte[] bArrTrimByteArray = trimByteArray(bigInteger.toByteArray());
        if (bArrTrimByteArray.length > i10) {
            throw new IllegalArgumentException();
        }
        if (bArrTrimByteArray.length < i10) {
            dNSOutput.writeByteArray(new byte[i10 - bArrTrimByteArray.length]);
        }
        dNSOutput.writeByteArray(bArrTrimByteArray);
    }

    private static void writePaddedBigIntegerLittleEndian(DNSOutput dNSOutput, BigInteger bigInteger, int i10) {
        byte[] bArrTrimByteArray = trimByteArray(bigInteger.toByteArray());
        if (bArrTrimByteArray.length > i10) {
            throw new IllegalArgumentException();
        }
        reverseByteArray(bArrTrimByteArray);
        dNSOutput.writeByteArray(bArrTrimByteArray);
        if (bArrTrimByteArray.length < i10) {
            dNSOutput.writeByteArray(new byte[i10 - bArrTrimByteArray.length]);
        }
    }

    private static BigInteger readBigInteger(DNSInput dNSInput) {
        return new BigInteger(1, dNSInput.readByteArray());
    }

    public static void verify(RRset rRset, RRSIGRecord rRSIGRecord, DNSKEYRecord dNSKEYRecord) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, DNSSECException {
        if (matches(rRSIGRecord, dNSKEYRecord)) {
            Date date = new Date();
            if (date.compareTo(rRSIGRecord.getExpire()) <= 0) {
                if (date.compareTo(rRSIGRecord.getTimeSigned()) >= 0) {
                    verify(dNSKEYRecord.getPublicKey(), rRSIGRecord.getAlgorithm(), digestRRset(rRSIGRecord, rRset), rRSIGRecord.getSignature());
                    return;
                }
                throw new SignatureNotYetValidException(rRSIGRecord.getTimeSigned(), date);
            }
            throw new SignatureExpiredException(rRSIGRecord.getExpire(), date);
        }
        throw new KeyMismatchException(dNSKEYRecord, rRSIGRecord);
    }

    public static RRSIGRecord sign(RRset rRset, DNSKEYRecord dNSKEYRecord, PrivateKey privateKey, Date date, Date date2) throws DNSSECException {
        return sign(rRset, dNSKEYRecord, privateKey, date, date2, null);
    }

    public static RRSIGRecord sign(RRset rRset, DNSKEYRecord dNSKEYRecord, PrivateKey privateKey, Date date, Date date2, String str) throws DNSSECException {
        int algorithm = dNSKEYRecord.getAlgorithm();
        checkAlgorithm(privateKey, algorithm);
        RRSIGRecord rRSIGRecord = new RRSIGRecord(rRset.getName(), rRset.getDClass(), rRset.getTTL(), rRset.getType(), algorithm, rRset.getTTL(), date2, date, dNSKEYRecord.getFootprint(), dNSKEYRecord.getName(), null);
        rRSIGRecord.setSignature(sign(privateKey, dNSKEYRecord.getPublicKey(), algorithm, digestRRset(rRSIGRecord, rRset), str));
        return rRSIGRecord;
    }
}
