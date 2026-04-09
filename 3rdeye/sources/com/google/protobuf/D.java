package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: classes2.dex */
public class D extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public D(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = B.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = y0.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i) {
        int i10 = this.currentByteBufferPos + i;
        this.currentByteBufferPos = i10;
        if (i10 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i;
        }
        int i10 = y0.getByte(this.currentByteBufferPos + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i10) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int iLimit = this.currentByteBuffer.limit();
        int i11 = this.currentByteBufferPos;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i11 + this.currentArrayOffset, bArr, i, i10);
            updateCurrentByteBufferPos(i10);
            return i10;
        }
        int iPosition = this.currentByteBuffer.position();
        this.currentByteBuffer.get(bArr, i, i10);
        updateCurrentByteBufferPos(i10);
        return i10;
    }
}
