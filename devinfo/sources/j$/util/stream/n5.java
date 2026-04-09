package j$.util.stream;

/* loaded from: classes2.dex */
public final class n5 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public long f26684b;

    /* renamed from: c, reason: collision with root package name */
    public long f26685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o5 f26686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, m5 m5Var) {
        super(m5Var);
        this.f26686d = o5Var;
        this.f26684b = o5Var.f26696s;
        long j = o5Var.f26697t;
        this.f26685c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        this.f26617a.c(x5.a(j, this.f26686d.f26696s, this.f26685c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        long j = this.f26684b;
        if (j == 0) {
            long j8 = this.f26685c;
            if (j8 > 0) {
                this.f26685c = j8 - 1;
                this.f26617a.n((m5) obj);
                return;
            }
            return;
        }
        this.f26684b = j - 1;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        return this.f26685c == 0 || this.f26617a.e();
    }
}
