package inet.ipaddr;

import inet.ipaddr.o;
import java.io.Serializable;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public class f implements Cloneable, Comparable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49327c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49329e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49330f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49331g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49332h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49333i;

    /* renamed from: j, reason: collision with root package name */
    public final o f49334j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f49335a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f49336b = true;

        /* renamed from: c, reason: collision with root package name */
        private boolean f49337c = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f49338d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f49339e = true;

        /* renamed from: f, reason: collision with root package name */
        private boolean f49340f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f49341g = true;

        /* renamed from: h, reason: collision with root package name */
        private boolean f49342h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f49343i = true;

        /* renamed from: j, reason: collision with root package name */
        private o.a f49344j;

        public a j(boolean z10) {
            this.f49335a = z10;
            return this;
        }

        public a k(boolean z10) {
            this.f49340f = z10;
            return this;
        }

        public a l(boolean z10) {
            this.f49343i = z10;
            return this;
        }

        public a m(boolean z10) {
            this.f49342h = z10;
            return this;
        }

        public f n() {
            o.a aVar = this.f49344j;
            o oVarV = aVar == null ? n.f49774e : aVar.v();
            boolean z10 = this.f49335a;
            boolean z11 = this.f49336b;
            boolean z12 = this.f49340f;
            return new f(oVarV, z10, z11, z12 && this.f49337c, z12 && this.f49338d, this.f49339e, z12, this.f49341g, this.f49342h, this.f49343i);
        }
    }

    public f(o oVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f49325a = z10;
        this.f49326b = z11;
        this.f49328d = z12;
        this.f49327c = z13;
        this.f49329e = z14;
        this.f49330f = z15;
        this.f49331g = z16;
        this.f49333i = z17;
        this.f49332h = z18;
        this.f49334j = oVar;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iCompare = Boolean.compare(this.f49325a, fVar.f49325a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Boolean.compare(this.f49328d, fVar.f49328d);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Boolean.compare(this.f49327c, fVar.f49327c);
        if (iCompare3 != 0) {
            return iCompare3;
        }
        int iCompare4 = Boolean.compare(this.f49329e, fVar.f49329e);
        if (iCompare4 != 0) {
            return iCompare4;
        }
        int iCompare5 = Boolean.compare(this.f49330f, fVar.f49330f);
        if (iCompare5 != 0) {
            return iCompare5;
        }
        int iCompare6 = Boolean.compare(this.f49331g, fVar.f49331g);
        if (iCompare6 != 0) {
            return iCompare6;
        }
        int iCompare7 = Boolean.compare(this.f49333i, fVar.f49333i);
        if (iCompare7 != 0) {
            return iCompare7;
        }
        int iCompare8 = Boolean.compare(this.f49332h, fVar.f49332h);
        return iCompare8 == 0 ? this.f49334j.compareTo(fVar.f49334j) : iCompare8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f49325a == fVar.f49325a && this.f49328d == fVar.f49328d && this.f49327c == fVar.f49327c && this.f49329e == fVar.f49329e && this.f49330f == fVar.f49330f && this.f49331g == fVar.f49331g && this.f49333i == fVar.f49333i && this.f49332h == fVar.f49332h && this.f49334j.equals(fVar.f49334j);
    }

    public o.a h() {
        return this.f49334j.B();
    }

    public int hashCode() {
        int iHashCode = this.f49330f ? this.f49334j.hashCode() : 0;
        if (this.f49325a) {
            iHashCode |= 536870912;
        }
        if (this.f49330f && (this.f49328d || this.f49327c)) {
            iHashCode |= PduHandle.NONE;
        }
        return (this.f49331g || this.f49332h || this.f49333i) ? iHashCode | 1073741824 : iHashCode;
    }

    public a l() {
        a aVar = new a();
        aVar.f49335a = this.f49325a;
        aVar.f49336b = this.f49326b;
        aVar.f49338d = this.f49327c;
        aVar.f49337c = this.f49328d;
        aVar.f49339e = this.f49329e;
        aVar.f49340f = this.f49330f;
        aVar.f49341g = this.f49331g;
        aVar.f49343i = this.f49332h;
        aVar.f49344j = h();
        return aVar;
    }
}
