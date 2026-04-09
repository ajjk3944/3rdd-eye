package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes2.dex */
public final class C extends f0.a.AbstractC0135a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10991c;

    public C(String str, String str2, String str3) {
        this.f10989a = str;
        this.f10990b = str2;
        this.f10991c = str3;
    }

    @Override // Q4.f0.a.AbstractC0135a
    public final String a() {
        return this.f10989a;
    }

    @Override // Q4.f0.a.AbstractC0135a
    public final String b() {
        return this.f10991c;
    }

    @Override // Q4.f0.a.AbstractC0135a
    public final String c() {
        return this.f10990b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.AbstractC0135a)) {
            return false;
        }
        f0.a.AbstractC0135a abstractC0135a = (f0.a.AbstractC0135a) obj;
        return this.f10989a.equals(abstractC0135a.a()) && this.f10990b.equals(abstractC0135a.c()) && this.f10991c.equals(abstractC0135a.b());
    }

    public final int hashCode() {
        return ((((this.f10989a.hashCode() ^ 1000003) * 1000003) ^ this.f10990b.hashCode()) * 1000003) ^ this.f10991c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f10989a);
        sb.append(", libraryName=");
        sb.append(this.f10990b);
        sb.append(", buildId=");
        return B4.f.c(sb, this.f10991c, "}");
    }
}
