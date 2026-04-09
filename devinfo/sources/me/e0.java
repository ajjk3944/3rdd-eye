package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29119c;

    public e0(String str, String str2, String str3) {
        this.f29117a = str;
        this.f29118b = str2;
        this.f29119c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f29117a.equals(e0Var.f29117a) && this.f29118b.equals(e0Var.f29118b) && this.f29119c.equals(e0Var.f29119c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29117a.hashCode() ^ 1000003) * 1000003) ^ this.f29118b.hashCode()) * 1000003) ^ this.f29119c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f29117a);
        sb2.append(", libraryName=");
        sb2.append(this.f29118b);
        sb2.append(", buildId=");
        return d.h.w(sb2, this.f29119c, "}");
    }
}
