package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xz0 implements AutoCloseable {
    public final long f = System.nanoTime();
    public final Duration g;
    public final SelectionKey h;

    public xz0(Duration duration) throws Throwable {
        Selector selectorOpen;
        this.g = duration;
        SocketChannel socketChannelOpen = SocketChannel.open();
        try {
            selectorOpen = Selector.open();
            try {
                socketChannelOpen.configureBlocking(false);
                this.h = socketChannelOpen.register(selectorOpen, 1);
            } catch (Throwable th) {
                th = th;
                if (selectorOpen != null) {
                    selectorOpen.close();
                }
                socketChannelOpen.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            selectorOpen = null;
        }
    }

    public final void a(SelectionKey selectionKey) throws SocketTimeoutException {
        long millis = this.g.minus(System.nanoTime() - this.f, ChronoUnit.NANOS).toMillis();
        if ((millis > 0 ? selectionKey.selector().select(millis) : millis == 0 ? selectionKey.selector().selectNow() : 0) == 0) {
            throw new SocketTimeoutException();
        }
    }

    public final byte[] c(int i) {
        SelectionKey selectionKey = this.h;
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        byte[] bArr = new byte[i];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        selectionKey.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (selectionKey.isReadable()) {
                    long j = socketChannel.read(byteBufferWrap);
                    if (j < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) j;
                    if (i2 < i && System.nanoTime() - this.f >= this.g.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    a(selectionKey);
                }
            } catch (Throwable th) {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
                throw th;
            }
        }
        if (selectionKey.isValid()) {
            selectionKey.interestOps(0);
        }
        return bArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        SelectionKey selectionKey = this.h;
        selectionKey.selector().close();
        selectionKey.channel().close();
    }
}
