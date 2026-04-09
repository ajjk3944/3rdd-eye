package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29101a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29104d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29105e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29106f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29107h;

    /* renamed from: i, reason: collision with root package name */
    public final List f29108i;

    public d0(int i4, String str, int i10, int i11, long j, long j8, long j9, String str2, List list) {
        this.f29101a = i4;
        this.f29102b = str;
        this.f29103c = i10;
        this.f29104d = i11;
        this.f29105e = j;
        this.f29106f = j8;
        this.g = j9;
        this.f29107h = str2;
        this.f29108i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.f29108i;
            String str2 = d0Var.f29107h;
            if (this.f29101a == d0Var.f29101a && this.f29102b.equals(d0Var.f29102b) && this.f29103c == d0Var.f29103c && this.f29104d == d0Var.f29104d && this.f29105e == d0Var.f29105e && this.f29106f == d0Var.f29106f && this.g == d0Var.g && ((str = this.f29107h) != null ? str.equals(str2) : str2 == null) && ((list = this.f29108i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f29101a ^ 1000003) * 1000003) ^ this.f29102b.hashCode()) * 1000003) ^ this.f29103c) * 1000003) ^ this.f29104d) * 1000003;
        long j = this.f29105e;
        int i4 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j8 = this.f29106f;
        int i10 = (i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.g;
        int i11 = (i10 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str = this.f29107h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f29108i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f29101a + ", processName=" + this.f29102b + ", reasonCode=" + this.f29103c + ", importance=" + this.f29104d + ", pss=" + this.f29105e + ", rss=" + this.f29106f + ", timestamp=" + this.g + ", traceFile=" + this.f29107h + ", buildIdMappingForArch=" + this.f29108i + "}";
    }
}
