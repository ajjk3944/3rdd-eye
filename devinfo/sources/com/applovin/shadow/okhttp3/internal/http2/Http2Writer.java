package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http2.Hpack;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.u;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(BufferedSink bufferedSink, boolean z3) {
        k.e(bufferedSink, "sink");
        this.sink = bufferedSink;
        this.client = z3;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int i4, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.maxFrameSize, j);
            j -= jMin;
            frameHeader(i4, (int) jMin, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        try {
            k.e(settings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void data(boolean z3, int i4, Buffer buffer, int i10) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i4, z3 ? 1 : 0, buffer, i10);
    }

    public final void dataFrame(int i4, int i10, Buffer buffer, int i11) throws IOException {
        frameHeader(i4, i11, 0, i10);
        if (i11 > 0) {
            BufferedSink bufferedSink = this.sink;
            k.b(buffer);
            bufferedSink.write(buffer, i11);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i4, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        int i16;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i13 = i4;
            i14 = i10;
            i15 = i11;
            i16 = i12;
            logger2.fine(Http2.INSTANCE.frameLog(false, i13, i14, i15, i16));
        } else {
            i13 = i4;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        if (i14 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            throw new IllegalArgumentException(u.r(i13, "reserved bit set: ").toString());
        }
        Util.writeMedium(this.sink, i14);
        this.sink.writeByte(i15 & 255);
        this.sink.writeByte(i16 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i13);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i4, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            k.e(errorCode, "errorCode");
            k.e(bArr, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.writeInt(i4);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(bArr.length == 0)) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void headers(boolean z3, int i4, List<Header> list) throws IOException {
        k.e(list, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i10 = size == jMin ? 4 : 0;
        if (z3) {
            i10 |= 1;
        }
        frameHeader(i4, (int) jMin, 1, i10);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(i4, size - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z3, int i4, int i10) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z3 ? 1 : 0);
        this.sink.writeInt(i4);
        this.sink.writeInt(i10);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i4, int i10, List<Header> list) throws IOException {
        k.e(list, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(this.maxFrameSize - 4, size);
        long j = iMin;
        frameHeader(i4, iMin + 4, 5, size == j ? 4 : 0);
        this.sink.writeInt(i10 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j);
        if (size > j) {
            writeContinuationFrames(i4, size - j);
        }
    }

    public final synchronized void rstStream(int i4, ErrorCode errorCode) throws IOException {
        k.e(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(i4, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        try {
            k.e(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i4 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i4 < 10) {
                if (settings.isSet(i4)) {
                    this.sink.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                    this.sink.writeInt(settings.get(i4));
                }
                i4++;
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void windowUpdate(int i4, long j) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        frameHeader(i4, 4, 8, 0);
        this.sink.writeInt((int) j);
        this.sink.flush();
    }
}
