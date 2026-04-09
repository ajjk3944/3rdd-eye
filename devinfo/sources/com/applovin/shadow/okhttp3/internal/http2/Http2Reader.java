package com.applovin.shadow.okhttp3.internal.http2;

import a0.g;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http2.Hpack;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.applovin.shadow.okio.internal.Buffer;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.u;
import nk.f;
import nk.k;
import r5.c;
import sk.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i4, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i4--;
            }
            if (i11 <= i4) {
                return i4 - i11;
            }
            throw new IOException(g.i(i11, i4, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface Handler {
        void ackSettings();

        void alternateService(int i4, String str, ByteString byteString, String str2, int i10, long j);

        void data(boolean z3, int i4, BufferedSource bufferedSource, int i10) throws IOException;

        void goAway(int i4, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z3, int i4, int i10, List<Header> list);

        void ping(boolean z3, int i4, int i10);

        void priority(int i4, int i10, int i11, boolean z3);

        void pushPromise(int i4, int i10, List<Header> list) throws IOException;

        void rstStream(int i4, ErrorCode errorCode);

        void settings(boolean z3, Settings settings);

        void windowUpdate(int i4, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        k.d(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z3) {
        k.e(bufferedSource, "source");
        this.source = bufferedSource;
        this.client = z3;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, Buffer.SEGMENTING_THRESHOLD, 0, 4, null);
    }

    private final void readData(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z3, i11, this.source, Companion.lengthWithoutPadding(i4, i10, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i4 < 8) {
            throw new IOException(u.r(i4, "TYPE_GOAWAY length < 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i12 = this.source.readInt();
        int i13 = this.source.readInt();
        int i14 = i4 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i13);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(u.r(i13, "TYPE_GOAWAY unexpected error code: "));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i14 > 0) {
            byteString = this.source.readByteString(i14);
        }
        handler.goAway(i12, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i4, int i10, int i11, int i12) throws IOException {
        this.continuation.setLeft(i4);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i10);
        this.continuation.setFlags(i11);
        this.continuation.setStreamId(i12);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = (i10 & 1) != 0;
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i10 & 32) != 0) {
            readPriority(handler, i11);
            i4 -= 5;
        }
        handler.headers(z3, i11, -1, readHeaderBlock(Companion.lengthWithoutPadding(i4, i10, iAnd), iAnd, i10, i11));
    }

    private final void readPing(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i4 != 8) {
            throw new IOException(u.r(i4, "TYPE_PING length != 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i10 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i4 != 5) {
            throw new IOException(c.h(i4, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i11 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, i11);
    }

    private final void readPushPromise(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i11, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i4 - 4, i10, iAnd), iAnd, i10, i11));
    }

    private final void readRstStream(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i4 != 4) {
            throw new IOException(c.h(i4, "TYPE_RST_STREAM length: ", " != 4"));
        }
        if (i11 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i12 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i12);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(u.r(i12, "TYPE_RST_STREAM unexpected error code: "));
        }
        handler.rstStream(i11, errorCodeFromHttp2);
    }

    private final void readSettings(Handler handler, int i4, int i10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i10 & 1) != 0) {
            if (i4 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i4 % 6 != 0) {
            throw new IOException(u.r(i4, "TYPE_SETTINGS length % 6 != 0: "));
        }
        Settings settings = new Settings();
        b bVarC = ci.b.C(ci.b.E(0, i4), 6);
        int i13 = bVarC.f33817a;
        int i14 = bVarC.f33818b;
        int i15 = bVarC.f33819c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                i12 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i12 < 16384 || i12 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i12 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i12 != 0 && i12 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i12);
                if (i13 == i14) {
                    break;
                } else {
                    i13 += i15;
                }
            }
            throw new IOException(u.r(i12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i4, int i10, int i11) throws IOException {
        if (i4 != 4) {
            throw new IOException(u.r(i4, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i11, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z3, Handler handler) throws IOException {
        k.e(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(u.r(medium, "FRAME_SIZE_ERROR: "));
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i4 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i4, medium, iAnd, iAnd2));
            }
            if (z3 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i4);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i4);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i4);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i4);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i4);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i4);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i4);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i4);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i4);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        k.e(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (k.a(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    private final void readPriority(Handler handler, int i4) throws IOException {
        int i10 = this.source.readInt();
        handler.priority(i4, i10 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            k.e(bufferedSource, "source");
            this.source = bufferedSource;
        }

        private final void readContinuationHeader() throws IOException {
            int i4 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i10 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i10;
            if (iAnd == 9) {
                if (i10 != i4) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(com.applovin.shadow.okio.Buffer buffer, long j) throws IOException {
            k.e(buffer, "sink");
            while (true) {
                int i4 = this.left;
                if (i4 != 0) {
                    long j8 = this.source.read(buffer, Math.min(j, i4));
                    if (j8 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j8;
                    return j8;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i4) {
            this.flags = i4;
        }

        public final void setLeft(int i4) {
            this.left = i4;
        }

        public final void setLength(int i4) {
            this.length = i4;
        }

        public final void setPadding(int i4) {
            this.padding = i4;
        }

        public final void setStreamId(int i4) {
            this.streamId = i4;
        }

        @Override // com.applovin.shadow.okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
