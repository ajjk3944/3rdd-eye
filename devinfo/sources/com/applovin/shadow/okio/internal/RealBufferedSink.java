package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* loaded from: classes.dex */
public final class RealBufferedSink {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws Throwable {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        k.e(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        k.e(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Buffer buffer, long j) throws IOException {
        k.e(realBufferedSink, "<this>");
        k.e(buffer, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.write(buffer, j);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
        k.e(realBufferedSink, "<this>");
        k.e(source, "source");
        long j = 0;
        while (true) {
            long j8 = source.read(realBufferedSink.bufferField, 8192L);
            if (j8 == -1) {
                return j;
            }
            j += j8;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeByte(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeDecimalLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeInt(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeIntLe(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLongLe(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShort(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShortLe(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String str) {
        k.e(realBufferedSink, "<this>");
        k.e(str, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i4) {
        k.e(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i4);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        k.e(realBufferedSink, "<this>");
        k.e(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String str, int i4, int i10) {
        k.e(realBufferedSink, "<this>");
        k.e(str, "string");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i4, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString, int i4, int i10) {
        k.e(realBufferedSink, "<this>");
        k.e(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i4, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] bArr) {
        k.e(realBufferedSink, "<this>");
        k.e(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] bArr, int i4, int i10) {
        k.e(realBufferedSink, "<this>");
        k.e(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i4, i10);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source, long j) throws IOException {
        k.e(realBufferedSink, "<this>");
        k.e(source, "source");
        while (j > 0) {
            long j8 = source.read(realBufferedSink.bufferField, j);
            if (j8 != -1) {
                j -= j8;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
