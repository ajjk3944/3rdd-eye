package E;

import C.N;
import E.D;
import E.o;
import android.util.Size;

/* compiled from: AutoValue_CaptureNode_In.java */
/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654b extends o.b {

    /* renamed from: d, reason: collision with root package name */
    public final Size f1297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1298e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1299f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1300g;

    /* renamed from: h, reason: collision with root package name */
    public final N f1301h;
    public final Size i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1302j;

    /* renamed from: k, reason: collision with root package name */
    public final N.k<A> f1303k;

    /* renamed from: l, reason: collision with root package name */
    public final N.k<D.a> f1304l;

    public C0654b(Size size, int i, int i10, boolean z10, N n9, Size size2, int i11, N.k<A> kVar, N.k<D.a> kVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f1297d = size;
        this.f1298e = i;
        this.f1299f = i10;
        this.f1300g = z10;
        this.f1301h = n9;
        this.i = size2;
        this.f1302j = i11;
        this.f1303k = kVar;
        this.f1304l = kVar2;
    }

    @Override // E.o.b
    public final N.k<D.a> a() {
        return this.f1304l;
    }

    @Override // E.o.b
    public final N b() {
        return this.f1301h;
    }

    @Override // E.o.b
    public final int c() {
        return this.f1298e;
    }

    @Override // E.o.b
    public final int d() {
        return this.f1299f;
    }

    @Override // E.o.b
    public final int e() {
        return this.f1302j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.b)) {
            return false;
        }
        o.b bVar = (o.b) obj;
        if (!this.f1297d.equals(bVar.h()) || this.f1298e != bVar.c() || this.f1299f != bVar.d() || this.f1300g != bVar.i()) {
            return false;
        }
        N n9 = this.f1301h;
        if (n9 == null) {
            if (bVar.b() != null) {
                return false;
            }
        } else if (!n9.equals(bVar.b())) {
            return false;
        }
        Size size = this.i;
        if (size == null) {
            if (bVar.f() != null) {
                return false;
            }
        } else if (!size.equals(bVar.f())) {
            return false;
        }
        return this.f1302j == bVar.e() && this.f1303k.equals(bVar.g()) && this.f1304l.equals(bVar.a());
    }

    @Override // E.o.b
    public final Size f() {
        return this.i;
    }

    @Override // E.o.b
    public final N.k<A> g() {
        return this.f1303k;
    }

    @Override // E.o.b
    public final Size h() {
        return this.f1297d;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f1297d.hashCode() ^ 1000003) * 1000003) ^ this.f1298e) * 1000003) ^ this.f1299f) * 1000003) ^ (this.f1300g ? 1231 : 1237)) * 1000003;
        N n9 = this.f1301h;
        int iHashCode2 = (iHashCode ^ (n9 == null ? 0 : n9.hashCode())) * 1000003;
        Size size = this.i;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f1302j) * 1000003) ^ this.f1303k.hashCode()) * 1000003) ^ this.f1304l.hashCode();
    }

    @Override // E.o.b
    public final boolean i() {
        return this.f1300g;
    }

    public final String toString() {
        return "In{size=" + this.f1297d + ", inputFormat=" + this.f1298e + ", outputFormat=" + this.f1299f + ", virtualCamera=" + this.f1300g + ", imageReaderProxyProvider=" + this.f1301h + ", postviewSize=" + this.i + ", postviewImageFormat=" + this.f1302j + ", requestEdge=" + this.f1303k + ", errorEdge=" + this.f1304l + "}";
    }
}
