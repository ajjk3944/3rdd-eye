package kj;

import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import nj.C6997c;
import nj.C6998d;
import nj.C6999e;
import org.eclipse.paho.client.mqttv3.BufferedMessage;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* renamed from: kj.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6473a {

    /* renamed from: a, reason: collision with root package name */
    private final String f51498a;

    /* renamed from: b, reason: collision with root package name */
    private final org.eclipse.paho.client.mqttv3.logging.a f51499b;

    /* renamed from: c, reason: collision with root package name */
    private IMqttAsyncClient f51500c;

    /* renamed from: d, reason: collision with root package name */
    private int f51501d;

    /* renamed from: e, reason: collision with root package name */
    private p[] f51502e;

    /* renamed from: f, reason: collision with root package name */
    private kj.d f51503f;

    /* renamed from: g, reason: collision with root package name */
    private e f51504g;

    /* renamed from: h, reason: collision with root package name */
    private kj.c f51505h;

    /* renamed from: i, reason: collision with root package name */
    private C6474b f51506i;

    /* renamed from: j, reason: collision with root package name */
    private MqttConnectOptions f51507j;

    /* renamed from: k, reason: collision with root package name */
    private MqttClientPersistence f51508k;

    /* renamed from: l, reason: collision with root package name */
    private MqttPingSender f51509l;

    /* renamed from: m, reason: collision with root package name */
    private f f51510m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f51511n;

    /* renamed from: o, reason: collision with root package name */
    private byte f51512o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f51513p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f51514q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f51515r;

    /* renamed from: s, reason: collision with root package name */
    private h f51516s;

    /* renamed from: t, reason: collision with root package name */
    private ExecutorService f51517t;

    /* renamed from: kj.a$a, reason: collision with other inner class name */
    private class RunnableC1918a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        C6473a f51518a;

        /* renamed from: b, reason: collision with root package name */
        MqttToken f51519b;

        /* renamed from: c, reason: collision with root package name */
        C6998d f51520c;

        /* renamed from: d, reason: collision with root package name */
        private String f51521d;

        RunnableC1918a(C6473a c6473a, MqttToken mqttToken, C6998d c6998d, ExecutorService executorService) {
            this.f51518a = c6473a;
            this.f51519b = mqttToken;
            this.f51520c = c6998d;
            this.f51521d = "MQTT Con: " + C6473a.this.B().getClientId();
        }

        void a() {
            if (C6473a.this.f51517t == null) {
                new Thread(this).start();
            } else {
                C6473a.this.f51517t.execute(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            MqttException mqttExceptionB;
            Thread.currentThread().setName(this.f51521d);
            C6473a.this.f51499b.fine(C6473a.this.f51498a, "connectBG:run", "220");
            try {
                MqttDeliveryToken[] mqttDeliveryTokenArrC = C6473a.this.f51510m.c();
                int length = mqttDeliveryTokenArrC.length;
                int i10 = 0;
                while (true) {
                    mqttExceptionB = null;
                    if (i10 >= length) {
                        break;
                    }
                    mqttDeliveryTokenArrC[i10].internalTok.v(null);
                    i10++;
                }
                C6473a.this.f51510m.m(this.f51519b, this.f51520c);
                p pVar = C6473a.this.f51502e[C6473a.this.f51501d];
                pVar.start();
                C6473a.this.f51503f = new kj.d(this.f51518a, C6473a.this.f51506i, C6473a.this.f51510m, pVar.b());
                C6473a.this.f51503f.b("MQTT Rec: " + C6473a.this.B().getClientId(), C6473a.this.f51517t);
                C6473a.this.f51504g = new e(this.f51518a, C6473a.this.f51506i, C6473a.this.f51510m, pVar.a());
                C6473a.this.f51504g.c("MQTT Snd: " + C6473a.this.B().getClientId(), C6473a.this.f51517t);
                C6473a.this.f51505h.u("MQTT Call: " + C6473a.this.B().getClientId(), C6473a.this.f51517t);
                C6473a.this.I(this.f51520c, this.f51519b);
            } catch (MqttException e10) {
                C6473a.this.f51499b.fine(C6473a.this.f51498a, "connectBG:run", "212", null, e10);
                mqttExceptionB = e10;
            } catch (Exception e11) {
                C6473a.this.f51499b.fine(C6473a.this.f51498a, "connectBG:run", "209", null, e11);
                mqttExceptionB = i.b(e11);
            }
            if (mqttExceptionB != null) {
                C6473a.this.b0(this.f51519b, mqttExceptionB);
            }
        }
    }

    /* renamed from: kj.a$b */
    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        C6999e f51523a;

        /* renamed from: b, reason: collision with root package name */
        long f51524b;

        /* renamed from: c, reason: collision with root package name */
        MqttToken f51525c;

        /* renamed from: d, reason: collision with root package name */
        private String f51526d;

        b(C6999e c6999e, long j10, MqttToken mqttToken, ExecutorService executorService) {
            this.f51523a = c6999e;
            this.f51524b = j10;
            this.f51525c = mqttToken;
        }

        void a() {
            this.f51526d = "MQTT Disc: " + C6473a.this.B().getClientId();
            if (C6473a.this.f51517t == null) {
                new Thread(this).start();
            } else {
                C6473a.this.f51517t.execute(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName(this.f51526d);
            C6473a.this.f51499b.fine(C6473a.this.f51498a, "disconnectBG:run", "221");
            C6473a.this.f51506i.F(this.f51524b);
            try {
                C6473a.this.I(this.f51523a, this.f51525c);
                if (C6473a.this.f51504g != null && C6473a.this.f51504g.b()) {
                    this.f51525c.internalTok.E();
                }
                this.f51525c.internalTok.q(null, null);
            } catch (MqttException unused) {
                this.f51525c.internalTok.q(null, null);
                if (C6473a.this.f51504g == null || !C6473a.this.f51504g.b()) {
                }
            } catch (Throwable th2) {
                this.f51525c.internalTok.q(null, null);
                if (C6473a.this.f51504g == null || !C6473a.this.f51504g.b()) {
                    this.f51525c.internalTok.r();
                }
                C6473a.this.b0(this.f51525c, null);
                throw th2;
            }
            if (C6473a.this.f51504g == null || !C6473a.this.f51504g.b()) {
                this.f51525c.internalTok.r();
            }
            C6473a.this.b0(this.f51525c, null);
        }
    }

    /* renamed from: kj.a$c */
    class c implements l {
        c() {
        }

        @Override // kj.l
        public void a(nj.u uVar) {
            if (C6473a.this.f51516s.d()) {
                C6473a.this.f51506i.R(uVar);
            }
        }
    }

    /* renamed from: kj.a$d */
    class d implements m {

        /* renamed from: a, reason: collision with root package name */
        final String f51529a;

        d(String str) {
            this.f51529a = str;
        }

        @Override // kj.m
        public void a(BufferedMessage bufferedMessage) throws MqttException {
            if (!C6473a.this.K()) {
                C6473a.this.f51499b.fine(C6473a.this.f51498a, this.f51529a, "208");
                throw i.a(32104);
            }
            while (C6473a.this.f51506i.k() >= C6473a.this.f51506i.n() - 3) {
                Thread.yield();
            }
            C6473a.this.f51499b.fine(C6473a.this.f51498a, this.f51529a, "510", new Object[]{bufferedMessage.getMessage().i()});
            C6473a.this.I(bufferedMessage.getMessage(), bufferedMessage.getToken());
            C6473a.this.f51506i.R(bufferedMessage.getMessage());
        }
    }

    public C6473a(IMqttAsyncClient iMqttAsyncClient, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ExecutorService executorService, k kVar) {
        String name = C6473a.class.getName();
        this.f51498a = name;
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", name);
        this.f51499b = aVarA;
        this.f51511n = false;
        this.f51513p = new Object();
        this.f51514q = false;
        this.f51515r = false;
        this.f51512o = (byte) 3;
        this.f51500c = iMqttAsyncClient;
        this.f51508k = mqttClientPersistence;
        this.f51509l = mqttPingSender;
        mqttPingSender.init(this);
        this.f51517t = executorService;
        this.f51510m = new f(B().getClientId());
        this.f51505h = new kj.c(this);
        C6474b c6474b = new C6474b(mqttClientPersistence, this.f51510m, this.f51505h, this, mqttPingSender, kVar);
        this.f51506i = c6474b;
        this.f51505h.q(c6474b);
        aVarA.setResourceName(B().getClientId());
    }

    private MqttToken G(MqttToken mqttToken, MqttException mqttException) {
        this.f51499b.fine(this.f51498a, "handleOldTokens", "222");
        MqttToken mqttToken2 = null;
        if (mqttToken != null) {
            try {
                if (!mqttToken.isComplete() && this.f51510m.e(mqttToken.internalTok.f()) == null) {
                    this.f51510m.l(mqttToken, mqttToken.internalTok.f());
                }
            } catch (Exception unused) {
            }
        }
        Enumeration enumerationElements = this.f51506i.J(mqttException).elements();
        while (enumerationElements.hasMoreElements()) {
            MqttToken mqttToken3 = (MqttToken) enumerationElements.nextElement();
            if (mqttToken3.internalTok.f().equals("Disc") || mqttToken3.internalTok.f().equals("Con")) {
                mqttToken2 = mqttToken3;
            } else {
                this.f51505h.a(mqttToken3);
            }
        }
        return mqttToken2;
    }

    private void H(Exception exc) {
        this.f51499b.fine(this.f51498a, "handleRunException", "804", null, exc);
        b0(null, !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc);
    }

    public int A() {
        return this.f51516s.c();
    }

    public IMqttAsyncClient B() {
        return this.f51500c;
    }

    public long C() {
        return this.f51506i.m();
    }

    public int D() {
        return this.f51501d;
    }

    public p[] E() {
        return this.f51502e;
    }

    public MqttDeliveryToken[] F() {
        return this.f51510m.c();
    }

    void I(nj.u uVar, MqttToken mqttToken) throws MqttException {
        this.f51499b.fine(this.f51498a, "internalSend", "200", new Object[]{uVar.i(), uVar, mqttToken});
        if (mqttToken.getClient() != null) {
            this.f51499b.fine(this.f51498a, "internalSend", "213", new Object[]{uVar.i(), uVar, mqttToken});
            throw new MqttException(32201);
        }
        mqttToken.internalTok.u(B());
        try {
            this.f51506i.N(uVar, mqttToken);
        } catch (MqttException e10) {
            mqttToken.internalTok.u(null);
            if (uVar instanceof nj.o) {
                this.f51506i.S((nj.o) uVar);
            }
            throw e10;
        }
    }

    public boolean J() {
        boolean z10;
        synchronized (this.f51513p) {
            z10 = this.f51512o == 4;
        }
        return z10;
    }

    public boolean K() {
        boolean z10;
        synchronized (this.f51513p) {
            z10 = this.f51512o == 0;
        }
        return z10;
    }

    public boolean L() {
        boolean z10;
        synchronized (this.f51513p) {
            z10 = true;
            if (this.f51512o != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean M() {
        boolean z10;
        synchronized (this.f51513p) {
            z10 = this.f51512o == 3;
        }
        return z10;
    }

    public boolean N() {
        boolean z10;
        synchronized (this.f51513p) {
            z10 = this.f51512o == 2;
        }
        return z10;
    }

    public void O(int i10, int i11) {
        this.f51505h.l(i10, i11);
    }

    public void P() {
        if (this.f51516s != null) {
            this.f51499b.fine(this.f51498a, "notifyConnect", "509", null);
            this.f51516s.g(new d("notifyConnect"));
            this.f51516s.f(new c());
            ExecutorService executorService = this.f51517t;
            if (executorService == null) {
                new Thread(this.f51516s).start();
            } else {
                executorService.execute(this.f51516s);
            }
        }
    }

    public boolean Q(IMqttDeliveryToken iMqttDeliveryToken) {
        return this.f51506i.I(iMqttDeliveryToken);
    }

    public void R(String str) {
        this.f51505h.n(str);
    }

    public void S(nj.u uVar, MqttToken mqttToken) {
        if (!K() && ((K() || !(uVar instanceof C6998d)) && (!N() || !(uVar instanceof C6999e)))) {
            if (this.f51516s == null) {
                this.f51499b.fine(this.f51498a, "sendNoWait", "208");
                throw i.a(32104);
            }
            this.f51499b.fine(this.f51498a, "sendNoWait", "508", new Object[]{uVar.i()});
            if (this.f51516s.d()) {
                this.f51506i.E(uVar);
            }
            this.f51516s.e(uVar, mqttToken);
            return;
        }
        h hVar = this.f51516s;
        if (hVar == null || hVar.c() == 0) {
            I(uVar, mqttToken);
            return;
        }
        this.f51499b.fine(this.f51498a, "sendNoWait", "507", new Object[]{uVar.i()});
        if (this.f51516s.d()) {
            this.f51506i.E(uVar);
        }
        this.f51516s.e(uVar, mqttToken);
    }

    public void T(MqttCallback mqttCallback) {
        this.f51505h.p(mqttCallback);
    }

    public void U(h hVar) {
        this.f51516s = hVar;
    }

    public void V(boolean z10) {
        this.f51505h.r(z10);
    }

    public void W(String str, IMqttMessageListener iMqttMessageListener) {
        this.f51505h.s(str, iMqttMessageListener);
    }

    public void X(int i10) {
        this.f51501d = i10;
    }

    public void Y(p[] pVarArr) {
        this.f51502e = (p[]) pVarArr.clone();
    }

    public void Z(MqttCallbackExtended mqttCallbackExtended) {
        this.f51505h.t(mqttCallbackExtended);
    }

    public void a0(boolean z10) {
        this.f51515r = z10;
    }

    public void b0(MqttToken mqttToken, MqttException mqttException) {
        kj.c cVar;
        kj.c cVar2;
        MqttClientPersistence mqttClientPersistence;
        p pVar;
        synchronized (this.f51513p) {
            try {
                if (!this.f51511n && !this.f51514q && !J()) {
                    this.f51511n = true;
                    this.f51499b.fine(this.f51498a, "shutdownConnection", "216");
                    boolean z10 = K() || N();
                    this.f51512o = (byte) 2;
                    if (mqttToken != null && !mqttToken.isComplete()) {
                        mqttToken.internalTok.v(mqttException);
                    }
                    kj.c cVar3 = this.f51505h;
                    if (cVar3 != null) {
                        cVar3.v();
                    }
                    kj.d dVar = this.f51503f;
                    if (dVar != null) {
                        dVar.c();
                    }
                    try {
                        p[] pVarArr = this.f51502e;
                        if (pVarArr != null && (pVar = pVarArr[this.f51501d]) != null) {
                            pVar.stop();
                        }
                    } catch (Exception unused) {
                    }
                    this.f51510m.h(new MqttException(32102));
                    MqttToken mqttTokenG = G(mqttToken, mqttException);
                    try {
                        this.f51506i.i(mqttException);
                        if (this.f51506i.l()) {
                            this.f51505h.o();
                        }
                    } catch (Exception unused2) {
                    }
                    e eVar = this.f51504g;
                    if (eVar != null) {
                        eVar.d();
                    }
                    MqttPingSender mqttPingSender = this.f51509l;
                    if (mqttPingSender != null) {
                        mqttPingSender.stop();
                    }
                    try {
                        if (this.f51516s == null && (mqttClientPersistence = this.f51508k) != null) {
                            mqttClientPersistence.close();
                        }
                    } catch (Exception unused3) {
                    }
                    synchronized (this.f51513p) {
                        this.f51499b.fine(this.f51498a, "shutdownConnection", "217");
                        this.f51512o = (byte) 3;
                        this.f51511n = false;
                    }
                    if (mqttTokenG != null && (cVar2 = this.f51505h) != null) {
                        cVar2.a(mqttTokenG);
                    }
                    if (z10 && (cVar = this.f51505h) != null) {
                        cVar.b(mqttException);
                    }
                    synchronized (this.f51513p) {
                        if (this.f51514q) {
                            try {
                                p(true);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public MqttToken n() {
        return o(null);
    }

    public MqttToken o(IMqttActionListener iMqttActionListener) {
        try {
            return this.f51506i.a(iMqttActionListener);
        } catch (MqttException e10) {
            H(e10);
            return null;
        } catch (Exception e11) {
            H(e11);
            return null;
        }
    }

    public void p(boolean z10) {
        synchronized (this.f51513p) {
            try {
                if (!J()) {
                    if (!M() || z10) {
                        this.f51499b.fine(this.f51498a, "close", "224");
                        if (L()) {
                            throw new MqttException(32110);
                        }
                        if (K()) {
                            throw i.a(32100);
                        }
                        if (N()) {
                            this.f51514q = true;
                            return;
                        }
                    }
                    this.f51512o = (byte) 4;
                    this.f51506i.d();
                    this.f51506i = null;
                    this.f51505h = null;
                    this.f51508k = null;
                    this.f51504g = null;
                    this.f51509l = null;
                    this.f51503f = null;
                    this.f51502e = null;
                    this.f51507j = null;
                    this.f51510m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q(MqttConnectOptions mqttConnectOptions, MqttToken mqttToken) {
        synchronized (this.f51513p) {
            try {
                if (!M() || this.f51514q) {
                    this.f51499b.fine(this.f51498a, "connect", "207", new Object[]{Byte.valueOf(this.f51512o)});
                    if (J() || this.f51514q) {
                        throw new MqttException(32111);
                    }
                    if (L()) {
                        throw new MqttException(32110);
                    }
                    if (!N()) {
                        throw i.a(32100);
                    }
                    throw new MqttException(32102);
                }
                this.f51499b.fine(this.f51498a, "connect", "214");
                this.f51512o = (byte) 1;
                this.f51507j = mqttConnectOptions;
                C6998d c6998d = new C6998d(this.f51500c.getClientId(), this.f51507j.getMqttVersion(), this.f51507j.isCleanSession(), this.f51507j.getKeepAliveInterval(), this.f51507j.getUserName(), this.f51507j.getPassword(), this.f51507j.getWillMessage(), this.f51507j.getWillDestination());
                this.f51506i.P(this.f51507j.getKeepAliveInterval());
                this.f51506i.O(this.f51507j.isCleanSession());
                this.f51506i.Q(this.f51507j.getMaxInflight());
                this.f51510m.g();
                new RunnableC1918a(this, mqttToken, c6998d, this.f51517t).a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(C6997c c6997c, MqttException mqttException) throws MqttException {
        int iW = c6997c.w();
        synchronized (this.f51513p) {
            try {
                if (iW != 0) {
                    this.f51499b.fine(this.f51498a, "connectComplete", "204", new Object[]{Integer.valueOf(iW)});
                    throw mqttException;
                }
                this.f51499b.fine(this.f51498a, "connectComplete", "215");
                this.f51512o = (byte) 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        this.f51516s.a(i10);
    }

    protected void t(int i10) {
        this.f51506i.g(i10);
    }

    protected void u(nj.o oVar) {
        this.f51506i.h(oVar);
    }

    public void v(C6999e c6999e, long j10, MqttToken mqttToken) {
        synchronized (this.f51513p) {
            try {
                if (J()) {
                    this.f51499b.fine(this.f51498a, "disconnect", "223");
                    throw i.a(32111);
                }
                if (M()) {
                    this.f51499b.fine(this.f51498a, "disconnect", "211");
                    throw i.a(32101);
                }
                if (N()) {
                    this.f51499b.fine(this.f51498a, "disconnect", "219");
                    throw i.a(32102);
                }
                if (Thread.currentThread() == this.f51505h.e()) {
                    this.f51499b.fine(this.f51498a, "disconnect", "210");
                    throw i.a(32107);
                }
                this.f51499b.fine(this.f51498a, "disconnect", "218");
                this.f51512o = (byte) 2;
                new b(c6999e, j10, mqttToken, this.f51517t).a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(long j10, long j11) {
        x(j10, j11, true);
    }

    public void x(long j10, long j11, boolean z10) {
        this.f51512o = (byte) 2;
        C6474b c6474b = this.f51506i;
        if (c6474b != null) {
            c6474b.F(j10);
        }
        MqttToken mqttToken = new MqttToken(this.f51500c.getClientId());
        if (z10) {
            try {
                I(new C6999e(), mqttToken);
                mqttToken.waitForCompletion(j11);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                mqttToken.internalTok.q(null, null);
                b0(mqttToken, null);
                throw th2;
            }
        }
        mqttToken.internalTok.q(null, null);
        b0(mqttToken, null);
    }

    public int y() {
        return this.f51506i.k();
    }

    public MqttMessage z(int i10) {
        return ((nj.o) this.f51516s.b(i10).getMessage()).x();
    }
}
