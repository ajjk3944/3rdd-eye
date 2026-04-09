package l9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15056a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15057b;

    /* renamed from: c, reason: collision with root package name */
    public final n f15058c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f15059d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15060e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15061f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f15062g;

    public t(long j, long j7, n nVar, Integer num, String str, ArrayList arrayList, j0 j0Var) {
        this.f15056a = j;
        this.f15057b = j7;
        this.f15058c = nVar;
        this.f15059d = num;
        this.f15060e = str;
        this.f15061f = arrayList;
        this.f15062g = j0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        j0 j0Var = tVar.f15062g;
        ArrayList arrayList = tVar.f15061f;
        String str = tVar.f15060e;
        Integer num = tVar.f15059d;
        n nVar = tVar.f15058c;
        if (this.f15056a != tVar.f15056a || this.f15057b != tVar.f15057b || !this.f15058c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f15059d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f15060e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f15061f.equals(arrayList)) {
            return false;
        }
        j0 j0Var2 = this.f15062g;
        return j0Var2 == null ? j0Var == null : j0Var2.equals(j0Var);
    }

    public final int hashCode() {
        long j = this.f15056a;
        long j7 = this.f15057b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f15058c.hashCode()) * 1000003;
        Integer num = this.f15059d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f15060e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15061f.hashCode()) * 1000003;
        j0 j0Var = this.f15062g;
        return iHashCode3 ^ (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f15056a + ", requestUptimeMs=" + this.f15057b + ", clientInfo=" + this.f15058c + ", logSource=" + this.f15059d + ", logSourceName=" + this.f15060e + ", logEvents=" + this.f15061f + ", qosTier=" + this.f15062g + "}";
    }
}
