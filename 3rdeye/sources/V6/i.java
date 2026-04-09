package V6;

import N7.EnumC1195h5;
import N7.H9;
import N7.La;
import N7.Q6;

/* compiled from: SpanData.kt */
/* loaded from: classes.dex */
public final class i implements Comparable<i> {

    /* renamed from: u, reason: collision with root package name */
    public static final H9 f12980u = H9.SP;

    /* renamed from: b, reason: collision with root package name */
    public final int f12981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12982c;

    /* renamed from: d, reason: collision with root package name */
    public final La f12983d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12984e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12985f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12986g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f12987h;
    public final H9 i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC1195h5 f12988j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f12989k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f12990l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f12991m;

    /* renamed from: n, reason: collision with root package name */
    public final Q6 f12992n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f12993o;

    /* renamed from: p, reason: collision with root package name */
    public final g f12994p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f12995q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f12996r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f12997s;

    /* renamed from: t, reason: collision with root package name */
    public final Q6 f12998t;

    public i(int i, int i10, La la2, int i11, String str, String str2, Integer num, H9 fontSizeUnit, EnumC1195h5 enumC1195h5, Integer num2, Double d10, Integer num3, Q6 q62, Integer num4, g gVar, Integer num5, Integer num6, Integer num7, Q6 q63) {
        kotlin.jvm.internal.l.f(fontSizeUnit, "fontSizeUnit");
        this.f12981b = i;
        this.f12982c = i10;
        this.f12983d = la2;
        this.f12984e = i11;
        this.f12985f = str;
        this.f12986g = str2;
        this.f12987h = num;
        this.i = fontSizeUnit;
        this.f12988j = enumC1195h5;
        this.f12989k = num2;
        this.f12990l = d10;
        this.f12991m = num3;
        this.f12992n = q62;
        this.f12993o = num4;
        this.f12994p = gVar;
        this.f12995q = num5;
        this.f12996r = num6;
        this.f12997s = num7;
        this.f12998t = q63;
    }

