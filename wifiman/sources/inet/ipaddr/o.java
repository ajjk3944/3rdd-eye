package inet.ipaddr;

import inet.ipaddr.d;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.Z;
import inet.ipaddr.ipv6.j0;
import net.sqlcipher.database.SQLiteDatabase;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public class o extends d implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49780d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49781e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49782f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49783g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49784h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49785i;

    /* renamed from: j, reason: collision with root package name */
    private j0 f49786j;

    /* renamed from: k, reason: collision with root package name */
    private Z f49787k;

    public static class a extends d.b {

        /* renamed from: l, reason: collision with root package name */
        private static Z f49788l = new Z.a().s();

        /* renamed from: m, reason: collision with root package name */
        private static j0 f49789m = new j0.a().x();

        /* renamed from: d, reason: collision with root package name */
        private boolean f49790d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f49791e = true;

        /* renamed from: f, reason: collision with root package name */
        private boolean f49792f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f49793g = true;

        /* renamed from: h, reason: collision with root package name */
        private boolean f49794h = true;

        /* renamed from: i, reason: collision with root package name */
        private boolean f49795i = true;

        /* renamed from: j, reason: collision with root package name */
        Z.a f49796j;

        /* renamed from: k, reason: collision with root package name */
        j0.a f49797k;

        public a j(boolean z10) {
            return (a) super.a(z10);
        }

        public a k(boolean z10) {
            return (a) super.b(z10);
        }

        public a l(boolean z10) {
            this.f49794h = z10;
            return this;
        }

        public a m(boolean z10) {
            this.f49795i = z10;
            return this;
        }

        public a n(boolean z10) {
            this.f49792f = z10;
            return this;
        }

        public a o(boolean z10) {
            this.f49791e = z10;
            return this;
        }

        public a p(boolean z10) {
            this.f49793g = z10;
            return this;
        }

        public a q(boolean z10) {
            return (a) super.c(z10);
        }

        public a r(boolean z10) {
            t().o(z10);
            u().q(z10);
            return this;
        }

        public a s(boolean z10) {
            t().p(z10);
            u().s(z10);
            return this;
        }

        public Z.a t() {
            if (this.f49796j == null) {
                this.f49796j = new Z.a();
            }
            Z.a aVar = this.f49796j;
            aVar.f49804h = this;
            return aVar;
        }

        public j0.a u() {
            if (this.f49797k == null) {
                this.f49797k = new j0.a();
            }
            j0.a aVar = this.f49797k;
            aVar.f49804h = this;
            return aVar;
        }

        public o v() {
            Z.a aVar = this.f49796j;
            Z zS = aVar == null ? f49788l : aVar.s();
            j0.a aVar2 = this.f49797k;
            return new o(this.f49305a, this.f49306b, this.f49307c, this.f49790d, this.f49791e, this.f49792f, this.f49793g, this.f49794h, this.f49795i, zS, aVar2 == null ? f49789m : aVar2.x());
        }
    }

    public static abstract class b extends d.a {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f49798f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f49799g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f49800h;

        /* JADX INFO: Access modifiers changed from: protected */
        public static class a extends d.a.C1857a {

            /* renamed from: e, reason: collision with root package name */
            protected boolean f49801e = false;

            /* renamed from: f, reason: collision with root package name */
            protected boolean f49802f = true;

            /* renamed from: g, reason: collision with root package name */
            protected boolean f49803g = true;

            /* renamed from: h, reason: collision with root package name */
            a f49804h;

            protected a() {
            }

            protected static void h(j0.a aVar, Z.a aVar2) {
                aVar2.g(aVar);
            }

            public a d(boolean z10) {
                return (a) super.a(z10);
            }

            public a e(boolean z10) {
                return (a) super.b(z10);
            }

            public a f() {
                return this.f49804h;
            }

            protected void g(j0.a aVar) {
            }

            public a i(d.c cVar) {
                return (a) super.c(cVar);
            }
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, d.c cVar, boolean z14, boolean z15) {
            super(z11, z13, cVar, z14);
            this.f49798f = z10;
            this.f49800h = z12;
            this.f49799g = z15;
        }

        @Override // inet.ipaddr.d.a
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return super.equals(obj) && this.f49799g == bVar.f49799g && this.f49798f == bVar.f49798f && this.f49800h == bVar.f49800h;
        }

        protected int h(b bVar) {
            int iC = super.c(bVar);
            if (iC != 0) {
                return iC;
            }
            int iCompare = Boolean.compare(this.f49799g, bVar.f49799g);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Boolean.compare(this.f49800h, bVar.f49800h);
            return iCompare2 == 0 ? Boolean.compare(this.f49798f, bVar.f49798f) : iCompare2;
        }

        @Override // inet.ipaddr.d.a
        public int hashCode() {
            int iHashCode = super.hashCode();
            return this.f49799g ? iHashCode | 8 : iHashCode;
        }

        protected a l(a aVar) {
            super.d(aVar);
            aVar.f49802f = this.f49800h;
            aVar.f49801e = this.f49799g;
            aVar.f49803g = this.f49798f;
            return aVar;
        }
    }

    public o(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Z z19, j0 j0Var) {
        super(z10, z11, z12);
        this.f49780d = z16;
        this.f49781e = z13;
        this.f49782f = z14;
        this.f49783g = z15;
        this.f49785i = z17;
        this.f49784h = z18;
        this.f49786j = j0Var;
        this.f49787k = z19;
    }

    public a B() {
        return E(false);
    }

    public a E(boolean z10) {
        a aVar = new a();
        super.h(aVar);
        aVar.f49793g = this.f49780d;
        aVar.f49790d = this.f49781e;
        aVar.f49791e = this.f49782f;
        aVar.f49792f = this.f49783g;
        aVar.f49795i = this.f49784h;
        aVar.f49794h = this.f49785i;
        aVar.f49796j = this.f49787k.t();
        aVar.f49797k = this.f49786j.B(z10);
        aVar.f49307c = this.f49295c;
        aVar.f49305a = this.f49293a;
        aVar.f49306b = this.f49294b;
        return aVar;
    }

    @Override // inet.ipaddr.d
    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return super.equals(obj) && this.f49787k.equals(oVar.f49787k) && this.f49786j.equals(oVar.f49786j) && this.f49781e == oVar.f49781e && this.f49782f == oVar.f49782f && this.f49780d == oVar.f49780d && this.f49783g == oVar.f49783g && this.f49784h == oVar.f49784h && this.f49785i == oVar.f49785i;
    }

    public int hashCode() {
        int iHashCode = this.f49787k.hashCode() | (this.f49786j.hashCode() << 9);
        if (this.f49781e) {
            iHashCode |= 134217728;
        }
        if (this.f49782f) {
            iHashCode |= SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if (this.f49783g) {
            iHashCode |= 536870912;
        }
        if (this.f49293a) {
            iHashCode |= 1073741824;
        }
        return this.f49295c ? iHashCode | PduHandle.NONE : iHashCode;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public o clone() {
        o oVar = (o) super.c();
        oVar.f49787k = this.f49787k.clone();
        oVar.f49786j = this.f49786j.clone();
        return oVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        int iD = super.d(oVar);
        if (iD != 0) {
            return iD;
        }
        int iCompareTo = this.f49787k.compareTo(oVar.f49787k);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f49786j.compareTo(oVar.f49786j);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompare = Boolean.compare(this.f49781e, oVar.f49781e);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Boolean.compare(this.f49782f, oVar.f49782f);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Boolean.compare(this.f49780d, oVar.f49780d);
        if (iCompare3 != 0) {
            return iCompare3;
        }
        int iCompare4 = Boolean.compare(this.f49783g, oVar.f49783g);
        if (iCompare4 != 0) {
            return iCompare4;
        }
        int iCompare5 = Boolean.compare(this.f49784h, oVar.f49784h);
        return iCompare5 == 0 ? Boolean.compare(this.f49785i, oVar.f49785i) : iCompare5;
    }

    public Z p() {
        return this.f49787k;
    }

    public j0 r() {
        return this.f49786j;
    }

    public g.a t() {
        if (this.f49784h) {
            if (this.f49785i) {
                return null;
            }
            return g.a.IPV6;
        }
        if (this.f49785i) {
            return g.a.IPV4;
        }
        return null;
    }
}
