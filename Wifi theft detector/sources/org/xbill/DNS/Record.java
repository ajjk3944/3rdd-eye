package org.xbill.DNS;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import org.xbill.DNS.Tokenizer;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public abstract class Record implements Cloneable, Comparable, Serializable {
    private static final DecimalFormat byteFormat;
    private static final long serialVersionUID = 2694906050116005466L;
    protected int dclass;
    protected Name name;
    protected long ttl;
    protected int type;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        byteFormat = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    public Record() {
    }

    public static byte[] byteArrayFromString(String str) throws TextParseException {
        byte[] bytes = str.getBytes();
        for (byte b10 : bytes) {
            if (b10 == 92) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i10 = 0;
                boolean z10 = false;
                int i11 = 0;
                for (byte b11 : bytes) {
                    if (z10) {
                        if (b11 >= 48 && b11 <= 57 && i10 < 3) {
                            i10++;
                            i11 = (i11 * 10) + (b11 - 48);
                            if (i11 > 255) {
                                throw new TextParseException("bad escape");
                            }
                            if (i10 >= 3) {
                                b11 = (byte) i11;
                            }
                        } else if (i10 > 0 && i10 < 3) {
                            throw new TextParseException("bad escape");
                        }
                        byteArrayOutputStream.write(b11);
                        z10 = false;
                    } else if (b11 == 92) {
                        z10 = true;
                        i10 = 0;
                        i11 = 0;
                    } else {
                        byteArrayOutputStream.write(b11);
                    }
                }
                if (i10 > 0 && i10 < 3) {
                    throw new TextParseException("bad escape");
                }
                if (byteArrayOutputStream.toByteArray().length <= 255) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new TextParseException("text string too long");
            }
        }
        if (bytes.length <= 255) {
            return bytes;
        }
        throw new TextParseException("text string too long");
    }

    public static String byteArrayToString(byte[] bArr, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z10) {
            stringBuffer.append('\"');
        }
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 32 || i10 >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(byteFormat.format(i10));
            } else if (i10 == 34 || i10 == 92) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i10);
            } else {
                stringBuffer.append((char) i10);
            }
        }
        if (z10) {
            stringBuffer.append('\"');
        }
        return stringBuffer.toString();
    }

    public static byte[] checkByteArrayLength(String str, byte[] bArr, int i10) {
        if (bArr.length <= 65535) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\" array ");
        stringBuffer.append("must have no more than ");
        stringBuffer.append(i10);
        stringBuffer.append(" elements");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static Name checkName(String str, Name name) {
        if (name.isAbsolute()) {
            return name;
        }
        throw new RelativeNameException(name);
    }

    public static int checkU16(String str, int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return i10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\" ");
        stringBuffer.append(i10);
        stringBuffer.append(" must be an unsigned 16 ");
        stringBuffer.append("bit value");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static long checkU32(String str, long j10) {
        if (j10 >= 0 && j10 <= 4294967295L) {
            return j10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\" ");
        stringBuffer.append(j10);
        stringBuffer.append(" must be an unsigned 32 ");
        stringBuffer.append("bit value");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int checkU8(String str, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return i10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\" ");
        stringBuffer.append(i10);
        stringBuffer.append(" must be an unsigned 8 ");
        stringBuffer.append("bit value");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static Record fromString(Name name, int i10, int i11, long j10, Tokenizer tokenizer, Name name2) throws IOException {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        Type.check(i10);
        DClass.check(i11);
        TTL.check(j10);
        Tokenizer.Token token = tokenizer.get();
        if (token.type == 3 && token.value.equals("\\#")) {
            int uInt16 = tokenizer.getUInt16();
            byte[] hex = tokenizer.getHex();
            if (hex == null) {
                hex = new byte[0];
            }
            if (uInt16 == hex.length) {
                return newRecord(name, i10, i11, j10, uInt16, new DNSInput(hex));
            }
            throw tokenizer.exception("invalid unknown RR encoding: length mismatch");
        }
        tokenizer.unget();
        Record emptyRecord = getEmptyRecord(name, i10, i11, j10, true);
        emptyRecord.rdataFromString(tokenizer, name2);
        int i12 = tokenizer.get().type;
        if (i12 == 1 || i12 == 0) {
            return emptyRecord;
        }
        throw tokenizer.exception("unexpected tokens at end of record");
    }

    public static Record fromWire(DNSInput dNSInput, int i10, boolean z10) throws IOException {
        Name name = new Name(dNSInput);
        int u16 = dNSInput.readU16();
        int u162 = dNSInput.readU16();
        if (i10 == 0) {
            return newRecord(name, u16, u162);
        }
        long u32 = dNSInput.readU32();
        int u163 = dNSInput.readU16();
        return (u163 == 0 && z10 && (i10 == 1 || i10 == 2)) ? newRecord(name, u16, u162, u32) : newRecord(name, u16, u162, u32, u163, dNSInput);
    }

    private static final Record getEmptyRecord(Name name, int i10, int i11, long j10, boolean z10) {
        Record emptyRecord;
        if (z10) {
            Record proto = Type.getProto(i10);
            emptyRecord = proto != null ? proto.getObject() : new UNKRecord();
        } else {
            emptyRecord = new EmptyRecord();
        }
        emptyRecord.name = name;
        emptyRecord.type = i10;
        emptyRecord.dclass = i11;
        emptyRecord.ttl = j10;
        return emptyRecord;
    }

    private static Record newRecord(Name name, int i10, int i11, long j10, int i12, DNSInput dNSInput) throws IOException {
        Record emptyRecord = getEmptyRecord(name, i10, i11, j10, dNSInput != null);
        if (dNSInput == null) {
            return emptyRecord;
        }
        if (dNSInput.remaining() < i12) {
            throw new WireParseException("truncated record");
        }
        dNSInput.setActive(i12);
        emptyRecord.rrFromWire(dNSInput);
        if (dNSInput.remaining() > 0) {
            throw new WireParseException("invalid record length");
        }
        dNSInput.clearActive();
        return emptyRecord;
    }

    private void toWireCanonical(DNSOutput dNSOutput, boolean z10) {
        this.name.toWireCanonical(dNSOutput);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (z10) {
            dNSOutput.writeU32(0L);
        } else {
            dNSOutput.writeU32(this.ttl);
        }
        int iCurrent = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, null, true);
        dNSOutput.writeU16At((dNSOutput.current() - iCurrent) - 2, iCurrent);
    }

    public static String unknownToString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\\# ");
        stringBuffer.append(bArr.length);
        stringBuffer.append(" ");
        stringBuffer.append(base16.toString(bArr));
        return stringBuffer.toString();
    }

    public Record cloneRecord() {
        try {
            return (Record) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Record record = (Record) obj;
        if (this == record) {
            return 0;
        }
        int iCompareTo = this.name.compareTo(record.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i10 = this.dclass - record.dclass;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.type - record.type;
        if (i11 != 0) {
            return i11;
        }
        byte[] bArrRdataToWireCanonical = rdataToWireCanonical();
        byte[] bArrRdataToWireCanonical2 = record.rdataToWireCanonical();
        for (int i12 = 0; i12 < bArrRdataToWireCanonical.length && i12 < bArrRdataToWireCanonical2.length; i12++) {
            int i13 = (bArrRdataToWireCanonical[i12] & 255) - (bArrRdataToWireCanonical2[i12] & 255);
            if (i13 != 0) {
                return i13;
            }
        }
        return bArrRdataToWireCanonical.length - bArrRdataToWireCanonical2.length;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Record)) {
            Record record = (Record) obj;
            if (this.type == record.type && this.dclass == record.dclass && this.name.equals(record.name)) {
                return Arrays.equals(rdataToWireCanonical(), record.rdataToWireCanonical());
            }
        }
        return false;
    }

    public Name getAdditionalName() {
        return null;
    }

    public int getDClass() {
        return this.dclass;
    }

    public Name getName() {
        return this.name;
    }

    public abstract Record getObject();

    public int getRRsetType() {
        int i10 = this.type;
        return i10 == 46 ? ((RRSIGRecord) this).getTypeCovered() : i10;
    }

    public long getTTL() {
        return this.ttl;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = 0;
        for (byte b10 : toWireCanonical(true)) {
            i10 += (i10 << 3) + (b10 & 255);
        }
        return i10;
    }

    public abstract void rdataFromString(Tokenizer tokenizer, Name name) throws IOException;

    public String rdataToString() {
        return rrToString();
    }

    public byte[] rdataToWireCanonical() {
        DNSOutput dNSOutput = new DNSOutput();
        rrToWire(dNSOutput, null, true);
        return dNSOutput.toByteArray();
    }

    public abstract void rrFromWire(DNSInput dNSInput) throws IOException;

    public abstract String rrToString();

    public abstract void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10);

    public boolean sameRRset(Record record) {
        return getRRsetType() == record.getRRsetType() && this.dclass == record.dclass && this.name.equals(record.name);
    }

    public void setTTL(long j10) {
        this.ttl = j10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        if (Options.check("BINDTTL")) {
            stringBuffer.append(TTL.format(this.ttl));
        } else {
            stringBuffer.append(this.ttl);
        }
        stringBuffer.append("\t");
        if (this.dclass != 1 || !Options.check("noPrintIN")) {
            stringBuffer.append(DClass.string(this.dclass));
            stringBuffer.append("\t");
        }
        stringBuffer.append(Type.string(this.type));
        String strRrToString = rrToString();
        if (!strRrToString.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(strRrToString);
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput, int i10, Compression compression) {
        this.name.toWire(dNSOutput, compression);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (i10 == 0) {
            return;
        }
        dNSOutput.writeU32(this.ttl);
        int iCurrent = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, compression, false);
        dNSOutput.writeU16At((dNSOutput.current() - iCurrent) - 2, iCurrent);
    }

    public Record withDClass(int i10, long j10) {
        Record recordCloneRecord = cloneRecord();
        recordCloneRecord.dclass = i10;
        recordCloneRecord.ttl = j10;
        return recordCloneRecord;
    }

    public Record withName(Name name) {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        Record recordCloneRecord = cloneRecord();
        recordCloneRecord.name = name;
        return recordCloneRecord;
    }

    public Record(Name name, int i10, int i11, long j10) {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        Type.check(i10);
        DClass.check(i11);
        TTL.check(j10);
        this.name = name;
        this.type = i10;
        this.dclass = i11;
        this.ttl = j10;
    }

    public static Record fromWire(DNSInput dNSInput, int i10) throws IOException {
        return fromWire(dNSInput, i10, false);
    }

    public static Record newRecord(Name name, int i10, int i11, long j10, int i12, byte[] bArr) {
        if (name.isAbsolute()) {
            Type.check(i10);
            DClass.check(i11);
            TTL.check(j10);
            try {
                return newRecord(name, i10, i11, j10, i12, bArr != null ? new DNSInput(bArr) : null);
            } catch (IOException unused) {
                return null;
            }
        }
        throw new RelativeNameException(name);
    }

    public static Record fromWire(byte[] bArr, int i10) throws IOException {
        return fromWire(new DNSInput(bArr), i10, false);
    }

    public byte[] toWire(int i10) {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, i10, null);
        return dNSOutput.toByteArray();
    }

    private byte[] toWireCanonical(boolean z10) {
        DNSOutput dNSOutput = new DNSOutput();
        toWireCanonical(dNSOutput, z10);
        return dNSOutput.toByteArray();
    }

    public byte[] toWireCanonical() {
        return toWireCanonical(false);
    }

    public static Record newRecord(Name name, int i10, int i11, long j10, byte[] bArr) {
        return newRecord(name, i10, i11, j10, bArr.length, bArr);
    }

    public static Record newRecord(Name name, int i10, int i11, long j10) {
        if (name.isAbsolute()) {
            Type.check(i10);
            DClass.check(i11);
            TTL.check(j10);
            return getEmptyRecord(name, i10, i11, j10, false);
        }
        throw new RelativeNameException(name);
    }

    public static Record fromString(Name name, int i10, int i11, long j10, String str, Name name2) throws IOException {
        return fromString(name, i10, i11, j10, new Tokenizer(str), name2);
    }

    public static Record newRecord(Name name, int i10, int i11) {
        return newRecord(name, i10, i11, 0L);
    }
}
