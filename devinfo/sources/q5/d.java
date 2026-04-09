package q5;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f32186a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32188c;

    public d(long j, long j8, int i4) {
        this.f32186a = j;
        this.f32187b = j8;
        this.f32188c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f32186a == dVar.f32186a && this.f32187b == dVar.f32187b && this.f32188c == dVar.f32188c;
    }

    public final int hashCode() {
        long j = this.f32186a;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        long j8 = this.f32187b;
        return ((i4 + ((int) ((j8 >>> 32) ^ j8))) * 31) + this.f32188c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f32186a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f32187b);
        sb2.append(", TopicCode=");
        return u.t("Topic { ", r5.c.j(this.f32188c, " }", sb2));
    }
}
