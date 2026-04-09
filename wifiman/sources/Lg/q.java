package Lg;

import Kg.d;
import Lg.h;
import Lg.i;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.snmp4j.smi.GenericAddress;

/* loaded from: classes4.dex */
public class q extends Kg.d implements d, i {

    /* renamed from: r, reason: collision with root package name */
    private static Ej.b f11791r = Ej.c.i(q.class);

    /* renamed from: a, reason: collision with root package name */
    private String f11792a;

    /* renamed from: b, reason: collision with root package name */
    private String f11793b;

    /* renamed from: c, reason: collision with root package name */
    private String f11794c;

    /* renamed from: d, reason: collision with root package name */
    private String f11795d;

    /* renamed from: e, reason: collision with root package name */
    private String f11796e;

    /* renamed from: f, reason: collision with root package name */
    private String f11797f;

    /* renamed from: g, reason: collision with root package name */
    private int f11798g;

    /* renamed from: h, reason: collision with root package name */
    private int f11799h;

    /* renamed from: i, reason: collision with root package name */
    private int f11800i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f11801j;

    /* renamed from: k, reason: collision with root package name */
    private Map f11802k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f11803l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f11804m;

    /* renamed from: n, reason: collision with root package name */
    private transient String f11805n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11806o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11807p;

    /* renamed from: q, reason: collision with root package name */
    private final b f11808q;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11809a;

