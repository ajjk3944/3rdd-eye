package ph;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f31967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31970d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31971e;

    /* renamed from: f, reason: collision with root package name */
    public final float f31972f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f31973h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f31974i;
    public final Integer j;

    public b(Integer num, String str, String str2, int i4, float f10, float f11, float f12, Boolean bool, Boolean bool2, Integer num2) {
        this.f31967a = num;
        this.f31968b = str;
        this.f31969c = str2;
        this.f31970d = i4;
        this.f31971e = f10;
        this.f31972f = f11;
        this.g = f12;
        this.f31973h = bool;
        this.f31974i = bool2;
        this.j = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f31967a, bVar.f31967a) && k.a(this.f31968b, bVar.f31968b) && k.a(this.f31969c, bVar.f31969c) && this.f31970d == bVar.f31970d && Float.compare(this.f31971e, bVar.f31971e) == 0 && Float.compare(this.f31972f, bVar.f31972f) == 0 && Float.compare(this.g, bVar.g) == 0 && k.a(this.f31973h, bVar.f31973h) && k.a(this.f31974i, bVar.f31974i) && k.a(this.j, bVar.j);
    }

    public final int hashCode() {
        Integer num = this.f31967a;
        int iD = r5.c.d(this.g, r5.c.d(this.f31972f, r5.c.d(this.f31971e, (u.m(u.m((num == null ? 0 : num.hashCode()) * 31, 31, this.f31968b), 31, this.f31969c) + this.f31970d) * 31, 31), 31), 31);
        Boolean bool = this.f31973h;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f31974i;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.j;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SensorDetail(sensorId=" + this.f31967a + ", intType=" + this.f31968b + ", vendor=" + this.f31969c + ", version=" + this.f31970d + ", resolution=" + this.f31971e + ", power=" + this.f31972f + ", maximumRange=" + this.g + ", isDynamic=" + this.f31973h + ", isWakeup=" + this.f31974i + ", reportingMode=" + this.j + ")";
    }
}
