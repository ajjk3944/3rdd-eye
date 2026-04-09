package mi;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f16820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16821b;

    public w(int i10, String str) {
        this.f16820a = i10;
        this.f16821b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f16820a == wVar.f16820a && br.l.a(this.f16821b, wVar.f16821b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16820a) * 31;
        String str = this.f16821b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpConfigSelection(configIndex=");
        sb2.append(this.f16820a);
        sb2.append(", udpIp=");
        return h0.b.r(sb2, this.f16821b, ')');
    }
}
