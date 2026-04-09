package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 extends k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29169b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29170c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29171d;

    public i1(String str, int i4, String str2, boolean z3) {
        this.f29168a = i4;
        this.f29169b = str;
        this.f29170c = str2;
        this.f29171d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f29168a == i1Var.f29168a && this.f29169b.equals(i1Var.f29169b) && this.f29170c.equals(i1Var.f29170c) && this.f29171d == i1Var.f29171d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29168a ^ 1000003) * 1000003) ^ this.f29169b.hashCode()) * 1000003) ^ this.f29170c.hashCode()) * 1000003) ^ (this.f29171d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f29168a + ", version=" + this.f29169b + ", buildVersion=" + this.f29170c + ", jailbroken=" + this.f29171d + "}";
    }
}
