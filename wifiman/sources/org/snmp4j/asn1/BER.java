package org.snmp4j.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.snmp4j.smi.Counter32;

/* loaded from: classes2.dex */
public class BER {
    public static final byte ASN_APPLICATION = 64;
    public static final byte ASN_BIT8 = -128;
    public static final byte ASN_BIT_STR = 3;
    public static final byte ASN_BOOLEAN = 1;
    public static final byte ASN_CONSTRUCTOR = 32;
    public static final byte ASN_CONTEXT = -128;
    public static final byte ASN_EXTENSION_ID = 31;
    public static final byte ASN_INTEGER = 2;
    public static final byte ASN_LONG_LEN = -128;
    public static final byte ASN_NULL = 5;
    public static final byte ASN_OBJECT_ID = 6;
    public static final byte ASN_OCTET_STR = 4;
    public static final byte ASN_PRIMITIVE = 0;
    public static final byte ASN_PRIVATE = -64;
    public static final byte ASN_SEQUENCE = 16;
    public static final byte ASN_SET = 17;
    public static final byte ASN_UNIVERSAL = 0;
    public static final byte BITSTRING = 3;
    public static final byte COUNTER = 65;
    public static final byte COUNTER32 = 65;
    public static final byte COUNTER64 = 70;
    public static final int ENDOFMIBVIEW = 130;
    public static final byte GAUGE = 66;
    public static final byte GAUGE32 = 66;
    public static final byte INTEGER = 2;
    public static final byte INTEGER32 = 2;
    public static final byte IPADDRESS = 64;
    private static final int LENMASK = 255;
    public static final int MAX_OID_LENGTH = 127;
    public static final int NOSUCHINSTANCE = 129;
    public static final int NOSUCHOBJECT = 128;
    public static final byte NULL = 5;
    public static final byte OCTETSTRING = 4;
    public static final byte OID = 6;
    public static final byte OPAQUE = 68;
    public static final byte SEQUENCE = 48;
    public static final byte TIMETICKS = 67;
    private static boolean checkFirstSubID012 = true;
    private static boolean checkSequenceLength = true;
    private static boolean checkValueLength = true;

    private static void checkLength(BERInputStream bERInputStream, int i10) throws IOException {
        if (checkValueLength) {
            if (i10 < 0 || i10 > bERInputStream.getAvailableBytes()) {
                throw new IOException("The encoded length " + i10 + " exceeds the number of bytes left in input" + getPositionMessage(bERInputStream) + " which actually is " + bERInputStream.getAvailableBytes());
            }
        }
    }

    public static void checkSequenceLength(int i10, BERSerializable bERSerializable) throws IOException {
        if (!isCheckSequenceLength() || i10 == bERSerializable.getBERPayloadLength()) {
            return;
        }
        throw new IOException("The actual length of the SEQUENCE object " + bERSerializable.getClass().getName() + " is " + bERSerializable.getBERPayloadLength() + ", but " + i10 + " was expected");
    }