        static {
            int[] iArr = new int[javax.jmdns.impl.constants.e.values().length];
            f11809a = iArr;
            try {
                iArr[javax.jmdns.impl.constants.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11809a[javax.jmdns.impl.constants.e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11809a[javax.jmdns.impl.constants.e.TYPE_SRV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11809a[javax.jmdns.impl.constants.e.TYPE_TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11809a[javax.jmdns.impl.constants.e.TYPE_PTR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static final class b extends i.b {

        /* renamed from: g, reason: collision with root package name */
        private final q f11810g;

        public b(q qVar) {
            this.f11810g = qVar;
        }

        @Override // Lg.i.b
        protected void C(Mg.a aVar) {
            super.C(aVar);
            if (this.f11713b == null && this.f11810g.e0()) {
                lock();
                try {
                    if (this.f11713b == null && this.f11810g.e0()) {
                        if (this.f11714c.isAnnounced()) {
                            B(javax.jmdns.impl.constants.g.ANNOUNCING_1);
                            if (d() != null) {
                                d().J();
                            }
                        }
                        this.f11810g.l0(false);
                    }
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        @Override // Lg.i.b
        public void y(l lVar) {
            super.y(lVar);
        }
    }

    public q(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, Map map) {
        this(r.a(str, str2, str3), i10, i11, i12, z10, Pg.a.e(map));
    }

    protected static Map N(Map map) {
        EnumMap enumMap = new EnumMap(d.a.class);
        d.a aVar = d.a.Domain;
        String str = "local";
        String str2 = map.containsKey(aVar) ? (String) map.get(aVar) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        enumMap.put((EnumMap) aVar, (d.a) h0(str));
        d.a aVar2 = d.a.Protocol;
        boolean zContainsKey = map.containsKey(aVar2);
        String str3 = GenericAddress.TYPE_TCP;
        String str4 = zContainsKey ? (String) map.get(aVar2) : GenericAddress.TYPE_TCP;
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        enumMap.put((EnumMap) aVar2, (d.a) h0(str3));
        d.a aVar3 = d.a.Application;
        String str5 = "";
        String str6 = map.containsKey(aVar3) ? (String) map.get(aVar3) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        enumMap.put((EnumMap) aVar3, (d.a) h0(str6));
        d.a aVar4 = d.a.Instance;
        String str7 = map.containsKey(aVar4) ? (String) map.get(aVar4) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        enumMap.put((EnumMap) aVar4, (d.a) h0(str7));
        d.a aVar5 = d.a.Subtype;
        String str8 = map.containsKey(aVar5) ? (String) map.get(aVar5) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        enumMap.put((EnumMap) aVar5, (d.a) h0(str5));
        return enumMap;
    }

    static Map P(String str, String str2, String str3, String str4, String str5) {
        EnumMap enumMap = new EnumMap(d.a.class);
        enumMap.put((EnumMap) d.a.Instance, (d.a) str);
        enumMap.put((EnumMap) d.a.Application, (d.a) str2);
        enumMap.put((EnumMap) d.a.Protocol, (d.a) str3);
        enumMap.put((EnumMap) d.a.Domain, (d.a) str4);
        enumMap.put((EnumMap) d.a.Subtype, (d.a) str5);
        return enumMap;
    }

    private boolean V(h hVar) {
        int i10 = a.f11809a[hVar.g().ordinal()];
        if (i10 != 1 && i10 != 2) {
            f11791r.d("Unhandled expired record: {}", hVar);
            return false;
        }
        if (!hVar.d().equalsIgnoreCase(w())) {
            return false;
        }
        h.a aVar = (h.a) hVar;
        if (javax.jmdns.impl.constants.e.TYPE_A.equals(hVar.g())) {
            Inet4Address inet4Address = (Inet4Address) aVar.W();
            if (this.f11803l.remove(inet4Address)) {
                f11791r.n("Removed expired IPv4: {}", inet4Address);
                return true;
            }
            f11791r.n("Expired IPv4 not in this service: {}", inet4Address);
            return false;
        }
        Inet6Address inet6Address = (Inet6Address) aVar.W();
        if (this.f11804m.remove(inet6Address)) {
            f11791r.n("Removed expired IPv6: {}", inet6Address);
            return true;
        }
        f11791r.n("Expired IPv6 not in this service: {}", inet6Address);
        return false;
    }

    private boolean W(Lg.a aVar, long j10, h hVar) {
        int i10 = a.f11809a[hVar.g().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && x().length() == 0 && hVar.h().length() != 0) {
                            this.f11796e = hVar.h();
                            return true;
                        }
                    } else if (hVar.d().equalsIgnoreCase(u())) {
                        this.f11801j = ((h.g) hVar).W();
                        this.f11802k = null;
                        return true;
                    }
                } else if (hVar.d().equalsIgnoreCase(u())) {
                    h.f fVar = (h.f) hVar;
                    String str = this.f11797f;
                    boolean z10 = str == null || !str.equalsIgnoreCase(fVar.Y());
                    this.f11797f = fVar.Y();
                    this.f11798g = fVar.W();
                    this.f11799h = fVar.Z();
                    this.f11800i = fVar.X();
                    if (!z10) {
                        return true;
                    }
                    this.f11803l.clear();
                    this.f11804m.clear();
                    Iterator it = aVar.p(this.f11797f, javax.jmdns.impl.constants.e.TYPE_A, javax.jmdns.impl.constants.d.CLASS_IN).iterator();
                    while (it.hasNext()) {
                        b(aVar, j10, (Lg.b) it.next());
                    }
                    Iterator it2 = aVar.p(this.f11797f, javax.jmdns.impl.constants.e.TYPE_AAAA, javax.jmdns.impl.constants.d.CLASS_IN).iterator();
                    while (it2.hasNext()) {
                        b(aVar, j10, (Lg.b) it2.next());
                    }
                }
            } else if (hVar.d().equalsIgnoreCase(w())) {
                h.a aVar2 = (h.a) hVar;
                if (aVar2.W() instanceof Inet6Address) {
                    if (this.f11804m.add((Inet6Address) aVar2.W())) {
                        return true;
                    }
                }
            }
        } else if (hVar.d().equalsIgnoreCase(w())) {
            h.a aVar3 = (h.a) hVar;
            if (aVar3.W() instanceof Inet4Address) {
                if (this.f11803l.add((Inet4Address) aVar3.W())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean X() {
        return this.f11803l.size() > 0 || this.f11804m.size() > 0;
    }

    static String h0(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.startsWith("_")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(".") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    @Override // Kg.d
    public String A() {
        String str;
        String strF = f();
        String strT = t();
        String strE = e();
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (strE.length() > 0) {
            str = "_" + strE + ".";
        } else {
            str = "";
        }
        sb2.append(str);
        if (strT.length() > 0) {
            str2 = "_" + strT + ".";
        }
        sb2.append(str2);
        sb2.append(strF);
        sb2.append(".");
        return sb2.toString();
    }

    @Override // Kg.d
    public int B() {
        return this.f11799h;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // Kg.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean D() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.Y()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            boolean r0 = r1.X()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            byte[] r0 = r1.z()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            byte[] r0 = r1.z()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1c
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1c:
            r0 = move-exception
            goto L21
        L1e:
            r0 = 0
        L1f:
            monitor-exit(r1)
            return r0
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Lg.q.D():boolean");
    }

    @Override // Kg.d
    public boolean E(Kg.d dVar) {
        if (dVar == null) {
            return false;
        }
        if (dVar instanceof q) {
            q qVar = (q) dVar;
            return this.f11803l.size() == qVar.f11803l.size() && this.f11804m.size() == qVar.f11804m.size() && this.f11803l.equals(qVar.f11803l) && this.f11804m.equals(qVar.f11804m);
        }
        InetAddress[] inetAddressArrL = l();
        InetAddress[] inetAddressArrL2 = dVar.l();
        return inetAddressArrL.length == inetAddressArrL2.length && new HashSet(Arrays.asList(inetAddressArrL)).equals(new HashSet(Arrays.asList(inetAddressArrL2)));
    }

    @Override // Kg.d
    public boolean F() {
        return this.f11806o;
    }

    void G(byte[] bArr) {
        this.f11801j = bArr;
        this.f11802k = null;
    }

    void H(Inet4Address inet4Address) {
        this.f11803l.add(inet4Address);
    }

    void I(Inet6Address inet6Address) {
        this.f11804m.add(inet6Address);
    }

    public Collection K(javax.jmdns.impl.constants.d dVar, boolean z10, int i10, k kVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar == javax.jmdns.impl.constants.d.CLASS_ANY || dVar == javax.jmdns.impl.constants.d.CLASS_IN) {
            if (x().length() > 0) {
                arrayList.add(new h.e(U(), javax.jmdns.impl.constants.d.CLASS_IN, false, i10, u()));
            }
            String strA = A();
            javax.jmdns.impl.constants.d dVar2 = javax.jmdns.impl.constants.d.CLASS_IN;
            arrayList.add(new h.e(strA, dVar2, false, i10, u()));
            arrayList.add(new h.f(u(), dVar2, z10, i10, this.f11800i, this.f11799h, this.f11798g, kVar.p()));
            arrayList.add(new h.g(u(), dVar2, z10, i10, z()));
        }
        return arrayList;
    }

    public void L(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        this.f11808q.a(aVar, gVar);
    }

    public boolean M() {
        return this.f11808q.c();
    }

    @Override // Kg.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q clone() {
        q qVar = new q(S(), this.f11798g, this.f11799h, this.f11800i, this.f11806o, this.f11801j);
        qVar.m0(this.f11797f);
        for (Inet6Address inet6Address : k()) {
            qVar.f11804m.add(inet6Address);
        }
        for (Inet4Address inet4Address : i()) {
            qVar.f11803l.add(inet4Address);
        }
        return qVar;
    }

    public l Q() {
        return this.f11808q.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:8:0x0010, B:14:0x0022, B:13:0x001b, B:15:0x0024, B:18:0x0029), top: B:25:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized java.util.Map R() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.f11802k     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L24
            byte[] r0 = r4.z()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L24
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            byte[] r1 = r4.z()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            Pg.a.b(r0, r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            goto L22
        L18:
            r0 = move-exception
            goto L2f
        L1a:
            r1 = move-exception
            Ej.b r2 = Lg.q.f11791r     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "Malformed TXT Field "
            r2.r(r3, r1)     // Catch: java.lang.Throwable -> L18
        L22:
            r4.f11802k = r0     // Catch: java.lang.Throwable -> L18
        L24:
            java.util.Map r0 = r4.f11802k     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L29
            goto L2d
        L29:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L18
        L2d:
            monitor-exit(r4)
            return r0
        L2f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Lg.q.R():java.util.Map");
    }

    public Map S() {
        EnumMap enumMap = new EnumMap(d.a.class);
        enumMap.put((EnumMap) d.a.Domain, (d.a) f());
        enumMap.put((EnumMap) d.a.Protocol, (d.a) t());
        enumMap.put((EnumMap) d.a.Application, (d.a) e());
        enumMap.put((EnumMap) d.a.Instance, (d.a) n());
        enumMap.put((EnumMap) d.a.Subtype, (d.a) x());
        return enumMap;
    }

    public String U() {
        String str;
        String strX = x();
        StringBuilder sb2 = new StringBuilder();
        if (strX.length() > 0) {
            str = "_" + strX + "._sub.";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(A());
        return sb2.toString();
    }

    public boolean Y() {
        return this.f11797f != null;
    }

    public boolean Z() {
        return this.f11808q.g();
    }

    public boolean a0() {
        return this.f11808q.j();
    }

    @Override // Lg.d
    public void b(Lg.a aVar, long j10, Lg.b bVar) {
        if (!(bVar instanceof h)) {
            f11791r.d("DNSEntry is not of type 'DNSRecord' but of type {}", bVar == null ? "null" : bVar.getClass().getSimpleName());
            return;
        }
        h hVar = (h) bVar;
        if (hVar.k(j10) ? V(hVar) : W(aVar, j10, hVar)) {
            l lVarQ = Q();
            if (lVarQ == null) {
                f11791r.l("JmDNS not available.");
                return;
            }
            if (D()) {
                lVarQ.Q0(new p(lVarQ, A(), n(), c()));
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public boolean c0(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        return this.f11808q.l(aVar, gVar);
    }

    public boolean d0() {
        return this.f11808q.r();
    }

    @Override // Kg.d
    public String e() {
        String str = this.f11794c;
        return str != null ? str : "";
    }

    public boolean e0() {
        return this.f11807p;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && u().equals(((q) obj).u());
    }

    @Override // Kg.d
    public String f() {
        String str = this.f11792a;
        return str != null ? str : "local";
    }

    public boolean f0() {
        return this.f11808q.s();
    }

    public void g0(Mg.a aVar) {
        this.f11808q.t(aVar);
    }

    @Override // Lg.i
    public boolean h(Mg.a aVar) {
        return this.f11808q.h(aVar);
    }

    public int hashCode() {
        return u().hashCode();
    }

    @Override // Kg.d
    public Inet4Address[] i() {
        Set set = this.f11803l;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    public boolean i0() {
        return this.f11808q.v();
    }

    public void j0(l lVar) {
        this.f11808q.y(lVar);
    }

    @Override // Kg.d
    public Inet6Address[] k() {
        Set set = this.f11804m;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    void k0(String str) {
        this.f11795d = str;
        this.f11805n = null;
    }

    @Override // Kg.d
    public InetAddress[] l() {
        ArrayList arrayList = new ArrayList(this.f11803l.size() + this.f11804m.size());
        arrayList.addAll(this.f11803l);
        arrayList.addAll(this.f11804m);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    public void l0(boolean z10) {
        this.f11807p = z10;
        if (z10) {
            this.f11808q.C(null);
        }
    }

    @Override // Kg.d
    public String m() {
        if (this.f11805n == null) {
            this.f11805n = u().toLowerCase();
        }
        return this.f11805n;
    }

    void m0(String str) {
        this.f11797f = str;
    }

    @Override // Kg.d
    public String n() {
        String str = this.f11795d;
        return str != null ? str : "";
    }

    public boolean n0(long j10) {
        return this.f11808q.E(j10);
    }

    @Override // Kg.d
    public int o() {
        return this.f11798g;
    }

    @Override // Kg.d
    public int p() {
        return this.f11800i;
    }

    @Override // Kg.d
    public Enumeration q() {
        Map mapR = R();
        return new Vector(mapR != null ? mapR.keySet() : Collections.emptySet()).elements();
    }

    @Override // Kg.d
    public synchronized String r(String str) {
        byte[] bArr = (byte[]) R().get(str);
        if (bArr == null) {
            return null;
        }
        if (bArr == Pg.a.f18671b) {
            return "true";
        }
        return Pg.a.d(bArr, 0, bArr.length);
    }

    @Override // Kg.d
    public String t() {
        String str = this.f11793b;
        return str != null ? str : GenericAddress.TYPE_TCP;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(System.identityHashCode(this));
        sb2.append(" name: '");
        if (n().length() > 0) {
            sb2.append(n());
            sb2.append('.');
        }
        sb2.append(U());
        sb2.append("' address: '");
        InetAddress[] inetAddressArrL = l();
        if (inetAddressArrL.length > 0) {
            for (InetAddress inetAddress : inetAddressArrL) {
                sb2.append(inetAddress);
                sb2.append(':');
                sb2.append(o());
                sb2.append(' ');
            }
        } else {
            sb2.append("(null):");
            sb2.append(o());
        }
        sb2.append("' status: '");
        sb2.append(this.f11808q.toString());
        sb2.append(F() ? "' is persistent," : "',");
        if (D()) {
            sb2.append(" has data");
        } else {
            sb2.append(" has NO data");
        }
        if (z().length > 0) {
            Map mapR = R();
            if (mapR.isEmpty()) {
                sb2.append(", empty");
            } else {
                for (Map.Entry entry : mapR.entrySet()) {
                    String strC = Pg.a.c((byte[]) entry.getValue());
                    sb2.append("\n\t");
                    sb2.append((String) entry.getKey());
                    sb2.append(": ");
                    sb2.append(strC);
                }
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // Kg.d
    public String u() {
        String str;
        String str2;
        String strF = f();
        String strT = t();
        String strE = e();
        String strN = n();
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        if (strN.length() > 0) {
            str = strN + ".";
        } else {
            str = "";
        }
        sb2.append(str);
        if (strE.length() > 0) {
            str2 = "_" + strE + ".";
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (strT.length() > 0) {
            str3 = "_" + strT + ".";
        }
        sb2.append(str3);
        sb2.append(strF);
        sb2.append(".");
        return sb2.toString();
    }

    @Override // Kg.d
    public String w() {
        String str = this.f11797f;
        return str != null ? str : "";
    }

    @Override // Kg.d
    public String x() {
        String str = this.f11796e;
        return str != null ? str : "";
    }

    @Override // Kg.d
    public byte[] z() {
        byte[] bArr = this.f11801j;
        return (bArr == null || bArr.length <= 0) ? Pg.a.f18672c : bArr;
    }

    public q(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, byte[] bArr) {
        this(r.a(str, str2, str3), i10, i11, i12, z10, bArr);
    }

    public q(Map map, int i10, int i11, int i12, boolean z10, Map map2) {
        this(map, i10, i11, i12, z10, Pg.a.e(map2));
    }

    q(Map map, int i10, int i11, int i12, boolean z10, String str) {
        this(map, i10, i11, i12, z10, (byte[]) null);
        try {
            this.f11801j = Pg.a.a(str);
            this.f11797f = str;
        } catch (IOException e10) {
            throw new RuntimeException("Unexpected exception: " + e10);
        }
    }

    q(Map map, int i10, int i11, int i12, boolean z10, byte[] bArr) {
        Map mapN = N(map);
        this.f11792a = (String) mapN.get(d.a.Domain);
        this.f11793b = (String) mapN.get(d.a.Protocol);
        this.f11794c = (String) mapN.get(d.a.Application);
        this.f11795d = (String) mapN.get(d.a.Instance);
        this.f11796e = (String) mapN.get(d.a.Subtype);
        this.f11798g = i10;
        this.f11799h = i11;
        this.f11800i = i12;
        this.f11801j = bArr;
        l0(false);
        this.f11808q = new b(this);
        this.f11806o = z10;
        this.f11803l = Collections.synchronizedSet(new LinkedHashSet());
        this.f11804m = Collections.synchronizedSet(new LinkedHashSet());
    }

    q(Kg.d dVar) {
        this.f11803l = Collections.synchronizedSet(new LinkedHashSet());
        this.f11804m = Collections.synchronizedSet(new LinkedHashSet());
        if (dVar != null) {
            this.f11792a = dVar.f();
            this.f11793b = dVar.t();
            this.f11794c = dVar.e();
            this.f11795d = dVar.n();
            this.f11796e = dVar.x();
            this.f11798g = dVar.o();
            this.f11799h = dVar.B();
            this.f11800i = dVar.p();
            this.f11801j = dVar.z();
            this.f11806o = dVar.F();
            for (Inet6Address inet6Address : dVar.k()) {
                this.f11804m.add(inet6Address);
            }
            for (Inet4Address inet4Address : dVar.i()) {
                this.f11803l.add(inet4Address);
            }
        }
        this.f11808q = new b(this);
    }
}
