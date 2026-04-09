package com.google.protobuf;

import com.google.protobuf.AbstractC4026i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: NioByteString.java */
/* loaded from: classes2.dex */
public final class c0 extends AbstractC4026i.AbstractC0357i {
    private final ByteBuffer buffer;

    public c0(ByteBuffer byteBuffer) {
        B.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i, int i10) {
        if (i < this.buffer.position() || i10 > this.buffer.limit() || i > i10) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i10)));
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        byteBufferSlice.position(i - this.buffer.position());
        byteBufferSlice.limit(i10 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return AbstractC4026i.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.AbstractC4026i
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.AbstractC4026i
    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void copyToInternal(byte[] bArr, int i, int i10, int i11) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i10, i11);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4026i)) {
            return false;
        }
        AbstractC4026i abstractC4026i = (AbstractC4026i) obj;
        if (size() != abstractC4026i.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof c0 ? this.buffer.equals(((c0) obj).buffer) : obj instanceof m0 ? obj.equals(this) : this.buffer.equals(abstractC4026i.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.AbstractC4026i.AbstractC0357i
    public boolean equalsRange(AbstractC4026i abstractC4026i, int i, int i10) {
        return substring(0, i10).equals(abstractC4026i.substring(i, i10 + i));
    }

    @Override // com.google.protobuf.AbstractC4026i
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public boolean isValidUtf8() {
        return z0.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public AbstractC4027j newCodedInput() {
        return AbstractC4027j.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public InputStream newInput() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int partialHash(int i, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i = (i * 31) + this.buffer.get(i12);
        }
        return i;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int partialIsValidUtf8(int i, int i10, int i11) {
        return z0.partialIsValidUtf8(i, this.buffer, i10, i11 + i10);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public AbstractC4026i substring(int i, int i10) {
        try {
            return new c0(slice(i, i10));
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC4026i
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iPosition = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeToInternal(OutputStream outputStream, int i, int i10) throws IOException {
        if (!this.buffer.hasArray()) {
            C4024g.write(slice(i, i10 + i), outputStream);
            return;
        }
        outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i, i10);
    }

    /* compiled from: NioByteString.java */
    public class a extends InputStream {
        private final ByteBuffer buf;

        public a() {
            this.buf = c0.this.buffer.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.buf.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.buf.hasRemaining()) {
                return this.buf.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
            } catch (InvalidMarkException e4) {
                throw new IOException(e4);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i10) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i10, this.buf.remaining());
            this.buf.get(bArr, i, iMin);
            return iMin;
        }
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeTo(AbstractC4025h abstractC4025h) throws IOException {
        abstractC4025h.writeLazy(this.buffer.slice());
    }
}
