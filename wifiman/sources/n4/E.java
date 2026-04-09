package N4;

import N4.G;

/* loaded from: classes3.dex */
final class E extends G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14917a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14918b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14919c;

    E(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f14917a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f14918b = str2;
        this.f14919c = z10;
    }

    @Override // N4.G.c
    public boolean b() {
        return this.f14919c;
    }

    @Override // N4.G.c
    public String c() {
        return this.f14918b;
    }

    @Override // N4.G.c
    public String d() {
        return this.f14917a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        return this.f14917a.equals(cVar.d()) && this.f14918b.equals(cVar.c()) && this.f14919c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f14917a.hashCode() ^ 1000003) * 1000003) ^ this.f14918b.hashCode()) * 1000003) ^ (this.f14919c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f14917a + ", osCodeName=" + this.f14918b + ", isRooted=" + this.f14919c + "}";
    }
}
