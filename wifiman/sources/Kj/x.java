package kj;

import nj.AbstractC6996b;
import nj.C6997c;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: q, reason: collision with root package name */
    private static final String f51657q = "kj.x";

    /* renamed from: k, reason: collision with root package name */
    private String f51668k;

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51658a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51657q);

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f51659b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f51660c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f51661d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f51662e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f51663f = new Object();

    /* renamed from: g, reason: collision with root package name */
    protected MqttMessage f51664g = null;

    /* renamed from: h, reason: collision with root package name */
    private nj.u f51665h = null;

    /* renamed from: i, reason: collision with root package name */
    private MqttException f51666i = null;

    /* renamed from: j, reason: collision with root package name */
    private String[] f51667j = null;

    /* renamed from: l, reason: collision with root package name */
    private IMqttAsyncClient f51669l = null;

    /* renamed from: m, reason: collision with root package name */
    private IMqttActionListener f51670m = null;

    /* renamed from: n, reason: collision with root package name */
    private Object f51671n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f51672o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f51673p = false;

    public x(String str) {
        this.f51658a.setResourceName(str);
    }

    public void A(String[] strArr) {
        this.f51667j = (String[]) strArr.clone();
    }

    public void B(Object obj) {
        this.f51671n = obj;
    }

    public void C(long j10) {
        org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51658a;
        String str = f51657q;
        aVar.fine(str, "waitForCompletion", "407", new Object[]{f(), Long.valueOf(j10), this});
        if (D(j10) != null || this.f51659b) {
            a();
            return;
        }
        this.f51658a.fine(str, "waitForCompletion", "406", new Object[]{f(), this});
        MqttException mqttException = new MqttException(32000);
        this.f51666i = mqttException;
        throw mqttException;
    }

    protected nj.u D(long j10) {
        synchronized (this.f51662e) {
            try {
                org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51658a;
                String str = f51657q;
                String strF = f();
                Long lValueOf = Long.valueOf(j10);
                Boolean boolValueOf = Boolean.valueOf(this.f51661d);
                Boolean boolValueOf2 = Boolean.valueOf(this.f51659b);
                MqttException mqttException = this.f51666i;
                aVar.fine(str, "waitForResponse", "400", new Object[]{strF, lValueOf, boolValueOf, boolValueOf2, mqttException == null ? "false" : "true", this.f51665h, this}, mqttException);
                while (!this.f51659b) {
                    if (this.f51666i == null) {
                        try {
                            this.f51658a.fine(f51657q, "waitForResponse", "408", new Object[]{f(), Long.valueOf(j10)});
                            if (j10 <= 0) {
                                this.f51662e.wait();
                            } else {
                                this.f51662e.wait(j10);
                            }
                        } catch (InterruptedException e10) {
                            this.f51666i = new MqttException(e10);
                        }
                    }
                    if (!this.f51659b) {
                        MqttException mqttException2 = this.f51666i;
                        if (mqttException2 != null) {
                            this.f51658a.fine(f51657q, "waitForResponse", "401", null, mqttException2);
                            throw this.f51666i;
                        }
                        if (j10 > 0) {
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f51658a.fine(f51657q, "waitForResponse", "402", new Object[]{f(), this.f51665h});
        return this.f51665h;
    }

    public void E() {
        boolean z10;
        synchronized (this.f51663f) {
            try {
                synchronized (this.f51662e) {
                    MqttException mqttException = this.f51666i;
                    if (mqttException != null) {
                        throw mqttException;
                    }
                }
                while (true) {
                    z10 = this.f51661d;
                    if (z10) {
                        break;
                    }
                    try {
                        this.f51658a.fine(f51657q, "waitUntilSent", "409", new Object[]{f()});
                        this.f51663f.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (!z10) {
                    MqttException mqttException2 = this.f51666i;
                    if (mqttException2 != null) {
                        throw mqttException2;
                    }
                    throw i.a(6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() throws MqttException {
        if (d() == null) {
            return true;
        }
        throw d();
    }

    public IMqttActionListener b() {
        return this.f51670m;
    }

    public IMqttAsyncClient c() {
        return this.f51669l;
    }

    public MqttException d() {
        return this.f51666i;
    }

    public int[] e() {
        int[] iArr = new int[0];
        nj.u uVar = this.f51665h;
        return uVar instanceof nj.q ? ((nj.q) uVar).w() : iArr;
    }

    public String f() {
        return this.f51668k;
    }

    public MqttMessage g() {
        return this.f51664g;
    }

    public int h() {
        return this.f51672o;
    }

    public nj.u i() {
        return this.f51665h;
    }

    public boolean j() {
        nj.u uVar = this.f51665h;
        if (uVar instanceof C6997c) {
            return ((C6997c) uVar).x();
        }
        return false;
    }

    public String[] k() {
        return this.f51667j;
    }

    public Object l() {
        return this.f51671n;
    }

    public nj.u m() {
        return this.f51665h;
    }

    public boolean n() {
        return this.f51659b;
    }

    protected boolean o() {
        return this.f51660c;
    }

    public boolean p() {
        return this.f51673p;
    }

    protected void q(nj.u uVar, MqttException mqttException) {
        this.f51658a.fine(f51657q, "markComplete", "404", new Object[]{f(), uVar, mqttException});
        synchronized (this.f51662e) {
            try {
                if (uVar instanceof AbstractC6996b) {
                    this.f51664g = null;
                }
                this.f51660c = true;
                this.f51665h = uVar;
                this.f51666i = mqttException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void r() {
        this.f51658a.fine(f51657q, "notifyComplete", "404", new Object[]{f(), this.f51665h, this.f51666i});
        synchronized (this.f51662e) {
            try {
                if (this.f51666i == null && this.f51660c) {
                    this.f51659b = true;
                    this.f51660c = false;
                } else {
                    this.f51660c = false;
                }
                this.f51662e.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f51663f) {
            this.f51661d = true;
            this.f51663f.notifyAll();
        }
    }

    protected void s() {
        this.f51658a.fine(f51657q, "notifySent", "403", new Object[]{f()});
        synchronized (this.f51662e) {
            this.f51665h = null;
            this.f51659b = false;
        }
        synchronized (this.f51663f) {
            this.f51661d = true;
            this.f51663f.notifyAll();
        }
    }

    public void t(IMqttActionListener iMqttActionListener) {
        this.f51670m = iMqttActionListener;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(f());
        stringBuffer.append(" ,topics=");
        if (k() != null) {
            for (int i10 = 0; i10 < k().length; i10++) {
                stringBuffer.append(k()[i10]);
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(" ,usercontext=");
        stringBuffer.append(l());
        stringBuffer.append(" ,isComplete=");
        stringBuffer.append(n());
        stringBuffer.append(" ,isNotified=");
        stringBuffer.append(p());
        stringBuffer.append(" ,exception=");
        stringBuffer.append(d());
        stringBuffer.append(" ,actioncallback=");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }

    protected void u(IMqttAsyncClient iMqttAsyncClient) {
        this.f51669l = iMqttAsyncClient;
    }

    public void v(MqttException mqttException) {
        synchronized (this.f51662e) {
            this.f51666i = mqttException;
        }
    }

    public void w(String str) {
        this.f51668k = str;
    }

    public void x(MqttMessage mqttMessage) {
        this.f51664g = mqttMessage;
    }

    public void y(int i10) {
        this.f51672o = i10;
    }

    public void z(boolean z10) {
        this.f51673p = z10;
    }
}
