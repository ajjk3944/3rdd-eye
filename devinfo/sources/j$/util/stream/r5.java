package j$.util.stream;

/* loaded from: classes2.dex */
public final class r5 extends h5 {

    /* renamed from: b, reason: collision with root package name */
    public long f26746b;

    /* renamed from: c, reason: collision with root package name */
    public long f26747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s5 f26748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, m5 m5Var) {
        super(m5Var);
        this.f26748d = s5Var;
        this.f26746b = s5Var.f26753s;
        long j = s5Var.f26754t;
        this.f26747c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        this.f26600a.c(x5.a(j, this.f26748d.f26753s, this.f26747c));
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        long j8 = this.f26746b;
        if (j8 == 0) {
            long j9 = this.f26747c;
            if (j9 > 0) {
                this.f26747c = j9 - 1;
                this.f26600a.accept(j);
                return;
            }
            return;
        }
        this.f26746b = j8 - 1;
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final boolean e() {
        return this.f26747c == 0 || this.f26600a.e();
    }
}
