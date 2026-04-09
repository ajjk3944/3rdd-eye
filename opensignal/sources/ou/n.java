package ou;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f19948l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f19949m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f19950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19951b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19952c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19953d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19954e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19955f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19956g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19957h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19958i;

    public n(String str, String str2, long j7, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19950a = str;
        this.f19951b = str2;
        this.f19952c = j7;
        this.f19953d = str3;
        this.f19954e = str4;
        this.f19955f = z10;
        this.f19956g = z11;
        this.f19957h = z12;
        this.f19958i = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return br.l.a(nVar.f19950a, this.f19950a) && br.l.a(nVar.f19951b, this.f19951b) && nVar.f19952c == this.f19952c && br.l.a(nVar.f19953d, this.f19953d) && br.l.a(nVar.f19954e, this.f19954e) && nVar.f19955f == this.f19955f && nVar.f19956g == this.f19956g && nVar.f19957h == this.f19957h && nVar.f19958i == this.f19958i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19958i) + w.g.b(w.g.b(w.g.b(c7.a.g(this.f19954e, c7.a.g(this.f19953d, h0.b.b(c7.a.g(this.f19951b, c7.a.g(this.f19950a, 527, 31), 31), 31, this.f19952c), 31), 31), this.f19955f, 31), this.f19956g, 31), this.f19957h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19950a);
        sb2.append('=');
        sb2.append(this.f19951b);
        if (this.f19957h) {
            long j7 = this.f19952c;
            if (j7 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) tu.c.f23011a.get()).format(new Date(j7));
                br.l.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f19958i) {
            sb2.append("; domain=");
            sb2.append(this.f19953d);
        }
        sb2.append("; path=");
        sb2.append(this.f19954e);
        if (this.f19955f) {
            sb2.append("; secure");
        }
        if (this.f19956g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        br.l.d(string, "toString()");
        return string;
    }
}
