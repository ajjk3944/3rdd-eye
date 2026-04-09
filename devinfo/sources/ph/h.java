package ph;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f31997a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f31998b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f31999c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f32000d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32001e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32002f;

    public h(float f10, Float f11, Float f12, Float f13, String str, String str2) {
        this.f31997a = f10;
        this.f31998b = f11;
        this.f31999c = f12;
        this.f32000d = f13;
        this.f32001e = str;
        this.f32002f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f31997a, hVar.f31997a) == 0 && k.a(this.f31998b, hVar.f31998b) && k.a(this.f31999c, hVar.f31999c) && k.a(this.f32000d, hVar.f32000d) && k.a(this.f32001e, hVar.f32001e) && k.a(this.f32002f, hVar.f32002f);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f31997a) * 31;
        Float f10 = this.f31998b;
        int iHashCode = (iFloatToIntBits + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f31999c;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f32000d;
        int iM = u.m((iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f32001e);
        String str = this.f32002f;
        return iM + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SensorRealTimeData(x=");
        sb2.append(this.f31997a);
        sb2.append(", y=");
        sb2.append(this.f31998b);
        sb2.append(", z=");
        sb2.append(this.f31999c);
        sb2.append(", w=");
        sb2.append(this.f32000d);
        sb2.append(", unit=");
        return a0.g.p(sb2, this.f32001e, ", name=", this.f32002f, ")");
    }
}
