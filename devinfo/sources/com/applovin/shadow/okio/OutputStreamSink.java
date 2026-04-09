package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.OutputStream;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        k.e(outputStream, "out");
        k.e(timeout, "timeout");
        this.out = outputStream;
        this.timeout = timeout;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        k.e(buffer, "source");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
        while (j > 0) {
            this.timeout.throwIfReached();
            Segment segment = buffer.head;
            k.b(segment);
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j8 = iMin;
            j -= j8;
            buffer.setSize$okio(buffer.size() - j8);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
