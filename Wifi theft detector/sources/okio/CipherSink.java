package okio;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "Lokio/BufferedSink;", "sink", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "Lokio/Buffer;", "source", "", "remaining", "", "update", "(Lokio/Buffer;J)I", "", "doFinal", "()Ljava/lang/Throwable;", "byteCount", "Ly8/s;", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "Lokio/BufferedSink;", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "blockSize", "I", "", "closed", "Z", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class CipherSink implements Sink {
    private final int blockSize;

    @NotNull
    private final Cipher cipher;
    private boolean closed;

    @NotNull
    private final BufferedSink sink;

    public CipherSink(@NotNull BufferedSink sink, @NotNull Cipher cipher) {
        p.e(sink, "sink");
        p.e(cipher, "cipher");
        this.sink = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (!(blockSize > 0)) {
            throw new IllegalArgumentException(p.m("Block cipher required ", getCipher()).toString());
        }
    }

    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        Buffer buffer = this.sink.getBuffer();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
            segmentWritableSegment$okio.limit += iDoFinal;
            buffer.setSize$okio(buffer.size() + iDoFinal);
        } catch (Throwable th2) {
            th = th2;
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        return th;
    }

    private final int update(Buffer source, long remaining) throws IOException, ShortBufferException {
        Segment segment = source.head;
        p.b(segment);
        int iMin = (int) Math.min(remaining, segment.limit - segment.pos);
        Buffer buffer = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(iMin);
        int i10 = iMin;
        while (outputSize > 8192) {
            int i11 = this.blockSize;
            if (!(i10 > i11)) {
                throw new IllegalStateException(("Unexpected output size " + outputSize + " for input size " + i10).toString());
            }
            i10 -= i11;
            outputSize = this.cipher.getOutputSize(i10);
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i10, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
        segmentWritableSegment$okio.limit += iUpdate;
        buffer.setSize$okio(buffer.size() + iUpdate);
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        source.setSize$okio(source.size() - i10);
        int i12 = segment.pos + i10;
        segment.pos = i12;
        if (i12 == segment.limit) {
            source.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return i10;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable thDoFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (thDoFinal == null) {
                thDoFinal = th;
            }
        }
        if (thDoFinal != null) {
            throw thDoFinal;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.sink.flush();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.sink.getTimeout();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        p.e(source, "source");
        _UtilKt.checkOffsetAndCount(source.size(), 0L, byteCount);
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long jUpdate = byteCount;
        while (jUpdate > 0) {
            jUpdate -= update(source, jUpdate);
        }
    }
}
