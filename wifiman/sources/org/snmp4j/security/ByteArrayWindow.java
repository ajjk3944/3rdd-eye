package org.snmp4j.security;

/* loaded from: classes2.dex */
public class ByteArrayWindow {
    private int length;
    private int offset;
    private byte[] value;

    public ByteArrayWindow(byte[] bArr, int i10, int i11) {
        this.value = bArr;
        this.offset = i10;
        this.length = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteArrayWindow)) {
            return false;
        }
        ByteArrayWindow byteArrayWindow = (ByteArrayWindow) obj;
        if (byteArrayWindow.length != this.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.length; i10++) {
            if (byteArrayWindow.value[i10] != this.value[i10]) {
                return false;
            }
        }
        return true;
    }

    public byte get(int i10) {
        if (i10 < this.length) {
            if (i10 >= 0) {
                return this.value[i10 + this.offset];
            }
            throw new IndexOutOfBoundsException("" + i10);
        }
        throw new IndexOutOfBoundsException("" + i10 + " >= " + this.length);
    }

    public int getLength() {
        return this.length;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte[] getValue() {
        return this.value;
    }

    public void set(int i10, byte b10) {
        if (i10 >= this.length) {
            throw new IndexOutOfBoundsException("" + i10 + " >= " + this.length);
        }
        if (i10 >= 0) {
            this.value[i10 + this.offset] = b10;
            return;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    public void setValue(byte[] bArr) {
        this.value = bArr;
    }

    public boolean equals(ByteArrayWindow byteArrayWindow, int i10) {
        if (byteArrayWindow.length < i10 || this.length < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.value[this.offset + i11] != byteArrayWindow.value[byteArrayWindow.offset + i11]) {
                return false;
            }
        }
        return true;
    }
}
