package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ew0 implements vp0 {
    public static final i80 e = k80.d(ew0.class);
    public static final InetSocketAddress f = new InetSocketAddress(InetAddress.getLoopbackAddress(), 53);
    public InetSocketAddress a;
    public ki0 b = new ki0();
    public Duration c = Duration.ofSeconds(10);
    public dn d = new dn();

    public ew0(String str) {
        if (str != null) {
            this.a = new InetSocketAddress("0".equals(str) ? InetAddress.getLoopbackAddress() : InetAddress.getByName(str), 53);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) wp0.a().a.get(0);
        this.a = inetSocketAddress;
        if (inetSocketAddress == null) {
            this.a = f;
        }
    }

    @Override // defpackage.vp0
    public final CompletionStage a(me0 me0Var) {
        return f(me0Var, ForkJoinPool.commonPool());
    }

    @Override // defpackage.vp0
    public final Duration b() {
        return this.c;
    }

    public final me0 d(me0 me0Var) throws t91 {
        nb1 nb1Var = new nb1(me0Var.e().f, this.a);
        nb1Var.g = this.c;
        try {
            nb1Var.d = new vq2(16);
            try {
                nb1Var.c();
                nb1Var.a();
                vq2 vq2Var = nb1Var.d;
                if (vq2Var == null) {
                    throw new IllegalArgumentException("ZoneTransferIn used callback interface");
                }
                ArrayList arrayList = (ArrayList) vq2Var.g;
                l00 l00Var = new l00(me0Var.f.f);
                me0 me0Var2 = new me0(l00Var);
                l00.a(5);
                int i = l00Var.g;
                l00.a(5);
                l00Var.g = i | 1024;
                l00 l00Var2 = me0Var2.f;
                l00Var2.getClass();
                int i2 = 0;
                l00.a(0);
                int i3 = l00Var2.g;
                l00.a(0);
                l00Var2.g = i3 | 32768;
                me0Var2.b(me0Var.e(), 0);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    me0Var2.b((tn0) obj, 1);
                }
                return me0Var2;
            } finally {
                try {
                    xz0 xz0Var = nb1Var.f;
                    if (xz0Var != null) {
                        xz0Var.close();
                    }
                } catch (IOException unused) {
                }
            }
        } catch (lb1 e2) {
            throw new t91(e2.getMessage());
        }
    }

    public final CompletableFuture e(me0 me0Var, boolean z, final Executor executor) throws Throwable {
        final CompletableFuture completableFuture;
        InetSocketAddress inetSocketAddress;
        final me0 me0Var2 = me0Var;
        dn dnVar = this.d;
        final InetSocketAddress inetSocketAddress2 = this.a;
        l00 l00Var = me0Var2.f;
        final int i = l00Var.f;
        int i2 = 0;
        boolean z2 = l00Var.d() != 5;
        try {
            t3 t3Var = new t3(2, (byte) 0);
            if (!me0Var2.l(t3Var) && !z2) {
                throw new ne0("Message size would exceed the allowed maximum of 65535 bytes");
            }
            me0Var2.h = t3Var.g;
            byte[] bArrI = t3Var.i();
            ki0 ki0VarD = me0Var2.d();
            int i3 = ki0VarD == null ? 512 : ki0VarD.h;
            boolean z3 = z || bArrI.length > i3;
            i80 i80Var = e;
            if (i80Var.s()) {
                Object[] objArr = {me0Var2.e().f, k31.a.e(me0Var2.e().g), Integer.valueOf(i), z3 ? "tcp" : "udp", inetSocketAddress2.getAddress().getHostAddress(), Integer.valueOf(inetSocketAddress2.getPort()), me0Var2};
                me0Var2 = me0Var2;
                i80Var.k("Sending {}/{}, id={} to {}/{}:{}, query:\n{}", objArr);
            } else if (i80Var.h()) {
                i80Var.e("Sending {}/{}, id={} to {}/{}:{}", me0Var2.e().f, k31.a.e(me0Var2.e().g), Integer.valueOf(i), z3 ? "tcp" : "udp", inetSocketAddress2.getAddress().getHostAddress(), Integer.valueOf(inetSocketAddress2.getPort()));
            }
            if (z3) {
                dnVar.getClass();
                vq2 vq2Var = dn.a;
                Duration duration = this.c;
                final kh0 kh0Var = (kh0) vq2Var.g;
                kh0Var.getClass();
                completableFuture = new CompletableFuture();
                try {
                    Selector selectorC = dh0.c();
                    long jNanoTime = System.nanoTime() + duration.toNanos();
                    ih0 ih0Var = (ih0) kh0Var.j.computeIfAbsent(new hh0(inetSocketAddress2), new Function() { // from class: gh0
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) throws IOException {
                            SocketChannel socketChannelOpen;
                            kh0 kh0Var2 = kh0Var;
                            i80 i80Var2 = kh0.k;
                            InetSocketAddress inetSocketAddress3 = inetSocketAddress2;
                            i80Var2.f("Opening async channel for l={}/r={}", null, inetSocketAddress3);
                            try {
                                socketChannelOpen = SocketChannel.open();
                                try {
                                    socketChannelOpen.configureBlocking(false);
                                    socketChannelOpen.connect(inetSocketAddress3);
                                    return new ih0(kh0Var2, socketChannelOpen);
                                } catch (IOException e2) {
                                    e = e2;
                                    if (socketChannelOpen != null) {
                                        try {
                                            socketChannelOpen.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    completableFuture.completeExceptionally(e);
                                    return null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                socketChannelOpen = null;
                            }
                        }
                    });
                    if (ih0Var != null) {
                        kh0.k.k("Creating transaction for id {} ({}/{})", Integer.valueOf(me0Var2.f.f), me0Var2.e().f, k31.a.e(me0Var2.e().g));
                        ih0Var.b.add(new jh0(me0Var2, bArrI, jNanoTime, ih0Var.a, completableFuture));
                        kh0Var.i.add(ih0Var);
                        selectorC.wakeup();
                    }
                } catch (IOException e2) {
                    completableFuture.completeExceptionally(e2);
                }
            } else {
                dnVar.getClass();
                vq2 vq2Var2 = dn.a;
                Duration duration2 = this.c;
                nh0 nh0Var = (nh0) vq2Var2.h;
                int i4 = nh0Var.i;
                int i5 = nh0Var.j;
                SecureRandom secureRandom = nh0Var.k;
                long nanos = duration2.toNanos() + System.nanoTime();
                CompletableFuture completableFuture2 = new CompletableFuture();
                DatagramChannel datagramChannel = null;
                try {
                    Selector selectorC2 = dh0.c();
                    DatagramChannel datagramChannelOpen = DatagramChannel.open();
                    try {
                        try {
                            datagramChannelOpen.configureBlocking(false);
                            try {
                                mh0 mh0Var = new mh0(nh0Var, me0Var2.f.f, bArrI, i3, nanos, datagramChannelOpen, completableFuture2);
                                datagramChannelOpen = datagramChannelOpen;
                                completableFuture = completableFuture2;
                                while (true) {
                                    if (i2 >= 1024) {
                                        mh0Var.b(new IOException("No available source port found"));
                                        break;
                                    }
                                    if (secureRandom != null) {
                                        try {
                                            try {
                                                inetSocketAddress = new InetSocketAddress(secureRandom.nextInt(i5) + i4);
                                            } catch (IOException e3) {
                                                e = e3;
                                                datagramChannel = datagramChannelOpen;
                                                nh0.e(datagramChannel);
                                                completableFuture.completeExceptionally(e);
                                                final boolean z4 = z3;
                                                return completableFuture.thenComposeAsync(new Function() { // from class: dw0
                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) throws t91 {
                                                        byte[] bArr = (byte[]) obj;
                                                        CompletableFuture completableFuture3 = new CompletableFuture();
                                                        if (bArr.length < 12) {
                                                            completableFuture3.completeExceptionally(new t91("invalid DNS header - too short"));
                                                            return completableFuture3;
                                                        }
                                                        int i6 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                                                        int i7 = i;
                                                        if (i6 != i7) {
                                                            completableFuture3.completeExceptionally(new t91("invalid message id: expected " + i7 + "; got id " + i6));
                                                            return completableFuture3;
                                                        }
                                                        try {
                                                            me0 me0Var3 = new me0(bArr);
                                                            me0 me0Var4 = me0Var2;
                                                            if (me0Var4.f.d() == 5) {
                                                                if (me0Var3.f.d() != 5) {
                                                                    completableFuture3.completeExceptionally(new t91("invalid message: opcode response is not UPDATE"));
                                                                    return completableFuture3;
                                                                }
                                                            } else {
                                                                if (me0Var3.e() == null) {
                                                                    completableFuture3.completeExceptionally(new t91("invalid message: question section missing"));
                                                                    return completableFuture3;
                                                                }
                                                                if (!me0Var4.e().f.equals(me0Var3.e().f)) {
                                                                    completableFuture3.completeExceptionally(new t91("invalid name in message: expected " + me0Var4.e().f + "; got " + me0Var3.e().f));
                                                                    return completableFuture3;
                                                                }
                                                                if (me0Var4.e().h != me0Var3.e().h) {
                                                                    StringBuilder sb = new StringBuilder("invalid class in message: expected ");
                                                                    int i8 = me0Var4.e().h;
                                                                    xl xlVar = yl.a;
                                                                    sb.append(xlVar.e(i8));
                                                                    sb.append("; got ");
                                                                    sb.append(xlVar.e(me0Var3.e().h));
                                                                    completableFuture3.completeExceptionally(new t91(sb.toString()));
                                                                    return completableFuture3;
                                                                }
                                                                if (me0Var4.e().g != me0Var3.e().g) {
                                                                    StringBuilder sb2 = new StringBuilder("invalid type in message: expected ");
                                                                    int i9 = me0Var4.e().g;
                                                                    bs0 bs0Var = k31.a;
                                                                    sb2.append(bs0Var.e(i9));
                                                                    sb2.append("; got ");
                                                                    sb2.append(bs0Var.e(me0Var3.e().g));
                                                                    completableFuture3.completeExceptionally(new t91(sb2.toString()));
                                                                    return completableFuture3;
                                                                }
                                                            }
                                                            if (z4 || !l00.c(me0Var3.f.g, 6)) {
                                                                completableFuture3.complete(me0Var3);
                                                                return completableFuture3;
                                                            }
                                                            i80 i80Var2 = ew0.e;
                                                            if (i80Var2.s()) {
                                                                i80Var2.j("Got truncated response for id {}, retrying via TCP, response:\n{}", Integer.valueOf(i7), me0Var3);
                                                            } else {
                                                                i80Var2.o(Integer.valueOf(i7), "Got truncated response for id {}, retrying via TCP");
                                                            }
                                                            return this.a.e(me0Var4, true, executor);
                                                        } catch (IOException e4) {
                                                            try {
                                                                if (e4 instanceof t91) {
                                                                    throw ((t91) e4);
                                                                }
                                                                throw new t91("Error parsing message", e4);
                                                            } catch (t91 e5) {
                                                                completableFuture3.completeExceptionally(e5);
                                                                return completableFuture3;
                                                            }
                                                        }
                                                    }
                                                }, executor);
                                            }
                                        } catch (SocketException unused) {
                                            i2++;
                                        }
                                    } else {
                                        inetSocketAddress = null;
                                    }
                                    datagramChannelOpen.bind((SocketAddress) inetSocketAddress);
                                    datagramChannelOpen.connect(inetSocketAddress2);
                                    nh0Var.m.add(mh0Var);
                                    nh0Var.l.add(mh0Var);
                                    selectorC2.wakeup();
                                    break;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                datagramChannelOpen = datagramChannelOpen;
                                completableFuture = completableFuture2;
                                datagramChannel = datagramChannelOpen;
                                nh0.e(datagramChannel);
                                completableFuture.completeExceptionally(e);
                                final boolean z42 = z3;
                                return completableFuture.thenComposeAsync(new Function() { // from class: dw0
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) throws t91 {
                                        byte[] bArr = (byte[]) obj;
                                        CompletableFuture completableFuture3 = new CompletableFuture();
                                        if (bArr.length < 12) {
                                            completableFuture3.completeExceptionally(new t91("invalid DNS header - too short"));
                                            return completableFuture3;
                                        }
                                        int i6 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                                        int i7 = i;
                                        if (i6 != i7) {
                                            completableFuture3.completeExceptionally(new t91("invalid message id: expected " + i7 + "; got id " + i6));
                                            return completableFuture3;
                                        }
                                        try {
                                            me0 me0Var3 = new me0(bArr);
                                            me0 me0Var4 = me0Var2;
                                            if (me0Var4.f.d() == 5) {
                                                if (me0Var3.f.d() != 5) {
                                                    completableFuture3.completeExceptionally(new t91("invalid message: opcode response is not UPDATE"));
                                                    return completableFuture3;
                                                }
                                            } else {
                                                if (me0Var3.e() == null) {
                                                    completableFuture3.completeExceptionally(new t91("invalid message: question section missing"));
                                                    return completableFuture3;
                                                }
                                                if (!me0Var4.e().f.equals(me0Var3.e().f)) {
                                                    completableFuture3.completeExceptionally(new t91("invalid name in message: expected " + me0Var4.e().f + "; got " + me0Var3.e().f));
                                                    return completableFuture3;
                                                }
                                                if (me0Var4.e().h != me0Var3.e().h) {
                                                    StringBuilder sb = new StringBuilder("invalid class in message: expected ");
                                                    int i8 = me0Var4.e().h;
                                                    xl xlVar = yl.a;
                                                    sb.append(xlVar.e(i8));
                                                    sb.append("; got ");
                                                    sb.append(xlVar.e(me0Var3.e().h));
                                                    completableFuture3.completeExceptionally(new t91(sb.toString()));
                                                    return completableFuture3;
                                                }
                                                if (me0Var4.e().g != me0Var3.e().g) {
                                                    StringBuilder sb2 = new StringBuilder("invalid type in message: expected ");
                                                    int i9 = me0Var4.e().g;
                                                    bs0 bs0Var = k31.a;
                                                    sb2.append(bs0Var.e(i9));
                                                    sb2.append("; got ");
                                                    sb2.append(bs0Var.e(me0Var3.e().g));
                                                    completableFuture3.completeExceptionally(new t91(sb2.toString()));
                                                    return completableFuture3;
                                                }
                                            }
                                            if (z42 || !l00.c(me0Var3.f.g, 6)) {
                                                completableFuture3.complete(me0Var3);
                                                return completableFuture3;
                                            }
                                            i80 i80Var2 = ew0.e;
                                            if (i80Var2.s()) {
                                                i80Var2.j("Got truncated response for id {}, retrying via TCP, response:\n{}", Integer.valueOf(i7), me0Var3);
                                            } else {
                                                i80Var2.o(Integer.valueOf(i7), "Got truncated response for id {}, retrying via TCP");
                                            }
                                            return this.a.e(me0Var4, true, executor);
                                        } catch (IOException e42) {
                                            try {
                                                if (e42 instanceof t91) {
                                                    throw ((t91) e42);
                                                }
                                                throw new t91("Error parsing message", e42);
                                            } catch (t91 e5) {
                                                completableFuture3.completeExceptionally(e5);
                                                return completableFuture3;
                                            }
                                        }
                                    }
                                }, executor);
                            } catch (Throwable th) {
                                th = th;
                                datagramChannelOpen = datagramChannelOpen;
                                datagramChannel = datagramChannelOpen;
                                nh0.e(datagramChannel);
                                throw th;
                            }
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e6) {
                    e = e6;
                    completableFuture = completableFuture2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            final boolean z422 = z3;
            return completableFuture.thenComposeAsync(new Function() { // from class: dw0
                @Override // java.util.function.Function
                public final Object apply(Object obj) throws t91 {
                    byte[] bArr = (byte[]) obj;
                    CompletableFuture completableFuture3 = new CompletableFuture();
                    if (bArr.length < 12) {
                        completableFuture3.completeExceptionally(new t91("invalid DNS header - too short"));
                        return completableFuture3;
                    }
                    int i6 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                    int i7 = i;
                    if (i6 != i7) {
                        completableFuture3.completeExceptionally(new t91("invalid message id: expected " + i7 + "; got id " + i6));
                        return completableFuture3;
                    }
                    try {
                        me0 me0Var3 = new me0(bArr);
                        me0 me0Var4 = me0Var2;
                        if (me0Var4.f.d() == 5) {
                            if (me0Var3.f.d() != 5) {
                                completableFuture3.completeExceptionally(new t91("invalid message: opcode response is not UPDATE"));
                                return completableFuture3;
                            }
                        } else {
                            if (me0Var3.e() == null) {
                                completableFuture3.completeExceptionally(new t91("invalid message: question section missing"));
                                return completableFuture3;
                            }
                            if (!me0Var4.e().f.equals(me0Var3.e().f)) {
                                completableFuture3.completeExceptionally(new t91("invalid name in message: expected " + me0Var4.e().f + "; got " + me0Var3.e().f));
                                return completableFuture3;
                            }
                            if (me0Var4.e().h != me0Var3.e().h) {
                                StringBuilder sb = new StringBuilder("invalid class in message: expected ");
                                int i8 = me0Var4.e().h;
                                xl xlVar = yl.a;
                                sb.append(xlVar.e(i8));
                                sb.append("; got ");
                                sb.append(xlVar.e(me0Var3.e().h));
                                completableFuture3.completeExceptionally(new t91(sb.toString()));
                                return completableFuture3;
                            }
                            if (me0Var4.e().g != me0Var3.e().g) {
                                StringBuilder sb2 = new StringBuilder("invalid type in message: expected ");
                                int i9 = me0Var4.e().g;
                                bs0 bs0Var = k31.a;
                                sb2.append(bs0Var.e(i9));
                                sb2.append("; got ");
                                sb2.append(bs0Var.e(me0Var3.e().g));
                                completableFuture3.completeExceptionally(new t91(sb2.toString()));
                                return completableFuture3;
                            }
                        }
                        if (z422 || !l00.c(me0Var3.f.g, 6)) {
                            completableFuture3.complete(me0Var3);
                            return completableFuture3;
                        }
                        i80 i80Var2 = ew0.e;
                        if (i80Var2.s()) {
                            i80Var2.j("Got truncated response for id {}, retrying via TCP, response:\n{}", Integer.valueOf(i7), me0Var3);
                        } else {
                            i80Var2.o(Integer.valueOf(i7), "Got truncated response for id {}, retrying via TCP");
                        }
                        return this.a.e(me0Var4, true, executor);
                    } catch (IOException e42) {
                        try {
                            if (e42 instanceof t91) {
                                throw ((t91) e42);
                            }
                            throw new t91("Error parsing message", e42);
                        } catch (t91 e52) {
                            completableFuture3.completeExceptionally(e52);
                            return completableFuture3;
                        }
                    }
                }
            }, executor);
        } catch (ne0 e7) {
            CompletableFuture completableFuture3 = new CompletableFuture();
            completableFuture3.completeExceptionally(e7);
            return completableFuture3;
        }
    }

    public final CompletionStage f(me0 me0Var, Executor executor) {
        tn0 tn0VarE;
        if (me0Var.f.d() == 0 && (tn0VarE = me0Var.e()) != null && tn0VarE.g == 252) {
            CompletableFuture completableFuture = new CompletableFuture();
            CompletableFuture.runAsync(new tr(this, completableFuture, me0Var, 2), executor);
            return completableFuture;
        }
        me0 me0VarC = me0Var.clone();
        ki0 ki0Var = this.b;
        if (ki0Var != null && me0VarC.d() == null) {
            me0VarC.b(ki0Var, 3);
        }
        return e(me0VarC, false, executor);
    }

    public final String toString() {
        return "SimpleResolver [" + this.a + "]";
    }
}
