package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jh0 {
    public final me0 a;
    public final byte[] b;
    public final long c;
    public final SocketChannel d;
    public final CompletableFuture e;
    public ByteBuffer f;
    public long g = 0;

    public jh0(me0 me0Var, byte[] bArr, long j, SocketChannel socketChannel, CompletableFuture completableFuture) {
        this.a = me0Var;
        this.b = bArr;
        this.c = j;
        this.d = socketChannel;
        this.e = completableFuture;
    }

    public final boolean a() {
        long j = this.g;
        byte[] bArr = this.b;
        if (j == bArr.length + 2) {
            return true;
        }
        if (this.f == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 2);
            this.f = byteBufferAllocate;
            byteBufferAllocate.put((byte) (bArr.length >>> 8));
            this.f.put((byte) (bArr.length & 255));
            this.f.put(bArr);
            this.f.flip();
        }
        StringBuilder sb = new StringBuilder("TCP write: transaction id=");
        me0 me0Var = this.a;
        sb.append(me0Var.f.f);
        String string = sb.toString();
        SocketChannel socketChannel = this.d;
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        ByteBuffer byteBuffer = this.f;
        if (dh0.a.s()) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            int iPosition = byteBuffer.position();
            byteBuffer.get(bArr2, 0, byteBuffer.remaining());
            byteBuffer.position(iPosition);
            dh0.d(string, bArr2);
        }
        while (this.f.hasRemaining()) {
            long jWrite = socketChannel.write(this.f);
            long j2 = this.g + jWrite;
            this.g = j2;
            if (jWrite == 0) {
                kh0.k.o(Integer.valueOf(me0Var.f.f), "Insufficient room for the data in the underlying output buffer for transaction {}, retrying");
                return false;
            }
            if (j2 < bArr.length) {
                kh0.k.e("Wrote {} of {} bytes data for transaction {}", Long.valueOf(j2), Integer.valueOf(bArr.length), Integer.valueOf(me0Var.f.f));
            }
        }
        kh0.k.f("Send for transaction {} is complete, wrote {} bytes", Integer.valueOf(me0Var.f.f), Long.valueOf(this.g));
        return true;
    }
}
