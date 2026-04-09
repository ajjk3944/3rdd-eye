package Lg;

import Kg.a;
import Kg.d;
import Lg.h;
import Lg.j;
import Lg.m;
import Lg.n;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class l extends Kg.a implements Lg.i, Lg.j {

    /* renamed from: v, reason: collision with root package name */
    private static Ej.b f11730v = Ej.c.i(l.class);

    /* renamed from: w, reason: collision with root package name */
    private static final Random f11731w = new Random();

    /* renamed from: b, reason: collision with root package name */
    private volatile InetAddress f11732b;

    /* renamed from: c, reason: collision with root package name */
    private volatile MulticastSocket f11733c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11734d;

    /* renamed from: e, reason: collision with root package name */
    final ConcurrentMap f11735e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f11736f;

    /* renamed from: g, reason: collision with root package name */
    private final Lg.a f11737g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f11738h;

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentMap f11739i;

    /* renamed from: j, reason: collision with root package name */
    protected final long f11740j;

    /* renamed from: k, reason: collision with root package name */
    protected Thread f11741k;

    /* renamed from: l, reason: collision with root package name */
    private k f11742l;

    /* renamed from: m, reason: collision with root package name */
    private Thread f11743m;

    /* renamed from: n, reason: collision with root package name */
    private int f11744n;

    /* renamed from: o, reason: collision with root package name */
    private long f11745o;

    /* renamed from: r, reason: collision with root package name */
    private Lg.c f11748r;

    /* renamed from: s, reason: collision with root package name */
    private final ConcurrentMap f11749s;

    /* renamed from: t, reason: collision with root package name */
    private final String f11750t;

    /* renamed from: p, reason: collision with root package name */
    private final ExecutorService f11746p = Executors.newSingleThreadExecutor(new Pg.b("JmDNS"));

    /* renamed from: q, reason: collision with root package name */
    private final ReentrantLock f11747q = new ReentrantLock();

    /* renamed from: u, reason: collision with root package name */
    private final Object f11751u = new Object();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.a f11752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kg.c f11753b;

        a(m.a aVar, Kg.c cVar) {
            this.f11752a = aVar;
            this.f11753b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11752a.f(this.f11753b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.b f11755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kg.c f11756b;

        b(m.b bVar, Kg.c cVar) {
            this.f11755a = bVar;
            this.f11756b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11755a.c(this.f11756b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.b f11758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kg.c f11759b;

        c(m.b bVar, Kg.c cVar) {
            this.f11758a = bVar;
            this.f11759b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11758a.d(this.f11759b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.a f11761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kg.c f11762b;

        d(m.a aVar, Kg.c cVar) {
            this.f11761a = aVar;
            this.f11762b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11761a.d(this.f11762b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.a f11764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kg.c f11765b;

        e(m.a aVar, Kg.c cVar) {
            this.f11764a = aVar;
            this.f11765b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11764a.e(this.f11765b);
        }
    }

    class f extends Thread {
        f(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            l.this.q0();
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11768a;

        static {
            int[] iArr = new int[h.values().length];
            f11768a = iArr;
            try {
                iArr[h.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11768a[h.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    private static class i implements Kg.e {

        /* renamed from: c, reason: collision with root package name */
        private final String f11771c;

        /* renamed from: a, reason: collision with root package name */
        private final ConcurrentMap f11769a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f11770b = new ConcurrentHashMap();

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f11772d = true;

        public i(String str) {
            this.f11771c = str;
        }

        @Override // Kg.e
        public void b(Kg.c cVar) {
            synchronized (this) {
                this.f11769a.remove(cVar.getName());
                this.f11770b.remove(cVar.getName());
            }
        }

        @Override // Kg.e
        public void c(Kg.c cVar) {
            synchronized (this) {
                try {
                    Kg.d dVarD = cVar.d();
                    if (dVarD == null || !dVarD.D()) {
                        q qVarJ1 = ((l) cVar.c()).j1(cVar.h(), cVar.getName(), dVarD != null ? dVarD.x() : "", true);
                        if (qVarJ1 != null) {
                            this.f11769a.put(cVar.getName(), qVarJ1);
                        } else {
                            this.f11770b.put(cVar.getName(), cVar);
                        }
                    } else {
                        this.f11769a.put(cVar.getName(), dVarD);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Kg.e
        public void e(Kg.c cVar) {
            synchronized (this) {
                this.f11769a.put(cVar.getName(), cVar.d());
                this.f11770b.remove(cVar.getName());
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n\tType: ");
            sb2.append(this.f11771c);
            if (this.f11769a.isEmpty()) {
                sb2.append("\n\tNo services collected.");
            } else {
                sb2.append("\n\tServices");
                for (Map.Entry entry : this.f11769a.entrySet()) {
                    sb2.append("\n\t\tService: ");
                    sb2.append((String) entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
            }
            if (this.f11770b.isEmpty()) {
                sb2.append("\n\tNo event queued.");
            } else {
                sb2.append("\n\tEvents");
                for (Map.Entry entry2 : this.f11770b.entrySet()) {
                    sb2.append("\n\t\tEvent: ");
                    sb2.append((String) entry2.getKey());
                    sb2.append(": ");
                    sb2.append(entry2.getValue());
                }
            }
            return sb2.toString();
        }
    }

    public static class j extends AbstractMap implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private final Set f11773a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private final String f11774b;

        private static class a implements Map.Entry, Serializable, Cloneable {

            /* renamed from: a, reason: collision with root package name */
            private final String f11775a;

            /* renamed from: b, reason: collision with root package name */
            private final String f11776b;

            public a(String str) {
                str = str == null ? "" : str;
                this.f11776b = str;
                this.f11775a = str.toLowerCase();
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return this;
            }

            @Override // java.util.Map.Entry
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String getKey() {
                return this.f11775a;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            @Override // java.util.Map.Entry
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public String getValue() {
                return this.f11776b;
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                String str = this.f11775a;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f11776b;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            @Override // java.util.Map.Entry
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }

            public String toString() {
                return this.f11775a + "=" + this.f11776b;
            }
        }

        public j(String str) {
            this.f11774b = str;
        }

        public boolean b(String str) {
            if (str == null || e(str)) {
                return false;
            }
            this.f11773a.add(new a(str));
            return true;
        }

        @Override // java.util.AbstractMap
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j clone() {
            j jVar = new j(f());
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                jVar.b((String) ((Map.Entry) it.next()).getValue());
            }
            return jVar;
        }

        public boolean e(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return this.f11773a;
        }

        public String f() {
            return this.f11774b;
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb2 = new StringBuilder(200);
            if (isEmpty()) {
                sb2.append("empty");
            } else {
                Iterator it = values().iterator();
                while (it.hasNext()) {
                    sb2.append((String) it.next());
                    sb2.append(", ");
                }
                sb2.setLength(sb2.length() - 2);
            }
            return sb2.toString();
        }
    }

    public l(InetAddress inetAddress, String str, long j10) throws IOException {
        f11730v.l("JmDNS instance created");
        this.f11737g = new Lg.a(100);
        this.f11734d = Collections.synchronizedList(new ArrayList());
        this.f11735e = new ConcurrentHashMap();
        this.f11736f = Collections.synchronizedSet(new HashSet());
        this.f11749s = new ConcurrentHashMap();
        this.f11738h = new ConcurrentHashMap(20);
        this.f11739i = new ConcurrentHashMap(20);
        k kVarZ = k.z(inetAddress, this, str);
        this.f11742l = kVarZ;
        this.f11750t = str == null ? kVarZ.p() : str;
        this.f11740j = j10;
        b1(F0());
        p1(K0().values());
        y();
    }

    public static Random H0() {
        return f11731w;
    }

    private boolean Y0(Lg.h hVar, long j10) {
        return hVar.A() < j10 - 1000;
    }

    private boolean a1(q qVar) {
        boolean z10;
        String strM = qVar.m();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            for (Lg.b bVar : z0().n(qVar.m())) {
                if (javax.jmdns.impl.constants.e.TYPE_SRV.equals(bVar.g()) && !bVar.k(jCurrentTimeMillis)) {
                    h.f fVar = (h.f) bVar;
                    if (fVar.W() != qVar.o() || !fVar.Y().equals(this.f11742l.p())) {
                        f11730v.o("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}", bVar, fVar.Y(), this.f11742l.p(), Boolean.valueOf(fVar.Y().equals(this.f11742l.p())));
                        qVar.k0(n.c.a().a(this.f11742l.n(), qVar.n(), n.d.SERVICE));
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            Kg.d dVar = (Kg.d) this.f11738h.get(qVar.m());
            if (dVar != null && dVar != qVar) {
                qVar.k0(n.c.a().a(this.f11742l.n(), qVar.n(), n.d.SERVICE));
                z10 = true;
            }
        } while (z10);
        return !strM.equals(qVar.m());
    }

    private void b1(k kVar) throws IOException {
        if (this.f11732b == null) {
            if (kVar.n() instanceof Inet6Address) {
                this.f11732b = InetAddress.getByName(javax.jmdns.impl.constants.a.f50177b);
            } else {
                this.f11732b = InetAddress.getByName(javax.jmdns.impl.constants.a.f50176a);
            }
        }
        if (this.f11733c != null) {
            x0();
        }
        int i10 = javax.jmdns.impl.constants.a.f50178c;
        this.f11733c = new MulticastSocket(i10);
        if (kVar == null || kVar.o() == null) {
            f11730v.d("Trying to joinGroup({})", this.f11732b);
            this.f11733c.joinGroup(this.f11732b);
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f11732b, i10);
            this.f11733c.setNetworkInterface(kVar.o());
            f11730v.g("Trying to joinGroup({}, {})", inetSocketAddress, kVar.o());
            this.f11733c.joinGroup(inetSocketAddress, kVar.o());
        }
        this.f11733c.setTimeToLive(255);
    }

    private void h1(Kg.c cVar) {
        Cloneable cloneableD = cVar.d();
        if (cloneableD instanceof Lg.d) {
            g1((Lg.d) cloneableD);
        }
    }

    private void p1(Collection collection) {
        if (this.f11743m == null) {
            s sVar = new s(this);
            this.f11743m = sVar;
            sVar.start();
        }
        C();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                m0(new q((Kg.d) it.next()));
            } catch (Exception e10) {
                f11730v.r("start() Registration exception ", e10);
            }
        }
    }

    static String q1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    private List r0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Lg.h hVar = (Lg.h) it.next();
            if (hVar.g().equals(javax.jmdns.impl.constants.e.TYPE_A) || hVar.g().equals(javax.jmdns.impl.constants.e.TYPE_AAAA)) {
                arrayList2.add(hVar);
            } else {
                arrayList.add(hVar);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void t0(String str, Kg.e eVar, boolean z10) {
        m.a aVar = new m.a(eVar, z10);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f11735e.get(lowerCase);
        if (list == null) {
            if (this.f11735e.putIfAbsent(lowerCase, new LinkedList()) == null && this.f11749s.putIfAbsent(lowerCase, new i(str)) == null) {
                t0(lowerCase, (Kg.e) this.f11749s.get(lowerCase), true);
            }
            list = (List) this.f11735e.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                try {
                    if (!list.contains(aVar)) {
                        list.add(aVar);
                    }
                } finally {
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = z0().h().iterator();
        while (it.hasNext()) {
            Lg.h hVar = (Lg.h) ((Lg.b) it.next());
            if (hVar.g() == javax.jmdns.impl.constants.e.TYPE_SRV && hVar.c().endsWith(lowerCase)) {
                arrayList.add(new p(this, hVar.i(), q1(hVar.i(), hVar.d()), hVar.F()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.d((Kg.c) it2.next());
        }
        j(str);
    }

    private void x0() throws IOException {
        f11730v.l("closeMulticastSocket()");
        if (this.f11733c != null) {
            try {
                try {
                    this.f11733c.leaveGroup(this.f11732b);
                } catch (Exception e10) {
                    f11730v.r("closeMulticastSocket() Close socket exception ", e10);
                }
            } catch (SocketException unused) {
            }
            this.f11733c.close();
            while (true) {
                Thread thread = this.f11743m;
                if (thread == null || !thread.isAlive()) {
                    break;
                }
                synchronized (this) {
                    try {
                        Thread thread2 = this.f11743m;
                        if (thread2 != null && thread2.isAlive()) {
                            f11730v.l("closeMulticastSocket(): waiting for jmDNS monitor");
                            wait(1000L);
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.f11743m = null;
            this.f11733c = null;
        }
    }

    private void y0() {
        f11730v.l("disposeServiceCollectors()");
        for (Map.Entry entry : this.f11749s.entrySet()) {
            i iVar = (i) entry.getValue();
            if (iVar != null) {
                String str = (String) entry.getKey();
                n0(str, iVar);
                this.f11749s.remove(str, iVar);
            }
        }
    }

    public a.InterfaceC0432a A0() {
        return null;
    }

    public l B0() {
        return this;
    }

    @Override // Lg.j
    public void C() {
        j.b.b().c(B0()).C();
    }

    public InetAddress C0() {
        return this.f11732b;
    }

    public InetAddress D0() {
        return this.f11742l.n();
    }

    public long E0() {
        return this.f11745o;
    }

    public k F0() {
        return this.f11742l;
    }

    public String G0() {
        return this.f11750t;
    }

    q I0(String str, String str2, String str3, boolean z10) {
        q qVar;
        byte[] bArr;
        String strW;
        Kg.d dVarG;
        Kg.d dVarG2;
        Kg.d dVarG3;
        Kg.d dVarG4;
        q qVar2 = new q(str, str2, str3, 0, 0, 0, z10, (byte[]) null);
        Lg.a aVarZ0 = z0();
        javax.jmdns.impl.constants.d dVar = javax.jmdns.impl.constants.d.CLASS_ANY;
        Lg.b bVarJ = aVarZ0.j(new h.e(str, dVar, false, 0, qVar2.u()));
        if (!(bVarJ instanceof Lg.h) || (qVar = (q) ((Lg.h) bVarJ).G(z10)) == null) {
            return qVar2;
        }
        Map mapS = qVar.S();
        Lg.b bVarL = z0().l(qVar2.u(), javax.jmdns.impl.constants.e.TYPE_SRV, dVar);
        if (!(bVarL instanceof Lg.h) || (dVarG4 = ((Lg.h) bVarL).G(z10)) == null) {
            bArr = null;
            strW = "";
        } else {
            q qVar3 = new q(mapS, dVarG4.o(), dVarG4.B(), dVarG4.p(), z10, (byte[]) null);
            byte[] bArrZ = dVarG4.z();
            strW = dVarG4.w();
            bArr = bArrZ;
            qVar = qVar3;
        }
        Iterator it = z0().p(strW, javax.jmdns.impl.constants.e.TYPE_A, dVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Lg.b bVar = (Lg.b) it.next();
            if ((bVar instanceof Lg.h) && (dVarG3 = ((Lg.h) bVar).G(z10)) != null) {
                for (Inet4Address inet4Address : dVarG3.i()) {
                    qVar.H(inet4Address);
                }
                qVar.G(dVarG3.z());
            }
        }
        for (Lg.b bVar2 : z0().p(strW, javax.jmdns.impl.constants.e.TYPE_AAAA, javax.jmdns.impl.constants.d.CLASS_ANY)) {
            if ((bVar2 instanceof Lg.h) && (dVarG2 = ((Lg.h) bVar2).G(z10)) != null) {
                for (Inet6Address inet6Address : dVarG2.k()) {
                    qVar.I(inet6Address);
                }
                qVar.G(dVarG2.z());
            }
        }
        Lg.b bVarL2 = z0().l(qVar.u(), javax.jmdns.impl.constants.e.TYPE_TXT, javax.jmdns.impl.constants.d.CLASS_ANY);
        if ((bVarL2 instanceof Lg.h) && (dVarG = ((Lg.h) bVarL2).G(z10)) != null) {
            qVar.G(dVarG.z());
        }
        if (qVar.z().length == 0) {
            qVar.G(bArr);
        }
        return qVar.D() ? qVar : qVar2;
    }

    @Override // Lg.j
    public void J() {
        j.b.b().c(B0()).J();
    }

    public Map J0() {
        return this.f11739i;
    }

    public Map K0() {
        return this.f11738h;
    }

    public MulticastSocket L0() {
        return this.f11733c;
    }

    public int M0() {
        return this.f11744n;
    }

    void N0(Lg.c cVar, InetAddress inetAddress, int i10) {
        f11730v.c("{} handle query: {}", G0(), cVar);
        long jCurrentTimeMillis = System.currentTimeMillis() + 120;
        Iterator it = cVar.b().iterator();
        boolean zI = false;
        while (it.hasNext()) {
            zI |= ((Lg.h) it.next()).I(this, jCurrentTimeMillis);
        }
        R0();
        try {
            Lg.c cVar2 = this.f11748r;
            if (cVar2 != null) {
                cVar2.z(cVar);
            } else {
                Lg.c cVarA = cVar.clone();
                if (cVar.r()) {
                    this.f11748r = cVarA;
                }
                P(cVarA, inetAddress, i10);
            }
            S0();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Iterator it2 = cVar.c().iterator();
            while (it2.hasNext()) {
                O0((Lg.h) it2.next(), jCurrentTimeMillis2);
            }
            if (zI) {
                C();
            }
        } catch (Throwable th2) {
            S0();
            throw th2;
        }
    }

    void O0(Lg.h hVar, long j10) {
        h hVar2 = h.Noop;
        boolean zK = hVar.k(j10);
        f11730v.c("{} handle response: {}", G0(), hVar);
        if (!hVar.p() && !hVar.j()) {
            boolean zQ = hVar.q();
            Lg.h hVar3 = (Lg.h) z0().j(hVar);
            f11730v.c("{} handle response cached record: {}", G0(), hVar3);
            if (zQ) {
                for (Lg.b bVar : z0().n(hVar.c())) {
                    if (hVar.g().equals(bVar.g()) && hVar.f().equals(bVar.f())) {
                        Lg.h hVar4 = (Lg.h) bVar;
                        if (Y0(hVar4, j10)) {
                            f11730v.d("setWillExpireSoon() on: {}", bVar);
                            hVar4.S(j10);
                        }
                    }
                }
            }
            if (hVar3 != null) {
                if (zK) {
                    if (hVar.H() == 0) {
                        hVar2 = h.Noop;
                        f11730v.d("Record is expired - setWillExpireSoon() on:\n\t{}", hVar3);
                        hVar3.S(j10);
                    } else {
                        hVar2 = h.Remove;
                        f11730v.d("Record is expired - removeDNSEntry() on:\n\t{}", hVar3);
                        z0().s(hVar3);
                    }
                } else if (hVar.Q(hVar3) && (hVar.v(hVar3) || hVar.h().length() <= 0)) {
                    hVar3.O(hVar);
                    hVar = hVar3;
                } else if (hVar.L()) {
                    hVar2 = h.Update;
                    f11730v.g("Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}", hVar, hVar3);
                    z0().t(hVar, hVar3);
                } else {
                    hVar2 = h.Add;
                    f11730v.d("Record (multiValue) has changed - addDNSEntry on:\n\t{}", hVar);
                    z0().g(hVar);
                }
            } else if (!zK) {
                hVar2 = h.Add;
                f11730v.d("Record not cached - addDNSEntry on:\n\t{}", hVar);
                z0().g(hVar);
            }
        }
        if (hVar.g() == javax.jmdns.impl.constants.e.TYPE_PTR) {
            if (hVar.p()) {
                if (zK) {
                    return;
                }
                e1(((h.e) hVar).W());
                return;
            } else if (e1(hVar.d()) && hVar2 == h.Noop) {
                hVar2 = h.RegisterServiceType;
            }
        }
        if (hVar2 != h.Noop) {
            s1(j10, hVar, hVar2);
        }
    }

    @Override // Lg.j
    public void P(Lg.c cVar, InetAddress inetAddress, int i10) {
        j.b.b().c(B0()).P(cVar, inetAddress, i10);
    }

    void P0(Lg.c cVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zJ = false;
        boolean zJ2 = false;
        for (Lg.h hVar : r0(cVar.b())) {
            O0(hVar, jCurrentTimeMillis);
            if (javax.jmdns.impl.constants.e.TYPE_A.equals(hVar.g()) || javax.jmdns.impl.constants.e.TYPE_AAAA.equals(hVar.g())) {
                zJ |= hVar.J(this);
            } else {
                zJ2 |= hVar.J(this);
            }
        }
        if (zJ || zJ2) {
            C();
        }
    }

    void Q0(Kg.c cVar) {
        ArrayList arrayList;
        List list = (List) this.f11735e.get(cVar.h().toLowerCase());
        if (list == null || list.isEmpty() || cVar.d() == null || !cVar.d().D()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f11746p.submit(new a((m.a) it.next(), cVar));
        }
    }

    public void R0() {
        this.f11747q.lock();
    }

    @Override // Lg.j
    public void S() {
        j.b.b().c(B0()).S();
    }

    public void S0() {
        this.f11747q.unlock();
    }

    @Override // Lg.j
    public void T() {
        j.b.b().c(B0()).T();
    }

    public boolean T0() {
        return this.f11742l.r();
    }

    public boolean U0(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        return this.f11742l.s(aVar, gVar);
    }

    public boolean V0() {
        return this.f11742l.t();
    }

    public boolean W0() {
        return this.f11742l.u();
    }

    public boolean X0() {
        return this.f11742l.w();
    }

    @Override // Lg.j
    public void Y() {
        j.b.b().c(B0()).Y();
    }

    public boolean Z0() {
        return this.f11742l.x();
    }

    @Override // Lg.j
    public void a() {
        j.b.b().c(B0()).a();
    }

    @Override // Kg.a
    public void b0(String str, Kg.e eVar) {
        t0(str, eVar, false);
    }

    public void c1() {
        f11730v.n("{}.recover()", G0());
        if (X0() || isClosed() || W0() || V0()) {
            return;
        }
        synchronized (this.f11751u) {
            try {
                if (v0()) {
                    String str = G0() + ".recover()";
                    f11730v.c("{} thread {}", str, Thread.currentThread().getName());
                    new f(str).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (X0()) {
            return;
        }
        f11730v.n("Cancelling JmDNS: {}", this);
        if (v0()) {
            f11730v.l("Canceling the timer");
            s();
            r1();
            y0();
            f11730v.n("Wait for JmDNS cancel: {}", this);
            t1(5000L);
            f11730v.l("Canceling the state timer");
            g();
            this.f11746p.shutdown();
            x0();
            if (this.f11741k != null) {
                Runtime.getRuntime().removeShutdownHook(this.f11741k);
            }
            j.b.b().a(B0());
            f11730v.l("JmDNS closed.");
        }
        h(null);
    }

    @Override // Kg.a
    public void d0(Kg.f fVar) {
        m.b bVar = new m.b(fVar, false);
        this.f11736f.add(bVar);
        Iterator it = this.f11739i.keySet().iterator();
        while (it.hasNext()) {
            bVar.c(new p(this, (String) it.next(), "", null));
        }
        Y();
    }

    public boolean d1() {
        return this.f11742l.A();
    }

    public boolean e1(String str) {
        boolean z10;
        j jVar;
        Map mapB = r.b(str);
        String str2 = (String) mapB.get(d.a.Domain);
        String str3 = (String) mapB.get(d.a.Protocol);
        String str4 = (String) mapB.get(d.a.Application);
        String str5 = (String) mapB.get(d.a.Subtype);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4.length() > 0 ? "_" + str4 + "." : "");
        sb2.append(str3.length() > 0 ? "_" + str3 + "." : "");
        sb2.append(str2);
        sb2.append(".");
        String string = sb2.toString();
        String lowerCase = string.toLowerCase();
        f11730v.o("{} registering service type: {} as: {}{}{}", G0(), str, string, str5.length() > 0 ? " subtype: " : "", str5.length() > 0 ? str5 : "");
        boolean z11 = true;
        if (this.f11739i.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z10 = false;
        } else {
            z10 = this.f11739i.putIfAbsent(lowerCase, new j(string)) == null;
            if (z10) {
                Set set = this.f11736f;
                m.b[] bVarArr = (m.b[]) set.toArray(new m.b[set.size()]);
                p pVar = new p(this, string, "", null);
                for (m.b bVar : bVarArr) {
                    this.f11746p.submit(new b(bVar, pVar));
                }
            }
        }
        if (str5.length() <= 0 || (jVar = (j) this.f11739i.get(lowerCase)) == null || jVar.e(str5)) {
            return z10;
        }
        synchronized (jVar) {
            try {
                if (jVar.e(str5)) {
                    z11 = z10;
                } else {
                    jVar.b(str5);
                    Set set2 = this.f11736f;
                    m.b[] bVarArr2 = (m.b[]) set2.toArray(new m.b[set2.size()]);
                    p pVar2 = new p(this, "_" + str5 + "._sub." + string, "", null);
                    for (m.b bVar2 : bVarArr2) {
                        this.f11746p.submit(new c(bVar2, pVar2));
                    }
                }
            } finally {
            }
        }
        return z11;
    }

    public void f1(Mg.a aVar) {
        this.f11742l.B(aVar);
    }

    @Override // Lg.j
    public void g() {
        j.b.b().c(B0()).g();
    }

    public void g1(Lg.d dVar) {
        this.f11734d.remove(dVar);
    }

    @Override // Lg.i
    public boolean h(Mg.a aVar) {
        return this.f11742l.h(aVar);
    }

    public void i1(String str) {
        if (this.f11749s.containsKey(str.toLowerCase())) {
            j(str);
        }
    }

    public boolean isClosed() {
        return this.f11742l.v();
    }

    @Override // Lg.j
    public void j(String str) {
        j.b.b().c(B0()).j(str);
    }

    q j1(String str, String str2, String str3, boolean z10) {
        w0();
        String lowerCase = str.toLowerCase();
        e1(str);
        if (this.f11749s.putIfAbsent(lowerCase, new i(str)) == null) {
            t0(lowerCase, (Kg.e) this.f11749s.get(lowerCase), true);
        }
        q qVarI0 = I0(str, str2, str3, z10);
        p(qVarI0);
        return qVarI0;
    }

    public void k1(Lg.c cVar) {
        R0();
        try {
            if (this.f11748r == cVar) {
                this.f11748r = null;
            }
        } finally {
            S0();
        }
    }

    public boolean l1() {
        return this.f11742l.C();
    }

    @Override // Kg.a
    public void m0(Kg.d dVar) {
        if (X0() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        q qVar = (q) dVar;
        if (qVar.Q() != null) {
            if (qVar.Q() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (this.f11738h.get(qVar.m()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        qVar.j0(this);
        e1(qVar.U());
        qVar.f0();
        qVar.m0(this.f11742l.p());
        qVar.H(this.f11742l.l());
        qVar.I(this.f11742l.m());
        a1(qVar);
        while (this.f11738h.putIfAbsent(qVar.m(), qVar) != null) {
            a1(qVar);
        }
        C();
        f11730v.n("registerService() JmDNS registered service as {}", qVar);
    }

    public void m1(Lg.f fVar) throws IOException {
        InetAddress address;
        int port;
        if (fVar.n()) {
            return;
        }
        if (fVar.D() != null) {
            address = fVar.D().getAddress();
            port = fVar.D().getPort();
        } else {
            address = this.f11732b;
            port = javax.jmdns.impl.constants.a.f50178c;
        }
        byte[] bArrC = fVar.C();
        DatagramPacket datagramPacket = new DatagramPacket(bArrC, bArrC.length, address, port);
        if (f11730v.m()) {
            try {
                f11730v.g("send({}) JmDNS out:{}", G0(), new Lg.c(datagramPacket).E(true));
            } catch (IOException e10) {
                f11730v.o("{}.send({}) - JmDNS can not parse what it sends!!!", getClass().toString(), G0(), e10);
            }
        }
        MulticastSocket multicastSocket = this.f11733c;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // Kg.a
    public void n0(String str, Kg.e eVar) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f11735e.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                try {
                    list.remove(new m.a(eVar, false));
                    if (list.isEmpty()) {
                        this.f11735e.remove(lowerCase, list);
                    }
                } finally {
                }
            }
        }
    }

    public void n1(long j10) {
        this.f11745o = j10;
    }

    @Override // Kg.a
    public void o0(Kg.f fVar) {
        this.f11736f.remove(new m.b(fVar, false));
    }

    public void o1(int i10) {
        this.f11744n = i10;
    }

    @Override // Lg.j
    public void p(q qVar) {
        j.b.b().c(B0()).p(qVar);
    }

    @Override // Kg.a
    public void p0(Kg.d dVar) {
        q qVar = (q) this.f11738h.get(dVar.m());
        if (qVar == null) {
            f11730v.j("{} removing unregistered service info: {}", G0(), dVar.m());
            return;
        }
        qVar.M();
        v();
        qVar.n0(5000L);
        this.f11738h.remove(qVar.m(), qVar);
        f11730v.c("unregisterService() JmDNS {} unregistered service as {}", G0(), qVar);
    }

    void q0() throws IOException {
        f11730v.n("{}.recover() Cleanning up", G0());
        f11730v.t("RECOVERING");
        a();
        ArrayList arrayList = new ArrayList(K0().values());
        r1();
        y0();
        t1(5000L);
        S();
        x0();
        z0().clear();
        f11730v.n("{}.recover() All is clean", G0());
        if (!V0()) {
            f11730v.a("{}.recover() Could not recover we are Down!", G0());
            A0();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) ((Kg.d) it.next())).f0();
        }
        d1();
        try {
            b1(F0());
            p1(arrayList);
        } catch (Exception e10) {
            f11730v.j(".recover() Start services exception ", G0(), e10);
        }
        f11730v.a("{}.recover() We are back!", G0());
    }

    public void r1() {
        f11730v.l("unregisterAllServices()");
        for (Kg.d dVar : this.f11738h.values()) {
            if (dVar != null) {
                f11730v.n("Cancelling service info: {}", dVar);
                ((q) dVar).M();
            }
        }
        v();
        for (Map.Entry entry : this.f11738h.entrySet()) {
            Kg.d dVar2 = (Kg.d) entry.getValue();
            if (dVar2 != null) {
                String str = (String) entry.getKey();
                f11730v.n("Wait for service info cancel: {}", dVar2);
                ((q) dVar2).n0(5000L);
                this.f11738h.remove(str, dVar2);
            }
        }
    }

    @Override // Lg.j
    public void s() {
        j.b.b().c(B0()).s();
    }

    public void s0(Lg.d dVar, Lg.g gVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f11734d.add(dVar);
        if (gVar != null) {
            for (Lg.b bVar : z0().n(gVar.d().toLowerCase())) {
                if (gVar.B(bVar) && !bVar.k(jCurrentTimeMillis)) {
                    dVar.b(z0(), jCurrentTimeMillis, bVar);
                }
            }
        }
    }

    public void s1(long j10, Lg.h hVar, h hVar2) {
        ArrayList arrayList;
        List<m.a> listEmptyList;
        Kg.c cVarE = hVar.E(this);
        if (hVar2 == h.Remove && javax.jmdns.impl.constants.e.TYPE_SRV.equals(hVar.g())) {
            h1(cVarE);
        }
        synchronized (this.f11734d) {
            arrayList = new ArrayList(this.f11734d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Lg.d) it.next()).b(z0(), j10, hVar);
        }
        if (javax.jmdns.impl.constants.e.TYPE_PTR.equals(hVar.g()) || (javax.jmdns.impl.constants.e.TYPE_SRV.equals(hVar.g()) && h.Remove.equals(hVar2))) {
            if (cVarE.d() == null || !cVarE.d().D()) {
                q qVarI0 = I0(cVarE.h(), cVarE.getName(), "", false);
                if (qVarI0.D()) {
                    cVarE = new p(this, cVarE.h(), cVarE.getName(), qVarI0);
                }
            }
            List list = (List) this.f11735e.get(cVarE.h().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    listEmptyList = new ArrayList(list);
                }
            } else {
                listEmptyList = Collections.emptyList();
            }
            f11730v.v("{}.updating record for event: {} list {} operation: {}", G0(), cVarE, listEmptyList, hVar2);
            if (listEmptyList.isEmpty()) {
                return;
            }
            int i10 = g.f11768a[hVar2.ordinal()];
            if (i10 == 1) {
                for (m.a aVar : listEmptyList) {
                    if (aVar.b()) {
                        aVar.d(cVarE);
                    } else {
                        this.f11746p.submit(new d(aVar, cVarE));
                    }
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            for (m.a aVar2 : listEmptyList) {
                if (aVar2.b()) {
                    aVar2.e(cVarE);
                } else {
                    this.f11746p.submit(new e(aVar2, cVarE));
                }
            }
        }
    }

    public boolean t1(long j10) {
        return this.f11742l.E(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [Lg.l$j, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    public String toString() {
        StringBuilder sb2 = new StringBuilder(2048);
        sb2.append("\n");
        sb2.append("\t---- Local Host -----");
        sb2.append("\n\t");
        sb2.append(this.f11742l);
        sb2.append("\n\t---- Services -----");
        for (Map.Entry entry : this.f11738h.entrySet()) {
            sb2.append("\n\t\tService: ");
            sb2.append((String) entry.getKey());
            sb2.append(": ");
            sb2.append(entry.getValue());
        }
        sb2.append("\n");
        sb2.append("\t---- Types ----");
        for (Object obj : this.f11739i.values()) {
            sb2.append("\n\t\tType: ");
            sb2.append(obj.f());
            sb2.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sb2.append(obj);
        }
        sb2.append("\n");
        sb2.append(this.f11737g.toString());
        sb2.append("\n");
        sb2.append("\t---- Service Collectors ----");
        for (Map.Entry entry2 : this.f11749s.entrySet()) {
            sb2.append("\n\t\tService Collector: ");
            sb2.append((String) entry2.getKey());
            sb2.append(": ");
            sb2.append(entry2.getValue());
        }
        sb2.append("\n");
        sb2.append("\t---- Service Listeners ----");
        for (Map.Entry entry3 : this.f11735e.entrySet()) {
            sb2.append("\n\t\tService Listener: ");
            sb2.append((String) entry3.getKey());
            sb2.append(": ");
            sb2.append(entry3.getValue());
        }
        return sb2.toString();
    }

    public void u0(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        this.f11742l.b(aVar, gVar);
    }

    @Override // Lg.j
    public void v() {
        j.b.b().c(B0()).v();
    }

    public boolean v0() {
        return this.f11742l.c();
    }

    public void w0() {
        z0().r();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (Lg.b bVar : z0().h()) {
            try {
                Lg.h hVar = (Lg.h) bVar;
                if (hVar.k(jCurrentTimeMillis)) {
                    s1(jCurrentTimeMillis, hVar, h.Remove);
                    f11730v.d("Removing DNSEntry from cache: {}", bVar);
                    z0().s(hVar);
                } else if (hVar.N(jCurrentTimeMillis)) {
                    hVar.K();
                    String lowerCase = hVar.F().A().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        i1(lowerCase);
                    }
                }
            } catch (Exception e10) {
                f11730v.h("{}.Error while reaping records: {}", G0(), bVar, e10);
                f11730v.t(toString());
            }
        }
    }

    @Override // Lg.j
    public void y() {
        j.b.b().c(B0()).y();
    }

    public Lg.a z0() {
        return this.f11737g;
    }
}
