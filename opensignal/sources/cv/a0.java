package cv;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6678a;

    /* renamed from: b, reason: collision with root package name */
    public int f6679b;

    /* renamed from: c, reason: collision with root package name */
    public int f6680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6681d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6682e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f6683f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f6684g;

    public a0() {
        this.f6678a = new byte[8192];
        this.f6682e = true;
        this.f6681d = false;
    }

    public final a0 a() {
        a0 a0Var = this.f6683f;
        if (a0Var == this) {
            a0Var = null;
        }
        a0 a0Var2 = this.f6684g;
        br.l.b(a0Var2);
        a0Var2.f6683f = this.f6683f;
        a0 a0Var3 = this.f6683f;
        br.l.b(a0Var3);
        a0Var3.f6684g = this.f6684g;
        this.f6683f = null;
        this.f6684g = null;
        return a0Var;
    }

    public final void b(a0 a0Var) {
        br.l.e(a0Var, "segment");
        a0Var.f6684g = this;
        a0Var.f6683f = this.f6683f;
        a0 a0Var2 = this.f6683f;
        br.l.b(a0Var2);
        a0Var2.f6684g = a0Var;
        this.f6683f = a0Var;
    }

    public final a0 c() {
        this.f6681d = true;
        return new a0(this.f6678a, this.f6679b, this.f6680c, true);
    }

    public final void d(a0 a0Var, int i10) {
        br.l.e(a0Var, "sink");
        byte[] bArr = a0Var.f6678a;
        if (!a0Var.f6682e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = a0Var.f6680c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (a0Var.f6681d) {
                throw new IllegalArgumentException();
            }
            int i13 = a0Var.f6679b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            mq.l.a0(0, i13, i11, bArr, bArr);
            a0Var.f6680c -= a0Var.f6679b;
            a0Var.f6679b = 0;
        }
        int i14 = a0Var.f6680c;
        int i15 = this.f6679b;
        mq.l.a0(i14, i15, i15 + i10, this.f6678a, bArr);
        a0Var.f6680c += i10;
        this.f6679b += i10;
    }

    public a0(byte[] bArr, int i10, int i11, boolean z10) {
        br.l.e(bArr, "data");
        this.f6678a = bArr;
        this.f6679b = i10;
        this.f6680c = i11;
        this.f6681d = z10;
        this.f6682e = false;
    }
}
