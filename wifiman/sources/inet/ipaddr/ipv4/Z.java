package inet.ipaddr.ipv4;

import inet.ipaddr.d;
import inet.ipaddr.ipv6.j0;
import inet.ipaddr.o;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes4.dex */
public class Z extends o.b implements Comparable {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49530i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f49531j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f49532k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f49533l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f49534m;

    /* renamed from: n, reason: collision with root package name */
    private final C6183e f49535n;

    public static class a extends o.b.a {

        /* renamed from: i, reason: collision with root package name */
        private boolean f49536i = true;

        /* renamed from: j, reason: collision with root package name */
        private boolean f49537j = true;

        /* renamed from: k, reason: collision with root package name */
        private boolean f49538k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f49539l = true;

        /* renamed from: m, reason: collision with root package name */
        private boolean f49540m = false;

        /* renamed from: n, reason: collision with root package name */
        private C6183e f49541n;

        /* renamed from: o, reason: collision with root package name */
        j0.a f49542o;

        @Override // inet.ipaddr.o.b.a
        public /* bridge */ /* synthetic */ o.a f() {
            return super.f();
        }

        @Override // inet.ipaddr.o.b.a
        protected void g(j0.a aVar) {
            this.f49542o = aVar;
        }

        public a o(boolean z10) {
            super.e(z10);
            return this;
        }

        public a p(boolean z10) {
            this.f49536i = z10;
            this.f49537j = z10;
            this.f49539l = z10;
            super.d(z10);
            return this;
        }

        public a q(C6183e c6183e) {
            this.f49541n = c6183e;
            return this;
        }

        public a r(d.c cVar) {
            super.i(cVar);
            return this;
        }

        public Z s() {
            return new Z(this.f49303c, this.f49802f, this.f49304d, this.f49301a, this.f49302b, this.f49801e, this.f49803g, this.f49536i, this.f49537j, this.f49538k, this.f49539l, this.f49540m, this.f49541n);
        }
    }

    public Z(boolean z10, boolean z11, boolean z12, d.c cVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, C6183e c6183e) {
        super(z15, z10, z11, z12, cVar, z13, z14);
        this.f49530i = z16;
        this.f49531j = z17;
        this.f49532k = z18;
        this.f49533l = z19;
        this.f49534m = z20;
        this.f49535n = c6183e;
    }

    @Override // inet.ipaddr.o.b, inet.ipaddr.d.a
    public boolean equals(Object obj) {
        if (!(obj instanceof Z) || !super.equals(obj)) {
            return false;
        }
        Z z10 = (Z) obj;
        return this.f49530i == z10.f49530i && this.f49531j == z10.f49531j && this.f49533l == z10.f49533l && this.f49532k == z10.f49532k && this.f49534m == z10.f49534m;
    }

    @Override // inet.ipaddr.o.b, inet.ipaddr.d.a
    public int hashCode() {
        int iHashCode = super.hashCode();
        if (this.f49530i) {
            iHashCode |= 64;
        }
        if (this.f49531j) {
            iHashCode |= 128;
        }
        return this.f49533l ? iHashCode | PSKKeyManager.MAX_KEY_LENGTH_BYTES : iHashCode;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Z clone() {
        try {
            return (Z) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(Z z10) {
        int iH = super.h(z10);
        if (iH != 0) {
            return iH;
        }
        int iCompare = Boolean.compare(this.f49530i, z10.f49530i);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Boolean.compare(this.f49531j, z10.f49531j);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Boolean.compare(this.f49533l, z10.f49533l);
        if (iCompare3 != 0) {
            return iCompare3;
        }
        int iCompare4 = Boolean.compare(this.f49532k, z10.f49532k);
        return iCompare4 == 0 ? Boolean.compare(this.f49534m, z10.f49534m) : iCompare4;
    }

    public C6183e r() {
        C6183e c6183e = this.f49535n;
        return c6183e == null ? inet.ipaddr.a.j() : c6183e;
    }

    public a t() {
        a aVar = new a();
        aVar.f49536i = this.f49530i;
        aVar.f49537j = this.f49531j;
        aVar.f49539l = this.f49533l;
        aVar.f49540m = this.f49534m;
        aVar.f49541n = this.f49535n;
        return (a) l(aVar);
    }
}
