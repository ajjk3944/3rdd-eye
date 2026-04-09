package kj;

import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import nj.AbstractC6996b;
import nj.C6997c;
import nj.C6998d;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* renamed from: kj.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6474b {

    /* renamed from: E, reason: collision with root package name */
    private static final String f51531E = "kj.b";

    /* renamed from: A, reason: collision with root package name */
    private Hashtable f51532A;

    /* renamed from: B, reason: collision with root package name */
    private Hashtable f51533B;

    /* renamed from: C, reason: collision with root package name */
    private Hashtable f51534C;

    /* renamed from: D, reason: collision with root package name */
    private MqttPingSender f51535D;

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51536a;

    /* renamed from: b, reason: collision with root package name */
    private int f51537b;

    /* renamed from: c, reason: collision with root package name */
    private Hashtable f51538c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Vector f51539d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Vector f51540e;

    /* renamed from: f, reason: collision with root package name */
    private f f51541f;

    /* renamed from: g, reason: collision with root package name */
    private C6473a f51542g;

    /* renamed from: h, reason: collision with root package name */
    private c f51543h;

    /* renamed from: i, reason: collision with root package name */
    private long f51544i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f51545j;

    /* renamed from: k, reason: collision with root package name */
    private MqttClientPersistence f51546k;

    /* renamed from: l, reason: collision with root package name */
    private k f51547l;

    /* renamed from: m, reason: collision with root package name */
    private int f51548m;

    /* renamed from: n, reason: collision with root package name */
    private int f51549n;

    /* renamed from: o, reason: collision with root package name */
    private int f51550o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f51551p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f51552q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f51553r;

    /* renamed from: s, reason: collision with root package name */
    private long f51554s;

    /* renamed from: t, reason: collision with root package name */
    private long f51555t;

    /* renamed from: u, reason: collision with root package name */
    private long f51556u;

    /* renamed from: v, reason: collision with root package name */
    private nj.u f51557v;

    /* renamed from: w, reason: collision with root package name */
    private final Object f51558w;

    /* renamed from: x, reason: collision with root package name */
    private int f51559x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f51560y;

    /* renamed from: z, reason: collision with root package name */
    private Hashtable f51561z;

    protected C6474b(MqttClientPersistence mqttClientPersistence, f fVar, c cVar, C6473a c6473a, MqttPingSender mqttPingSender, k kVar) throws MqttException {
        String str = f51531E;
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
        this.f51536a = aVarA;
        this.f51537b = 0;
        this.f51542g = null;
        this.f51543h = null;
        this.f51548m = 0;
        this.f51549n = 0;
        this.f51550o = 0;
        this.f51551p = new Object();
        this.f51552q = new Object();
        this.f51553r = false;
        this.f51554s = 0L;
        this.f51555t = 0L;
        this.f51556u = 0L;
        this.f51558w = new Object();
        this.f51559x = 0;
        this.f51560y = false;
        this.f51561z = null;
        this.f51532A = null;
        this.f51533B = null;
        this.f51534C = null;
        this.f51535D = null;
        aVarA.setResourceName(c6473a.B().getClientId());
        this.f51536a.finer(str, "<Init>", "");
        this.f51538c = new Hashtable();
        this.f51540e = new Vector();
        this.f51561z = new Hashtable();
        this.f51532A = new Hashtable();
        this.f51533B = new Hashtable();
        this.f51534C = new Hashtable();
        this.f51557v = new nj.i();
        this.f51550o = 0;
        this.f51549n = 0;
        this.f51546k = mqttClientPersistence;
        this.f51543h = cVar;
        this.f51541f = fVar;
        this.f51542g = c6473a;
        this.f51535D = mqttPingSender;
        this.f51547l = kVar;
        M();
    }

    private Vector G(Vector vector) {
        Vector vector2 = new Vector();
        if (vector.size() == 0) {
            return vector2;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < vector.size()) {
            int iJ = ((nj.u) vector.elementAt(i10)).j();
            int i14 = iJ - i11;
            if (i14 > i12) {
                i13 = i10;
                i12 = i14;
            }
            i10++;
            i11 = iJ;
        }
        int i15 = (65535 - i11) + ((nj.u) vector.elementAt(0)).j() > i12 ? 0 : i13;
        for (int i16 = i15; i16 < vector.size(); i16++) {
            vector2.addElement(vector.elementAt(i16));
        }
        for (int i17 = 0; i17 < i15; i17++) {
            vector2.addElement(vector.elementAt(i17));
        }
        return vector2;
    }

    private synchronized void H(int i10) {
        this.f51538c.remove(Integer.valueOf(i10));
    }

    private void K() {
        this.f51539d = new Vector(this.f51548m);
        this.f51540e = new Vector();
        Enumeration enumerationKeys = this.f51561z.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            nj.u uVar = (nj.u) this.f51561z.get(objNextElement);
            if (uVar instanceof nj.o) {
                this.f51536a.fine(f51531E, "restoreInflightMessages", "610", new Object[]{objNextElement});
                uVar.r(true);
                v(this.f51539d, (nj.o) uVar);
            } else if (uVar instanceof nj.n) {
                this.f51536a.fine(f51531E, "restoreInflightMessages", "611", new Object[]{objNextElement});
                v(this.f51540e, (nj.n) uVar);
            }
        }
        Enumeration enumerationKeys2 = this.f51532A.keys();
        while (enumerationKeys2.hasMoreElements()) {
            Object objNextElement2 = enumerationKeys2.nextElement();
            nj.o oVar = (nj.o) this.f51532A.get(objNextElement2);
            oVar.r(true);
            this.f51536a.fine(f51531E, "restoreInflightMessages", "612", new Object[]{objNextElement2});
            v(this.f51539d, oVar);
        }
        Enumeration enumerationKeys3 = this.f51533B.keys();
        while (enumerationKeys3.hasMoreElements()) {
            Object objNextElement3 = enumerationKeys3.nextElement();
            nj.o oVar2 = (nj.o) this.f51533B.get(objNextElement3);
            this.f51536a.fine(f51531E, "restoreInflightMessages", "512", new Object[]{objNextElement3});
            v(this.f51539d, oVar2);
        }
        this.f51540e = G(this.f51540e);
        this.f51539d = G(this.f51539d);
    }

    private nj.u L(String str, MqttPersistable mqttPersistable) throws MqttException {
        nj.u uVarB;
        try {
            uVarB = nj.u.b(mqttPersistable);
        } catch (MqttException e10) {
            this.f51536a.fine(f51531E, "restoreMessage", "602", new Object[]{str}, e10);
            if (!(e10.getCause() instanceof EOFException)) {
                throw e10;
            }
            if (str != null) {
                this.f51546k.remove(str);
            }
            uVarB = null;
        }
        this.f51536a.fine(f51531E, "restoreMessage", "601", new Object[]{str, uVarB});
        return uVarB;
    }

    private void f() {
        synchronized (this.f51551p) {
            try {
                int i10 = this.f51549n - 1;
                this.f51549n = i10;
                this.f51536a.fine(f51531E, "decrementInFlight", "646", new Object[]{Integer.valueOf(i10)});
                if (!b()) {
                    this.f51551p.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized int o() {
        int i10;
        try {
            int i11 = this.f51537b;
            int i12 = 0;
            do {
                int i13 = this.f51537b + 1;
                this.f51537b = i13;
                if (i13 > 65535) {
                    this.f51537b = 1;
                }
                i10 = this.f51537b;
                if (i10 == i11 && (i12 = i12 + 1) == 2) {
                    throw i.a(32001);
                }
            } while (this.f51538c.containsKey(Integer.valueOf(i10)));
            Integer numValueOf = Integer.valueOf(this.f51537b);
            this.f51538c.put(numValueOf, numValueOf);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f51537b;
    }

    private String p(int i10) {
        return "r-" + i10;
    }

    private String q(nj.u uVar) {
        return "r-" + uVar.j();
    }

    private String r(nj.u uVar) {
        return "sb-" + uVar.j();
    }

    private String s(nj.u uVar) {
        return "sc-" + uVar.j();
    }

    private String t(int i10) {
        return "s-" + i10;
    }

    private String u(nj.u uVar) {
        return "s-" + uVar.j();
    }

    private void v(Vector vector, nj.u uVar) {
        int iJ = uVar.j();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            if (((nj.u) vector.elementAt(i10)).j() > iJ) {
                vector.insertElementAt(uVar, i10);
                return;
            }
        }
        vector.addElement(uVar);
    }

    protected void A(nj.u uVar) throws MqttPersistenceException {
        this.f51555t = this.f51547l.b();
        this.f51536a.fine(f51531E, "notifyReceivedMsg", "651", new Object[]{Integer.valueOf(uVar.j()), uVar});
        if (this.f51553r) {
            return;
        }
        if (!(uVar instanceof nj.o)) {
            if (uVar instanceof nj.n) {
                nj.o oVar = (nj.o) this.f51534C.get(Integer.valueOf(uVar.j()));
                if (oVar == null) {
                    N(new nj.l(uVar.j()), null);
                    return;
                }
                c cVar = this.f51543h;
                if (cVar != null) {
                    cVar.k(oVar);
                    return;
                }
                return;
            }
            return;
        }
        nj.o oVar2 = (nj.o) uVar;
        int qos = oVar2.x().getQos();
        if (qos == 0 || qos == 1) {
            c cVar2 = this.f51543h;
            if (cVar2 != null) {
                cVar2.k(oVar2);
                return;
            }
            return;
        }
        if (qos != 2) {
            return;
        }
        this.f51546k.put(q(uVar), oVar2);
        this.f51534C.put(Integer.valueOf(oVar2.j()), oVar2);
        N(new nj.m(oVar2), null);
    }

    protected void B(nj.u uVar, MqttToken mqttToken, MqttException mqttException) {
        mqttToken.internalTok.q(uVar, mqttException);
        mqttToken.internalTok.r();
        if (uVar != null && (uVar instanceof AbstractC6996b) && !(uVar instanceof nj.m)) {
            this.f51536a.fine(f51531E, "notifyResult", "648", new Object[]{mqttToken.internalTok.f(), uVar, mqttException});
            this.f51543h.a(mqttToken);
        }
        if (uVar == null) {
            this.f51536a.fine(f51531E, "notifyResult", "649", new Object[]{mqttToken.internalTok.f(), mqttException});
            this.f51543h.a(mqttToken);
        }
    }

    protected void C(nj.u uVar) {
        int i10;
        this.f51554s = this.f51547l.b();
        org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
        String str = f51531E;
        aVar.fine(str, "notifySent", "625", new Object[]{uVar.i()});
        MqttToken mqttTokenM = uVar.m();
        if (mqttTokenM == null && (mqttTokenM = this.f51541f.f(uVar)) == null) {
            return;
        }
        mqttTokenM.internalTok.s();
        if (uVar instanceof nj.i) {
            synchronized (this.f51558w) {
                long jB = this.f51547l.b();
                synchronized (this.f51558w) {
                    this.f51556u = jB;
                    i10 = this.f51559x + 1;
                    this.f51559x = i10;
                }
                this.f51536a.fine(str, "notifySent", "635", new Object[]{Integer.valueOf(i10)});
            }
            return;
        }
        if ((uVar instanceof nj.o) && ((nj.o) uVar).x().getQos() == 0) {
            mqttTokenM.internalTok.q(null, null);
            this.f51543h.a(mqttTokenM);
            f();
            H(uVar.j());
            this.f51541f.j(uVar);
            b();
        }
    }

    public void D(int i10) {
        if (i10 > 0) {
            this.f51554s = this.f51547l.b();
        }
        this.f51536a.fine(f51531E, "notifySentBytes", "643", new Object[]{Integer.valueOf(i10)});
    }

    public void E(nj.u uVar) throws MqttException {
        String strR = r(uVar);
        try {
            uVar.s(o());
            String strR2 = r(uVar);
            try {
                this.f51546k.put(strR2, (nj.o) uVar);
            } catch (MqttPersistenceException unused) {
                this.f51536a.fine(f51531E, "persistBufferedMessage", "515");
                this.f51546k.open(this.f51542g.B().getClientId(), this.f51542g.B().getServerURI());
                this.f51546k.put(strR2, (nj.o) uVar);
            }
            this.f51536a.fine(f51531E, "persistBufferedMessage", "513", new Object[]{strR2});
        } catch (MqttException e10) {
            this.f51536a.warning(f51531E, "persistBufferedMessage", "514", new Object[]{strR});
            throw e10;
        }
    }

    public void F(long j10) {
        if (j10 > 0) {
            org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
            String str = f51531E;
            aVar.fine(str, "quiesce", "637", new Object[]{Long.valueOf(j10)});
            synchronized (this.f51551p) {
                this.f51553r = true;
            }
            this.f51543h.m();
            x();
            synchronized (this.f51552q) {
                try {
                    try {
                        int iB = this.f51541f.b();
                        if (iB > 0 || this.f51540e.size() > 0 || !this.f51543h.h()) {
                            this.f51536a.fine(str, "quiesce", "639", new Object[]{Integer.valueOf(this.f51549n), Integer.valueOf(this.f51540e.size()), Integer.valueOf(this.f51550o), Integer.valueOf(iB)});
                            this.f51552q.wait(j10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
            synchronized (this.f51551p) {
                this.f51539d.clear();
                this.f51540e.clear();
                this.f51553r = false;
                this.f51549n = 0;
            }
            this.f51536a.fine(f51531E, "quiesce", "640");
        }
    }

    protected boolean I(IMqttDeliveryToken iMqttDeliveryToken) throws MqttException {
        boolean z10;
        MqttMessage message = iMqttDeliveryToken.getMessage();
        int messageId = iMqttDeliveryToken.getMessageId();
        synchronized (this.f51551p) {
            try {
                z10 = true;
                boolean z11 = message.getQos() == 1 && this.f51532A.remove(Integer.valueOf(messageId)) != null;
                if (message.getQos() == 2 && this.f51561z.remove(Integer.valueOf(messageId)) != null) {
                    z11 = true;
                }
                if (!this.f51539d.removeElement(message)) {
                    z10 = z11;
                }
                this.f51546k.remove(t(messageId));
                this.f51541f.i(Integer.toString(messageId));
                H(messageId);
                f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public Vector J(MqttException mqttException) {
        this.f51536a.fine(f51531E, "resolveOldTokens", "632", new Object[]{mqttException});
        if (mqttException == null) {
            mqttException = new MqttException(32102);
        }
        Vector vectorD = this.f51541f.d();
        Enumeration enumerationElements = vectorD.elements();
        while (enumerationElements.hasMoreElements()) {
            MqttToken mqttToken = (MqttToken) enumerationElements.nextElement();
            synchronized (mqttToken) {
                try {
                    if (!mqttToken.isComplete() && !mqttToken.internalTok.o() && mqttToken.getException() == null) {
                        mqttToken.internalTok.v(mqttException);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!(mqttToken instanceof MqttDeliveryToken)) {
                this.f51541f.i(mqttToken.internalTok.f());
            }
        }
        return vectorD;
    }

    protected void M() throws MqttException {
        Enumeration enumerationKeys = this.f51546k.keys();
        int iMax = this.f51537b;
        Vector vector = new Vector();
        this.f51536a.fine(f51531E, "restoreState", "600");
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            nj.u uVarL = L(str, this.f51546k.get(str));
            if (uVarL != null) {
                if (str.startsWith("r-")) {
                    this.f51536a.fine(f51531E, "restoreState", "604", new Object[]{str, uVarL});
                    this.f51534C.put(Integer.valueOf(uVarL.j()), uVarL);
                } else if (str.startsWith("s-")) {
                    nj.o oVar = (nj.o) uVarL;
                    iMax = Math.max(oVar.j(), iMax);
                    if (this.f51546k.containsKey(s(oVar))) {
                        nj.n nVar = (nj.n) L(str, this.f51546k.get(s(oVar)));
                        if (nVar != null) {
                            this.f51536a.fine(f51531E, "restoreState", "605", new Object[]{str, uVarL});
                            this.f51561z.put(Integer.valueOf(nVar.j()), nVar);
                        } else {
                            this.f51536a.fine(f51531E, "restoreState", "606", new Object[]{str, uVarL});
                        }
                    } else {
                        oVar.r(true);
                        if (oVar.x().getQos() == 2) {
                            this.f51536a.fine(f51531E, "restoreState", "607", new Object[]{str, uVarL});
                            this.f51561z.put(Integer.valueOf(oVar.j()), oVar);
                        } else {
                            this.f51536a.fine(f51531E, "restoreState", "608", new Object[]{str, uVarL});
                            this.f51532A.put(Integer.valueOf(oVar.j()), oVar);
                        }
                    }
                    this.f51541f.k(oVar).internalTok.u(this.f51542g.B());
                    this.f51538c.put(Integer.valueOf(oVar.j()), Integer.valueOf(oVar.j()));
                } else if (str.startsWith("sb-")) {
                    nj.o oVar2 = (nj.o) uVarL;
                    iMax = Math.max(oVar2.j(), iMax);
                    if (oVar2.x().getQos() == 2) {
                        this.f51536a.fine(f51531E, "restoreState", "607", new Object[]{str, uVarL});
                        this.f51561z.put(Integer.valueOf(oVar2.j()), oVar2);
                    } else if (oVar2.x().getQos() == 1) {
                        this.f51536a.fine(f51531E, "restoreState", "608", new Object[]{str, uVarL});
                        this.f51532A.put(Integer.valueOf(oVar2.j()), oVar2);
                    } else {
                        this.f51536a.fine(f51531E, "restoreState", "511", new Object[]{str, uVarL});
                        this.f51533B.put(Integer.valueOf(oVar2.j()), oVar2);
                        this.f51546k.remove(str);
                    }
                    this.f51541f.k(oVar2).internalTok.u(this.f51542g.B());
                    this.f51538c.put(Integer.valueOf(oVar2.j()), Integer.valueOf(oVar2.j()));
                } else if (str.startsWith("sc-") && !this.f51546k.containsKey(u((nj.n) uVarL))) {
                    vector.addElement(str);
                }
            }
        }
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            String str2 = (String) enumerationElements.nextElement();
            this.f51536a.fine(f51531E, "restoreState", "609", new Object[]{str2});
            this.f51546k.remove(str2);
        }
        this.f51537b = iMax;
    }

    public void N(nj.u uVar, MqttToken mqttToken) {
        if (uVar.p() && uVar.j() == 0 && (((uVar instanceof nj.o) && ((nj.o) uVar).x().getQos() != 0) || (uVar instanceof nj.k) || (uVar instanceof nj.m) || (uVar instanceof nj.n) || (uVar instanceof nj.l) || (uVar instanceof nj.r) || (uVar instanceof nj.q) || (uVar instanceof nj.t) || (uVar instanceof nj.s))) {
            uVar.s(o());
        }
        if (mqttToken != null) {
            uVar.t(mqttToken);
            try {
                mqttToken.internalTok.y(uVar.j());
            } catch (Exception unused) {
            }
        }
        if (uVar instanceof nj.o) {
            synchronized (this.f51551p) {
                try {
                    int i10 = this.f51549n;
                    if (i10 >= this.f51548m) {
                        this.f51536a.fine(f51531E, "send", "613", new Object[]{Integer.valueOf(i10)});
                        throw new MqttException(32202);
                    }
                    MqttMessage mqttMessageX = ((nj.o) uVar).x();
                    this.f51536a.fine(f51531E, "send", "628", new Object[]{Integer.valueOf(uVar.j()), Integer.valueOf(mqttMessageX.getQos()), uVar});
                    int qos = mqttMessageX.getQos();
                    if (qos == 1) {
                        this.f51532A.put(Integer.valueOf(uVar.j()), uVar);
                        this.f51546k.put(u(uVar), (nj.o) uVar);
                        this.f51541f.m(mqttToken, uVar);
                    } else if (qos == 2) {
                        this.f51561z.put(Integer.valueOf(uVar.j()), uVar);
                        this.f51546k.put(u(uVar), (nj.o) uVar);
                        this.f51541f.m(mqttToken, uVar);
                    }
                    this.f51539d.addElement(uVar);
                    this.f51551p.notifyAll();
                } finally {
                }
            }
            return;
        }
        this.f51536a.fine(f51531E, "send", "615", new Object[]{Integer.valueOf(uVar.j()), uVar});
        if (uVar instanceof C6998d) {
            synchronized (this.f51551p) {
                this.f51541f.m(mqttToken, uVar);
                this.f51540e.insertElementAt(uVar, 0);
                this.f51551p.notifyAll();
            }
            return;
        }
        if (uVar instanceof nj.i) {
            this.f51557v = uVar;
        } else if (uVar instanceof nj.n) {
            this.f51561z.put(Integer.valueOf(uVar.j()), uVar);
            this.f51546k.put(s(uVar), (nj.n) uVar);
        } else if (uVar instanceof nj.l) {
            this.f51546k.remove(q(uVar));
        }
        synchronized (this.f51551p) {
            try {
                if (!(uVar instanceof AbstractC6996b)) {
                    this.f51541f.m(mqttToken, uVar);
                }
                this.f51540e.addElement(uVar);
                this.f51551p.notifyAll();
            } finally {
            }
        }
    }

    protected void O(boolean z10) {
        this.f51545j = z10;
    }

    protected void P(long j10) {
        this.f51544i = TimeUnit.SECONDS.toNanos(j10);
    }

    protected void Q(int i10) {
        this.f51548m = i10;
        this.f51539d = new Vector(this.f51548m);
    }

    public void R(nj.u uVar) {
        try {
            this.f51536a.fine(f51531E, "unPersistBufferedMessage", "517", new Object[]{uVar.i()});
            this.f51546k.remove(r(uVar));
        } catch (MqttPersistenceException unused) {
            this.f51536a.fine(f51531E, "unPersistBufferedMessage", "518", new Object[]{uVar.i()});
        }
    }

    protected void S(nj.o oVar) {
        synchronized (this.f51551p) {
            try {
                this.f51536a.fine(f51531E, "undo", "618", new Object[]{Integer.valueOf(oVar.j()), Integer.valueOf(oVar.x().getQos())});
                if (oVar.x().getQos() == 1) {
                    this.f51532A.remove(Integer.valueOf(oVar.j()));
                } else {
                    this.f51561z.remove(Integer.valueOf(oVar.j()));
                }
                this.f51539d.removeElement(oVar);
                this.f51546k.remove(u(oVar));
                this.f51541f.j(oVar);
                if (oVar.x().getQos() > 0) {
                    H(oVar.j());
                    oVar.s(0);
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public MqttToken a(IMqttActionListener iMqttActionListener) {
        long jMax;
        MqttToken mqttToken;
        org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
        String str = f51531E;
        aVar.fine(str, "checkForActivity", "616", new Object[0]);
        synchronized (this.f51552q) {
            try {
                if (this.f51553r) {
                    return null;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeUnit.toMillis(this.f51544i);
                if (!this.f51560y || this.f51544i <= 0) {
                    return null;
                }
                long jB = this.f51547l.b();
                synchronized (this.f51558w) {
                    try {
                        int i10 = this.f51559x;
                        if (i10 > 0) {
                            long j10 = jB - this.f51555t;
                            long j11 = this.f51544i;
                            if (j10 >= 100000 + j11) {
                                this.f51536a.severe(str, "checkForActivity", "619", new Object[]{Long.valueOf(j11), Long.valueOf(this.f51554s), Long.valueOf(this.f51555t), Long.valueOf(jB), Long.valueOf(this.f51556u)});
                                throw i.a(32000);
                            }
                        }
                        if (i10 == 0) {
                            long j12 = jB - this.f51554s;
                            long j13 = this.f51544i;
                            if (j12 >= 2 * j13) {
                                this.f51536a.severe(str, "checkForActivity", "642", new Object[]{Long.valueOf(j13), Long.valueOf(this.f51554s), Long.valueOf(this.f51555t), Long.valueOf(jB), Long.valueOf(this.f51556u)});
                                throw i.a(32002);
                            }
                        }
                        if ((i10 != 0 || jB - this.f51555t < this.f51544i - 100000) && jB - this.f51554s < this.f51544i - 100000) {
                            this.f51536a.fine(str, "checkForActivity", "634", null);
                            jMax = Math.max(1L, m() - timeUnit.toMillis(jB - this.f51554s));
                            mqttToken = null;
                        } else {
                            this.f51536a.fine(str, "checkForActivity", "620", new Object[]{Long.valueOf(this.f51544i), Long.valueOf(this.f51554s), Long.valueOf(this.f51555t)});
                            mqttToken = new MqttToken(this.f51542g.B().getClientId());
                            if (iMqttActionListener != null) {
                                mqttToken.setActionCallback(iMqttActionListener);
                            }
                            this.f51541f.m(mqttToken, this.f51557v);
                            this.f51540e.insertElementAt(this.f51557v, 0);
                            jMax = m();
                            x();
                        }
                    } finally {
                    }
                }
                this.f51536a.fine(str, "checkForActivity", "624", new Object[]{Long.valueOf(jMax)});
                this.f51535D.schedule(jMax);
                return mqttToken;
            } finally {
            }
        }
    }

    protected boolean b() {
        int iB = this.f51541f.b();
        if (!this.f51553r || iB != 0 || this.f51540e.size() != 0 || !this.f51543h.h()) {
            return false;
        }
        this.f51536a.fine(f51531E, "checkQuiesceLock", "626", new Object[]{Boolean.valueOf(this.f51553r), Integer.valueOf(this.f51549n), Integer.valueOf(this.f51540e.size()), Integer.valueOf(this.f51550o), Boolean.valueOf(this.f51543h.h()), Integer.valueOf(iB)});
        synchronized (this.f51552q) {
            this.f51552q.notifyAll();
        }
        return true;
    }

    protected void c() throws MqttPersistenceException {
        this.f51536a.fine(f51531E, "clearState", ">");
        this.f51546k.clear();
        this.f51538c.clear();
        this.f51539d.clear();
        this.f51540e.clear();
        this.f51561z.clear();
        this.f51532A.clear();
        this.f51533B.clear();
        this.f51534C.clear();
        this.f51541f.a();
    }

    protected void d() {
        this.f51538c.clear();
        if (this.f51539d != null) {
            this.f51539d.clear();
        }
        this.f51540e.clear();
        this.f51561z.clear();
        this.f51532A.clear();
        this.f51533B.clear();
        this.f51534C.clear();
        this.f51541f.a();
        this.f51538c = null;
        this.f51539d = null;
        this.f51540e = null;
        this.f51561z = null;
        this.f51532A = null;
        this.f51533B = null;
        this.f51534C = null;
        this.f51541f = null;
        this.f51543h = null;
        this.f51542g = null;
        this.f51546k = null;
        this.f51557v = null;
        this.f51547l = null;
    }

    public void e() {
        this.f51536a.fine(f51531E, "connected", "631");
        this.f51560y = true;
        this.f51535D.start();
    }

    protected void g(int i10) {
        this.f51536a.fine(f51531E, "deliveryComplete", "641", new Object[]{Integer.valueOf(i10)});
        this.f51546k.remove(p(i10));
        this.f51534C.remove(Integer.valueOf(i10));
    }

    protected void h(nj.o oVar) {
        this.f51536a.fine(f51531E, "deliveryComplete", "641", new Object[]{Integer.valueOf(oVar.j())});
        this.f51546k.remove(q(oVar));
        this.f51534C.remove(Integer.valueOf(oVar.j()));
    }

    public void i(MqttException mqttException) {
        this.f51536a.fine(f51531E, "disconnected", "633", new Object[]{mqttException});
        this.f51560y = false;
        try {
            if (this.f51545j) {
                c();
            }
            this.f51539d.clear();
            this.f51540e.clear();
            synchronized (this.f51558w) {
                this.f51559x = 0;
            }
        } catch (MqttException unused) {
        }
    }

    protected nj.u j() {
        synchronized (this.f51551p) {
            nj.u uVar = null;
            while (uVar == null) {
                try {
                    if ((this.f51539d.isEmpty() && this.f51540e.isEmpty()) || (this.f51540e.isEmpty() && this.f51549n >= this.f51548m)) {
                        try {
                            org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
                            String str = f51531E;
                            aVar.fine(str, "get", "644");
                            this.f51551p.wait();
                            this.f51536a.fine(str, "get", "647");
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (this.f51540e != null && (this.f51560y || (!this.f51540e.isEmpty() && (((nj.u) this.f51540e.elementAt(0)) instanceof C6998d)))) {
                        if (!this.f51540e.isEmpty()) {
                            uVar = (nj.u) this.f51540e.remove(0);
                            if (uVar instanceof nj.n) {
                                int i10 = this.f51550o + 1;
                                this.f51550o = i10;
                                this.f51536a.fine(f51531E, "get", "617", new Object[]{Integer.valueOf(i10)});
                            }
                            b();
                        } else if (!this.f51539d.isEmpty()) {
                            if (this.f51549n < this.f51548m) {
                                uVar = (nj.u) this.f51539d.elementAt(0);
                                this.f51539d.removeElementAt(0);
                                int i11 = this.f51549n + 1;
                                this.f51549n = i11;
                                this.f51536a.fine(f51531E, "get", "623", new Object[]{Integer.valueOf(i11)});
                            } else {
                                this.f51536a.fine(f51531E, "get", "622");
                            }
                        }
                    }
                    this.f51536a.fine(f51531E, "get", "621");
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uVar;
        }
    }

    public int k() {
        return this.f51549n;
    }

    protected boolean l() {
        return this.f51545j;
    }

    protected long m() {
        return TimeUnit.NANOSECONDS.toMillis(this.f51544i);
    }

    public int n() {
        return this.f51548m;
    }

    protected void w(MqttToken mqttToken) throws MqttPersistenceException {
        nj.u uVarM = mqttToken.internalTok.m();
        if (uVarM == null || !(uVarM instanceof AbstractC6996b)) {
            return;
        }
        org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
        String str = f51531E;
        aVar.fine(str, "notifyComplete", "629", new Object[]{Integer.valueOf(uVarM.j()), mqttToken, uVarM});
        AbstractC6996b abstractC6996b = (AbstractC6996b) uVarM;
        if (abstractC6996b instanceof nj.k) {
            this.f51546k.remove(u(uVarM));
            this.f51546k.remove(r(uVarM));
            this.f51532A.remove(Integer.valueOf(abstractC6996b.j()));
            f();
            H(uVarM.j());
            this.f51541f.j(uVarM);
            this.f51536a.fine(str, "notifyComplete", "650", new Object[]{Integer.valueOf(abstractC6996b.j())});
        } else if (abstractC6996b instanceof nj.l) {
            this.f51546k.remove(u(uVarM));
            this.f51546k.remove(s(uVarM));
            this.f51546k.remove(r(uVarM));
            this.f51561z.remove(Integer.valueOf(abstractC6996b.j()));
            this.f51550o--;
            f();
            H(uVarM.j());
            this.f51541f.j(uVarM);
            this.f51536a.fine(str, "notifyComplete", "645", new Object[]{Integer.valueOf(abstractC6996b.j()), Integer.valueOf(this.f51550o)});
        }
        b();
    }

    public void x() {
        synchronized (this.f51551p) {
            this.f51536a.fine(f51531E, "notifyQueueLock", "638");
            this.f51551p.notifyAll();
        }
    }

    protected void y(AbstractC6996b abstractC6996b) throws MqttException {
        this.f51555t = this.f51547l.b();
        org.eclipse.paho.client.mqttv3.logging.a aVar = this.f51536a;
        String str = f51531E;
        aVar.fine(str, "notifyReceivedAck", "627", new Object[]{Integer.valueOf(abstractC6996b.j()), abstractC6996b});
        MqttToken mqttTokenF = this.f51541f.f(abstractC6996b);
        if (mqttTokenF == null) {
            this.f51536a.fine(str, "notifyReceivedAck", "662", new Object[]{Integer.valueOf(abstractC6996b.j())});
        } else if (abstractC6996b instanceof nj.m) {
            N(new nj.n((nj.m) abstractC6996b), mqttTokenF);
        } else if ((abstractC6996b instanceof nj.k) || (abstractC6996b instanceof nj.l)) {
            B(abstractC6996b, mqttTokenF, null);
        } else if (abstractC6996b instanceof nj.j) {
            synchronized (this.f51558w) {
                try {
                    this.f51559x = Math.max(0, this.f51559x - 1);
                    B(abstractC6996b, mqttTokenF, null);
                    if (this.f51559x == 0) {
                        this.f51541f.j(abstractC6996b);
                    }
                } finally {
                }
            }
            this.f51536a.fine(str, "notifyReceivedAck", "636", new Object[]{Integer.valueOf(this.f51559x)});
        } else if (abstractC6996b instanceof C6997c) {
            C6997c c6997c = (C6997c) abstractC6996b;
            int iW = c6997c.w();
            if (iW != 0) {
                throw i.a(iW);
            }
            synchronized (this.f51551p) {
                try {
                    if (this.f51545j) {
                        c();
                        this.f51541f.m(mqttTokenF, abstractC6996b);
                    }
                    this.f51550o = 0;
                    this.f51549n = 0;
                    K();
                    e();
                } finally {
                }
            }
            this.f51542g.r(c6997c, null);
            B(abstractC6996b, mqttTokenF, null);
            this.f51541f.j(abstractC6996b);
            synchronized (this.f51551p) {
                this.f51551p.notifyAll();
            }
        } else {
            B(abstractC6996b, mqttTokenF, null);
            H(abstractC6996b.j());
            this.f51541f.j(abstractC6996b);
        }
        b();
    }

    public void z(int i10) {
        if (i10 > 0) {
            this.f51555t = this.f51547l.b();
        }
        this.f51536a.fine(f51531E, "notifyReceivedBytes", "630", new Object[]{Integer.valueOf(i10)});
    }
}
