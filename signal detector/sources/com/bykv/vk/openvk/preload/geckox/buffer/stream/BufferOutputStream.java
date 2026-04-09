package com.bykv.vk.openvk.preload.geckox.buffer.stream;

/* loaded from: classes.dex */
public class BufferOutputStream extends b {
    private com.bykv.vk.openvk.preload.geckox.buffer.a mBuffer;

    public BufferOutputStream(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.mBuffer = aVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.mBuffer.a(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.mBuffer.a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i3) {
        this.mBuffer.a(bArr, i, i3);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j6, int i) {
        synchronized (this) {
            this.mBuffer.b(j6);
            this.mBuffer.a(i);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j6, byte[] bArr) {
        synchronized (this) {
            this.mBuffer.b(j6);
            this.mBuffer.a(bArr);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j6, byte[] bArr, int i, int i3) {
        synchronized (this) {
            this.mBuffer.b(j6);
            this.mBuffer.a(bArr, i, i3);
        }
    }
}
