package org.snmp4j.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BEROutputStream extends OutputStream {
    private ByteBuffer buffer;
    private int offset;

    public BEROutputStream() {
        this.offset = 0;
        this.buffer = null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    public ByteBuffer rewind() {
        return (ByteBuffer) this.buffer.position(this.offset);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.offset = byteBuffer.position();
    }

    public void setFilledBuffer(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.offset = byteBuffer.position();
        byteBuffer.position(byteBuffer.limit());
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.buffer.put((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.buffer.put(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.buffer.put(bArr, i10, i11);
    }

    public BEROutputStream(ByteBuffer byteBuffer) {
        this.offset = 0;
        this.buffer = byteBuffer;
        this.offset = byteBuffer.position();
    }
}
