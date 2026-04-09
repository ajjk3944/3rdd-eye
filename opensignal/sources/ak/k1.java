package ak;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f605d;

    /* renamed from: e, reason: collision with root package name */
    public final nh.h f606e;

    /* renamed from: f, reason: collision with root package name */
    public final int f607f;

    public k1(int i10, String str, String str2, String str3, nh.h hVar, int i11) {
        br.l.e(hVar, "manifest");
        this.f602a = i10;
        this.f603b = str;
        this.f604c = str2;
        this.f605d = str3;
        this.f606e = hVar;
        this.f607f = i11;
    }

    public static k1 a(k1 k1Var, int i10) {
        int i11 = (i10 & 1) != 0 ? k1Var.f602a : 100;
        String str = (i10 & 2) != 0 ? k1Var.f603b : "HD";
        String str2 = (i10 & 4) != 0 ? k1Var.f604c : "https://d3cf3ktuf33fak.cloudfront.net/video/720_clipped.mp4";
        String str3 = k1Var.f605d;
        nh.h hVar = k1Var.f606e;
        int i12 = k1Var.f607f;
        k1Var.getClass();
        br.l.e(hVar, "manifest");
        return new k1(i11, str, str2, str3, hVar, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f602a == k1Var.f602a && br.l.a(this.f603b, k1Var.f603b) && br.l.a(this.f604c, k1Var.f604c) && br.l.a(this.f605d, k1Var.f605d) && this.f606e == k1Var.f606e && this.f607f == k1Var.f607f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f607f) + ((this.f606e.hashCode() + c7.a.g(this.f605d, c7.a.g(this.f604c, c7.a.g(this.f603b, Integer.hashCode(this.f602a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoConfigItem(probability=");
        sb2.append(this.f602a);
        sb2.append(", quality=");
        sb2.append(this.f603b);
        sb2.append(", resource=");
        sb2.append(this.f604c);
        sb2.append(", routine=");
        sb2.append(this.f605d);
        sb2.append(", manifest=");
        sb2.append(this.f606e);
        sb2.append(", ignoreDeviceScreenResolutionProbability=");
        return c7.a.q(sb2, this.f607f, ')');
    }
}
