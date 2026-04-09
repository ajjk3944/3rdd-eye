package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mh0 implements ch0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final long d;
    public final DatagramChannel e;
    public final CompletableFuture f;
    public final /* synthetic */ nh0 g;

    public mh0(nh0 nh0Var, int i, byte[] bArr, int i2, long j, DatagramChannel datagramChannel, CompletableFuture completableFuture) {
        this.g = nh0Var;
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = j;
        this.e = datagramChannel;
        this.f = completableFuture;
    }

    @Override // defpackage.ch0
    public final void a(SelectionKey selectionKey) throws IOException {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.m;
        boolean zIsReadable = selectionKey.isReadable();
        int i = this.a;
        if (!zIsReadable) {
            b(new EOFException("Key for transaction " + i + " is not readable"));
            concurrentLinkedQueue.remove(this);
            return;
        }
        DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.c);
        try {
            int i2 = datagramChannel.read(byteBufferAllocate);
            if (i2 <= 0) {
                throw new EOFException();
            }
            byteBufferAllocate.flip();
            byte[] bArr = new byte[i2];
            System.arraycopy(byteBufferAllocate.array(), 0, bArr, 0, i2);
            String strF = ex0.f("UDP read: transaction id=", i);
            datagramChannel.socket().getLocalSocketAddress();
            datagramChannel.socket().getRemoteSocketAddress();
            dh0.d(strF, bArr);
            DatagramChannel datagramChannel2 = this.e;
            try {
                datagramChannel2.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                nh0.e(datagramChannel2);
                throw th;
            }
            nh0.e(datagramChannel2);
            this.f.complete(bArr);
            concurrentLinkedQueue.remove(this);
        } catch (IOException e) {
            b(e);
            concurrentLinkedQueue.remove(this);
        }
    }

    public final void b(IOException iOException) {
        DatagramChannel datagramChannel = this.e;
        try {
            datagramChannel.disconnect();
        } catch (IOException unused) {
        } catch (Throwable th) {
            nh0.e(datagramChannel);
            throw th;
        }
        nh0.e(datagramChannel);
        this.f.completeExceptionally(iOException);
    }

    public final void c() {
        byte[] bArr = this.b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        StringBuilder sb = new StringBuilder("UDP write: transaction id=");
        int i = this.a;
        sb.append(i);
        String string = sb.toString();
        DatagramChannel datagramChannel = this.e;
        datagramChannel.socket().getLocalSocketAddress();
        datagramChannel.socket().getRemoteSocketAddress();
        dh0.d(string, bArr);
        int iSend = datagramChannel.send(byteBufferWrap, datagramChannel.socket().getRemoteSocketAddress());
        if (iSend == 0) {
            throw new EOFException(ex0.f("Insufficient room for the datagram in the underlying output buffer for transaction ", i));
        }
        if (iSend < bArr.length) {
            throw new EOFException(ex0.f("Could not send all data for transaction ", i));
        }
    }
}
