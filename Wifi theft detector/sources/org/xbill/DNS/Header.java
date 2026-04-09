package org.xbill.DNS;

import java.io.IOException;
import java.util.Random;

/* loaded from: classes4.dex */
public class Header implements Cloneable {
    public static final int LENGTH = 12;
    private static Random random = new Random();
    private int[] counts;
    private int flags;
    private int id;

    public Header(int i10) {
        init();
        setID(i10);
    }

    private static void checkFlag(int i10) {
        if (validFlag(i10)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("invalid flag bit ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    private void init() {
        this.counts = new int[4];
        this.flags = 0;
        this.id = -1;
    }

    public static int setFlag(int i10, int i11, boolean z10) {
        checkFlag(i11);
        return z10 ? i10 | (1 << (15 - i11)) : i10 & (~(1 << (15 - i11)));
    }

    private static boolean validFlag(int i10) {
        return i10 >= 0 && i10 <= 15 && Flags.isFlag(i10);
    }

    public Object clone() {
        Header header = new Header();
        header.id = this.id;
        header.flags = this.flags;
        int[] iArr = this.counts;
        System.arraycopy(iArr, 0, header.counts, 0, iArr.length);
        return header;
    }

    public void decCount(int i10) {
        int[] iArr = this.counts;
        int i11 = iArr[i10];
        if (i11 == 0) {
            throw new IllegalStateException("DNS section count cannot be decremented");
        }
        iArr[i10] = i11 - 1;
    }

    public int getCount(int i10) {
        return this.counts[i10];
    }

    public boolean getFlag(int i10) {
        checkFlag(i10);
        return ((1 << (15 - i10)) & this.flags) != 0;
    }

    public boolean[] getFlags() {
        boolean[] zArr = new boolean[16];
        for (int i10 = 0; i10 < 16; i10++) {
            if (validFlag(i10)) {
                zArr[i10] = getFlag(i10);
            }
        }
        return zArr;
    }

    public int getFlagsByte() {
        return this.flags;
    }

    public int getID() {
        int i10;
        int i11 = this.id;
        if (i11 >= 0) {
            return i11;
        }
        synchronized (this) {
            try {
                if (this.id < 0) {
                    this.id = random.nextInt(65535);
                }
                i10 = this.id;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public int getOpcode() {
        return (this.flags >> 11) & 15;
    }

    public int getRcode() {
        return this.flags & 15;
    }

    public void incCount(int i10) {
        int[] iArr = this.counts;
        int i11 = iArr[i10];
        if (i11 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i10] = i11 + 1;
    }

    public String printFlags() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 16; i10++) {
            if (validFlag(i10) && getFlag(i10)) {
                stringBuffer.append(Flags.string(i10));
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public void setCount(int i10, int i11) {
        if (i11 >= 0 && i11 <= 65535) {
            this.counts[i10] = i11;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DNS section count ");
        stringBuffer.append(i11);
        stringBuffer.append(" is out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void setID(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            this.id = i10;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DNS message ID ");
        stringBuffer.append(i10);
        stringBuffer.append(" is out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void setOpcode(int i10) {
        if (i10 >= 0 && i10 <= 15) {
            this.flags = (i10 << 11) | (this.flags & 34815);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DNS Opcode ");
            stringBuffer.append(i10);
            stringBuffer.append("is out of range");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void setRcode(int i10) {
        if (i10 >= 0 && i10 <= 15) {
            this.flags = i10 | (this.flags & (-16));
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DNS Rcode ");
        stringBuffer.append(i10);
        stringBuffer.append(" is out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public String toString() {
        return toStringWithRcode(getRcode());
    }

    public String toStringWithRcode(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(";; ->>HEADER<<- ");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("opcode: ");
        stringBuffer2.append(Opcode.string(getOpcode()));
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(", status: ");
        stringBuffer3.append(Rcode.string(i10));
        stringBuffer.append(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(", id: ");
        stringBuffer4.append(getID());
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append("\n");
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(";; flags: ");
        stringBuffer5.append(printFlags());
        stringBuffer.append(stringBuffer5.toString());
        stringBuffer.append("; ");
        for (int i11 = 0; i11 < 4; i11++) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(Section.string(i11));
            stringBuffer6.append(": ");
            stringBuffer6.append(getCount(i11));
            stringBuffer6.append(" ");
            stringBuffer.append(stringBuffer6.toString());
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(getID());
        dNSOutput.writeU16(this.flags);
        int i10 = 0;
        while (true) {
            int[] iArr = this.counts;
            if (i10 >= iArr.length) {
                return;
            }
            dNSOutput.writeU16(iArr[i10]);
            i10++;
        }
    }

    public void unsetFlag(int i10) {
        checkFlag(i10);
        this.flags = setFlag(this.flags, i10, false);
    }

    public void setFlag(int i10) {
        checkFlag(i10);
        this.flags = setFlag(this.flags, i10, true);
    }

    public Header() {
        init();
    }

    public byte[] toWire() {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public Header(DNSInput dNSInput) throws IOException {
        this(dNSInput.readU16());
        this.flags = dNSInput.readU16();
        int i10 = 0;
        while (true) {
            int[] iArr = this.counts;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = dNSInput.readU16();
            i10++;
        }
    }

    public Header(byte[] bArr) throws IOException {
        this(new DNSInput(bArr));
    }
}
