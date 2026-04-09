package c2;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f2674a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2675b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2676c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2678e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2679f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2680h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2681i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2682k;

    public r(long j, long j8, long j9, long j10, boolean z3, float f10, int i4, boolean z10, ArrayList arrayList, long j11, long j12) {
        this.f2674a = j;
        this.f2675b = j8;
        this.f2676c = j9;
        this.f2677d = j10;
        this.f2678e = z3;
        this.f2679f = f10;
        this.g = i4;
        this.f2680h = z10;
        this.f2681i = arrayList;
        this.j = j11;
        this.f2682k = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h0.d(this.f2674a, rVar.f2674a) && this.f2675b == rVar.f2675b && o1.b.b(this.f2676c, rVar.f2676c) && o1.b.b(this.f2677d, rVar.f2677d) && this.f2678e == rVar.f2678e && Float.compare(this.f2679f, rVar.f2679f) == 0 && this.g == rVar.g && this.f2680h == rVar.f2680h && this.f2681i.equals(rVar.f2681i) && o1.b.b(this.j, rVar.j) && o1.b.b(this.f2682k, rVar.f2682k);
    }

    public final int hashCode() {
        long j = this.f2674a;
        long j8 = this.f2675b;
        return o1.b.f(this.f2682k) + ((o1.b.f(this.j) + ((this.f2681i.hashCode() + ((((r5.c.d(this.f2679f, (((o1.b.f(this.f2677d) + ((o1.b.f(this.f2676c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31)) * 31) + (this.f2678e ? 1231 : 1237)) * 31, 31) + this.g) * 31) + (this.f2680h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) h0.h(this.f2674a)) + ", uptime=" + this.f2675b + ", positionOnScreen=" + ((Object) o1.b.j(this.f2676c)) + ", position=" + ((Object) o1.b.j(this.f2677d)) + ", down=" + this.f2678e + ", pressure=" + this.f2679f + ", type=" + ((Object) c0.a(this.g)) + ", activeHover=" + this.f2680h + ", historical=" + this.f2681i + ", scrollDelta=" + ((Object) o1.b.j(this.j)) + ", originalEventPosition=" + ((Object) o1.b.j(this.f2682k)) + ')';
    }
}
