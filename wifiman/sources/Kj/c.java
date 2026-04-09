package kj;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class c implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    private static final String f51562r = "kj.c";

    /* renamed from: a, reason: collision with root package name */
    private final org.eclipse.paho.client.mqttv3.logging.a f51563a;

    /* renamed from: b, reason: collision with root package name */
    private MqttCallback f51564b;

    /* renamed from: c, reason: collision with root package name */
    private MqttCallbackExtended f51565c;

    /* renamed from: d, reason: collision with root package name */
    private Hashtable f51566d;

    /* renamed from: e, reason: collision with root package name */
    private C6473a f51567e;

    /* renamed from: f, reason: collision with root package name */
    private final Vector f51568f;

    /* renamed from: g, reason: collision with root package name */
    private final Vector f51569g;

    /* renamed from: h, reason: collision with root package name */
    private a f51570h;

    /* renamed from: i, reason: collision with root package name */
    private a f51571i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f51572j;

    /* renamed from: k, reason: collision with root package name */
    private Thread f51573k;

    /* renamed from: l, reason: collision with root package name */
    private String f51574l;

    /* renamed from: m, reason: collision with root package name */
    private Future f51575m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f51576n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f51577o;

    /* renamed from: p, reason: collision with root package name */
    private C6474b f51578p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f51579q;

    private enum a {
        STOPPED,
        RUNNING,
        QUIESCING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    c(C6473a c6473a) {
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51562r);
        this.f51563a = aVarA;
        a aVar = a.STOPPED;
        this.f51570h = aVar;
        this.f51571i = aVar;
        this.f51572j = new Object();
        this.f51576n = new Object();
        this.f51577o = new Object();
        this.f51579q = false;
        this.f51567e = c6473a;
        this.f51568f = new Vector(10);
        this.f51569g = new Vector(10);
        this.f51566d = new Hashtable();
        aVarA.setResourceName(c6473a.B().getClientId());
    }

    private void f(MqttToken mqttToken) {
        synchronized (mqttToken) {
            try {
                this.f51563a.fine(f51562r, "handleActionComplete", "705", new Object[]{mqttToken.internalTok.f()});
                if (mqttToken.isComplete()) {
                    this.f51578p.w(mqttToken);
                }
                mqttToken.internalTok.r();
                if (!mqttToken.internalTok.p()) {
                    if (this.f51564b != null && (mqttToken instanceof MqttDeliveryToken) && mqttToken.isComplete()) {
                        this.f51564b.deliveryComplete((MqttDeliveryToken) mqttToken);
                    }
                    d(mqttToken);
                }
                if (mqttToken.isComplete() && (mqttToken instanceof MqttDeliveryToken)) {
                    mqttToken.internalTok.z(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(nj.o oVar) throws Exception {
        String strY = oVar.y();
        this.f51563a.fine(f51562r, "handleMessage", "713", new Object[]{Integer.valueOf(oVar.j()), strY});
        c(strY, oVar.j(), oVar.x());
        if (this.f51579q) {
            return;
        }
        if (oVar.x().getQos() == 1) {
            this.f51567e.I(new nj.k(oVar), new MqttToken(this.f51567e.B().getClientId()));
        } else if (oVar.x().getQos() == 2) {
            this.f51567e.u(oVar);
            nj.l lVar = new nj.l(oVar);
            C6473a c6473a = this.f51567e;
            c6473a.I(lVar, new MqttToken(c6473a.B().getClientId()));
        }
    }

    public void a(MqttToken mqttToken) {
        if (j()) {
            this.f51569g.addElement(mqttToken);
            synchronized (this.f51576n) {
                this.f51563a.fine(f51562r, "asyncOperationComplete", "715", new Object[]{mqttToken.internalTok.f()});
                this.f51576n.notifyAll();
            }
            return;
        }
        try {
            f(mqttToken);
        } catch (Throwable th2) {
            this.f51563a.fine(f51562r, "asyncOperationComplete", "719", null, th2);
            this.f51567e.b0(null, new MqttException(th2));
        }
    }

    public void b(MqttException mqttException) {
        try {
            if (this.f51564b != null && mqttException != null) {
                this.f51563a.fine(f51562r, "connectionLost", "708", new Object[]{mqttException});
                this.f51564b.connectionLost(mqttException);
            }
            MqttCallbackExtended mqttCallbackExtended = this.f51565c;
            if (mqttCallbackExtended == null || mqttException == null) {
                return;
            }
            mqttCallbackExtended.connectionLost(mqttException);
        } catch (Throwable th2) {
            this.f51563a.fine(f51562r, "connectionLost", "720", new Object[]{th2});
        }
    }

    protected boolean c(String str, int i10, MqttMessage mqttMessage) throws Exception {
        Enumeration enumerationKeys = this.f51566d.keys();
        boolean z10 = false;
        while (enumerationKeys.hasMoreElements()) {
            String str2 = (String) enumerationKeys.nextElement();
            IMqttMessageListener iMqttMessageListener = (IMqttMessageListener) this.f51566d.get(str2);
            if (iMqttMessageListener != null && MqttTopic.isMatched(str2, str)) {
                mqttMessage.setId(i10);
                iMqttMessageListener.messageArrived(str, mqttMessage);
                z10 = true;
            }
        }
        if (this.f51564b == null || z10) {
            return z10;
        }
        mqttMessage.setId(i10);
        this.f51564b.messageArrived(str, mqttMessage);
        return true;
    }

    public void d(MqttToken mqttToken) {
        IMqttActionListener actionCallback;
        if (mqttToken == null || (actionCallback = mqttToken.getActionCallback()) == null) {
            return;
        }
        if (mqttToken.getException() == null) {
            this.f51563a.fine(f51562r, "fireActionEvent", "716", new Object[]{mqttToken.internalTok.f()});
            actionCallback.onSuccess(mqttToken);
        } else {
            this.f51563a.fine(f51562r, "fireActionEvent", "716", new Object[]{mqttToken.internalTok.f()});
            actionCallback.onFailure(mqttToken, mqttToken.getException());
        }
    }

    protected Thread e() {
        return this.f51573k;
    }

    public boolean h() {
        return i() && this.f51569g.size() == 0 && this.f51568f.size() == 0;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f51572j) {
            z10 = this.f51570h == a.QUIESCING;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f51572j
            monitor-enter(r0)
            kj.c$a r1 = r4.f51570h     // Catch: java.lang.Throwable -> Le
            kj.c$a r2 = kj.c.a.RUNNING     // Catch: java.lang.Throwable -> Le
            if (r1 == r2) goto L10
            kj.c$a r3 = kj.c.a.QUIESCING     // Catch: java.lang.Throwable -> Le
            if (r1 != r3) goto L16
            goto L10
        Le:
            r1 = move-exception
            goto L19
        L10:
            kj.c$a r1 = r4.f51571i     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.c.j():boolean");
    }

    public void k(nj.o oVar) {
        if (this.f51564b != null || this.f51566d.size() > 0) {
            synchronized (this.f51577o) {
                while (j() && !i() && this.f51568f.size() >= 10) {
                    try {
                        this.f51563a.fine(f51562r, "messageArrived", "709");
                        this.f51577o.wait(200L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (i()) {
                return;
            }
            this.f51568f.addElement(oVar);
            synchronized (this.f51576n) {
                this.f51563a.fine(f51562r, "messageArrived", "710");
                this.f51576n.notifyAll();
            }
        }
    }

    public void l(int i10, int i11) {
        if (i11 == 1) {
            this.f51567e.I(new nj.k(i10), new MqttToken(this.f51567e.B().getClientId()));
        } else if (i11 == 2) {
            this.f51567e.t(i10);
            nj.l lVar = new nj.l(i10);
            C6473a c6473a = this.f51567e;
            c6473a.I(lVar, new MqttToken(c6473a.B().getClientId()));
        }
    }

    public void m() {
        synchronized (this.f51572j) {
            try {
                if (this.f51570h == a.RUNNING) {
                    this.f51570h = a.QUIESCING;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f51577o) {
            this.f51563a.fine(f51562r, "quiesce", "711");
            this.f51577o.notifyAll();
        }
    }

    public void n(String str) {
        this.f51566d.remove(str);
    }

    public void o() {
        this.f51566d.clear();
    }

    public void p(MqttCallback mqttCallback) {
        this.f51564b = mqttCallback;
    }

    public void q(C6474b c6474b) {
        this.f51578p = c6474b;
    }

    public void r(boolean z10) {
        this.f51579q = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        MqttToken mqttToken;
        nj.o oVar;
        Thread threadCurrentThread = Thread.currentThread();
        this.f51573k = threadCurrentThread;
        threadCurrentThread.setName(this.f51574l);
        synchronized (this.f51572j) {
            this.f51570h = a.RUNNING;
        }
        while (j()) {
            try {
                try {
                    synchronized (this.f51576n) {
                        try {
                            if (j() && this.f51568f.isEmpty() && this.f51569g.isEmpty()) {
                                this.f51563a.fine(f51562r, "run", "704");
                                this.f51576n.wait();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                }
                if (j()) {
                    synchronized (this.f51569g) {
                        try {
                            if (this.f51569g.isEmpty()) {
                                mqttToken = null;
                            } else {
                                mqttToken = (MqttToken) this.f51569g.elementAt(0);
                                this.f51569g.removeElementAt(0);
                            }
                        } finally {
                        }
                    }
                    if (mqttToken != null) {
                        f(mqttToken);
                    }
                    synchronized (this.f51568f) {
                        try {
                            if (this.f51568f.isEmpty()) {
                                oVar = null;
                            } else {
                                oVar = (nj.o) this.f51568f.elementAt(0);
                                this.f51568f.removeElementAt(0);
                            }
                        } finally {
                        }
                    }
                    if (oVar != null) {
                        g(oVar);
                    }
                }
                if (i()) {
                    this.f51578p.b();
                }
                synchronized (this.f51577o) {
                    this.f51563a.fine(f51562r, "run", "706");
                    this.f51577o.notifyAll();
                }
            } catch (Throwable th3) {
                try {
                    org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51563a;
                    String str = f51562r;
                    aVar.fine(str, "run", "714", null, th3);
                    this.f51567e.b0(null, new MqttException(th3));
                    synchronized (this.f51577o) {
                        this.f51563a.fine(str, "run", "706");
                        this.f51577o.notifyAll();
                    }
                } catch (Throwable th4) {
                    synchronized (this.f51577o) {
                        this.f51563a.fine(f51562r, "run", "706");
                        this.f51577o.notifyAll();
                        throw th4;
                    }
                }
            }
        }
        synchronized (this.f51572j) {
            this.f51570h = a.STOPPED;
        }
        this.f51573k = null;
    }

    public void s(String str, IMqttMessageListener iMqttMessageListener) {
        this.f51566d.put(str, iMqttMessageListener);
    }

    public void t(MqttCallbackExtended mqttCallbackExtended) {
        this.f51565c = mqttCallbackExtended;
    }

    public void u(String str, ExecutorService executorService) {
        this.f51574l = str;
        synchronized (this.f51572j) {
            try {
                if (this.f51570h == a.STOPPED) {
                    this.f51568f.clear();
                    this.f51569g.clear();
                    this.f51571i = a.RUNNING;
                    if (executorService == null) {
                        new Thread(this).start();
                    } else {
                        this.f51575m = executorService.submit(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (!j()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    public void v() {
        synchronized (this.f51572j) {
            try {
                Future future = this.f51575m;
                if (future != null) {
                    future.cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j()) {
            org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51563a;
            String str = f51562r;
            aVar.fine(str, "stop", "700");
            synchronized (this.f51572j) {
                this.f51571i = a.STOPPED;
            }
            if (!Thread.currentThread().equals(this.f51573k)) {
                synchronized (this.f51576n) {
                    this.f51563a.fine(str, "stop", "701");
                    this.f51576n.notifyAll();
                }
                while (j()) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception unused) {
                    }
                    this.f51578p.x();
                }
            }
            this.f51563a.fine(f51562r, "stop", "703");
        }
    }
}
