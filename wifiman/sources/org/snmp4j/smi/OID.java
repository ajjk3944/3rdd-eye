package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.util.OIDTextFormat;
import org.snmp4j.util.SimpleOIDTextFormat;

/* loaded from: classes2.dex */
public class OID extends AbstractVariable implements AssignableFromString, AssignableFromIntArray {
    public static final int MAX_OID_LEN = 128;
    public static final int MAX_SUBID_VALUE = -1;
    private static final long serialVersionUID = 7521667239352941172L;
    private int[] value;
    private static OIDTextFormat oidTextFormat = new SimpleOIDTextFormat();
    private static final int[] NULL_OID = new int[0];

    public OID() {
        this.value = NULL_OID;
    }

    public static OID max(OID oid, OID oid2) {
        return oid.compareTo((Variable) oid2) >= 0 ? oid : oid2;
    }

    public static OID min(OID oid, OID oid2) {
        return oid.compareTo((Variable) oid2) <= 0 ? oid : oid2;
    }

    private static int[] parseDottedString(String str) {
        try {
            return SNMP4JSettings.getOIDTextFormat().parse(str);
        } catch (ParseException e10) {
            throw new RuntimeException("OID '" + str + "' cannot be parsed", e10);
        }
    }

    public final OID append(String str) {
        return append(new OID(str));
    }