    public final i a(i span, int i, int i10) {
        kotlin.jvm.internal.l.f(span, "span");
        La la2 = span.f12983d;
        if (la2 == null) {
            la2 = this.f12983d;
        }
        La la3 = la2;
        int i11 = span.f12984e;
        if (i11 == 0) {
            i11 = this.f12984e;
        }
        int i12 = i11;
        String str = span.f12985f;
        if (str == null) {
            str = this.f12985f;
        }
        String str2 = str;
        String str3 = span.f12986g;
        if (str3 == null) {
            str3 = this.f12986g;
        }
        String str4 = str3;
        Integer num = span.f12987h;
        if (num == null) {
            num = this.f12987h;
        }
        Integer num2 = num;
        H9 h92 = f12980u;
        H9 h93 = span.i;
        if (h93 == h92) {
            h93 = this.i;
        }
        H9 h94 = h93;
        EnumC1195h5 enumC1195h5 = span.f12988j;
        if (enumC1195h5 == null) {
            enumC1195h5 = this.f12988j;
        }
        EnumC1195h5 enumC1195h52 = enumC1195h5;
        Integer num3 = span.f12989k;
        if (num3 == null) {
            num3 = this.f12989k;
        }
        Integer num4 = num3;
        Double d10 = span.f12990l;
        if (d10 == null) {
            d10 = this.f12990l;
        }
        Double d11 = d10;
        Integer num5 = span.f12991m;
        if (num5 == null) {
            num5 = this.f12991m;
        }
        Integer num6 = num5;
        Q6 q62 = span.f12992n;
        if (q62 == null) {
            q62 = this.f12992n;
        }
        Q6 q63 = q62;
        Integer num7 = span.f12993o;
        if (num7 == null) {
            num7 = this.f12993o;
        }
        Integer num8 = num7;
        g gVar = span.f12994p;
        if (gVar == null) {
            gVar = this.f12994p;
        }
        g gVar2 = gVar;
        Integer num9 = span.f12995q;
        Integer num10 = num9 == null ? this.f12995q : num9;
        Integer num11 = num9 != null ? span.f12996r : this.f12996r;
        Integer num12 = num9 != null ? span.f12997s : this.f12997s;
        Q6 q64 = span.f12998t;
        if (q64 == null) {
            q64 = this.f12998t;
        }
        return new i(i, i10, la3, i12, str2, str4, num2, h94, enumC1195h52, num4, d11, num6, q63, num8, gVar2, num10, num11, num12, q64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i other = iVar;
        kotlin.jvm.internal.l.f(other, "other");
        return this.f12981b - other.f12981b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f12981b == iVar.f12981b && this.f12982c == iVar.f12982c && this.f12983d == iVar.f12983d && this.f12984e == iVar.f12984e && kotlin.jvm.internal.l.b(this.f12985f, iVar.f12985f) && kotlin.jvm.internal.l.b(this.f12986g, iVar.f12986g) && kotlin.jvm.internal.l.b(this.f12987h, iVar.f12987h) && this.i == iVar.i && this.f12988j == iVar.f12988j && kotlin.jvm.internal.l.b(this.f12989k, iVar.f12989k) && kotlin.jvm.internal.l.b(this.f12990l, iVar.f12990l) && kotlin.jvm.internal.l.b(this.f12991m, iVar.f12991m) && this.f12992n == iVar.f12992n && kotlin.jvm.internal.l.b(this.f12993o, iVar.f12993o) && kotlin.jvm.internal.l.b(this.f12994p, iVar.f12994p) && kotlin.jvm.internal.l.b(this.f12995q, iVar.f12995q) && kotlin.jvm.internal.l.b(this.f12996r, iVar.f12996r) && kotlin.jvm.internal.l.b(this.f12997s, iVar.f12997s) && this.f12998t == iVar.f12998t;
    }

    public final int hashCode() {
        int i = ((this.f12981b * 31) + this.f12982c) * 31;
        La la2 = this.f12983d;
        int iHashCode = (((i + (la2 == null ? 0 : la2.hashCode())) * 31) + this.f12984e) * 31;
        String str = this.f12985f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12986g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f12987h;
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        EnumC1195h5 enumC1195h5 = this.f12988j;
        int iHashCode5 = (iHashCode4 + (enumC1195h5 == null ? 0 : enumC1195h5.hashCode())) * 31;
        Integer num2 = this.f12989k;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d10 = this.f12990l;
        int iHashCode7 = (iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num3 = this.f12991m;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Q6 q62 = this.f12992n;
        int iHashCode9 = (iHashCode8 + (q62 == null ? 0 : q62.hashCode())) * 31;
        Integer num4 = this.f12993o;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        g gVar = this.f12994p;
        int iHashCode11 = (iHashCode10 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num5 = this.f12995q;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f12996r;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f12997s;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Q6 q63 = this.f12998t;
        return iHashCode14 + (q63 != null ? q63.hashCode() : 0);
    }

    public final String toString() {
        return "SpanData(start=" + this.f12981b + ", end=" + this.f12982c + ", alignmentVertical=" + this.f12983d + ", baselineOffset=" + this.f12984e + ", fontFamily=" + this.f12985f + ", fontFeatureSettings=" + this.f12986g + ", fontSize=" + this.f12987h + ", fontSizeUnit=" + this.i + ", fontWeight=" + this.f12988j + ", fontWeightValue=" + this.f12989k + ", letterSpacing=" + this.f12990l + ", lineHeight=" + this.f12991m + ", strike=" + this.f12992n + ", textColor=" + this.f12993o + ", textShadow=" + this.f12994p + ", topOffset=" + this.f12995q + ", topOffsetStart=" + this.f12996r + ", topOffsetEnd=" + this.f12997s + ", underline=" + this.f12998t + ')';
    }
}
