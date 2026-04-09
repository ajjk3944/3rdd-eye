package defpackage;

import java.io.IOException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class dh0 {
    public static final i80 a = k80.d(dh0.class);
    public static final Runnable[] b = new Runnable[2];
    public static final Runnable[] c = new Runnable[2];
    public static final Runnable[] d = new Runnable[2];
    public static Thread e;
    public static Thread f;
    public static volatile Selector g;
    public static volatile boolean h;

    public static void a() {
        Iterator<SelectionKey> it = g.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            ((ch0) next.attachment()).a(next);
        }
    }

    public static synchronized void b(Runnable[] runnableArr) {
        try {
            Runnable runnable = runnableArr[0];
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = runnableArr[1];
            if (runnable2 != null) {
                runnable2.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Selector c() {
        if (g == null) {
            synchronized (dh0.class) {
                try {
                    if (g == null) {
                        g = Selector.open();
                        a.r("Starting dnsjava NIO selector thread");
                        h = true;
                        final int i = 0;
                        Thread thread = new Thread(new Runnable() { // from class: bh0
                            @Override // java.lang.Runnable
                            public final void run() throws InterruptedException, IOException {
                                switch (i) {
                                    case 0:
                                        int iIntValue = Integer.getInteger("dnsjava.nio.selector_timeout", 1000).intValue();
                                        if (iIntValue <= 0 || iIntValue > 1000) {
                                            throw new IllegalArgumentException("Invalid selector_timeout, must be between 1 and 1000");
                                        }
                                        while (dh0.h) {
                                            try {
                                                if (dh0.g.select(iIntValue) == 0) {
                                                    dh0.b(dh0.b);
                                                }
                                                if (dh0.h) {
                                                    dh0.b(dh0.c);
                                                    dh0.a();
                                                }
                                            } catch (IOException e2) {
                                                dh0.a.u(e2);
                                            } catch (ClosedSelectorException unused) {
                                            }
                                        }
                                        dh0.a.r("dnsjava NIO selector thread stopped");
                                        return;
                                    default:
                                        dh0.h = false;
                                        try {
                                            dh0.b(dh0.d);
                                        } catch (Exception e3) {
                                            dh0.a.p("Failed to execute shutdown task, ignoring and continuing close", e3);
                                        }
                                        Selector selector = dh0.g;
                                        Thread thread2 = dh0.e;
                                        synchronized (dh0.class) {
                                            dh0.g = null;
                                            dh0.e = null;
                                            dh0.f = null;
                                        }
                                        if (selector != null) {
                                            selector.wakeup();
                                            try {
                                                selector.close();
                                            } catch (IOException e4) {
                                                dh0.a.p("Failed to properly close selector, ignoring and continuing close", e4);
                                            }
                                        }
                                        if (thread2 != null) {
                                            try {
                                                thread2.join();
                                                return;
                                            } catch (InterruptedException unused2) {
                                                Thread.currentThread().interrupt();
                                                return;
                                            }
                                        }
                                        return;
                                }
                            }
                        });
                        e = thread;
                        thread.setDaemon(true);
                        e.setName("dnsjava NIO selector");
                        e.start();
                        final int i2 = 1;
                        Thread thread2 = new Thread(new Runnable() { // from class: bh0
                            @Override // java.lang.Runnable
                            public final void run() throws InterruptedException, IOException {
                                switch (i2) {
                                    case 0:
                                        int iIntValue = Integer.getInteger("dnsjava.nio.selector_timeout", 1000).intValue();
                                        if (iIntValue <= 0 || iIntValue > 1000) {
                                            throw new IllegalArgumentException("Invalid selector_timeout, must be between 1 and 1000");
                                        }
                                        while (dh0.h) {
                                            try {
                                                if (dh0.g.select(iIntValue) == 0) {
                                                    dh0.b(dh0.b);
                                                }
                                                if (dh0.h) {
                                                    dh0.b(dh0.c);
                                                    dh0.a();
                                                }
                                            } catch (IOException e2) {
                                                dh0.a.u(e2);
                                            } catch (ClosedSelectorException unused) {
                                            }
                                        }
                                        dh0.a.r("dnsjava NIO selector thread stopped");
                                        return;
                                    default:
                                        dh0.h = false;
                                        try {
                                            dh0.b(dh0.d);
                                        } catch (Exception e3) {
                                            dh0.a.p("Failed to execute shutdown task, ignoring and continuing close", e3);
                                        }
                                        Selector selector = dh0.g;
                                        Thread thread22 = dh0.e;
                                        synchronized (dh0.class) {
                                            dh0.g = null;
                                            dh0.e = null;
                                            dh0.f = null;
                                        }
                                        if (selector != null) {
                                            selector.wakeup();
                                            try {
                                                selector.close();
                                            } catch (IOException e4) {
                                                dh0.a.p("Failed to properly close selector, ignoring and continuing close", e4);
                                            }
                                        }
                                        if (thread22 != null) {
                                            try {
                                                thread22.join();
                                                return;
                                            } catch (InterruptedException unused2) {
                                                Thread.currentThread().interrupt();
                                                return;
                                            }
                                        }
                                        return;
                                }
                            }
                        });
                        f = thread2;
                        thread2.setName("dnsjava NIO shutdown hook");
                        if (Boolean.parseBoolean(System.getProperty("dnsjava.nio.register_shutdown_hook", "true"))) {
                            Runtime.getRuntime().addShutdownHook(f);
                        }
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public static void d(String str, byte[] bArr) {
        i80 i80Var = a;
        if (i80Var.s()) {
            char[] cArr = pb1.a;
            int length = bArr.length;
            StringBuilder sb = new StringBuilder();
            sb.append(length);
            sb.append("b");
            if (str != null) {
                sb.append(" (");
                sb.append(str);
                sb.append(")");
            }
            sb.append(':');
            int length2 = (sb.toString().length() + 8) & (-8);
            sb.append('\t');
            int i = (80 - length2) / 3;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 != 0 && i2 % i == 0) {
                    sb.append('\n');
                    for (int i3 = 0; i3 < length2 / 8; i3++) {
                        sb.append('\t');
                    }
                }
                byte b2 = bArr[i2];
                char[] cArr2 = pb1.a;
                sb.append(cArr2[(b2 & 255) >> 4]);
                sb.append(cArr2[b2 & 15]);
                sb.append(' ');
            }
            sb.append('\n');
            i80Var.l(sb.toString());
        }
    }
}
