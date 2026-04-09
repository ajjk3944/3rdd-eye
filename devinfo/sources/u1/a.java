package u1;

import d3.i;
import i2.g0;
import je.u;
import me.t1;
import nk.k;
import p1.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: d, reason: collision with root package name */
    public final g f35027d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35028e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35029f = 1;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public float f35030h;

    public a(g gVar) {
        int i4;
        int i10;
        long width = (gVar.f30963a.getWidth() << 32) | (gVar.f30963a.getHeight() & 4294967295L);
        this.f35027d = gVar;
        this.f35028e = width;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i4 = (int) (width >> 32)) < 0 || (i10 = (int) (width & 4294967295L)) < 0 || i4 > gVar.f30963a.getWidth() || i10 > gVar.f30963a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.g = width;
        this.f35030h = 1.0f;
    }

    @Override // u1.b
    public final void a(float f10) {
        this.f35030h = f10;
    }

    @Override // u1.b
    public final long c() {
        return t1.F(this.g);
    }

    @Override // u1.b
    public final void d(g0 g0Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (g0Var.c() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (g0Var.c() & 4294967295L)));
        u.e(g0Var, this.f35027d, this.f35028e, (iRound << 32) | (iRound2 & 4294967295L), this.f35030h, null, this.f35029f, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f35027d, aVar.f35027d) && i.a(0L, 0L) && d3.k.a(this.f35028e, aVar.f35028e) && this.f35029f == aVar.f35029f;
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f35027d.hashCode() * 31)) * 31;
        long j = this.f35028e;
        return ((((int) (j ^ (j >>> 32))) + iHashCode) * 31) + this.f35029f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f35027d);
        sb2.append(", srcOffset=");
        sb2.append((Object) i.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) d3.k.b(this.f35028e));
        sb2.append(", filterQuality=");
        int i4 = this.f35029f;
        sb2.append((Object) (i4 == 0 ? "None" : i4 == 1 ? "Low" : i4 == 2 ? "Medium" : i4 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
