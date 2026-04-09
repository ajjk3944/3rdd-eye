package r2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f21204c = new i(17, f.f21200c);

    /* renamed from: a, reason: collision with root package name */
    public final float f21205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21206b;

    public i(int i10, float f10) {
        this.f21205a = f10;
        this.f21206b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f21205a;
        float f11 = f.f21199b;
        return Float.compare(this.f21205a, f10) == 0 && this.f21206b == iVar.f21206b;
    }

    public final int hashCode() {
        float f10 = f.f21199b;
        return Integer.hashCode(0) + c7.a.C(this.f21206b, Float.hashCode(this.f21205a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f21205a));
        sb2.append(", trim=");
        int i10 = this.f21206b;
        sb2.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=Mode(value=0))");
        return sb2.toString();
    }
}
