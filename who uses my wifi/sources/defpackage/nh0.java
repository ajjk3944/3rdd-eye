package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nh0 extends dh0 {
    public static final i80 n = k80.d(nh0.class);
    public final int i;
    public final int j;
    public final SecureRandom k;
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue m = new ConcurrentLinkedQueue();

    public nh0() {
        int i;
        int i2;
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            i = 32768;
            i2 = 60999;
        } else {
            i = 49152;
            i2 = 65535;
        }
        int iIntValue = Integer.getInteger("dnsjava.udp.ephemeral.start", i).intValue();
        this.i = iIntValue;
        this.j = Integer.getInteger("dnsjava.udp.ephemeral.end", i2).intValue() - iIntValue;
        if (Boolean.getBoolean("dnsjava.udp.ephemeral.use_ephemeral_port")) {
            this.k = null;
        } else {
            this.k = new SecureRandom();
        }
        final int i3 = 0;
        Runnable runnable = new Runnable(this) { // from class: lh0
            public final /* synthetic */ nh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i3) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.l;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            mh0 mh0Var = (mh0) concurrentLinkedQueue.poll();
                            if (mh0Var != null) {
                                try {
                                    nh0.n.i(Integer.valueOf(mh0Var.a));
                                    mh0Var.e.register(dh0.c(), 1, mh0Var);
                                    mh0Var.c();
                                } catch (IOException e) {
                                    mh0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.m.iterator();
                        while (it.hasNext()) {
                            mh0 mh0Var2 = (mh0) it.next();
                            if (mh0Var2.d - System.nanoTime() < 0) {
                                mh0Var2.b(new SocketTimeoutException("Query timed out"));
                                it.remove();
                            }
                        }
                        break;
                    default:
                        nh0 nh0Var = this.g;
                        nh0Var.l.clear();
                        EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = nh0Var.m;
                        concurrentLinkedQueue2.forEach(new np(1, eOFException));
                        concurrentLinkedQueue2.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.c[1] = runnable;
        }
        final int i4 = 1;
        Runnable runnable2 = new Runnable(this) { // from class: lh0
            public final /* synthetic */ nh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i4) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.l;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            mh0 mh0Var = (mh0) concurrentLinkedQueue.poll();
                            if (mh0Var != null) {
                                try {
                                    nh0.n.i(Integer.valueOf(mh0Var.a));
                                    mh0Var.e.register(dh0.c(), 1, mh0Var);
                                    mh0Var.c();
                                } catch (IOException e) {
                                    mh0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.m.iterator();
                        while (it.hasNext()) {
                            mh0 mh0Var2 = (mh0) it.next();
                            if (mh0Var2.d - System.nanoTime() < 0) {
                                mh0Var2.b(new SocketTimeoutException("Query timed out"));
                                it.remove();
                            }
                        }
                        break;
                    default:
                        nh0 nh0Var = this.g;
                        nh0Var.l.clear();
                        EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = nh0Var.m;
                        concurrentLinkedQueue2.forEach(new np(1, eOFException));
                        concurrentLinkedQueue2.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.b[1] = runnable2;
        }
        final int i5 = 2;
        Runnable runnable3 = new Runnable(this) { // from class: lh0
            public final /* synthetic */ nh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i5) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.l;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            mh0 mh0Var = (mh0) concurrentLinkedQueue.poll();
                            if (mh0Var != null) {
                                try {
                                    nh0.n.i(Integer.valueOf(mh0Var.a));
                                    mh0Var.e.register(dh0.c(), 1, mh0Var);
                                    mh0Var.c();
                                } catch (IOException e) {
                                    mh0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.m.iterator();
                        while (it.hasNext()) {
                            mh0 mh0Var2 = (mh0) it.next();
                            if (mh0Var2.d - System.nanoTime() < 0) {
                                mh0Var2.b(new SocketTimeoutException("Query timed out"));
                                it.remove();
                            }
                        }
                        break;
                    default:
                        nh0 nh0Var = this.g;
                        nh0Var.l.clear();
                        EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = nh0Var.m;
                        concurrentLinkedQueue2.forEach(new np(1, eOFException));
                        concurrentLinkedQueue2.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.d[1] = runnable3;
        }
    }

    public static void e(DatagramChannel datagramChannel) {
        if (datagramChannel != null) {
            try {
                datagramChannel.close();
            } catch (IOException unused) {
            }
        }
    }
}
