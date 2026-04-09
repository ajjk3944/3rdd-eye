package inet.ipaddr;

import inet.ipaddr.format.validate.s;
import inet.ipaddr.g;
import inet.ipaddr.o;

/* loaded from: classes4.dex */
public class n implements Zf.f, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final o f49774e = new o.a().v();

    /* renamed from: f, reason: collision with root package name */
    private static final n f49775f = new n("::ffff:0:0/96");

    /* renamed from: a, reason: collision with root package name */
    final o f49776a;

    /* renamed from: b, reason: collision with root package name */
    final String f49777b;

    /* renamed from: c, reason: collision with root package name */
    private AddressStringException f49778c;

    /* renamed from: d, reason: collision with root package name */
    private inet.ipaddr.format.validate.d f49779d;

    public n(String str) {
        this(str, f49774e);
    }

    private void a() throws AddressStringException {
        g.a aVarO0 = this.f49779d.o0();
        if (aVarO0 != null && aVarO0.isIPv6()) {
            throw new AddressStringException("ipaddress.error.address.is.ipv6");
        }
        AddressStringException addressStringException = this.f49778c;
        if (addressStringException != null) {
            throw addressStringException;
        }
    }

    private void c() throws AddressStringException {
        g.a aVarO0 = this.f49779d.o0();
        if (aVarO0 != null && aVarO0.isIPv4()) {
            throw new AddressStringException("ipaddress.error.address.is.ipv4");
        }
        AddressStringException addressStringException = this.f49778c;
        if (addressStringException != null) {
            throw addressStringException;
        }
    }

    private boolean n(g.a aVar) throws AddressStringException {
        if (this.f49779d.J0()) {
            return false;
        }
        if (aVar == null) {
            AddressStringException addressStringException = this.f49778c;
            if (addressStringException == null) {
                return true;
            }
            throw addressStringException;
        }
        if (aVar.isIPv4()) {
            a();
            return true;
        }
        if (!aVar.isIPv6()) {
            return true;
        }
        c();
        return true;
    }

    private static String r(inet.ipaddr.format.validate.d dVar) {
        if (dVar.U()) {
            return a.f49279e;
        }
        if (dVar.y0()) {
            return "";
        }
        if (dVar.i0()) {
            return i.v(dVar.g0().intValue());
        }
        if (dVar.S0()) {
            return dVar.M().a0();
        }
        return null;
    }

    private void t(g.a aVar) {
        if (n(aVar)) {
            return;
        }
        synchronized (this) {
            if (n(aVar)) {
                return;
            }
            try {
                this.f49779d = j().a(this);
            } catch (AddressStringException e10) {
                this.f49778c = e10;
                this.f49779d = inet.ipaddr.format.validate.d.f49368p0;
                throw e10;
            }
        }
    }

    public String a0() {
        if (l()) {
            try {
                return r(this.f49779d);
            } catch (IncompatibleAddressException unused) {
            }
        }
        return toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        if (this == nVar) {
            return 0;
        }
        boolean zL = l();
        boolean zL2 = nVar.l();
        if (zL || zL2) {
            try {
                return this.f49779d.D0(nVar.f49779d);
            } catch (IncompatibleAddressException unused) {
            }
        }
        return toString().compareTo(nVar.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        boolean zEquals = toString().equals(nVar.toString());
        if (zEquals && this.f49776a == nVar.f49776a) {
            return true;
        }
        if (!l()) {
            if (nVar.l()) {
                return false;
            }
            return zEquals;
        }
        if (!nVar.l()) {
            return false;
        }
        Boolean boolK0 = this.f49779d.k0(nVar.f49779d);
        if (boolK0 != null) {
            return boolK0.booleanValue();
        }
        try {
            return this.f49779d.W(nVar.f49779d);
        } catch (IncompatibleAddressException unused) {
            return zEquals;
        }
    }

    public g g() {
        if (this.f49779d.s0()) {
            return null;
        }
        try {
            return p();
        } catch (AddressStringException | IncompatibleAddressException unused) {
            return null;
        }
    }

    public o h() {
        return this.f49776a;
    }

    public int hashCode() {
        if (l()) {
            try {
                return this.f49779d.t0();
            } catch (IncompatibleAddressException unused) {
            }
        }
        return toString().hashCode();
    }

    protected inet.ipaddr.format.validate.b j() {
        return s.f49474j;
    }

    public boolean l() {
        if (!this.f49779d.J0()) {
            return !this.f49779d.s0();
        }
        try {
            s();
            return true;
        } catch (AddressStringException unused) {
            return false;
        }
    }

    public g p() {
        s();
        return this.f49779d.M();
    }

    public void s() {
        t(null);
    }

    public String toString() {
        return this.f49777b;
    }

    public n(String str, o oVar) {
        this.f49779d = inet.ipaddr.format.validate.d.f49369q0;
        if (str == null) {
            this.f49777b = "";
        } else {
            this.f49777b = str.trim();
        }
        this.f49776a = oVar;
    }

    n(String str, g gVar, o oVar) {
        this.f49779d = inet.ipaddr.format.validate.d.f49369q0;
        this.f49776a = oVar;
        this.f49777b = str;
        this.f49779d = gVar.a1();
    }
}
