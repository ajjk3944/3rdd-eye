package inet.ipaddr;

import ag.InterfaceC3843a;
import inet.ipaddr.h;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Function;

/* loaded from: classes4.dex */
public abstract class g extends inet.ipaddr.a implements l, InterfaceC3843a {

    /* renamed from: o, reason: collision with root package name */
    public static final h f49482o = new h.a();

    /* renamed from: m, reason: collision with root package name */
    e f49483m;

    /* renamed from: n, reason: collision with root package name */
    private e f49484n;

    public enum a {
        IPV4,
        IPV6;

        public boolean isIPv4() {
            return this == IPV4;
        }

        public boolean isIPv6() {
            return this == IPV6;
        }

        @Override // java.lang.Enum
        public String toString() {
            return isIPv4() ? "IPv4" : "IPv6";
        }
    }

    protected g(j jVar) {
        super(jVar);
    }

    static int T(g gVar, g gVar2) {
        return inet.ipaddr.a.f49283i.f(gVar, gVar2);
    }

    public static int U0(a aVar) {
        return aVar.isIPv4() ? 32 : 128;
    }

    static int V0(a aVar) {
        return k.u2(aVar);
    }

    static int X0(a aVar) {
        return k.v2(aVar);
    }

    static int Z0(a aVar) {
        return k.x2(aVar);
    }

    public static int c1(a aVar) {
        return aVar.isIPv4() ? 4 : 8;
    }

    @Override // ag.k
    public Integer F0() {
        return v().F0();
    }

    public int I0() {
        return k.x2(n0());
    }

    void J(Zf.f fVar) {
        if (fVar instanceof e) {
            this.f49483m = (e) fVar;
            this.f49288b = new n(this.f49483m.toString(), this, this.f49483m.f49324f.f49334j);
        } else if (fVar instanceof n) {
            this.f49288b = (n) fVar;
        }
    }

    protected n K0() {
        return (n) this.f49288b;
    }

    @Override // inet.ipaddr.l
    public String V() {
        return v().V();
    }

    public Integer W0(boolean z10) {
        return v().Y1(z10);
    }

    public abstract g Y0();

    protected inet.ipaddr.format.validate.d a1() {
        return i() ? (e().d().prefixedSubnetsAreExplicit() || !x()) ? inet.ipaddr.format.validate.d.O0(this, t1()) : inet.ipaddr.format.validate.d.O0(this, s1(true).t1()) : inet.ipaddr.format.validate.d.O0(this, this);
    }

    public boolean b0(g gVar) {
        return super.g(gVar);
    }

    /* renamed from: b1 */
    public j v() {
        return (j) super.v();
    }

    public boolean d1() {
        return v().h2();
    }

    @Override // Zf.b, cg.d
    public abstract i e();

    @Override // Zf.e
    public int e0() {
        return k.v2(n0());
    }

    public boolean e1() {
        return false;
    }

    public boolean f1() {
        return false;
    }

    public abstract boolean g1();

    public boolean h1() {
        return v().m2();
    }

    public abstract g i1(g gVar);

    public abstract m j1(g gVar);

    public n k1() {
        if (this.f49288b == null) {
            this.f49288b = new n(Y(), this, q0());
        }
        return K0();
    }

    public e l1() {
        e eVar = this.f49484n;
        if (eVar != null) {
            return eVar;
        }
        if (A0()) {
            throw new IncompatibleAddressException(this, "ipaddress.error.unavailable.numeric");
        }
        InetAddress inetAddressP1 = p1();
        String canonicalHostName = inetAddressP1.getCanonicalHostName();
        if (!canonicalHostName.equals(inetAddressP1.getHostAddress())) {
            return new e(canonicalHostName);
        }
        e eVar2 = new e(canonicalHostName, new inet.ipaddr.format.validate.h(canonicalHostName, a1()));
        eVar2.f49323e = new g[]{this};
        return eVar2;
    }

    @Override // Zf.e
    public int m0() {
        return k.u2(n0());
    }

    public e m1() {
        e eVar = this.f49483m;
        if (eVar != null) {
            return eVar;
        }
        e eVarL1 = l1();
        this.f49483m = eVarL1;
        return eVarL1;
    }

    @Override // inet.ipaddr.l
    public a n0() {
        return v().n0();
    }

    public abstract C6180b n1();

    public abstract C6205b o1();

    public InetAddress p1() {
        return v().C2(this);
    }

    protected abstract o q0();

    protected InetAddress q1() {
        try {
            return InetAddress.getByAddress(v().q0());
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // inet.ipaddr.l
    public String r0() {
        return v().r0();
    }

    public abstract m r1();

    protected abstract g s1(boolean z10);

    public abstract g t1();

    @Override // inet.ipaddr.a
    protected boolean y(Zf.f fVar) {
        Zf.f fVar2 = this.f49288b;
        if (fVar2 == null || !(fVar instanceof n)) {
            return false;
        }
        n nVar = (n) fVar2;
        n nVar2 = (n) fVar;
        return nVar == nVar2 || (nVar.f49777b.equals(nVar2.f49777b) && nVar.f49776a == nVar2.f49776a);
    }

    protected g(Function function) {
        super(function);
    }
}
