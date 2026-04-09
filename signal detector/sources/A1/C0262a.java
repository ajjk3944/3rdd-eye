package a1;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4645a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4646b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4647c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4648d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0262a)) {
            return false;
        }
        C0262a c0262a = (C0262a) obj;
        return this.f4645a == c0262a.f4645a && this.f4646b == c0262a.f4646b && this.f4647c == c0262a.f4647c && this.f4648d == c0262a.f4648d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f4645a;
        int i = r02;
        if (this.f4646b) {
            i = r02 + 16;
        }
        int i3 = i;
        if (this.f4647c) {
            i3 = i + 256;
        }
        return this.f4648d ? i3 + 4096 : i3;
    }

    public final String toString() {
        return "[ Connected=" + this.f4645a + " Validated=" + this.f4646b + " Metered=" + this.f4647c + " NotRoaming=" + this.f4648d + " ]";
    }
}
