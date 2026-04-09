package V6;

import N7.B8;
import N7.H7;

/* compiled from: ShadowData.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f12975a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12976b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12978d;

    public g(float f10, float f11, float f12, int i) {
        this.f12975a = f10;
        this.f12976b = f11;
        this.f12977c = f12;
        this.f12978d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f12975a, gVar.f12975a) == 0 && Float.compare(this.f12976b, gVar.f12976b) == 0 && Float.compare(this.f12977c, gVar.f12977c) == 0 && this.f12978d == gVar.f12978d;
    }

    public final int hashCode() {
        return B8.g(this.f12977c, B8.g(this.f12976b, Float.floatToIntBits(this.f12975a) * 31, 31), 31) + this.f12978d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowData(offsetX=");
        sb.append(this.f12975a);
        sb.append(", offsetY=");
        sb.append(this.f12976b);
        sb.append(", radius=");
        sb.append(this.f12977c);
        sb.append(", color=");
        return H7.p(sb, this.f12978d, ')');
    }
}
