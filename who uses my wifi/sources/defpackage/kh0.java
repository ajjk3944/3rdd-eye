package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kh0 extends dh0 {
    public static final i80 k = k80.d(kh0.class);
    public final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public kh0() {
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: eh0
            public final /* synthetic */ kh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.i;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            ih0 ih0Var = (ih0) concurrentLinkedQueue.poll();
                            if (ih0Var != null) {
                                try {
                                    Selector selectorC = dh0.c();
                                    if (ih0Var.a.isConnected()) {
                                        ih0Var.a.keyFor(selectorC).interestOps(4);
                                    } else {
                                        ih0Var.a.register(selectorC, 8, ih0Var);
                                    }
                                } catch (IOException e) {
                                    ih0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.j.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((ih0) it.next()).b.iterator();
                            while (it2.hasNext()) {
                                jh0 jh0Var = (jh0) it2.next();
                                if (jh0Var.c - System.nanoTime() < 0) {
                                    jh0Var.e.completeExceptionally(new SocketTimeoutException("Query timed out"));
                                    it2.remove();
                                }
                            }
                        }
                        break;
                    default:
                        kh0 kh0Var = this.g;
                        kh0Var.i.clear();
                        final EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentHashMap concurrentHashMap = kh0Var.j;
                        concurrentHashMap.forEach(new BiConsumer() { // from class: fh0
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                ih0 ih0Var2 = (ih0) obj2;
                                Iterator it3 = ih0Var2.b.iterator();
                                while (true) {
                                    boolean zHasNext = it3.hasNext();
                                    EOFException eOFException2 = eOFException;
                                    if (!zHasNext) {
                                        ih0Var2.b(eOFException2);
                                        return;
                                    } else {
                                        ((jh0) it3.next()).e.completeExceptionally(eOFException2);
                                        it3.remove();
                                    }
                                }
                            }
                        });
                        concurrentHashMap.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.c[0] = runnable;
        }
        final int i2 = 1;
        Runnable runnable2 = new Runnable(this) { // from class: eh0
            public final /* synthetic */ kh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i2) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.i;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            ih0 ih0Var = (ih0) concurrentLinkedQueue.poll();
                            if (ih0Var != null) {
                                try {
                                    Selector selectorC = dh0.c();
                                    if (ih0Var.a.isConnected()) {
                                        ih0Var.a.keyFor(selectorC).interestOps(4);
                                    } else {
                                        ih0Var.a.register(selectorC, 8, ih0Var);
                                    }
                                } catch (IOException e) {
                                    ih0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.j.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((ih0) it.next()).b.iterator();
                            while (it2.hasNext()) {
                                jh0 jh0Var = (jh0) it2.next();
                                if (jh0Var.c - System.nanoTime() < 0) {
                                    jh0Var.e.completeExceptionally(new SocketTimeoutException("Query timed out"));
                                    it2.remove();
                                }
                            }
                        }
                        break;
                    default:
                        kh0 kh0Var = this.g;
                        kh0Var.i.clear();
                        final EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentHashMap concurrentHashMap = kh0Var.j;
                        concurrentHashMap.forEach(new BiConsumer() { // from class: fh0
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                ih0 ih0Var2 = (ih0) obj2;
                                Iterator it3 = ih0Var2.b.iterator();
                                while (true) {
                                    boolean zHasNext = it3.hasNext();
                                    EOFException eOFException2 = eOFException;
                                    if (!zHasNext) {
                                        ih0Var2.b(eOFException2);
                                        return;
                                    } else {
                                        ((jh0) it3.next()).e.completeExceptionally(eOFException2);
                                        it3.remove();
                                    }
                                }
                            }
                        });
                        concurrentHashMap.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.b[0] = runnable2;
        }
        final int i3 = 2;
        Runnable runnable3 = new Runnable(this) { // from class: eh0
            public final /* synthetic */ kh0 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws ClosedChannelException {
                switch (i3) {
                    case 0:
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.g.i;
                        while (!concurrentLinkedQueue.isEmpty()) {
                            ih0 ih0Var = (ih0) concurrentLinkedQueue.poll();
                            if (ih0Var != null) {
                                try {
                                    Selector selectorC = dh0.c();
                                    if (ih0Var.a.isConnected()) {
                                        ih0Var.a.keyFor(selectorC).interestOps(4);
                                    } else {
                                        ih0Var.a.register(selectorC, 8, ih0Var);
                                    }
                                } catch (IOException e) {
                                    ih0Var.b(e);
                                }
                            }
                        }
                        break;
                    case 1:
                        Iterator it = this.g.j.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((ih0) it.next()).b.iterator();
                            while (it2.hasNext()) {
                                jh0 jh0Var = (jh0) it2.next();
                                if (jh0Var.c - System.nanoTime() < 0) {
                                    jh0Var.e.completeExceptionally(new SocketTimeoutException("Query timed out"));
                                    it2.remove();
                                }
                            }
                        }
                        break;
                    default:
                        kh0 kh0Var = this.g;
                        kh0Var.i.clear();
                        final EOFException eOFException = new EOFException("Client is closing");
                        ConcurrentHashMap concurrentHashMap = kh0Var.j;
                        concurrentHashMap.forEach(new BiConsumer() { // from class: fh0
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                ih0 ih0Var2 = (ih0) obj2;
                                Iterator it3 = ih0Var2.b.iterator();
                                while (true) {
                                    boolean zHasNext = it3.hasNext();
                                    EOFException eOFException2 = eOFException;
                                    if (!zHasNext) {
                                        ih0Var2.b(eOFException2);
                                        return;
                                    } else {
                                        ((jh0) it3.next()).e.completeExceptionally(eOFException2);
                                        it3.remove();
                                    }
                                }
                            }
                        });
                        concurrentHashMap.clear();
                        break;
                }
            }
        };
        synchronized (dh0.class) {
            dh0.d[0] = runnable3;
        }
    }
}
