package U9;

import java.util.Date;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f12678j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f12679k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f12680l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f12681m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f12682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12684c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12685d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12686e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12687f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12688g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12689h;
    public final boolean i;

    /* compiled from: Cookie.kt */
    public static final class a {
        public static int a(int i, int i10, String str, boolean z10) {
            while (i < i10) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i;
                }
                i++;
            }
            return i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static long b(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: U9.k.a.b(int, java.lang.String):long");
        }
    }

    public k(String str, String str2, long j4, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f12682a = str;
        this.f12683b = str2;
        this.f12684c = j4;
        this.f12685d = str3;
        this.f12686e = str4;
        this.f12687f = z10;
        this.f12688g = z11;
        this.f12689h = z12;
        this.i = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.b(kVar.f12682a, this.f12682a) && kotlin.jvm.internal.l.b(kVar.f12683b, this.f12683b) && kVar.f12684c == this.f12684c && kotlin.jvm.internal.l.b(kVar.f12685d, this.f12685d) && kotlin.jvm.internal.l.b(kVar.f12686e, this.f12686e) && kVar.f12687f == this.f12687f && kVar.f12688g == this.f12688g && kVar.f12689h == this.f12689h && kVar.i == this.i;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int iN = B4.g.n(B4.g.n(527, 31, this.f12682a), 31, this.f12683b);
        long j4 = this.f12684c;
        return ((((((B4.g.n(B4.g.n((iN + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f12685d), 31, this.f12686e) + (this.f12687f ? 1231 : 1237)) * 31) + (this.f12688g ? 1231 : 1237)) * 31) + (this.f12689h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12682a);
        sb.append('=');
        sb.append(this.f12683b);
        if (this.f12689h) {
            long j4 = this.f12684c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = Z9.c.f14065a.get().format(new Date(j4));
                kotlin.jvm.internal.l.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f12685d);
        }
        sb.append("; path=");
        sb.append(this.f12686e);
        if (this.f12687f) {
            sb.append("; secure");
        }
        if (this.f12688g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString()");
        return string;
    }
}
