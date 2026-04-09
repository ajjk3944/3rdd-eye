package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends m2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15297a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15299c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15300d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f15301e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15302f;

    /* renamed from: g, reason: collision with root package name */
    public final u1 f15303g;

    /* renamed from: h, reason: collision with root package name */
    public final l2 f15304h;

    /* renamed from: i, reason: collision with root package name */
    public final k2 f15305i;
    public final v1 j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15306l;

    public j0(String str, String str2, String str3, long j, Long l10, boolean z10, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i10) {
        this.f15297a = str;
        this.f15298b = str2;
        this.f15299c = str3;
        this.f15300d = j;
        this.f15301e = l10;
        this.f15302f = z10;
        this.f15303g = u1Var;
        this.f15304h = l2Var;
        this.f15305i = k2Var;
        this.j = v1Var;
        this.k = list;
        this.f15306l = i10;
    }

    @Override // lf.m2
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.f15271a = this.f15297a;
        i0Var.f15272b = this.f15298b;
        i0Var.f15273c = this.f15299c;
        i0Var.f15274d = this.f15300d;
        i0Var.f15275e = this.f15301e;
        i0Var.f15276f = this.f15302f;
        i0Var.f15277g = this.f15303g;
        i0Var.f15278h = this.f15304h;
        i0Var.f15279i = this.f15305i;
        i0Var.j = this.j;
        i0Var.k = this.k;
        i0Var.f15280l = this.f15306l;
        i0Var.f15281m = (byte) 7;
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
            List list2 = j0Var.k;
            v1 v1Var2 = j0Var.j;
            k2 k2Var2 = j0Var.f15305i;
            l2 l2Var2 = j0Var.f15304h;
            Long l11 = j0Var.f15301e;
            String str2 = j0Var.f15299c;
            if (this.f15297a.equals(j0Var.f15297a) && this.f15298b.equals(j0Var.f15298b) && ((str = this.f15299c) != null ? str.equals(str2) : str2 == null) && this.f15300d == j0Var.f15300d && ((l10 = this.f15301e) != null ? l10.equals(l11) : l11 == null) && this.f15302f == j0Var.f15302f && this.f15303g.equals(j0Var.f15303g) && ((l2Var = this.f15304h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.f15305i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.f15306l == j0Var.f15306l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15297a.hashCode() ^ 1000003) * 1000003) ^ this.f15298b.hashCode()) * 1000003;
        String str = this.f15299c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f15300d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l10 = this.f15301e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f15302f ? 1231 : 1237)) * 1000003) ^ this.f15303g.hashCode()) * 1000003;
        l2 l2Var = this.f15304h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.f15305i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f15306l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f15297a);
        sb2.append(", identifier=");
        sb2.append(this.f15298b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f15299c);
        sb2.append(", startedAt=");
        sb2.append(this.f15300d);
        sb2.append(", endedAt=");
        sb2.append(this.f15301e);
        sb2.append(", crashed=");
        sb2.append(this.f15302f);
        sb2.append(", app=");
        sb2.append(this.f15303g);
        sb2.append(", user=");
        sb2.append(this.f15304h);
        sb2.append(", os=");
        sb2.append(this.f15305i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", generatorType=");
        return h0.b.i(this.f15306l, "}", sb2);
    }
}
