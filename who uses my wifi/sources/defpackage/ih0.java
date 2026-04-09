package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ih0 implements ch0 {
    public final SocketChannel a;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final ByteBuffer c = ByteBuffer.allocate(2);
    public final ByteBuffer d = ByteBuffer.allocate(65535);
    public int e = 0;
    public final /* synthetic */ kh0 f;

    public ih0(kh0 kh0Var, SocketChannel socketChannel) {
        this.f = kh0Var;
        this.a = socketChannel;
    }

    @Override // defpackage.ch0
    public final void a(SelectionKey selectionKey) throws IOException {
        if (selectionKey.isValid()) {
            boolean zIsConnectable = selectionKey.isConnectable();
            SocketChannel socketChannel = this.a;
            if (zIsConnectable) {
                try {
                    socketChannel.finishConnect();
                    selectionKey.interestOps(4);
                    return;
                } catch (IOException e) {
                    b(e);
                    return;
                }
            }
            boolean zIsWritable = selectionKey.isWritable();
            ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
            if (zIsWritable) {
                Iterator it = concurrentLinkedQueue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        selectionKey.interestOps(1);
                        break;
                    }
                    jh0 jh0Var = (jh0) it.next();
                    try {
                    } catch (IOException e2) {
                        jh0Var.e.completeExceptionally(e2);
                        it.remove();
                    }
                    if (!jh0Var.a()) {
                        selectionKey.interestOps(4);
                        break;
                    }
                    continue;
                }
            }
            if (selectionKey.isReadable()) {
                ByteBuffer byteBuffer = this.c;
                try {
                    int i = this.e;
                    ByteBuffer byteBuffer2 = this.d;
                    if (i == 0) {
                        if (socketChannel.read(byteBuffer) < 0) {
                            b(new EOFException());
                            return;
                        } else if (byteBuffer.position() == 2) {
                            int i2 = ((byteBuffer.get(0) & 255) << 8) + (byteBuffer.get(1) & 255);
                            byteBuffer.flip();
                            byteBuffer2.limit(i2);
                            this.e = 1;
                        }
                    }
                    if (socketChannel.read(byteBuffer2) < 0) {
                        b(new EOFException());
                        return;
                    }
                    if (byteBuffer2.hasRemaining()) {
                        return;
                    }
                    this.e = 0;
                    byteBuffer2.flip();
                    int iLimit = byteBuffer2.limit();
                    byte[] bArr = new byte[iLimit];
                    System.arraycopy(byteBuffer2.array(), byteBuffer2.arrayOffset(), bArr, 0, byteBuffer2.limit());
                    if (iLimit < 2) {
                        socketChannel.socket().getLocalSocketAddress();
                        socketChannel.socket().getRemoteSocketAddress();
                        dh0.d("TCP read: response too short for a valid reply, discarding", bArr);
                        return;
                    }
                    int i3 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                    String strF = ex0.f("TCP read: transaction id=", i3);
                    socketChannel.socket().getLocalSocketAddress();
                    socketChannel.socket().getRemoteSocketAddress();
                    dh0.d(strF, bArr);
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        jh0 jh0Var2 = (jh0) it2.next();
                        if (i3 == jh0Var2.a.f.f) {
                            jh0Var2.e.complete(bArr);
                            it2.remove();
                            return;
                        }
                    }
                    kh0.k.m(Integer.valueOf(i3), "Transaction for answer to id {} not found");
                } catch (IOException e3) {
                    b(e3);
                }
            }
        }
    }

    public final void b(IOException iOException) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((jh0) it.next()).e.completeExceptionally(iOException);
            it.remove();
        }
        ConcurrentHashMap concurrentHashMap = this.f.j;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() == this) {
                concurrentHashMap.remove(entry.getKey());
                try {
                    this.a.close();
                    return;
                } catch (IOException e) {
                    i80 i80Var = kh0.k;
                    ((hh0) entry.getKey()).getClass();
                    i80Var.n("Failed to close channel l={}/r={}", null, ((hh0) entry.getKey()).a, e);
                    return;
                }
            }
        }
    }
}
