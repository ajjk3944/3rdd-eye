package com.applovin.shadow.okio;

import a0.g;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import d.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import je.u;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException(u.r(i4, "minByteCount <= 0: ").toString());
            }
            if (i4 > 8192) {
                throw new IllegalArgumentException(u.r(i4, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
            int i10 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = Segment.SIZE;
            long j = i10;
            buffer.setSize$okio(size + j);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i10;
            this.end = Segment.SIZE;
            return j;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            k.b(buffer);
            if (j == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j8 = this.offset;
            return seek(j8 == -1 ? 0L : j8 + (this.end - this.start));
        }

        public final long resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (j <= size) {
                if (j < 0) {
                    throw new IllegalArgumentException(g.j(j, "newSize < 0: ").toString());
                }
                long j8 = size - j;
                while (true) {
                    if (j8 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    k.b(segment);
                    Segment segment2 = segment.prev;
                    k.b(segment2);
                    int i4 = segment2.limit;
                    long j9 = i4 - segment2.pos;
                    if (j9 > j8) {
                        segment2.limit = i4 - ((int) j8);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j8 -= j9;
                }
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j > size) {
                long j10 = j - size;
                boolean z3 = true;
                while (j10 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j10 -= iMin;
                    if (z3) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i10 = segmentWritableSegment$okio.limit;
                        this.start = i10 - iMin;
                        this.end = i10;
                        z3 = false;
                    }
                }
            }
            buffer.setSize$okio(j);
            return size;
        }

        public final int seek(long j) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > buffer.size()) {
                StringBuilder sbY = h.y(j, "offset=", " > size=");
                sbY.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(sbY.toString());
            }
            if (j == -1 || j == buffer.size()) {
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment$okio = buffer.head;
            long j8 = 0;
            if (getSegment$okio() != null) {
                long j9 = this.offset;
                int i4 = this.start;
                k.b(getSegment$okio());
                long j10 = j9 - (i4 - r9.pos);
                if (j10 > j) {
                    segmentPush = segment$okio;
                    segment$okio = getSegment$okio();
                    size = j10;
                } else {
                    segmentPush = getSegment$okio();
                    j8 = j10;
                }
            } else {
                segmentPush = segment$okio;
            }
            if (size - j > j - j8) {
                while (true) {
                    k.b(segmentPush);
                    int i10 = segmentPush.limit;
                    int i11 = segmentPush.pos;
                    if (j < (i10 - i11) + j8) {
                        break;
                    }
                    j8 += i10 - i11;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j) {
                    k.b(segment$okio);
                    segment$okio = segment$okio.prev;
                    k.b(segment$okio);
                    size -= segment$okio.limit - segment$okio.pos;
                }
                j8 = size;
                segmentPush = segment$okio;
            }
            if (this.readWrite) {
                k.b(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment = segmentPush.prev;
                    k.b(segment);
                    segment.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = j;
            k.b(segmentPush);
            this.data = segmentPush.data;
            int i12 = segmentPush.pos + ((int) (j - j8));
            this.start = i12;
            int i13 = segmentPush.limit;
            this.end = i13;
            return i13 - i12;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j8, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        long j9 = j;
        if ((i4 & 4) != 0) {
            j8 = buffer.size - j9;
        }
        return buffer.copyTo(outputStream, j9, j8);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            messageDigest.update(bArr, i4, segment.limit - i4);
            Segment segment2 = segment.next;
            k.b(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i10 = segment2.pos;
                messageDigest.update(bArr2, i10, segment2.limit - i10);
                segment2 = segment2.next;
                k.b(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        k.d(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i4 = segment.pos;
                mac.update(bArr, i4, segment.limit - i4);
                Segment segment2 = segment.next;
                k.b(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    mac.update(bArr2, i10, segment2.limit - i10);
                    segment2 = segment2.next;
                    k.b(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            k.d(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    @yj.a
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m136deprecated_getByte(long j) {
        return getByte(j);
    }

    @yj.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m137deprecated_size() {
        return this.size;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        k.b(segment);
        Segment segment2 = segment.prev;
        k.b(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r3 - segment2.pos);
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        k.b(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            k.b(segment3);
            k.b(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        k.e(outputStream, "out");
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        k.b(segment);
        Segment segment2 = buffer.head;
        k.b(segment2);
        int i4 = segment.pos;
        int i10 = segment2.pos;
        long j = 0;
        while (j < size()) {
            long jMin = Math.min(segment.limit - i4, segment2.limit - i10);
            long j8 = 0;
            while (j8 < jMin) {
                int i11 = i4 + 1;
                int i12 = i10 + 1;
                if (segment.data[i4] != segment2.data[i10]) {
                    return false;
                }
                j8++;
                i4 = i11;
                i10 = i12;
            }
            if (i4 == segment.limit) {
                segment = segment.next;
                k.b(segment);
                i4 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                k.b(segment2);
                i10 = segment2.pos;
            }
            j += jMin;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    public final byte getByte(long j) {
        SegmentedByteString.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment == null) {
            k.b(null);
            throw null;
        }
        if (size() - j < j) {
            long size = size();
            while (size > j) {
                segment = segment.prev;
                k.b(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j8 = 0;
        while (true) {
            int i4 = segment.limit;
            int i10 = segment.pos;
            long j9 = (i4 - i10) + j8;
            if (j9 > j) {
                return segment.data[(int) ((i10 + j) - j8)];
            }
            segment = segment.next;
            k.b(segment);
            j8 = j9;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i4 = (i4 * 31) + segment.data[i11];
            }
            segment = segment.next;
            k.b(segment);
        } while (segment != this.head);
        return i4;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        k.e(byteString, "key");
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        k.e(byteString, "key");
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        k.e(byteString, "key");
        return hmac("HmacSHA512", byteString);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        k.e(byteString, "targetBytes");
        return indexOfElement(byteString, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.applovin.shadow.okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i4, int i10) {
                k.e(bArr, "sink");
                return Buffer.this.read(bArr, i4, i10);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.Buffer.outputStream.1
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i4) {
                Buffer.this.writeByte(i4);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i4, int i10) {
                k.e(bArr, "data");
                Buffer.this.write(bArr, i4, i10);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }
        };
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString) {
        k.e(byteString, "bytes");
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        k.e(byteBuffer, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, iMin);
        int i4 = segment.pos + iMin;
        segment.pos = i4;
        this.size -= iMin;
        if (i4 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        k.e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        int i11 = i4 + 1;
        byte b10 = segment.data[i4];
        setSize$okio(size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        k.e(inputStream, "input");
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(Buffer buffer, long j) throws EOFException {
        k.e(buffer, "sink");
        if (size() >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            com.applovin.shadow.okio.Segment r6 = r14.head
            nk.k.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            com.applovin.shadow.okio.Buffer r0 = new com.applovin.shadow.okio.Buffer
            r0.<init>()
            com.applovin.shadow.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 3;
        int i12 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i13 = i4 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 7;
        long j = ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        int i12 = i4 + 8;
        long j8 = j | (bArr[i11] & 255);
        setSize$okio(size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j8;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j8;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 1;
        int i12 = (bArr[i4] & 255) << 8;
        int i13 = i4 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        setSize$okio(size() - 2);
        if (i13 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(Charset charset) {
        k.e(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, vk.a.f36267a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i4;
        int i10;
        int i11;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b10 = getByte(0L);
        if ((b10 & 128) == 0) {
            i4 = b10 & 127;
            i11 = 0;
            i10 = 1;
        } else if ((b10 & 224) == 192) {
            i4 = b10 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b10 & 240) == 224) {
            i4 = b10 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j = i10;
        if (size() < j) {
            StringBuilder sbW = u.w(i10, "size < ", ": ");
            sbW.append(size());
            sbW.append(" (to read code point prefixed 0x");
            sbW.append(SegmentedByteString.toHexString(b10));
            sbW.append(')');
            throw new EOFException(sbW.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j8 = i12;
            byte b11 = getByte(j8);
            if ((b11 & 192) != 128) {
                skip(j8);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = (i4 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        return i4 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i4 || i4 >= 57344) && i4 >= i11) ? i4 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean request(long j) {
        return this.size >= j;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int select(Options options) throws EOFException {
        k.e(options, "options");
        int iSelectPrefix$default = com.applovin.shadow.okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j8 = iMin;
            setSize$okio(size() - j8);
            j -= j8;
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            k.b(segment);
            Segment segment2 = segment.prev;
            k.b(segment2);
            return (segment2.limit + i4 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        k.e(source, "source");
        long j = 0;
        while (true) {
            long j8 = source.read(this, 8192L);
            if (j8 == -1) {
                return j;
            }
            j += j8;
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        k.e(outputStream, "out");
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m138clone() {
        return copy();
    }

    public final Buffer copyTo(OutputStream outputStream, long j) throws IOException {
        k.e(outputStream, "out");
        return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long j) {
        return indexOf(b10, j, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j) {
        int i4;
        int i10;
        k.e(byteString, "targetBytes");
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j < j) {
            size = size();
            while (size > j) {
                segment = segment.prev;
                k.b(segment);
                size -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b10 = byteString.getByte(0);
                byte b11 = byteString.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i4 = (int) ((segment.pos + j) - size);
                    int i11 = segment.limit;
                    while (i4 < i11) {
                        byte b12 = bArr[i4];
                        if (b12 == b10 || b12 == b11) {
                            i10 = segment.pos;
                        } else {
                            i4++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    k.b(segment);
                    j = size;
                }
            } else {
                byte[] bArrInternalArray$okio = byteString.internalArray$okio();
                while (size < size()) {
                    byte[] bArr2 = segment.data;
                    i4 = (int) ((segment.pos + j) - size);
                    int i12 = segment.limit;
                    while (i4 < i12) {
                        byte b13 = bArr2[i4];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                i10 = segment.pos;
                            }
                        }
                        i4++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    k.b(segment);
                    j = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + size;
            if (j8 > j) {
                break;
            }
            segment = segment.next;
            k.b(segment);
            size = j8;
        }
        if (byteString.size() == 2) {
            byte b15 = byteString.getByte(0);
            byte b16 = byteString.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i4 = (int) ((segment.pos + j) - size);
                int i13 = segment.limit;
                while (i4 < i13) {
                    byte b17 = bArr3[i4];
                    if (b17 == b15 || b17 == b16) {
                        i10 = segment.pos;
                    } else {
                        i4++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                k.b(segment);
                j = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
            while (size < size()) {
                byte[] bArr4 = segment.data;
                i4 = (int) ((segment.pos + j) - size);
                int i14 = segment.limit;
                while (i4 < i14) {
                    byte b18 = bArr4[i4];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            i10 = segment.pos;
                        }
                    }
                    i4++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                k.b(segment);
                j = size;
            }
        }
        return -1L;
        return (i4 - i10) + size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long j, ByteString byteString, int i4, int i10) {
        k.e(byteString, "bytes");
        if (j < 0 || i4 < 0 || i10 < 0 || size() - j < i10 || byteString.size() - i4 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (getByte(i11 + j) != byteString.getByte(i4 + i11)) {
                return false;
            }
        }
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        k.e(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(readByteArray(j));
        }
        ByteString byteStringSnapshot = snapshot((int) j);
        skip(j);
        return byteStringSnapshot;
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        k.e(inputStream, "input");
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "byteCount < 0: ").toString());
        }
        readFrom(inputStream, j, false);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(long j, Charset charset) throws EOFException {
        k.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (this.size < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.head;
        k.b(segment);
        int i4 = segment.pos;
        if (i4 + j > segment.limit) {
            return new String(readByteArray(j), charset);
        }
        int i10 = (int) j;
        String str = new String(segment.data, i4, i10, charset);
        int i11 = segment.pos + i10;
        segment.pos = i11;
        this.size -= j;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        k.e(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8(long j) throws EOFException {
        return readString(j, vk.a.f36267a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "limit < 0: ").toString());
        }
        long j8 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j8 < size() && getByte(j8 - 1) == 13 && getByte(j8) == 10) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, j8);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeByte(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i4;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeDecimalLong(long j) {
        boolean z3;
        if (j == 0) {
            return writeByte(48);
        }
        int i4 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j >= 100000000) {
            i4 = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i4 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i4 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i4 = 2;
        }
        if (z3) {
            i4++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i4;
        while (j != 0) {
            long j8 = 10;
            i10--;
            bArr[i10] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j % j8)];
            j /= j8;
        }
        if (z3) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j8 = (j >>> 1) | j;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i4 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i4) - 1; i11 >= i10; i11--) {
            bArr[i11] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeInt(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i4 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeIntLe(int i4) {
        return writeInt(SegmentedByteString.reverseBytes(i4));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLong(long j) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        bArr[i4] = (byte) ((j >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i4 + 7] = (byte) (j & 255);
        segmentWritableSegment$okio.limit = i4 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLongLe(long j) {
        return writeLong(SegmentedByteString.reverseBytes(j));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShort(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShortLe(int i4) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i4));
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        k.e(outputStream, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j);
        Segment segment = this.head;
        long j8 = j;
        while (j8 > 0) {
            k.b(segment);
            int iMin = (int) Math.min(j8, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, iMin);
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            long j9 = iMin;
            this.size -= j9;
            j8 -= j9;
            if (i4 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i4) {
        if (i4 < 128) {
            writeByte(i4);
            return this;
        }
        if (i4 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i4 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= i4 && i4 < 57344) {
            writeByte(63);
            return this;
        }
        if (i4 < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i4 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (i4 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i4));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i4 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i4 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i4 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i4 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j8, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j8);
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j8) throws IOException {
        k.e(outputStream, "out");
        long j9 = j;
        SegmentedByteString.checkOffsetAndCount(this.size, j9, j8);
        if (j8 != 0) {
            Segment segment = this.head;
            while (true) {
                k.b(segment);
                int i4 = segment.limit;
                int i10 = segment.pos;
                if (j9 < i4 - i10) {
                    break;
                }
                j9 -= i4 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = j8;
            while (j10 > 0) {
                k.b(segment2);
                int iMin = (int) Math.min(segment2.limit - r1, j10);
                outputStream.write(segment2.data, (int) (segment2.pos + j9), iMin);
                j10 -= iMin;
                segment2 = segment2.next;
                j9 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        k.e(byteString, "bytes");
        return indexOf(byteString, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        k.e(str, "string");
        k.e(charset, "charset");
        return writeString(str, 0, str.length(), charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String str) {
        k.e(str, "string");
        return writeUtf8(str, 0, str.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long j, long j8) {
        Segment segment;
        int i4;
        long size = 0;
        if (0 > j || j > j8) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j8).toString());
        }
        if (j8 > size()) {
            j8 = size();
        }
        if (j == j8 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j < j) {
            size = size();
            while (size > j) {
                segment = segment.prev;
                k.b(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j8) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j8) - size);
                i4 = (int) ((segment.pos + j) - size);
                while (i4 < iMin) {
                    if (bArr[i4] != b10) {
                        i4++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                k.b(segment);
                j = size;
            }
            return -1L;
        }
        while (true) {
            long j9 = (segment.limit - segment.pos) + size;
            if (j9 > j) {
                break;
            }
            segment = segment.next;
            k.b(segment);
            size = j9;
        }
        while (size < j8) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j8) - size);
            i4 = (int) ((segment.pos + j) - size);
            while (i4 < iMin2) {
                if (bArr2[i4] != b10) {
                    i4++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            k.b(segment);
            j = size;
        }
        return -1L;
        return (i4 - segment.pos) + size;
    }

    public final ByteString snapshot(int i4) {
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i4);
        Segment segment = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i4) {
            k.b(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = this.head;
        int i15 = 0;
        while (i10 < i4) {
            k.b(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i4);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C0138SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String str, int i4, int i10) {
        char cCharAt;
        k.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(u.r(i4, "beginIndex < 0: ").toString());
        }
        if (i10 >= i4) {
            if (i10 > str.length()) {
                StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
                sbW.append(str.length());
                throw new IllegalArgumentException(sbW.toString().toString());
            }
            while (i4 < i10) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i11 = segmentWritableSegment$okio.limit - i4;
                    int iMin = Math.min(i10, 8192 - i11);
                    int i12 = i4 + 1;
                    bArr[i4 + i11] = (byte) cCharAt2;
                    while (true) {
                        i4 = i12;
                        if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                            break;
                        }
                        i12 = i4 + 1;
                        bArr[i4 + i11] = (byte) cCharAt;
                    }
                    int i13 = segmentWritableSegment$okio.limit;
                    int i14 = (i11 + i4) - i13;
                    segmentWritableSegment$okio.limit = i13 + i14;
                    setSize$okio(size() + i14);
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i15 = segmentWritableSegment$okio2.limit;
                        bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                        bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i15 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i4 + 1;
                        char cCharAt3 = i16 < i10 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i18 = segmentWritableSegment$okio3.limit;
                            bArr3[i18] = (byte) ((i17 >> 18) | 240);
                            bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                            bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                            bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i18 + 4;
                            setSize$okio(size() + 4);
                            i4 += 2;
                        } else {
                            writeByte(63);
                            i4 = i16;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i19 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i19 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i19 + 3;
                        setSize$okio(size() + 3);
                    }
                    i4++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        k.e(bArr, "sink");
        int i4 = 0;
        while (i4 < bArr.length) {
            int i10 = read(bArr, i4, bArr.length - i4);
            if (i10 == -1) {
                throw new EOFException();
            }
            i4 += i10;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String str, int i4, int i10, Charset charset) {
        k.e(str, "string");
        k.e(charset, "charset");
        if (i4 < 0) {
            throw new IllegalArgumentException(u.r(i4, "beginIndex < 0: ").toString());
        }
        if (i10 >= i4) {
            if (i10 <= str.length()) {
                if (charset.equals(vk.a.f36267a)) {
                    return writeUtf8(str, i4, i10);
                }
                String strSubstring = str.substring(i4, i10);
                k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                k.d(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        k.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i4, 8192 - segmentWritableSegment$okio.limit);
            byteBuffer.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i4 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] bArr) {
        k.e(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    private final void readFrom(InputStream inputStream, long j, boolean z3) throws IOException {
        while (true) {
            if (j <= 0 && !z3) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i4 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j, 8192 - segmentWritableSegment$okio.limit));
            if (i4 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z3) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i4;
            long j8 = i4;
            this.size += j8;
            j -= j8;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] bArr, int i4, int i10) {
        k.e(bArr, "sink");
        SegmentedByteString.checkOffsetAndCount(bArr.length, i4, i10);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i11 = segment.pos;
        m.O(bArr2, i4, bArr, i11, i11 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer copyTo(Buffer buffer, long j) {
        k.e(buffer, "out");
        return copyTo(buffer, j, this.size - j);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString) {
        k.e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer buffer, long j, long j8) {
        k.e(buffer, "out");
        long j9 = j;
        SegmentedByteString.checkOffsetAndCount(size(), j9, j8);
        if (j8 != 0) {
            buffer.setSize$okio(buffer.size() + j8);
            Segment segment = this.head;
            while (true) {
                k.b(segment);
                int i4 = segment.limit;
                int i10 = segment.pos;
                if (j9 < i4 - i10) {
                    break;
                }
                j9 -= i4 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = j8;
            while (j10 > 0) {
                k.b(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i11 = segmentSharedCopy.pos + ((int) j9);
                segmentSharedCopy.pos = i11;
                segmentSharedCopy.limit = Math.min(i11 + ((int) j10), segmentSharedCopy.limit);
                Segment segment3 = buffer.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    buffer.head = segmentSharedCopy;
                } else {
                    k.b(segment3);
                    Segment segment4 = segment3.prev;
                    k.b(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j10 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j9 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString, int i4, int i10) {
        k.e(byteString, "byteString");
        byteString.write$okio(this, i4, i10);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] bArr) {
        k.e(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] bArr, int i4, int i10) {
        k.e(bArr, "source");
        long j = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i4, j);
        int i11 = i10 + i4;
        while (i4 < i11) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i11 - i4, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i4 + iMin;
            m.O(bArr, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, i4, i12);
            segmentWritableSegment$okio.limit += iMin;
            i4 = i12;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer buffer, long j) {
        k.e(buffer, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j > size()) {
            j = size();
        }
        buffer.write(this, j);
        return j;
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(Source source, long j) throws IOException {
        k.e(source, "source");
        while (j > 0) {
            long j8 = source.read(this, j);
            if (j8 == -1) {
                throw new EOFException();
            }
            j -= j8;
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString byteString, long j) throws IOException {
        int i4;
        long j8 = j;
        k.e(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j8 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j8 < j8) {
                size = size();
                while (size > j8) {
                    segment = segment.prev;
                    k.b(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = byteString.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = byteString.size();
                long size3 = (size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j9 = size3;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i4 = (int) ((segment.pos + j8) - size);
                    while (i4 < iMin) {
                        if (bArr[i4] != b10 || !com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                            i4++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    k.b(segment);
                    j8 = size;
                    size3 = j9;
                }
                return -1L;
            }
            while (true) {
                long j10 = (segment.limit - segment.pos) + size;
                if (j10 > j8) {
                    break;
                }
                segment = segment.next;
                k.b(segment);
                size = j10;
            }
            byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = byteString.size();
            long size5 = (size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i4 = (int) ((segment.pos + j8) - size);
                while (i4 < iMin2) {
                    if (bArr2[i4] == b11 && com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i4 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i4++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                k.b(segment);
                j8 = size;
            }
            return -1L;
            return (i4 - segment.pos) + size;
        }
        throw new IllegalArgumentException(g.j(j8, "fromIndex < 0: ").toString());
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer buffer, long j) {
        Segment segment;
        k.e(buffer, "source");
        if (buffer != this) {
            SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = buffer.head;
                k.b(segment2);
                int i4 = segment2.limit;
                k.b(buffer.head);
                if (j < i4 - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        k.b(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer.head;
                            k.b(segment4);
                            segment4.writeTo(segment, (int) j);
                            buffer.setSize$okio(buffer.size() - j);
                            setSize$okio(size() + j);
                            return;
                        }
                    }
                    Segment segment5 = buffer.head;
                    k.b(segment5);
                    buffer.head = segment5.split((int) j);
                }
                Segment segment6 = buffer.head;
                k.b(segment6);
                long j8 = segment6.limit - segment6.pos;
                buffer.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    k.b(segment7);
                    Segment segment8 = segment7.prev;
                    k.b(segment8);
                    segment8.push(segment6).compact();
                }
                buffer.setSize$okio(buffer.size() - j8);
                setSize$okio(size() + j8);
                j -= j8;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
