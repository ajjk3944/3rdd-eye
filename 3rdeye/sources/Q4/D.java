package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes2.dex */
public final class D extends f0.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10993b;

    public D(String str, String str2) {
        this.f10992a = str;
        this.f10993b = str2;
    }

    @Override // Q4.f0.c
    public final String a() {
        return this.f10992a;
    }

    @Override // Q4.f0.c
    public final String b() {
        return this.f10993b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.c)) {
            return false;
        }
        f0.c cVar = (f0.c) obj;
        return this.f10992a.equals(cVar.a()) && this.f10993b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f10992a.hashCode() ^ 1000003) * 1000003) ^ this.f10993b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f10992a);
        sb.append(", value=");
        return B4.f.c(sb, this.f10993b, "}");
    }
}
