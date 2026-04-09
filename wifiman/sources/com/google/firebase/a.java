package com.google.firebase;

/* loaded from: classes3.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f38607a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38608b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38609c;

    a(long j10, long j11, long j12) {
        this.f38607a = j10;
        this.f38608b = j11;
        this.f38609c = j12;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f38608b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f38607a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f38609c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f38607a == nVar.c() && this.f38608b == nVar.b() && this.f38609c == nVar.d();
    }

    public int hashCode() {
        long j10 = this.f38607a;
        long j11 = this.f38608b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f38609c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f38607a + ", elapsedRealtime=" + this.f38608b + ", uptimeMillis=" + this.f38609c + "}";
    }
}