    public final OID appendUnsigned(long j10) {
        return append((int) (j10 & Counter32.MAX_COUNTER32_VALUE));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new OID(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        int[] iArrDecodeOID = BER.decodeOID(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 6) {
            setValue(iArrDecodeOID);
            return;
        }
        throw new IOException("Wrong type encountered when decoding OID: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeOID(outputStream, (byte) 6, this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final boolean equals(Object obj) {
        if (!(obj instanceof OID)) {
            return false;
        }
        OID oid = (OID) obj;
        if (oid.value.length != this.value.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.value;
            if (i10 >= iArr.length) {
                return true;
            }
            if (iArr[i10] != oid.value[i10]) {
                return false;
            }
            i10++;
        }
    }

    public String format() {
        return SNMP4JSettings.getOIDTextFormat().format(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final void fromSubIndex(OID oid, boolean z10) {
        int i10 = !z10 ? 1 : 0;
        setValue(oid.getValue(), i10, oid.size() - i10);
    }

    public final int get(int i10) {
        return this.value[i10];
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        int oIDLength = BER.getOIDLength(this.value);
        return oIDLength + BER.getBERLengthOfLength(oIDLength) + 1;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final int getSyntax() {
        return 6;
    }

    public final long getUnsigned(int i10) {
        return this.value[i10] & Counter32.MAX_COUNTER32_VALUE;
    }

    public final int[] getValue() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return Arrays.hashCode(getValue());
    }

    public boolean isValid() {
        if (size() < 2 || size() > 128) {
            return false;
        }
        int[] iArr = this.value;
        return (((long) iArr[0]) & Counter32.MAX_COUNTER32_VALUE) <= 2 && (((long) iArr[1]) & Counter32.MAX_COUNTER32_VALUE) < 40;
    }

    public final int last() {
        int[] iArr = this.value;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        throw new NoSuchElementException();
    }

    public final long lastUnsigned() {
        if (this.value.length > 0) {
            return r0[r0.length - 1] & Counter32.MAX_COUNTER32_VALUE;
        }
        throw new NoSuchElementException();
    }

    public int leftMostCompare(int i10, OID oid) {
        for (int i11 = 0; i11 < i10 && i11 < this.value.length && i11 < oid.size(); i11++) {
            int i12 = this.value[i11];
            int i13 = oid.value[i11];
            if (i12 != i13) {
                return (((long) i12) & Counter32.MAX_COUNTER32_VALUE) < (Counter32.MAX_COUNTER32_VALUE & ((long) i13)) ? -1 : 1;
            }
        }
        if (i10 > this.value.length) {
            return -1;
        }
        return i10 > oid.size() ? 1 : 0;
    }

    public OID mask(OctetString octetString) {
        int[] iArr = this.value;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i10 = 0; i10 < octetString.length() * 8 && i10 < length; i10++) {
            if ((((byte) (128 >> (i10 % 8))) & octetString.get(i10 / 8)) == 0) {
                iArr2[i10] = 0;
            }
        }
        return new OID(iArr2);
    }

    public final OID nextPeer() {
        OID oid = new OID(this);
        if (oid.size() > 0 && last() != -1) {
            oid.set(oid.size() - 1, last() + 1);
            return oid;
        }
        if (oid.size() <= 1) {
            return oid;
        }
        oid.trim(1);
        return oid.nextPeer();
    }

    public final OID predecessor() {
        if (last() == 0) {
            OID oid = new OID(this);
            oid.removeLast();
            return oid;
        }
        int[] iArr = new int[128];
        int[] iArr2 = this.value;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        Arrays.fill(iArr, this.value.length, 128, -1);
        OID oid2 = new OID(iArr);
        oid2.set(size() - 1, last() - 1);
        return oid2;
    }

    public int removeLast() {
        int[] iArr = this.value;
        if (iArr.length == 0) {
            return -1;
        }
        int[] iArr2 = new int[iArr.length - 1];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length - 1);
        int i10 = this.value[r0.length - 1];
        this.value = iArr2;
        return i10;
    }

    public int rightMostCompare(int i10, OID oid) {
        int length = this.value.length - 1;
        int length2 = oid.value.length - 1;
        int i11 = i10 - 1;
        while (i11 >= 0) {
            int i12 = this.value[length];
            int i13 = oid.value[length2];
            if (i12 != i13) {
                return i12 < i13 ? -1 : 1;
            }
            i11--;
            length--;
            length2--;
        }
        return 0;
    }

    public final void set(int i10, int i11) {
        this.value[i10] = i11;
    }

    @Override // org.snmp4j.smi.AssignableFromString
    public void setValue(String str) {
        this.value = parseDottedString(str);
    }

    public final int size() {
        return this.value.length;
    }

    public boolean startsWith(OID oid) {
        int[] iArr = oid.value;
        int length = iArr.length;
        int[] iArr2 = this.value;
        return length <= iArr2.length && leftMostCompare(Math.min(iArr2.length, iArr.length), oid) == 0;
    }

    public final OID successor() {
        int[] iArr = this.value;
        if (iArr.length != 128) {
            int[] iArr2 = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr2[this.value.length] = 0;
            return new OID(iArr2);
        }
        for (int i10 = BER.MAX_OID_LENGTH; i10 >= 0; i10--) {
            int[] iArr3 = this.value;
            if (iArr3[i10] != -1) {
                int i11 = i10 + 1;
                int[] iArr4 = new int[i11];
                System.arraycopy(iArr3, 0, iArr4, 0, i11);
                iArr4[i10] = iArr4[i10] + 1;
                return new OID(iArr4);
            }
        }
        return new OID();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[this.value.length];
        int i10 = 0;
        while (true) {
            int[] iArr = this.value;
            if (i10 >= iArr.length) {
                return bArr;
            }
            bArr[i10] = (byte) (iArr[i10] & 255);
            i10++;
        }
    }

    public String toDottedString() {
        return oidTextFormat.format(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int toInt() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AssignableFromIntArray
    public int[] toIntArray() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public long toLong() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return SNMP4JSettings.getOIDTextFormat().formatForRoundTrip(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final OID toSubIndex(boolean z10) {
        if (z10) {
            return new OID(this.value);
        }
        OID oid = new OID(new int[]{size()});
        oid.append(this);
        return oid;
    }

    public void trim(int i10) {
        if (i10 > 0) {
            int[] iArr = this.value;
            if (i10 > iArr.length) {
                i10 = iArr.length;
            }
            int[] iArr2 = new int[iArr.length - i10];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length - i10);
            this.value = iArr2;
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public final int compareTo(Variable variable) {
        if (!(variable instanceof OID)) {
            throw new ClassCastException(variable.getClass().getName());
        }
        OID oid = (OID) variable;
        int iLeftMostCompare = leftMostCompare(Math.min(this.value.length, oid.value.length), oid);
        return iLeftMostCompare == 0 ? this.value.length - oid.value.length : iLeftMostCompare;
    }

    @Override // org.snmp4j.smi.AssignableFromIntArray
    public final void setValue(int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("OID value must not be set to null");
        }
        this.value = iArr;
    }

    public OID(String str) {
        this.value = NULL_OID;
        this.value = parseDottedString(str);
    }

    public final OID append(OID oid) {
        int[] iArr = this.value;
        int[] iArr2 = new int[iArr.length + oid.value.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int[] iArr3 = oid.value;
        System.arraycopy(iArr3, 0, iArr2, this.value.length, iArr3.length);
        this.value = iArr2;
        return this;
    }

    private void setValue(int[] iArr, int i10, int i11) {
        int[] iArr2 = new int[i11];
        this.value = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    public OID(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public OID trim() {
        return new OID(this.value, 0, Math.max(r1.length - 1, 0));
    }

    public OID(int[] iArr, int[] iArr2) {
        this.value = NULL_OID;
        int[] iArr3 = new int[iArr.length + iArr2.length];
        this.value = iArr3;
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, this.value, iArr.length, iArr2.length);
    }

    public final OID append(int i10) {
        int[] iArr = this.value;
        int[] iArr2 = new int[iArr.length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        iArr2[this.value.length] = i10;
        this.value = iArr2;
        return this;
    }

    public OID(int[] iArr, int i10) {
        this.value = NULL_OID;
        int[] iArr2 = new int[iArr.length + 1];
        this.value = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.value[iArr.length] = i10;
    }

    public OID(int[] iArr, int i10, int i11) {
        this.value = NULL_OID;
        setValue(iArr, i10, i11);
    }

    public OID(OID oid) {
        this(oid.getValue());
    }
}
