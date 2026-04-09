package org.snmp4j.asn1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BERInputStream extends InputStream {
    private ByteBuffer buffer;

    public BERInputStream(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.mark();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.buffer.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public int getAvailableBytes() {
        return this.buffer.limit();
    }

    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    public long getPosition() {
        return this.buffer.position();
    }

    public boolean isMarked() {
        return true;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.buffer.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.buffer.get() & 255;
        } catch (BufferUnderflowException unused) {
            throw new IOException("Unexpected end of input stream at position " + getPosition());
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.buffer.reset();
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long jMin = Math.min(this.buffer.remaining(), j10);
        this.buffer.position((int) (r0.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (this.buffer.remaining() <= 0) {
            return -1;
        }
        int iMin = Math.min(this.buffer.remaining(), bArr.length);
        this.buffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.buffer.remaining() <= 0 && i11 > 0) {
            return -1;
        }
        int iMin = Math.min(this.buffer.remaining(), bArr.length);
        this.buffer.get(bArr, i10, i11);
        return iMin;
    }
}
