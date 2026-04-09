package inet.ipaddr.format.validate;

import inet.ipaddr.format.validate.r;
import inet.ipaddr.g;
import java.io.Serializable;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Objects;

/* loaded from: classes4.dex */
public interface d extends Serializable {

    /* renamed from: p0, reason: collision with root package name */
    public static final k f49368p0 = new a(h.INVALID);

    /* renamed from: q0, reason: collision with root package name */
    public static final k f49369q0 = new b(null);

    /* renamed from: r0, reason: collision with root package name */
    public static final k f49370r0 = new c(h.EMPTY);

    class a extends k {
        a(h hVar) {
            super(hVar);
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean s0() {
            return true;
        }
    }

    class b extends k {
        b(h hVar) {
            super(hVar);
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean J0() {
            return true;
        }
    }

    class c extends k {
        c(h hVar) {
            super(hVar);
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean y0() {
            return true;
        }
    }

    /* renamed from: inet.ipaddr.format.validate.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C1858d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49371a;

        static {
            int[] iArr = new int[g.a.values().length];
            f49371a = iArr;
            try {
                iArr[g.a.IPV4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49371a[g.a.IPV6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class e extends l {

        /* renamed from: c, reason: collision with root package name */
        protected final g.a f49372c;

        /* renamed from: d, reason: collision with root package name */
        protected final Integer f49373d;

