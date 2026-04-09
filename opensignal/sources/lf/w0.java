package lf;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f15457a;

    /* renamed from: b, reason: collision with root package name */
    public String f15458b;

    /* renamed from: c, reason: collision with root package name */
    public String f15459c;

    /* renamed from: d, reason: collision with root package name */
    public long f15460d;

    /* renamed from: e, reason: collision with root package name */
    public int f15461e;

    /* renamed from: f, reason: collision with root package name */
    public byte f15462f;

    public final x0 a() {
        String str;
        if (this.f15462f == 7 && (str = this.f15458b) != null) {
            return new x0(this.f15457a, str, this.f15459c, this.f15460d, this.f15461e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f15462f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f15458b == null) {
            sb2.append(" symbol");
        }
        if ((this.f15462f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f15462f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
