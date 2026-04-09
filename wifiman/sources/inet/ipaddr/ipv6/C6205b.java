package inet.ipaddr.ipv6;

import dg.InterfaceC5372b;
import inet.ipaddr.AddressConversionException;
import inet.ipaddr.AddressPositionException;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.c;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv6.C6208e;
import inet.ipaddr.ipv6.Q;
import inet.ipaddr.o;
import java.io.Serializable;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;

/* renamed from: inet.ipaddr.ipv6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6205b extends inet.ipaddr.g implements Iterable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f49667s = String.valueOf((char) 187);

    /* renamed from: p, reason: collision with root package name */
    private final c f49668p;

    /* renamed from: q, reason: collision with root package name */
    private transient Q.f f49669q;

    /* renamed from: r, reason: collision with root package name */
    transient Q.e f49670r;

    /* renamed from: inet.ipaddr.ipv6.b$a */
    class a extends C6208e.a {
        a(C6208e c6208e, C6208e.a.C1862a c1862a) {
            super(c6208e, c1862a);
        }

        @Override // inet.ipaddr.ipv6.C6208e.a, inet.ipaddr.i.a
        /* renamed from: N0 */
        public C6205b E(Q q10) {
            return C6205b.this.B1().P0(q10, C6205b.this.f49668p);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.ipv6.C6208e.a, inet.ipaddr.i.a
        /* renamed from: W0 */
        public C6205b S(V[] vArr) {
            return C6205b.this.B1().T0(vArr, C6205b.this.f49668p);
        }
    }

    /* renamed from: inet.ipaddr.ipv6.b$b, reason: collision with other inner class name */
    public interface InterfaceC1861b {
        C6205b b(inet.ipaddr.g gVar);
    }

    C6205b(Q q10, CharSequence charSequence, boolean z10) {
        this(q10, z10 ? y1(charSequence) : (charSequence == null || charSequence.length() <= 0) ? null : new c(charSequence.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[PHI: r0
  0x0024: PHI (r0v2 inet.ipaddr.ipv6.b) = (r0v1 inet.ipaddr.ipv6.b), (r0v18 inet.ipaddr.ipv6.b) binds: [B:9:0x0011, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private inet.ipaddr.ipv6.C6205b G1(boolean r7, boolean r8) {
        /*
            r6 = this;
            inet.ipaddr.ipv6.Q r0 = r6.v()
            inet.ipaddr.ipv6.Q r1 = r0.z3(r7, r8)
            if (r1 != r0) goto Lb
            return r6
        Lb:
            r0 = 0
            if (r1 != 0) goto Lf
            return r0
        Lf:
            inet.ipaddr.ipv6.Q$e r2 = r6.f49670r
            if (r2 == 0) goto L24
            if (r7 == 0) goto L1f
            if (r8 == 0) goto L1c
            Zf.e r0 = r2.f33305b
        L19:
            inet.ipaddr.ipv6.b r0 = (inet.ipaddr.ipv6.C6205b) r0
            goto L22
        L1c:
            Zf.e r0 = r2.f33304a
            goto L19
        L1f:
            Zf.e r0 = r2.f33306c
            goto L19
        L22:
            if (r0 != 0) goto L6c
        L24:
            monitor-enter(r6)
            inet.ipaddr.ipv6.Q$e r2 = r6.f49670r     // Catch: java.lang.Throwable -> L38
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2d
            r5 = r4
            goto L2e
        L2d:
            r5 = r3
        L2e:
            if (r5 == 0) goto L3a
            inet.ipaddr.ipv6.Q$e r2 = new inet.ipaddr.ipv6.Q$e     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            r6.f49670r = r2     // Catch: java.lang.Throwable -> L38
            goto L55
        L38:
            r7 = move-exception
            goto L6d
        L3a:
            if (r7 == 0) goto L4e
            if (r8 == 0) goto L47
            Zf.e r0 = r2.f33305b     // Catch: java.lang.Throwable -> L38
            inet.ipaddr.ipv6.b r0 = (inet.ipaddr.ipv6.C6205b) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L45
        L44:
            r3 = r4
        L45:
            r5 = r3
            goto L55
        L47:
            Zf.e r0 = r2.f33304a     // Catch: java.lang.Throwable -> L38
            inet.ipaddr.ipv6.b r0 = (inet.ipaddr.ipv6.C6205b) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L45
            goto L44
        L4e:
            Zf.e r0 = r2.f33306c     // Catch: java.lang.Throwable -> L38
            inet.ipaddr.ipv6.b r0 = (inet.ipaddr.ipv6.C6205b) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L45
            goto L44
        L55:
            if (r5 == 0) goto L6b
            inet.ipaddr.ipv6.e$a r0 = r6.A1()     // Catch: java.lang.Throwable -> L38
            inet.ipaddr.ipv6.b r0 = r0.E(r1)     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L69
            if (r8 == 0) goto L66
            r2.f33305b = r0     // Catch: java.lang.Throwable -> L38
            goto L6b
        L66:
            r2.f33304a = r0     // Catch: java.lang.Throwable -> L38
            goto L6b
        L69:
            r2.f33306c = r0     // Catch: java.lang.Throwable -> L38
        L6b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L38
        L6c:
            return r0
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L38
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.ipv6.C6205b.G1(boolean, boolean):inet.ipaddr.ipv6.b");
    }

    private static c L1(Inet6Address inet6Address) {
        NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface != null) {
            return new c(scopedInterface);
        }
        int scopeId = inet6Address.getScopeId();
        if (scopeId != 0) {
            return new c(scopeId);
        }
        return null;
    }

    private String N1() {
        if (Q1()) {
            return this.f49668p.getName();
        }
        return null;
    }

    private boolean O1() {
        if (this.f49669q != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49669q != null) {
                    return false;
                }
                if (Q1()) {
                    this.f49669q = new Q.f();
                    return true;
                }
                Q qV = v();
                boolean zK3 = qV.K3();
                this.f49669q = qV.H3();
                return zK3;
            } finally {
            }
        }
    }

    private boolean T1(C6205b c6205b) {
        return Objects.equals(this.f49668p, c6205b.f49668p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Zf.c U1(byte[] bArr, Integer num, inet.ipaddr.a aVar) {
        return ((C6205b) aVar).B1().a1(bArr, 0, bArr.length, 8, num);
    }

    private C6205b x1(Q q10) {
        return q10 == v() ? this : A1().E(q10);
    }

    static c y1(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String strTrim = charSequence.toString().trim();
        if (charSequence.length() == 0) {
            return null;
        }
        int iA0 = inet.ipaddr.format.validate.s.a0(strTrim);
        if (iA0 < 0) {
            return new c(strTrim);
        }
        throw new AddressValueException("ipaddress.error.invalid.zone", iA0);
    }

    C6208e.a A1() {
        C6208e.a aVarB1 = B1();
        if (!Q1()) {
            return aVarB1;
        }
        a aVar = new a(e(), aVarB1.f49681b);
        aVar.f49682c = aVarB1.f49682c;
        return aVar;
    }

    C6208e.a B1() {
        return e().m();
    }

    @Override // inet.ipaddr.a
    public boolean C(inet.ipaddr.a aVar) {
        return (aVar instanceof C6205b) && super.C(aVar) && T1((C6205b) aVar);
    }

    @Override // cg.d
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public V m1(int i10) {
        return q(i10);
    }

    public C6180b D1() {
        return E1().a().E(v().w3());
    }

    public C6183e E1() {
        return inet.ipaddr.a.j();
    }

    @Override // inet.ipaddr.g
    /* renamed from: F1, reason: merged with bridge method [inline-methods] */
    public C6205b Y0() {
        return G1(true, false);
    }

    @Override // inet.ipaddr.g, Zf.b, cg.d
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public C6208e e() {
        return inet.ipaddr.a.s();
    }

    @Override // inet.ipaddr.a
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public Q v() {
        return (Q) super.v();
    }

    @Override // Zf.e
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public V q(int i10) {
        return v().q(i10);
    }

    public C6205b K1() {
        return G1(false, false);
    }

    public String M1() {
        return N1();
    }

    protected boolean P1() {
        if (this.f49670r != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49670r != null) {
                    return false;
                }
                this.f49670r = new Q.e();
                return true;
            } finally {
            }
        }
    }

    public boolean Q1() {
        return this.f49668p != null;
    }

    public boolean R1() {
        if (!q(5).N2(65535)) {
            return false;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            if (!q(i10).c0()) {
                return false;
            }
        }
        return true;
    }

    public boolean S1() {
        return q(0).P2(65280, 8);
    }

    @Override // inet.ipaddr.g, inet.ipaddr.l
    public String V() {
        String str;
        if (!O1() && (str = this.f49669q.f49746b) != null) {
            return str;
        }
        if (!Q1()) {
            return v().V();
        }
        Q.f fVar = this.f49669q;
        String strD2 = d2(Q.f.f49632r);
        fVar.f49746b = strD2;
        return strD2;
    }

    @Override // inet.ipaddr.g
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public C6205b i1(inet.ipaddr.g gVar) {
        return W1(gVar, false);
    }

    public C6205b W1(inet.ipaddr.g gVar, boolean z10) {
        return x1(v().r4(z1(gVar).v(), z10));
    }

    public C6205b X1(boolean z10) {
        return x1(v().s4(z10));
    }

    @Override // inet.ipaddr.a, Zf.e
    public String Y() {
        String str;
        if (!O1() && (str = this.f49669q.f33308a) != null) {
            return str;
        }
        if (!Q1()) {
            return v().Y();
        }
        Q.f fVar = this.f49669q;
        String strD2 = d2(Q.f.f49629o);
        fVar.f33308a = strD2;
        return strD2;
    }

    public C6205b Y1() {
        return Q1() ? B1().E(v()) : this;
    }

    @Override // inet.ipaddr.a, Zf.e
    public int Z() {
        return 8;
    }

    @Override // inet.ipaddr.g
    /* renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public i0 j1(inet.ipaddr.g gVar) {
        return f2(gVar);
    }

    @Override // inet.ipaddr.a, Zf.b
    public String a0() {
        String str;
        if (!O1() && (str = this.f49669q.f49640j) != null) {
            return str;
        }
        if (!Q1()) {
            return v().a0();
        }
        Q.f fVar = this.f49669q;
        String strD2 = d2(Q.f.f49628n);
        fVar.f49640j = strD2;
        return strD2;
    }

    @Override // java.lang.Iterable
    /* renamed from: a2, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        return v().w4(this, A1(), false);
    }

    @Override // inet.ipaddr.g
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public Inet6Address p1() throws UnknownHostException {
        Inet6Address inet6Address;
        if (!Q1()) {
            return (Inet6Address) super.p1();
        }
        if (!P1() && (inet6Address = this.f49670r.f49625e) != null) {
            return inet6Address;
        }
        Q.e eVar = this.f49670r;
        Inet6Address inet6AddressQ1 = q1();
        eVar.f49625e = inet6AddressQ1;
        return inet6AddressQ1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.g
    /* renamed from: c2, reason: merged with bridge method [inline-methods] */
    public Inet6Address q1() throws UnknownHostException {
        Inet6Address byAddress;
        byte[] bArrQ0 = v().q0();
        try {
            if (!Q1()) {
                byAddress = Inet6Address.getByAddress((String) null, bArrQ0, (NetworkInterface) null);
            } else if (this.f49668p.h()) {
                byAddress = Inet6Address.getByAddress((String) null, bArrQ0, this.f49668p.d());
            } else {
                if (!this.f49668p.g() || this.f49668p.c() == null) {
                    InetAddress byName = InetAddress.getByName(Y0().t1().a0());
                    return byName instanceof Inet6Address ? (Inet6Address) byName : Inet6Address.getByAddress((String) null, bArrQ0, (NetworkInterface) null);
                }
                byAddress = Inet6Address.getByAddress((String) null, bArrQ0, this.f49668p.c());
            }
            return byAddress;
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public String d2(Q.g gVar) {
        return v().A4(gVar, N1());
    }

    @Override // inet.ipaddr.g
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public i0 r1() {
        C6205b c6205bT1 = Y1().t1();
        return new i0(c6205bT1.Y0(), c6205bT1.K1(), true);
    }

    @Override // inet.ipaddr.a, ag.InterfaceC3847e, ag.InterfaceC3849g
    public int f() {
        return 128;
    }

    @Override // inet.ipaddr.g
    public boolean f1() {
        return true;
    }

    public i0 f2(inet.ipaddr.g gVar) {
        return new i0(this, z1(gVar));
    }

    @Override // inet.ipaddr.g
    public boolean g1() {
        V vQ = q(0);
        return (S1() && vQ.O2(2, 15)) || vQ.P2(65152, 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.g
    /* renamed from: g2, reason: merged with bridge method [inline-methods] */
    public C6205b s1(boolean z10) {
        if (i()) {
            return (d1() && h1()) ? Y0() : x1(v().p3(z10));
        }
        C6208e c6208eE = e();
        c.b bVarD = c6208eE.d();
        C6205b c6205b = (C6205b) c6208eE.s(0, !bVarD.allPrefixedAddressesAreSubnets());
        return bVarD.zeroHostsAreSubnets() ? c6205b.Y0() : c6205b;
    }

    @Override // inet.ipaddr.g
    /* renamed from: h2, reason: merged with bridge method [inline-methods] */
    public C6205b t1() {
        return X1(false);
    }

    @Override // inet.ipaddr.a
    public int hashCode() {
        int iHashCode = super.hashCode();
        return Q1() ? iHashCode * this.f49668p.getName().hashCode() : iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return v().M3(this, A1(), null);
    }

    @Override // inet.ipaddr.g
    public C6180b n1() {
        return inet.ipaddr.g.f49482o.a(this);
    }

    @Override // inet.ipaddr.g
    public C6205b o1() {
        return this;
    }

    @Override // inet.ipaddr.g
    protected inet.ipaddr.o q0() {
        return new o.a().t().q(E1()).f().u().v(e()).f().v();
    }

    @Override // inet.ipaddr.g, inet.ipaddr.l
    public String r0() {
        String str;
        if (!O1() && (str = this.f49669q.f49747c) != null) {
            return str;
        }
        if (!Q1()) {
            return v().r0();
        }
        Q.f fVar = this.f49669q;
        String strD2 = d2(Q.f.f49627m);
        fVar.f49747c = strD2;
        return strD2;
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return 16;
    }

    void w1(C6205b c6205b, C6205b c6205b2) {
        if (!(c6205b == null && c6205b2 == null) && v().G3() == null) {
            v().m3(c6205b != null ? c6205b.v() : null, c6205b2 != null ? c6205b2.v() : null);
            Q.e eVar = this.f49670r;
            if (eVar == null || ((c6205b != null && eVar.f33304a == null) || (c6205b2 != null && eVar.f33306c == null))) {
                synchronized (this) {
                    try {
                        Q.e eVar2 = this.f49670r;
                        if (eVar2 == null) {
                            Q.e eVar3 = new Q.e();
                            this.f49670r = eVar3;
                            eVar3.f33304a = c6205b;
                            eVar3.f33306c = c6205b2;
                        } else {
                            if (eVar2.f33304a == null) {
                                eVar2.f33304a = c6205b;
                            }
                            if (eVar2.f33306c == null) {
                                eVar2.f33306c = c6205b2;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    protected C6205b z1(inet.ipaddr.g gVar) {
        C6205b c6205bO1 = gVar.o1();
        if (c6205bO1 != null) {
            return c6205bO1;
        }
        throw new AddressConversionException(this, gVar);
    }

    /* renamed from: inet.ipaddr.ipv6.b$c */
    public static class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        String f49672a;

        /* renamed from: b, reason: collision with root package name */
        private int f49673b;

        /* renamed from: c, reason: collision with root package name */
        private transient NetworkInterface f49674c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f49675d;

        public c(String str) {
            str.getClass();
            this.f49672a = str.trim();
            this.f49673b = -1;
        }

        static int a(String str) {
            int length = str.length();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                int iDigit = Character.digit(str.charAt(i10), 10);
                if (iDigit < 0) {
                    return -1;
                }
                j10 = (j10 * 10) + iDigit;
                if (j10 > 2147483647L) {
                    return -1;
                }
            }
            return (int) j10;
        }

        public NetworkInterface c() throws SocketException {
            try {
                if (g()) {
                    if (this.f49674c == null) {
                        this.f49674c = NetworkInterface.getByName(this.f49672a);
                    }
                } else if (this.f49674c == null) {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    loop0: while (true) {
                        if (networkInterfaces.hasMoreElements()) {
                            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                            Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if ((inetAddressNextElement instanceof Inet6Address) && ((Inet6Address) inetAddressNextElement).getScopeId() == this.f49673b) {
                                    this.f49674c = networkInterfaceNextElement;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                break;
            } catch (SocketException unused) {
            }
            return this.f49674c;
        }

        public int d() {
            NetworkInterface networkInterfaceC;
            int scopeId;
            if (g() && this.f49673b == -1 && (networkInterfaceC = c()) != null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaceC.getInetAddresses();
                int i10 = -1;
                while (true) {
                    if (!inetAddresses.hasMoreElements()) {
                        break;
                    }
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if ((inetAddressNextElement instanceof Inet6Address) && (scopeId = ((Inet6Address) inetAddressNextElement).getScopeId()) != 0) {
                        if (i10 != -1 && scopeId != i10) {
                            i10 = -1;
                            break;
                        }
                        i10 = scopeId;
                    }
                }
                if (i10 != -1) {
                    this.f49673b = i10;
                }
            }
            return this.f49673b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && toString().equals(obj.toString());
        }

        public boolean g() {
            if (this.f49675d == null) {
                int iA = a(this.f49672a);
                this.f49673b = iA;
                this.f49675d = Boolean.valueOf(iA < 0);
            }
            return this.f49675d.booleanValue();
        }

        public String getName() {
            if (this.f49672a == null) {
                if (g()) {
                    this.f49672a = this.f49674c.getName();
                } else {
                    int i10 = this.f49673b;
                    this.f49672a = V.X2(i10, 10, new StringBuilder(V.Y2(i10, 10))).toString();
                }
            }
            return this.f49672a;
        }

        public boolean h() {
            return !g();
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            return getName();
        }

        public c(int i10) {
            if (i10 >= 0) {
                this.f49673b = i10;
                this.f49675d = Boolean.FALSE;
                return;
            }
            throw new IllegalArgumentException();
        }

        public c(NetworkInterface networkInterface) {
            networkInterface.getClass();
            this.f49674c = networkInterface;
            this.f49675d = Boolean.TRUE;
            this.f49673b = -1;
            this.f49672a = networkInterface.getName();
        }
    }

    public C6205b(Q q10, c cVar) {
        super(q10);
        if (q10.Z() == 8) {
            if (q10.f49615v == 0) {
                this.f49668p = cVar;
                return;
            }
            throw new AddressPositionException(q10.f49615v);
        }
        throw new AddressValueException("ipaddress.error.ipv6.invalid.segment.count", q10.Z());
    }

    public C6205b(Q q10, CharSequence charSequence) {
        this(q10, charSequence, true);
    }

    public C6205b(Q q10) {
        this(q10, (CharSequence) null);
    }

    public C6205b(Inet6Address inet6Address) {
        this(inet6Address, inet6Address.getAddress(), null, L1(inet6Address));
    }

    private C6205b(Inet6Address inet6Address, final byte[] bArr, final Integer num, c cVar) {
        super(new Function() { // from class: inet.ipaddr.ipv6.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C6205b.U1(bArr, num, (inet.ipaddr.a) obj);
            }
        });
        this.f49668p = cVar;
        v().g1(inet6Address);
    }
}
