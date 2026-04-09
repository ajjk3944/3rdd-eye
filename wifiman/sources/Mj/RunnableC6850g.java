package mj;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.SocketTimeoutException;

/* renamed from: mj.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC6850g implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    private static final String f54067i = "mj.g";

    /* renamed from: e, reason: collision with root package name */
    private InputStream f54072e;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f54074g;

    /* renamed from: h, reason: collision with root package name */
    private PipedOutputStream f54075h;

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f54068a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f54067i);

    /* renamed from: b, reason: collision with root package name */
    private boolean f54069b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54070c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f54071d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private Thread f54073f = null;

    public RunnableC6850g(InputStream inputStream, PipedInputStream pipedInputStream) throws IOException {
        this.f54072e = inputStream;
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.f54075h = pipedOutputStream;
        pipedInputStream.connect(pipedOutputStream);
    }

    private void a() throws IOException {
        try {
            this.f54075h.close();
        } catch (IOException unused) {
        }
    }

    public void b(String str) {
        this.f54068a.fine(f54067i, "start", "855");
        synchronized (this.f54071d) {
            try {
                if (!this.f54069b) {
                    this.f54069b = true;
                    Thread thread = new Thread(this, str);
                    this.f54073f = thread;
                    thread.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() throws InterruptedException {
        Thread thread;
        boolean z10 = true;
        this.f54070c = true;
        synchronized (this.f54071d) {
            try {
                this.f54068a.fine(f54067i, "stop", "850");
                if (this.f54069b) {
                    this.f54069b = false;
                    this.f54074g = false;
                    a();
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && !Thread.currentThread().equals(this.f54073f) && (thread = this.f54073f) != null) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
            }
        }
        this.f54073f = null;
        this.f54068a.fine(f54067i, "stop", "851");
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException, IOException {
        while (this.f54069b && this.f54072e != null) {
            try {
                this.f54068a.fine(f54067i, "run", "852");
                this.f54074g = this.f54072e.available() > 0;
                C6846c c6846c = new C6846c(this.f54072e);
                if (!c6846c.g()) {
                    for (int i10 = 0; i10 < c6846c.f().length; i10++) {
                        this.f54075h.write(c6846c.f()[i10]);
                    }
                    this.f54075h.flush();
                } else if (!this.f54070c) {
                    throw new IOException("Server sent a WebSocket Frame with the Stop OpCode");
                }
                this.f54074g = false;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                c();
            }
        }
    }
}
