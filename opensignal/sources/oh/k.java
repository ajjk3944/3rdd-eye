package oh;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f19476a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19477b;

    public k(int i10, int i11) {
        this.f19476a = i10;
        this.f19477b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19476a == kVar.f19476a && this.f19477b == kVar.f19477b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19477b) + (Integer.hashCode(this.f19476a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodecInfo(profile=");
        sb2.append(this.f19476a);
        sb2.append(", level=");
        return c7.a.q(sb2, this.f19477b, ')');
    }
}
