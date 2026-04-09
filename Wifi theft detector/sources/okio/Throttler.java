package okio;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import y8.s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0005J+\u0010\r\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokio/Throttler;", "", "", "allocatedUntil", "<init>", "(J)V", "()V", "nanosToBytes", "(J)J", "bytesToNanos", "nanosToWait", "Ly8/s;", "waitNanos", "bytesPerSecond", "waitByteCount", "maxByteCount", "(JJJ)V", "byteCount", "take$okio", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "J", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j10) {
        this.allocatedUntil = j10;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = throttler.waitByteCount;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j10, j13, j12);
    }

    private final long bytesToNanos(long j10) {
        return (j10 * C.NANOS_PER_SECOND) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j10) {
        return (j10 * this.bytesPerSecond) / C.NANOS_PER_SECOND;
    }

    private final void waitNanos(long nanosToWait) throws InterruptedException {
        long j10 = nanosToWait / 1000000;
        wait(j10, (int) (nanosToWait - (1000000 * j10)));
    }

    public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
        if (this.bytesPerSecond == 0) {
            return byteCount;
        }
        long jMax = Math.max(this.allocatedUntil - now, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= byteCount) {
            this.allocatedUntil = now + jMax + bytesToNanos(byteCount);
            return byteCount;
        }
        long j10 = this.waitByteCount;
        if (jNanosToBytes >= j10) {
            this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j10, byteCount);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    @JvmOverloads
    public final void bytesPerSecond(long j10) {
        bytesPerSecond$default(this, j10, 0L, 0L, 6, null);
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
        p.e(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            final /* synthetic */ Sink $sink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(sink);
                this.$sink = sink;
            }

            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer source, long byteCount) throws IOException {
                p.e(source, "source");
                while (byteCount > 0) {
                    try {
                        long jTake$okio = Throttler.this.take$okio(byteCount);
                        super.write(source, jTake$okio);
                        byteCount -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull Source source) {
        p.e(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            final /* synthetic */ Source $source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(source);
                this.$source = source;
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws InterruptedIOException {
                p.e(sink, "sink");
                try {
                    return super.read(sink, Throttler.this.take$okio(byteCount));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long byteCount) {
        long jByteCountOrWaitNanos$okio;
        if (!(byteCount > 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            while (true) {
                jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), byteCount);
                if (jByteCountOrWaitNanos$okio < 0) {
                    waitNanos(-jByteCountOrWaitNanos$okio);
                }
            }
        }
        return jByteCountOrWaitNanos$okio;
    }

    @JvmOverloads
    public final void bytesPerSecond(long j10, long j11) {
        bytesPerSecond$default(this, j10, j11, 0L, 4, null);
    }

    @JvmOverloads
    public final void bytesPerSecond(long bytesPerSecond, long waitByteCount, long maxByteCount) {
        synchronized (this) {
            if (!(bytesPerSecond >= 0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!(waitByteCount > 0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (maxByteCount >= waitByteCount) {
                this.bytesPerSecond = bytesPerSecond;
                this.waitByteCount = waitByteCount;
                this.maxByteCount = maxByteCount;
                notifyAll();
                s sVar = s.f25199a;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
