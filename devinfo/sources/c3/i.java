package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f2715d = new i(f.f2710c, 17, 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f2716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2718c;

    public i(float f10, int i4, int i10) {
        this.f2716a = f10;
        this.f2717b = i4;
        this.f2718c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f2716a;
        float f11 = f.f2709b;
        return Float.compare(this.f2716a, f10) == 0 && this.f2717b == iVar.f2717b && this.f2718c == iVar.f2718c;
    }

    public final int hashCode() {
        float f10 = f.f2709b;
        return (((Float.floatToIntBits(this.f2716a) * 31) + this.f2717b) * 31) + this.f2718c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f2716a));
        sb2.append(", trim=");
        String str = "Invalid";
        int i4 = this.f2717b;
        sb2.append((Object) (i4 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i4 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i4 == 17 ? "LineHeightStyle.Trim.Both" : i4 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=");
        int i10 = this.f2718c;
        if (i10 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i10 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i10 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
