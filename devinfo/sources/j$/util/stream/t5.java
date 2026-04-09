package j$.util.stream;

/* loaded from: classes2.dex */
public final class t5 extends f5 {

    /* renamed from: b, reason: collision with root package name */
    public long f26760b;

    /* renamed from: c, reason: collision with root package name */
    public long f26761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5 f26762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(u5 u5Var, m5 m5Var) {
        super(m5Var);
        this.f26762d = u5Var;
        this.f26760b = u5Var.f26769s;
        long j = u5Var.f26770t;
        this.f26761c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        this.f26578a.c(x5.a(j, this.f26762d.f26769s, this.f26761c));
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        long j = this.f26760b;
        if (j == 0) {
            long j8 = this.f26761c;
            if (j8 > 0) {
                this.f26761c = j8 - 1;
                this.f26578a.accept(d10);
                return;
            }
            return;
        }
        this.f26760b = j - 1;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final boolean e() {
        return this.f26761c == 0 || this.f26578a.e();
    }
}
