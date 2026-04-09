package r;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class j0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f59719a;

    /* renamed from: b, reason: collision with root package name */
    private final long f59720b;

    public j0(v0 v0Var, long j10) {
        this.f59719a = v0Var;
        this.f59720b = j10;
    }

    @Override // r.v0
    public boolean a() {
        return this.f59719a.a();
    }

    @Override // r.v0
    public long b(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        return this.f59719a.b(abstractC7542q, abstractC7542q2, abstractC7542q3) + this.f59720b;
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        long j11 = this.f59720b;
        return j10 < j11 ? abstractC7542q : this.f59719a.c(j10 - j11, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.f59720b == this.f59720b && AbstractC6492s.d(j0Var.f59719a, this.f59719a);
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        long j11 = this.f59720b;
        return j10 < j11 ? abstractC7542q3 : this.f59719a.f(j10 - j11, abstractC7542q, abstractC7542q2, abstractC7542q3);
    }

    public int hashCode() {
        return (this.f59719a.hashCode() * 31) + Long.hashCode(this.f59720b);
    }
}
