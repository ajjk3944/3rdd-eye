package lf;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public f1 f15221a;

    /* renamed from: b, reason: collision with root package name */
    public String f15222b;

    /* renamed from: c, reason: collision with root package name */
    public String f15223c;

    /* renamed from: d, reason: collision with root package name */
    public long f15224d;

    /* renamed from: e, reason: collision with root package name */
    public byte f15225e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f15225e == 1 && (f1Var = this.f15221a) != null && (str = this.f15222b) != null && (str2 = this.f15223c) != null) {
            return new e1(f1Var, str, str2, this.f15224d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15221a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f15222b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f15223c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f15225e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }
}
