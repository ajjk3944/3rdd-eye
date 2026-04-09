package Lg;

import Kg.d;
import Lg.f;
import Lg.n;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes4.dex */
public abstract class h extends Lg.b {

    /* renamed from: m, reason: collision with root package name */
    private static Ej.b f11692m = Ej.c.i(h.class);

    /* renamed from: h, reason: collision with root package name */
    private int f11693h;

    /* renamed from: i, reason: collision with root package name */
    private long f11694i;

    /* renamed from: j, reason: collision with root package name */
    private int f11695j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11696k;

    /* renamed from: l, reason: collision with root package name */
    private InetAddress f11697l;

    public static class b extends h {

        /* renamed from: n, reason: collision with root package name */
        String f11700n;

        /* renamed from: o, reason: collision with root package name */
        String f11701o;

        public b(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, String str2, String str3) {
            super(str, javax.jmdns.impl.constants.e.TYPE_HINFO, dVar, z10, i10);
            this.f11701o = str2;
            this.f11700n = str3;
        }

        @Override // Lg.h
        public Kg.c E(l lVar) {
            Kg.d dVarG = G(false);
            ((q) dVarG).j0(lVar);
            return new p(lVar, dVarG.A(), dVarG.n(), dVarG);
        }

        @Override // Lg.h
        public Kg.d G(boolean z10) {
            HashMap map = new HashMap(2);
            map.put("cpu", this.f11701o);
            map.put("os", this.f11700n);
            return new q(e(), 0, 0, 0, z10, map);
        }

        @Override // Lg.h
        boolean I(l lVar, long j10) {
            return false;
        }

        @Override // Lg.h
        boolean J(l lVar) {
            return false;
        }

        @Override // Lg.h
        public boolean L() {
            return true;
        }

        @Override // Lg.h
        boolean Q(h hVar) {
            if (!(hVar instanceof b)) {
                return false;
            }
            b bVar = (b) hVar;
            String str = this.f11701o;
            if (str != null || bVar.f11701o == null) {
                return (this.f11700n != null || bVar.f11700n == null) && str.equals(bVar.f11701o) && this.f11700n.equals(bVar.f11700n);
            }
            return false;
        }

        @Override // Lg.h
        void V(f.a aVar) {
            String str = this.f11701o + " " + this.f11700n;
            aVar.J(str, 0, str.length());
        }

        @Override // Lg.h, Lg.b
        protected void y(StringBuilder sb2) {
            super.y(sb2);
            sb2.append(" cpu: '");
            sb2.append(this.f11701o);
            sb2.append("' os: '");
            sb2.append(this.f11700n);
            sb2.append('\'');
        }
    }

    public static class c extends a {
        c(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, InetAddress inetAddress) {
            super(str, javax.jmdns.impl.constants.e.TYPE_A, dVar, z10, i10, inetAddress);
        }

        @Override // Lg.h.a, Lg.h
        public Kg.d G(boolean z10) {
            q qVar = (q) super.G(z10);
            qVar.H((Inet4Address) this.f11699n);
            return qVar;
        }

        @Override // Lg.h
        void V(f.a aVar) {
            InetAddress inetAddress = this.f11699n;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.f11699n instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.h(address, 0, address.length);
            }
        }

