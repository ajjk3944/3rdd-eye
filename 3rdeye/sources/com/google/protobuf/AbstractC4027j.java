package com.google.protobuf;

import com.google.protobuf.U;
import g0.C4356c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: CodedInputStream.java */
/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4027j {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    C4028k wrapper;

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$b */
    public static final class b extends AbstractC4027j {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i = this.limit + this.bufferSizeAfterLimit;
            this.limit = i;
            int i10 = i - this.startPos;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.limit = i - i12;
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i10 = this.pos;
                this.pos = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void checkLastTagWas(int i) throws C {
            if (this.lastTag != i) {
                throw C.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int pushLimit(int i) throws C {
            if (i < 0) {
                throw C.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            if (totalBytesRead < 0) {
                throw C.parseFailure();
            }
            int i10 = this.currentLimit;
            if (totalBytesRead > i10) {
                throw C.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i - i10) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i10, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return B.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public AbstractC4026i readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i - i10) {
                    AbstractC4026i abstractC4026iWrap = (this.immutable && this.enableAliasing) ? AbstractC4026i.wrap(this.buffer, i10, rawVarint32) : AbstractC4026i.copyFrom(this.buffer, i10, rawVarint32);
                    this.pos += rawVarint32;
                    return abstractC4026iWrap;
                }
            }
            return rawVarint32 == 0 ? AbstractC4026i.EMPTY : AbstractC4026i.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readGroup(int i, U.a aVar, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readMessage(U.a aVar, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw C.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte readRawByte() throws IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw C.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readRawBytes(int i) throws IOException {
            if (i > 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (i <= i10 - i11) {
                    int i12 = i + i11;
                    this.pos = i12;
                    return Arrays.copyOfRange(this.buffer, i11, i12);
                }
            }
            if (i > 0) {
                throw C.truncatedMessage();
            }
            if (i == 0) {
                return B.EMPTY_BYTE_ARRAY;
            }
            throw C.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw C.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw C.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawVarint32() throws IOException {
            int i;
            int i10 = this.pos;
            int i11 = this.limit;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.pos = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        i = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b11 = bArr[i17];
                                int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i19;
                                }
                                i = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.pos = i13;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64() throws IOException {
            long j4;
            long j10;
            long j11;
            long j12;
            int i = this.pos;
            int i10 = this.limit;
            if (i10 != i) {
                byte[] bArr = this.buffer;
                int i11 = i + 1;
                byte b10 = bArr[i];
                if (b10 >= 0) {
                    this.pos = i11;
                    return b10;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i + 2;
                    int i13 = (bArr[i11] << 7) ^ b10;
                    if (i13 < 0) {
                        j4 = i13 ^ (-128);
                    } else {
                        int i14 = i + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j4 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                j12 = (-2080896) ^ i17;
                            } else {
                                long j13 = i17;
                                i12 = i + 5;
                                long j14 = j13 ^ (bArr[i16] << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i16 = i + 6;
                                    long j15 = j14 ^ (bArr[i12] << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i + 7;
                                        j14 = j15 ^ (bArr[i16] << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i16 = i + 8;
                                            j15 = j14 ^ (bArr[i12] << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i + 9;
                                                long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i18;
                                                    }
                                                }
                                                j4 = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j4 = j11 ^ j14;
                            }
                            i12 = i16;
                            j4 = j12;
                        }
                    }
                    this.pos = i12;
                    return j4;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64SlowPath() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                j4 |= (r3 & 127) << i;
                if ((readRawByte() & 128) == 0) {
                    return j4;
                }
            }
            throw C.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSInt32() throws IOException {
            return AbstractC4027j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSInt64() throws IOException {
            return AbstractC4027j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i - i10) {
                    String str = new String(this.buffer, i10, rawVarint32, B.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i - i10) {
                    String strDecodeUtf8 = z0.decodeUtf8(this.buffer, i10, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (A0.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw C.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        @Deprecated
        public void readUnknownGroup(int i, U.a aVar) throws IOException {
            readGroup(i, aVar, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(A0.makeTag(A0.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipRawBytes(int i) throws IOException {
            if (i >= 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (i <= i10 - i11) {
                    this.pos = i11 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C.truncatedMessage();
            }
            throw C.negativeSize();
        }

        private b(byte[] bArr, int i, int i10, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i10 + i;
            this.pos = i;
            this.startPos = i;
            this.immutable = z10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage(AbstractC4029l abstractC4029l) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC4029l));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readGroup(int i, e0<T> e0Var, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i, AbstractC4029l abstractC4029l) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC4026i bytes = readBytes();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC4029l.writeUInt32NoTag(i);
                skipMessage(abstractC4029l);
                int iMakeTag = A0.makeTag(A0.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                abstractC4029l.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readMessage(e0<T> e0Var, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw C.truncatedMessage();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$c */
    public static final class c extends AbstractC4027j {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws C {
            if (!this.iterator.hasNext()) {
                throw C.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i, int i10) throws IOException {
            if (i10 < 0 || i10 > remaining()) {
                if (i10 > 0) {
                    throw C.truncatedMessage();
                }
                if (i10 != 0) {
                    throw C.negativeSize();
                }
                return;
            }
            int i11 = i10;
            while (i11 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i11, (int) currentRemaining());
                long j4 = iMin;
                y0.copyMemory(this.currentByteBufferPos, bArr, (i10 - i11) + i, j4);
                i11 -= iMin;
                this.currentByteBufferPos += j4;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i;
            int i10 = i - this.startOffset;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterCurrentLimit = i12;
            this.totalBufferSize = i - i12;
        }

        private int remaining() {
            return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private ByteBuffer slice(int i, int i10) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i10);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw C.truncatedMessage();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = y0.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void checkLastTagWas(int i) throws C {
            if (this.lastTag != i) {
                throw C.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getTotalBytesRead() {
            return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int pushLimit(int i) throws C {
            if (i < 0) {
                throw C.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            int i10 = this.currentLimit;
            if (totalBytesRead > i10) {
                throw C.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j4 = rawVarint32;
                if (j4 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        y0.copyMemory(this.currentByteBufferPos, bArr, 0L, j4);
                        this.currentByteBufferPos += j4;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j10 = this.currentByteBufferPos + j4;
                    this.currentByteBufferPos = j10;
                    long j11 = this.currentAddress;
                    return slice((int) ((j10 - j11) - j4), (int) (j10 - j11));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return B.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public AbstractC4026i readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j4 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j4 <= j10 - j11) {
                    if (this.immutable && this.enableAliasing) {
                        int i = (int) (j11 - this.currentAddress);
                        AbstractC4026i abstractC4026iWrap = AbstractC4026i.wrap(slice(i, rawVarint32 + i));
                        this.currentByteBufferPos += j4;
                        return abstractC4026iWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    y0.copyMemory(j11, bArr, 0L, j4);
                    this.currentByteBufferPos += j4;
                    return AbstractC4026i.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return AbstractC4026i.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw C.negativeSize();
                }
                throw C.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return AbstractC4026i.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i10 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(AbstractC4026i.wrap(slice(i10, i10 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += iMin;
            }
            return AbstractC4026i.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readGroup(int i, U.a aVar, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readMessage(U.a aVar, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw C.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j4 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j4;
            return y0.getByte(j4);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readRawBytes(int i) throws IOException {
            if (i >= 0) {
                long j4 = i;
                if (j4 <= currentRemaining()) {
                    byte[] bArr = new byte[i];
                    y0.copyMemory(this.currentByteBufferPos, bArr, 0L, j4);
                    this.currentByteBufferPos += j4;
                    return bArr;
                }
            }
            if (i >= 0 && i <= remaining()) {
                byte[] bArr2 = new byte[i];
                readRawBytesTo(bArr2, 0, i);
                return bArr2;
            }
            if (i > 0) {
                throw C.truncatedMessage();
            }
            if (i == 0) {
                return B.EMPTY_BYTE_ARRAY;
            }
            throw C.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j4 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j4;
            return ((y0.getByte(j4 + 3) & 255) << 24) | (y0.getByte(j4) & 255) | ((y0.getByte(1 + j4) & 255) << 8) | ((y0.getByte(2 + j4) & 255) << 16);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawLittleEndian64() throws IOException {
            char c10;
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j4 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j4;
                c10 = '8';
                rawByte = (y0.getByte(j4) & 255) | ((y0.getByte(1 + j4) & 255) << 8) | ((y0.getByte(2 + j4) & 255) << 16) | ((y0.getByte(3 + j4) & 255) << 24) | ((y0.getByte(4 + j4) & 255) << 32) | ((y0.getByte(5 + j4) & 255) << 40) | ((y0.getByte(6 + j4) & 255) << 48);
                rawByte2 = y0.getByte(j4 + 7);
            } else {
                c10 = '8';
                rawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((rawByte2 & 255) << c10);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawVarint32() throws IOException {
            int i;
            long j4 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j4) {
                long j10 = j4 + 1;
                byte b10 = y0.getByte(j4);
                if (b10 >= 0) {
                    this.currentByteBufferPos++;
                    return b10;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j11 = 2 + j4;
                    int i10 = (y0.getByte(j10) << 7) ^ b10;
                    if (i10 < 0) {
                        i = i10 ^ (-128);
                    } else {
                        long j12 = 3 + j4;
                        int i11 = (y0.getByte(j11) << 14) ^ i10;
                        if (i11 >= 0) {
                            i = i11 ^ 16256;
                        } else {
                            long j13 = 4 + j4;
                            int i12 = i11 ^ (y0.getByte(j12) << 21);
                            if (i12 < 0) {
                                i = (-2080896) ^ i12;
                            } else {
                                j12 = 5 + j4;
                                byte b11 = y0.getByte(j13);
                                int i13 = (i12 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    j13 = 6 + j4;
                                    if (y0.getByte(j12) < 0) {
                                        j12 = 7 + j4;
                                        if (y0.getByte(j13) < 0) {
                                            j13 = 8 + j4;
                                            if (y0.getByte(j12) < 0) {
                                                j12 = 9 + j4;
                                                if (y0.getByte(j13) < 0) {
                                                    long j14 = j4 + 10;
                                                    if (y0.getByte(j12) >= 0) {
                                                        i = i13;
                                                        j11 = j14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i13;
                                }
                                i = i13;
                            }
                            j11 = j13;
                        }
                        j11 = j12;
                    }
                    this.currentByteBufferPos = j11;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64() throws IOException {
            long j4;
            long j10;
            long j11;
            long j12 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j12) {
                long j13 = j12 + 1;
                byte b10 = y0.getByte(j12);
                if (b10 >= 0) {
                    this.currentByteBufferPos++;
                    return b10;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j14 = 2 + j12;
                    int i = (y0.getByte(j13) << 7) ^ b10;
                    if (i < 0) {
                        j4 = i ^ (-128);
                    } else {
                        long j15 = 3 + j12;
                        int i10 = (y0.getByte(j14) << 14) ^ i;
                        if (i10 >= 0) {
                            j4 = i10 ^ 16256;
                            j14 = j15;
                        } else {
                            long j16 = 4 + j12;
                            int i11 = i10 ^ (y0.getByte(j15) << 21);
                            if (i11 < 0) {
                                j4 = (-2080896) ^ i11;
                                j14 = j16;
                            } else {
                                long j17 = 5 + j12;
                                long j18 = (y0.getByte(j16) << 28) ^ i11;
                                if (j18 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j19 = 6 + j12;
                                    long j20 = j18 ^ (y0.getByte(j17) << 35);
                                    if (j20 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j17 = 7 + j12;
                                        j18 = j20 ^ (y0.getByte(j19) << 42);
                                        if (j18 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j12;
                                            j20 = j18 ^ (y0.getByte(j17) << 49);
                                            if (j20 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j17 = 9 + j12;
                                                long j21 = (j20 ^ (y0.getByte(j19) << 56)) ^ 71499008037633920L;
                                                if (j21 < 0) {
                                                    long j22 = j12 + 10;
                                                    if (y0.getByte(j17) >= 0) {
                                                        j14 = j22;
                                                        j4 = j21;
                                                    }
                                                } else {
                                                    j4 = j21;
                                                    j14 = j17;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j10 ^ j20;
                                    j14 = j19;
                                }
                                j4 = j11 ^ j18;
                                j14 = j17;
                            }
                        }
                    }
                    this.currentByteBufferPos = j14;
                    return j4;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64SlowPath() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                j4 |= (r3 & 127) << i;
                if ((readRawByte() & 128) == 0) {
                    return j4;
                }
            }
            throw C.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSInt32() throws IOException {
            return AbstractC4027j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSInt64() throws IOException {
            return AbstractC4027j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j4 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j4 <= j10 - j11) {
                    byte[] bArr = new byte[rawVarint32];
                    y0.copyMemory(j11, bArr, 0L, j4);
                    String str = new String(bArr, B.UTF_8);
                    this.currentByteBufferPos += j4;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, B.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j4 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j4 <= j10 - j11) {
                    String strDecodeUtf8 = z0.decodeUtf8(this.currentByteBuffer, (int) (j11 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j4;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return z0.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (A0.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw C.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        @Deprecated
        public void readUnknownGroup(int i, U.a aVar) throws IOException {
            readGroup(i, aVar, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void resetSizeCounter() {
            this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(A0.makeTag(A0.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipRawBytes(int i) throws IOException {
            if (i < 0 || i > ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i >= 0) {
                    throw C.truncatedMessage();
                }
                throw C.negativeSize();
            }
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i, (int) currentRemaining());
                i -= iMin;
                this.currentByteBufferPos += iMin;
            }
        }

        private c(Iterable<ByteBuffer> iterable, int i, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z10;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = B.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage(AbstractC4029l abstractC4029l) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC4029l));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readGroup(int i, e0<T> e0Var, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i, AbstractC4029l abstractC4029l) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC4026i bytes = readBytes();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC4029l.writeUInt32NoTag(i);
                skipMessage(abstractC4029l);
                int iMakeTag = A0.makeTag(A0.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                abstractC4029l.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readMessage(e0<T> e0Var, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw C.truncatedMessage();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$d */
    public static final class d extends AbstractC4027j {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private a refillCallback;
        private int totalBytesRetired;

        /* compiled from: CodedInputStream.java */
        /* renamed from: com.google.protobuf.j$d$a */
        public interface a {
            void onRefill();
        }

        private static int available(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (C e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i, int i10) throws IOException {
            try {
                return inputStream.read(bArr, i, i10);
            } catch (C e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private AbstractC4026i readBytesSlowPath(int i) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return AbstractC4026i.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i10 = this.pos;
            int i11 = this.bufferSize;
            int length = i11 - i10;
            this.totalBytesRetired += i11;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i10, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC4026i.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i, boolean z10) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (rawBytesSlowPathOneChunk != null) {
                return z10 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i10 = this.pos;
            int i11 = this.bufferSize;
            int length = i11 - i10;
            this.totalBytesRetired += i11;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i10, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws IOException {
            if (i == 0) {
                return B.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw C.negativeSize();
            }
            int i10 = this.totalBytesRetired;
            int i11 = this.pos;
            int i12 = i10 + i11 + i;
            if (i12 - this.sizeLimit > 0) {
                throw C.sizeLimitExceeded();
            }
            int i13 = this.currentLimit;
            if (i12 > i13) {
                skipRawBytes((i13 - i10) - i11);
                throw C.truncatedMessage();
            }
            int i14 = this.bufferSize - i11;
            int i15 = i - i14;
            if (i15 >= 4096 && i15 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i14);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i14 < i) {
                int i16 = read(this.input, bArr, i14, i - i14);
                if (i16 == -1) {
                    throw C.truncatedMessage();
                }
                this.totalBytesRetired += i16;
                i14 += i16;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.input.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw C.truncatedMessage();
                    }
                    this.totalBytesRetired += i11;
                    i10 += i11;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i;
            int i10 = this.totalBytesRetired + i;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.bufferSize = i - i12;
        }

        private void refillBuffer(int i) throws IOException {
            if (tryRefillBuffer(i)) {
                return;
            }
            if (i <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw C.truncatedMessage();
            }
            throw C.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j4) throws IOException {
            try {
                return inputStream.skip(j4);
            } catch (C e4) {
                e4.setThrownFromInputStream();
                throw e4;
            }
        }

        private void skipRawBytesSlowPath(int i) throws IOException {
            if (i < 0) {
                throw C.negativeSize();
            }
            int i10 = this.totalBytesRetired;
            int i11 = this.pos;
            int i12 = i10 + i11 + i;
            int i13 = this.currentLimit;
            if (i12 > i13) {
                skipRawBytes((i13 - i10) - i11);
                throw C.truncatedMessage();
            }
            int i14 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i10 + i11;
                int i15 = this.bufferSize - i11;
                this.bufferSize = 0;
                this.pos = 0;
                i14 = i15;
                while (i14 < i) {
                    try {
                        long j4 = i - i14;
                        long jSkip = skip(this.input, j4);
                        if (jSkip < 0 || jSkip > j4) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i14 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i14;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i14 >= i) {
                return;
            }
            int i16 = this.bufferSize;
            int i17 = i16 - this.pos;
            this.pos = i16;
            refillBuffer(1);
            while (true) {
                int i18 = i - i17;
                int i19 = this.bufferSize;
                if (i18 <= i19) {
                    this.pos = i18;
                    return;
                } else {
                    i17 += i19;
                    this.pos = i19;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i10 = this.pos;
                this.pos = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private boolean tryRefillBuffer(int i) throws IOException {
            int i10 = this.pos;
            if (i10 + i <= this.bufferSize) {
                throw new IllegalStateException(C4356c.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i11 = this.sizeLimit;
            int i12 = this.totalBytesRetired;
            if (i > (i11 - i12) - i10 || i12 + i10 + i > this.currentLimit) {
                return false;
            }
            a aVar = this.refillCallback;
            if (aVar != null) {
                aVar.onRefill();
            }
            int i13 = this.pos;
            if (i13 > 0) {
                int i14 = this.bufferSize;
                if (i14 > i13) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                }
                this.totalBytesRetired += i13;
                this.bufferSize -= i13;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i15 = this.bufferSize;
            int i16 = read(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.sizeLimit - this.totalBytesRetired) - i15));
            if (i16 == 0 || i16 < -1 || i16 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 <= 0) {
                return false;
            }
            this.bufferSize += i16;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i) {
                return true;
            }
            return tryRefillBuffer(i);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void checkLastTagWas(int i) throws C {
            if (this.lastTag != i) {
                throw C.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int pushLimit(int i) throws C {
            if (i < 0) {
                throw C.negativeSize();
            }
            int i10 = this.totalBytesRetired + this.pos + i;
            int i11 = this.currentLimit;
            if (i10 > i11) {
                throw C.truncatedMessage();
            }
            this.currentLimit = i10;
            recomputeBufferSizeAfterLimit();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 > i - i10 || rawVarint32 <= 0) {
                return readRawBytesSlowPath(rawVarint32, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 > i - i10 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? B.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32));
            this.pos += rawVarint32;
            return byteBufferWrap;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public AbstractC4026i readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 > i - i10 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? AbstractC4026i.EMPTY : readBytesSlowPath(rawVarint32);
            }
            AbstractC4026i abstractC4026iCopyFrom = AbstractC4026i.copyFrom(this.buffer, i10, rawVarint32);
            this.pos += rawVarint32;
            return abstractC4026iCopyFrom;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readGroup(int i, U.a aVar, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readMessage(U.a aVar, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw C.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readRawBytes(int i) throws IOException {
            int i10 = this.pos;
            if (i > this.bufferSize - i10 || i <= 0) {
                return readRawBytesSlowPath(i, false);
            }
            int i11 = i + i10;
            this.pos = i11;
            return Arrays.copyOfRange(this.buffer, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawVarint32() throws IOException {
            int i;
            int i10 = this.pos;
            int i11 = this.bufferSize;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.pos = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        i = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b11 = bArr[i17];
                                int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i19;
                                }
                                i = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.pos = i13;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64() throws IOException {
            long j4;
            long j10;
            long j11;
            long j12;
            int i = this.pos;
            int i10 = this.bufferSize;
            if (i10 != i) {
                byte[] bArr = this.buffer;
                int i11 = i + 1;
                byte b10 = bArr[i];
                if (b10 >= 0) {
                    this.pos = i11;
                    return b10;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i + 2;
                    int i13 = (bArr[i11] << 7) ^ b10;
                    if (i13 < 0) {
                        j4 = i13 ^ (-128);
                    } else {
                        int i14 = i + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j4 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                j12 = (-2080896) ^ i17;
                            } else {
                                long j13 = i17;
                                i12 = i + 5;
                                long j14 = j13 ^ (bArr[i16] << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i16 = i + 6;
                                    long j15 = j14 ^ (bArr[i12] << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i + 7;
                                        j14 = j15 ^ (bArr[i16] << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i16 = i + 8;
                                            j15 = j14 ^ (bArr[i12] << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i + 9;
                                                long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i18;
                                                    }
                                                }
                                                j4 = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j4 = j11 ^ j14;
                            }
                            i12 = i16;
                            j4 = j12;
                        }
                    }
                    this.pos = i12;
                    return j4;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64SlowPath() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                j4 |= (r3 & 127) << i;
                if ((readRawByte() & 128) == 0) {
                    return j4;
                }
            }
            throw C.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSInt32() throws IOException {
            return AbstractC4027j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSInt64() throws IOException {
            return AbstractC4027j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.bufferSize;
                int i10 = this.pos;
                if (rawVarint32 <= i - i10) {
                    String str = new String(this.buffer, i10, rawVarint32, B.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), B.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, B.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i = this.pos;
            int i10 = this.bufferSize;
            if (rawVarint32 <= i10 - i && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                i = 0;
                if (rawVarint32 <= i10) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return z0.decodeUtf8(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (A0.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw C.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        @Deprecated
        public void readUnknownGroup(int i, U.a aVar) throws IOException {
            readGroup(i, aVar, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(A0.makeTag(A0.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipRawBytes(int i) throws IOException {
            int i10 = this.bufferSize;
            int i11 = this.pos;
            if (i > i10 - i11 || i < 0) {
                skipRawBytesSlowPath(i);
            } else {
                this.pos = i11 + i;
            }
        }

        private d(InputStream inputStream, int i) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            B.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage(AbstractC4029l abstractC4029l) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC4029l));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readGroup(int i, e0<T> e0Var, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i, AbstractC4029l abstractC4029l) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC4026i bytes = readBytes();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC4029l.writeUInt32NoTag(i);
                skipMessage(abstractC4029l);
                int iMakeTag = A0.makeTag(A0.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                abstractC4029l.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readMessage(e0<T> e0Var, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void enableAliasing(boolean z10) {
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.j$e */
    public static final class e extends AbstractC4027j {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long j4) {
            return (int) (j4 - this.address);
        }

        public static boolean isSupported() {
            return y0.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j4 = this.limit + this.bufferSizeAfterLimit;
            this.limit = j4;
            int i = (int) (j4 - this.startPos);
            int i10 = this.currentLimit;
            if (i <= i10) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i11 = i - i10;
            this.bufferSizeAfterLimit = i11;
            this.limit = j4 - i11;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j4 = this.pos;
                this.pos = 1 + j4;
                if (y0.getByte(j4) >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw C.malformedVarint();
        }

        private ByteBuffer slice(long j4, long j10) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j4));
                    byteBuffer.limit(bufferPos(j10));
                    return this.buffer.slice();
                } catch (IllegalArgumentException e4) {
                    C cTruncatedMessage = C.truncatedMessage();
                    cTruncatedMessage.initCause(e4);
                    throw cTruncatedMessage;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void checkLastTagWas(int i) throws C {
            if (this.lastTag != i) {
                throw C.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int pushLimit(int i) throws C {
            if (i < 0) {
                throw C.negativeSize();
            }
            int totalBytesRead = getTotalBytesRead() + i;
            int i10 = this.currentLimit;
            if (totalBytesRead > i10) {
                throw C.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return B.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw C.negativeSize();
                }
                throw C.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j4 = rawVarint32;
                y0.copyMemory(this.pos, bArr, 0L, j4);
                this.pos += j4;
                return ByteBuffer.wrap(bArr);
            }
            long j10 = this.pos;
            long j11 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j10, j10 + j11);
            this.pos += j11;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public AbstractC4026i readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return AbstractC4026i.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw C.negativeSize();
                }
                throw C.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j4 = this.pos;
                long j10 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j4, j4 + j10);
                this.pos += j10;
                return AbstractC4026i.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j11 = rawVarint32;
            y0.copyMemory(this.pos, bArr, 0L, j11);
            this.pos += j11;
            return AbstractC4026i.wrap(bArr);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readGroup(int i, U.a aVar, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void readMessage(U.a aVar, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw C.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte readRawByte() throws IOException {
            long j4 = this.pos;
            if (j4 == this.limit) {
                throw C.truncatedMessage();
            }
            this.pos = 1 + j4;
            return y0.getByte(j4);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public byte[] readRawBytes(int i) throws IOException {
            if (i < 0 || i > remaining()) {
                if (i > 0) {
                    throw C.truncatedMessage();
                }
                if (i == 0) {
                    return B.EMPTY_BYTE_ARRAY;
                }
                throw C.negativeSize();
            }
            byte[] bArr = new byte[i];
            long j4 = this.pos;
            long j10 = i;
            slice(j4, j4 + j10).get(bArr);
            this.pos += j10;
            return bArr;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readRawLittleEndian32() throws IOException {
            long j4 = this.pos;
            if (this.limit - j4 < 4) {
                throw C.truncatedMessage();
            }
            this.pos = 4 + j4;
            return ((y0.getByte(j4 + 3) & 255) << 24) | (y0.getByte(j4) & 255) | ((y0.getByte(1 + j4) & 255) << 8) | ((y0.getByte(2 + j4) & 255) << 16);
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawLittleEndian64() throws IOException {
            long j4 = this.pos;
            if (this.limit - j4 < 8) {
                throw C.truncatedMessage();
            }
            this.pos = 8 + j4;
            return ((y0.getByte(j4 + 7) & 255) << 56) | (y0.getByte(j4) & 255) | ((y0.getByte(1 + j4) & 255) << 8) | ((y0.getByte(2 + j4) & 255) << 16) | ((y0.getByte(3 + j4) & 255) << 24) | ((y0.getByte(4 + j4) & 255) << 32) | ((y0.getByte(5 + j4) & 255) << 40) | ((y0.getByte(6 + j4) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.y0.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.AbstractC4027j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.y0.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.y0.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y0.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y0.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y0.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y0.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y0.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y0.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.y0.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.y0.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4027j.e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64() throws IOException {
            long j4;
            long j10;
            long j11;
            int i;
            long j12 = this.pos;
            if (this.limit != j12) {
                long j13 = 1 + j12;
                byte b10 = y0.getByte(j12);
                if (b10 >= 0) {
                    this.pos = j13;
                    return b10;
                }
                if (this.limit - j13 >= 9) {
                    long j14 = 2 + j12;
                    int i10 = (y0.getByte(j13) << 7) ^ b10;
                    if (i10 >= 0) {
                        long j15 = 3 + j12;
                        int i11 = i10 ^ (y0.getByte(j14) << 14);
                        if (i11 >= 0) {
                            j4 = i11 ^ 16256;
                            j14 = j15;
                        } else {
                            j14 = 4 + j12;
                            int i12 = i11 ^ (y0.getByte(j15) << 21);
                            if (i12 < 0) {
                                i = (-2080896) ^ i12;
                            } else {
                                long j16 = 5 + j12;
                                long j17 = i12 ^ (y0.getByte(j14) << 28);
                                if (j17 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j18 = 6 + j12;
                                    long j19 = j17 ^ (y0.getByte(j16) << 35);
                                    if (j19 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j16 = 7 + j12;
                                        j17 = j19 ^ (y0.getByte(j18) << 42);
                                        if (j17 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j12;
                                            j19 = j17 ^ (y0.getByte(j16) << 49);
                                            if (j19 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                long j20 = 9 + j12;
                                                long j21 = (j19 ^ (y0.getByte(j18) << 56)) ^ 71499008037633920L;
                                                if (j21 < 0) {
                                                    long j22 = j12 + 10;
                                                    if (y0.getByte(j20) >= 0) {
                                                        j14 = j22;
                                                        j4 = j21;
                                                    }
                                                } else {
                                                    j4 = j21;
                                                    j14 = j20;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j10 ^ j19;
                                    j14 = j18;
                                }
                                j4 = j11 ^ j17;
                                j14 = j16;
                            }
                        }
                        this.pos = j14;
                        return j4;
                    }
                    i = i10 ^ (-128);
                    j4 = i;
                    this.pos = j14;
                    return j4;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readRawVarint64SlowPath() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                j4 |= (r3 & 127) << i;
                if ((readRawByte() & 128) == 0) {
                    return j4;
                }
            }
            throw C.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readSInt32() throws IOException {
            return AbstractC4027j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readSInt64() throws IOException {
            return AbstractC4027j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw C.negativeSize();
                }
                throw C.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j4 = rawVarint32;
            y0.copyMemory(this.pos, bArr, 0L, j4);
            String str = new String(bArr, B.UTF_8);
            this.pos += j4;
            return str;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = z0.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw C.negativeSize();
            }
            throw C.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (A0.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw C.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC4027j
        @Deprecated
        public void readUnknownGroup(int i, U.a aVar) throws IOException {
            readGroup(i, aVar, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(A0.makeTag(A0.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= remaining()) {
                this.pos += i;
            } else {
                if (i >= 0) {
                    throw C.truncatedMessage();
                }
                throw C.negativeSize();
            }
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = y0.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = byteBuffer.limit() + jAddressOffset;
            long jPosition = jAddressOffset + byteBuffer.position();
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z10;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public void skipMessage(AbstractC4029l abstractC4029l) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, abstractC4029l));
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readGroup(int i, e0<T> e0Var, C4034q c4034q) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(A0.makeTag(i, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.AbstractC4027j
        public boolean skipField(int i, AbstractC4029l abstractC4029l) throws IOException {
            int tagWireType = A0.getTagWireType(i);
            if (tagWireType == 0) {
                long int64 = readInt64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                AbstractC4026i bytes = readBytes();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                abstractC4029l.writeUInt32NoTag(i);
                skipMessage(abstractC4029l);
                int iMakeTag = A0.makeTag(A0.getTagFieldNumber(i), 4);
                checkLastTagWas(iMakeTag);
                abstractC4029l.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                abstractC4029l.writeUInt32NoTag(i);
                abstractC4029l.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw C.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC4027j
        public <T extends U> T readMessage(e0<T> e0Var, C4034q c4034q) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = e0Var.parsePartialFrom(this, c4034q);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw C.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static AbstractC4027j newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i10 = i & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw C.truncatedMessage();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw C.truncatedMessage();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw C.malformedVarint();
    }

    public abstract void checkLastTagWas(int i) throws C;

    public void checkRecursionLimit() throws C {
        if (this.recursionDepth >= this.recursionLimit) {
            throw C.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws C;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract AbstractC4026i readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends U> T readGroup(int i, e0<T> e0Var, C4034q c4034q) throws IOException;

    public abstract void readGroup(int i, U.a aVar, C4034q c4034q) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends U> T readMessage(e0<T> e0Var, C4034q c4034q) throws IOException;

    public abstract void readMessage(U.a aVar, C4034q c4034q) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, U.a aVar) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.h(i, "Recursion limit cannot be negative: "));
        }
        int i10 = this.recursionLimit;
        this.recursionLimit = i;
        return i10;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.h(i, "Size limit cannot be negative: "));
        }
        int i10 = this.sizeLimit;
        this.sizeLimit = i;
        return i10;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, AbstractC4029l abstractC4029l) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(AbstractC4029l abstractC4029l) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private AbstractC4027j() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static AbstractC4027j newInstance(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? newInstance(B.EMPTY_BYTE_ARRAY) : new d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC4027j newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.isSupported()) {
            return newInstance(new D(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return readRawVarint32(i, inputStream);
        }
        throw C.truncatedMessage();
    }

    public static AbstractC4027j newInstance(Iterable<ByteBuffer> iterable, boolean z10) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new c(iterable, iRemaining, z10);
        }
        return newInstance(new D(iterable));
    }

    public static AbstractC4027j newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static AbstractC4027j newInstance(byte[] bArr, int i, int i10) {
        return newInstance(bArr, i, i10, false);
    }

    public static AbstractC4027j newInstance(byte[] bArr, int i, int i10, boolean z10) {
        b bVar = new b(bArr, i, i10, z10);
        try {
            bVar.pushLimit(i10);
            return bVar;
        } catch (C e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static AbstractC4027j newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static AbstractC4027j newInstance(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.isSupported()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
