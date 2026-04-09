package ak;

import java.util.UUID;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f656a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f657b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f658c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f659d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f660e;

    /* renamed from: f, reason: collision with root package name */
    public final f f661f;

    /* renamed from: g, reason: collision with root package name */
    public final String f662g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f663h;

    /* renamed from: i, reason: collision with root package name */
    public final ni.c0 f664i;
    public final String j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f665l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f666m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f667n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f668o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f669p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f670q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f671r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f672s;

    public s(String str, Integer num, Integer num2, Long l10, Long l11, f fVar, String str2, boolean z10, ni.c0 c0Var, String str3, String str4, Integer num3, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18) {
        br.l.e(str, "id");
        this.f656a = str;
        this.f657b = num;
        this.f658c = num2;
        this.f659d = l10;
        this.f660e = l11;
        this.f661f = fVar;
        this.f662g = str2;
        this.f663h = z10;
        this.f664i = c0Var;
        this.j = str3;
        this.k = str4;
        this.f665l = num3;
        this.f666m = l12;
        this.f667n = l13;
        this.f668o = l14;
        this.f669p = l15;
        this.f670q = l16;
        this.f671r = l17;
        this.f672s = l18;
    }

    public static s a(s sVar, Long l10, Long l11, int i10) {
        String str = sVar.f656a;
        Integer num = sVar.f657b;
        Integer num2 = sVar.f658c;
        Long l12 = sVar.f659d;
        Long l13 = (i10 & 16) != 0 ? sVar.f660e : l10;
        f fVar = sVar.f661f;
        Long l14 = l13;
        String str2 = sVar.f662g;
        boolean z10 = sVar.f663h;
        ni.c0 c0Var = sVar.f664i;
        String str3 = sVar.j;
        String str4 = sVar.k;
        Integer num3 = sVar.f665l;
        Long l15 = (i10 & 4096) != 0 ? sVar.f666m : l11;
        Long l16 = sVar.f667n;
        Long l17 = sVar.f668o;
        Long l18 = l15;
        Long l19 = sVar.f669p;
        Long l20 = sVar.f670q;
        Long l21 = sVar.f671r;
        Long l22 = sVar.f672s;
        br.l.e(str, "id");
        return new s(str, num, num2, l12, l14, fVar, str2, z10, c0Var, str3, str4, num3, l18, l16, l17, l19, l20, l21, l22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return br.l.a(this.f656a, sVar.f656a) && br.l.a(this.f657b, sVar.f657b) && br.l.a(this.f658c, sVar.f658c) && br.l.a(this.f659d, sVar.f659d) && br.l.a(this.f660e, sVar.f660e) && br.l.a(this.f661f, sVar.f661f) && br.l.a(this.f662g, sVar.f662g) && this.f663h == sVar.f663h && br.l.a(this.f664i, sVar.f664i) && br.l.a(this.j, sVar.j) && br.l.a(this.k, sVar.k) && br.l.a(this.f665l, sVar.f665l) && br.l.a(this.f666m, sVar.f666m) && br.l.a(this.f667n, sVar.f667n) && br.l.a(this.f668o, sVar.f668o) && br.l.a(this.f669p, sVar.f669p) && br.l.a(this.f670q, sVar.f670q) && br.l.a(this.f671r, sVar.f671r) && br.l.a(this.f672s, sVar.f672s);
    }

    public final int hashCode() {
        int iHashCode = this.f656a.hashCode() * 31;
        Integer num = this.f657b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f658c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f659d;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f660e;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        f fVar = this.f661f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f662g;
        int iB = w.g.b((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31, this.f663h, 31);
        ni.c0 c0Var = this.f664i;
        int iHashCode7 = (iB + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f665l;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.f666m;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f667n;
        int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f668o;
        int iHashCode13 = (iHashCode12 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f669p;
        int iHashCode14 = (iHashCode13 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f670q;
        int iHashCode15 = (iHashCode14 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f671r;
        int iHashCode16 = (iHashCode15 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f672s;
        return iHashCode16 + (l18 != null ? l18.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceConnection(id=" + this.f656a + ", type=" + this.f657b + ", mobileSubtype=" + this.f658c + ", startTime=" + this.f659d + ", endTime=" + this.f660e + ", cellTower=" + this.f661f + ", wifiBssid=" + this.f662g + ", isRoaming=" + this.f663h + ", locationCoreResult=" + this.f664i + ", simOperator=" + this.j + ", simOperatorName=" + this.k + ", nrState=" + this.f665l + ", lastTaskTime=" + this.f666m + ", initialTxBytes=" + this.f667n + ", initialTxBytesWifi=" + this.f668o + ", initialTxBytesCell=" + this.f669p + ", initialRxBytes=" + this.f670q + ", initialRxBytesWifi=" + this.f671r + ", initialRxBytesCell=" + this.f672s + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s(String str, Integer num, Integer num2, Long l10, Long l11, f fVar, String str2, boolean z10, ni.c0 c0Var, String str3, String str4, Integer num3, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, int i10) {
        String str5;
        if ((i10 & 1) != 0) {
            String string = UUID.randomUUID().toString();
            br.l.d(string, "toString(...)");
            str5 = string;
        } else {
            str5 = str;
        }
        this(str5, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? null : c0Var, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : l12, (i10 & 8192) != 0 ? null : l13, (i10 & 16384) != 0 ? null : l14, (32768 & i10) != 0 ? null : l15, (65536 & i10) != 0 ? null : l16, (131072 & i10) != 0 ? null : l17, (i10 & 262144) != 0 ? null : l18);
    }
}
