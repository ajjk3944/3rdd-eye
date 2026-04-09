package Vg;

import Ug.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import jcifs.smb1.util.transport.TransportException;

/* loaded from: classes4.dex */
public abstract class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static int f23427f;

    /* renamed from: g, reason: collision with root package name */
    static e f23428g = e.a();

    /* renamed from: a, reason: collision with root package name */
    int f23429a = 0;

    /* renamed from: b, reason: collision with root package name */
    String f23430b;

    /* renamed from: c, reason: collision with root package name */
    Thread f23431c;

    /* renamed from: d, reason: collision with root package name */
    TransportException f23432d;

    /* renamed from: e, reason: collision with root package name */
    protected HashMap f23433e;

    public c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transport");
        int i10 = f23427f;
        f23427f = i10 + 1;
        sb2.append(i10);
        this.f23430b = sb2.toString();
        this.f23433e = new HashMap(4);
    }

    private void h() throws IOException {
        a aVarJ;
        while (this.f23431c == Thread.currentThread()) {
            try {
                aVarJ = j();
            } catch (Exception e10) {
                String message = e10.getMessage();
                boolean z10 = message != null && message.equals("Read timed out");
                boolean z11 = !z10;
                if (!z10 && e.f22464b >= 3) {
                    e10.printStackTrace(f23428g);
                }
                try {
                    b(z11);
                } catch (IOException e11) {
                    e11.printStackTrace(f23428g);
                }
            }
            if (aVarJ == null) {
                throw new IOException("end of stream");
            }
            synchronized (this) {
                try {
                    b bVar = (b) this.f23433e.get(aVarJ);
                    if (bVar == null) {
                        if (e.f22464b >= 4) {
                            f23428g.println("Invalid key, skipping message");
                        }
                        g();
                    } else {
                        e(bVar);
                        bVar.f23426b = true;
                        notifyAll();
                    }
                } finally {
                }
            }
        }
    }

    public static int k(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 <= 0) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    public synchronized void a(long j10) {
        try {
            try {
                int i10 = this.f23429a;
                if (i10 != 0) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            this.f23429a = 0;
                            throw new TransportException("Connection in error", this.f23432d);
                        }
                        TransportException transportException = new TransportException("Invalid state: " + this.f23429a);
                        this.f23429a = 0;
                        throw transportException;
                    }
                    if (i10 != 0 && i10 != 3 && i10 != 4) {
                        if (e.f22464b >= 1) {
                            f23428g.println("Invalid state: " + this.f23429a);
                        }
                        this.f23429a = 0;
                        this.f23431c = null;
                    }
                    return;
                }
                this.f23429a = 1;
                this.f23432d = null;
                Thread thread = new Thread(this, this.f23430b);
                this.f23431c = thread;
                thread.setDaemon(true);
                synchronized (this.f23431c) {
                    this.f23431c.start();
                    this.f23431c.wait(j10);
                    int i11 = this.f23429a;
                    if (i11 == 1) {
                        this.f23429a = 0;
                        this.f23431c = null;
                        throw new TransportException("Connection timeout");
                    }
                    if (i11 == 2) {
                        TransportException transportException2 = this.f23432d;
                        if (transportException2 == null) {
                            this.f23429a = 3;
                            return;
                        } else {
                            this.f23429a = 4;
                            this.f23431c = null;
                            throw transportException2;
                        }
                    }
                    if (i11 != 0 && i11 != 3 && i11 != 4) {
                        if (e.f22464b >= 1) {
                            f23428g.println("Invalid state: " + this.f23429a);
                        }
                        this.f23429a = 0;
                        this.f23431c = null;
                    }
                }
            } catch (InterruptedException e10) {
                this.f23429a = 0;
                this.f23431c = null;
                throw new TransportException(e10);
            }
        } catch (Throwable th2) {
            int i12 = this.f23429a;
            if (i12 != 0 && i12 != 3 && i12 != 4) {
                if (e.f22464b >= 1) {
                    f23428g.println("Invalid state: " + this.f23429a);
                }
                this.f23429a = 0;
                this.f23431c = null;
            }
            throw th2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:11:0x0011, B:13:0x0015, B:16:0x0030, B:30:0x0050, B:25:0x0047, B:18:0x0036, B:22:0x0041), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void b(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f23429a     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L51
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L36
            r6 = 4
            if (r0 == r6) goto L44
            int r6 = Ug.e.f22464b     // Catch: java.lang.Throwable -> L2e
            if (r6 < r3) goto L30
            Ug.e r6 = Vg.c.f23428g     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Invalid state: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            int r1 = r5.f23429a     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r6.println(r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r6 = move-exception
            goto L53
        L30:
            r5.f23431c = r4     // Catch: java.lang.Throwable -> L2e
            r5.f23429a = r2     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L35:
            r6 = r3
        L36:
            java.util.HashMap r0 = r5.f23433e     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L41
            if (r6 != 0) goto L41
            goto L4c
        L41:
            r5.d(r6)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L46
        L44:
            r6 = r4
            goto L47
        L46:
            r6 = move-exception
        L47:
            r5.f23431c = r4     // Catch: java.lang.Throwable -> L2e
            r5.f23429a = r2     // Catch: java.lang.Throwable -> L2e
            r4 = r6
        L4c:
            if (r4 != 0) goto L50
            monitor-exit(r5)
            return
        L50:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L51:
            monitor-exit(r5)
            return
        L53:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.c.b(boolean):void");
    }

    protected abstract void c();

    protected abstract void d(boolean z10);

    protected abstract void e(b bVar);

    protected abstract void f(a aVar);

    protected abstract void g();

    protected abstract void i(a aVar);

    protected abstract a j();

    public synchronized void l(a aVar, b bVar, long j10) {
        i(aVar);
        bVar.f23426b = false;
        try {
            try {
                try {
                    this.f23433e.put(aVar, bVar);
                    f(aVar);
                    bVar.f23425a = System.currentTimeMillis() + j10;
                    while (!bVar.f23426b) {
                        wait(j10);
                        j10 = bVar.f23425a - System.currentTimeMillis();
                        if (j10 <= 0) {
                            throw new TransportException(this.f23430b + " timedout waiting for response to " + aVar);
                        }
                    }
                } catch (IOException e10) {
                    if (e.f22464b > 2) {
                        e10.printStackTrace(f23428g);
                    }
                    try {
                        b(true);
                    } catch (IOException e11) {
                        e11.printStackTrace(f23428g);
                    }
                    throw e10;
                }
            } catch (InterruptedException e12) {
                throw new TransportException(e12);
            }
        } finally {
            this.f23433e.remove(aVar);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            c();
            synchronized (threadCurrentThread) {
                try {
                    if (threadCurrentThread != this.f23431c) {
                        return;
                    }
                    this.f23429a = 2;
                    threadCurrentThread.notify();
                    h();
                } finally {
                }
            }
        } catch (Exception e10) {
            synchronized (threadCurrentThread) {
                try {
                    if (threadCurrentThread != this.f23431c) {
                        if (e.f22464b >= 2) {
                            e10.printStackTrace(f23428g);
                        }
                    } else {
                        this.f23432d = new TransportException(e10);
                        this.f23429a = 2;
                        threadCurrentThread.notify();
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            synchronized (threadCurrentThread) {
                try {
                    if (threadCurrentThread != this.f23431c) {
                        return;
                    }
                    this.f23429a = 2;
                    threadCurrentThread.notify();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public String toString() {
        return this.f23430b;
    }
}
