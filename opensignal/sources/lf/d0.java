package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15212a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15215d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15216e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15217f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15218g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15219h;

    /* renamed from: i, reason: collision with root package name */
    public final List f15220i;

    public d0(int i10, String str, int i11, int i12, long j, long j7, long j10, String str2, List list) {
        this.f15212a = i10;
        this.f15213b = str;
        this.f15214c = i11;
        this.f15215d = i12;
        this.f15216e = j;
        this.f15217f = j7;
        this.f15218g = j10;
        this.f15219h = str2;
        this.f15220i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.f15220i;
            String str2 = d0Var.f15219h;
            if (this.f15212a == d0Var.f15212a && this.f15213b.equals(d0Var.f15213b) && this.f15214c == d0Var.f15214c && this.f15215d == d0Var.f15215d && this.f15216e == d0Var.f15216e && this.f15217f == d0Var.f15217f && this.f15218g == d0Var.f15218g && ((str = this.f15219h) != null ? str.equals(str2) : str2 == null) && ((list = this.f15220i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15212a ^ 1000003) * 1000003) ^ this.f15213b.hashCode()) * 1000003) ^ this.f15214c) * 1000003) ^ this.f15215d) * 1000003;
        long j = this.f15216e;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f15217f;
        int i11 = (i10 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j10 = this.f15218g;
        int i12 = (i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f15219h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f15220i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f15212a + ", processName=" + this.f15213b + ", reasonCode=" + this.f15214c + ", importance=" + this.f15215d + ", pss=" + this.f15216e + ", rss=" + this.f15217f + ", timestamp=" + this.f15218g + ", traceFile=" + this.f15219h + ", buildIdMappingForArch=" + this.f15220i + "}";
    }
}
