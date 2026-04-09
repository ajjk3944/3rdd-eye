package z0;

import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f24440a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24442c;

    public c(long j6, long j7, int i) {
        this.f24440a = j6;
        this.f24441b = j7;
        this.f24442c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24440a == cVar.f24440a && this.f24441b == cVar.f24441b && this.f24442c == cVar.f24442c;
    }

    public final int hashCode() {
        long j6 = this.f24440a;
        int i = ((int) (j6 ^ (j6 >>> 32))) * 31;
        long j7 = this.f24441b;
        return ((i + ((int) ((j7 >>> 32) ^ j7))) * 31) + this.f24442c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f24440a);
        sb.append(", ModelVersion=");
        sb.append(this.f24441b);
        sb.append(", TopicCode=");
        return A.f.l("Topic { ", AbstractC2763b.d(this.f24442c, " }", sb));
    }
}