        c(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, byte[] bArr) {
            super(str, javax.jmdns.impl.constants.e.TYPE_A, dVar, z10, i10, bArr);
        }
    }

    public static class d extends a {
        d(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, InetAddress inetAddress) {
            super(str, javax.jmdns.impl.constants.e.TYPE_AAAA, dVar, z10, i10, inetAddress);
        }

        @Override // Lg.h.a, Lg.h
        public Kg.d G(boolean z10) {
            q qVar = (q) super.G(z10);
            qVar.I((Inet6Address) this.f11699n);
            return qVar;
        }

        @Override // Lg.h
        void V(f.a aVar) {
            InetAddress inetAddress = this.f11699n;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.f11699n instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i10 = 0; i10 < 16; i10++) {
                        if (i10 < 11) {
                            bArr[i10] = address[i10 - 12];
                        } else {
                            bArr[i10] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.h(address, 0, address.length);
            }
        }

        d(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, byte[] bArr) {
            super(str, javax.jmdns.impl.constants.e.TYPE_AAAA, dVar, z10, i10, bArr);
        }
    }

    public static class e extends h {

        /* renamed from: n, reason: collision with root package name */
        private final String f11702n;

        public e(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, String str2) {
            super(str, javax.jmdns.impl.constants.e.TYPE_PTR, dVar, z10, i10);
            this.f11702n = str2;
        }

        @Override // Lg.h
        public Kg.c E(l lVar) {
            Kg.d dVarG = G(false);
            ((q) dVarG).j0(lVar);
            String strA = dVarG.A();
            return new p(lVar, strA, l.q1(strA, W()), dVarG);
        }

        @Override // Lg.h
        public Kg.d G(boolean z10) {
            if (p()) {
                return new q(r.b(W()), 0, 0, 0, z10, (byte[]) null);
            }
            if (!l() && !j()) {
                Map mapB = r.b(W());
                d.a aVar = d.a.Subtype;
                mapB.put(aVar, (String) e().get(aVar));
                return new q(mapB, 0, 0, 0, z10, W());
            }
            return new q(e(), 0, 0, 0, z10, (byte[]) null);
        }

        @Override // Lg.h
        boolean I(l lVar, long j10) {
            return false;
        }

        @Override // Lg.h
        boolean J(l lVar) {
            return false;
        }

        @Override // Lg.h
        public boolean L() {
            return false;
        }

        @Override // Lg.h
        boolean Q(h hVar) {
            if (!(hVar instanceof e)) {
                return false;
            }
            e eVar = (e) hVar;
            String str = this.f11702n;
            if (str != null || eVar.f11702n == null) {
                return str.equals(eVar.f11702n);
            }
            return false;
        }

        @Override // Lg.h
        void V(f.a aVar) {
            aVar.p(this.f11702n);
        }

        String W() {
            return this.f11702n;
        }

        @Override // Lg.b
        public boolean m(Lg.b bVar) {
            return super.m(bVar) && (bVar instanceof e) && Q((e) bVar);
        }

        @Override // Lg.h, Lg.b
        protected void y(StringBuilder sb2) {
            super.y(sb2);
            sb2.append(" alias: '");
            String str = this.f11702n;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append('\'');
        }
    }

    public static class f extends h {

        /* renamed from: n, reason: collision with root package name */
        private final int f11703n;

        /* renamed from: o, reason: collision with root package name */
        private final int f11704o;

        /* renamed from: p, reason: collision with root package name */
        private final int f11705p;

        /* renamed from: q, reason: collision with root package name */
        private final String f11706q;

        public f(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, int i11, int i12, int i13, String str2) {
            super(str, javax.jmdns.impl.constants.e.TYPE_SRV, dVar, z10, i10);
            this.f11703n = i11;
            this.f11704o = i12;
            this.f11705p = i13;
            this.f11706q = str2;
        }

        @Override // Lg.h
        public Kg.c E(l lVar) {
            Kg.d dVarG = G(false);
            ((q) dVarG).j0(lVar);
            return new p(lVar, dVarG.A(), dVarG.n(), dVarG);
        }

        @Override // Lg.h
        public Kg.d G(boolean z10) {
            return new q(e(), this.f11705p, this.f11704o, this.f11703n, z10, this.f11706q);
        }

        @Override // Lg.h
        boolean I(l lVar, long j10) throws IOException {
            q qVar = (q) lVar.K0().get(c());
            if (qVar != null && ((qVar.a0() || qVar.Z()) && (this.f11705p != qVar.o() || !this.f11706q.equalsIgnoreCase(lVar.F0().p())))) {
                h.f11692m.n("handleQuery() Conflicting probe detected from: {}", C());
                f fVar = new f(qVar.u(), javax.jmdns.impl.constants.d.CLASS_IN, true, javax.jmdns.impl.constants.a.f50179d, qVar.p(), qVar.B(), qVar.o(), lVar.F0().p());
                try {
                    if (lVar.D0().equals(C())) {
                        h.f11692m.j("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), fVar.toString());
                    }
                } catch (IOException e10) {
                    h.f11692m.r("IOException", e10);
                }
                int iB = b(fVar);
                if (iB == 0) {
                    h.f11692m.l("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (qVar.d0() && iB > 0) {
                    String lowerCase = qVar.u().toLowerCase();
                    qVar.k0(n.c.a().a(lVar.F0().n(), qVar.n(), n.d.SERVICE));
                    lVar.K0().remove(lowerCase);
                    lVar.K0().put(qVar.u().toLowerCase(), qVar);
                    h.f11692m.n("handleQuery() Lost tie break: new unique name chosen:{}", qVar.n());
                    qVar.i0();
                    return true;
                }
            }
            return false;
        }

        @Override // Lg.h
        boolean J(l lVar) {
            q qVar = (q) lVar.K0().get(c());
            if (qVar == null) {
                return false;
            }
            if (this.f11705p == qVar.o() && this.f11706q.equalsIgnoreCase(lVar.F0().p())) {
                return false;
            }
            h.f11692m.l("handleResponse() Denial detected");
            if (qVar.d0()) {
                String lowerCase = qVar.u().toLowerCase();
                qVar.k0(n.c.a().a(lVar.F0().n(), qVar.n(), n.d.SERVICE));
                lVar.K0().remove(lowerCase);
                lVar.K0().put(qVar.u().toLowerCase(), qVar);
                h.f11692m.n("handleResponse() New unique name chose:{}", qVar.n());
            }
            qVar.i0();
            return true;
        }

        @Override // Lg.h
        public boolean L() {
            return true;
        }

        @Override // Lg.h
        boolean Q(h hVar) {
            if (!(hVar instanceof f)) {
                return false;
            }
            f fVar = (f) hVar;
            return this.f11703n == fVar.f11703n && this.f11704o == fVar.f11704o && this.f11705p == fVar.f11705p && this.f11706q.equals(fVar.f11706q);
        }

        @Override // Lg.h
        void V(f.a aVar) {
            aVar.C(this.f11703n);
            aVar.C(this.f11704o);
            aVar.C(this.f11705p);
            if (Lg.c.f11663m) {
                aVar.p(this.f11706q);
                return;
            }
            String str = this.f11706q;
            aVar.J(str, 0, str.length());
            aVar.g(0);
        }

        public int W() {
            return this.f11705p;
        }

        public int X() {
            return this.f11703n;
        }

        String Y() {
            return this.f11706q;
        }

        public int Z() {
            return this.f11704o;
        }

        @Override // Lg.b
        protected void w(DataOutputStream dataOutputStream) throws IOException {
            super.w(dataOutputStream);
            dataOutputStream.writeShort(this.f11703n);
            dataOutputStream.writeShort(this.f11704o);
            dataOutputStream.writeShort(this.f11705p);
            try {
                dataOutputStream.write(this.f11706q.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        @Override // Lg.h, Lg.b
        protected void y(StringBuilder sb2) {
            super.y(sb2);
            sb2.append(" server: '");
            sb2.append(this.f11706q);
            sb2.append(':');
            sb2.append(this.f11705p);
            sb2.append('\'');
        }
    }

    public static class g extends h {

        /* renamed from: n, reason: collision with root package name */
        private final byte[] f11707n;

        public g(String str, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, byte[] bArr) {
            super(str, javax.jmdns.impl.constants.e.TYPE_TXT, dVar, z10, i10);
            this.f11707n = (bArr == null || bArr.length <= 0) ? Pg.a.f18672c : bArr;
        }

        @Override // Lg.h
        public Kg.c E(l lVar) {
            Kg.d dVarG = G(false);
            ((q) dVarG).j0(lVar);
            return new p(lVar, dVarG.A(), dVarG.n(), dVarG);
        }

        @Override // Lg.h
        public Kg.d G(boolean z10) {
            return new q(e(), 0, 0, 0, z10, this.f11707n);
        }

        @Override // Lg.h
        boolean I(l lVar, long j10) {
            return false;
        }

        @Override // Lg.h
        boolean J(l lVar) {
            return false;
        }

        @Override // Lg.h
        public boolean L() {
            return true;
        }

        @Override // Lg.h
        boolean Q(h hVar) {
            if (!(hVar instanceof g)) {
                return false;
            }
            g gVar = (g) hVar;
            byte[] bArr = this.f11707n;
            if ((bArr == null && gVar.f11707n != null) || gVar.f11707n.length != bArr.length) {
                return false;
            }
            int length = bArr.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    return true;
                }
                if (gVar.f11707n[i10] != this.f11707n[i10]) {
                    return false;
                }
                length = i10;
            }
        }

        @Override // Lg.h
        void V(f.a aVar) {
            byte[] bArr = this.f11707n;
            aVar.h(bArr, 0, bArr.length);
        }

        byte[] W() {
            return this.f11707n;
        }

        @Override // Lg.h, Lg.b
        protected void y(StringBuilder sb2) {
            super.y(sb2);
            sb2.append(" text: '");
            String strC = Pg.a.c(this.f11707n);
            if (strC != null) {
                if (20 < strC.length()) {
                    sb2.append((CharSequence) strC, 0, 17);
                    sb2.append("...");
                } else {
                    sb2.append(strC);
                }
            }
            sb2.append('\'');
        }
    }

    h(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10, int i10) {
        super(str, eVar, dVar, z10);
        this.f11693h = i10;
        this.f11694i = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this.f11696k = iNextInt;
        this.f11695j = iNextInt + 80;
    }

    public long A() {
        return this.f11694i;
    }

    long B(int i10) {
        return this.f11694i + (i10 * this.f11693h * 10);
    }

    public InetAddress C() {
        return this.f11697l;
    }

    int D(long j10) {
        return (int) Math.max(0L, (B(100) - j10) / 1000);
    }

    public abstract Kg.c E(l lVar);

    public Kg.d F() {
        return G(false);
    }

    public abstract Kg.d G(boolean z10);

    public int H() {
        return this.f11693h;
    }

    abstract boolean I(l lVar, long j10);

    abstract boolean J(l lVar);

    public void K() {
        int i10 = this.f11695j + 5;
        this.f11695j = i10;
        if (i10 > 100) {
            this.f11695j = 100;
        }
    }

    public abstract boolean L();

    public boolean M(long j10) {
        return B(50) <= j10;
    }

    public boolean N(long j10) {
        return B(this.f11695j) <= j10;
    }

    void O(h hVar) {
        this.f11694i = hVar.f11694i;
        this.f11693h = hVar.f11693h;
        this.f11695j = this.f11696k + 80;
    }

    boolean P(h hVar) {
        return g() == hVar.g();
    }

    abstract boolean Q(h hVar);

    public void R(InetAddress inetAddress) {
        this.f11697l = inetAddress;
    }

    void S(long j10) {
        this.f11694i = j10;
        this.f11693h = 1;
    }

    boolean T(Lg.c cVar) {
        try {
            Iterator it = cVar.b().iterator();
            while (it.hasNext()) {
                if (U((h) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e10) {
            f11692m.r("suppressedBy() message " + cVar + " exception ", e10);
            return false;
        }
    }

    boolean U(h hVar) {
        return equals(hVar) && hVar.f11693h > this.f11693h / 2;
    }

    abstract void V(f.a aVar);

    @Override // Lg.b
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj) && Q((h) obj);
    }

    @Override // Lg.b
    public boolean k(long j10) {
        return B(100) <= j10;
    }

    @Override // Lg.b
    protected void y(StringBuilder sb2) {
        super.y(sb2);
        int iD = D(System.currentTimeMillis());
        sb2.append(" ttl: '");
        sb2.append(iD);
        sb2.append('/');
        sb2.append(this.f11693h);
        sb2.append('\'');
    }

    public static abstract class a extends h {

        /* renamed from: o, reason: collision with root package name */
        private static Ej.b f11698o = Ej.c.i(a.class);

        /* renamed from: n, reason: collision with root package name */
        InetAddress f11699n;

        protected a(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, InetAddress inetAddress) {
            super(str, eVar, dVar, z10, i10);
            this.f11699n = inetAddress;
        }

        @Override // Lg.h
        public Kg.c E(l lVar) {
            Kg.d dVarG = G(false);
            ((q) dVarG).j0(lVar);
            return new p(lVar, dVarG.A(), dVarG.n(), dVarG);
        }

        @Override // Lg.h
        public Kg.d G(boolean z10) {
            return new q(e(), 0, 0, 0, z10, (byte[]) null);
        }

        @Override // Lg.h
        boolean I(l lVar, long j10) throws IOException {
            a aVarJ;
            if (!lVar.F0().d(this) || (aVarJ = lVar.F0().j(g(), q(), javax.jmdns.impl.constants.a.f50179d)) == null) {
                return false;
            }
            int iB = b(aVarJ);
            if (iB == 0) {
                f11698o.l("handleQuery() Ignoring an identical address query");
                return false;
            }
            f11698o.l("handleQuery() Conflicting query detected.");
            if (lVar.Z0() && iB > 0) {
                lVar.F0().q();
                lVar.z0().clear();
                Iterator it = lVar.K0().values().iterator();
                while (it.hasNext()) {
                    ((q) ((Kg.d) it.next())).i0();
                }
            }
            lVar.l1();
            return true;
        }

        @Override // Lg.h
        boolean J(l lVar) {
            if (!lVar.F0().d(this)) {
                return false;
            }
            f11698o.l("handleResponse() Denial detected");
            if (lVar.Z0()) {
                lVar.F0().q();
                lVar.z0().clear();
                Iterator it = lVar.K0().values().iterator();
                while (it.hasNext()) {
                    ((q) ((Kg.d) it.next())).i0();
                }
            }
            lVar.l1();
            return true;
        }

        @Override // Lg.h
        public boolean L() {
            return false;
        }

        @Override // Lg.h
        boolean Q(h hVar) {
            try {
                if (!(hVar instanceof a)) {
                    return false;
                }
                a aVar = (a) hVar;
                if (W() != null || aVar.W() == null) {
                    return W().equals(aVar.W());
                }
                return false;
            } catch (Exception e10) {
                f11698o.p("Failed to compare addresses of DNSRecords", e10);
                return false;
            }
        }

        InetAddress W() {
            return this.f11699n;
        }

        boolean X(h hVar) {
            return d().equalsIgnoreCase(hVar.d());
        }

        @Override // Lg.b
        protected void w(DataOutputStream dataOutputStream) throws IOException {
            super.w(dataOutputStream);
            for (byte b10 : W().getAddress()) {
                dataOutputStream.writeByte(b10);
            }
        }

        @Override // Lg.h, Lg.b
        protected void y(StringBuilder sb2) {
            super.y(sb2);
            sb2.append(" address: '");
            sb2.append(W() != null ? W().getHostAddress() : "null");
            sb2.append('\'');
        }

        protected a(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10, int i10, byte[] bArr) {
            super(str, eVar, dVar, z10, i10);
            try {
                this.f11699n = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e10) {
                f11698o.r("Address() exception ", e10);
            }
        }
    }
}
