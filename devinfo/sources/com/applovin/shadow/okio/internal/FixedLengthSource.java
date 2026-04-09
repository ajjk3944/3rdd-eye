package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSource;
import com.applovin.shadow.okio.Source;
import java.io.IOException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source source, long j, boolean z3) {
        super(source);
        k.e(source, "delegate");
        this.size = j;
        this.truncate = z3;
    }

    private final void truncateToSize(Buffer buffer, long j) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j);
        buffer2.clear();
    }

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        k.e(buffer, "sink");
        long j8 = this.bytesReceived;
        long j9 = this.size;
        if (j8 > j9) {
            j = 0;
        } else if (this.truncate) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j = Math.min(j, j10);
        }
        long j11 = super.read(buffer, j);
        if (j11 != -1) {
            this.bytesReceived += j11;
        }
        long j12 = this.bytesReceived;
        long j13 = this.size;
        if ((j12 >= j13 || j11 != -1) && j12 <= j13) {
            return j11;
        }
        if (j11 > 0 && j12 > j13) {
            truncateToSize(buffer, buffer.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
