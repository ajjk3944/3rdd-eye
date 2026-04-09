package B4;

import N7.C1094a9;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes2.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f479a;

    /* renamed from: b, reason: collision with root package name */
    public final long f480b;

    /* renamed from: c, reason: collision with root package name */
    public final long f481c;

    public a(long j4, long j10, long j11) {
        this.f479a = j4;
        this.f480b = j10;
        this.f481c = j11;
    }

    @Override // B4.l
    public final long a() {
        return this.f480b;
    }

    @Override // B4.l
    public final long b() {
        return this.f479a;
    }

    @Override // B4.l
    public final long c() {
        return this.f481c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f479a == lVar.b() && this.f480b == lVar.a() && this.f481c == lVar.c();
    }

    public final int hashCode() {
        long j4 = this.f479a;
        long j10 = this.f480b;
        int i = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f481c;
        return i ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f479a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f480b);
        sb.append(", uptimeMillis=");
        return C1094a9.f(sb, this.f481c, "}");
    }
}
