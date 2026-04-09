package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.z0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* compiled from: CodedOutputStream.java */
/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4029l extends AbstractC4025h {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    C4030m wrapper;
    private static final Logger logger = Logger.getLogger(AbstractC4029l.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = y0.hasUnsafeArrayOperations();

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$b */
    public static abstract class b extends AbstractC4029l {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b10) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b10;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            this.position = i11;
            bArr[i10] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i10 + 2;
            this.position = i12;
            bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i10 + 3;
            this.position = i13;
            bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.position = i10 + 4;
            bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j4) {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i10 = i + 1;
            this.position = i10;
            bArr[i] = (byte) (j4 & 255);
            int i11 = i + 2;
            this.position = i11;
            bArr[i10] = (byte) ((j4 >> 8) & 255);
            int i12 = i + 3;
            this.position = i12;
            bArr[i11] = (byte) ((j4 >> 16) & 255);
            int i13 = i + 4;
            this.position = i13;
            bArr[i12] = (byte) (255 & (j4 >> 24));
            int i14 = i + 5;
            this.position = i14;
            bArr[i13] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i + 6;
            this.position = i15;
            bArr[i14] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i + 7;
            this.position = i16;
            bArr[i15] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.position = i + 8;
            bArr[i16] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i) {
            if (i >= 0) {
                bufferUInt32NoTag(i);
            } else {
                bufferUInt64NoTag(i);
            }
        }

        public final void bufferTag(int i, int i10) {
            bufferUInt32NoTag(A0.makeTag(i, i10));
        }

        public final void bufferUInt32NoTag(int i) {
            if (!AbstractC4029l.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((i & 127) | 128);
                    this.totalBytesWritten++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr2[i11] = (byte) i;
                this.totalBytesWritten++;
                return;
            }
            long j4 = this.position;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                y0.putByte(bArr3, i12, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            y0.putByte(bArr4, i13, (byte) i);
            this.totalBytesWritten += (int) (this.position - j4);
        }

        public final void bufferUInt64NoTag(long j4) {
            if (!AbstractC4029l.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j4) & 127) | 128);
                    this.totalBytesWritten++;
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr2[i10] = (byte) j4;
                this.totalBytesWritten++;
                return;
            }
            long j10 = this.position;
            while ((j4 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                y0.putByte(bArr3, i11, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            y0.putByte(bArr4, i12, (byte) j4);
            this.totalBytesWritten += (int) (this.position - j10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$c */
    public static class c extends AbstractC4029l {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public c(byte[] bArr, int i, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i11 = i + i10;
            if ((i | i10 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i10)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i11;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public final void write(byte b10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b10;
            } catch (IndexOutOfBoundsException e4) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeBool(int i, boolean z10) throws IOException {
            writeTag(i, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeByteArrayNoTag(byte[] bArr, int i, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(abstractC4026i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException {
            writeUInt32NoTag(abstractC4026i.size());
            abstractC4026i.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeFixed32(int i, int i10) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeFixed32NoTag(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                int i11 = i10 + 1;
                this.position = i11;
                bArr[i10] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                int i12 = i10 + 2;
                this.position = i12;
                bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i13 = i10 + 3;
                this.position = i13;
                bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.position = i10 + 4;
                bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e4) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeFixed64(int i, long j4) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeFixed64NoTag(long j4) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i10 = i + 1;
                this.position = i10;
                bArr[i] = (byte) (((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i11 = i + 2;
                this.position = i11;
                bArr[i10] = (byte) (((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i12 = i + 3;
                this.position = i12;
                bArr[i11] = (byte) (((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i13 = i + 4;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i14 = i + 5;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i15 = i + 6;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i + 7;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.position = i + 8;
                bArr[i16] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e4) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public final void writeLazy(byte[] bArr, int i, int i10) throws IOException {
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeMessage(int i, U u8) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeMessageNoTag(U u8) throws IOException {
            writeUInt32NoTag(u8.getSerializedSize());
            u8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeMessageSetExtension(int i, U u8) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, u8);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeRawMessageSetExtension(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, abstractC4026i);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeStringNoTag(String str) throws IOException {
            int i = this.position;
            try {
                int iComputeUInt32SizeNoTag = AbstractC4029l.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC4029l.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(z0.encodedLength(str));
                    this.position = z0.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i10 = i + iComputeUInt32SizeNoTag2;
                this.position = i10;
                int iEncode = z0.encode(str, this.buffer, i10, spaceLeft());
                this.position = i;
                writeUInt32NoTag((iEncode - i) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (z0.d e4) {
                this.position = i;
                inefficientWriteStringNoTag(str, e4);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeTag(int i, int i10) throws IOException {
            writeUInt32NoTag(A0.makeTag(i, i10));
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeUInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeUInt32NoTag(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                }
            }
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr2[i11] = (byte) i;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeUInt64(int i, long j4) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeUInt64NoTag(long j4) throws IOException {
            if (AbstractC4029l.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    y0.putByte(bArr, i, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i10 = this.position;
                this.position = 1 + i10;
                y0.putByte(bArr2, i10, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr3[i11] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e4);
                }
            }
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr4[i12] = (byte) j4;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeByteArray(int i, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeMessage(int i, U u8, n0 n0Var) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public final void writeMessageNoTag(U u8, n0 n0Var) throws IOException {
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public final void write(byte[] bArr, int i, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i10);
                this.position += i10;
            } catch (IndexOutOfBoundsException e4) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i10)), e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e4) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void flush() {
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$d */
    public static final class d extends b {
        private final AbstractC4025h out;

        public d(AbstractC4025h abstractC4025h, int i) {
            super(i);
            if (abstractC4025h == null) {
                throw new NullPointerException("out");
            }
            this.out = abstractC4025h;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBool(int i, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArrayNoTag(byte[] bArr, int i, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(abstractC4026i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException {
            writeUInt32NoTag(abstractC4026i.size());
            abstractC4026i.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32(int i, int i10) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32NoTag(int i) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64(int i, long j4) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64NoTag(long j4) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32(int i, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(byte[] bArr, int i, int i10) throws IOException {
            flush();
            this.out.writeLazy(bArr, i, i10);
            this.totalBytesWritten += i10;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8) throws IOException {
            writeUInt32NoTag(u8.getSerializedSize());
            u8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageSetExtension(int i, U u8) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, u8);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawMessageSetExtension(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, abstractC4026i);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = AbstractC4029l.computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            int i10 = this.limit;
            if (i > i10) {
                byte[] bArr = new byte[length];
                int iEncode = z0.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i > i10 - this.position) {
                doFlush();
            }
            int i11 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = AbstractC4029l.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = z0.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = z0.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i12 = i11 + iComputeUInt32SizeNoTag2;
                this.position = i12;
                int iEncode2 = z0.encode(str, this.buffer, i12, this.limit - i12);
                this.position = i11;
                int i13 = (iEncode2 - i11) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i13);
                this.position = iEncode2;
                this.totalBytesWritten += i13;
            } catch (z0.d e4) {
                this.totalBytesWritten -= this.position - i11;
                this.position = i11;
                inefficientWriteStringNoTag(str, e4);
            } catch (IndexOutOfBoundsException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeTag(int i, int i10) throws IOException {
            writeUInt32NoTag(A0.makeTag(i, i10));
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32(int i, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32NoTag(int i) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64(int i, long j4) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64NoTag(long j4) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8, n0 n0Var) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8, n0Var);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8, n0 n0Var) throws IOException {
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte[] bArr, int i, int i10) throws IOException {
            flush();
            this.out.write(bArr, i, i10);
            this.totalBytesWritten += i10;
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$e */
    public static final class e extends c {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.AbstractC4029l.c, com.google.protobuf.AbstractC4029l
        public void flush() {
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$f */
    public static class f extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public f() {
            super(MESSAGE);
        }

        public f(String str) {
            super(androidx.work.s.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public f(Throwable th) {
            super(MESSAGE, th);
        }

        public f(String str, Throwable th) {
            super(androidx.work.s.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$g */
    public static final class g extends b {
        private final OutputStream out;

        public g(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBool(int i, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArrayNoTag(byte[] bArr, int i, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(abstractC4026i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException {
            writeUInt32NoTag(abstractC4026i.size());
            abstractC4026i.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32(int i, int i10) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32NoTag(int i) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64(int i, long j4) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64NoTag(long j4) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32(int i, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(byte[] bArr, int i, int i10) throws IOException {
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8) throws IOException {
            writeUInt32NoTag(u8.getSerializedSize());
            u8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageSetExtension(int i, U u8) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, u8);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawMessageSetExtension(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, abstractC4026i);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = AbstractC4029l.computeUInt32SizeNoTag(length);
                int i = iComputeUInt32SizeNoTag + length;
                int i10 = this.limit;
                if (i > i10) {
                    byte[] bArr = new byte[length];
                    int iEncode = z0.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i > i10 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = AbstractC4029l.computeUInt32SizeNoTag(str.length());
                int i11 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i12 = i11 + iComputeUInt32SizeNoTag2;
                        this.position = i12;
                        int iEncode2 = z0.encode(str, this.buffer, i12, this.limit - i12);
                        this.position = i11;
                        iEncodedLength = (iEncode2 - i11) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = z0.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = z0.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (z0.d e4) {
                    this.totalBytesWritten -= this.position - i11;
                    this.position = i11;
                    throw e4;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new f(e10);
                }
            } catch (z0.d e11) {
                inefficientWriteStringNoTag(str, e11);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeTag(int i, int i10) throws IOException {
            writeUInt32NoTag(A0.makeTag(i, i10));
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32(int i, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32NoTag(int i) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64(int i, long j4) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64NoTag(long j4) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8, n0 n0Var) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8, n0Var);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8, n0 n0Var) throws IOException {
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte[] bArr, int i, int i10) throws IOException {
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i, this.buffer, i12, i10);
                this.position += i10;
                this.totalBytesWritten += i10;
                return;
            }
            int i13 = i11 - i12;
            System.arraycopy(bArr, i, this.buffer, i12, i13);
            int i14 = i + i13;
            int i15 = i10 - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            if (i15 <= this.limit) {
                System.arraycopy(bArr, i14, this.buffer, 0, i15);
                this.position = i15;
            } else {
                this.out.write(bArr, i14, i15);
            }
            this.totalBytesWritten += i15;
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.limit;
            int i10 = this.position;
            if (i - i10 >= iRemaining) {
                byteBuffer.get(this.buffer, i10, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i11 = i - i10;
            byteBuffer.get(this.buffer, i10, i11);
            int i12 = iRemaining - i11;
            this.position = this.limit;
            this.totalBytesWritten += i11;
            doFlush();
            while (true) {
                int i13 = this.limit;
                if (i12 > i13) {
                    byteBuffer.get(this.buffer, 0, i13);
                    this.out.write(this.buffer, 0, this.limit);
                    int i14 = this.limit;
                    i12 -= i14;
                    this.totalBytesWritten += i14;
                } else {
                    byteBuffer.get(this.buffer, 0, i12);
                    this.position = i12;
                    this.totalBytesWritten += i12;
                    return;
                }
            }
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$h */
    public static final class h extends AbstractC4029l {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public h(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                z0.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e4) {
                throw new f(e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void flush() {
        }

        @Override // com.google.protobuf.AbstractC4029l
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte b10) throws IOException {
            try {
                this.buffer.put(b10);
            } catch (BufferOverflowException e4) {
                throw new f(e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBool(int i, boolean z10) throws IOException {
            writeTag(i, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArrayNoTag(byte[] bArr, int i, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(abstractC4026i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException {
            writeUInt32NoTag(abstractC4026i.size());
            abstractC4026i.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32(int i, int i10) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32NoTag(int i) throws IOException {
            try {
                this.buffer.putInt(i);
            } catch (BufferOverflowException e4) {
                throw new f(e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64(int i, long j4) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64NoTag(long j4) throws IOException {
            try {
                this.buffer.putLong(j4);
            } catch (BufferOverflowException e4) {
                throw new f(e4);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(byte[] bArr, int i, int i10) throws IOException {
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8) throws IOException {
            writeUInt32NoTag(u8.getSerializedSize());
            u8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageSetExtension(int i, U u8) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, u8);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawMessageSetExtension(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, abstractC4026i);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeStringNoTag(String str) throws IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = AbstractC4029l.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC4029l.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(z0.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                encode(str);
                int iPosition3 = this.buffer.position();
                writeUInt32NoTag(iPosition3 - iPosition2);
            } catch (z0.d e4) {
                inefficientWriteStringNoTag(str, e4);
            } catch (IllegalArgumentException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeTag(int i, int i10) throws IOException {
            writeUInt32NoTag(A0.makeTag(i, i10));
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32NoTag(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new f(e4);
                }
            }
            this.buffer.put((byte) i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64(int i, long j4) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64NoTag(long j4) throws IOException {
            while (((-128) & j4) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                } catch (BufferOverflowException e4) {
                    throw new f(e4);
                }
            }
            this.buffer.put((byte) j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte[] bArr, int i, int i10) throws IOException {
            try {
                this.buffer.put(bArr, i, i10);
            } catch (IndexOutOfBoundsException e4) {
                throw new f(e4);
            } catch (BufferOverflowException e10) {
                throw new f(e10);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8, n0 n0Var) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8, n0Var);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8, n0 n0Var) throws IOException {
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e4) {
                throw new f(e4);
            }
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: com.google.protobuf.l$i */
    public static final class i extends AbstractC4029l {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public i(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = y0.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = byteBuffer.position() + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + byteBuffer.limit();
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j4) {
            return (int) (j4 - this.address);
        }

        public static boolean isSupported() {
            return y0.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j4) {
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void flush() {
        }

        @Override // com.google.protobuf.AbstractC4029l
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte b10) throws IOException {
            long j4 = this.position;
            if (j4 >= this.limit) {
                throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j4;
            y0.putByte(j4, b10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBool(int i, boolean z10) throws IOException {
            writeTag(i, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArrayNoTag(byte[] bArr, int i, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(abstractC4026i);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException {
            writeUInt32NoTag(abstractC4026i.size());
            abstractC4026i.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32(int i, int i10) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed32NoTag(int i) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i);
            this.position += 4;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64(int i, long j4) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeFixed64NoTag(long j4) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j4);
            this.position += 8;
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(byte[] bArr, int i, int i10) throws IOException {
            write(bArr, i, i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8) throws IOException {
            writeUInt32NoTag(u8.getSerializedSize());
            u8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageSetExtension(int i, U u8) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, u8);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeRawMessageSetExtension(int i, AbstractC4026i abstractC4026i) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, abstractC4026i);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeStringNoTag(String str) throws IOException {
            long j4 = this.position;
            try {
                int iComputeUInt32SizeNoTag = AbstractC4029l.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC4029l.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = z0.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    z0.encodeUtf8(str, this.buffer);
                    this.position += iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                z0.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += iPosition;
            } catch (z0.d e4) {
                this.position = j4;
                repositionBuffer(j4);
                inefficientWriteStringNoTag(str, e4);
            } catch (IllegalArgumentException e10) {
                throw new f(e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new f(e11);
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeTag(int i, int i10) throws IOException {
            writeUInt32NoTag(A0.makeTag(i, i10));
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32(int i, int i10) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt32NoTag(int i) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i & (-128)) != 0) {
                    long j4 = this.position;
                    this.position = j4 + 1;
                    y0.putByte(j4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j10 = this.position;
                this.position = 1 + j10;
                y0.putByte(j10, (byte) i);
                return;
            }
            while (true) {
                long j11 = this.position;
                if (j11 >= this.limit) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i & (-128)) == 0) {
                    this.position = 1 + j11;
                    y0.putByte(j11, (byte) i);
                    return;
                } else {
                    this.position = j11 + 1;
                    y0.putByte(j11, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64(int i, long j4) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j4);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeUInt64NoTag(long j4) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j4 & (-128)) != 0) {
                    long j10 = this.position;
                    this.position = j10 + 1;
                    y0.putByte(j10, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                long j11 = this.position;
                this.position = 1 + j11;
                y0.putByte(j11, (byte) j4);
                return;
            }
            while (true) {
                long j12 = this.position;
                if (j12 >= this.limit) {
                    throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j4 & (-128)) == 0) {
                    this.position = 1 + j12;
                    y0.putByte(j12, (byte) j4);
                    return;
                } else {
                    this.position = j12 + 1;
                    y0.putByte(j12, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeByteArray(int i, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessage(int i, U u8, n0 n0Var) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(u8, n0Var);
        }

        @Override // com.google.protobuf.AbstractC4029l
        public void writeMessageNoTag(U u8, n0 n0Var) throws IOException {
            writeUInt32NoTag(((AbstractC4016a) u8).getSerializedSize(n0Var));
            n0Var.writeTo(u8, this.wrapper);
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(byte[] bArr, int i, int i10) throws IOException {
            if (bArr != null && i >= 0 && i10 >= 0 && bArr.length - i10 >= i) {
                long j4 = i10;
                long j10 = this.limit - j4;
                long j11 = this.position;
                if (j10 >= j11) {
                    y0.copyMemory(bArr, i, j11, j4);
                    this.position += j4;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            throw new f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i10)));
        }

        @Override // com.google.protobuf.AbstractC4029l, com.google.protobuf.AbstractC4025h
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += iRemaining;
            } catch (BufferOverflowException e4) {
                throw new f(e4);
            }
        }
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i10);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, AbstractC4026i abstractC4026i) {
        return computeBytesSizeNoTag(abstractC4026i) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(AbstractC4026i abstractC4026i) {
        return computeLengthDelimitedFieldSize(abstractC4026i.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j4) {
        return computeFixed64SizeNoTag(j4) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, U u8) {
        return u8.getSerializedSize() + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(U u8) {
        return u8.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j4) {
        return computeInt64SizeNoTag(j4) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j4) {
        return computeUInt64SizeNoTag(j4);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, G g10) {
        return computeLazyFieldSize(3, g10) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i10, G g10) {
        return computeLazyFieldSizeNoTag(g10) + computeTagSize(i10);
    }

    public static int computeLazyFieldSizeNoTag(G g10) {
        return computeLengthDelimitedFieldSize(g10.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, U u8) {
        return computeMessageSize(3, u8) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i10, U u8) {
        return computeMessageSizeNoTag(u8) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(U u8) {
        return computeLengthDelimitedFieldSize(u8.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, AbstractC4026i abstractC4026i) {
        return computeBytesSize(3, abstractC4026i) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j4) {
        return computeUInt64SizeNoTag(j4);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j4) {
        return computeSFixed64SizeNoTag(j4) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j4) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j4) {
        return computeSInt64SizeNoTag(j4) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j4) {
        return computeUInt64SizeNoTag(encodeZigZag64(j4));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = z0.encodedLength(str);
        } catch (z0.d unused) {
            length = str.getBytes(B.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(A0.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j4) {
        return computeUInt64SizeNoTag(j4) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j4) {
        int i10;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i10 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static AbstractC4029l newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static AbstractC4029l newSafeInstance(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static AbstractC4029l newUnsafeInstance(ByteBuffer byteBuffer) {
        return new i(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, z0.d dVar) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(B.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new f(e4);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.AbstractC4025h
    public abstract void write(byte b10) throws IOException;

    @Override // com.google.protobuf.AbstractC4025h
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC4025h
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, AbstractC4026i abstractC4026i) throws IOException;

    public abstract void writeBytesNoTag(AbstractC4026i abstractC4026i) throws IOException;

    public final void writeDouble(int i10, double d10) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j4) throws IOException;

    public abstract void writeFixed64NoTag(long j4) throws IOException;

    public final void writeFloat(int i10, float f10) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, U u8) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(u8);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(U u8) throws IOException {
        u8.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j4) throws IOException {
        writeUInt64(i10, j4);
    }

    public final void writeInt64NoTag(long j4) throws IOException {
        writeUInt64NoTag(j4);
    }

    @Override // com.google.protobuf.AbstractC4025h
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.AbstractC4025h
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, U u8) throws IOException;

    public abstract void writeMessage(int i10, U u8, n0 n0Var) throws IOException;

    public abstract void writeMessageNoTag(U u8) throws IOException;

    public abstract void writeMessageNoTag(U u8, n0 n0Var) throws IOException;

    public abstract void writeMessageSetExtension(int i10, U u8) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j4) throws IOException {
        writeFixed64NoTag(j4);
    }

    public abstract void writeRawMessageSetExtension(int i10, AbstractC4026i abstractC4026i) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j4) throws IOException {
        writeUInt64NoTag(j4);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j4) throws IOException {
        writeFixed64(i10, j4);
    }

    public final void writeSFixed64NoTag(long j4) throws IOException {
        writeFixed64NoTag(j4);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j4) throws IOException {
        writeUInt64(i10, encodeZigZag64(j4));
    }

    public final void writeSInt64NoTag(long j4) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j4));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j4) throws IOException;

    public abstract void writeUInt64NoTag(long j4) throws IOException;

    private AbstractC4029l() {
    }

    @Deprecated
    public static int computeGroupSize(int i10, U u8, n0 n0Var) {
        return computeGroupSizeNoTag(u8, n0Var) + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(U u8, n0 n0Var) {
        return ((AbstractC4016a) u8).getSerializedSize(n0Var);
    }

    public static int computeMessageSize(int i10, U u8, n0 n0Var) {
        return computeMessageSizeNoTag(u8, n0Var) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(U u8, n0 n0Var) {
        return computeLengthDelimitedFieldSize(((AbstractC4016a) u8).getSerializedSize(n0Var));
    }

    public static AbstractC4029l newInstance(OutputStream outputStream, int i10) {
        return new g(outputStream, i10);
    }

    @Deprecated
    public final void writeGroupNoTag(U u8, n0 n0Var) throws IOException {
        n0Var.writeTo(u8, this.wrapper);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static AbstractC4029l newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(AbstractC4026i abstractC4026i) throws IOException {
        abstractC4026i.writeTo(this);
    }

    public static AbstractC4029l newInstance(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    @Deprecated
    public final void writeGroup(int i10, U u8, n0 n0Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(u8, n0Var);
        writeTag(i10, 4);
    }

    public static AbstractC4029l newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (i.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static AbstractC4029l newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    public static AbstractC4029l newInstance(AbstractC4025h abstractC4025h, int i10) {
        if (i10 >= 0) {
            return new d(abstractC4025h, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
