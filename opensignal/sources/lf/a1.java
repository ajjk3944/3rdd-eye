package lf;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public Double f15156a;

    /* renamed from: b, reason: collision with root package name */
    public int f15157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15158c;

    /* renamed from: d, reason: collision with root package name */
    public int f15159d;

    /* renamed from: e, reason: collision with root package name */
    public long f15160e;

    /* renamed from: f, reason: collision with root package name */
    public long f15161f;

    /* renamed from: g, reason: collision with root package name */
    public byte f15162g;

    public final b1 a() {
        if (this.f15162g == 31) {
            return new b1(this.f15156a, this.f15157b, this.f15158c, this.f15159d, this.f15160e, this.f15161f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f15162g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f15162g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f15162g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f15162g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f15162g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
