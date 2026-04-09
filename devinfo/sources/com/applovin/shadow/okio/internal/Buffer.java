package com.applovin.shadow.okio.internal;

import a0.g;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0138SegmentedByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentPool;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Utf8;
import com.applovin.shadow.okio._JvmPlatformKt;
import d.h;
import java.io.EOFException;
import java.io.IOException;
import je.u;
import mk.e;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes.dex */
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        k.e(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        k.e(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        k.b(segment);
        Segment segment2 = segment.prev;
        k.b(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    public static final com.applovin.shadow.okio.Buffer commonCopy(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        k.b(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            k.b(segment3);
            k.b(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final com.applovin.shadow.okio.Buffer commonCopyTo(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer buffer2, long j, long j8) {
        k.e(buffer, "<this>");
        k.e(buffer2, "out");
        long j9 = j;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j9, j8);
        if (j8 != 0) {
            buffer2.setSize$okio(buffer2.size() + j8);
            Segment segment = buffer.head;
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
                Segment segment3 = buffer2.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    buffer2.head = segmentSharedCopy;
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
        return buffer;
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.Buffer buffer, Object obj) {
        k.e(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.shadow.okio.Buffer)) {
            return false;
        }
        com.applovin.shadow.okio.Buffer buffer2 = (com.applovin.shadow.okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        k.b(segment);
        Segment segment2 = buffer2.head;
        k.b(segment2);
        int i4 = segment.pos;
        int i10 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
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

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i4) {
        k.e(unsafeCursor, "<this>");
        if (i4 <= 0) {
            throw new IllegalArgumentException(u.r(i4, "minByteCount <= 0: ").toString());
        }
        if (i4 > 8192) {
            throw new IllegalArgumentException(u.r(i4, "minByteCount > Segment.SIZE: ").toString());
        }
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
        int i10 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = Segment.SIZE;
        long j = i10;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i10;
        unsafeCursor.end = Segment.SIZE;
        return j;
    }

    public static final byte commonGet(com.applovin.shadow.okio.Buffer buffer, long j) {
        k.e(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            k.b(null);
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
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

    public static final int commonHashCode(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        Segment segment = buffer.head;
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
        } while (segment != buffer.head);
        return i4;
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.Buffer buffer, byte b10, long j, long j8) {
        Segment segment;
        int i4;
        k.e(buffer, "<this>");
        long size = 0;
        if (0 > j || j > j8) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j8).toString());
        }
        if (j8 > buffer.size()) {
            j8 = buffer.size();
        }
        if (j == j8 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
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

    public static final long commonIndexOfElement(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, long j) {
        int i4;
        int i10;
        k.e(buffer, "<this>");
        k.e(byteString, "targetBytes");
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                k.b(segment);
                size -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b10 = byteString.getByte(0);
                byte b11 = byteString.getByte(1);
                while (size < buffer.size()) {
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
                while (size < buffer.size()) {
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
            while (size < buffer.size()) {
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
            while (size < buffer.size()) {
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

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        k.e(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        k.b(buffer);
        if (j == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j8 = unsafeCursor.offset;
        return unsafeCursor.seek(j8 == -1 ? 0L : j8 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.Buffer buffer, long j, ByteString byteString, int i4, int i10) {
        k.e(buffer, "<this>");
        k.e(byteString, "bytes");
        if (j < 0 || i4 < 0 || i10 < 0 || buffer.size() - j < i10 || byteString.size() - i4 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (buffer.getByte(i11 + j) != byteString.getByte(i4 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(com.applovin.shadow.okio.Buffer buffer, byte[] bArr) {
        k.e(buffer, "<this>");
        k.e(bArr, "sink");
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(com.applovin.shadow.okio.Buffer buffer, Sink sink) throws IOException {
        k.e(buffer, "<this>");
        k.e(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(com.applovin.shadow.okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        k.e(buffer, "<this>");
        k.e(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        k.e(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        int i11 = i4 + 1;
        byte b10 = segment.data[i4];
        buffer.setSize$okio(buffer.size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(com.applovin.shadow.okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadDecimalLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final void commonReadFully(com.applovin.shadow.okio.Buffer buffer, byte[] bArr) throws EOFException {
        k.e(buffer, "<this>");
        k.e(bArr, "sink");
        int i4 = 0;
        while (i4 < bArr.length) {
            int i10 = buffer.read(bArr, i4, bArr.length - i4);
            if (i10 == -1) {
                throw new EOFException();
            }
            i4 += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            nk.k.e(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            com.applovin.shadow.okio.Segment r6 = r14.head
            nk.k.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            com.applovin.shadow.okio.Buffer r14 = new com.applovin.shadow.okio.Buffer
            r14.<init>()
            com.applovin.shadow.okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto La0
        L9e:
            r6.pos = r8
        La0:
            if (r1 != 0) goto La6
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final int commonReadInt(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        k.e(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 3;
        int i12 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i13 = i4 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    public static final long commonReadLong(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        k.e(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 7;
        long j = ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        int i12 = i4 + 8;
        long j8 = j | (bArr[i11] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j8;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j8;
    }

    public static final short commonReadShort(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        k.e(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        k.b(segment);
        int i4 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i4 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i4 + 1;
        int i12 = (bArr[i4] & 255) << 8;
        int i13 = i4 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 2);
        if (i13 == i10) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(com.applovin.shadow.okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        k.e(buffer, "<this>");
        k.e(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        k.b(segment);
        int i4 = segment.pos;
        if (i4 + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i10 = (int) j;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i4, i4 + i10);
        segment.pos += i10;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        int i4;
        int i10;
        int i11;
        k.e(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
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
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j = i10;
        if (buffer.size() < j) {
            StringBuilder sbW = u.w(i10, "size < ", ": ");
            sbW.append(buffer.size());
            sbW.append(" (to read code point prefixed 0x");
            sbW.append(SegmentedByteString.toHexString(b10));
            sbW.append(')');
            throw new EOFException(sbW.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j8 = i12;
            byte b11 = buffer.getByte(j8);
            if ((b11 & 192) != 128) {
                buffer.skip(j8);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = (i4 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j);
        return i4 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i4 || i4 >= 57344) && i4 >= i11) ? i4 : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "limit < 0: ").toString());
        }
        long j8 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j8 < buffer.size() && buffer.getByte(j8 - 1) == 13 && buffer.getByte(j8) == 10) {
            return readUtf8Line(buffer, j8);
        }
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j) {
        k.e(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
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
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j10 = j - size;
            boolean z3 = true;
            while (j10 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j10 -= iMin;
                if (z3) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i10 - iMin;
                    unsafeCursor.end = i10;
                    z3 = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j) {
        Segment segmentPush;
        k.e(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j < -1 || j > buffer.size()) {
            StringBuilder sbY = h.y(j, "offset=", " > size=");
            sbY.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(sbY.toString());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment$okio = buffer.head;
        long j8 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j9 = unsafeCursor.offset;
            int i4 = unsafeCursor.start;
            k.b(unsafeCursor.getSegment$okio());
            long j10 = j9 - (i4 - r9.pos);
            if (j10 > j) {
                segmentPush = segment$okio;
                segment$okio = unsafeCursor.getSegment$okio();
                size = j10;
            } else {
                segmentPush = unsafeCursor.getSegment$okio();
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
        if (unsafeCursor.readWrite) {
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
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j;
        k.b(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i12 = segmentPush.pos + ((int) (j - j8));
        unsafeCursor.start = i12;
        int i13 = segmentPush.limit;
        unsafeCursor.end = i13;
        return i13 - i12;
    }

    public static final int commonSelect(com.applovin.shadow.okio.Buffer buffer, Options options) throws EOFException {
        k.e(buffer, "<this>");
        k.e(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j8 = iMin;
            buffer.setSize$okio(buffer.size() - j8);
            j -= j8;
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(com.applovin.shadow.okio.Buffer buffer) {
        k.e(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            k.b(segment);
            Segment segment2 = segment.prev;
            k.b(segment2);
            return (segment2.limit + i4 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i4, int i10) {
        k.e(buffer, "<this>");
        k.e(byteString, "byteString");
        byteString.write$okio(buffer, i4, i10);
        return buffer;
    }

    public static /* synthetic */ com.applovin.shadow.okio.Buffer commonWrite$default(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i4, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i4 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        k.e(buffer, "<this>");
        k.e(byteString, "byteString");
        byteString.write$okio(buffer, i4, i10);
        return buffer;
    }

    public static final long commonWriteAll(com.applovin.shadow.okio.Buffer buffer, Source source) throws IOException {
        k.e(buffer, "<this>");
        k.e(source, "source");
        long j = 0;
        while (true) {
            long j8 = source.read(buffer, 8192L);
            if (j8 == -1) {
                return j;
            }
            j += j8;
        }
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteByte(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i4;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteDecimalLong(com.applovin.shadow.okio.Buffer buffer, long j) {
        boolean z3;
        k.e(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        int i4 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
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
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i4;
        while (j != 0) {
            long j8 = 10;
            i10--;
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (j % j8)];
            j /= j8;
        }
        if (z3) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i4;
        buffer.setSize$okio(buffer.size() + i4);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer buffer, long j) {
        k.e(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
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
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i4) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i4;
        buffer.setSize$okio(buffer.size() + i4);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteInt(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i4 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteLong(com.applovin.shadow.okio.Buffer buffer, long j) {
        k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
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
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteShort(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8(com.applovin.shadow.okio.Buffer buffer, String str, int i4, int i10) {
        char cCharAt;
        k.e(buffer, "<this>");
        k.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(u.r(i4, "beginIndex < 0: ").toString());
        }
        if (i10 < i4) {
            throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > str.length()) {
            StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        while (i4 < i10) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
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
                buffer.setSize$okio(buffer.size() + i14);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i17 = i4 + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i4 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8CodePoint(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        if (i4 < 128) {
            buffer.writeByte(i4);
            return buffer;
        }
        if (i4 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i4 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i4 && i4 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i4 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i4 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i4 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i4));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i4 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i4 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i4 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i4 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i4, byte[] bArr, int i10, int i11) {
        k.e(segment, "segment");
        k.e(bArr, "bytes");
        int i12 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i10 < i11) {
            if (i4 == i12) {
                segment = segment.next;
                k.b(segment);
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i4 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr2[i4] != bArr[i10]) {
                return false;
            }
            i4++;
            i10++;
        }
        return true;
    }

    public static final String readUtf8Line(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        if (j > 0) {
            long j8 = j - 1;
            if (buffer.getByte(j8) == 13) {
                String utf8 = buffer.readUtf8(j8);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(com.applovin.shadow.okio.Buffer buffer, long j, e eVar) {
        k.e(buffer, "<this>");
        k.e(eVar, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) eVar.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                k.b(segment);
                size -= segment.limit - segment.pos;
            }
            return (T) eVar.invoke(segment, Long.valueOf(size));
        }
        long j8 = 0;
        while (true) {
            long j9 = (segment.limit - segment.pos) + j8;
            if (j9 > j) {
                return (T) eVar.invoke(segment, Long.valueOf(j8));
            }
            segment = segment.next;
            k.b(segment);
            j8 = j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int selectPrefix(com.applovin.shadow.okio.Buffer r17, com.applovin.shadow.okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.selectPrefix(com.applovin.shadow.okio.Buffer, com.applovin.shadow.okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(com.applovin.shadow.okio.Buffer buffer, Options options, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return selectPrefix(buffer, options, z3);
    }

    public static final int commonRead(com.applovin.shadow.okio.Buffer buffer, byte[] bArr, int i4, int i10) {
        k.e(buffer, "<this>");
        k.e(bArr, "sink");
        SegmentedByteString.checkOffsetAndCount(bArr.length, i4, i10);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i11 = segment.pos;
        m.O(bArr2, i4, bArr, i11, i11 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.Buffer buffer, long j) throws EOFException {
        k.e(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(g.j(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(buffer.readByteArray(j));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j);
        buffer.skip(j);
        return byteStringSnapshot;
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, byte[] bArr) {
        k.e(buffer, "<this>");
        k.e(bArr, "source");
        return buffer.write(bArr, 0, bArr.length);
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, byte[] bArr, int i4, int i10) {
        k.e(buffer, "<this>");
        k.e(bArr, "source");
        long j = i10;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i4, j);
        int i11 = i10 + i4;
        while (i4 < i11) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i11 - i4, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i4 + iMin;
            m.O(bArr, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, i4, i12);
            segmentWritableSegment$okio.limit += iMin;
            i4 = i12;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer buffer2, long j) throws EOFException {
        k.e(buffer, "<this>");
        k.e(buffer2, "sink");
        if (buffer.size() >= j) {
            buffer2.write(buffer, j);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(com.applovin.shadow.okio.Buffer buffer, int i4) {
        k.e(buffer, "<this>");
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i4);
        Segment segment = buffer.head;
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
        Segment segment2 = buffer.head;
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

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, Source source, long j) throws IOException {
        k.e(buffer, "<this>");
        k.e(source, "source");
        while (j > 0) {
            long j8 = source.read(buffer, j);
            if (j8 == -1) {
                throw new EOFException();
            }
            j -= j8;
        }
        return buffer;
    }

    public static final long commonRead(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer buffer2, long j) {
        k.e(buffer, "<this>");
        k.e(buffer2, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(g.j(j, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        buffer2.write(buffer, j);
        return j;
    }

    public static final void commonWrite(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer buffer2, long j) {
        Segment segment;
        k.e(buffer, "<this>");
        k.e(buffer2, "source");
        if (buffer2 != buffer) {
            SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = buffer2.head;
                k.b(segment2);
                int i4 = segment2.limit;
                k.b(buffer2.head);
                if (j < i4 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        k.b(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer2.head;
                            k.b(segment4);
                            segment4.writeTo(segment, (int) j);
                            buffer2.setSize$okio(buffer2.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment5 = buffer2.head;
                    k.b(segment5);
                    buffer2.head = segment5.split((int) j);
                }
                Segment segment6 = buffer2.head;
                k.b(segment6);
                long j8 = segment6.limit - segment6.pos;
                buffer2.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    k.b(segment7);
                    Segment segment8 = segment7.prev;
                    k.b(segment8);
                    segment8.push(segment6).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j8);
                buffer.setSize$okio(buffer.size() + j8);
                j -= j8;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, long j) {
        int i4;
        long j8 = j;
        k.e(buffer, "<this>");
        k.e(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j8 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j8 < j8) {
                size = buffer.size();
                while (size > j8) {
                    segment = segment.prev;
                    k.b(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = byteString.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = byteString.size();
                long size3 = (buffer.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i4 = (int) ((segment.pos + j8) - size);
                    while (i4 < iMin) {
                        if (bArr[i4] != b10 || !rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                            i4++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    k.b(segment);
                    j8 = size;
                }
                return -1L;
            }
            while (true) {
                long j9 = (segment.limit - segment.pos) + size;
                if (j9 > j8) {
                    break;
                }
                segment = segment.next;
                k.b(segment);
                size = j9;
            }
            byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = byteString.size();
            long size5 = (buffer.size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j10 = size5;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i4 = (int) ((segment.pos + j8) - size);
                while (i4 < iMin2) {
                    if (bArr2[i4] == b11 && rangeEquals(segment, i4 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i4++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                k.b(segment);
                size5 = j10;
                j8 = size;
            }
            return -1L;
            return (i4 - segment.pos) + size;
        }
        throw new IllegalArgumentException(g.j(j8, "fromIndex < 0: ").toString());
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }
}
