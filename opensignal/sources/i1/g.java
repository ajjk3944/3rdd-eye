package i1;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f11147b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11148c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11149d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11150e;

    public g(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f11147b = f10;
        this.f11148c = f11;
        this.f11149d = i10;
        this.f11150e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11147b == gVar.f11147b && this.f11148c == gVar.f11148c && this.f11149d == gVar.f11149d && this.f11150e == gVar.f11150e;
    }

    public final int hashCode() {
        return c7.a.C(this.f11150e, c7.a.C(this.f11149d, w.g.a(Float.hashCode(this.f11147b) * 31, this.f11148c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f11147b);
        sb2.append(", miter=");
        sb2.append(this.f11148c);
        sb2.append(", cap=");
        String str = "Unknown";
        int i10 = this.f11149d;
        sb2.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i11 = this.f11150e;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
