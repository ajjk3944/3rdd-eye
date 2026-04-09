package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends m2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29184b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29185c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29186d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f29187e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29188f;
    public final u1 g;

    /* renamed from: h, reason: collision with root package name */
    public final l2 f29189h;

    /* renamed from: i, reason: collision with root package name */
    public final k2 f29190i;
    public final v1 j;

    /* renamed from: k, reason: collision with root package name */
    public final List f29191k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29192l;

    public j0(String str, String str2, String str3, long j, Long l10, boolean z3, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i4) {
        this.f29183a = str;
        this.f29184b = str2;
        this.f29185c = str3;
        this.f29186d = j;
        this.f29187e = l10;
        this.f29188f = z3;
        this.g = u1Var;
        this.f29189h = l2Var;
        this.f29190i = k2Var;
        this.j = v1Var;
        this.f29191k = list;
        this.f29192l = i4;
    }

    @Override // me.m2
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.f29157a = this.f29183a;
        i0Var.f29158b = this.f29184b;
        i0Var.f29159c = this.f29185c;
        i0Var.f29160d = this.f29186d;
        i0Var.f29161e = this.f29187e;
        i0Var.f29162f = this.f29188f;
        i0Var.g = this.g;
        i0Var.f29163h = this.f29189h;
        i0Var.f29164i = this.f29190i;
        i0Var.j = this.j;
        i0Var.f29165k = this.f29191k;
        i0Var.f29166l = this.f29192l;
        i0Var.f29167m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.f29191k;
            v1 v1Var2 = j0Var.j;
            k2 k2Var2 = j0Var.f29190i;
            l2 l2Var2 = j0Var.f29189h;
            Long l11 = j0Var.f29187e;
            String str2 = j0Var.f29185c;
            if (this.f29183a.equals(j0Var.f29183a) && this.f29184b.equals(j0Var.f29184b) && ((str = this.f29185c) != null ? str.equals(str2) : str2 == null) && this.f29186d == j0Var.f29186d && ((l10 = this.f29187e) != null ? l10.equals(l11) : l11 == null) && this.f29188f == j0Var.f29188f && this.g.equals(j0Var.g) && ((l2Var = this.f29189h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.f29190i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.f29191k) != null ? list.equals(list2) : list2 == null) && this.f29192l == j0Var.f29192l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29183a.hashCode() ^ 1000003) * 1000003) ^ this.f29184b.hashCode()) * 1000003;
        String str = this.f29185c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f29186d;
        int i4 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l10 = this.f29187e;
        int iHashCode3 = (((((i4 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f29188f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        l2 l2Var = this.f29189h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.f29190i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f29191k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f29192l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f29183a);
        sb2.append(", identifier=");
        sb2.append(this.f29184b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f29185c);
        sb2.append(", startedAt=");
        sb2.append(this.f29186d);
        sb2.append(", endedAt=");
        sb2.append(this.f29187e);
        sb2.append(", crashed=");
        sb2.append(this.f29188f);
        sb2.append(", app=");
        sb2.append(this.g);
        sb2.append(", user=");
        sb2.append(this.f29189h);
        sb2.append(", os=");
        sb2.append(this.f29190i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.f29191k);
        sb2.append(", generatorType=");
        return r5.c.j(this.f29192l, "}", sb2);
    }
}
