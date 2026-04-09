package sg;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f22034a;

    /* renamed from: b, reason: collision with root package name */
    public String f22035b;

    /* renamed from: c, reason: collision with root package name */
    public String f22036c;

    /* renamed from: d, reason: collision with root package name */
    public String f22037d;

    /* renamed from: e, reason: collision with root package name */
    public long f22038e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22039f;

    public final c a() {
        if (this.f22039f == 1 && this.f22034a != null && this.f22035b != null && this.f22036c != null && this.f22037d != null) {
            return new c(this.f22034a, this.f22035b, this.f22036c, this.f22037d, this.f22038e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22034a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f22035b == null) {
            sb2.append(" variantId");
        }
        if (this.f22036c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f22037d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f22039f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
