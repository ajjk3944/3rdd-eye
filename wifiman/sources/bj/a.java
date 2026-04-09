package Bj;

import Aj.b;
import Aj.f;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class a implements f, b {

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f1831n = Pattern.compile("\\s{2,}");

    /* renamed from: a, reason: collision with root package name */
    private Locale f1832a;

    /* renamed from: b, reason: collision with root package name */
    private String f1833b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f1834c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f1835d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f1836e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f1837f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f1838g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f1839h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f1840i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f1841j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f1842k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f1843l = "";

    /* renamed from: m, reason: collision with root package name */
    private int f1844m = 50;

    private String d(String str, String str2, long j10) {
        String strReplace = h(j10).replace("%s", str);
        Locale locale = this.f1832a;
        return strReplace.replace("%n", locale != null ? String.format(locale, "%d", Long.valueOf(j10)) : String.format("%d", Long.valueOf(j10))).replace("%u", str2);
    }

    private String e(Aj.a aVar, boolean z10) {
        return d(k(aVar), f(aVar, z10), j(aVar, z10));
    }

    private String i(Aj.a aVar) {
        return (!aVar.b() || this.f1836e == null || this.f1835d.length() <= 0) ? (!aVar.e() || this.f1838g == null || this.f1837f.length() <= 0) ? this.f1834c : this.f1838g : this.f1836e;
    }

    private String k(Aj.a aVar) {
        return aVar.c() < 0 ? "-" : "";
    }

    private String l(Aj.a aVar) {
        String str;
        String str2;
        return (!aVar.b() || (str2 = this.f1835d) == null || str2.length() <= 0) ? (!aVar.e() || (str = this.f1837f) == null || str.length() <= 0) ? this.f1833b : this.f1837f : this.f1835d;
    }

    @Override // Aj.f
    public String a(Aj.a aVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (aVar.e()) {
            sb2.append(this.f1842k);
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(this.f1843l);
        } else {
            sb2.append(this.f1840i);
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(this.f1841j);
        }
        return f1831n.matcher(sb2).replaceAll(" ").trim();
    }

    @Override // Aj.f
    public String b(Aj.a aVar) {
        return e(aVar, true);
    }

    protected String f(Aj.a aVar, boolean z10) {
        return m(aVar, z10) ? i(aVar) : l(aVar);
    }

    public String g() {
        return this.f1839h;
    }

    protected String h(long j10) {
        return this.f1839h;
    }

    protected long j(Aj.a aVar, boolean z10) {
        return Math.abs(z10 ? aVar.d(this.f1844m) : aVar.c());
    }

    protected boolean m(Aj.a aVar, boolean z10) {
        long jAbs = Math.abs(j(aVar, z10));
        return jAbs == 0 || jAbs > 1;
    }

    public a n(String str) {
        this.f1836e = str;
        return this;
    }

    public a o(String str) {
        this.f1840i = str.trim();
        return this;
    }

    public a p(String str) {
        this.f1835d = str;
        return this;
    }

    public a q(String str) {
        this.f1841j = str.trim();
        return this;
    }

    @Override // Aj.b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public a c(Locale locale) {
        this.f1832a = locale;
        return this;
    }

    public a s(String str) {
        this.f1838g = str;
        return this;
    }

    public a t(String str) {
        this.f1842k = str.trim();
        return this;
    }

    public String toString() {
        return "SimpleTimeFormat [pattern=" + this.f1839h + ", futurePrefix=" + this.f1840i + ", futureSuffix=" + this.f1841j + ", pastPrefix=" + this.f1842k + ", pastSuffix=" + this.f1843l + ", roundingTolerance=" + this.f1844m + "]";
    }

    public a u(String str) {
        this.f1837f = str;
        return this;
    }

    public a v(String str) {
        this.f1843l = str.trim();
        return this;
    }

    public a w(String str) {
        this.f1839h = str;
        return this;
    }

    public a x(String str) {
        this.f1834c = str;
        return this;
    }

    public a y(String str) {
        this.f1833b = str;
        return this;
    }
}
