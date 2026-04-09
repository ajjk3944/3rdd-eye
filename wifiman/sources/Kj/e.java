package kj;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import nj.AbstractC6996b;
import nj.C6999e;
import nj.C7001g;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* loaded from: classes3.dex */
public class e implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    private static final String f51592l = "kj.e";

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51593a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51592l);

    /* renamed from: b, reason: collision with root package name */
    private a f51594b;

    /* renamed from: c, reason: collision with root package name */
    private a f51595c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f51596d;

    /* renamed from: e, reason: collision with root package name */
    private Thread f51597e;

    /* renamed from: f, reason: collision with root package name */
    private String f51598f;

    /* renamed from: g, reason: collision with root package name */
    private Future f51599g;

    /* renamed from: h, reason: collision with root package name */
    private C6474b f51600h;

    /* renamed from: i, reason: collision with root package name */
    private C7001g f51601i;

    /* renamed from: j, reason: collision with root package name */
    private C6473a f51602j;

    /* renamed from: k, reason: collision with root package name */
    private f f51603k;

    private enum a {
        STOPPED,
        RUNNING,
        STARTING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public e(C6473a c6473a, C6474b c6474b, f fVar, OutputStream outputStream) {
        a aVar = a.STOPPED;
        this.f51594b = aVar;
        this.f51595c = aVar;
        this.f51596d = new Object();
        this.f51597e = null;
        this.f51600h = null;
        this.f51602j = null;
        this.f51603k = null;
        this.f51601i = new C7001g(c6474b, outputStream);
        this.f51602j = c6473a;
        this.f51600h = c6474b;
        this.f51603k = fVar;
        this.f51593a.setResourceName(c6473a.B().getClientId());
    }

    private void a(nj.u uVar, Exception exc) {
        this.f51593a.fine(f51592l, "handleRunException", "804", null, exc);
        MqttException mqttException = !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc;
        synchronized (this.f51596d) {
            this.f51595c = a.STOPPED;
        }
        this.f51602j.b0(null, mqttException);
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f51596d) {
            try {
                a aVar = this.f51594b;
                a aVar2 = a.RUNNING;
                z10 = aVar == aVar2 && this.f51595c == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public void c(String str, ExecutorService executorService) {
        this.f51598f = str;
        synchronized (this.f51596d) {
            try {
                a aVar = this.f51594b;
                a aVar2 = a.STOPPED;
                if (aVar == aVar2 && this.f51595c == aVar2) {
                    this.f51595c = a.RUNNING;
                    if (executorService == null) {
                        new Thread(this).start();
                    } else {
                        this.f51599g = executorService.submit(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (!b()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    public void d() {
        if (b()) {
            synchronized (this.f51596d) {
                try {
                    Future future = this.f51599g;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.f51593a.fine(f51592l, "stop", "800");
                    if (b()) {
                        this.f51595c = a.STOPPED;
                        this.f51600h.x();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (b()) {
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
                this.f51600h.x();
            }
            this.f51593a.fine(f51592l, "stop", "801");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar;
        a aVar2;
        Thread threadCurrentThread = Thread.currentThread();
        this.f51597e = threadCurrentThread;
        threadCurrentThread.setName(this.f51598f);
        synchronized (this.f51596d) {
            this.f51594b = a.RUNNING;
        }
        try {
            synchronized (this.f51596d) {
                aVar = this.f51595c;
            }
            nj.u uVarJ = null;
            while (aVar == a.RUNNING && this.f51601i != null) {
                try {
                    try {
                        uVarJ = this.f51600h.j();
                        if (uVarJ != null) {
                            this.f51593a.fine(f51592l, "run", "802", new Object[]{uVarJ.i(), uVarJ});
                            if (uVarJ instanceof AbstractC6996b) {
                                this.f51601i.a(uVarJ);
                                this.f51601i.flush();
                            } else {
                                MqttToken mqttTokenM = uVarJ.m();
                                if (mqttTokenM == null) {
                                    mqttTokenM = this.f51603k.f(uVarJ);
                                }
                                if (mqttTokenM != null) {
                                    synchronized (mqttTokenM) {
                                        this.f51601i.a(uVarJ);
                                        try {
                                            this.f51601i.flush();
                                        } catch (IOException e10) {
                                            if (!(uVarJ instanceof C6999e)) {
                                                throw e10;
                                            }
                                        }
                                        this.f51600h.C(uVarJ);
                                    }
                                }
                            }
                        } else {
                            this.f51593a.fine(f51592l, "run", "803");
                            synchronized (this.f51596d) {
                                this.f51595c = a.STOPPED;
                            }
                        }
                    } catch (MqttException e11) {
                        a(uVarJ, e11);
                    }
                } catch (Exception e12) {
                    a(uVarJ, e12);
                }
                synchronized (this.f51596d) {
                    aVar2 = this.f51595c;
                }
                aVar = aVar2;
            }
            synchronized (this.f51596d) {
                this.f51594b = a.STOPPED;
                this.f51597e = null;
            }
            this.f51593a.fine(f51592l, "run", "805");
        } catch (Throwable th2) {
            synchronized (this.f51596d) {
                this.f51594b = a.STOPPED;
                this.f51597e = null;
                throw th2;
            }
        }
    }
}
