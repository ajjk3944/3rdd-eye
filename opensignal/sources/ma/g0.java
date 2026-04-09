package ma;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16465b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16467d;

    /* renamed from: e, reason: collision with root package name */
    public int f16468e;

    /* renamed from: f, reason: collision with root package name */
    public String f16469f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(int i10, int i11, int i12, byte b2) {
        this(Integer.MIN_VALUE, i10, i11, 0);
        this.f16464a = i12;
        switch (i12) {
            case 1:
                this(Integer.MIN_VALUE, i10, i11, 1);
                break;
            default:
                break;
        }
    }

    public final void a() {
        switch (this.f16464a) {
            case 0:
                int i10 = this.f16468e;
                int i11 = i10 == Integer.MIN_VALUE ? this.f16466c : i10 + this.f16467d;
                this.f16468e = i11;
                String str = this.f16465b;
                this.f16469f = w.g.e(str, c7.a.d(11, str), i11);
                break;
            default:
                int i12 = this.f16468e;
                this.f16468e = i12 == Integer.MIN_VALUE ? this.f16466c : i12 + this.f16467d;
                this.f16469f = this.f16465b + this.f16468e;
                break;
        }
    }

    public final void b() {
        switch (this.f16464a) {
            case 0:
                if (this.f16468e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
            default:
                if (this.f16468e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
        }
    }

    public g0(int i10, int i11, int i12, int i13) {
        String str;
        String string;
        this.f16464a = i13;
        switch (i13) {
            case 1:
                if (i10 != Integer.MIN_VALUE) {
                    str = i10 + "/";
                } else {
                    str = "";
                }
                this.f16465b = str;
                this.f16466c = i11;
                this.f16467d = i12;
                this.f16468e = Integer.MIN_VALUE;
                this.f16469f = "";
                break;
            default:
                if (i10 != Integer.MIN_VALUE) {
                    StringBuilder sb2 = new StringBuilder(12);
                    sb2.append(i10);
                    sb2.append("/");
                    string = sb2.toString();
                } else {
                    string = "";
                }
                this.f16465b = string;
                this.f16466c = i11;
                this.f16467d = i12;
                this.f16468e = Integer.MIN_VALUE;
                this.f16469f = "";
                break;
        }
    }
}
