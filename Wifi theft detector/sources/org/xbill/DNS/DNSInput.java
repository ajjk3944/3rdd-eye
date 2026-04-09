package org.xbill.DNS;

/* loaded from: classes4.dex */
public class DNSInput {
    private byte[] array;
    private int end;
    private int pos = 0;
    private int saved_pos = -1;
    private int saved_end = -1;

    public DNSInput(byte[] bArr) {
        this.array = bArr;
        this.end = bArr.length;
    }

    private void require(int i10) throws WireParseException {
        if (i10 > remaining()) {
            throw new WireParseException("end of input");
        }
    }

    public void clearActive() {
        this.end = this.array.length;
    }

    public int current() {
        return this.pos;
    }

    public void jump(int i10) {
        byte[] bArr = this.array;
        if (i10 >= bArr.length) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.pos = i10;
        this.end = bArr.length;
    }

    public void readByteArray(byte[] bArr, int i10, int i11) throws WireParseException {
        require(i11);
        System.arraycopy(this.array, this.pos, bArr, i10, i11);
        this.pos += i11;
    }

    public byte[] readCountedString() throws WireParseException {
        require(1);
        byte[] bArr = this.array;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return readByteArray(bArr[i10] & 255);
    }

    public int readU16() throws WireParseException {
        require(2);
        byte[] bArr = this.array;
        int i10 = this.pos;
        int i11 = i10 + 1;
        this.pos = i11;
        int i12 = bArr[i10] & 255;
        this.pos = i10 + 2;
        return (i12 << 8) + (bArr[i11] & 255);
    }

    public long readU32() throws WireParseException {
        require(4);
        byte[] bArr = this.array;
        int i10 = this.pos;
        int i11 = i10 + 1;
        this.pos = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.pos = i13;
        int i14 = bArr[i11] & 255;
        this.pos = i10 + 3;
        int i15 = bArr[i13] & 255;
        this.pos = i10 + 4;
        return (i12 << 24) + (i14 << 16) + (i15 << 8) + (bArr[r6] & 255);
    }

    public int readU8() throws WireParseException {
        require(1);
        byte[] bArr = this.array;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return bArr[i10] & 255;
    }

    public int remaining() {
        return this.end - this.pos;
    }

    public void restore() {
        int i10 = this.saved_pos;
        if (i10 < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.pos = i10;
        this.end = this.saved_end;
        this.saved_pos = -1;
        this.saved_end = -1;
    }

    public void restoreActive(int i10) {
        if (i10 > this.array.length) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.end = i10;
    }

    public void save() {
        this.saved_pos = this.pos;
        this.saved_end = this.end;
    }

    public int saveActive() {
        return this.end;
    }

    public void setActive(int i10) {
        int length = this.array.length;
        int i11 = this.pos;
        if (i10 > length - i11) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.end = i11 + i10;
    }

    public byte[] readByteArray(int i10) throws WireParseException {
        require(i10);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.array, this.pos, bArr, 0, i10);
        this.pos += i10;
        return bArr;
    }

    public byte[] readByteArray() {
        int iRemaining = remaining();
        byte[] bArr = new byte[iRemaining];
        System.arraycopy(this.array, this.pos, bArr, 0, iRemaining);
        this.pos += iRemaining;
        return bArr;
    }
}
