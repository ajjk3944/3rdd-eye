package ak;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f608a;

    /* renamed from: b, reason: collision with root package name */
    public final long f609b;

    /* renamed from: c, reason: collision with root package name */
    public final long f610c;

    public l(long j, long j7, long j10) {
        this.f608a = j;
        this.f609b = j7;
        this.f610c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f608a == lVar.f608a && this.f609b == lVar.f609b && this.f610c == lVar.f610c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f610c) + h0.b.b(Long.hashCode(this.f608a) * 31, 31, this.f609b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataLimitsConfig(downloadSpeedThresholdKilobytesPerSeconds=");
        sb2.append(this.f608a);
        sb2.append(", uploadSpeedThresholdKilobytesPerSeconds=");
        sb2.append(this.f609b);
        sb2.append(", checkSpeedForMs=");
        return w.g.h(sb2, this.f610c, ')');
    }
}
