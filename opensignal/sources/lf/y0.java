package lf;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public String f15475a;

    /* renamed from: b, reason: collision with root package name */
    public int f15476b;

    /* renamed from: c, reason: collision with root package name */
    public int f15477c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15478d;

    /* renamed from: e, reason: collision with root package name */
    public byte f15479e;

    public final z0 a() {
        String str;
        if (this.f15479e == 7 && (str = this.f15475a) != null) {
            return new z0(str, this.f15476b, this.f15477c, this.f15478d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15475a == null) {
            sb2.append(" processName");
        }
        if ((this.f15479e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f15479e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f15479e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
