package rl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f33038n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33042d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33043e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33044f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33045h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33046i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33047k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f33048l;

    /* renamed from: m, reason: collision with root package name */
    public String f33049m;

    static {
        int i4 = wk.a.f36814d;
        wk.c cVar = wk.c.SECONDS;
        long jF = wk.a.f(com.bumptech.glide.d.D(Integer.MAX_VALUE, cVar), cVar);
        if (jF < 0) {
            throw new IllegalArgumentException(a0.g.j(jF, "maxStale < 0: ").toString());
        }
    }

    public c(boolean z3, boolean z10, int i4, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f33039a = z3;
        this.f33040b = z10;
        this.f33041c = i4;
        this.f33042d = i10;
        this.f33043e = z11;
        this.f33044f = z12;
        this.g = z13;
        this.f33045h = i11;
        this.f33046i = i12;
        this.j = z14;
        this.f33047k = z15;
        this.f33048l = z16;
        this.f33049m = str;
    }

    public final String toString() {
        String str = this.f33049m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f33039a) {
            sb2.append("no-cache, ");
        }
        if (this.f33040b) {
            sb2.append("no-store, ");
        }
        int i4 = this.f33041c;
        if (i4 != -1) {
            sb2.append("max-age=");
            sb2.append(i4);
            sb2.append(", ");
        }
        int i10 = this.f33042d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f33043e) {
            sb2.append("private, ");
        }
        if (this.f33044f) {
            sb2.append("public, ");
        }
        if (this.g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f33045h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f33046i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f33047k) {
            sb2.append("no-transform, ");
        }
        if (this.f33048l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        nk.k.d(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        this.f33049m = string;
        return string;
    }
}
