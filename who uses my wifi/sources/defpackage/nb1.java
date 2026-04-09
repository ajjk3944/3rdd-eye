package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nb1 {
    public static final i80 l = k80.d(nb1.class);
    public final gg0 a;
    public final int b;
    public final int c;
    public vq2 d;
    public final SocketAddress e;
    public xz0 f;
    public Duration g = Duration.ofMinutes(15);
    public int h;
    public long i;
    public long j;
    public tn0 k;

    public nb1(gg0 gg0Var, SocketAddress socketAddress) {
        this.e = socketAddress;
        if (gg0Var.isAbsolute()) {
            this.a = gg0Var;
        } else {
            try {
                this.a = gg0.e(gg0Var, gg0.l);
            } catch (hg0 unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.b = 252;
        this.c = 1;
        this.h = 0;
    }

    public static void b(String str) throws lb1 {
        throw new lb1(str);
    }

    public final void a() throws lb1, t91 {
        int i;
        gg0 gg0Var = this.a;
        int i2 = this.b;
        int i3 = this.c;
        long j = 0;
        tn0 tn0VarI = tn0.i(gg0Var, i2, i3, 0L);
        me0 me0Var = new me0();
        me0Var.f.e();
        me0Var.b(tn0VarI, 0);
        if (i2 == 251) {
            gg0 gg0Var2 = gg0.l;
            rr0 rr0Var = new rr0(gg0Var, 6, i3);
            tn0.b("host", gg0Var2);
            rr0Var.k = gg0Var2;
            tn0.b("admin", gg0Var2);
            rr0Var.l = gg0Var2;
            rr0Var.m = 0L;
            rr0Var.n = 0L;
            rr0Var.o = 0L;
            rr0Var.p = 0L;
            rr0Var.q = 0L;
            me0Var.b(rr0Var, 2);
        }
        t3 t3Var = new t3(2, (byte) 0);
        me0Var.l(t3Var);
        me0Var.h = t3Var.g;
        byte[] bArrI = t3Var.i();
        xz0 xz0Var = this.f;
        SelectionKey selectionKey = xz0Var.h;
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        dh0.d("TCP write", bArrI);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArrI.length >>> 8), (byte) (bArrI.length & 255)}), ByteBuffer.wrap(bArrI)};
        selectionKey.interestOps(4);
        int i4 = 0;
        while (i4 < bArrI.length + 2) {
            try {
                if (selectionKey.isWritable()) {
                    long j2 = j;
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < j2) {
                        throw new EOFException();
                    }
                    int i5 = i4 + ((int) jWrite);
                    if (i5 < bArrI.length + 2) {
                        i = i5;
                        if (System.nanoTime() - xz0Var.f >= xz0Var.g.toNanos()) {
                            throw new SocketTimeoutException();
                        }
                    } else {
                        i = i5;
                    }
                    j = j2;
                    i4 = i;
                } else {
                    long j3 = j;
                    xz0Var.a(selectionKey);
                    j = j3;
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
        while (this.h != 7) {
            xz0 xz0Var2 = this.f;
            byte[] bArrC = xz0Var2.c(2);
            byte[] bArrC2 = xz0Var2.c(((bArrC[0] & 255) << 8) + (bArrC[1] & 255));
            SocketChannel socketChannel2 = (SocketChannel) xz0Var2.h.channel();
            socketChannel2.socket().getLocalSocketAddress();
            socketChannel2.socket().getRemoteSocketAddress();
            dh0.d("TCP read", bArrC2);
            try {
                me0 me0Var2 = new me0(bArrC2);
                tt0.a.d(1);
                List list = me0Var2.g[1];
                List listUnmodifiableList = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
                me0Var2.f.getClass();
                if (this.h == 0) {
                    int iF = me0Var2.f();
                    if (iF != 0) {
                        if (i2 == 251 && iF == 4) {
                            b("server doesn't support IXFR");
                            throw null;
                        }
                        b(pn0.a.e(iF));
                        throw null;
                    }
                    tn0 tn0VarE = me0Var2.e();
                    if (tn0VarE != null && tn0VarE.g != i2) {
                        b("invalid question section");
                        throw null;
                    }
                    if (listUnmodifiableList.isEmpty() && i2 == 251) {
                        b("server doesn't support IXFR");
                        throw null;
                    }
                }
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    d((tn0) it.next());
                }
            } catch (IOException e) {
                if (!(e instanceof t91)) {
                    throw new t91("Error parsing message", e);
                }
                throw ((t91) e);
            }
        }
    }

    public final void c() {
        xz0 xz0Var = new xz0(this.g);
        this.f = xz0Var;
        SelectionKey selectionKey = xz0Var.h;
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        if (socketChannel.connect(this.e)) {
            return;
        }
        selectionKey.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!selectionKey.isConnectable()) {
                    xz0Var.a(selectionKey);
                }
            } finally {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            }
        }
    }

    public final void d(tn0 tn0Var) throws lb1 {
        int i = tn0Var.g;
        int i2 = this.h;
        gg0 gg0Var = this.a;
        i80 i80Var = l;
        switch (i2) {
            case 0:
                if (i != 6) {
                    b("missing initial SOA");
                    throw null;
                }
                this.k = tn0Var;
                long j = ((rr0) tn0Var).m;
                this.i = j;
                if (this.b == 251) {
                    if (j < 0 || j > 4294967295L) {
                        throw new IllegalArgumentException(j + " out of range");
                    }
                    if (j >= 4294967295L) {
                        j -= 4294967296L;
                    }
                    if (((int) j) <= 0) {
                        i80Var.f("{}: {}", gg0Var, "up to date");
                        this.h = 7;
                        return;
                    }
                }
                this.h = 1;
                return;
            case 1:
                if (this.b == 251 && i == 6 && ((rr0) tn0Var).m == 0) {
                    vq2 vq2Var = this.d;
                    vq2Var.getClass();
                    vq2Var.h = new ArrayList();
                    i80Var.f("{}: {}", gg0Var, "got incremental response");
                    this.h = 2;
                } else {
                    vq2 vq2Var2 = this.d;
                    vq2Var2.getClass();
                    vq2Var2.g = new ArrayList();
                    this.d.l(this.k);
                    i80Var.f("{}: {}", gg0Var, "got nonincremental response");
                    this.h = 6;
                }
                d(tn0Var);
                return;
            case 2:
                vq2 vq2Var3 = this.d;
                vq2Var3.getClass();
                mb1 mb1Var = new mb1();
                mb1Var.a = new ArrayList();
                ArrayList arrayList = new ArrayList();
                mb1Var.b = arrayList;
                arrayList.add(tn0Var);
                ((ArrayList) vq2Var3.h).add(mb1Var);
                this.h = 3;
                return;
            case 3:
                if (i != 6) {
                    this.d.l(tn0Var);
                    return;
                }
                this.j = ((rr0) tn0Var).m;
                this.h = 4;
                d(tn0Var);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.d.h;
                ((mb1) arrayList2.get(arrayList2.size() - 1)).a.add(tn0Var);
                this.h = 5;
                return;
            case 5:
                if (i != 6) {
                    this.d.l(tn0Var);
                    return;
                }
                long j2 = ((rr0) tn0Var).m;
                if (j2 == this.i) {
                    this.h = 7;
                    return;
                }
                if (j2 == this.j) {
                    this.h = 2;
                    d(tn0Var);
                    return;
                }
                b("IXFR out of sync: expected serial " + this.j + " , got " + j2);
                throw null;
            case 6:
                if (i != 1 || tn0Var.h == this.c) {
                    this.d.l(tn0Var);
                    if (i == 6) {
                        this.h = 7;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                b("extra data");
                throw null;
            default:
                b("invalid state");
                throw null;
        }
    }
}
