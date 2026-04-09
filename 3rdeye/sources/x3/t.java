package x3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class t extends D {

    /* renamed from: a, reason: collision with root package name */
    public final long f47749a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47750b;

    /* renamed from: c, reason: collision with root package name */
    public final n f47751c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f47752d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47753e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f47754f;

    /* renamed from: g, reason: collision with root package name */
    public final G f47755g;

    public t() {
        throw null;
    }

    public t(long j4, long j10, n nVar, Integer num, String str, ArrayList arrayList, G g10) {
        this.f47749a = j4;
        this.f47750b = j10;
        this.f47751c = nVar;
        this.f47752d = num;
        this.f47753e = str;
        this.f47754f = arrayList;
        this.f47755g = g10;
    }

    @Override // x3.D
    public final x a() {
        return this.f47751c;
    }

    @Override // x3.D
    public final List<C> b() {
        return this.f47754f;
    }

    @Override // x3.D
    public final Integer c() {
        return this.f47752d;
    }

    @Override // x3.D
    public final String d() {
        return this.f47753e;
    }

    @Override // x3.D
    public final G e() {
        return this.f47755g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f47749a != d10.f() || this.f47750b != d10.g()) {
            return false;
        }
        n nVar = this.f47751c;
        if (nVar == null) {
            if (d10.a() != null) {
                return false;
            }
        } else if (!nVar.equals(d10.a())) {
            return false;
        }
        Integer num = this.f47752d;
        if (num == null) {
            if (d10.c() != null) {
                return false;
            }
        } else if (!num.equals(d10.c())) {
            return false;
        }
        String str = this.f47753e;
        if (str == null) {
            if (d10.d() != null) {
                return false;
            }
        } else if (!str.equals(d10.d())) {
            return false;
        }
        ArrayList arrayList = this.f47754f;
        if (arrayList == null) {
            if (d10.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(d10.b())) {
            return false;
        }
        G g10 = this.f47755g;
        return g10 == null ? d10.e() == null : g10.equals(d10.e());
    }

    @Override // x3.D
    public final long f() {
        return this.f47749a;
    }

    @Override // x3.D
    public final long g() {
        return this.f47750b;
    }

    public final int hashCode() {
        long j4 = this.f47749a;
        long j10 = this.f47750b;
        int i = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        n nVar = this.f47751c;
        int iHashCode = (i ^ (nVar == null ? 0 : nVar.hashCode())) * 1000003;
        Integer num = this.f47752d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f47753e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f47754f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        G g10 = this.f47755g;
        return iHashCode4 ^ (g10 != null ? g10.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f47749a + ", requestUptimeMs=" + this.f47750b + ", clientInfo=" + this.f47751c + ", logSource=" + this.f47752d + ", logSourceName=" + this.f47753e + ", logEvents=" + this.f47754f + ", qosTier=" + this.f47755g + "}";
    }
}