        e(Integer num, g.a aVar, inet.ipaddr.o oVar) {
            super(oVar);
            this.f49373d = num;
            this.f49372c = aVar;
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public inet.ipaddr.g M() {
            if (this.f49372c == null) {
                return null;
            }
            return super.M();
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public boolean S0() {
            return this.f49372c != null;
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public Integer g0() {
            return this.f49373d;
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public g.a o0() {
            return this.f49372c;
        }
    }

    public static class f extends e {

        /* renamed from: e, reason: collision with root package name */
        Zf.f f49374e;

        /* renamed from: f, reason: collision with root package name */
        inet.ipaddr.format.validate.i f49375f;

        f(inet.ipaddr.format.validate.i iVar, g.a aVar, Zf.f fVar, inet.ipaddr.o oVar) {
            super(iVar.h(), aVar, oVar);
            this.f49374e = fVar;
            this.f49375f = iVar;
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean U() {
            return this.f49372c == null;
        }

        @Override // inet.ipaddr.format.validate.d.g
        r.d a() {
            inet.ipaddr.format.validate.i iVar = this.f49375f;
            inet.ipaddr.format.validate.i iVar2 = inet.ipaddr.format.validate.h.f49382j;
            if (iVar.equals(iVar2)) {
                return new r.d(r.L1(this.f49372c, this.f49375f, this.f49374e, this.f49379b));
            }
            inet.ipaddr.g gVarL1 = r.L1(this.f49372c, this.f49375f, this.f49374e, this.f49379b);
            g.a aVar = this.f49372c;
            if (this.f49375f.o() != null) {
                iVar2 = new inet.ipaddr.format.validate.i(this.f49375f.o());
            }
            return new r.d(gVarL1, r.L1(aVar, iVar2, this.f49374e, this.f49379b));
        }

        @Override // inet.ipaddr.format.validate.d.e, inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public Integer g0() {
            return this.f49375f.h();
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public h getType() {
            g.a aVar = this.f49372c;
            return aVar != null ? h.from(aVar) : h.ALL;
        }

        @Override // inet.ipaddr.format.validate.d
        public int t0() {
            return this.f49372c == null ? inet.ipaddr.a.f49279e.hashCode() : super.hashCode();
        }
    }

    public static class g implements d {

        /* renamed from: a, reason: collision with root package name */
        r.d f49376a;

        /* synthetic */ g(inet.ipaddr.g gVar, inet.ipaddr.g gVar2, a aVar) {
            this(gVar, gVar2);
        }

        private r.d c() {
            r.d dVarA = this.f49376a;
            if (dVarA == null) {
                synchronized (this) {
                    try {
                        dVarA = this.f49376a;
                        if (dVarA == null) {
                            dVarA = a();
                            this.f49376a = dVarA;
                        }
                    } finally {
                    }
                }
            }
            return dVarA;
        }

        @Override // inet.ipaddr.format.validate.d
        public inet.ipaddr.g M() {
            return c().a();
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean S0() {
            return true;
        }

        r.d a() {
            return null;
        }

        @Override // inet.ipaddr.format.validate.d
        public Integer g0() {
            return M().F0();
        }

        @Override // inet.ipaddr.format.validate.d
        public h getType() {
            return h.from(o0());
        }

        @Override // inet.ipaddr.format.validate.d
        public g.a o0() {
            return M().n0();
        }

        public String toString() {
            return String.valueOf(M());
        }

        g() {
        }

        private g(inet.ipaddr.g gVar, inet.ipaddr.g gVar2) {
            this.f49376a = new r.d(gVar, gVar2);
        }
    }

    public enum h {
        INVALID,
        EMPTY,
        IPV4,
        IPV6,
        PREFIX_ONLY,
        ALL;

        static h from(g.a aVar) {
            int i10 = C1858d.f49371a[aVar.ordinal()];
            if (i10 == 1) {
                return IPV4;
            }
            if (i10 != 2) {
                return null;
            }
            return IPV6;
        }
    }

    public static class i extends l {

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f49377c;

        i(inet.ipaddr.o oVar) {
            this(null, oVar);
        }

        @Override // inet.ipaddr.format.validate.d.g
        r.d a() {
            InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
            boolean z10 = loopbackAddress instanceof Inet6Address;
            CharSequence charSequence = this.f49377c;
            return new r.d((charSequence == null || charSequence.length() <= 0 || !z10) ? z10 ? this.f49379b.r().t().n() : this.f49379b.p().r().n() : (inet.ipaddr.g) this.f49379b.r().t().m().m(loopbackAddress.getAddress(), this.f49377c));
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public Integer g0() {
            return null;
        }

        i(CharSequence charSequence, inet.ipaddr.o oVar) {
            super(oVar);
            this.f49377c = charSequence;
        }
    }

    public static class j extends e {
        j(Integer num, g.a aVar, inet.ipaddr.o oVar) {
            super(num, aVar, oVar);
        }

        private inet.ipaddr.g d(g.a aVar, int i10, boolean z10) {
            inet.ipaddr.i iVarR = aVar.isIPv4() ? this.f49379b.p().r() : this.f49379b.r().t();
            return z10 ? iVarR.p(i10) : iVarR.s(i10, false);
        }

        @Override // inet.ipaddr.format.validate.d
        public int D0(d dVar) {
            int iOrdinal;
            int iOrdinal2;
            if (this == dVar) {
                return 0;
            }
            if (this.f49372c == null) {
                h type = dVar.getType();
                h hVar = h.PREFIX_ONLY;
                if (type == hVar) {
                    return dVar.g0().intValue() - g0().intValue();
                }
                iOrdinal = hVar.ordinal();
                iOrdinal2 = dVar.getType().ordinal();
            } else {
                inet.ipaddr.g gVarM = dVar.M();
                if (gVarM != null) {
                    return M().compareTo(gVarM);
                }
                iOrdinal = h.from(this.f49372c).ordinal();
                iOrdinal2 = dVar.getType().ordinal();
            }
            return iOrdinal - iOrdinal2;
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean W(d dVar) {
            if (dVar == this) {
                return true;
            }
            return this.f49372c == null ? dVar.getType() == h.PREFIX_ONLY && dVar.g0().intValue() == g0().intValue() : super.W(dVar);
        }

        @Override // inet.ipaddr.format.validate.d.g
        r.d a() {
            return new r.d(d(this.f49372c, g0().intValue(), true), d(this.f49372c, g0().intValue(), false));
        }

        @Override // inet.ipaddr.format.validate.d.g, inet.ipaddr.format.validate.d
        public h getType() {
            g.a aVar = this.f49372c;
            return aVar != null ? h.from(aVar) : h.PREFIX_ONLY;
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean i0() {
            return this.f49372c == null;
        }

        @Override // inet.ipaddr.format.validate.d
        public int t0() {
            return this.f49372c == null ? g0().intValue() : M().hashCode();
        }
    }

    public static abstract class k implements d {

        /* renamed from: a, reason: collision with root package name */
        private h f49378a;

        public k(h hVar) {
            this.f49378a = hVar;
        }

        @Override // inet.ipaddr.format.validate.d
        public inet.ipaddr.g M() {
            return null;
        }

        @Override // inet.ipaddr.format.validate.d
        public boolean W(d dVar) {
            if (this == dVar) {
                return true;
            }
            return (dVar instanceof k) && getType() == ((k) dVar).getType();
        }

        @Override // inet.ipaddr.format.validate.d
        public h getType() {
            return this.f49378a;
        }

        @Override // inet.ipaddr.format.validate.d
        public int t0() {
            return Objects.hashCode(getType());
        }

        public String toString() {
            return String.valueOf(getType());
        }
    }

    public static abstract class l extends g {

        /* renamed from: b, reason: collision with root package name */
        protected final inet.ipaddr.o f49379b;

        l(inet.ipaddr.o oVar) {
            this.f49379b = oVar;
        }

        @Override // inet.ipaddr.format.validate.d
        public inet.ipaddr.o getParameters() {
            return this.f49379b;
        }
    }

    static d O0(inet.ipaddr.g gVar, inet.ipaddr.g gVar2) {
        return new g(gVar, gVar2, null);
    }

    default int D0(d dVar) {
        inet.ipaddr.g gVarM;
        if (this == dVar) {
            return 0;
        }
        inet.ipaddr.g gVarM2 = M();
        if (gVarM2 != null && (gVarM = dVar.M()) != null) {
            return gVarM2.compareTo(gVarM);
        }
        h type = getType();
        h type2 = dVar.getType();
        if (type == null) {
            return type2 == null ? 0 : -1;
        }
        if (type2 == null) {
            return 1;
        }
        return type.ordinal() - type2.ordinal();
    }

    default boolean J0() {
        return false;
    }

    inet.ipaddr.g M();

    default boolean S0() {
        return false;
    }

    default boolean U() {
        return false;
    }

    default boolean W(d dVar) {
        if (this == dVar) {
            return true;
        }
        inet.ipaddr.g gVarM = M();
        if (gVarM == null) {
            return getType() == dVar.getType();
        }
        inet.ipaddr.g gVarM2 = dVar.M();
        if (gVarM2 != null) {
            return gVarM.equals(gVarM2);
        }
        return false;
    }

    default Integer g0() {
        return null;
    }

    default inet.ipaddr.o getParameters() {
        return null;
    }

    h getType();

    default boolean i0() {
        return false;
    }

    default Boolean k0(d dVar) {
        return null;
    }

    default g.a o0() {
        return null;
    }

    default boolean s0() {
        return false;
    }

    default int t0() {
        inet.ipaddr.g gVarM = M();
        return gVarM != null ? gVarM.hashCode() : Objects.hashCode(getType());
    }

    default boolean y0() {
        return false;
    }
}
