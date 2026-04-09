package i2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f11155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11156b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11157c;

    public c(int i10, boolean z10, int i11) {
        this.f11155a = i10;
        this.f11156b = i11;
        this.f11157c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11155a == cVar.f11155a && this.f11156b == cVar.f11156b && this.f11157c == cVar.f11157c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11157c) + c7.a.C(this.f11156b, Integer.hashCode(this.f11155a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f11155a);
        sb2.append(", end=");
        sb2.append(this.f11156b);
        sb2.append(", isRtl=");
        return c7.a.r(sb2, this.f11157c, ')');
    }
}
