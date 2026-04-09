package com.google.android.play.integrity.internal;

/* loaded from: classes3.dex */
final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final int f38150a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38151b;

    r(int i10, long j10) {
        this.f38150a = i10;
        this.f38151b = j10;
    }

    @Override // com.google.android.play.integrity.internal.s
    public final int a() {
        return this.f38150a;
    }

    @Override // com.google.android.play.integrity.internal.s
    public final long b() {
        return this.f38151b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f38150a == sVar.a() && this.f38151b == sVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f38151b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f38150a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f38150a + ", eventTimestamp=" + this.f38151b + "}";
    }
}
