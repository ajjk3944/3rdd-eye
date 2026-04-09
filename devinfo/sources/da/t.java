package da;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22163a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22164b;

    /* renamed from: c, reason: collision with root package name */
    public final n f22165c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f22166d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22167e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22168f;

    public t(long j, long j8, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f22133a;
        this.f22163a = j;
        this.f22164b = j8;
        this.f22165c = nVar;
        this.f22166d = num;
        this.f22167e = str;
        this.f22168f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        Object obj2 = j0.f22133a;
        ArrayList arrayList = tVar.f22168f;
        String str = tVar.f22167e;
        Integer num = tVar.f22166d;
        n nVar = tVar.f22165c;
        if (this.f22163a != tVar.f22163a || this.f22164b != tVar.f22164b || !this.f22165c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f22166d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f22167e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f22168f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f22163a;
        long j8 = this.f22164b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f22165c.hashCode()) * 1000003;
        Integer num = this.f22166d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f22167e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f22168f.hashCode()) * 1000003) ^ j0.f22133a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f22163a + ", requestUptimeMs=" + this.f22164b + ", clientInfo=" + this.f22165c + ", logSource=" + this.f22166d + ", logSourceName=" + this.f22167e + ", logEvents=" + this.f22168f + ", qosTier=" + j0.f22133a + "}";
    }
}
