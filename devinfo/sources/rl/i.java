package rl;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f33090k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f33091l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f33092m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f33093n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f33094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33096c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33097d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33098e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33099f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33100h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f33101i;
    public final String j;

    public i(String str, String str2, long j, String str3, String str4, boolean z3, boolean z10, boolean z11, boolean z12, String str5) {
        this.f33094a = str;
        this.f33095b = str2;
        this.f33096c = j;
        this.f33097d = str3;
        this.f33098e = str4;
        this.f33099f = z3;
        this.g = z10;
        this.f33100h = z11;
        this.f33101i = z12;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return nk.k.a(iVar.f33094a, this.f33094a) && nk.k.a(iVar.f33095b, this.f33095b) && iVar.f33096c == this.f33096c && nk.k.a(iVar.f33097d, this.f33097d) && nk.k.a(iVar.f33098e, this.f33098e) && iVar.f33099f == this.f33099f && iVar.g == this.g && iVar.f33100h == this.f33100h && iVar.f33101i == this.f33101i && nk.k.a(iVar.j, this.j);
    }

    public final int hashCode() {
        int iM = je.u.m(je.u.m(527, 31, this.f33094a), 31, this.f33095b);
        long j = this.f33096c;
        int iM2 = (((((((je.u.m(je.u.m((iM + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f33097d), 31, this.f33098e) + (this.f33099f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.f33100h ? 1231 : 1237)) * 31) + (this.f33101i ? 1231 : 1237)) * 31;
        String str = this.j;
        return iM2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33094a);
        sb2.append('=');
        sb2.append(this.f33095b);
        if (this.f33100h) {
            long j = this.f33096c;
            if (j == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) wl.d.f36829a.get()).format(new Date(j));
                nk.k.d(str, "format(...)");
                sb2.append(str);
            }
        }
        if (!this.f33101i) {
            sb2.append("; domain=");
            sb2.append(this.f33097d);
        }
        sb2.append("; path=");
        sb2.append(this.f33098e);
        if (this.f33099f) {
            sb2.append("; secure");
        }
        if (this.g) {
            sb2.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb2.append("; samesite=");
            sb2.append(str2);
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
