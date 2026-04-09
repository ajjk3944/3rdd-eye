package Q4;

import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes2.dex */
public final class E extends f0.d {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.d.a> f10994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10995b;

    public E() {
        throw null;
    }

    public E(List list, String str) {
        this.f10994a = list;
        this.f10995b = str;
    }

    @Override // Q4.f0.d
    public final List<f0.d.a> a() {
        return this.f10994a;
    }

    @Override // Q4.f0.d
    public final String b() {
        return this.f10995b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        if (!this.f10994a.equals(dVar.a())) {
            return false;
        }
        String str = this.f10995b;
        return str == null ? dVar.b() == null : str.equals(dVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.f10994a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10995b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f10994a);
        sb.append(", orgId=");
        return B4.f.c(sb, this.f10995b, "}");
    }
}
