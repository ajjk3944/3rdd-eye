package inet.ipaddr.ipv6;

import com.google.ar.core.ImageMetadata;
import inet.ipaddr.d;
import inet.ipaddr.ipv4.Z;
import inet.ipaddr.o;
import java.util.Objects;

/* loaded from: classes4.dex */
public class j0 extends o.b implements Comparable {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49701i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f49702j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f49703k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f49704l;

    /* renamed from: m, reason: collision with root package name */
    private final C6208e f49705m;

    /* renamed from: n, reason: collision with root package name */
    private inet.ipaddr.o f49706n;

    public static class a extends o.b.a {

        /* renamed from: o, reason: collision with root package name */
        private static inet.ipaddr.o f49707o = new inet.ipaddr.o(false, false, false, false, false, false, false, true, false, new Z.a().s(), new j0(false, false, false, false, null, true, false, false, d.a.f49296e, false, false, false, null));

        /* renamed from: i, reason: collision with root package name */
        private boolean f49708i = true;

        /* renamed from: j, reason: collision with root package name */
        private boolean f49709j = true;

        /* renamed from: k, reason: collision with root package name */
        private boolean f49710k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f49711l = true;

        /* renamed from: m, reason: collision with root package name */
        private o.a f49712m;

        /* renamed from: n, reason: collision with root package name */
        private C6208e f49713n;

        @Override // inet.ipaddr.o.b.a
        public /* bridge */ /* synthetic */ o.a f() {
            return super.f();
        }

        public a p(boolean z10) {
            this.f49708i = z10;
            return this;
        }

        public a q(boolean z10) {
            t().o(z10);
            super.e(z10);
            return this;
        }

        public a r(boolean z10) {
            u().u().f49709j = z10;
            this.f49709j = z10;
            return this;
        }

        public a s(boolean z10) {
            if (z10) {
                p(z10);
            }
            u().t().p(z10);
            return this;
        }

        public Z.a t() {
            return u().t();
        }

        o.a u() {
            if (this.f49712m == null) {
                o.a aVarM = new o.a().k(false).o(false).n(false).p(false).j(false).m(false);
                this.f49712m = aVarM;
                aVarM.u().f49709j = this.f49709j;
                this.f49712m.u().f49710k = this.f49710k;
            }
            o.b.a.h(this, this.f49712m.t());
            return this.f49712m;
        }

        public a v(C6208e c6208e) {
            this.f49713n = c6208e;
            return this;
        }

        public a w(d.c cVar) {
            u().t().r(cVar);
            super.i(cVar);
            return this;
        }

        public j0 x() {
            o.a aVar = this.f49712m;
            return new j0(this.f49303c, this.f49802f, this.f49304d, this.f49708i, aVar == null ? f49707o : aVar.v(), this.f49709j, this.f49710k, this.f49711l, this.f49301a, this.f49302b, this.f49801e, this.f49803g, this.f49713n);
        }
    }

    public j0(boolean z10, boolean z11, boolean z12, boolean z13, inet.ipaddr.o oVar, boolean z14, boolean z15, boolean z16, d.c cVar, boolean z17, boolean z18, boolean z19, C6208e c6208e) {
        super(z19, z10, z11, z12, cVar, z17, z18);
        this.f49701i = z13;
        this.f49702j = z14;
        this.f49703k = z15;
        this.f49704l = z16;
        this.f49706n = oVar;
        this.f49705m = c6208e;
    }

    public a B(boolean z10) {
        a aVar = new a();
        aVar.f49708i = this.f49701i;
        aVar.f49709j = this.f49702j;
        aVar.f49710k = this.f49703k;
        aVar.f49711l = this.f49704l;
        aVar.f49713n = this.f49705m;
        if (!z10) {
            aVar.f49712m = this.f49706n.E(true);
        }
        return (a) l(aVar);
    }

    @Override // inet.ipaddr.o.b, inet.ipaddr.d.a
    public boolean equals(Object obj) {
        if (!(obj instanceof j0) || !super.equals(obj)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Objects.equals(this.f49706n.p(), j0Var.f49706n.p()) && this.f49701i == j0Var.f49701i && this.f49702j == j0Var.f49702j && this.f49703k == j0Var.f49703k && this.f49704l == j0Var.f49704l;
    }

    @Override // inet.ipaddr.o.b, inet.ipaddr.d.a
    public int hashCode() {
        int iHashCode = super.hashCode() | (this.f49706n.p().hashCode() << 6);
        if (this.f49701i) {
            iHashCode |= 32768;
        }
        if (this.f49702j) {
            iHashCode |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        return this.f49704l ? iHashCode | 131072 : iHashCode;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j0 clone() {
        try {
            j0 j0Var = (j0) super.clone();
            j0Var.f49706n = this.f49706n.clone();
            return j0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(j0 j0Var) {
        int iH = super.h(j0Var);
        if (iH != 0) {
            return iH;
        }
        int iCompareTo = this.f49706n.p().compareTo(j0Var.f49706n.p());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = Boolean.compare(this.f49701i, j0Var.f49701i);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Boolean.compare(this.f49702j, j0Var.f49702j);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Boolean.compare(this.f49703k, j0Var.f49703k);
        return iCompare3 == 0 ? Boolean.compare(this.f49704l, j0Var.f49704l) : iCompare3;
    }

    public inet.ipaddr.o r() {
        return this.f49706n;
    }

    public C6208e t() {
        C6208e c6208e = this.f49705m;
        return c6208e == null ? inet.ipaddr.a.s() : c6208e;
    }
}
