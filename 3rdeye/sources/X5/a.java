package X5;

import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.l;

/* compiled from: VectorTextViewParams.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13559a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13560b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f13561c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13563e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f13564f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f13565g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f13566h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f13567j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f13568k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f13569l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f13570m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f13571n;

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 262143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f13559a, aVar.f13559a) && l.b(this.f13560b, aVar.f13560b) && l.b(this.f13561c, aVar.f13561c) && l.b(this.f13562d, aVar.f13562d) && this.f13563e == aVar.f13563e && l.b(this.f13564f, aVar.f13564f) && l.b(this.f13565g, aVar.f13565g) && l.b(this.f13566h, aVar.f13566h) && l.b(this.i, aVar.i) && l.b(this.f13567j, aVar.f13567j) && l.b(this.f13568k, aVar.f13568k) && l.b(this.f13569l, aVar.f13569l) && l.b(this.f13570m, aVar.f13570m) && l.b(this.f13571n, aVar.f13571n);
    }

    public final int hashCode() {
        Integer num = this.f13559a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f13560b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13561c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f13562d;
        int iHashCode4 = (this.f13564f.hashCode() + ((((iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 28629151) + (this.f13563e ? 1231 : 1237)) * 31)) * 31;
        Integer num5 = this.f13565g;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f13566h;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.i;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f13567j;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f13568k;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f13569l;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f13570m;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f13571n;
        return iHashCode11 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f13559a + ", drawableEndRes=" + this.f13560b + ", drawableBottomRes=" + this.f13561c + ", drawableTopRes=" + this.f13562d + ", drawableStart=null, drawableEnd=null, drawableBottom=null, drawableTop=null, isRtlLayout=" + this.f13563e + ", contentDescription=" + ((Object) this.f13564f) + ", compoundDrawablePadding=" + this.f13565g + ", iconWidth=" + this.f13566h + ", iconHeight=" + this.i + ", compoundDrawablePaddingRes=" + this.f13567j + ", tintColor=" + this.f13568k + ", widthRes=" + this.f13569l + ", heightRes=" + this.f13570m + ", squareSizeRes=" + this.f13571n + ")";
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i) {
        Integer num13 = (i & 1) != 0 ? null : num;
        Integer num14 = (i & 2) != 0 ? null : num2;
        Integer num15 = (i & 4) != 0 ? null : num3;
        Integer num16 = (i & 8) != 0 ? null : num4;
        String contentDescription = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? "" : str;
        Integer num17 = (i & 1024) != 0 ? null : num5;
        Integer num18 = (i & 2048) != 0 ? null : num6;
        Integer num19 = (i & 4096) != 0 ? null : num7;
        Integer num20 = (i & 8192) != 0 ? null : num8;
        Integer num21 = (i & 16384) != 0 ? null : num9;
        Integer num22 = (32768 & i) != 0 ? null : num10;
        Integer num23 = (65536 & i) != 0 ? null : num11;
        Integer num24 = (i & 131072) == 0 ? num12 : null;
        l.f(contentDescription, "contentDescription");
        this.f13559a = num13;
        this.f13560b = num14;
        this.f13561c = num15;
        this.f13562d = num16;
        this.f13563e = false;
        this.f13564f = contentDescription;
        this.f13565g = num17;
        this.f13566h = num18;
        this.i = num19;
        this.f13567j = num20;
        this.f13568k = num21;
        this.f13569l = num22;
        this.f13570m = num23;
        this.f13571n = num24;
    }
}
