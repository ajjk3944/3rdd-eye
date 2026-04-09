package b7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import t6.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2015b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.h f2016c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2017d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2018e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2019f;
    public final t6.e g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2020h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.a f2021i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2022k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2023l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2024m;

    /* renamed from: n, reason: collision with root package name */
    public final long f2025n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2026o;

    /* renamed from: p, reason: collision with root package name */
    public final List f2027p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2028q;

    public q(String str, g0 g0Var, t6.h hVar, long j, long j8, long j9, t6.e eVar, int i4, t6.a aVar, long j10, long j11, int i10, int i11, long j12, int i12, List list, List list2) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        nk.k.e(hVar, "output");
        this.f2014a = str;
        this.f2015b = g0Var;
        this.f2016c = hVar;
        this.f2017d = j;
        this.f2018e = j8;
        this.f2019f = j9;
        this.g = eVar;
        this.f2020h = i4;
        this.f2021i = aVar;
        this.j = j10;
        this.f2022k = j11;
        this.f2023l = i10;
        this.f2024m = i11;
        this.f2025n = j12;
        this.f2026o = i12;
        this.f2027p = list;
        this.f2028q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return nk.k.a(this.f2014a, qVar.f2014a) && this.f2015b == qVar.f2015b && nk.k.a(this.f2016c, qVar.f2016c) && this.f2017d == qVar.f2017d && this.f2018e == qVar.f2018e && this.f2019f == qVar.f2019f && nk.k.a(this.g, qVar.g) && this.f2020h == qVar.f2020h && this.f2021i == qVar.f2021i && this.j == qVar.j && this.f2022k == qVar.f2022k && this.f2023l == qVar.f2023l && this.f2024m == qVar.f2024m && this.f2025n == qVar.f2025n && this.f2026o == qVar.f2026o && nk.k.a(this.f2027p, qVar.f2027p) && nk.k.a(this.f2028q, qVar.f2028q);
    }

    public final int hashCode() {
        int iHashCode = (this.f2016c.hashCode() + ((this.f2015b.hashCode() + (this.f2014a.hashCode() * 31)) * 31)) * 31;
        long j = this.f2017d;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f2018e;
        int i10 = (i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f2019f;
        int iHashCode2 = (this.f2021i.hashCode() + ((((this.g.hashCode() + ((i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31) + this.f2020h) * 31)) * 31;
        long j10 = this.j;
        int i11 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f2022k;
        int i12 = (((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f2023l) * 31) + this.f2024m) * 31;
        long j12 = this.f2025n;
        return this.f2028q.hashCode() + ((this.f2027p.hashCode() + ((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f2026o) * 31)) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f2014a + ", state=" + this.f2015b + ", output=" + this.f2016c + ", initialDelay=" + this.f2017d + ", intervalDuration=" + this.f2018e + ", flexDuration=" + this.f2019f + ", constraints=" + this.g + ", runAttemptCount=" + this.f2020h + ", backoffPolicy=" + this.f2021i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.f2022k + ", periodCount=" + this.f2023l + ", generation=" + this.f2024m + ", nextScheduleTimeOverride=" + this.f2025n + ", stopReason=" + this.f2026o + ", tags=" + this.f2027p + ", progress=" + this.f2028q + ')';
    }
}