    public static BigInteger decodeBigInteger(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        mutableByte.setValue((byte) bERInputStream.read());
        if (mutableByte.value != 2) {
            throw new IOException("Wrong ASN.1 type. Not an INTEGER: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        if (iDecodeLength < 0) {
            throw new IOException("Length greater than 2147483647 are not supported  for integers: " + getPositionMessage(bERInputStream));
        }
        byte[] bArr = new byte[iDecodeLength];
        int i10 = bERInputStream.read(bArr);
        if (i10 == iDecodeLength) {
            return new BigInteger(bArr);
        }
        throw new IOException("Length of INTEGER (" + iDecodeLength + ") is greater than number of bytes left in BER stream: " + i10);
    }

    public static int decodeHeader(BERInputStream bERInputStream, MutableByte mutableByte, boolean z10) throws IOException {
        byte b10 = (byte) bERInputStream.read();
        if ((b10 & ASN_EXTENSION_ID) != 31) {
            mutableByte.setValue(b10);
            return decodeLength(bERInputStream, z10);
        }
        throw new IOException("Cannot process extension IDs" + getPositionMessage(bERInputStream));
    }

    public static int decodeInteger(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        mutableByte.setValue((byte) bERInputStream.read());
        byte b10 = mutableByte.value;
        if (b10 != 2 && b10 != 67 && b10 != 65) {
            throw new IOException("Wrong ASN.1 type. Not an integer: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        if (iDecodeLength > 4) {
            throw new IOException("Length greater than 32bit are not supported  for integers: " + getPositionMessage(bERInputStream));
        }
        int i10 = bERInputStream.read();
        int i11 = i10 & LENMASK;
        int i12 = (i10 & 128) > 0 ? -1 : 0;
        while (true) {
            int i13 = iDecodeLength - 1;
            if (iDecodeLength <= 0) {
                return i12;
            }
            i12 = (i12 << 8) | i11;
            if (i13 > 0) {
                i11 = bERInputStream.read();
            }
            iDecodeLength = i13;
        }
    }

    public static int decodeLength(BERInputStream bERInputStream) throws IOException {
        return decodeLength(bERInputStream, true);
    }

    public static void decodeNull(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        mutableByte.setValue((byte) (bERInputStream.read() & LENMASK));
        byte b10 = mutableByte.value;
        if (b10 != 5 && b10 != -128 && b10 != -127 && b10 != -126) {
            throw new IOException("Wrong ASN.1 type. Is not null: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        if (iDecodeLength == 0) {
            return;
        }
        throw new IOException("Invalid Null encoding, length is not zero: " + iDecodeLength + getPositionMessage(bERInputStream));
    }

    public static int[] decodeOID(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        int i10;
        mutableByte.setValue((byte) bERInputStream.read());
        if (mutableByte.value != 6) {
            throw new IOException("Wrong type. Not an OID: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        int[] iArr = new int[iDecodeLength + 2];
        if (iDecodeLength == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int i11 = 1;
        while (iDecodeLength > 0) {
            int i12 = 0;
            do {
                i10 = bERInputStream.read();
                if (i10 < 0) {
                    throw new IOException("Unexpected end of input stream" + getPositionMessage(bERInputStream));
                }
                i12 = (i12 << 7) + (i10 & MAX_OID_LENGTH);
                iDecodeLength--;
                if (iDecodeLength > 0) {
                }
                iArr[i11] = i12;
                i11++;
            } while ((i10 & 128) != 0);
            iArr[i11] = i12;
            i11++;
        }
        int i13 = iArr[1];
        if (i13 == 43) {
            iArr[0] = 1;
            iArr[1] = 3;
        } else if (i13 < 0 || i13 >= 80) {
            iArr[0] = 2;
            iArr[1] = i13 - 80;
        } else if (i13 < 40) {
            iArr[0] = 0;
            iArr[1] = i13;
        } else {
            iArr[0] = 1;
            iArr[1] = i13 - 40;
        }
        if (i11 < 2) {
            i11 = 2;
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }

    public static byte[] decodeString(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        int i10;
        mutableByte.setValue((byte) bERInputStream.read());
        byte b10 = mutableByte.value;
        if (b10 != 4 && b10 != 36 && b10 != 64 && b10 != 68 && b10 != 3 && b10 != 69) {
            throw new IOException("Wrong ASN.1 type. Not a string: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        byte[] bArr = new byte[iDecodeLength];
        if (iDecodeLength <= 0 || ((i10 = bERInputStream.read(bArr, 0, iDecodeLength)) >= 0 && i10 >= iDecodeLength)) {
            return bArr;
        }
        throw new IOException("Wrong string length " + i10 + " < " + iDecodeLength);
    }

    public static long decodeUnsignedInt64(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        mutableByte.setValue((byte) bERInputStream.read());
        byte b10 = mutableByte.value;
        if (b10 != 2 && b10 != 70) {
            throw new IOException("Wrong type. Not an integer 64: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        int i10 = bERInputStream.read() & LENMASK;
        if (iDecodeLength > 9) {
            throw new IOException("Invalid 64bit unsigned integer length: " + iDecodeLength + getPositionMessage(bERInputStream));
        }
        if (i10 == 0) {
            if (iDecodeLength > 1) {
                i10 = bERInputStream.read();
            }
            iDecodeLength--;
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < iDecodeLength) {
            j10 = (j10 << 8) | (i10 & LENMASK);
            i11++;
            if (i11 < iDecodeLength) {
                i10 = bERInputStream.read();
            }
        }
        return j10;
    }

    public static long decodeUnsignedInteger(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        mutableByte.setValue((byte) bERInputStream.read());
        byte b10 = mutableByte.value;
        if (b10 != 2 && b10 != 67 && b10 != 65 && b10 != 66 && b10 != 71) {
            throw new IOException("Wrong ASN.1 type. Not an unsigned integer: " + ((int) mutableByte.value) + getPositionMessage(bERInputStream));
        }
        int iDecodeLength = decodeLength(bERInputStream);
        int i10 = bERInputStream.read();
        if (iDecodeLength > 5 || (iDecodeLength > 4 && i10 != 0)) {
            throw new IOException("Only 32bit unsigned integers are supported" + getPositionMessage(bERInputStream));
        }
        if (i10 == 0) {
            if (iDecodeLength > 1) {
                i10 = bERInputStream.read();
            }
            iDecodeLength--;
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < iDecodeLength) {
            j10 = (j10 << 8) | (i10 & LENMASK);
            i11++;
            if (i11 < iDecodeLength) {
                i10 = bERInputStream.read();
            }
        }
        return j10;
    }

    public static void encodeBigInteger(OutputStream outputStream, byte b10, BigInteger bigInteger) throws IOException {
        byte[] byteArray = bigInteger.toByteArray();
        encodeHeader(outputStream, b10, byteArray.length);
        outputStream.write(byteArray);
    }

    public static void encodeHeader(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(i10);
        encodeLength(outputStream, i11);
    }

    public static void encodeInteger(OutputStream outputStream, byte b10, int i10) throws IOException {
        int i11 = 4;
        while (true) {
            int i12 = i10 & (-8388608);
            if ((i12 != 0 && i12 != -8388608) || i11 <= 1) {
                break;
            }
            i11--;
            i10 <<= 8;
        }
        encodeHeader(outputStream, b10, i11);
        while (true) {
            int i13 = i11 - 1;
            if (i11 <= 0) {
                return;
            }
            outputStream.write(((-16777216) & i10) >> 24);
            i10 <<= 8;
            i11 = i13;
        }
    }

    public static void encodeLength(OutputStream outputStream, int i10) throws IOException {
        if (i10 < 0) {
            outputStream.write(-124);
            outputStream.write((i10 >> 24) & LENMASK);
            outputStream.write((i10 >> 16) & LENMASK);
            outputStream.write((i10 >> 8) & LENMASK);
            outputStream.write(i10 & LENMASK);
            return;
        }
        if (i10 < 128) {
            outputStream.write(i10);
            return;
        }
        if (i10 <= LENMASK) {
            outputStream.write(-127);
            outputStream.write(i10);
            return;
        }
        if (i10 <= 65535) {
            outputStream.write(-126);
            outputStream.write((i10 >> 8) & LENMASK);
            outputStream.write(i10 & LENMASK);
        } else {
            if (i10 <= 16777215) {
                outputStream.write(-125);
                outputStream.write((i10 >> 16) & LENMASK);
                outputStream.write((i10 >> 8) & LENMASK);
                outputStream.write(i10 & LENMASK);
                return;
            }
            outputStream.write(-124);
            outputStream.write((i10 >> 24) & LENMASK);
            outputStream.write((i10 >> 16) & LENMASK);
            outputStream.write((i10 >> 8) & LENMASK);
            outputStream.write(i10 & LENMASK);
        }
    }

    public static void encodeOID(OutputStream outputStream, byte b10, int[] iArr) throws IOException {
        encodeHeader(outputStream, b10, getOIDLength(iArr));
        int length = iArr.length;
        int i10 = 0;
        int i11 = 2;
        if (iArr.length < 2) {
            outputStream.write(0);
            i11 = 0;
        } else {
            int i12 = iArr[0];
            if (checkFirstSubID012 && (i12 < 0 || i12 > 2)) {
                throw new IOException("Invalid first sub-identifier (must be 0, 1, or 2)");
            }
            encodeSubID(outputStream, iArr[1] + (i12 * 40));
            i10 = length - 2;
        }
        while (true) {
            int i13 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            encodeSubID(outputStream, iArr[i11]);
            i11++;
            i10 = i13;
        }
    }

    public static void encodeSequence(OutputStream outputStream, byte b10, int i10) throws IOException {
        outputStream.write(b10);
        encodeLength(outputStream, i10);
    }

    public static void encodeString(OutputStream outputStream, byte b10, byte[] bArr) throws IOException {
        encodeHeader(outputStream, b10, bArr.length);
        outputStream.write(bArr);
    }

    private static void encodeSubID(OutputStream outputStream, int i10) throws IOException {
        long j10 = i10 & Counter32.MAX_COUNTER32_VALUE;
        if (j10 < 127) {
            outputStream.write(((int) j10) & LENMASK);
            return;
        }
        long j11 = 127;
        long j12 = 127;
        long j13 = 0;
        long j14 = 0;
        while (j11 != 0) {
            if ((j10 & j11) > 0) {
                j12 = j11;
                j14 = j13;
            }
            j11 <<= 7;
            j13 += 7;
        }
        while (j12 != 127) {
            if (j12 == 31457280) {
                j12 = 266338304;
            }
            outputStream.write((int) (((j10 & j12) >> ((int) j14)) | (-128)));
            j12 >>= 7;
            j14 -= 7;
        }
        outputStream.write((int) (j10 & j12));
    }

    public static void encodeUnsignedInt64(OutputStream outputStream, byte b10, long j10) throws IOException {
        int i10 = 8;
        while (i10 > 1 && ((j10 >> ((i10 - 1) * 8)) & 255) == 0) {
            i10--;
        }
        if (((j10 >> ((i10 - 1) * 8)) & 128) != 0) {
            i10++;
        }
        encodeHeader(outputStream, b10, i10);
        if (i10 == 9) {
            outputStream.write(0);
            i10--;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            outputStream.write((int) (j10 >> ((((i10 - 1) - i11) * 8) & LENMASK)));
        }
    }

    public static void encodeUnsignedInteger(OutputStream outputStream, byte b10, long j10) throws IOException {
        int i10 = ((j10 >> 24) & 255) != 0 ? 4 : ((j10 >> 16) & 255) != 0 ? 3 : (255 & (j10 >> 8)) != 0 ? 2 : 1;
        if (((j10 >> ((i10 - 1) * 8)) & 128) != 0) {
            i10++;
        }
        encodeHeader(outputStream, b10, i10);
        if (i10 != 5) {
            for (int i11 = 0; i11 < i10; i11++) {
                outputStream.write((int) (j10 >> ((((i10 - 1) - i11) * 8) & LENMASK)));
            }
        } else {
            outputStream.write(0);
            for (int i12 = 1; i12 < i10; i12++) {
                outputStream.write((int) (j10 >> (((4 - i12) * 8) & LENMASK)));
            }
        }
    }

    public static int getBERLengthOfLength(int i10) {
        if (i10 < 0) {
            return 5;
        }
        if (i10 < 128) {
            return 1;
        }
        if (i10 <= LENMASK) {
            return 2;
        }
        if (i10 <= 65535) {
            return 3;
        }
        return i10 <= 16777215 ? 4 : 5;
    }

    public static int getBigIntegerBERLength(BigInteger bigInteger) {
        int length = bigInteger.toByteArray().length;
        return length + getBERLengthOfLength(length) + 1;
    }

    public static int getOIDLength(int[] iArr) {
        int subIDLength = iArr.length > 1 ? getSubIDLength((iArr[0] * 40) + iArr[1]) : 1;
        for (int i10 = 2; i10 < iArr.length; i10++) {
            subIDLength += getSubIDLength(iArr[i10]);
        }
        return subIDLength;
    }

    private static String getPositionMessage(BERInputStream bERInputStream) {
        return " at position " + bERInputStream.getPosition();
    }

    private static int getSubIDLength(int i10) {
        long j10 = i10 & Counter32.MAX_COUNTER32_VALUE;
        if (j10 < 128) {
            return 1;
        }
        if (j10 < 16384) {
            return 2;
        }
        if (j10 < 2097152) {
            return 3;
        }
        return j10 < 268435456 ? 4 : 5;
    }

    public static boolean isCheckFirstSubID012() {
        return checkFirstSubID012;
    }

    public static boolean isCheckSequenceLength() {
        return checkSequenceLength;
    }

    public static void setCheckFirstSubID012(boolean z10) {
        checkFirstSubID012 = z10;
    }

    public static void setCheckSequenceLength(boolean z10) {
        checkSequenceLength = z10;
    }

    public boolean isCheckValueLength() {
        return checkValueLength;
    }

    public void setCheckValueLength(boolean z10) {
        checkValueLength = z10;
    }

    public static class MutableByte {
        byte value = 0;

        public MutableByte() {
        }

        public byte getValue() {
            return this.value;
        }

        public void setValue(byte b10) {
            this.value = b10;
        }

        public MutableByte(byte b10) {
            setValue(b10);
        }
    }

    public static int decodeLength(BERInputStream bERInputStream, boolean z10) throws IOException {
        int i10;
        int i11 = bERInputStream.read();
        if ((i11 & (-128)) > 0) {
            int i12 = i11 & MAX_OID_LENGTH;
            if (i12 == 0) {
                throw new IOException("Indefinite lengths are not supported");
            }
            if (i12 > 4) {
                throw new IOException("Data length > 4 bytes are not supported!");
            }
            i10 = 0;
            for (int i13 = 0; i13 < i12; i13++) {
                i10 |= (bERInputStream.read() & LENMASK) << (((i12 - 1) - i13) * 8);
            }
            if (i10 < 0) {
                throw new IOException("SNMP does not support data lengths > 2^31");
            }
        } else {
            i10 = i11 & LENMASK;
        }
        if (z10) {
            checkLength(bERInputStream, i10);
        }
        return i10;
    }

    public static void encodeHeader(OutputStream outputStream, int i10, int i11, int i12) throws IOException {
        outputStream.write(i10);
        encodeLength(outputStream, i11, i12);
    }

    public static void checkSequenceLength(int i10, int i11, BERSerializable bERSerializable) throws IOException {
        if (!isCheckSequenceLength() || i10 == i11) {
            return;
        }
        throw new IOException("The actual length of the SEQUENCE object " + bERSerializable.getClass().getName() + " is " + i11 + ", but " + i10 + " was expected");
    }

    public static int decodeHeader(BERInputStream bERInputStream, MutableByte mutableByte) throws IOException {
        return decodeHeader(bERInputStream, mutableByte, true);
    }

    public static void encodeLength(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(i11 | (-128));
        for (int i12 = (i11 - 1) * 8; i12 >= 0; i12 -= 8) {
            outputStream.write((i10 >> i12) & LENMASK);
        }
    }
}
