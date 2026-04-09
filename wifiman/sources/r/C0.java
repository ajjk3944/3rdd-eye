package r;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class C0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final y0 f59448a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7520b0 f59449b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59450c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59451d;

    public /* synthetic */ C0(y0 y0Var, EnumC7520b0 enumC7520b0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, enumC7520b0, j10);
    }

    private final long h(long j10) {
        long j11 = this.f59451d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f59450c;
        long j14 = j12 / j13;
        return (this.f59449b == EnumC7520b0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final AbstractC7542q i(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        long j11 = this.f59451d;
        long j12 = j10 + j11;
        long j13 = this.f59450c;
        return j12 > j13 ? this.f59448a.f(j13 - j11, abstractC7542q, abstractC7542q3, abstractC7542q2) : abstractC7542q2;
    }

    @Override // r.v0
    public boolean a() {
        return true;
    }

    @Override // r.v0
    public long b(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return Long.MAX_VALUE;
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59448a.c(h(j10), abstractC7542q, abstractC7542q2, i(j10, abstractC7542q, abstractC7542q3, abstractC7542q2));
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59448a.f(h(j10), abstractC7542q, abstractC7542q2, i(j10, abstractC7542q, abstractC7542q3, abstractC7542q2));
    }

    private C0(y0 y0Var, EnumC7520b0 enumC7520b0, long j10) {
        this.f59448a = y0Var;
        this.f59449b = enumC7520b0;
        this.f59450c = (y0Var.e() + y0Var.g()) * 1000000;
        this.f59451d = j10 * 1000000;
    }
}
