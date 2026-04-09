package ou;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final h f19908n = new h(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final h f19909o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19910a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19913d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19914e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19915f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19916g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19917h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19918i;
    public final boolean j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19919l;

    /* renamed from: m, reason: collision with root package name */
    public String f19920m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        br.l.e(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f19909o = new h(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public h(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f19910a = z10;
        this.f19911b = z11;
        this.f19912c = i10;
        this.f19913d = i11;
        this.f19914e = z12;
        this.f19915f = z13;
        this.f19916g = z14;
        this.f19917h = i12;
        this.f19918i = i13;
        this.j = z15;
        this.k = z16;
        this.f19919l = z17;
        this.f19920m = str;
    }

    public final String toString() {
        String str = this.f19920m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f19910a) {
            sb2.append("no-cache, ");
        }
        if (this.f19911b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f19912c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f19913d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f19914e) {
            sb2.append("private, ");
        }
        if (this.f19915f) {
            sb2.append("public, ");
        }
        if (this.f19916g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f19917h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f19918i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.k) {
            sb2.append("no-transform, ");
        }
        if (this.f19919l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f19920m = string;
        return string;
    }
}
