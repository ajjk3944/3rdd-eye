package org.xbill.DNS;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.text.DecimalFormat;

/* loaded from: classes4.dex */
public class Name implements Comparable, Serializable {
    private static final int LABEL_COMPRESSION = 192;
    private static final int LABEL_MASK = 192;
    private static final int LABEL_NORMAL = 0;
    private static final int MAXLABEL = 63;
    private static final int MAXLABELS = 128;
    private static final int MAXNAME = 255;
    private static final int MAXOFFSETS = 7;
    private static final DecimalFormat byteFormat;
    public static final Name empty;
    private static final byte[] lowercase;
    public static final Name root;
    private static final long serialVersionUID = -7257019940971525644L;
    private static final Name wild;
    private int hashcode;
    private byte[] name;
    private long offsets;
    private static final byte[] emptyLabel = {0};
    private static final byte[] wildLabel = {1, 42};

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        byteFormat = decimalFormat;
        lowercase = new byte[256];
        decimalFormat.setMinimumIntegerDigits(3);
        int i10 = 0;
        while (true) {
            byte[] bArr = lowercase;
            if (i10 >= bArr.length) {
                Name name = new Name();
                root = name;
                name.appendSafe(emptyLabel, 0, 1);
                Name name2 = new Name();
                empty = name2;
                name2.name = new byte[0];
                Name name3 = new Name();
                wild = name3;
                name3.appendSafe(wildLabel, 0, 1);
                return;
            }
            if (i10 < 65 || i10 > 90) {
                bArr[i10] = (byte) i10;
            } else {
                bArr[i10] = (byte) (i10 + 32);
            }
            i10++;
        }
    }

    private Name() {
    }

    private final void append(byte[] bArr, int i10, int i11) throws NameTooLongException {
        byte[] bArr2 = this.name;
        int length = bArr2 == null ? 0 : bArr2.length - offset(0);
        int i12 = i10;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = bArr[i12];
            if (i15 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i16 = i15 + 1;
            i12 += i16;
            i13 += i16;
        }
        int i17 = length + i13;
        if (i17 > 255) {
            throw new NameTooLongException();
        }
        int i18 = getlabels();
        int i19 = i18 + i11;
        if (i19 > 128) {
            throw new IllegalStateException("too many labels");
        }
        byte[] bArr3 = new byte[i17];
        if (length != 0) {
            System.arraycopy(this.name, offset(0), bArr3, 0, length);
        }
        System.arraycopy(bArr, i10, bArr3, length, i13);
        this.name = bArr3;
        for (int i20 = 0; i20 < i11; i20++) {
            setoffset(i18 + i20, length);
            length += bArr3[length] + 1;
        }
        setlabels(i19);
    }

    private final void appendFromString(String str, byte[] bArr, int i10, int i11) throws TextParseException {
        try {
            append(bArr, i10, i11);
        } catch (NameTooLongException unused) {
            throw parseException(str, "Name too long");
        }
    }

    private final void appendSafe(byte[] bArr, int i10, int i11) {
        try {
            append(bArr, i10, i11);
        } catch (NameTooLongException unused) {
        }
    }

    private String byteString(byte[] bArr, int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = i10 + 1;
        int i12 = bArr[i10];
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            int i14 = bArr[i13] & 255;
            if (i14 <= 32 || i14 >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(byteFormat.format(i14));
            } else if (i14 == 34 || i14 == 40 || i14 == 41 || i14 == 46 || i14 == 59 || i14 == 92 || i14 == 64 || i14 == 36) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i14);
            } else {
                stringBuffer.append((char) i14);
            }
        }
        return stringBuffer.toString();
    }

    public static Name concatenate(Name name, Name name2) throws NameTooLongException {
        if (name.isAbsolute()) {
            return name;
        }
        Name name3 = new Name();
        copy(name, name3);
        name3.append(name2.name, name2.offset(0), name2.getlabels());
        return name3;
    }

    private static final void copy(Name name, Name name2) {
        if (name.offset(0) == 0) {
            name2.name = name.name;
            name2.offsets = name.offsets;
            return;
        }
        int iOffset = name.offset(0);
        int length = name.name.length - iOffset;
        int iLabels = name.labels();
        byte[] bArr = new byte[length];
        name2.name = bArr;
        System.arraycopy(name.name, iOffset, bArr, 0, length);
        for (int i10 = 0; i10 < iLabels && i10 < 7; i10++) {
            name2.setoffset(i10, name.offset(i10) - iOffset);
        }
        name2.setlabels(iLabels);
    }

    private final boolean equals(byte[] bArr, int i10) {
        int iLabels = labels();
        int iOffset = offset(0);
        for (int i11 = 0; i11 < iLabels; i11++) {
            byte b10 = this.name[iOffset];
            if (b10 != bArr[i10]) {
                return false;
            }
            iOffset++;
            i10++;
            if (b10 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i12 = 0;
            while (i12 < b10) {
                byte[] bArr2 = lowercase;
                int i13 = iOffset + 1;
                int i14 = i10 + 1;
                if (bArr2[this.name[iOffset] & 255] != bArr2[bArr[i10] & 255]) {
                    return false;
                }
                i12++;
                i10 = i14;
                iOffset = i13;
            }
        }
        return true;
    }

    public static Name fromConstantString(String str) {
        try {
            return fromString(str, null);
        } catch (TextParseException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid name '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public static Name fromString(String str, Name name) throws TextParseException {
        return (!str.equals("@") || name == null) ? str.equals(".") ? root : new Name(str, name) : name;
    }

    private final int getlabels() {
        return (int) (this.offsets & 255);
    }

    private final int offset(int i10) {
        if (i10 == 0 && getlabels() == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= getlabels()) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i10 < 7) {
            return ((int) (this.offsets >>> ((7 - i10) * 8))) & 255;
        }
        int iOffset = offset(6);
        for (int i11 = 6; i11 < i10; i11++) {
            iOffset += this.name[iOffset] + 1;
        }
        return iOffset;
    }

    private static TextParseException parseException(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("'");
        stringBuffer.append(str);
        stringBuffer.append("': ");
        stringBuffer.append(str2);
        return new TextParseException(stringBuffer.toString());
    }

    private final void setlabels(int i10) {
        this.offsets = (this.offsets & (-256)) | i10;
    }

    private final void setoffset(int i10, int i11) {
        if (i10 >= 7) {
            return;
        }
        int i12 = (7 - i10) * 8;
        this.offsets = (i11 << i12) | (this.offsets & (~(255 << i12)));
    }

    public Name canonicalize() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.name;
            if (i11 >= bArr.length) {
                return this;
            }
            byte[] bArr2 = lowercase;
            byte b10 = bArr[i11];
            if (bArr2[b10 & 255] != b10) {
                Name name = new Name();
                name.appendSafe(this.name, offset(0), getlabels());
                while (true) {
                    byte[] bArr3 = name.name;
                    if (i10 >= bArr3.length) {
                        return name;
                    }
                    bArr3[i10] = lowercase[bArr3[i10] & 255];
                    i10++;
                }
            } else {
                i11++;
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Name name = (Name) obj;
        if (this == name) {
            return 0;
        }
        int iLabels = labels();
        int iLabels2 = name.labels();
        int i10 = iLabels > iLabels2 ? iLabels2 : iLabels;
        for (int i11 = 1; i11 <= i10; i11++) {
            int iOffset = offset(iLabels - i11);
            int iOffset2 = name.offset(iLabels2 - i11);
            byte b10 = this.name[iOffset];
            byte b11 = name.name[iOffset2];
            for (int i12 = 0; i12 < b10 && i12 < b11; i12++) {
                byte[] bArr = lowercase;
                int i13 = bArr[this.name[(i12 + iOffset) + 1] & 255] - bArr[name.name[(i12 + iOffset2) + 1] & 255];
                if (i13 != 0) {
                    return i13;
                }
            }
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return iLabels - iLabels2;
    }

    public Name fromDNAME(DNAMERecord dNAMERecord) throws NameTooLongException {
        Name name = dNAMERecord.getName();
        Name target = dNAMERecord.getTarget();
        if (!subdomain(name)) {
            return null;
        }
        int iLabels = labels() - name.labels();
        int length = length() - name.length();
        int iOffset = offset(0);
        int iLabels2 = target.labels();
        short length2 = target.length();
        int i10 = length + length2;
        if (i10 > 255) {
            throw new NameTooLongException();
        }
        Name name2 = new Name();
        int i11 = iLabels + iLabels2;
        name2.setlabels(i11);
        byte[] bArr = new byte[i10];
        name2.name = bArr;
        System.arraycopy(this.name, iOffset, bArr, 0, length);
        System.arraycopy(target.name, 0, name2.name, length, length2);
        int i12 = 0;
        for (int i13 = 0; i13 < 7 && i13 < i11; i13++) {
            name2.setoffset(i13, i12);
            i12 += name2.name[i12] + 1;
        }
        return name2;
    }

    public byte[] getLabel(int i10) {
        int iOffset = offset(i10);
        byte[] bArr = this.name;
        int i11 = (byte) (bArr[iOffset] + 1);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, iOffset, bArr2, 0, i11);
        return bArr2;
    }

    public String getLabelString(int i10) {
        return byteString(this.name, offset(i10));
    }

    public int hashCode() {
        int i10 = this.hashcode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = 0;
        int iOffset = offset(0);
        while (true) {
            byte[] bArr = this.name;
            if (iOffset >= bArr.length) {
                this.hashcode = i11;
                return i11;
            }
            i11 += (i11 << 3) + lowercase[bArr[iOffset] & 255];
            iOffset++;
        }
    }

    public boolean isAbsolute() {
        int iLabels = labels();
        return iLabels != 0 && this.name[offset(iLabels - 1)] == 0;
    }

    public boolean isWild() {
        if (labels() == 0) {
            return false;
        }
        byte[] bArr = this.name;
        return bArr[0] == 1 && bArr[1] == 42;
    }

    public int labels() {
        return getlabels();
    }

    public short length() {
        if (getlabels() == 0) {
            return (short) 0;
        }
        return (short) (this.name.length - offset(0));
    }

    public Name relativize(Name name) {
        if (name == null || !subdomain(name)) {
            return this;
        }
        Name name2 = new Name();
        copy(this, name2);
        int length = length() - name.length();
        name2.setlabels(name2.labels() - name.labels());
        name2.name = new byte[length];
        System.arraycopy(this.name, offset(0), name2.name, 0, length);
        return name2;
    }

    public boolean subdomain(Name name) {
        int iLabels = labels();
        int iLabels2 = name.labels();
        if (iLabels2 > iLabels) {
            return false;
        }
        return iLabels2 == iLabels ? equals(name) : name.equals(this.name, offset(iLabels - iLabels2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        return r2.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString(boolean r7) {
        /*
            r6 = this;
            int r0 = r6.labels()
            if (r0 != 0) goto L9
            java.lang.String r7 = "@"
            return r7
        L9:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            byte[] r2 = r6.name
            int r3 = r6.offset(r1)
            r2 = r2[r3]
            if (r2 != 0) goto L1a
            java.lang.String r7 = "."
            return r7
        L1a:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r3 = r6.offset(r1)
        L23:
            if (r1 >= r0) goto L53
            byte[] r4 = r6.name
            r4 = r4[r3]
            r5 = 63
            if (r4 > r5) goto L4b
            r5 = 46
            if (r4 != 0) goto L37
            if (r7 != 0) goto L53
            r2.append(r5)
            goto L53
        L37:
            if (r1 <= 0) goto L3c
            r2.append(r5)
        L3c:
            byte[] r5 = r6.name
            java.lang.String r5 = r6.byteString(r5, r3)
            r2.append(r5)
            int r4 = r4 + 1
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L23
        L4b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid label"
            r7.<init>(r0)
            throw r7
        L53:
            java.lang.String r7 = r2.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.Name.toString(boolean):java.lang.String");
    }

    public void toWire(DNSOutput dNSOutput, Compression compression) {
        if (!isAbsolute()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int iLabels = labels();
        int i10 = 0;
        while (i10 < iLabels - 1) {
            Name name = i10 == 0 ? this : new Name(this, i10);
            int i11 = compression != null ? compression.get(name) : -1;
            if (i11 >= 0) {
                dNSOutput.writeU16(49152 | i11);
                return;
            }
            if (compression != null) {
                compression.add(dNSOutput.current(), name);
            }
            int iOffset = offset(i10);
            byte[] bArr = this.name;
            dNSOutput.writeByteArray(bArr, iOffset, bArr[iOffset] + 1);
            i10++;
        }
        dNSOutput.writeU8(0);
    }

    public void toWireCanonical(DNSOutput dNSOutput) {
        dNSOutput.writeByteArray(toWireCanonical());
    }

    public Name wild(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("must replace 1 or more labels");
        }
        try {
            Name name = new Name();
            copy(wild, name);
            name.append(this.name, offset(i10), getlabels() - i10);
            return name;
        } catch (NameTooLongException unused) {
            throw new IllegalStateException("Name.wild: concatenate failed");
        }
    }

    public Name(String str, Name name) throws TextParseException {
        int i10;
        boolean z10;
        int i11;
        if (str.equals("")) {
            throw parseException(str, "empty name");
        }
        if (str.equals("@")) {
            if (name == null) {
                copy(empty, this);
                return;
            } else {
                copy(name, this);
                return;
            }
        }
        if (str.equals(".")) {
            copy(root, this);
            return;
        }
        byte[] bArr = new byte[64];
        int i12 = 0;
        boolean z11 = false;
        int i13 = -1;
        int i14 = 1;
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            byte bCharAt = (byte) str.charAt(i16);
            if (z11) {
                if (bCharAt >= 48 && bCharAt <= 57 && i12 < 3) {
                    i12++;
                    i15 = (i15 * 10) + (bCharAt - 48);
                    if (i15 > 255) {
                        throw parseException(str, "bad escape");
                    }
                    if (i12 < 3) {
                        continue;
                    } else {
                        bCharAt = (byte) i15;
                    }
                } else if (i12 > 0 && i12 < 3) {
                    throw parseException(str, "bad escape");
                }
                if (i14 > 63) {
                    throw parseException(str, "label too long");
                }
                i11 = i14 + 1;
                bArr[i14] = bCharAt;
                i13 = i14;
                z11 = false;
                i14 = i11;
            } else if (bCharAt == 92) {
                i12 = 0;
                i15 = 0;
                z11 = true;
            } else if (bCharAt != 46) {
                i13 = i13 == -1 ? i16 : i13;
                if (i14 > 63) {
                    throw parseException(str, "label too long");
                }
                i11 = i14 + 1;
                bArr[i14] = bCharAt;
                i14 = i11;
            } else {
                if (i13 == -1) {
                    throw parseException(str, "invalid empty label");
                }
                bArr[0] = (byte) (i14 - 1);
                appendFromString(str, bArr, 0, 1);
                i13 = -1;
                i14 = 1;
            }
        }
        if (i12 > 0 && i12 < 3) {
            throw parseException(str, "bad escape");
        }
        if (z11) {
            throw parseException(str, "bad escape");
        }
        if (i13 == -1) {
            z10 = true;
            i10 = 0;
            appendFromString(str, emptyLabel, 0, 1);
        } else {
            i10 = 0;
            bArr[0] = (byte) (i14 - 1);
            appendFromString(str, bArr, 0, 1);
            z10 = false;
        }
        if (name == null || z10) {
            return;
        }
        appendFromString(str, name.name, name.offset(i10), name.getlabels());
    }

    public byte[] toWireCanonical() {
        int iLabels = labels();
        if (iLabels == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[this.name.length - offset(0)];
        int iOffset = offset(0);
        int i10 = 0;
        for (int i11 = 0; i11 < iLabels; i11++) {
            byte b10 = this.name[iOffset];
            if (b10 <= 63) {
                iOffset++;
                bArr[i10] = b10;
                i10++;
                int i12 = 0;
                while (i12 < b10) {
                    bArr[i10] = lowercase[this.name[iOffset] & 255];
                    i12++;
                    i10++;
                    iOffset++;
                }
            } else {
                throw new IllegalStateException("invalid label");
            }
        }
        return bArr;
    }

    public static Name fromString(String str) throws TextParseException {
        return fromString(str, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        if (name.hashcode == 0) {
            name.hashCode();
        }
        if (this.hashcode == 0) {
            hashCode();
        }
        if (name.hashcode == this.hashcode && name.labels() == labels()) {
            return equals(name.name, name.offset(0));
        }
        return false;
    }

    public byte[] toWire() {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, null);
        return dNSOutput.toByteArray();
    }

    public String toString() {
        return toString(false);
    }

    public void toWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        if (z10) {
            toWireCanonical(dNSOutput);
        } else {
            toWire(dNSOutput, compression);
        }
    }

    public Name(String str) throws TextParseException {
        this(str, (Name) null);
    }

    public Name(DNSInput dNSInput) throws WireParseException {
        byte[] bArr = new byte[64];
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            int u82 = dNSInput.readU8();
            int i10 = u82 & PsExtractor.AUDIO_STREAM;
            if (i10 != 0) {
                if (i10 == 192) {
                    int u83 = dNSInput.readU8() + ((u82 & (-193)) << 8);
                    if (Options.check("verbosecompression")) {
                        PrintStream printStream = System.err;
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("currently ");
                        stringBuffer.append(dNSInput.current());
                        stringBuffer.append(", pointer to ");
                        stringBuffer.append(u83);
                        printStream.println(stringBuffer.toString());
                    }
                    if (u83 < dNSInput.current() - 2) {
                        if (!z11) {
                            dNSInput.save();
                            z11 = true;
                        }
                        dNSInput.jump(u83);
                        if (Options.check("verbosecompression")) {
                            PrintStream printStream2 = System.err;
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("current name '");
                            stringBuffer2.append(this);
                            stringBuffer2.append("', seeking to ");
                            stringBuffer2.append(u83);
                            printStream2.println(stringBuffer2.toString());
                        }
                    } else {
                        throw new WireParseException("bad compression");
                    }
                } else {
                    throw new WireParseException("bad label type");
                }
            } else {
                if (getlabels() >= 128) {
                    throw new WireParseException("too many labels");
                }
                if (u82 == 0) {
                    append(emptyLabel, 0, 1);
                    z10 = true;
                } else {
                    bArr[0] = (byte) u82;
                    dNSInput.readByteArray(bArr, 1, u82);
                    append(bArr, 0, 1);
                }
            }
        }
        if (z11) {
            dNSInput.restore();
        }
    }

    public Name(byte[] bArr) throws IOException {
        this(new DNSInput(bArr));
    }

    public Name(Name name, int i10) {
        int iLabels = name.labels();
        if (i10 <= iLabels) {
            this.name = name.name;
            int i11 = iLabels - i10;
            setlabels(i11);
            for (int i12 = 0; i12 < 7 && i12 < i11; i12++) {
                setoffset(i12, name.offset(i12 + i10));
            }
            return;
        }
        throw new IllegalArgumentException("attempted to remove too many labels");
    }
}
