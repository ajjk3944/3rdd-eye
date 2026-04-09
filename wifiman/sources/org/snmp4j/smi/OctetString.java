package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.StringTokenizer;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class OctetString extends AbstractVariable implements AssignableFromByteArray, AssignableFromString {
    private static final char DEFAULT_HEX_DELIMITER = ':';
    private static final long serialVersionUID = 4125661211046256289L;
    private byte[] value;

    public OctetString() {
        this.value = new byte[0];
    }

    public static OctetString fromByteArray(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new OctetString(bArr);
    }

    public static OctetString fromHexString(String str) {
        return fromHexString(str, DEFAULT_HEX_DELIMITER);
    }

    public static OctetString fromHexStringPairs(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        return new OctetString(bArr);
    }

    public static OctetString fromString(String str, char c10, int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "" + c10);
        byte[] bArr = new byte[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i11] = (byte) Integer.parseInt(stringTokenizer.nextToken(), i10);
            i11++;
        }
        return new OctetString(bArr);
    }

    public static Collection<OctetString> split(OctetString octetString, OctetString octetString2) {
        boolean z10;
        LinkedList linkedList = new LinkedList();
        char c10 = 65535;
        int i10 = 0;
        while (i10 < octetString2.length()) {
            int i11 = octetString2.get(i10) & 255;
            if (i11 > c10) {
                c10 = i11 == true ? 1 : 0;
            }
            i10++;
            c10 = c10;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < octetString.length(); i13++) {
            int i14 = octetString.value[i13] & 255;
            if (i14 <= c10) {
                z10 = false;
                for (int i15 = 0; i15 < octetString2.length(); i15++) {
                    if (i14 == (octetString2.get(i15) & 255)) {
                        if (i12 >= 0 && i13 > i12) {
                            linkedList.add(new OctetString(octetString.value, i12, i13 - i12));
                        }
                        z10 = true;
                        i12 = -1;
                    }
                }
            } else {
                z10 = false;
            }
            if (!z10 && i12 < 0) {
                i12 = i13;
            }
        }
        if (i12 >= 0) {
            linkedList.add(new OctetString(octetString.value, i12, octetString.length() - i12));
        }
        return linkedList;
    }

    public void append(byte b10) {
        byte[] bArr = this.value;
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[this.value.length] = b10;
        this.value = bArr2;
    }

    public void clear() {
        this.value = new byte[0];
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new OctetString(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        byte[] bArrDecodeString = BER.decodeString(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 4) {
            setValue(bArrDecodeString);
            return;
        }
        throw new IOException("Wrong type encountered when decoding OctetString: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeString(outputStream, (byte) 4, getValue());
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        if (obj instanceof OctetString) {
            return Arrays.equals(this.value, ((OctetString) obj).value);
        }
        return false;
    }

    public boolean equalsValue(byte[] bArr) {
        return Arrays.equals(this.value, bArr);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        if (z10) {
            setValue(oid.toByteArray());
        } else {
            setValue(new OID(oid.getValue(), 1, oid.size() - 1).toByteArray());
        }
    }

    public final byte get(int i10) {
        return this.value[i10];
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        byte[] bArr = this.value;
        return bArr.length + BER.getBERLengthOfLength(bArr.length) + 1;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        return this.value.length;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 4;
    }

    public byte[] getValue() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return Arrays.hashCode(getValue());
    }

    public boolean isPrintable() {
        int i10;
        for (byte b10 : this.value) {
            char c10 = (char) b10;
            if ((Character.isISOControl(c10) || (c10 & 255) >= 128) && (!Character.isWhitespace(c10) || ((i10 = c10 & 255) >= 28 && i10 <= 31))) {
                return false;
            }
        }
        return true;
    }

    public final int length() {
        return this.value.length;
    }

    public OctetString mask(OctetString octetString) {
        byte[] bArr = this.value;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i10 = 0; i10 < octetString.length() && i10 < length; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] & octetString.get(i10));
        }
        return new OctetString(bArr2);
    }

    public final void set(int i10, byte b10) {
        this.value[i10] = b10;
    }

    @Override // org.snmp4j.smi.AssignableFromString
    public void setValue(String str) {
        setValue(str.getBytes());
    }

    public boolean startsWith(OctetString octetString) {
        if (octetString == null || octetString.length() > length()) {
            return false;
        }
        for (int i10 = 0; i10 < octetString.length(); i10++) {
            if (octetString.get(i10) != this.value[i10]) {
                return false;
            }
        }
        return true;
    }

    public OctetString substring(int i10, int i11) {
        if (i10 < 0 || i11 > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        byte[] bArr = new byte[i12];
        System.arraycopy(this.value, i10, bArr, 0, i12);
        return new OctetString(bArr);
    }

    public String toASCII(char c10) {
        StringBuilder sb2 = new StringBuilder(this.value.length);
        for (byte b10 : this.value) {
            char c11 = (char) b10;
            if (Character.isISOControl(c11) || (b10 & 255) >= 128) {
                sb2.append(c10);
            } else {
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public byte[] toByteArray() {
        return getValue();
    }

    public String toHexString() {
        return toHexString(DEFAULT_HEX_DELIMITER);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int toInt() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public long toLong() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return isPrintable() ? new String(this.value) : toHexString();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        int[] iArr;
        int i10;
        if (z10) {
            iArr = new int[length()];
            i10 = 0;
        } else {
            i10 = 1;
            iArr = new int[length() + 1];
            iArr[0] = length();
        }
        for (int i11 = 0; i11 < length(); i11++) {
            iArr[i10 + i11] = get(i11) & 255;
        }
        return new OID(iArr);
    }

    public static OctetString fromHexString(String str, char c10) {
        return fromString(str, c10, 16);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        if (!(variable instanceof OctetString)) {
            throw new ClassCastException(variable.getClass().getName());
        }
        OctetString octetString = (OctetString) variable;
        int iMin = Math.min(this.value.length, octetString.value.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = this.value[i10];
            byte b11 = octetString.value[i10];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255) ? -1 : 1;
            }
        }
        return this.value.length - octetString.value.length;
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public void setValue(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("OctetString must not be assigned a null value");
        }
        this.value = bArr;
    }

    public String toHexString(char c10) {
        return toString(c10, 16);
    }

    public OctetString(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public OctetString(byte[] bArr, int i10, int i11) {
        this.value = new byte[0];
        byte[] bArr2 = new byte[i11];
        this.value = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public String toString(char c10, int i10) {
        int iRound = (int) Math.round(((float) Math.log(256.0d)) / Math.log(i10));
        StringBuilder sb2 = new StringBuilder(this.value.length * (iRound + 1));
        for (int i11 = 0; i11 < this.value.length; i11++) {
            if (i11 > 0) {
                sb2.append(c10);
            }
            String string = Integer.toString(this.value[i11] & 255, i10);
            for (int i12 = 0; i12 < iRound - string.length(); i12++) {
                sb2.append('0');
            }
            sb2.append(string);
        }
        return sb2.toString();
    }

    public void append(byte[] bArr) {
        byte[] bArr2 = this.value;
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.value.length, bArr.length);
        this.value = bArr3;
    }

    public OctetString(byte[] bArr, byte[] bArr2) {
        this.value = new byte[0];
        if (bArr2 == null) {
            this.value = new byte[bArr.length];
        } else {
            this.value = new byte[bArr.length + bArr2.length];
        }
        System.arraycopy(bArr, 0, this.value, 0, bArr.length);
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, this.value, bArr.length, bArr2.length);
        }
    }

    public static OctetString fromString(String str, int i10) {
        int iRound = (int) Math.round(((float) Math.log(256.0d)) / Math.log(i10));
        byte[] bArr = new byte[str.length() / iRound];
        int i11 = 0;
        while (i11 < str.length()) {
            int i12 = i11 + iRound;
            bArr[i11 / iRound] = (byte) Integer.parseInt(str.substring(i11, i12), i10);
            i11 = i12;
        }
        return new OctetString(bArr);
    }

    public void append(OctetString octetString) {
        append(octetString.getValue());
    }

    public void append(String str) {
        append(str.getBytes());
    }

    public OctetString(String str) {
        this.value = new byte[0];
        this.value = str.getBytes();
    }

    public String toString(int i10) {
        int iRound = (int) Math.round(((float) Math.log(256.0d)) / Math.log(i10));
        StringBuilder sb2 = new StringBuilder(this.value.length * (iRound + 1));
        for (byte b10 : this.value) {
            String string = Integer.toString(b10 & 255, i10);
            for (int i11 = 0; i11 < iRound - string.length(); i11++) {
                sb2.append('0');
            }
            sb2.append(string);
        }
        return sb2.toString();
    }

    public OctetString(OctetString octetString) {
        this.value = new byte[0];
        append(octetString);
    }
}
