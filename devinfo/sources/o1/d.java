package o1;

import cm.g;
import com.bumptech.glide.f;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f30370a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30371b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30372c;

    /* renamed from: d, reason: collision with root package name */
    public final float f30373d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30374e;

    /* renamed from: f, reason: collision with root package name */
    public final long f30375f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30376h;

    static {
        f.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j, long j8, long j9, long j10) {
        this.f30370a = f10;
        this.f30371b = f11;
        this.f30372c = f12;
        this.f30373d = f13;
        this.f30374e = j;
        this.f30375f = j8;
        this.g = j9;
        this.f30376h = j10;
    }

    public final float a() {
        return this.f30373d - this.f30371b;
    }

    public final float b() {
        return this.f30372c - this.f30370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f30370a, dVar.f30370a) == 0 && Float.compare(this.f30371b, dVar.f30371b) == 0 && Float.compare(this.f30372c, dVar.f30372c) == 0 && Float.compare(this.f30373d, dVar.f30373d) == 0 && g.i(this.f30374e, dVar.f30374e) && g.i(this.f30375f, dVar.f30375f) && g.i(this.g, dVar.g) && g.i(this.f30376h, dVar.f30376h);
    }

    public final int hashCode() {
        int iD = r5.c.d(this.f30373d, r5.c.d(this.f30372c, r5.c.d(this.f30371b, Float.floatToIntBits(this.f30370a) * 31, 31), 31), 31);
        long j = this.f30374e;
        long j8 = this.f30375f;
        int i4 = (((int) (j8 ^ (j8 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iD) * 31)) * 31;
        long j9 = this.g;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) + i4) * 31;
        long j10 = this.f30376h;
        return ((int) (j10 ^ (j10 >>> 32))) + i10;
    }

    public final String toString() {
        String str = com.bumptech.glide.c.u(this.f30370a) + ", " + com.bumptech.glide.c.u(this.f30371b) + ", " + com.bumptech.glide.c.u(this.f30372c) + ", " + com.bumptech.glide.c.u(this.f30373d);
        long j = this.f30374e;
        long j8 = this.f30375f;
        boolean zI = g.i(j, j8);
        long j9 = this.g;
        long j10 = this.f30376h;
        if (!zI || !g.i(j8, j9) || !g.i(j9, j10)) {
            StringBuilder sbA = h.A("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) g.O(j));
            sbA.append(", topRight=");
            sbA.append((Object) g.O(j8));
            sbA.append(", bottomRight=");
            sbA.append((Object) g.O(j9));
            sbA.append(", bottomLeft=");
            sbA.append((Object) g.O(j10));
            sbA.append(')');
            return sbA.toString();
        }
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.intBitsToFloat(i10)) {
            StringBuilder sbA2 = h.A("RoundRect(rect=", str, ", radius=");
            sbA2.append(com.bumptech.glide.c.u(Float.intBitsToFloat(i4)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = h.A("RoundRect(rect=", str, ", x=");
        sbA3.append(com.bumptech.glide.c.u(Float.intBitsToFloat(i4)));
        sbA3.append(", y=");
        sbA3.append(com.bumptech.glide.c.u(Float.intBitsToFloat(i10)));
        sbA3.append(')');
        return sbA3.toString();
    }
}
