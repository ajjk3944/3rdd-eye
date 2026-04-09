package hf;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f10722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10723b;

    public w(String str, String str2) {
        this.f10722a = str;
        this.f10723b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return br.l.a(this.f10722a, wVar.f10722a) && br.l.a(this.f10723b, wVar.f10723b);
    }

    public final int hashCode() {
        String str = this.f10722a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10723b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f10722a);
        sb2.append(", authToken=");
        return h0.b.r(sb2, this.f10723b, ')');
    }
}
