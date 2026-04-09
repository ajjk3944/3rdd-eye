package j$.util.stream;

/* loaded from: classes2.dex */
public final class p5 extends g5 {

    /* renamed from: b, reason: collision with root package name */
    public long f26713b;

    /* renamed from: c, reason: collision with root package name */
    public long f26714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q5 f26715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q5 q5Var, m5 m5Var) {
        super(m5Var);
        this.f26715d = q5Var;
        this.f26713b = q5Var.f26733s;
        long j = q5Var.f26734t;
        this.f26714c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        this.f26589a.c(x5.a(j, this.f26715d.f26733s, this.f26714c));
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        long j = this.f26713b;
        if (j == 0) {
            long j8 = this.f26714c;
            if (j8 > 0) {
                this.f26714c = j8 - 1;
                this.f26589a.accept(i4);
                return;
            }
            return;
        }
        this.f26713b = j - 1;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final boolean e() {
        return this.f26714c == 0 || this.f26589a.e();
    }
}
