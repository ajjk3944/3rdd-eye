package r1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f32724b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32725c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32726d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32727e;

    public g(float f10, float f11, int i4, int i10, int i11) {
        f11 = (i11 & 2) != 0 ? 4.0f : f11;
        i4 = (i11 & 4) != 0 ? 0 : i4;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f32724b = f10;
        this.f32725c = f11;
        this.f32726d = i4;
        this.f32727e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f32724b == gVar.f32724b && this.f32725c == gVar.f32725c && this.f32726d == gVar.f32726d && this.f32727e == gVar.f32727e;
    }

    public final int hashCode() {
        return (((r5.c.d(this.f32725c, Float.floatToIntBits(this.f32724b) * 31, 31) + this.f32726d) * 31) + this.f32727e) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f32724b);
        sb2.append(", miter=");
        sb2.append(this.f32725c);
        sb2.append(", cap=");
        String str = "Unknown";
        int i4 = this.f32726d;
        sb2.append((Object) (i4 == 0 ? "Butt" : i4 == 1 ? "Round" : i4 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i10 = this.f32727e;
        if (i10 == 0) {
            str = "Miter";
        } else if (i10 == 1) {
            str = "Round";
        } else if (i10 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
