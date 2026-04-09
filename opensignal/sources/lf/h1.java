package lf;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f15257a;

    /* renamed from: b, reason: collision with root package name */
    public String f15258b;

    /* renamed from: c, reason: collision with root package name */
    public String f15259c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15260d;

    /* renamed from: e, reason: collision with root package name */
    public byte f15261e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f15261e == 3 && (str = this.f15258b) != null && (str2 = this.f15259c) != null) {
            return new i1(str, this.f15257a, str2, this.f15260d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f15261e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f15258b == null) {
            sb2.append(" version");
        }
        if (this.f15259c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f15261e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
